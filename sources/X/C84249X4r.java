package X;

import java.util.ArrayList;

/* renamed from: X.X4r, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public class C84249X4r implements PS3 {
    public int LIZ;
    public final /* synthetic */ X4U LIZIZ;

    @Override // X.PS3
    public final long LIZ() {
        if (this.LIZIZ.LJFF || this.LIZIZ.LJI) {
            return -1L;
        }
        synchronized (this.LIZIZ) {
            X4U x4u = this.LIZIZ;
            if (x4u.LJIIIZ != null || x4u.LJIIJ != null) {
                return -1L;
            }
            long j = x4u.LJIJJLI;
            if (j <= 0) {
                return -1L;
            }
            this.LIZ++;
            X4T LJIIL = x4u.LJIIL(System.currentTimeMillis(), j, false);
            if (LJIIL != null) {
                if (C65210PiY.LIZ()) {
                    C65210PiY.LIZLLL(this.LIZIZ.LIZ.getId(), "SegmentDispatcher", "onScheduleWatch", "connectWatcher: switchUrl and reconnect");
                }
                this.LIZIZ.LJJIIZI(LJIIL);
                LJIIL.LJIIJ(false);
                return ((this.LIZ / ((ArrayList) this.LIZIZ.LJIIIIZZ).size()) + 1) * j;
            }
            return j;
        }
    }

    public C84249X4r(X4U x4u) {
        this.LIZIZ = x4u;
    }
}
