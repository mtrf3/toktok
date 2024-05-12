package com.ss.android.ugc.aweme.ecommerce.base.cart.repository.dto;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.CartEntry;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class BundleAddItemsToCartData {

    @InterfaceC65349Pkn("madd_item_results")
    public final List<AddItemResult> addItemResults;

    @InterfaceC65349Pkn("cart_entry")
    public final CartEntry cartEntry;

    @InterfaceC65349Pkn("exception_ux")
    public final ExceptionUX exceptionUX;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BundleAddItemsToCartData)) {
            return false;
        }
        BundleAddItemsToCartData bundleAddItemsToCartData = (BundleAddItemsToCartData) obj;
        return o.LJ(this.exceptionUX, bundleAddItemsToCartData.exceptionUX) && o.LJ(this.cartEntry, bundleAddItemsToCartData.cartEntry) && o.LJ(this.addItemResults, bundleAddItemsToCartData.addItemResults);
    }

    public final int hashCode() {
        ExceptionUX exceptionUX = this.exceptionUX;
        int hashCode = (exceptionUX == null ? 0 : exceptionUX.hashCode()) * 31;
        CartEntry cartEntry = this.cartEntry;
        int hashCode2 = (hashCode + (cartEntry == null ? 0 : cartEntry.hashCode())) * 31;
        List<AddItemResult> list = this.addItemResults;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BundleAddItemsToCartData(exceptionUX=");
        LIZ.append(this.exceptionUX);
        LIZ.append(", cartEntry=");
        LIZ.append(this.cartEntry);
        LIZ.append(", addItemResults=");
        return C1NE.LIZIZ(LIZ, this.addItemResults, ')', LIZ);
    }

    public BundleAddItemsToCartData(ExceptionUX exceptionUX, CartEntry cartEntry, List<AddItemResult> list) {
        this.exceptionUX = exceptionUX;
        this.cartEntry = cartEntry;
        this.addItemResults = list;
    }
}
