package X;

/* renamed from: X.INf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public enum EnumC46511INf {
    UNDEFINED(0),
    OFFICIAL_VERIFIED(1),
    PURCHASED(2),
    SOLD_OUT(3),
    REVIEW_RATING(4),
    ON_SALE_PRODUCT(5),
    FRE_BOUGHT_STORE(6);

    public final int LJLIL;

    public static EnumC46511INf valueOf(String str) {
        return (EnumC46511INf) V0N.LJJJ(EnumC46511INf.class, str);
    }

    public final int getType() {
        return this.LJLIL;
    }

    EnumC46511INf(int i) {
        this.LJLIL = i;
    }
}
