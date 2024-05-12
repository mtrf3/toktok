package X;

/* loaded from: classes9.dex */
public enum KB2 {
    SOURCE_SHOP("shop"),
    SOURCE_MALL("mall"),
    SOURCE_PDP("product_detail"),
    SOURCE_FASHION("tiktok_fashion"),
    SOURCE_COMMENT_TOP_ANCHOR("comment_product_search"),
    SOURCE_FEED_BOTTOM_BAR("video_product_search"),
    SOURCE_ANCHOR_PRODUCT("anchor_product"),
    SOURCE_DEFAULT("");

    public final String LJLIL;

    public static KB2 valueOf(String str) {
        return (KB2) V0N.LJJJ(KB2.class, str);
    }

    public final String getValue() {
        return this.LJLIL;
    }

    KB2(String str) {
        this.LJLIL = str;
    }
}
