package X;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* loaded from: classes16.dex */
public final class XRC<K, V> extends AbstractC79562VKk<InterfaceC84816XQm<K, V>> {
    public final /* synthetic */ C84819XQp LJLILLLLZI;

    @Override // X.AbstractC79562VKk
    public final InterfaceC84816XQm LIZ(Object obj) {
        InterfaceC84816XQm<K, V> LJIIJJI = ((InterfaceC84816XQm) obj).LJIIJJI();
        if (LJIIJJI == this.LJLILLLLZI.LJLIL) {
            return null;
        }
        return LJIIJJI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XRC(C84819XQp c84819XQp, InterfaceC84816XQm interfaceC84816XQm) {
        super(interfaceC84816XQm);
        this.LJLILLLLZI = c84819XQp;
    }
}
