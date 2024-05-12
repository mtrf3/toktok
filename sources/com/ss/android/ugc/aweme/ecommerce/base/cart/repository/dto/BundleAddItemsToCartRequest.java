package com.ss.android.ugc.aweme.ecommerce.base.cart.repository.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class BundleAddItemsToCartRequest {

    @InterfaceC65349Pkn("add_item_source_page")
    public final Integer addItemSourcePage;

    @InterfaceC65349Pkn("aggregation_count")
    public final Integer aggregationCount;

    @InterfaceC65349Pkn("bundle_id")
    public final String bundleId;

    @InterfaceC65349Pkn("cart_item_data")
    public final List<AddItemToCartRequest> items;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BundleAddItemsToCartRequest)) {
            return false;
        }
        BundleAddItemsToCartRequest bundleAddItemsToCartRequest = (BundleAddItemsToCartRequest) obj;
        return o.LJ(this.items, bundleAddItemsToCartRequest.items) && o.LJ(this.bundleId, bundleAddItemsToCartRequest.bundleId) && o.LJ(this.aggregationCount, bundleAddItemsToCartRequest.aggregationCount) && o.LJ(this.addItemSourcePage, bundleAddItemsToCartRequest.addItemSourcePage);
    }

    public final int hashCode() {
        List<AddItemToCartRequest> list = this.items;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.bundleId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.aggregationCount;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.addItemSourcePage;
        return hashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BundleAddItemsToCartRequest(items=");
        LIZ.append(this.items);
        LIZ.append(", bundleId=");
        LIZ.append(this.bundleId);
        LIZ.append(", aggregationCount=");
        LIZ.append(this.aggregationCount);
        LIZ.append(", addItemSourcePage=");
        return s0.LIZJ(LIZ, this.addItemSourcePage, ')', LIZ);
    }

    public BundleAddItemsToCartRequest(List<AddItemToCartRequest> list, String str, Integer num, Integer num2) {
        this.items = list;
        this.bundleId = str;
        this.aggregationCount = num;
        this.addItemSourcePage = num2;
    }

    public /* synthetic */ BundleAddItemsToCartRequest(List list, String str, Integer num, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? 1 : num, (i & 8) != 0 ? null : num2);
    }
}
