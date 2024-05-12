package X;

/* renamed from: X.Sxo, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73800Sxo<T> extends AbstractC73739Swp<T, T> {
    public final AbstractC73946T0k LJLJI;
    public final boolean LJLJJI;
    public final int LJLJJL;

    @Override // X.AbstractC73745Swv
    public final void LJIILIIL(InterfaceC73740Swq<? super T> interfaceC73740Swq) {
        AbstractC73945T0j LIZ = this.LJLJI.LIZ();
        if (interfaceC73740Swq instanceof InterfaceC73813Sy1) {
            this.LJLILLLLZI.LJIIL(new C73803Sxr((InterfaceC73813Sy1) interfaceC73740Swq, LIZ, this.LJLJJI, this.LJLJJL));
        } else {
            this.LJLILLLLZI.LJIIL(new C73802Sxq(interfaceC73740Swq, LIZ, this.LJLJJI, this.LJLJJL));
        }
    }

    public C73800Sxo(AbstractC73745Swv abstractC73745Swv, AbstractC73946T0k abstractC73946T0k, int i) {
        super(abstractC73745Swv);
        this.LJLJI = abstractC73946T0k;
        this.LJLJJI = false;
        this.LJLJJL = i;
    }
}
