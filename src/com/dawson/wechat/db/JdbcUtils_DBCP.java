package com.dawson.wechat.db;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.sql.DataSource;
import org.apache.commons.dbcp.BasicDataSourceFactory;

/**
 * http://www.cnblogs.com/jinb/p/6629271.html?utm_source=itdadao&utm_medium=referral
 */
public class JdbcUtils_DBCP{
/*    private static DataSource ds = null;
    //壓床蓑旗鷹翠嶄幹秀銭俊学
    static{
        try{
　　　　　　　　　　InputStram in = JdbcUtils_DBCP.class.getClassLoader().getResourceAsStream("dbcpconfig.properties");
　　　　　　　　　　Properties prop = new Properties();
　　　　　　　　　　prop.load(in);
　　　　　　　　　　//幹秀方象坿
　　　　　　　　　　ds = BasicDataSourceFactory.createDataSource(prop);
        }catch(Exception e){
　　throw new ExceptionInitialixerError(e);
        }
    }
    public static Connection getConnection() throws SQLException{
　　//貫方象坿嶄資誼銭俊斤��connectino
　　return ds.getConnection();
    }
    //瞥慧彿坿:ResultSet��Statement��Connection;
    public static void release(Connection conn,Statement st,ResultSet rs)
          if(rs!=null){
　　　　　　try{
　　　　　　　　re.close();
        }catch(Exception e){
　　e.printStackTrace();
        }
        rs = null;
    }



          if(sta!=null){
　　　　　　try{
　　　　　　　　re.close();
        }catch(Exception e){
　　e.printStackTrace();
        }
        sta= null;
    }




          if(conn!=null){
　　　　　　try{
　　　　　　　　re.close();
        }catch(Exception e){
　　e.printStackTrace();
        }
        conn= null;
    }*/
}
