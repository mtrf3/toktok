package X;

/* renamed from: X.KAr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public enum EnumC51281KAr {
    DEFAULT(-100),
    MALL(8),
    PDP(9),
    HOMEPAGE_MALL(101),
    MALL_UG_DEEPLINK(102),
    FASHION(103),
    VIDEO_ANCHOR(104),
    COMMENT_TOP_ANCHOR(105),
    FEED_BOTTOM_BAR(106),
    FLASH_SALE(107),
    BRAND_BUDGET(108),
    ORDER(109),
    HALF_SHOP(110),
    FROM_HALF_SHOP(111),
    TEST(100),
    ORDER_CENTER_WITH_SUGGEST_LIKE(112),
    ORDER_DETAIL_WITH_SUGGEST_LIKE(113),
    PAY_SUCCESS_WITH_SUGGEST_LIKE(115),
    DELIVERY_DETAIL_WITH_SUGGEST_LIKE(116);

    public static final C51282KAs Companion = new C51282KAs();
    public final int LJLIL;

    public static EnumC51281KAr valueOf(String str) {
        return (EnumC51281KAr) V0N.LJJJ(EnumC51281KAr.class, str);
    }

    public final int getValue() {
        return this.LJLIL;
    }

    EnumC51281KAr(int i) {
        this.LJLIL = i;
    }
}
