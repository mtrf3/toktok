package X;

/* loaded from: classes9.dex */
public enum KB4 {
    SOURCE_MALL_MIDDLE("mall_middle_page"),
    SOURCE_MALL("mall"),
    SOURCE_PDP_MIDDLE("product_detail_middle_page"),
    SOURCE_PDP("product_detail"),
    SOURCE_COMMENT_TOP_ANCHOR_MIDDLE("comment_product_middle_page"),
    SOURCE_FEED_BOTTOM_BAR_MIDDLE("video_product_middle_page"),
    SOURCE_ANCHOR_MIDDLE("anchor_product_middle_page"),
    SOURCE_ANCHOR("anchor_product"),
    SOURCE_DEFAULT("");

    public final String LJLIL;

    public static KB4 valueOf(String str) {
        return (KB4) V0N.LJJJ(KB4.class, str);
    }

    public final String getValue() {
        return this.LJLIL;
    }

    KB4(String str) {
        this.LJLIL = str;
    }
}
