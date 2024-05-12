package X;

import com.bytedance.ttmock.data.RegionMockConfig;

/* loaded from: classes16.dex */
public final class X9V {
    public static final String LIZ;
    public static final String LIZIZ;
    public static final String LIZJ;
    public static final String LIZLLL;

    static {
        String str;
        String str2;
        String str3;
        C62822Ol8 LIZIZ2 = C221108m2.LIZIZ(X9T.LJLIL);
        RegionMockConfig regionMockConfig = (RegionMockConfig) LIZIZ2.getValue();
        String str4 = null;
        if (regionMockConfig != null) {
            str = regionMockConfig.getCarrierRegion();
        } else {
            str = null;
        }
        LIZ = str;
        RegionMockConfig regionMockConfig2 = (RegionMockConfig) LIZIZ2.getValue();
        if (regionMockConfig2 != null) {
            str2 = regionMockConfig2.getSysRegion();
        } else {
            str2 = null;
        }
        LIZIZ = str2;
        RegionMockConfig regionMockConfig3 = (RegionMockConfig) LIZIZ2.getValue();
        if (regionMockConfig3 != null) {
            str3 = regionMockConfig3.getMccRegion();
        } else {
            str3 = null;
        }
        LIZJ = str3;
        RegionMockConfig regionMockConfig4 = (RegionMockConfig) LIZIZ2.getValue();
        if (regionMockConfig4 != null) {
            str4 = regionMockConfig4.getOpRegion();
        }
        LIZLLL = str4;
    }
}
