package X;

/* renamed from: X.AuL, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public enum EnumC27721AuL {
    HEADER(101),
    REVIEW(102),
    DESCRIPTION(103),
    RECOMMENDATION(104),
    SKU(105),
    LOGISTICS_INFO(106),
    RETURN_POLICY(107),
    SELLER_INFO(108),
    PRODUCT_INFO(109),
    PRODUCT_MORE_FROM_SAME_SELLER(110),
    BUY_TOGETHER(111),
    BLANK(999),
    UNSET(-1);

    public final int LJLIL;

    public static EnumC27721AuL valueOf(String str) {
        return (EnumC27721AuL) V0N.LJJJ(EnumC27721AuL.class, str);
    }

    public final int getValue() {
        return this.LJLIL;
    }

    EnumC27721AuL(int i) {
        this.LJLIL = i;
    }
}
