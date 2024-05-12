package X;

/* renamed from: X.a5R, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public enum EnumC92109a5R {
    UNKNOWN(0),
    SUCCESS(1),
    FAILED(2),
    CANCELED(3),
    PENDING(4),
    API_ERROR(5),
    INIT(6),
    CLOSE_IN_STORE(7),
    CLOSE_IN_PAY(8),
    INNER_EXCEPTION(-2);

    public final int LJLIL;

    public static EnumC92109a5R valueOf(String str) {
        return (EnumC92109a5R) V0N.LJJJ(EnumC92109a5R.class, str);
    }

    public final int getValue() {
        return this.LJLIL;
    }

    EnumC92109a5R(int i) {
        this.LJLIL = i;
    }
}
