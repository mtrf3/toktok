package X;

/* renamed from: X.Sxs, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73804Sxs<T, U> extends AbstractC73739Swp<T, U> {
    public final InterfaceC48038ItG<? super T, ? extends U> LJLJI;

    @Override // X.AbstractC73745Swv
    public final void LJIILIIL(InterfaceC73740Swq<? super U> interfaceC73740Swq) {
        if (interfaceC73740Swq instanceof InterfaceC73813Sy1) {
            this.LJLILLLLZI.LJIIL(new C73829SyH((InterfaceC73813Sy1) interfaceC73740Swq, this.LJLJI));
        } else {
            this.LJLILLLLZI.LJIIL(new C73834SyM(interfaceC73740Swq, this.LJLJI));
        }
    }

    public C73804Sxs(AbstractC73745Swv<T> abstractC73745Swv, InterfaceC48038ItG<? super T, ? extends U> interfaceC48038ItG) {
        super(abstractC73745Swv);
        this.LJLJI = interfaceC48038ItG;
    }
}
