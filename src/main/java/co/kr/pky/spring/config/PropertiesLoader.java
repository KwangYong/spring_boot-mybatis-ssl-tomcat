package co.kr.pky.spring.config;

import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
/**
 * Created by DEV on 15. 5. 12..
 */
@Component
public class PropertiesLoader {

    private Properties configProp = new Properties();

    public static PropertiesLoader instance = new PropertiesLoader();
    private PropertiesLoader() {
        InputStream in = this.getClass().getClassLoader().getResourceAsStream("application.properties");
        try {
            configProp.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static PropertiesLoader getInstance(){
        return instance;
    }

    public String getProperty(String key){
        String value = configProp.getProperty(key);
        return value;
    }
}