package X;

/* renamed from: X.Avh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public enum EnumC27805Avh {
    DEFAULT(0),
    USER_ADDRESS(1),
    SKU_QUANTITY(2),
    LOGISTICS(3),
    ADD_NEW_PAYMENT(4),
    SELECT_VOUCHER(5),
    ADDON_PRODUCT(6),
    USE_BONUS(7);

    public final int LJLIL;

    public static EnumC27805Avh valueOf(String str) {
        return (EnumC27805Avh) V0N.LJJJ(EnumC27805Avh.class, str);
    }

    public final int getValue() {
        return this.LJLIL;
    }

    EnumC27805Avh(int i) {
        this.LJLIL = i;
    }
}
