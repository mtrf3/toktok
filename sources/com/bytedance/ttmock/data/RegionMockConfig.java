package com.bytedance.ttmock.data;

import X.C43588H8u;
import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class RegionMockConfig extends F9E {

    @InterfaceC65349Pkn("carrier_region")
    public final String carrierRegion;

    @InterfaceC65349Pkn("mcc_region")
    public final String mccRegion;

    @InterfaceC65349Pkn("op_region")
    public final String opRegion;

    @InterfaceC65349Pkn("sys_region")
    public final String sysRegion;

    public static /* synthetic */ RegionMockConfig copy$default(RegionMockConfig regionMockConfig, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = regionMockConfig.carrierRegion;
        }
        if ((i & 2) != 0) {
            str2 = regionMockConfig.mccRegion;
        }
        if ((i & 4) != 0) {
            str3 = regionMockConfig.sysRegion;
        }
        if ((i & 8) != 0) {
            str4 = regionMockConfig.opRegion;
        }
        return regionMockConfig.copy(str, str2, str3, str4);
    }

    public final RegionMockConfig copy(String carrierRegion, String mccRegion, String sysRegion, String opRegion) {
        o.LJIIIZ(carrierRegion, "carrierRegion");
        o.LJIIIZ(mccRegion, "mccRegion");
        o.LJIIIZ(sysRegion, "sysRegion");
        o.LJIIIZ(opRegion, "opRegion");
        return new RegionMockConfig(carrierRegion, mccRegion, sysRegion, opRegion);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.carrierRegion, this.mccRegion, this.sysRegion, this.opRegion};
    }

    public final String getCarrierRegion() {
        return this.carrierRegion;
    }

    public final String getMccRegion() {
        return this.mccRegion;
    }

    public final String getOpRegion() {
        return this.opRegion;
    }

    public final String getSysRegion() {
        return this.sysRegion;
    }

    public RegionMockConfig(String str, String str2, String str3, String str4) {
        C43588H8u.LIZLLL(str, "carrierRegion", str2, "mccRegion", str3, "sysRegion", str4, "opRegion");
        this.carrierRegion = str;
        this.mccRegion = str2;
        this.sysRegion = str3;
        this.opRegion = str4;
    }
}
