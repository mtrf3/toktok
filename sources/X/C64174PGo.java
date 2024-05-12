package X;

import Y.ARunnableS17S0110000_11;
import com.bytedance.monitor.collector.MonitorJni;

/* renamed from: X.PGo, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64174PGo implements PHH {
    public long LJLIL;
    public long LJLILLLLZI;
    public volatile boolean LJLJI;

    @Override // X.PHH
    public final long LJFF() {
        return 0L;
    }

    @Override // X.PHH
    public final long LJIILL() {
        return 0L;
    }

    @Override // X.PHH
    public final long LJIILLIIL() {
        return 0L;
    }

    @Override // X.PHH
    public final long LJJIIJZLJL() {
        return 0L;
    }

    @Override // X.PHH
    public final long LJJL() {
        return 0L;
    }

    @Override // X.PHH
    public final long LIZJ() {
        LIZ(this.LJLJI);
        return this.LJLILLLLZI + this.LJLIL;
    }

    @Override // X.PHH
    public final long LJJI() {
        return LIZJ() + 0;
    }

    @Override // X.PHH
    public final void init() {
        LIZ(this.LJLJI);
    }

    public final void LIZ(boolean z) {
        long fetchTrafficStats;
        if (C64125PEr.LJIIJJI) {
            try {
                boolean LIZ = C64102PDu.LIZ(512);
                if (C64102PDu.LIZ(256) || LIZ) {
                    fetchTrafficStats = MonitorJni.fetchTrafficStats(true);
                } else {
                    fetchTrafficStats = 0;
                }
                if (!z) {
                    this.LJLIL += fetchTrafficStats;
                } else {
                    this.LJLILLLLZI += fetchTrafficStats;
                }
            } catch (Exception e) {
                if (!C09970aH.LJII()) {
                    C78983UzD.LJIJ(e, "apm_traffic");
                    return;
                }
                throw e;
            }
        }
    }

    @Override // X.PHH
    public final void LIZIZ(boolean z) {
        F9U.LIZ.LIZJ(new ARunnableS17S0110000_11(this, z, 8));
    }
}
