package com.bytedance.bdlocation.provider;

import com.bytedance.bdlocation.api.IRegionDataCore;
import com.bytedance.bdlocation.callback.RegionUploadCallback;
import com.bytedance.bdlocation.entity.region.RegionBean;

/* loaded from: classes16.dex */
public class DefaultRegionDataCore implements IRegionDataCore {
    @Override // com.bytedance.bdlocation.api.IRegionDataCore
    public RegionBean getRegion(boolean z) {
        return null;
    }

    @Override // com.bytedance.bdlocation.api.IRegionDataCore
    public RegionBean getRegion(boolean z, boolean z2) {
        return null;
    }

    @Override // com.bytedance.bdlocation.api.IRegionDataCore
    public void init() {
    }

    @Override // com.bytedance.bdlocation.api.IRegionDataCore
    public boolean uploadRegionInfo() {
        return false;
    }

    @Override // com.bytedance.bdlocation.api.IRegionDataCore
    public void uploadRegionInfoAsync(RegionUploadCallback regionUploadCallback) {
    }
}
