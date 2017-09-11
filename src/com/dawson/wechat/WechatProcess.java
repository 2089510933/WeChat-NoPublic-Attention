package com.dawson.wechat;

/**
 * 微信xml消息处理流程逻辑类
 * @author pamchen-1
 *
 */
public class WechatProcess {
	private static final String MESSAGE_text = "text";
	private static final String MESSAGE_image = "image";
	private static final String MESSAGE_voice = "voice";
	private static final String MESSAGE_video = "video";
	private static final String MESSAGE_shortvideo = "shortvideo";
	private static final String MESSAGE_location = "location";
	private static final String MESSAGE_link = "link";
	private static final String MESSAGE_event = "event";
	private static final String MESSAGE_subscribe = "subscribe";
	private static final String MESSAGE_unsubscribe = "unsubscribe";
	private static final String MESSAGE_CLICK = "CLICK";

	/**
	 * 解析处理xml、获取智能回复结果（通过图灵机器人api接口）
	 * @param xml 接收到的微信数据
	 * @return  最终的解析结果（xml格式数据）
	 */
	public String processWechatMag(String xml){
		/** 解析xml数据 */
		ReceiveXmlEntity xmlEntity = new ReceiveXmlProcess().getMsgEntity(xml);

		/** 以文本消息为例，调用图灵机器人api接口，获取回复内容 */
		String result = "";
		if(MESSAGE_text.endsWith(xmlEntity.getMsgType())){
			result = new TulingApiProcess().getTulingResult(xmlEntity.getContent());
		}else if(MESSAGE_event.endsWith(xmlEntity.getMsgType())){
			//事件处理（菜单点击/关注/取消关注）
			if(MESSAGE_subscribe.endsWith(xmlEntity.getEvent())){
				//1.数据库记录当前用户的信息
				//2.返回操作菜单、
			}else if(MESSAGE_unsubscribe.endsWith(xmlEntity.getEvent())){
				//1.数据库删除记录
			}else if(MESSAGE_CLICK.endsWith(xmlEntity.getEvent())){}
		}else{
			result ="程序员休假去了，暂时处理不了" + xmlEntity.getMsgType()+"消息！";
		}

		/** 此时，如果用户输入的是“你好”，在经过上面的过程之后，result为“你也好”类似的内容
		 *  因为最终回复给微信的也是xml格式的数据，所有需要将其封装为文本类型返回消息
		 * */
		result = new FormatXmlProcess().formatXmlAnswer(xmlEntity.getFromUserName(), xmlEntity.getToUserName(), result);

		return result;
	}
}  