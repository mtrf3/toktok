package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class RefreshProductSKUInfoResponse {
    public static final /* synthetic */ int LIZ = 0;

    @InterfaceC65349Pkn("code")
    public final Integer code;

    @InterfaceC65349Pkn("data")
    public final PackSkuMapData data;

    @InterfaceC65349Pkn("message")
    public final String message;

    /* JADX WARN: Multi-variable type inference failed */
    public RefreshProductSKUInfoResponse() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RefreshProductSKUInfoResponse)) {
            return false;
        }
        RefreshProductSKUInfoResponse refreshProductSKUInfoResponse = (RefreshProductSKUInfoResponse) obj;
        return o.LJ(this.code, refreshProductSKUInfoResponse.code) && o.LJ(this.message, refreshProductSKUInfoResponse.message) && o.LJ(this.data, refreshProductSKUInfoResponse.data);
    }

    public final int hashCode() {
        Integer num = this.code;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.message;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        PackSkuMapData packSkuMapData = this.data;
        return hashCode2 + (packSkuMapData != null ? packSkuMapData.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("RefreshProductSKUInfoResponse(code=");
        LIZ2.append(this.code);
        LIZ2.append(", message=");
        LIZ2.append(this.message);
        LIZ2.append(", data=");
        LIZ2.append(this.data);
        LIZ2.append(')');
        return X1D.LIZIZ(LIZ2);
    }

    public RefreshProductSKUInfoResponse(Integer num, String str, PackSkuMapData packSkuMapData) {
        this.code = num;
        this.message = str;
        this.data = packSkuMapData;
    }

    public /* synthetic */ RefreshProductSKUInfoResponse(Integer num, String str, PackSkuMapData packSkuMapData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? -1 : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : packSkuMapData);
    }
}
