package com.bytedance.bdlocation.client;

/* loaded from: classes16.dex */
public class BDLocationClientOption {
    public Object mBpeaCert;
    public boolean mCert;
    public Object mDecryptCert;
    public long mInterval;
    public boolean mIsNeedUnshiftedLatLng;
    public boolean mLatestAdminVersion;
    public int mTriggerType = 1;
    public int mAccuracyLevel = 4;
    public int mLocationMode = 2;
    public int mLocateType = 3;
    public long mMaxCacheTime = 600000;
    public long mLocationTimeOut = 30000;
    public String mUploadSource = "";
    public int mGeocodeMode = 1;
    public boolean mEnableH3 = true;

    public int getAccuracyLevel() {
        return this.mAccuracyLevel;
    }

    public Object getBpeaCert() {
        return this.mBpeaCert;
    }

    public Object getDecryptCert() {
        return this.mDecryptCert;
    }

    public int getGeocodeMode() {
        return this.mGeocodeMode;
    }

    public long getInterval() {
        return this.mInterval;
    }

    public int getLocateType() {
        return this.mLocateType;
    }

    public int getLocationMode() {
        return this.mLocationMode;
    }

    public long getLocationTimeOut() {
        return this.mLocationTimeOut;
    }

    public long getMaxCacheTime() {
        return this.mMaxCacheTime;
    }

    public int getTriggerType() {
        return this.mTriggerType;
    }

    public String getUploadSource() {
        return this.mUploadSource;
    }

    public boolean isCert() {
        return this.mCert;
    }

    public boolean isEnableH3() {
        return this.mEnableH3;
    }

    public boolean isLatestAdminVersion() {
        return this.mLatestAdminVersion;
    }

    public boolean isNeedUnshiftedLatLng() {
        return this.mIsNeedUnshiftedLatLng;
    }

    public BDLocationClientOption setAccuracyLevel(int i) {
        this.mAccuracyLevel = i;
        return this;
    }

    public BDLocationClientOption setBpeaCert(Object obj) {
        this.mBpeaCert = obj;
        return this;
    }

    public BDLocationClientOption setCert(boolean z) {
        this.mCert = z;
        return this;
    }

    public void setDecryptCert(Object obj) {
        this.mDecryptCert = obj;
    }

    public void setEnableH3(boolean z) {
        this.mEnableH3 = z;
    }

    public void setGeocodeMode(int i) {
        this.mGeocodeMode = i;
    }

    public BDLocationClientOption setInterval(long j) {
        this.mInterval = j;
        return this;
    }

    public BDLocationClientOption setLatestAdminVersion(boolean z) {
        this.mLatestAdminVersion = z;
        return this;
    }

    public BDLocationClientOption setLocateType(int i) {
        this.mLocateType = i;
        return this;
    }

    public BDLocationClientOption setLocationMode(int i) {
        this.mLocationMode = i;
        return this;
    }

    public BDLocationClientOption setLocationTimeOut(long j) {
        this.mLocationTimeOut = j;
        return this;
    }

    public BDLocationClientOption setMaxCacheTime(long j) {
        this.mMaxCacheTime = j;
        return this;
    }

    public void setNeedUnshiftedLatLng(boolean z) {
        this.mIsNeedUnshiftedLatLng = z;
    }

    public BDLocationClientOption setTriggerType(int i) {
        this.mTriggerType = i;
        return this;
    }

    public BDLocationClientOption setUploadSource(String str) {
        this.mUploadSource = str;
        return this;
    }
}
