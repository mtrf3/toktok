package X;

/* renamed from: X.SvM, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73648SvM<T> extends AbstractC73638SvC<T> implements InterfaceC31876CfA<T> {
    public final AbstractC73745Swv<T> LJLIL;
    public final T LJLILLLLZI = null;

    @Override // X.InterfaceC31876CfA
    public final C73734Swk LIZJ() {
        return new C73734Swk(this.LJLIL, this.LJLILLLLZI, true);
    }

    public C73648SvM(AbstractC73739Swp abstractC73739Swp) {
        this.LJLIL = abstractC73739Swp;
    }

    @Override // X.AbstractC73638SvC
    public final void LJJIII(InterfaceC73463SsN<? super T> interfaceC73463SsN) {
        this.LJLIL.LJIIL(new C73647SvL(interfaceC73463SsN, this.LJLILLLLZI));
    }
}
