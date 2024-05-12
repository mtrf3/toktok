package com.ss.android.ugc.aweme.ecommerce.model;

import X.C78920UyC;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class GetItemProductInfoResponseData {

    @InterfaceC65349Pkn("cart_entry")
    public final CartEntry cartEntry;

    @InterfaceC65349Pkn("contain_multi_panel_resp")
    public final Boolean containMultiPanelResp;

    @InterfaceC65349Pkn("is_new_user")
    public final Boolean isNewUser;

    @InterfaceC65349Pkn("products")
    public final List<ShopWindowExtraModel> products;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetItemProductInfoResponseData)) {
            return false;
        }
        GetItemProductInfoResponseData getItemProductInfoResponseData = (GetItemProductInfoResponseData) obj;
        return o.LJ(this.products, getItemProductInfoResponseData.products) && o.LJ(this.cartEntry, getItemProductInfoResponseData.cartEntry) && o.LJ(this.isNewUser, getItemProductInfoResponseData.isNewUser) && o.LJ(this.containMultiPanelResp, getItemProductInfoResponseData.containMultiPanelResp);
    }

    public final int hashCode() {
        List<ShopWindowExtraModel> list = this.products;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        CartEntry cartEntry = this.cartEntry;
        int hashCode2 = (hashCode + (cartEntry == null ? 0 : cartEntry.hashCode())) * 31;
        Boolean bool = this.isNewUser;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.containMultiPanelResp;
        return hashCode3 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GetItemProductInfoResponseData(products=");
        LIZ.append(this.products);
        LIZ.append(", cartEntry=");
        LIZ.append(this.cartEntry);
        LIZ.append(", isNewUser=");
        LIZ.append(this.isNewUser);
        LIZ.append(", containMultiPanelResp=");
        return C78920UyC.LIZIZ(LIZ, this.containMultiPanelResp, ')', LIZ);
    }

    public GetItemProductInfoResponseData(List<ShopWindowExtraModel> list, CartEntry cartEntry, Boolean bool, Boolean bool2) {
        this.products = list;
        this.cartEntry = cartEntry;
        this.isNewUser = bool;
        this.containMultiPanelResp = bool2;
    }

    public /* synthetic */ GetItemProductInfoResponseData(List list, CartEntry cartEntry, Boolean bool, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? null : cartEntry, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : bool2);
    }
}
