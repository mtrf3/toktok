package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class BillStarling {

    @InterfaceC65349Pkn("add_delivery_address")
    public final BillStarlingText addDeliverAddress;

    @InterfaceC65349Pkn("delivery_address")
    public final BillStarlingText deliveryAddress;

    @InterfaceC65349Pkn("expired_items_name")
    public final BillStarlingText expiredItemsName;

    @InterfaceC65349Pkn("expired_items_show_less")
    public final BillStarlingText expiredItemsShowLess;

    @InterfaceC65349Pkn("expired_items_show_more")
    public final BillStarlingText expiredItemsShowMore;

    @InterfaceC65349Pkn("shipping_method_title")
    public final BillStarlingText shippingMethodTitle;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BillStarling)) {
            return false;
        }
        BillStarling billStarling = (BillStarling) obj;
        return o.LJ(this.expiredItemsShowLess, billStarling.expiredItemsShowLess) && o.LJ(this.expiredItemsShowMore, billStarling.expiredItemsShowMore) && o.LJ(this.expiredItemsName, billStarling.expiredItemsName) && o.LJ(this.addDeliverAddress, billStarling.addDeliverAddress) && o.LJ(this.deliveryAddress, billStarling.deliveryAddress) && o.LJ(this.shippingMethodTitle, billStarling.shippingMethodTitle);
    }

    public final int hashCode() {
        BillStarlingText billStarlingText = this.expiredItemsShowLess;
        int hashCode = (billStarlingText == null ? 0 : billStarlingText.hashCode()) * 31;
        BillStarlingText billStarlingText2 = this.expiredItemsShowMore;
        int hashCode2 = (hashCode + (billStarlingText2 == null ? 0 : billStarlingText2.hashCode())) * 31;
        BillStarlingText billStarlingText3 = this.expiredItemsName;
        int hashCode3 = (hashCode2 + (billStarlingText3 == null ? 0 : billStarlingText3.hashCode())) * 31;
        BillStarlingText billStarlingText4 = this.addDeliverAddress;
        int hashCode4 = (hashCode3 + (billStarlingText4 == null ? 0 : billStarlingText4.hashCode())) * 31;
        BillStarlingText billStarlingText5 = this.deliveryAddress;
        int hashCode5 = (hashCode4 + (billStarlingText5 == null ? 0 : billStarlingText5.hashCode())) * 31;
        BillStarlingText billStarlingText6 = this.shippingMethodTitle;
        return hashCode5 + (billStarlingText6 != null ? billStarlingText6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BillStarling(expiredItemsShowLess=");
        LIZ.append(this.expiredItemsShowLess);
        LIZ.append(", expiredItemsShowMore=");
        LIZ.append(this.expiredItemsShowMore);
        LIZ.append(", expiredItemsName=");
        LIZ.append(this.expiredItemsName);
        LIZ.append(", addDeliverAddress=");
        LIZ.append(this.addDeliverAddress);
        LIZ.append(", deliveryAddress=");
        LIZ.append(this.deliveryAddress);
        LIZ.append(", shippingMethodTitle=");
        LIZ.append(this.shippingMethodTitle);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public BillStarling(BillStarlingText billStarlingText, BillStarlingText billStarlingText2, BillStarlingText billStarlingText3, BillStarlingText billStarlingText4, BillStarlingText billStarlingText5, BillStarlingText billStarlingText6) {
        this.expiredItemsShowLess = billStarlingText;
        this.expiredItemsShowMore = billStarlingText2;
        this.expiredItemsName = billStarlingText3;
        this.addDeliverAddress = billStarlingText4;
        this.deliveryAddress = billStarlingText5;
        this.shippingMethodTitle = billStarlingText6;
    }
}
