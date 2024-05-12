package X;

/* renamed from: X.a5M, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public enum EnumC92104a5M {
    UNKNOWN(0),
    SUCCESS(1),
    FAILED(2),
    CANCELED(3),
    PENDING(4),
    API_ERROR(5),
    INIT(6),
    FAILED_TO_APP(7),
    PAYMENT_METHOD_NOT_FOUND(8),
    PAYMENT_METHOD_NOT_SET(9),
    INNER_EXCEPTION(-2);

    public final int LJLIL;

    public static EnumC92104a5M valueOf(String str) {
        return (EnumC92104a5M) V0N.LJJJ(EnumC92104a5M.class, str);
    }

    public final int getValue() {
        return this.LJLIL;
    }

    EnumC92104a5M(int i) {
        this.LJLIL = i;
    }
}
