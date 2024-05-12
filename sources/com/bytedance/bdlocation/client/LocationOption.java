package com.bytedance.bdlocation.client;

import X.X1D;
import android.text.TextUtils;
import com.bytedance.bdlocation.entity.NetworkUploadInfo;
import defpackage.q;
import java.util.List;

/* loaded from: classes2.dex */
public class LocationOption {
    public boolean downGradeLocation;
    public int geocodeMode;
    public long interval;
    public boolean locationChanged;
    public long locationTimeOutMs;
    public int mAccuracyLevel;
    public String mBpeaAction;
    public Object mBpeaCert;
    public boolean mCert;
    public Object mDecryptCert;
    public boolean mEnableH3;
    public boolean mIsIndoor;
    public boolean mIsNeedCache;
    public boolean mIsNeedUnshiftedLatLng;
    public boolean mLatestAdminVersion;
    public int mLocateType;
    public List<NetworkUploadInfo> mNetworkStatusList;
    public int mTriggerType;
    public long mUploadInterval;
    public long maxCacheTime;
    public int mode;
    public boolean onceLocation;
    public boolean sIsUpload;
    public String uploadSource;

    public int hashCode() {
        int i;
        int i2;
        int i3;
        long j = this.locationTimeOutMs;
        int i4 = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.interval;
        int i5 = (((((((((((i4 + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.mode) * 31) + this.mTriggerType) * 31) + this.mAccuracyLevel) * 31) + this.mLocateType) * 31) + this.geocodeMode) * 31;
        long j3 = this.maxCacheTime;
        int i6 = (((((((((((((i5 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.mIsIndoor ? 1 : 0)) * 31) + (this.sIsUpload ? 1 : 0)) * 31) + (this.mCert ? 1 : 0)) * 31) + (this.onceLocation ? 1 : 0)) * 31) + (this.downGradeLocation ? 1 : 0)) * 31) + (this.mLatestAdminVersion ? 1 : 0)) * 31;
        String str = this.uploadSource;
        int i7 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i8 = (i6 + i) * 31;
        Object obj = this.mBpeaCert;
        if (obj != null) {
            i2 = obj.hashCode();
        } else {
            i2 = 0;
        }
        int i9 = (i8 + i2) * 31;
        Object obj2 = this.mDecryptCert;
        if (obj2 != null) {
            i3 = obj2.hashCode();
        } else {
            i3 = 0;
        }
        int i10 = (i9 + i3) * 31;
        String str2 = this.mBpeaAction;
        if (str2 != null) {
            i7 = str2.hashCode();
        }
        return i10 + i7;
    }

    public LocationOption() {
        this.mAccuracyLevel = 4;
        this.uploadSource = "";
        this.mBpeaAction = "";
        this.mLocateType = -1;
        this.sIsUpload = true;
        this.mTriggerType = 1;
        this.locationTimeOutMs = 30000L;
        this.onceLocation = true;
        this.mode = 2;
        this.maxCacheTime = 600000L;
        this.geocodeMode = 1;
        this.mEnableH3 = true;
        this.mIsNeedCache = true;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LocationOption{sIsUpload=");
        LIZ.append(this.sIsUpload);
        LIZ.append(", locationTimeOutMs=");
        LIZ.append(this.locationTimeOutMs);
        LIZ.append(", interval=");
        LIZ.append(this.interval);
        LIZ.append(", mode=");
        LIZ.append(this.mode);
        LIZ.append(", triggerType=");
        LIZ.append(this.mTriggerType);
        LIZ.append(", triggerType=");
        LIZ.append(this.mLocateType);
        LIZ.append(", maxCacheTime=");
        LIZ.append(this.maxCacheTime);
        LIZ.append(", getGeocodeMode=");
        LIZ.append(this.geocodeMode);
        LIZ.append(", mIsIndoor=");
        LIZ.append(this.mIsIndoor);
        LIZ.append(", mCert=");
        LIZ.append(this.mCert);
        LIZ.append(", onceLocation=");
        LIZ.append(this.onceLocation);
        LIZ.append(", downGradeLocation=");
        LIZ.append(this.downGradeLocation);
        LIZ.append(", mLatestAdminVersion=");
        LIZ.append(this.mLatestAdminVersion);
        LIZ.append(", mBpeaAction=");
        return q.LIZIZ(LIZ, this.mBpeaAction, '}', LIZ);
    }

    public int getAccuracyLevel() {
        return this.mAccuracyLevel;
    }

    public String getBpeaAction() {
        return this.mBpeaAction;
    }

    public Object getBpeaCert() {
        return this.mBpeaCert;
    }

    public Object getDecryptCert() {
        return this.mDecryptCert;
    }

    public int getGeocodeMode() {
        return this.geocodeMode;
    }

    public long getInterval() {
        return this.interval;
    }

    public int getLocateType() {
        return this.mLocateType;
    }

    public long getLocationTimeOutMs() {
        return this.locationTimeOutMs;
    }

    public long getMaxCacheTime() {
        return this.maxCacheTime;
    }

    public int getMode() {
        return this.mode;
    }

    public List<NetworkUploadInfo> getNetworkStatusList() {
        return this.mNetworkStatusList;
    }

    public int getTriggerType() {
        return this.mTriggerType;
    }

    public long getUploadInterval() {
        return this.mUploadInterval;
    }

    public String getUploadSource() {
        return this.uploadSource;
    }

    public boolean isCert() {
        return this.mCert;
    }

    public boolean isDownGradeLocation() {
        return this.downGradeLocation;
    }

    public boolean isEnableH3() {
        return this.mEnableH3;
    }

    public boolean isIndoor() {
        return this.mIsIndoor;
    }

    public boolean isLatestAdminVersion() {
        return this.mLatestAdminVersion;
    }

    public boolean isLocationChanged() {
        return this.locationChanged;
    }

    public boolean isNeedCache() {
        return this.mIsNeedCache;
    }

    public boolean isNeedUnshiftedLatLng() {
        return this.mIsNeedUnshiftedLatLng;
    }

    public boolean isOnceLocation() {
        return this.onceLocation;
    }

    public boolean isUpload() {
        return this.sIsUpload;
    }

    public LocationOption(LocationOption locationOption) {
        this.mAccuracyLevel = 4;
        this.uploadSource = "";
        this.mBpeaAction = "";
        this.mLocateType = -1;
        this.sIsUpload = true;
        this.mTriggerType = 1;
        this.locationTimeOutMs = 30000L;
        this.onceLocation = true;
        this.mode = 2;
        this.maxCacheTime = 600000L;
        this.geocodeMode = 1;
        this.mEnableH3 = true;
        this.mIsNeedCache = true;
        if (locationOption == null) {
            return;
        }
        this.locationTimeOutMs = locationOption.locationTimeOutMs;
        this.interval = locationOption.interval;
        this.mode = locationOption.mode;
        this.maxCacheTime = locationOption.maxCacheTime;
        this.geocodeMode = locationOption.geocodeMode;
        this.mIsIndoor = locationOption.mIsIndoor;
        this.uploadSource = locationOption.uploadSource;
        this.mBpeaCert = locationOption.mBpeaCert;
        this.mDecryptCert = locationOption.mDecryptCert;
        this.mBpeaAction = locationOption.mBpeaAction;
        this.mAccuracyLevel = locationOption.mAccuracyLevel;
        this.mTriggerType = locationOption.mTriggerType;
        this.mLocateType = locationOption.mLocateType;
        this.sIsUpload = locationOption.sIsUpload;
        this.onceLocation = locationOption.onceLocation;
        this.downGradeLocation = locationOption.downGradeLocation;
        this.mLatestAdminVersion = locationOption.mLatestAdminVersion;
        this.locationChanged = locationOption.locationChanged;
        this.mCert = locationOption.mCert;
        this.mNetworkStatusList = locationOption.mNetworkStatusList;
        this.mUploadInterval = locationOption.mUploadInterval;
        this.mEnableH3 = locationOption.mEnableH3;
        this.mIsNeedCache = locationOption.mIsNeedCache;
        this.mIsNeedUnshiftedLatLng = locationOption.mIsNeedUnshiftedLatLng;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationOption)) {
            return false;
        }
        LocationOption locationOption = (LocationOption) obj;
        if (this.locationTimeOutMs == locationOption.locationTimeOutMs && this.interval == locationOption.interval && this.geocodeMode == locationOption.geocodeMode && this.mIsIndoor == locationOption.mIsIndoor && this.sIsUpload == locationOption.sIsUpload && this.onceLocation == locationOption.onceLocation && this.downGradeLocation == locationOption.downGradeLocation && this.mLatestAdminVersion == locationOption.mLatestAdminVersion && this.mCert == locationOption.mCert && this.mTriggerType == locationOption.mTriggerType && this.mLocateType == locationOption.mLocateType && this.mAccuracyLevel == locationOption.mAccuracyLevel && TextUtils.equals(this.uploadSource, locationOption.uploadSource) && this.mBpeaCert == locationOption.mBpeaCert && this.mDecryptCert == locationOption.mDecryptCert && TextUtils.equals(this.mBpeaAction, locationOption.mBpeaAction) && this.mode == locationOption.mode) {
            return true;
        }
        return false;
    }

    public void setAccuracyLevel(int i) {
        this.mAccuracyLevel = i;
    }

    public void setBpeaAction(String str) {
        this.mBpeaAction = str;
    }

    public void setBpeaCert(Object obj) {
        this.mBpeaCert = obj;
    }

    public void setCert(boolean z) {
        this.mCert = z;
    }

    public void setDecryptCert(Object obj) {
        this.mDecryptCert = obj;
    }

    public void setDownGradeLocation(boolean z) {
        this.downGradeLocation = z;
    }

    public void setEnableH3(boolean z) {
        this.mEnableH3 = z;
    }

    public void setGeocodeMode(int i) {
        this.geocodeMode = i;
    }

    public void setIndoor(boolean z) {
        this.mIsIndoor = z;
    }

    public void setInterval(long j) {
        this.interval = j;
    }

    public void setLatestAdminVersion(boolean z) {
        this.mLatestAdminVersion = z;
    }

    public void setLocateType(int i) {
        this.mLocateType = i;
    }

    public void setLocationChanged(boolean z) {
        this.locationChanged = z;
    }

    public void setLocationTimeOutMs(long j) {
        this.locationTimeOutMs = j;
    }

    public void setMaxCacheTime(long j) {
        this.maxCacheTime = j;
    }

    public void setMode(int i) {
        this.mode = i;
    }

    public void setNeedCache(boolean z) {
        this.mIsNeedCache = z;
    }

    public void setNeedUnshiftedLatLng(boolean z) {
        this.mIsNeedUnshiftedLatLng = z;
    }

    public void setNetworkStatusList(List<NetworkUploadInfo> list) {
        this.mNetworkStatusList = list;
    }

    public void setOnceLocation(boolean z) {
        this.onceLocation = z;
    }

    public void setTriggerType(int i) {
        this.mTriggerType = i;
    }

    public void setUpload(boolean z) {
        this.sIsUpload = z;
    }

    public void setUploadInterval(long j) {
        this.mUploadInterval = j;
    }

    public void setUploadSource(String str) {
        this.uploadSource = str;
    }
}
