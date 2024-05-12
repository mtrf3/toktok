package X;

/* renamed from: X.0vs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23360vs {
    public static final int[] LIZIZ = {18, 20, 17, 15};
    public static final int[] LIZJ = {65535, 262143, 32767, 8191};
    public static final int[] LIZLLL = {32767, 8191, 65535, 262143};
    public final long LIZ;

    public static final boolean LIZIZ(long j, long j2) {
        return j == j2;
    }

    public final int hashCode() {
        return C16880lQ.LLJIJIL(this.LIZ);
    }

    public final String toString() {
        return LJIIJ(this.LIZ);
    }

    public /* synthetic */ C23360vs(long j) {
        this.LIZ = j;
    }

    public static final boolean LIZJ(long j) {
        int i = (int) (3 & j);
        if ((((int) (j >> (LIZIZ[i] + 31))) & LIZLLL[i]) != 0) {
            return true;
        }
        return false;
    }

    public static final boolean LIZLLL(long j) {
        if ((((int) (j >> 33)) & LIZJ[(int) (3 & j)]) != 0) {
            return true;
        }
        return false;
    }

    public static final boolean LJ(long j) {
        if (LJI(j) == LJIIIIZZ(j)) {
            return true;
        }
        return false;
    }

    public static final boolean LJFF(long j) {
        if (LJII(j) == LJIIIZ(j)) {
            return true;
        }
        return false;
    }

    public static final int LJI(long j) {
        int i = (int) (3 & j);
        int i2 = ((int) (j >> (LIZIZ[i] + 31))) & LIZLLL[i];
        if (i2 == 0) {
            return Integer.MAX_VALUE;
        }
        return i2 - 1;
    }

    public static final int LJII(long j) {
        int i = ((int) (j >> 33)) & LIZJ[(int) (3 & j)];
        if (i == 0) {
            return Integer.MAX_VALUE;
        }
        return i - 1;
    }

    public static final int LJIIIIZZ(long j) {
        int i = (int) (3 & j);
        return ((int) (j >> LIZIZ[i])) & LIZLLL[i];
    }

    public static final int LJIIIZ(long j) {
        return ((int) (j >> 2)) & LIZJ[(int) (3 & j)];
    }

    public static String LJIIJ(long j) {
        String valueOf;
        int LJII = LJII(j);
        String str = "Infinity";
        if (LJII == Integer.MAX_VALUE) {
            valueOf = "Infinity";
        } else {
            valueOf = String.valueOf(LJII);
        }
        int LJI = LJI(j);
        if (LJI != Integer.MAX_VALUE) {
            str = String.valueOf(LJI);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Constraints(minWidth = ");
        LIZ.append(LJIIIZ(j));
        LIZ.append(", maxWidth = ");
        LIZ.append(valueOf);
        LIZ.append(", minHeight = ");
        LIZ.append(LJIIIIZZ(j));
        LIZ.append(", maxHeight = ");
        LIZ.append(str);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final boolean equals(Object obj) {
        long j = this.LIZ;
        if (!(obj instanceof C23360vs) || j != ((C23360vs) obj).LIZ) {
            return false;
        }
        return true;
    }

    public static long LIZ(long j, int i, int i2, int i3, int i4, int i5) {
        boolean z;
        if ((i5 & 1) != 0) {
            i = LJIIIZ(j);
        }
        if ((i5 & 2) != 0) {
            i2 = LJII(j);
        }
        if ((i5 & 4) != 0) {
            i3 = LJIIIIZZ(j);
        }
        if ((i5 & 8) != 0) {
            i4 = LJI(j);
        }
        if (i3 >= 0 && i >= 0) {
            if (i2 >= i || i2 == Integer.MAX_VALUE) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (i4 >= i3 || i4 == Integer.MAX_VALUE) {
                    return C23350vr.LIZIZ(i, i2, i3, i4);
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("maxHeight(");
                LIZ.append(i4);
                LIZ.append(") must be >= minHeight(");
                LIZ.append(i3);
                LIZ.append(')');
                String LIZIZ2 = X1D.LIZIZ(LIZ);
                LIZIZ2.toString();
                throw new IllegalArgumentException(LIZIZ2);
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("maxWidth(");
            LIZ2.append(i2);
            LIZ2.append(") must be >= minWidth(");
            LIZ2.append(i);
            LIZ2.append(')');
            String LIZIZ3 = X1D.LIZIZ(LIZ2);
            LIZIZ3.toString();
            throw new IllegalArgumentException(LIZIZ3);
        }
        String LJIIJJI = C48690J9a.LJIIJJI("minHeight(", i3, ") and minWidth(", i, ") must be >= 0");
        LJIIJJI.toString();
        throw new IllegalArgumentException(LJIIJJI);
    }
}
