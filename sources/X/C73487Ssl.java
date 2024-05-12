package X;

/* renamed from: X.Ssl, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73487Ssl<T> extends AbstractC73638SvC<T> implements L7V<T> {
    public final InterfaceC115714gR<T> LJLIL;
    public final long LJLILLLLZI = 0;
    public final T LJLJI = null;

    @Override // X.L7V
    public final AbstractC73672Svk<T> LIZIZ() {
        return new C73486Ssk(this.LJLIL, this.LJLILLLLZI, this.LJLJI, true);
    }

    public C73487Ssl(InterfaceC115714gR interfaceC115714gR) {
        this.LJLIL = interfaceC115714gR;
    }

    @Override // X.AbstractC73638SvC
    public final void LJJIII(InterfaceC73463SsN<? super T> interfaceC73463SsN) {
        this.LJLIL.LIZ(new C73488Ssm(interfaceC73463SsN, this.LJLILLLLZI, this.LJLJI));
    }
}
