package config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "serial")
@PropertySource("classpath:config.properties")
public class ConfigBean {

	private String serverPort;

	private String windowsCharset;

	public String getServerPort() {
		return serverPort;
	}

	public void setServerPort(String serverPort) {
		this.serverPort = serverPort;
	}

	public String getWindowsCharset() {
		return windowsCharset;
	}

	public void setWindowsCharset(String windowsCharset) {
		this.windowsCharset = windowsCharset;
	}

}
