package X;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes12.dex */
public final class PG7 {
    public static final /* synthetic */ int LJIIIZ = 0;
    public volatile boolean LIZ;
    public volatile FU0 LIZIZ;
    public PG6 LIZJ;
    public PGM LIZLLL;
    public volatile boolean LJ;
    public long LJFF;
    public java.util.Map<Object, Object> LJII;
    public final PG8 LJI = new PG8(this);
    public final List<PGO> LJIIIIZZ = new CopyOnWriteArrayList();

    public final synchronized void LIZ() {
        if (!this.LJ) {
            this.LJ = true;
            if (C78248UnM.LJIIJ()) {
                C64028PAy.LIZ("APM-Memory", "start");
            }
            if (this.LIZLLL == null) {
                if (C78248UnM.LJIIJ()) {
                    C64028PAy.LIZ("APM-Memory", "scheduleCollectMemory");
                }
                this.LIZLLL = new PGM(this, this.LJFF);
                C64071PCp.LIZ(PD6.LIGHT_WEIGHT).LIZJ(this.LIZLLL);
            }
        }
    }

    public final synchronized void LIZIZ() {
        if (this.LJ) {
            this.LJ = false;
            if (C78248UnM.LJIIJ()) {
                C64028PAy.LIZ("APM-Memory", "cancelCollectMemory");
            }
            if (this.LIZLLL != null) {
                C64071PCp.LIZ(PD6.LIGHT_WEIGHT).LIZIZ(this.LIZLLL);
                this.LIZLLL = null;
            }
        }
    }

    static {
        C16880lQ.LJLLJ(PG7.class);
    }

    public final synchronized void LIZJ(PG6 pg6) {
        if (pg6 == null) {
            return;
        }
        this.LIZJ = pg6;
        if (C78248UnM.LJIIJ()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("updateConfig: ");
            LIZ.append(pg6);
            C64028PAy.LIZ("APM-Memory", X1D.LIZIZ(LIZ));
        }
        if (!pg6.LJFF) {
            LIZIZ();
            PG9 pg9 = (PG9) PGH.LIZ(PG9.class);
            if (pg9 != null) {
                pg9.LIZJ(this.LJI);
            }
            if (C78248UnM.LJIIJ()) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("isApm6SampleEnable: ");
                LIZ2.append(pg6.LJFF);
                C64028PAy.LIZ("APM-Memory", X1D.LIZIZ(LIZ2));
            }
            return;
        }
        PG9 pg92 = (PG9) PGH.LIZ(PG9.class);
        if (pg92 != null) {
            if (pg6.LIZJ) {
                pg92.LIZJ(this.LJI);
                pg92.LIZ(this.LJI);
            } else {
                pg92.LIZJ(this.LJI);
            }
        }
        long j = pg6.LIZ * 1000;
        this.LJFF = j;
        if (j < 30000) {
            if (C78248UnM.LJIIJ()) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("pollingIntervalMillis: ");
                LIZ3.append(this.LJFF);
                C64028PAy.LIZ("APM-Memory", X1D.LIZIZ(LIZ3));
            }
            this.LJFF = 30000L;
        }
        if (C78248UnM.LJIIJ()) {
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("result pollingIntervalMillis: ");
            LIZ4.append(this.LJFF);
            C64028PAy.LIZ("APM-Memory", X1D.LIZIZ(LIZ4));
        }
        PGM pgm = this.LIZLLL;
        if (pgm != null && pgm.LJLJI != this.LJFF) {
            LIZIZ();
        }
        LIZ();
        PGB pgb = (PGB) PGH.LIZ(PGB.class);
        if (pgb != null) {
            pgb.start();
        }
    }
}
