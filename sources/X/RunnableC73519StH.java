package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.StH, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class RunnableC73519StH extends AtomicReference<InterfaceC92693kP> implements InterfaceC92693kP, Runnable {
    public static final long serialVersionUID = 2875964065294031672L;
    public final InterfaceC73509St7<? super Long> LJLIL;

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

    public RunnableC73519StH(InterfaceC73509St7<? super Long> interfaceC73509St7) {
        this.LJLIL = interfaceC73509St7;
    }
}
