package X;

/* renamed from: X.SzH, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73891SzH<T> extends AbstractC73430Srq<T, T> {
    public final InterfaceC48038ItG<? super AbstractC73672Svk<Throwable>, ? extends InterfaceC115714gR<?>> LJLILLLLZI;

    @Override // X.AbstractC73672Svk
    public final void LJJJZ(InterfaceC116954iR<? super T> interfaceC116954iR) {
        AbstractC73851Syd<T> LJJZ = new C73893SzJ().LJJZ();
        try {
            InterfaceC115714gR<?> apply = this.LJLILLLLZI.apply(LJJZ);
            C73320Sq4.LIZ(apply, "The handler returned a null ObservableSource");
            InterfaceC115714gR<?> interfaceC115714gR = apply;
            C73892SzI c73892SzI = new C73892SzI(interfaceC116954iR, LJJZ, this.LJLIL);
            interfaceC116954iR.onSubscribe(c73892SzI);
            interfaceC115714gR.LIZ(c73892SzI.LJLJJL);
            c73892SzI.LIZ();
        } catch (Throwable th) {
            V0N.LJJIL(th);
            EnumC73538Sta.error(th, interfaceC116954iR);
        }
    }

    public C73891SzH(InterfaceC115714gR<T> interfaceC115714gR, InterfaceC48038ItG<? super AbstractC73672Svk<Throwable>, ? extends InterfaceC115714gR<?>> interfaceC48038ItG) {
        super(interfaceC115714gR);
        this.LJLILLLLZI = interfaceC48038ItG;
    }
}
