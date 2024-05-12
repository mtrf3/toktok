package com.bytedance.ies.xbridge.base.runtime.depend;

import X.FCU;
import X.FCV;
import X.Y8U;
import android.app.Application;
import android.content.Context;
import java.util.List;

/* loaded from: classes16.dex */
public interface IHostContextDepend {
    public static final Y8U Companion = Y8U.LIZ;

    int getAppId();

    String getAppName();

    Application getApplication();

    Context getApplicationContext();

    String getBoeChannel();

    String getChannel();

    String getCurrentTelcomCarrier();

    String getDeviceId();

    String getFullLanguage();

    String getLanguage();

    String getPPEChannel();

    String getPackageName();

    List<FCV> getSettings(List<FCU> list);

    String getSkinName();

    String getSkinType();

    String getUpdateVersion();

    long getVersionCode();

    String getVersionName();

    boolean isBoeEnable();

    boolean isDebuggable();

    boolean isPPEEnable();

    boolean isTeenMode();
}
