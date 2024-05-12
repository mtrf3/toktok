package X;

/* renamed from: X.0lG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16780lG {
    public static int LIZ(int i) {
        if (i != 1) {
            if (i == 2) {
                return 1;
            }
            if (i == 4) {
                return 2;
            }
            if (i != 8) {
                if (i == 16) {
                    return 4;
                }
                if (i != 32) {
                    if (i != 64) {
                        if (i != 128) {
                            if (i == 256) {
                                return 8;
                            }
                            throw new IllegalArgumentException(KMP.LJ("type needs to be >= FIRST and <= LAST, type=", i));
                        }
                        return 7;
                    }
                    return 6;
                }
                return 5;
            }
            return 3;
        }
        return 0;
    }
}
