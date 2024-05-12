package X;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* loaded from: classes16.dex */
public final class XRB<K, V> extends AbstractC79562VKk<InterfaceC84816XQm<K, V>> {
    public final /* synthetic */ C84818XQo LJLILLLLZI;

    @Override // X.AbstractC79562VKk
    public final InterfaceC84816XQm LIZ(Object obj) {
        InterfaceC84816XQm<K, V> LJI = ((InterfaceC84816XQm) obj).LJI();
        if (LJI == this.LJLILLLLZI.LJLIL) {
            return null;
        }
        return LJI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XRB(C84818XQo c84818XQo, InterfaceC84816XQm interfaceC84816XQm) {
        super(interfaceC84816XQm);
        this.LJLILLLLZI = c84818XQo;
    }
}
