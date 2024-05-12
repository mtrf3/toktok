package X;

/* renamed from: X.KAy, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public enum EnumC51288KAy {
    SOURCE_SHOP("shop"),
    SOURCE_MALL("mall"),
    SOURCE_PDP("product_detail"),
    SOURCE_FASHION("tiktok_fashion"),
    SOURCE_COMMENT_TOP_ANCHOR("comment_product_search"),
    SOURCE_FEED_BOTTOM_BAR("video_product_search"),
    SOURCE_ANCHOR_PRODUCT("anchor_product"),
    SOURCE_HALF_SHOP("feed_mall_button"),
    SOURCE_FROM_HALF_SHOP("mall");

    public final String LJLIL;

    public static EnumC51288KAy valueOf(String str) {
        return (EnumC51288KAy) V0N.LJJJ(EnumC51288KAy.class, str);
    }

    public final String getValue() {
        return this.LJLIL;
    }

    EnumC51288KAy(String str) {
        this.LJLIL = str;
    }
}
