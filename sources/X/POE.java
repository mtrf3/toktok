package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes12.dex */
public final class POE extends AtomicBoolean implements Runnable, InterfaceC92693kP {
    public static final long serialVersionUID = -2421395018820541164L;
    public final Runnable LJLIL;

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        lazySet(true);
    }

    @Override // X.InterfaceC92693kP
    public final boolean isDisposed() {
        return get();
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            if (!get()) {
                try {
                    this.LJLIL.run();
                    lazySet(true);
                } catch (Throwable th) {
                    lazySet(true);
                    throw th;
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public POE(Runnable runnable) {
        this.LJLIL = runnable;
    }
}
