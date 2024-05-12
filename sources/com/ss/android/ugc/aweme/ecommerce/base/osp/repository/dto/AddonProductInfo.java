package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AddonProductInfo {

    @InterfaceC65349Pkn("product_id")
    public final String productId;

    @InterfaceC65349Pkn("sku_ids")
    public final List<String> skuIds;

    /* JADX WARN: Multi-variable type inference failed */
    public AddonProductInfo() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AddonProductInfo copy$default(AddonProductInfo addonProductInfo, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = addonProductInfo.productId;
        }
        if ((i & 2) != 0) {
            list = addonProductInfo.skuIds;
        }
        return addonProductInfo.copy(str, list);
    }

    public final AddonProductInfo copy(String str, List<String> list) {
        return new AddonProductInfo(str, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddonProductInfo)) {
            return false;
        }
        AddonProductInfo addonProductInfo = (AddonProductInfo) obj;
        return o.LJ(this.productId, addonProductInfo.productId) && o.LJ(this.skuIds, addonProductInfo.skuIds);
    }

    public int hashCode() {
        String str = this.productId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<String> list = this.skuIds;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AddonProductInfo(productId=");
        LIZ.append(this.productId);
        LIZ.append(", skuIds=");
        return C1NE.LIZIZ(LIZ, this.skuIds, ')', LIZ);
    }

    public final String getProductId() {
        return this.productId;
    }

    public final List<String> getSkuIds() {
        return this.skuIds;
    }

    public AddonProductInfo(String str, List<String> list) {
        this.productId = str;
        this.skuIds = list;
    }

    public /* synthetic */ AddonProductInfo(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list);
    }
}
