package X;

/* renamed from: X.aUm, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public enum EnumC93680aUm {
    USER_CANCELLED(0),
    NO_SUBSCRIPTION(1),
    SUBSCRIPTION_EXPIRED(2),
    TOKEN_FETCH_ERROR(3),
    UNKNOWN(4);

    public final int LJLIL;

    public int getErrorCode() {
        return this.LJLIL;
    }

    public static EnumC93680aUm getErrorFromValue(int i) {
        for (EnumC93680aUm enumC93680aUm : values()) {
            if (enumC93680aUm.getErrorCode() == i) {
                return enumC93680aUm;
            }
        }
        return UNKNOWN;
    }

    public static EnumC93680aUm valueOf(String str) {
        return (EnumC93680aUm) V0N.LJJJ(EnumC93680aUm.class, str);
    }

    EnumC93680aUm(int i) {
        this.LJLIL = i;
    }
}
