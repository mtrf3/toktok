package X;

import Y.ARunnableS15S0100100_11;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes12.dex */
public abstract class PIF implements PIU {
    public final PIE LIZ;
    public long LIZIZ;
    public long LIZJ;

    @Override // X.PIU
    public void cancel() {
        LJI(this.LIZJ);
        PIE pie = this.LIZ;
        synchronized (pie) {
            if (!pie.LJII && pie.LJI) {
                PIB pib = pie.LJ;
                pib.LJI.set(true);
                ((CopyOnWriteArrayList) pib.LJ).clear();
                ((CopyOnWriteArrayList) pib.LJFF).clear();
                pie.LJ = null;
                pie.LJII = true;
            }
        }
    }

    public PIF(PIE pie) {
        this.LIZ = pie;
    }

    public static void LJI(long j) {
        if (!C09970aH.LJII() || C16880lQ.LLLLIIIILLL().getId() == j) {
        } else {
            throw new IllegalStateException("ITracingWrapper start() should invoke in same thread as end()");
        }
    }

    @Override // X.PIU
    public void LIZ(long j) {
        LJI(this.LIZJ);
        PIE pie = this.LIZ;
        synchronized (pie) {
            if (!pie.LJII && pie.LJI) {
                F9U.LIZ.LIZJ(new ARunnableS15S0100100_11(j, pie, 0));
                pie.LJII = true;
            }
        }
    }

    @Override // X.PIU
    public void LIZIZ(long j) {
        long id = C16880lQ.LLLLIIIILLL().getId();
        this.LIZIZ = id;
        this.LIZJ = id;
        this.LIZ.LIZIZ(j);
    }
}
