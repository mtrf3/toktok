package X;

/* renamed from: X.Sxk, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73796Sxk<T> extends AbstractC73745Swv<T> {
    public final InterfaceC73650SvO<T> LJLILLLLZI;
    public final InterfaceC73445Ss5 LJLJI;

    @Override // X.AbstractC73745Swv
    public final void LJIILIIL(InterfaceC73740Swq<? super T> interfaceC73740Swq) {
        this.LJLILLLLZI.subscribe(new C73853Syf(this.LJLJI, interfaceC73740Swq));
    }

    public C73796Sxk(AbstractC73745Swv abstractC73745Swv, InterfaceC73445Ss5 interfaceC73445Ss5) {
        this.LJLILLLLZI = abstractC73745Swv;
        this.LJLJI = interfaceC73445Ss5;
    }
}
