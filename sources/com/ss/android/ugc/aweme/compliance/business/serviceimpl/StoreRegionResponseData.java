package com.ss.android.ugc.aweme.compliance.business.serviceimpl;

import X.C48339Iy7;
import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class StoreRegionResponseData {

    @InterfaceC65349Pkn("localized_country_name")
    public final String countryName;

    @InterfaceC65349Pkn("enabled_region_option")
    public final boolean enabledRegionOption;

    @InterfaceC65349Pkn("store_region")
    public final String storeRegion;

    /* JADX WARN: Multi-variable type inference failed */
    public StoreRegionResponseData() {
        this(null, 0 == true ? 1 : 0, false, 7, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoreRegionResponseData)) {
            return false;
        }
        StoreRegionResponseData storeRegionResponseData = (StoreRegionResponseData) obj;
        return o.LJ(this.storeRegion, storeRegionResponseData.storeRegion) && o.LJ(this.countryName, storeRegionResponseData.countryName) && this.enabledRegionOption == storeRegionResponseData.enabledRegionOption;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        String str = this.storeRegion;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.countryName;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        boolean z = this.enabledRegionOption;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StoreRegionResponseData(storeRegion=");
        LIZ.append(this.storeRegion);
        LIZ.append(", countryName=");
        LIZ.append(this.countryName);
        LIZ.append(", enabledRegionOption=");
        return C48339Iy7.LIZJ(LIZ, this.enabledRegionOption, ')', LIZ);
    }

    public StoreRegionResponseData(String str, String str2, boolean z) {
        this.storeRegion = str;
        this.countryName = str2;
        this.enabledRegionOption = z;
    }

    public /* synthetic */ StoreRegionResponseData(String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? true : z);
    }
}
