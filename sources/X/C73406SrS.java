package X;

/* renamed from: X.SrS, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C73406SrS<R> implements InterfaceC116954iR<C64797Pbt<R>> {
    public final InterfaceC116954iR<? super R> LJLIL;
    public boolean LJLILLLLZI;

    @Override // X.InterfaceC116954iR
    public final void onComplete() {
        if (!this.LJLILLLLZI) {
            this.LJLIL.onComplete();
        }
    }

    public C73406SrS(InterfaceC116954iR<? super R> interfaceC116954iR) {
        this.LJLIL = interfaceC116954iR;
    }

    @Override // X.InterfaceC116954iR
    public final void onError(Throwable th) {
        if (!this.LJLILLLLZI) {
            this.LJLIL.onError(th);
            return;
        }
        AssertionError assertionError = new AssertionError("This should never happen! Report as a bug with the full stacktrace.");
        assertionError.initCause(th);
        C73548Stk.LIZIZ(assertionError);
    }

    @Override // X.InterfaceC116954iR
    public final void onNext(Object obj) {
        C64797Pbt c64797Pbt = (C64797Pbt) obj;
        if (c64797Pbt.LIZIZ()) {
            this.LJLIL.onNext((Object) c64797Pbt.LIZIZ);
            return;
        }
        this.LJLILLLLZI = true;
        EPT ept = new EPT(c64797Pbt);
        try {
            this.LJLIL.onError(ept);
        } catch (Throwable th) {
            V0N.LJJIL(th);
            C73548Stk.LIZIZ(new C63756P0m(ept, th));
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        this.LJLIL.onSubscribe(interfaceC92693kP);
    }
}
