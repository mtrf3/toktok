package X;

/* renamed from: X.Swa, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73724Swa<T> extends AbstractC73745Swv<T> {
    public final InterfaceC73705SwH<T> LJLILLLLZI;
    public final EnumC73681Svt LJLJI;

    @Override // X.AbstractC73745Swv
    public final void LJIILIIL(InterfaceC73740Swq<? super T> interfaceC73740Swq) {
        AbstractC73754Sx4 c73764SxE;
        int i = C73682Svu.LIZ[this.LJLJI.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        c73764SxE = new C73759Sx9(interfaceC73740Swq, AbstractC73745Swv.LJLIL);
                    } else {
                        c73764SxE = new C73760SxA(interfaceC73740Swq);
                    }
                } else {
                    c73764SxE = new C73726Swc(interfaceC73740Swq);
                }
            } else {
                c73764SxE = new C73725Swb(interfaceC73740Swq);
            }
        } else {
            c73764SxE = new C73764SxE(interfaceC73740Swq);
        }
        interfaceC73740Swq.onSubscribe(c73764SxE);
        try {
            this.LJLILLLLZI.LIZ(c73764SxE);
        } catch (Throwable th) {
            V0N.LJJIL(th);
            c73764SxE.onError(th);
        }
    }

    public C73724Swa(InterfaceC73705SwH<T> interfaceC73705SwH, EnumC73681Svt enumC73681Svt) {
        this.LJLILLLLZI = interfaceC73705SwH;
        this.LJLJI = enumC73681Svt;
    }
}
