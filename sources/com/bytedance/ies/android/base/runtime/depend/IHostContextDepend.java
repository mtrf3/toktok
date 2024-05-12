package com.bytedance.ies.android.base.runtime.depend;

import X.C58633Mzl;
import android.app.Application;
import android.content.Context;

/* loaded from: classes11.dex */
public interface IHostContextDepend {
    public static final C58633Mzl Companion = C58633Mzl.LIZ;

    int getAppId();

    String getAppName();

    Application getApplication();

    Context getApplicationContext();

    String getBoeChannel();

    String getChannel();

    String getCurrentTelcomCarrier();

    String getDeviceId();

    String getLanguage();

    String getPPEChannel();

    String getPackageName();

    String getRegion();

    String getSkinName();

    String getSkinType();

    String getUpdateVersion();

    String getUserAgent();

    long getVersionCode();

    String getVersionName();

    boolean isBoeEnable();

    boolean isDebuggable();

    boolean isMiniAppEnable();

    boolean isPPEEnable();

    boolean isTeenMode();
}
