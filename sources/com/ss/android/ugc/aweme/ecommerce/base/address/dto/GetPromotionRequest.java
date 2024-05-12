package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class GetPromotionRequest {

    @InterfaceC65349Pkn("address_promotion_skus")
    public final List<AddressPromotionSku> addressPromotionSkus;

    @InterfaceC65349Pkn("address_source")
    public final int addressSource;

    @InterfaceC65349Pkn("best_voucher_type_ids")
    public final List<String> bestVoucherTypeIds;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetPromotionRequest)) {
            return false;
        }
        GetPromotionRequest getPromotionRequest = (GetPromotionRequest) obj;
        return this.addressSource == getPromotionRequest.addressSource && o.LJ(this.addressPromotionSkus, getPromotionRequest.addressPromotionSkus) && o.LJ(this.bestVoucherTypeIds, getPromotionRequest.bestVoucherTypeIds);
    }

    public final int hashCode() {
        int i = this.addressSource * 31;
        List<AddressPromotionSku> list = this.addressPromotionSkus;
        int hashCode = (i + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.bestVoucherTypeIds;
        return hashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GetPromotionRequest(addressSource=");
        LIZ.append(this.addressSource);
        LIZ.append(", addressPromotionSkus=");
        LIZ.append(this.addressPromotionSkus);
        LIZ.append(", bestVoucherTypeIds=");
        return C1NE.LIZIZ(LIZ, this.bestVoucherTypeIds, ')', LIZ);
    }

    public GetPromotionRequest(int i, List<AddressPromotionSku> list, List<String> list2) {
        this.addressSource = i;
        this.addressPromotionSkus = list;
        this.bestVoucherTypeIds = list2;
    }

    public /* synthetic */ GetPromotionRequest(int i, List list, List list2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, list, (i2 & 4) != 0 ? null : list2);
    }
}
