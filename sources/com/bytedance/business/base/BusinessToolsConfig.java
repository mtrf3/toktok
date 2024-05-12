package com.bytedance.business.base;

import X.C35375DuV;

/* loaded from: classes7.dex */
public class BusinessToolsConfig {
    public static volatile BusinessToolsConfig mBusinessToolsConfig;
    public int aid;
    public int appVersionCode;
    public String appVersionName;
    public boolean isDebug;
    public C35375DuV mBugReportConfig;

    public C35375DuV getBugReportConfig() {
        return null;
    }

    public void setBugReportConfig(C35375DuV c35375DuV) {
    }

    public int getAid() {
        return this.aid;
    }

    public int getAppVersionCode() {
        return this.appVersionCode;
    }

    public String getAppVersionName() {
        return this.appVersionName;
    }

    public boolean isDebug() {
        return this.isDebug;
    }

    public void setAid(int i) {
        this.aid = i;
    }

    public void setAppVersionCode(int i) {
        this.appVersionCode = i;
    }

    public void setAppVersionName(String str) {
        this.appVersionName = str;
    }

    public void setDebug(boolean z) {
        this.isDebug = z;
    }

    public BusinessToolsConfig(String str, int i, int i2, boolean z) {
        this.appVersionName = str;
        this.appVersionCode = i;
        this.aid = i2;
        this.isDebug = z;
    }

    public static BusinessToolsConfig getInstance(String str, int i, int i2, boolean z) {
        if (mBusinessToolsConfig == null) {
            synchronized (BusinessToolsConfig.class) {
                if (mBusinessToolsConfig == null) {
                    mBusinessToolsConfig = new BusinessToolsConfig(str, i, i2, z);
                }
            }
        }
        return mBusinessToolsConfig;
    }
}
