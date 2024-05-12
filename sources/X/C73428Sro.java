package X;

/* renamed from: X.Sro, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73428Sro<T> extends AbstractC73430Srq<T, T> {
    public final AbstractC73946T0k LJLILLLLZI;

    @Override // X.AbstractC73672Svk
    public final void LJJJZ(InterfaceC116954iR<? super T> interfaceC116954iR) {
        C73419Srf c73419Srf = new C73419Srf(interfaceC116954iR);
        interfaceC116954iR.onSubscribe(c73419Srf);
        EnumC73418Sre.setOnce(c73419Srf, this.LJLILLLLZI.LIZIZ(new RunnableC73427Srn(this, c73419Srf)));
    }

    public C73428Sro(InterfaceC115714gR<T> interfaceC115714gR, AbstractC73946T0k abstractC73946T0k) {
        super(interfaceC115714gR);
        this.LJLILLLLZI = abstractC73946T0k;
    }
}
