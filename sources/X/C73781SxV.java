package X;

/* renamed from: X.SxV, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73781SxV<T> extends AbstractC73739Swp<T, T> {
    public final InterfaceC73592SuS<? super Throwable> LJLJI;
    public final long LJLJJI;

    @Override // X.AbstractC73745Swv
    public final void LJIILIIL(InterfaceC73740Swq<? super T> interfaceC73740Swq) {
        C73783SxX c73783SxX = new C73783SxX(false);
        interfaceC73740Swq.onSubscribe(c73783SxX);
        new C73782SxW(interfaceC73740Swq, this.LJLJJI, this.LJLJI, c73783SxX, this.LJLILLLLZI).LIZIZ();
    }

    public C73781SxV(AbstractC73745Swv<T> abstractC73745Swv, long j, InterfaceC73592SuS<? super Throwable> interfaceC73592SuS) {
        super(abstractC73745Swv);
        this.LJLJI = interfaceC73592SuS;
        this.LJLJJI = j;
    }
}
