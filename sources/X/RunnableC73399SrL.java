package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.SrL, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class RunnableC73399SrL extends AtomicReference<InterfaceC92693kP> implements InterfaceC92693kP, Runnable {
    public static final long serialVersionUID = 346773832286157679L;
    public final InterfaceC116954iR<? super Long> LJLIL;
    public long LJLILLLLZI;

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
            if (get() != EnumC73418Sre.DISPOSED) {
                InterfaceC116954iR<? super Long> interfaceC116954iR = this.LJLIL;
                long j = this.LJLILLLLZI;
                this.LJLILLLLZI = 1 + j;
                interfaceC116954iR.onNext(Long.valueOf(j));
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

    public RunnableC73399SrL(InterfaceC116954iR<? super Long> interfaceC116954iR) {
        this.LJLIL = interfaceC116954iR;
    }
}
