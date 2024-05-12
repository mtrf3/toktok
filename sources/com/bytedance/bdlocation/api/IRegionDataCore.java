package com.bytedance.bdlocation.api;

import com.bytedance.bdlocation.callback.RegionUploadCallback;
import com.bytedance.bdlocation.entity.region.RegionBean;

/* loaded from: classes16.dex */
public interface IRegionDataCore extends IManager {
    RegionBean getRegion(boolean z);

    RegionBean getRegion(boolean z, boolean z2);

    void init();

    boolean uploadRegionInfo();

    void uploadRegionInfoAsync(RegionUploadCallback regionUploadCallback);
}
