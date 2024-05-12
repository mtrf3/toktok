package X;

/* loaded from: classes9.dex */
public enum KB5 {
    SOURCE_MALL_MIDDLE("mall_middle_page"),
    SOURCE_PDP_MIDDLE("product_detail_middle_page"),
    SOURCE_COMMENT_TOP_ANCHOR_MIDDLE("comment_product_middle_page"),
    SOURCE_FEED_BOTTOM_BAR_MIDDLE("video_product_middle_page"),
    SOURCE_ANCHOR_MIDDLE("anchor_product_middle_page"),
    SOURCE_FROM_HALF_SHOP("mall_middle_page"),
    SOURCE_FROM_AFTER_SALE("after_sale_middle_page");

    public final String LJLIL;

    public static KB5 valueOf(String str) {
        return (KB5) V0N.LJJJ(KB5.class, str);
    }

    public final String getValue() {
        return this.LJLIL;
    }

    KB5(String str) {
        this.LJLIL = str;
    }
}
