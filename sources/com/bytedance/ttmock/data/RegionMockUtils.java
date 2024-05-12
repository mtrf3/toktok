package com.bytedance.ttmock.data;

import X.C221108m2;
import X.C5H3;
import X.X9W;

/* loaded from: classes16.dex */
public final class RegionMockUtils {
    public static final RegionMockUtils INSTANCE;
    public static final String carrierRegion;
    public static final String mccRegion;
    public static final String opRegion;
    public static final C5H3 regionMockConfig$delegate;
    public static final String sysRegion;

    static {
        String carrierRegion2;
        String sysRegion2;
        String mccRegion2;
        RegionMockUtils regionMockUtils = new RegionMockUtils();
        INSTANCE = regionMockUtils;
        regionMockConfig$delegate = C221108m2.LIZIZ(X9W.LJLIL);
        RegionMockConfig regionMockConfig = regionMockUtils.getRegionMockConfig();
        String str = null;
        if (regionMockConfig == null) {
            carrierRegion2 = null;
        } else {
            carrierRegion2 = regionMockConfig.getCarrierRegion();
        }
        carrierRegion = carrierRegion2;
        RegionMockConfig regionMockConfig2 = regionMockUtils.getRegionMockConfig();
        if (regionMockConfig2 == null) {
            sysRegion2 = null;
        } else {
            sysRegion2 = regionMockConfig2.getSysRegion();
        }
        sysRegion = sysRegion2;
        RegionMockConfig regionMockConfig3 = regionMockUtils.getRegionMockConfig();
        if (regionMockConfig3 == null) {
            mccRegion2 = null;
        } else {
            mccRegion2 = regionMockConfig3.getMccRegion();
        }
        mccRegion = mccRegion2;
        RegionMockConfig regionMockConfig4 = regionMockUtils.getRegionMockConfig();
        if (regionMockConfig4 != null) {
            str = regionMockConfig4.getOpRegion();
        }
        opRegion = str;
    }

    private final RegionMockConfig getRegionMockConfig() {
        return (RegionMockConfig) regionMockConfig$delegate.getValue();
    }
}
