package X;

/* renamed from: X.KAz, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public enum EnumC51289KAz {
    SOURCE_SHOP("shop"),
    SOURCE_PDP("product_detail"),
    SOURCE_COMMENT_PRODUCT_ANCHOR("comment_product_search"),
    SOURCE_FEED_BOTTOM_BAR("video_product_search"),
    SOURCE_ANCHOR("anchor_product"),
    SOURCE_FROM_HALF_SHOP("shop"),
    SOURCE_FROM_AFTER_SALE("after_sale");

    public final String LJLIL;

    public static EnumC51289KAz valueOf(String str) {
        return (EnumC51289KAz) V0N.LJJJ(EnumC51289KAz.class, str);
    }

    public final String getValue() {
        return this.LJLIL;
    }

    EnumC51289KAz(String str) {
        this.LJLIL = str;
    }
}
