package X;

/* renamed from: X.0vr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23350vr {
    public static int LIZ(int i) {
        if (i < 8191) {
            return 13;
        }
        if (i < 32767) {
            return 15;
        }
        if (i < 65535) {
            return 16;
        }
        if (i < 262143) {
            return 18;
        }
        throw new IllegalArgumentException(C0NY.LIZIZ("Can't represent a size of ", i, " in Constraints"));
    }

    public static long LIZJ(int i) {
        if (i >= 0) {
            return LIZIZ(0, Integer.MAX_VALUE, i, i);
        }
        String LIZIZ = C0NY.LIZIZ("height(", i, ") must be >= 0");
        LIZIZ.toString();
        throw new IllegalArgumentException(LIZIZ);
    }

    public static long LIZLLL(int i) {
        if (i >= 0) {
            return LIZIZ(i, i, 0, Integer.MAX_VALUE);
        }
        String LIZIZ = C0NY.LIZIZ("width(", i, ") must be >= 0");
        LIZIZ.toString();
        throw new IllegalArgumentException(LIZIZ);
    }

    public static long LIZIZ(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        long j;
        int i7;
        if (i4 == Integer.MAX_VALUE) {
            i5 = i3;
        } else {
            i5 = i4;
        }
        int LIZ = LIZ(i5);
        if (i2 == Integer.MAX_VALUE) {
            i6 = i;
        } else {
            i6 = i2;
        }
        int LIZ2 = LIZ(i6);
        if (LIZ + LIZ2 <= 31) {
            if (LIZ2 != 13) {
                if (LIZ2 != 18) {
                    if (LIZ2 != 15) {
                        if (LIZ2 == 16) {
                            j = 0;
                        } else {
                            throw new IllegalStateException("Should only have the provided constants.");
                        }
                    } else {
                        j = 2;
                    }
                } else {
                    j = 1;
                }
            } else {
                j = 3;
            }
            int i8 = 0;
            if (i2 == Integer.MAX_VALUE) {
                i7 = 0;
            } else {
                i7 = i2 + 1;
            }
            if (i4 != Integer.MAX_VALUE) {
                i8 = i4 + 1;
            }
            int i9 = C23360vs.LIZIZ[(int) j];
            return (i7 << 33) | j | (i << 2) | (i3 << i9) | (i8 << (i9 + 31));
        }
        throw new IllegalArgumentException(C48690J9a.LJIIJJI("Can't represent a width of ", i6, " and height of ", i5, " in Constraints"));
    }
}
