package X;

/* renamed from: X.KAx, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public enum EnumC51287KAx {
    TYPE_SHOP("shop"),
    TYPE_MALL("mall"),
    TYPE_PDP("product_detail"),
    TYPE_COMMENT_TOP_ANCHOR("comment_product_search"),
    TYPE_FEED_BOTTOM_BAR("video_product_search"),
    TYPE_ANCHOR("anchor_product"),
    TYPE_FASHION("tiktok_fashion"),
    TYPE_HALF_SHOP("half_shop"),
    TYPE_FROM_HALF_SHOP("from_half_shop");

    public final String LJLIL;

    public static EnumC51287KAx valueOf(String str) {
        return (EnumC51287KAx) V0N.LJJJ(EnumC51287KAx.class, str);
    }

    public final String getValue() {
        return this.LJLIL;
    }

    EnumC51287KAx(String str) {
        this.LJLIL = str;
    }
}
