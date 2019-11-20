package com.jsystems.qa.qagui;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

public class Configuration {
    private static final Config CONFIG = ConfigFactory.load("config.conf");
    private static final String ENVIROMENT = CONFIG.getString("enviroment");
    private static final Config EW = CONFIG.getConfig("enviroments").getConfig(ENVIROMENT);

    public static final String BROWSER = CONFIG.getString("browser");
    public static final String MACHINE = CONFIG.getString("machine");

    public static final String BASE_URL = EW.getString("baseUrl");
    public static final String LOGIN = EW.getString("login");
    public static final String PASSWORD = EW.getString("password");
}
