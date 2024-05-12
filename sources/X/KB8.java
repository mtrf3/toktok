package X;

/* loaded from: classes9.dex */
public enum KB8 {
    CHANNEL_SHOP("tiktok_ecom"),
    CHANNEL_MALL("tiktok_mall"),
    CHANNEL_PDP("tiktok_product_detail"),
    CHANNEL_FASHION("tiktok_fashion"),
    CHANNEL_COMMENT_TOP_ANCHOR("tiktok_product"),
    CHANNEL_FEED_BOTTOM_BAR("tiktok_product"),
    CHANNEL_VIDEO_ANCHOR("tiktok_product"),
    CHANNEL_DEFAULT("");

    public final String LJLIL;

    public static KB8 valueOf(String str) {
        return (KB8) V0N.LJJJ(KB8.class, str);
    }

    public final String getValue() {
        return this.LJLIL;
    }

    KB8(String str) {
        this.LJLIL = str;
    }
}
