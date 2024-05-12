package X;

import android.os.Handler;
import kotlin.jvm.internal.o;

/* renamed from: X.T1d, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class RunnableC73965T1d implements Runnable, InterfaceC92693kP {
    public final Handler LJLIL;
    public final Runnable LJLILLLLZI;
    public final boolean LJLJI;
    public volatile boolean LJLJJI;

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        if (!this.LJLJI) {
            this.LJLIL.removeCallbacks(this);
        }
        this.LJLJJI = true;
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
        return this.LJLJJI;
    }

    public RunnableC73965T1d(Handler handler, Runnable delegate, boolean z) {
        o.LJIIIZ(handler, "handler");
        o.LJIIIZ(delegate, "delegate");
        this.LJLIL = handler;
        this.LJLILLLLZI = delegate;
        this.LJLJI = z;
    }
}
