package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class GetPromotionResponseData {

    @InterfaceC65349Pkn("address_promotion_info")
    public final AddressPromotionInfo addressPromotionInfo;

    @InterfaceC65349Pkn("address_promotion_schema")
    public final String addressPromotionSchema;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetPromotionResponseData)) {
            return false;
        }
        GetPromotionResponseData getPromotionResponseData = (GetPromotionResponseData) obj;
        return o.LJ(this.addressPromotionInfo, getPromotionResponseData.addressPromotionInfo) && o.LJ(this.addressPromotionSchema, getPromotionResponseData.addressPromotionSchema);
    }

    public final int hashCode() {
        AddressPromotionInfo addressPromotionInfo = this.addressPromotionInfo;
        int hashCode = (addressPromotionInfo == null ? 0 : addressPromotionInfo.hashCode()) * 31;
        String str = this.addressPromotionSchema;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GetPromotionResponseData(addressPromotionInfo=");
        LIZ.append(this.addressPromotionInfo);
        LIZ.append(", addressPromotionSchema=");
        return q.LIZIZ(LIZ, this.addressPromotionSchema, ')', LIZ);
    }

    public GetPromotionResponseData(AddressPromotionInfo addressPromotionInfo, String str) {
        this.addressPromotionInfo = addressPromotionInfo;
        this.addressPromotionSchema = str;
    }
}
