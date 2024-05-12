package X;

import android.os.Handler;

/* renamed from: X.T1g, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class RunnableC73968T1g implements Runnable, InterfaceC92693kP {
    public final Handler LJLIL;
    public final Runnable LJLILLLLZI;
    public volatile boolean LJLJI;

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        this.LJLIL.removeCallbacks(this);
        this.LJLJI = true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            this.LJLILLLLZI.run();
        } finally {
            try {
            } finally {
                if (LIZ) {
                }
            }
        }
    }

    @Override // X.InterfaceC92693kP
    public final boolean isDisposed() {
        return this.LJLJI;
    }

    public RunnableC73968T1g(Handler handler, Runnable runnable) {
        this.LJLIL = handler;
        this.LJLILLLLZI = runnable;
    }
}
