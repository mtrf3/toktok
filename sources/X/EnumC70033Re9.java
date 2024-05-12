package X;

/* renamed from: X.Re9, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public enum EnumC70033Re9 {
    SHARE(1),
    CART(2),
    REPORT(3),
    ADD_TO_CART(4),
    BUY(5),
    SCHEMA(6),
    CHECKOUT(7),
    UPDATE_ADDRESS(8),
    FIND_SIMILAR(9),
    NOTIFY_ME(10),
    CHANGE_SKU_ITEM(11);

    public final int LJLIL;

    public static EnumC70033Re9 valueOf(String str) {
        return (EnumC70033Re9) V0N.LJJJ(EnumC70033Re9.class, str);
    }

    public final int getValue() {
        return this.LJLIL;
    }

    EnumC70033Re9(int i) {
        this.LJLIL = i;
    }
}
