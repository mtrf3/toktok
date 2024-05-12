package X;

/* renamed from: X.0wA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23540wA {
    public static final /* synthetic */ int LIZIZ = 0;
    public final long LIZ;

    public static final boolean LIZ(long j, long j2) {
        return j == j2;
    }

    public final int hashCode() {
        return C16880lQ.LLJIJIL(this.LIZ);
    }

    public final String toString() {
        return LIZIZ(this.LIZ);
    }

    public /* synthetic */ C23540wA(long j) {
        this.LIZ = j;
    }

    public static String LIZIZ(long j) {
        if (LIZ(j, 0L)) {
            return "Unspecified";
        }
        if (LIZ(j, 4294967296L)) {
            return "Sp";
        }
        if (LIZ(j, 8589934592L)) {
            return "Em";
        }
        return "Invalid";
    }

    public final boolean equals(Object obj) {
        long j = this.LIZ;
        if (!(obj instanceof C23540wA) || j != ((C23540wA) obj).LIZ) {
            return false;
        }
        return true;
    }
}
