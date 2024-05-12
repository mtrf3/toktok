package X;

/* renamed from: X.Az3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public enum EnumC28013Az3 {
    UNKNOWN(0),
    AVAILABLE(1),
    UNAVAILABLE_SHOP_CLOSE(2),
    UNAVAILABLE_SHIPPING_UNREACHABLE(3),
    UNAVAILABLE_WAREHOUSE_UNREACHABLE(4),
    UNAVAILABLE_OVERWEIGHT(5);

    public final int LJLIL;

    public static EnumC28013Az3 valueOf(String str) {
        return (EnumC28013Az3) V0N.LJJJ(EnumC28013Az3.class, str);
    }

    public final int getValue() {
        return this.LJLIL;
    }

    EnumC28013Az3(int i) {
        this.LJLIL = i;
    }
}
