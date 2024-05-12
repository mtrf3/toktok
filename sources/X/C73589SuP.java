package X;

/* renamed from: X.SuP, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73589SuP<T, R> extends AbstractC73430Srq<T, R> {
    public final InterfaceC48038ItG<? super T, ? extends InterfaceC115714gR<? extends R>> LJLILLLLZI;
    public final int LJLJI;
    public final boolean LJLJJI;

    @Override // X.AbstractC73672Svk
    public final void LJJJZ(InterfaceC116954iR<? super R> interfaceC116954iR) {
        if (C73567Su3.LIZ(this.LJLIL, interfaceC116954iR, this.LJLILLLLZI)) {
            return;
        }
        this.LJLIL.LIZ(new C73587SuN(interfaceC116954iR, this.LJLILLLLZI, this.LJLJI, this.LJLJJI));
    }

    public C73589SuP(AbstractC73672Svk abstractC73672Svk, InterfaceC48038ItG interfaceC48038ItG, int i) {
        super(abstractC73672Svk);
        this.LJLILLLLZI = interfaceC48038ItG;
        this.LJLJI = i;
        this.LJLJJI = false;
    }
}
