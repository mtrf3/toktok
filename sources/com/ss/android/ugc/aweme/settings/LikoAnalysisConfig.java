package com.ss.android.ugc.aweme.settings;

import X.InterfaceC65349Pkn;

/* loaded from: classes7.dex */
public class LikoAnalysisConfig {

    @InterfaceC65349Pkn("supportBigObjectAnalysis")
    public boolean supportBigObjectAnalysis = true;

    @InterfaceC65349Pkn("objectInstanceFilterSystem")
    public boolean objectInstanceFilterSystem = true;

    @InterfaceC65349Pkn("bigObjectFilterSystem")
    public boolean bigObjectFilterSystem = true;

    @InterfaceC65349Pkn("supportObjectInstanceAnalysis")
    public boolean supportObjectInstanceAnalysis = true;

    @InterfaceC65349Pkn("bitmapLatitude")
    public int bitmapLatitude = 204800;

    @InterfaceC65349Pkn("objectInstanceLatitude")
    public int objectInstanceLatitude = 10;

    @InterfaceC65349Pkn("supportBitmapAnalysis")
    public boolean supportBitmapAnalysis = true;

    @InterfaceC65349Pkn("bigObjectLatitude")
    public int bigObjectLatitude = 3;

    public int getBigObjectLatitude() {
        return this.bigObjectLatitude;
    }

    public int getBitmapLatitude() {
        return this.bitmapLatitude;
    }

    public int getObjectInstanceLatitude() {
        return this.objectInstanceLatitude;
    }

    public boolean isBigObjectFilterSystem() {
        return this.bigObjectFilterSystem;
    }

    public boolean isObjectInstanceFilterSystem() {
        return this.objectInstanceFilterSystem;
    }

    public boolean isSupportBigObjectAnalysis() {
        return this.supportBigObjectAnalysis;
    }

    public boolean isSupportBitmapAnalysis() {
        return this.supportBitmapAnalysis;
    }

    public boolean isSupportObjectInstanceAnalysis() {
        return this.supportObjectInstanceAnalysis;
    }

    public void setBigObjectFilterSystem(boolean z) {
        this.bigObjectFilterSystem = z;
    }

    public void setBigObjectLatitude(int i) {
        this.bigObjectLatitude = i;
    }

    public void setBitmapLatitude(int i) {
        this.bitmapLatitude = i;
    }

    public void setObjectInstanceFilterSystem(boolean z) {
        this.objectInstanceFilterSystem = z;
    }

    public void setObjectInstanceLatitude(int i) {
        this.objectInstanceLatitude = i;
    }

    public void setSupportBigObjectAnalysis(boolean z) {
        this.supportBigObjectAnalysis = z;
    }

    public void setSupportBitmapAnalysis(boolean z) {
        this.supportBitmapAnalysis = z;
    }

    public void setSupportObjectInstanceAnalysis(boolean z) {
        this.supportObjectInstanceAnalysis = z;
    }
}
