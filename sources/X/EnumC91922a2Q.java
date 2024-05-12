package X;

/* renamed from: X.a2Q, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public enum EnumC91922a2Q {
    SUCCESS(0),
    UNZIP_FAIL(1),
    NO_LANDING_PAGE(2),
    DETAIL_WITHOUT_BILLID(3),
    H5_WITHOUT_URL(4);

    public final int LJLIL;

    public static EnumC91922a2Q valueOf(String str) {
        return (EnumC91922a2Q) V0N.LJJJ(EnumC91922a2Q.class, str);
    }

    public final int getValue() {
        return this.LJLIL;
    }

    EnumC91922a2Q(int i) {
        this.LJLIL = i;
    }
}
