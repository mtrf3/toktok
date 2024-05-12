package X;

/* renamed from: X.PGm, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public enum EnumC64172PGm {
    UNKNOWN,
    TOP_APP,
    FOREGROUND,
    BACKGROUND;

    public static EnumC64172PGm valueOf(int i) {
        if (i != -1) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        return UNKNOWN;
                    }
                    return BACKGROUND;
                }
                return FOREGROUND;
            }
            return TOP_APP;
        }
        return UNKNOWN;
    }

    public static EnumC64172PGm valueOf(String str) {
        return (EnumC64172PGm) V0N.LJJJ(EnumC64172PGm.class, str);
    }
}
