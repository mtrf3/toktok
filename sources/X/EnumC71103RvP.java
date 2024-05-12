package X;

/* renamed from: X.RvP, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public enum EnumC71103RvP {
    PRODUCT_STATUS_ON_SALES(90),
    PRODUCT_STATUS_STOCK(80),
    PRODUCT_STATUS_DOWN(70),
    PRODUCT_STATUS_REVIEW_FAILED(40),
    PRODUCT_STATUS_UNDER_REVIEW(30),
    PRODUCT_STATUS_RE_UNDER_REVIEW(75);

    public final int LJLIL;

    public static EnumC71103RvP valueOf(String str) {
        return (EnumC71103RvP) V0N.LJJJ(EnumC71103RvP.class, str);
    }

    public final int getValue() {
        return this.LJLIL;
    }

    EnumC71103RvP(int i) {
        this.LJLIL = i;
    }
}
