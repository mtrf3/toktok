package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Ss6, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class RunnableC73446Ss6 extends AtomicReference<InterfaceC92693kP> implements InterfaceC92693kP, Runnable {
    public static final long serialVersionUID = 3167244060586201109L;
    public final InterfaceC73442Ss2 LJLIL;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            this.LJLIL.onComplete();
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

    public RunnableC73446Ss6(InterfaceC73442Ss2 interfaceC73442Ss2) {
        this.LJLIL = interfaceC73442Ss2;
    }
}
