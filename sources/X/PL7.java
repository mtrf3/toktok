package X;

import Y.ARunnableS47S0100000_11;
import android.os.SystemClock;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;

/* loaded from: classes12.dex */
public final class PL7 extends PthreadThread {
    public final /* synthetic */ ARunnableS47S0100000_11 LJLIL;

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            super.run();
            while (true) {
                SystemClock.sleep(PK0.LJIIIIZZ.getDefaultAnrCheckInterval());
                PLD pld = (PLD) this.LJLIL.l0;
                if (!pld.LIZIZ) {
                    pld.LIZ.LJIIJJI(-1L, null);
                    PLD.LIZJ = SystemClock.uptimeMillis();
                } else {
                    return;
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PL7(ARunnableS47S0100000_11 aRunnableS47S0100000_11) {
        super("anr_monitor_new");
        this.LJLIL = aRunnableS47S0100000_11;
    }
}
