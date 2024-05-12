package X;

import android.os.SystemClock;
import kotlin.jvm.internal.o;

/* renamed from: X.Cse, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32712Cse {
    public final C32694CsM LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;
    public final long LJ;
    public final long LJFF;
    public final long LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32712Cse)) {
            return false;
        }
        C32712Cse c32712Cse = (C32712Cse) obj;
        return o.LJ(this.LIZ, c32712Cse.LIZ) && this.LIZIZ == c32712Cse.LIZIZ;
    }

    public final int hashCode() {
        return C16880lQ.LLJIJIL(this.LIZIZ) + (this.LIZ.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MainLoadingDuration(panelTracker=");
        LIZ.append(this.LIZ);
        LIZ.append(", clickReactDuration=");
        return C47135Ieh.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C32712Cse(C32694CsM c32694CsM, long j) {
        this.LIZ = c32694CsM;
        this.LIZIZ = j;
        C32128CjE c32128CjE = C32129CjF.LIZ;
        this.LIZJ = C32694CsM.LJJ;
        this.LIZLLL = C32694CsM.LJIL;
        this.LJ = C32710Csc.LIZ - SystemClock.elapsedRealtime();
        long j2 = C32694CsM.LJJIJIIJIL;
        long j3 = c32128CjE.LJIIJ;
        this.LJFF = j2 - j3;
        this.LJI = C32694CsM.LJJIJIL - j3;
    }
}
