package X;

import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;

/* renamed from: X.P4y, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C63872P4y extends QXX {
    public C63851P4d LJLIL;

    public final synchronized void LLLLZIL() {
        C63851P4d c63851P4d = this.LJLIL;
        if (c63851P4d == null) {
            return;
        }
        c63851P4d.LJFF = true;
        PthreadThread pthreadThread = c63851P4d.LIZ;
        if (pthreadThread != null) {
            try {
                pthreadThread.join();
            } catch (InterruptedException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        this.LJLIL = null;
        Runtime.getRuntime().gc();
    }

    public final synchronized void LLLLZ(long j) {
        if (this.LJLIL != null) {
            return;
        }
        int i = (int) (j / 1048576);
        if (i <= 0) {
            return;
        }
        C63851P4d c63851P4d = new C63851P4d();
        this.LJLIL = c63851P4d;
        c63851P4d.LIZ(i);
    }
}
