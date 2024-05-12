package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.SuD, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73577SuD<R> extends AtomicReference<InterfaceC92693kP> implements InterfaceC116954iR<R> {
    public static final long serialVersionUID = 2620149119579502636L;
    public final InterfaceC116954iR<? super R> LJLIL;
    public final C73576SuC<?, R> LJLILLLLZI;

    @Override // X.InterfaceC116954iR
    public final void onComplete() {
        C73576SuC<?, R> c73576SuC = this.LJLILLLLZI;
        c73576SuC.LJLJLLL = false;
        c73576SuC.LIZ();
    }

    @Override // X.InterfaceC116954iR
    public final void onError(Throwable th) {
        C73576SuC<?, R> c73576SuC = this.LJLILLLLZI;
        if (c73576SuC.LJLJJI.addThrowable(th)) {
            if (!c73576SuC.LJLJJLL) {
                c73576SuC.LJLJLJ.dispose();
            }
            c73576SuC.LJLJLLL = false;
            c73576SuC.LIZ();
            return;
        }
        C73548Stk.LIZIZ(th);
    }

    @Override // X.InterfaceC116954iR
    public final void onNext(R r) {
        this.LJLIL.onNext(r);
    }

    @Override // X.InterfaceC116954iR
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        EnumC73418Sre.replace(this, interfaceC92693kP);
    }

    public C73577SuD(InterfaceC116954iR<? super R> interfaceC116954iR, C73576SuC<?, R> c73576SuC) {
        this.LJLIL = interfaceC116954iR;
        this.LJLILLLLZI = c73576SuC;
    }
}
