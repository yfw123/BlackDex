package top.niunaijun.blackdex;

import android.app.Application;
import android.content.Context;

import top.niunaijun.blackbox.BlackBoxCore;
import top.niunaijun.blackbox.app.configuration.ClientConfiguration;

/**
 * Created by Milk on 2021/5/20.
 * * ∧＿∧
 * (`･ω･∥
 * 丶　つ０
 * しーＪ
 * 此处无Bug
 */
public class App extends Application {
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        BlackBoxCore.get().doAttachBaseContext(base, new ClientConfiguration() {
            @Override
            public String getHostPackageName() {
                return base.getPackageName();
            }
        });
    }

    @Override
    public void onCreate() {
        super.onCreate();
        BlackBoxCore.get().doCreate();
    }
}