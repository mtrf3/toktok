package com.bytedance.geckox.model;

import X.C08380Uo;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Build;

/* loaded from: classes11.dex */
public class Common {

    @InterfaceC65349Pkn("aid")
    public long aid;

    @InterfaceC65349Pkn("app_name")
    public String appName;

    @InterfaceC65349Pkn("app_version")
    public String appVersion;

    @InterfaceC65349Pkn("device_id")
    public String deviceId;

    @InterfaceC65349Pkn("device_model")
    public String deviceModel;

    @InterfaceC65349Pkn("device_platform")
    public String devicePlatform;

    @InterfaceC65349Pkn("os")
    public int os;

    @InterfaceC65349Pkn("os_version")
    public String osVersion;

    @InterfaceC65349Pkn("region")
    public String region;

    @InterfaceC65349Pkn("sdk_version")
    public String sdkVersion;

    public Common(long j, String str, String str2, String str3) {
        StringBuilder LIZ = X1D.LIZ();
        this.osVersion = C08380Uo.LIZ(LIZ, Build.VERSION.SDK_INT, "", LIZ);
        this.deviceModel = Build.MODEL;
        this.devicePlatform = "android";
        this.sdkVersion = "3.4.2.2-bugfix";
        this.aid = j;
        this.appVersion = str;
        this.deviceId = str2;
        this.region = str3;
    }
}
