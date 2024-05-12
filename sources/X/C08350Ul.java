package X;

/* renamed from: X.0Ul, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C08350Ul {
    public static final long LIZIZ = C17N.LIZLLL(0, 0);
    public static final /* synthetic */ int LIZJ = 0;
    public final long LIZ;

    public static final boolean LIZ(long j, long j2) {
        return j == j2;
    }

    public static final int LIZJ(long j) {
        return (int) (j & 4294967295L);
    }

    public final int hashCode() {
        return C16880lQ.LLJIJIL(this.LIZ);
    }

    public final String toString() {
        return LJI(this.LIZ);
    }

    public /* synthetic */ C08350Ul(long j) {
        this.LIZ = j;
    }

    public static final boolean LIZIZ(long j) {
        if (((int) (j >> 32)) == LIZJ(j)) {
            return true;
        }
        return false;
    }

    public static final int LIZLLL(long j) {
        int i = (int) (j >> 32);
        if (i > LIZJ(j)) {
            return i;
        }
        return LIZJ(j);
    }

    public static final int LJ(long j) {
        int i = (int) (j >> 32);
        if (i > LIZJ(j)) {
            return LIZJ(j);
        }
        return i;
    }

    public static final boolean LJFF(long j) {
        if (((int) (j >> 32)) > LIZJ(j)) {
            return true;
        }
        return false;
    }

    public static String LJI(long j) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TextRange(");
        LIZ.append((int) (j >> 32));
        LIZ.append(", ");
        LIZ.append(LIZJ(j));
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final boolean equals(Object obj) {
        long j = this.LIZ;
        if (!(obj instanceof C08350Ul) || j != ((C08350Ul) obj).LIZ) {
            return false;
        }
        return true;
    }
}
