package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Ssh, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class RunnableC73483Ssh extends AtomicReference<InterfaceC92693kP> implements InterfaceC92693kP, Runnable {
    public static final long serialVersionUID = 8465401857522493082L;
    public final InterfaceC73463SsN<? super Long> LJLIL;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            this.LJLIL.onSuccess(0L);
        } finally {
            if (LIZ) {
            }
        }
    }

    @Override // X.InterfaceC92693kP
    public final boolean isDisposed() {
        return EnumC73418Sre.isDisposed(get());
    }

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        EnumC73418Sre.dispose(this);
    }

    public RunnableC73483Ssh(InterfaceC73463SsN<? super Long> interfaceC73463SsN) {
        this.LJLIL = interfaceC73463SsN;
    }
}
