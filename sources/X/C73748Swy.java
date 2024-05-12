package X;

/* renamed from: X.Swy, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73748Swy<T> extends AbstractC73739Swp<T, T> {
    public final AbstractC73946T0k LJLJI;
    public final boolean LJLJJI;

    @Override // X.AbstractC73745Swv
    public final void LJIILIIL(InterfaceC73740Swq<? super T> interfaceC73740Swq) {
        AbstractC73945T0j LIZ = this.LJLJI.LIZ();
        RunnableC73756Sx6 runnableC73756Sx6 = new RunnableC73756Sx6(interfaceC73740Swq, LIZ, this.LJLILLLLZI, this.LJLJJI);
        interfaceC73740Swq.onSubscribe(runnableC73756Sx6);
        LIZ.LIZIZ(runnableC73756Sx6);
    }

    public C73748Swy(AbstractC73745Swv<T> abstractC73745Swv, AbstractC73946T0k abstractC73946T0k, boolean z) {
        super(abstractC73745Swv);
        this.LJLJI = abstractC73946T0k;
        this.LJLJJI = z;
    }
}
