package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ShopOrderStarling {

    @InterfaceC65349Pkn("order_message_header")
    public final BillStarlingText orderMessageHeader;

    @InterfaceC65349Pkn("order_notes_edit")
    public final BillStarlingText orderNotesEdit;

    @InterfaceC65349Pkn("order_notes_hint")
    public final BillStarlingText orderNotesHint;

    @InterfaceC65349Pkn("order_notes_text")
    public final BillStarlingText orderNotesText;

    @InterfaceC65349Pkn("shipping_method_select_text")
    public final BillStarlingText shippingMethodSelectText;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShopOrderStarling)) {
            return false;
        }
        ShopOrderStarling shopOrderStarling = (ShopOrderStarling) obj;
        return o.LJ(this.orderNotesText, shopOrderStarling.orderNotesText) && o.LJ(this.orderNotesHint, shopOrderStarling.orderNotesHint) && o.LJ(this.orderMessageHeader, shopOrderStarling.orderMessageHeader) && o.LJ(this.orderNotesEdit, shopOrderStarling.orderNotesEdit) && o.LJ(this.shippingMethodSelectText, shopOrderStarling.shippingMethodSelectText);
    }

    public final int hashCode() {
        BillStarlingText billStarlingText = this.orderNotesText;
        int hashCode = (billStarlingText == null ? 0 : billStarlingText.hashCode()) * 31;
        BillStarlingText billStarlingText2 = this.orderNotesHint;
        int hashCode2 = (hashCode + (billStarlingText2 == null ? 0 : billStarlingText2.hashCode())) * 31;
        BillStarlingText billStarlingText3 = this.orderMessageHeader;
        int hashCode3 = (hashCode2 + (billStarlingText3 == null ? 0 : billStarlingText3.hashCode())) * 31;
        BillStarlingText billStarlingText4 = this.orderNotesEdit;
        int hashCode4 = (hashCode3 + (billStarlingText4 == null ? 0 : billStarlingText4.hashCode())) * 31;
        BillStarlingText billStarlingText5 = this.shippingMethodSelectText;
        return hashCode4 + (billStarlingText5 != null ? billStarlingText5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ShopOrderStarling(orderNotesText=");
        LIZ.append(this.orderNotesText);
        LIZ.append(", orderNotesHint=");
        LIZ.append(this.orderNotesHint);
        LIZ.append(", orderMessageHeader=");
        LIZ.append(this.orderMessageHeader);
        LIZ.append(", orderNotesEdit=");
        LIZ.append(this.orderNotesEdit);
        LIZ.append(", shippingMethodSelectText=");
        LIZ.append(this.shippingMethodSelectText);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public ShopOrderStarling(BillStarlingText billStarlingText, BillStarlingText billStarlingText2, BillStarlingText billStarlingText3, BillStarlingText billStarlingText4, BillStarlingText billStarlingText5) {
        this.orderNotesText = billStarlingText;
        this.orderNotesHint = billStarlingText2;
        this.orderMessageHeader = billStarlingText3;
        this.orderNotesEdit = billStarlingText4;
        this.shippingMethodSelectText = billStarlingText5;
    }
}
