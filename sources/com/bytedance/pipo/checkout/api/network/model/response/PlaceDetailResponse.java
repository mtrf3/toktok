package com.bytedance.pipo.checkout.api.network.model.response;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class PlaceDetailResponse {

    @InterfaceC65349Pkn("addr_info")
    public final AddressInfo addrInfo;

    @InterfaceC65349Pkn("Report")
    public final String report;

    /* JADX WARN: Multi-variable type inference failed */
    public PlaceDetailResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ PlaceDetailResponse copy$default(PlaceDetailResponse placeDetailResponse, AddressInfo addressInfo, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            addressInfo = placeDetailResponse.addrInfo;
        }
        if ((i & 2) != 0) {
            str = placeDetailResponse.report;
        }
        return placeDetailResponse.copy(addressInfo, str);
    }

    public final PlaceDetailResponse copy(AddressInfo addressInfo, String str) {
        return new PlaceDetailResponse(addressInfo, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaceDetailResponse)) {
            return false;
        }
        PlaceDetailResponse placeDetailResponse = (PlaceDetailResponse) obj;
        return o.LJ(this.addrInfo, placeDetailResponse.addrInfo) && o.LJ(this.report, placeDetailResponse.report);
    }

    public int hashCode() {
        AddressInfo addressInfo = this.addrInfo;
        int hashCode = (addressInfo == null ? 0 : addressInfo.hashCode()) * 31;
        String str = this.report;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PlaceDetailResponse(addrInfo=");
        LIZ.append(this.addrInfo);
        LIZ.append(", report=");
        LIZ.append((Object) this.report);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final AddressInfo getAddrInfo() {
        return this.addrInfo;
    }

    public final String getReport() {
        return this.report;
    }

    public PlaceDetailResponse(AddressInfo addressInfo, String str) {
        this.addrInfo = addressInfo;
        this.report = str;
    }

    public /* synthetic */ PlaceDetailResponse(AddressInfo addressInfo, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : addressInfo, (i & 2) != 0 ? null : str);
    }
}
