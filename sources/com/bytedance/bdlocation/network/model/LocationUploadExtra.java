package com.bytedance.bdlocation.network.model;

import com.bytedance.bdlocation.entity.GPSCacheEntity;
import com.bytedance.bdlocation.entity.NetworkUploadInfo;
import java.util.List;

/* loaded from: classes2.dex */
public class LocationUploadExtra {
    public GPSCacheEntity gpsCacheEntity;
    public boolean mLatestAdminVersion;
    public List<NetworkUploadInfo> sNetworkStatusList;
    public int triggerType;
    public long uploadInterval;
    public String uploadSource;

    public GPSCacheEntity getGPSCache() {
        return this.gpsCacheEntity;
    }

    public int getTriggerType() {
        return this.triggerType;
    }

    public long getUploadInterval() {
        return this.uploadInterval;
    }

    public String getUploadSource() {
        return this.uploadSource;
    }

    public List<NetworkUploadInfo> getsNetworkStatusList() {
        return this.sNetworkStatusList;
    }

    public boolean isLatestAdminVersion() {
        return this.mLatestAdminVersion;
    }

    public void setGPSCache(GPSCacheEntity gPSCacheEntity) {
        this.gpsCacheEntity = gPSCacheEntity;
    }

    public void setLatestAdminVersion(boolean z) {
        this.mLatestAdminVersion = z;
    }

    public void setNetworkStatusList(List<NetworkUploadInfo> list) {
        this.sNetworkStatusList = list;
    }

    public void setTriggerType(int i) {
        this.triggerType = i;
    }

    public void setUploadInterval(long j) {
        this.uploadInterval = j;
    }

    public void setUploadSource(String str) {
        this.uploadSource = str;
    }
}
