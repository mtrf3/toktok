package X;

import Y.IDhS65S0200000_1;

/* renamed from: X.SsH, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73457SsH<T, U> implements InterfaceC48038ItG<T, InterfaceC115714gR<T>> {
    public final InterfaceC48038ItG<? super T, ? extends InterfaceC115714gR<U>> LJLIL;

    public C73457SsH(IDhS65S0200000_1 iDhS65S0200000_1) {
        this.LJLIL = iDhS65S0200000_1;
    }

    @Override // X.InterfaceC48038ItG
    public final Object apply(Object obj) {
        InterfaceC115714gR<U> apply = this.LJLIL.apply(obj);
        C73320Sq4.LIZ(apply, "The itemDelay returned a null ObservableSource");
        C73805Sxt LJJIJL = new C73456SsG(apply, 1L).LJJIJL(new CallableC73721SwX(obj));
        C73320Sq4.LIZ(obj, "defaultItem is null");
        return LJJIJL.LJJLI(AbstractC73672Svk.LJJIJIL(obj));
    }
}
