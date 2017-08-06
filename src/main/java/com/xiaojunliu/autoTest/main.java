package com.xiaojunliu.autoTest;

import io.appium.java_client.android.AndroidDeviceActionShortcuts;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by hp on 2017/8/2.
 */
public class main {
    public static void main(String[] args){
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName","Android");

        try {
            AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
