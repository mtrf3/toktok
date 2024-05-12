package X;

/* loaded from: classes9.dex */
public enum KB0 {
    TYPE_SHOP("shop"),
    TYPE_MALL("mall"),
    TYPE_PDP("product_detail"),
    TYPE_COMMENT_TOP_ANCHOR("comment_product_search"),
    TYPE_FEED_BOTTOM_BAR("video_product_search"),
    TYPE_ANCHOR("anchor_product"),
    TYPE_FASHION("tiktok_fashion"),
    TYPE_DEFAULT("");

    public final String LJLIL;

    public static KB0 valueOf(String str) {
        return (KB0) V0N.LJJJ(KB0.class, str);
    }

    public final String getValue() {
        return this.LJLIL;
    }

    KB0(String str) {
        this.LJLIL = str;
    }
}
