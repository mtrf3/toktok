package X;

/* renamed from: X.Suw, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73622Suw<T> extends AbstractC73430Srq<T, T> {
    public final InterfaceC115714gR<? extends T> LJLILLLLZI;

    @Override // X.AbstractC73672Svk
    public final void LJJJZ(InterfaceC116954iR<? super T> interfaceC116954iR) {
        C73621Suv c73621Suv = new C73621Suv(interfaceC116954iR, this.LJLILLLLZI);
        interfaceC116954iR.onSubscribe(c73621Suv.LJLJI);
        this.LJLIL.LIZ(c73621Suv);
    }

    public C73622Suw(InterfaceC115714gR<T> interfaceC115714gR, InterfaceC115714gR<? extends T> interfaceC115714gR2) {
        super(interfaceC115714gR);
        this.LJLILLLLZI = interfaceC115714gR2;
    }
}
