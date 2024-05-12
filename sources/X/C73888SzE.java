package X;

/* renamed from: X.SzE, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73888SzE<T, U> extends AbstractC73430Srq<T, T> {
    public final InterfaceC115714gR<? extends U> LJLILLLLZI;

    @Override // X.AbstractC73672Svk
    public final void LJJJZ(InterfaceC116954iR<? super T> interfaceC116954iR) {
        C73889SzF c73889SzF = new C73889SzF(interfaceC116954iR);
        interfaceC116954iR.onSubscribe(c73889SzF);
        this.LJLILLLLZI.LIZ(c73889SzF.LJLJI);
        this.LJLIL.LIZ(c73889SzF);
    }

    public C73888SzE(InterfaceC115714gR interfaceC115714gR, C73456SsG c73456SsG) {
        super(interfaceC115714gR);
        this.LJLILLLLZI = c73456SsG;
    }
}
