package com.bytedance.liko.leakdetector.strategy.miniupload.hprofile;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes7.dex */
public final class HeaderBean extends F9E {

    @InterfaceC65349Pkn("aid")
    public final String aid;

    @InterfaceC65349Pkn("app_version")
    public final String appVersion;

    @InterfaceC65349Pkn("channel")
    public final String channel;

    @InterfaceC65349Pkn("config_time")
    public final String configTime;

    @InterfaceC65349Pkn("current_update_version_code")
    public final String currentUpdateVersionCode;

    @InterfaceC65349Pkn("device_brand")
    public final String deviceBrand;

    @InterfaceC65349Pkn("device_id")
    public final String deviceID;

    @InterfaceC65349Pkn("device_manufacturer")
    public final String deviceManufacturer;

    @InterfaceC65349Pkn("device_model")
    public final String deviceModel;

    @InterfaceC65349Pkn("device_platform")
    public final String devicePlatform;

    @InterfaceC65349Pkn("os")
    public final String os;

    @InterfaceC65349Pkn("os_api")
    public final String osApi;

    @InterfaceC65349Pkn("os_version")
    public final String osVersion;

    @InterfaceC65349Pkn("process_name")
    public final String processName;

    @InterfaceC65349Pkn("region")
    public final String region;

    @InterfaceC65349Pkn("release_build")
    public final String releaseBuild;

    @InterfaceC65349Pkn("sid")
    public final String sid;

    @InterfaceC65349Pkn("update_version_code")
    public final String updateVersionCode;

    @InterfaceC65349Pkn("version_name")
    public final String verionName;

    @InterfaceC65349Pkn("version_code")
    public final String verisonCode;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.aid, this.channel, this.deviceID, this.appVersion, this.updateVersionCode, this.currentUpdateVersionCode, this.osVersion, this.osApi, this.deviceModel, this.deviceBrand, this.deviceManufacturer, this.processName, this.verionName, this.verisonCode, this.region, this.os, this.devicePlatform, this.sid, this.configTime, this.releaseBuild};
    }

    public HeaderBean(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20) {
        this.aid = str;
        this.channel = str2;
        this.deviceID = str3;
        this.appVersion = str4;
        this.updateVersionCode = str5;
        this.currentUpdateVersionCode = str6;
        this.osVersion = str7;
        this.osApi = str8;
        this.deviceModel = str9;
        this.deviceBrand = str10;
        this.deviceManufacturer = str11;
        this.processName = str12;
        this.verionName = str13;
        this.verisonCode = str14;
        this.region = str15;
        this.os = str16;
        this.devicePlatform = str17;
        this.sid = str18;
        this.configTime = str19;
        this.releaseBuild = str20;
    }
}
