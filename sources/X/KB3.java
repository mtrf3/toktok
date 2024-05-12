package X;

/* loaded from: classes9.dex */
public enum KB3 {
    SOURCE_SHOP("shop"),
    SOURCE_PDP("product_detail"),
    SOURCE_COMMENT_PRODUCT_ANCHOR("comment_product_search"),
    SOURCE_FEED_BOTTOM_BAR("video_product_search"),
    SOURCE_ANCHOR("anchor_product"),
    SOURCE_DEFAULT("");

    public final String LJLIL;

    public static KB3 valueOf(String str) {
        return (KB3) V0N.LJJJ(KB3.class, str);
    }

    public final String getValue() {
        return this.LJLIL;
    }

    KB3(String str) {
        this.LJLIL = str;
    }
}
