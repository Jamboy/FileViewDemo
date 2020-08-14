package com.silang.superfileview;

/**
 * Created by 12457 on 2017/8/2.
 */

import android.app.Application;
import android.os.Build;
import android.util.Log;

import com.tencent.smtt.sdk.QbSdk;
import com.tencent.smtt.sdk.TbsDownloader;
import com.tencent.smtt.sdk.TbsListener;

/**
 * Created by ljh
 * on 2016/12/22.
 */
public class App extends Application {


//    private TbsListener tbsListener;

    @Override
    public void onCreate() {
        super.onCreate();
        QbSdk.initX5Environment(this,null);
        ExceptionHandler.getInstance().initConfig(this);

    }
}
