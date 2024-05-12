package X;

import java.util.LinkedHashMap;

/* renamed from: X.KAq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public enum EnumC51280KAq {
    DEFAULT(-100),
    TEST(100),
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
    ORDER_CENTER_WITH_SUGGEST_LIKE(112),
    ORDER_DETAIL_WITH_SUGGEST_LIKE(113),
    PAY_SUCCESS_WITH_SUGGEST_LIKE(115),
    DELIVERY_DETAIL_WITH_SUGGEST_LIKE(116),
    PDP_FIND_SIMILAR(117);

    public static final KCR Companion = new KCR();
    public static final java.util.Map<Integer, EnumC51280KAq> MAP;
    public final int LJLIL;

    public static EnumC51280KAq valueOf(String str) {
        return (EnumC51280KAq) V0N.LJJJ(EnumC51280KAq.class, str);
    }

    static {
        EnumC51280KAq[] values = values();
        int LJJIIZ = C51029K0z.LJJIIZ(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(LJJIIZ < 16 ? 16 : LJJIIZ);
        for (EnumC51280KAq enumC51280KAq : values) {
            linkedHashMap.put(Integer.valueOf(enumC51280KAq.LJLIL), enumC51280KAq);
        }
        MAP = linkedHashMap;
    }

    public final int getValue() {
        return this.LJLIL;
    }

    EnumC51280KAq(int i) {
        this.LJLIL = i;
    }
}
