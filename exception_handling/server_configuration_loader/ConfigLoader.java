package exception_handling.server_configuration_loader;

public class ConfigLoader {
 
    public void loadConfig(String filePath) throws Exception{

        if("server_config.ini".equals(filePath)){
            System.out.println("Configuration loaded successfully. Server starting...");
        } else{
            throw new Exception("File Not Found: The configuration file is missing.");
        }
    }

}
