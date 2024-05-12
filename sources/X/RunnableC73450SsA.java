package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.SsA, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class RunnableC73450SsA extends AtomicReference<InterfaceC92693kP> implements InterfaceC73442Ss2, InterfaceC92693kP, Runnable {
    public static final long serialVersionUID = 8571289934935992137L;
    public final InterfaceC73442Ss2 LJLIL;
    public final AbstractC73946T0k LJLILLLLZI;
    public Throwable LJLJI;

    @Override // X.InterfaceC73442Ss2
    public final void onComplete() {
        EnumC73418Sre.replace(this, this.LJLILLLLZI.LIZIZ(this));
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            Throwable th = this.LJLJI;
            if (th != null) {
                this.LJLJI = null;
                this.LJLIL.onError(th);
            } else {
                this.LJLIL.onComplete();
            }
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

    @Override // X.InterfaceC73442Ss2
    public final void onError(Throwable th) {
        this.LJLJI = th;
        EnumC73418Sre.replace(this, this.LJLILLLLZI.LIZIZ(this));
    }

    @Override // X.InterfaceC73442Ss2
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        if (EnumC73418Sre.setOnce(this, interfaceC92693kP)) {
            this.LJLIL.onSubscribe(this);
        }
    }

    public RunnableC73450SsA(InterfaceC73442Ss2 interfaceC73442Ss2, AbstractC73946T0k abstractC73946T0k) {
        this.LJLIL = interfaceC73442Ss2;
        this.LJLILLLLZI = abstractC73946T0k;
    }
}
