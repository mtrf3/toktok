package X;

/* loaded from: classes9.dex */
public enum KB7 {
    CHANNEL_SHOP("tiktok_ecom"),
    CHANNEL_MALL("tiktok_mall"),
    CHANNEL_PDP("tiktok_product_detail"),
    CHANNEL_FASHION("tiktok_fashion"),
    CHANNEL_COMMENT_TOP_ANCHOR("tiktok_product"),
    CHANNEL_FEED_BOTTOM_BAR("tiktok_product"),
    CHANNEL_VIDEO_ANCHOR("tiktok_product"),
    CHANNEL_HALF_SHOP("mall_seven_half_page"),
    CHANNEL_FROM_HALF_SHOP("tiktok_mall");

    public final String LJLIL;

    public static KB7 valueOf(String str) {
        return (KB7) V0N.LJJJ(KB7.class, str);
    }

    public final String getValue() {
        return this.LJLIL;
    }

    KB7(String str) {
        this.LJLIL = str;
    }
}
