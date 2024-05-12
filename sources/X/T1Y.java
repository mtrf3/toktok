package X;

import android.os.Handler;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class T1Y implements Runnable, InterfaceC92693kP {
    public volatile boolean LJLIL;
    public final Handler LJLILLLLZI;
    public final Runnable LJLJI;
    public final boolean LJLJJI;

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        if (!this.LJLJJI) {
            this.LJLILLLLZI.removeCallbacks(this);
        }
        this.LJLIL = true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            this.LJLJI.run();
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
        return this.LJLIL;
    }

    public T1Y(Handler handler, Runnable delegate, boolean z) {
        o.LJIIJ(handler, "handler");
        o.LJIIJ(delegate, "delegate");
        this.LJLILLLLZI = handler;
        this.LJLJI = delegate;
        this.LJLJJI = z;
    }
}
