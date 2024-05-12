package com.ss.android.ugc.aweme.setting.api;

import X.AbstractC73672Svk;
import X.E7Y;
import X.E8L;
import com.ss.android.ugc.aweme.setting.model.RegionStatus;

/* loaded from: classes7.dex */
public interface RegionStatusApi {
    public static final E7Y LIZ = E7Y.LIZ;

    @E8L("/tiktok/region/change/status/get/v1")
    AbstractC73672Svk<RegionStatus> getRegionStatus();
}
