package X;

import android.os.Bundle;
import android.os.SystemClock;

/* renamed from: X.Qns, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68088Qns {
    public long LIZ;
    public long LIZIZ;
    public final C68115QoJ LIZJ;
    public final /* synthetic */ C68110QoE LIZLLL;

    public C68088Qns(C68110QoE c68110QoE) {
        this.LIZLLL = c68110QoE;
        this.LIZJ = new C68115QoJ(this, c68110QoE.LIZ);
        c68110QoE.LIZ.LJIILIIL.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.LIZ = elapsedRealtime;
        this.LIZIZ = elapsedRealtime;
    }

    public final boolean LIZ(long j, boolean z, boolean z2) {
        this.LIZLLL.LJFF();
        this.LIZLLL.LJI();
        ((InterfaceC68142Qok) C68176QpI.LJLILLLLZI.LJLIL.zza()).zza();
        if (this.LIZLLL.LIZ.LJI.LJIILJJIL(null, C68555QvP.LJJL)) {
            if (this.LIZLLL.LIZ.LJII()) {
                C67194QYs c67194QYs = this.LIZLLL.LIZ.LJIILLIIL().LJIILIIL;
                this.LIZLLL.LIZ.LJIILIIL.getClass();
                c67194QYs.LIZIZ(System.currentTimeMillis());
            }
        } else {
            C67194QYs c67194QYs2 = this.LIZLLL.LIZ.LJIILLIIL().LJIILIIL;
            this.LIZLLL.LIZ.LJIILIIL.getClass();
            c67194QYs2.LIZIZ(System.currentTimeMillis());
        }
        long j2 = j - this.LIZ;
        if (z || j2 >= 1000) {
            if (!z2) {
                j2 = j - this.LIZIZ;
                this.LIZIZ = j;
            }
            this.LIZLLL.LIZ.LIZJ().LJIILIIL.LIZIZ(Long.valueOf(j2), "Recording user engagement, ms");
            Bundle bundle = new Bundle();
            bundle.putLong("_et", j2);
            C68083Qnn.LJIJ(this.LIZLLL.LIZ.LJIJI().LJIIL(!this.LIZLLL.LIZ.LJI.LJIILL()), bundle, true);
            if (!z2) {
                this.LIZLLL.LIZ.LJIJ().LJIIL("auto", "_e", bundle);
            }
            this.LIZ = j;
            this.LIZJ.LIZ();
            this.LIZJ.LIZJ(3600000L);
            return true;
        }
        this.LIZLLL.LIZ.LIZJ().LJIILIIL.LIZIZ(Long.valueOf(j2), "Screen exposed for less than 1000 ms. Event not sent. time");
        return false;
    }
}
