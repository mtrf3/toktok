package com.ss.android.ugc.aweme.ecommerce.showcase.service.api;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.CartEntry;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.Shop;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class GetShopHomepageData {

    @InterfaceC65349Pkn("background")
    public final ShopBackground background;

    @InterfaceC65349Pkn("cart_entry")
    public final CartEntry cartEntry;

    @InterfaceC65349Pkn("ecommerce_center_schema")
    public final String ecommerceCenterSchema;

    @InterfaceC65349Pkn("im_pigeon_schema")
    public final String imPigeonSchema;

    @InterfaceC65349Pkn("live_info")
    public final ShopLiveInfo liveInfo;

    @InterfaceC65349Pkn("unread_message_count")
    public final Integer messageCount;

    @InterfaceC65349Pkn("shop")
    public final Shop shop;

    public GetShopHomepageData(Shop shop, ShopBackground shopBackground, ShopLiveInfo shopLiveInfo, String str, String str2, CartEntry cartEntry, Integer num) {
        o.LJIIIZ(shop, "shop");
        this.shop = shop;
        this.background = shopBackground;
        this.liveInfo = shopLiveInfo;
        this.imPigeonSchema = str;
        this.ecommerceCenterSchema = str2;
        this.cartEntry = cartEntry;
        this.messageCount = num;
    }
}
