package com.ss.android.ugc.aweme.ecommerce.showcase.service.vo;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class GetCreatorShopInfoData {

    @InterfaceC65349Pkn("creator_role")
    public final int creatorRole;

    @InterfaceC65349Pkn("entrance_pattern")
    public final int entrancePattern;

    @InterfaceC65349Pkn("shop")
    public final Shop shop;

    @InterfaceC65349Pkn("shop_link")
    public final String shopLink;

    public GetCreatorShopInfoData(String shopLink, Shop shop, int i, int i2) {
        o.LJIIIZ(shopLink, "shopLink");
        this.shopLink = shopLink;
        this.shop = shop;
        this.creatorRole = i;
        this.entrancePattern = i2;
    }

    public /* synthetic */ GetCreatorShopInfoData(String str, Shop shop, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, shop, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 1 : i2);
    }
}
