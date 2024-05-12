package com.ss.android.ugc.aweme.download.component_api.depend;

import android.content.Context;

/* loaded from: classes16.dex */
public interface IDownloadSdkMonitorDepend {
    String getAid();

    String getAppVersionName();

    String getChannel();

    Context getContext();

    String getDeviceId();

    String[] getMonitorHosts();

    String getPackageName();

    long getUpdateVersionCode();
}
