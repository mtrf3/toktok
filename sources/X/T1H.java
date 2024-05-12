package X;

import java.util.concurrent.TimeUnit;

/* loaded from: classes13.dex */
public final class T1H implements Runnable {
    public final Runnable LJLIL;
    public final T1I LJLILLLLZI;
    public final long LJLJI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            if (!this.LJLILLLLZI.LJLJJI) {
                T1I t1i = this.LJLILLLLZI;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                t1i.getClass();
                long LIZ2 = AbstractC73945T0j.LIZ(timeUnit);
                long j = this.LJLJI;
                if (j > LIZ2) {
                    try {
                        Thread.sleep(j - LIZ2);
                    } catch (InterruptedException e) {
                        C16880lQ.LLLLIIIILLL().interrupt();
                        C73548Stk.LIZIZ(e);
                        return;
                    }
                }
                if (!this.LJLILLLLZI.LJLJJI) {
                    this.LJLIL.run();
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public T1H(Runnable runnable, T1I t1i, long j) {
        this.LJLIL = runnable;
        this.LJLILLLLZI = t1i;
        this.LJLJI = j;
    }
}
