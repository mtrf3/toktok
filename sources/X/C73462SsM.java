package X;

import java.util.concurrent.Callable;

/* renamed from: X.SsM, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73462SsM implements InterfaceC73442Ss2 {
    public final InterfaceC73463SsN<? super T> LJLIL;
    public final /* synthetic */ C73461SsL LJLILLLLZI;

    @Override // X.InterfaceC73442Ss2
    public final void onComplete() {
        Object call;
        C73461SsL c73461SsL = this.LJLILLLLZI;
        Callable<? extends T> callable = c73461SsL.LJLILLLLZI;
        if (callable != 0) {
            try {
                call = callable.call();
            } catch (Throwable th) {
                V0N.LJJIL(th);
                this.LJLIL.onError(th);
                return;
            }
        } else {
            call = c73461SsL.LJLJI;
        }
        if (call == null) {
            this.LJLIL.onError(new NullPointerException("The value supplied is null"));
        } else {
            this.LJLIL.onSuccess(call);
        }
    }

    @Override // X.InterfaceC73442Ss2
    public final void onError(Throwable th) {
        this.LJLIL.onError(th);
    }

    @Override // X.InterfaceC73442Ss2
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        this.LJLIL.onSubscribe(interfaceC92693kP);
    }

    public C73462SsM(C73461SsL c73461SsL, InterfaceC73463SsN<? super T> interfaceC73463SsN) {
        this.LJLILLLLZI = c73461SsL;
        this.LJLIL = interfaceC73463SsN;
    }
}
