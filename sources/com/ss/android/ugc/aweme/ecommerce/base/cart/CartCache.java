package com.ss.android.ugc.aweme.ecommerce.base.cart;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class CartCache {

    @InterfaceC65349Pkn("shop_cards")
    public final List<ShopCard> shopCards;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CartCache copy$default(CartCache cartCache, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = cartCache.shopCards;
        }
        return cartCache.copy(list);
    }

    public final CartCache copy(List<ShopCard> list) {
        return new CartCache(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CartCache) && o.LJ(this.shopCards, ((CartCache) obj).shopCards);
    }

    public int hashCode() {
        List<ShopCard> list = this.shopCards;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CartCache(shopCards=");
        return C1NE.LIZIZ(LIZ, this.shopCards, ')', LIZ);
    }

    public final List<ShopCard> getShopCards() {
        return this.shopCards;
    }

    public CartCache(List<ShopCard> list) {
        this.shopCards = list;
    }
}
