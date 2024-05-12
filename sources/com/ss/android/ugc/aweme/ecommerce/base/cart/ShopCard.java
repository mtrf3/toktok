package com.ss.android.ugc.aweme.ecommerce.base.cart;

import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ShopCard {

    @InterfaceC65349Pkn("items")
    public final List<Item> items;

    @InterfaceC65349Pkn("seller")
    public final Seller seller;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ShopCard copy$default(ShopCard shopCard, List list, Seller seller, int i, Object obj) {
        if ((i & 1) != 0) {
            list = shopCard.items;
        }
        if ((i & 2) != 0) {
            seller = shopCard.seller;
        }
        return shopCard.copy(list, seller);
    }

    public final ShopCard copy(List<Item> list, Seller seller) {
        return new ShopCard(list, seller);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShopCard)) {
            return false;
        }
        ShopCard shopCard = (ShopCard) obj;
        return o.LJ(this.items, shopCard.items) && o.LJ(this.seller, shopCard.seller);
    }

    public int hashCode() {
        List<Item> list = this.items;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Seller seller = this.seller;
        return hashCode + (seller != null ? seller.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ShopCard(items=");
        LIZ.append(this.items);
        LIZ.append(", seller=");
        LIZ.append(this.seller);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final List<Item> getItems() {
        return this.items;
    }

    public final Seller getSeller() {
        return this.seller;
    }

    public ShopCard(List<Item> list, Seller seller) {
        this.items = list;
        this.seller = seller;
    }
}
