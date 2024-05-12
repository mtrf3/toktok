package X;

import java.util.concurrent.Callable;

/* renamed from: X.Qgd, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC67639Qgd implements Runnable {
    public final /* synthetic */ C67646Qgk LJLIL;
    public final /* synthetic */ Callable LJLILLLLZI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            try {
                this.LJLIL.LJIJ(this.LJLILLLLZI.call());
            } catch (Exception e) {
                this.LJLIL.LJIIZILJ(e);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC67639Qgd(C67646Qgk c67646Qgk, Callable callable) {
        this.LJLIL = c67646Qgk;
        this.LJLILLLLZI = callable;
    }
}
