package com.bytedance.geckox.settings.model;

import X.InterfaceC65349Pkn;

/* loaded from: classes11.dex */
public class SettingsLocal {

    @InterfaceC65349Pkn("access_keys_md5")
    public String accessKeysMd5;

    @InterfaceC65349Pkn("app_version")
    public String appVersion;

    @InterfaceC65349Pkn("env")
    public String env;

    public String getAccessKeysMd5() {
        return this.accessKeysMd5;
    }

    public String getAppVersion() {
        return this.appVersion;
    }

    public String getEnv() {
        return this.env;
    }

    public void setAccessKeysMd5(String str) {
        this.accessKeysMd5 = str;
    }

    public void setAppVersion(String str) {
        this.appVersion = str;
    }

    public void setEnv(String str) {
        this.env = str;
    }

    public SettingsLocal(String str, String str2) {
        this.env = str;
        this.appVersion = str2;
    }

    public SettingsLocal(String str, String str2, String str3) {
        this.env = str;
        this.appVersion = str2;
        this.accessKeysMd5 = str3;
    }
}
