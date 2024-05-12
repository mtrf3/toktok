package com.ss.android.ugc.aweme.ecommerce.showcase.service.vo;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.api.ShopCreator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class Shop {

    @InterfaceC65349Pkn("creator")
    public final ShopCreator creator;

    @InterfaceC65349Pkn("display_sold_count")
    public final String displaySoldCount;

    @InterfaceC65349Pkn("display_on_sell_product_count")
    public final String display_on_sell_product_count;

    @InterfaceC65349Pkn("store_label")
    public final StoreLabel label;

    @InterfaceC65349Pkn("logo")
    public final Image logo;

    @InterfaceC65349Pkn("is_on_holiday")
    public final Boolean onHoliday;

    @InterfaceC65349Pkn("on_sell_product_count")
    public final int onSellProductCount;

    @InterfaceC65349Pkn("rating_details")
    public final List<Object> ratingDetails;

    @InterfaceC65349Pkn("exp_rate_percentile")
    public final Integer ratingPercentile;

    @InterfaceC65349Pkn("show_rate_not_applicable")
    public final Boolean ratingShowNA;

    @InterfaceC65349Pkn("rate_display_style")
    public final Integer ratingStyle;

    @InterfaceC65349Pkn("review_count")
    public final int reviewCount;

    @InterfaceC65349Pkn("seller_id")
    public final String sellerId;

    @InterfaceC65349Pkn("shop_name")
    public final String shopName;

    @InterfaceC65349Pkn("shop_rating")
    public final String shopRating;

    @InterfaceC65349Pkn("sold_count")
    public final int soldCount;

    @InterfaceC65349Pkn("status")
    public final int status;

    public Shop(String sellerId, String shopName, int i, Image image, String str, int i2, String str2, int i3, int i4, List<Object> list, StoreLabel storeLabel, Integer num, Integer num2, Boolean bool, Boolean bool2, String str3, ShopCreator shopCreator) {
        o.LJIIIZ(sellerId, "sellerId");
        o.LJIIIZ(shopName, "shopName");
        this.sellerId = sellerId;
        this.shopName = shopName;
        this.status = i;
        this.logo = image;
        this.shopRating = str;
        this.soldCount = i2;
        this.displaySoldCount = str2;
        this.onSellProductCount = i3;
        this.reviewCount = i4;
        this.ratingDetails = list;
        this.label = storeLabel;
        this.ratingPercentile = num;
        this.ratingStyle = num2;
        this.ratingShowNA = bool;
        this.onHoliday = bool2;
        this.display_on_sell_product_count = str3;
        this.creator = shopCreator;
    }

    public /* synthetic */ Shop(String str, String str2, int i, Image image, String str3, int i2, String str4, int i3, int i4, List list, StoreLabel storeLabel, Integer num, Integer num2, Boolean bool, Boolean bool2, String str5, ShopCreator shopCreator, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i, image, str3, (i5 & 32) != 0 ? 0 : i2, str4, (i5 & 128) != 0 ? 0 : i3, (i5 & 256) != 0 ? 0 : i4, list, storeLabel, num, num2, bool, bool2, str5, shopCreator);
    }
}
