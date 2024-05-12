package com.ss.android.ugc.aweme.ecommerce.base.pdp.module.buytogether.api;

import X.C78920UyC;
import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class SelectedSkuInfo {

    @InterfaceC65349Pkn("is_selected")
    public final Boolean isSelected;

    @InterfaceC65349Pkn("count")
    public final String quantity;

    @InterfaceC65349Pkn("id")
    public final String skuId;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectedSkuInfo)) {
            return false;
        }
        SelectedSkuInfo selectedSkuInfo = (SelectedSkuInfo) obj;
        return o.LJ(this.skuId, selectedSkuInfo.skuId) && o.LJ(this.quantity, selectedSkuInfo.quantity) && o.LJ(this.isSelected, selectedSkuInfo.isSelected);
    }

    public final int hashCode() {
        String str = this.skuId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.quantity;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.isSelected;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SelectedSkuInfo(skuId=");
        LIZ.append(this.skuId);
        LIZ.append(", quantity=");
        LIZ.append(this.quantity);
        LIZ.append(", isSelected=");
        return C78920UyC.LIZIZ(LIZ, this.isSelected, ')', LIZ);
    }

    public SelectedSkuInfo(String str, String str2, Boolean bool) {
        this.skuId = str;
        this.quantity = str2;
        this.isSelected = bool;
    }
}
