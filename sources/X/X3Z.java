package X;

import android.content.Context;
import android.content.IntentFilter;

/* loaded from: classes16.dex */
public final class X3Z implements Runnable {
    public final /* synthetic */ boolean LJLIL;

    public final void LIZ() {
        if (this.LJLIL) {
            X3C.LIZ(true).LIZ();
        }
        synchronized (C84212X3g.class) {
            if (C84212X3g.LJIJJLI == null) {
                C84212X3g.LJIJJLI = new X3N();
            }
            if (!C84212X3g.LJJIIZI) {
                try {
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                    C16880lQ.LJJLIIIJILLIZJL(C84212X3g.LJIJJLI, C84212X3g.LIZ, intentFilter);
                    C84212X3g.LJJIIZI = true;
                } catch (Throwable unused) {
                }
            }
        }
        Context LJ = C84212X3g.LJ();
        if (LJ != null) {
            X4Q.LJIIJ(LJ);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public X3Z(boolean z) {
        this.LJLIL = z;
    }
}
