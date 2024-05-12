package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.SrM, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class RunnableC73400SrM extends AtomicReference<InterfaceC92693kP> implements InterfaceC92693kP, Runnable {
    public static final long serialVersionUID = -2809475196591179431L;
    public final InterfaceC116954iR<? super Long> LJLIL;

    @Override // X.InterfaceC92693kP
    public final boolean isDisposed() {
        if (get() == EnumC73418Sre.DISPOSED) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            if (!isDisposed()) {
                this.LJLIL.onNext(0L);
                lazySet(EnumC73538Sta.INSTANCE);
                this.LJLIL.onComplete();
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        EnumC73418Sre.dispose(this);
    }

    public RunnableC73400SrM(InterfaceC116954iR<? super Long> interfaceC116954iR) {
        this.LJLIL = interfaceC116954iR;
    }
}
