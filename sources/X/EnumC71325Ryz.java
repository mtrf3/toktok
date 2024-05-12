package X;

/* renamed from: X.Ryz, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public enum EnumC71325Ryz {
    ProductStatusOnSales(90),
    ProductStatusStock(80),
    ProductStatusDown(70),
    ProductStatusReviewFailed(40),
    ProductStatusUnderReview(30),
    ProductStatusReUnderReview(75);

    public final int LJLIL;

    public static EnumC71325Ryz valueOf(String str) {
        return (EnumC71325Ryz) V0N.LJJJ(EnumC71325Ryz.class, str);
    }

    public final int getValue() {
        return this.LJLIL;
    }

    EnumC71325Ryz(int i) {
        this.LJLIL = i;
    }
}
