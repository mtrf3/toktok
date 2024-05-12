package X;

import java.util.Arrays;

/* renamed from: X.PrG, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65750PrG {
    public final long LIZ = 0;
    public final long LIZIZ = 0;
    public final long LIZJ = 0;
    public final long LIZLLL = 0;
    public final long LJ = 0;
    public final long LJFF = 0;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.LIZ), Long.valueOf(this.LIZIZ), Long.valueOf(this.LIZJ), Long.valueOf(this.LIZLLL), Long.valueOf(this.LJ), Long.valueOf(this.LJFF)});
    }

    public final String toString() {
        C65752PrI LIZIZ = C65749PrF.LIZIZ(this);
        LIZIZ.LIZ(this.LIZ, "hitCount");
        LIZIZ.LIZ(this.LIZIZ, "missCount");
        LIZIZ.LIZ(this.LIZJ, "loadSuccessCount");
        LIZIZ.LIZ(this.LIZLLL, "loadExceptionCount");
        LIZIZ.LIZ(this.LJ, "totalLoadTime");
        LIZIZ.LIZ(this.LJFF, "evictionCount");
        return LIZIZ.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C65750PrG)) {
            return false;
        }
        C65750PrG c65750PrG = (C65750PrG) obj;
        if (this.LIZ != c65750PrG.LIZ || this.LIZIZ != c65750PrG.LIZIZ || this.LIZJ != c65750PrG.LIZJ || this.LIZLLL != c65750PrG.LIZLLL || this.LJ != c65750PrG.LJ || this.LJFF != c65750PrG.LJFF) {
            return false;
        }
        return true;
    }
}
