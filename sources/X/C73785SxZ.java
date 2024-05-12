package X;

/* renamed from: X.SxZ, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73785SxZ<T> extends AbstractC73739Swp<T, T> {
    public final InterfaceC73786Sxa<? super Integer, ? super Throwable> LJLJI;

    @Override // X.AbstractC73745Swv
    public final void LJIILIIL(InterfaceC73740Swq<? super T> interfaceC73740Swq) {
        C73783SxX c73783SxX = new C73783SxX(false);
        interfaceC73740Swq.onSubscribe(c73783SxX);
        new C73784SxY(interfaceC73740Swq, this.LJLJI, c73783SxX, this.LJLILLLLZI).LIZIZ();
    }

    public C73785SxZ(AbstractC73745Swv abstractC73745Swv, U93 u93) {
        super(abstractC73745Swv);
        this.LJLJI = u93;
    }
}
