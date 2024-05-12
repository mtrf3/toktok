package X;

/* renamed from: X.SrT, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C73407SrT<R> implements InterfaceC116954iR<C64797Pbt<R>> {
    public final InterfaceC116954iR<? super C65149PhZ<R>> LJLIL;

    @Override // X.InterfaceC116954iR
    public final void onComplete() {
        this.LJLIL.onComplete();
    }

    public C73407SrT(InterfaceC116954iR<? super C65149PhZ<R>> interfaceC116954iR) {
        this.LJLIL = interfaceC116954iR;
    }

    @Override // X.InterfaceC116954iR
    public final void onError(Throwable th) {
        try {
            InterfaceC116954iR<? super C65149PhZ<R>> interfaceC116954iR = this.LJLIL;
            if (th != null) {
                interfaceC116954iR.onNext(new C65149PhZ());
                this.LJLIL.onComplete();
                return;
            }
            throw new NullPointerException("error == null");
        } catch (Throwable th2) {
            try {
                this.LJLIL.onError(th2);
            } catch (Throwable th3) {
                V0N.LJJIL(th3);
                C73548Stk.LIZIZ(new C63756P0m(th2, th3));
            }
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onNext(Object obj) {
        InterfaceC116954iR<? super C65149PhZ<R>> interfaceC116954iR = this.LJLIL;
        if (obj != null) {
            interfaceC116954iR.onNext(new C65149PhZ());
            return;
        }
        throw new NullPointerException("response == null");
    }

    @Override // X.InterfaceC116954iR
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        this.LJLIL.onSubscribe(interfaceC92693kP);
    }
}
