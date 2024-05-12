package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Sul, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class RunnableC73611Sul extends AtomicReference<InterfaceC92693kP> implements InterfaceC73442Ss2, InterfaceC92693kP, Runnable {
    public static final long serialVersionUID = 7000911171163930287L;
    public final InterfaceC73442Ss2 LJLIL;
    public final C73616Suq LJLILLLLZI = new C73616Suq();
    public final InterfaceC73445Ss5 LJLJI;

    @Override // X.InterfaceC73442Ss2
    public final void onComplete() {
        this.LJLIL.onComplete();
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            this.LJLJI.LIZ(this);
        } finally {
            if (LIZ) {
            }
        }
    }

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        EnumC73418Sre.dispose(this);
        this.LJLILLLLZI.dispose();
    }

    @Override // X.InterfaceC92693kP
    public final boolean isDisposed() {
        return EnumC73418Sre.isDisposed(get());
    }

    @Override // X.InterfaceC73442Ss2
    public final void onError(Throwable th) {
        this.LJLIL.onError(th);
    }

    @Override // X.InterfaceC73442Ss2
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        EnumC73418Sre.setOnce(this, interfaceC92693kP);
    }

    public RunnableC73611Sul(InterfaceC73442Ss2 interfaceC73442Ss2, InterfaceC73445Ss5 interfaceC73445Ss5) {
        this.LJLIL = interfaceC73442Ss2;
        this.LJLJI = interfaceC73445Ss5;
    }
}
