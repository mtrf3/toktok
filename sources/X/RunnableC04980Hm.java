package X;

import android.os.Process;

/* renamed from: X.0Hm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC04980Hm implements Runnable {
    public final /* synthetic */ int LJLIL = 0;
    public final Object LJLILLLLZI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        switch (this.LJLIL) {
            case 0:
                try {
                    ((InterfaceC04820Gw) this.LJLILLLLZI).LIZJ(C0HD.LJIIL);
                    return;
                } finally {
                    if (LIZ) {
                    }
                }
            default:
                try {
                    Process.setThreadPriority(0);
                    ((Runnable) this.LJLILLLLZI).run();
                    return;
                } finally {
                    if (LIZ) {
                    }
                }
        }
    }

    public RunnableC04980Hm(Runnable runnable) {
        this.LJLILLLLZI = runnable;
    }
}
