package X;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* renamed from: X.XPp, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84793XPp<K, V> extends AbstractC65705PqX<InterfaceC84796XPs<K, V>> {
    public final /* synthetic */ C84792XPo LJLILLLLZI;

    @Override // X.AbstractC65705PqX
    public final InterfaceC84796XPs LIZ(Object obj) {
        InterfaceC84796XPs<K, V> LJIIJJI = ((InterfaceC84796XPs) obj).LJIIJJI();
        if (LJIIJJI == this.LJLILLLLZI.LJLIL) {
            return null;
        }
        return LJIIJJI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C84793XPp(C84792XPo c84792XPo, InterfaceC84796XPs interfaceC84796XPs) {
        super(interfaceC84796XPs);
        this.LJLILLLLZI = c84792XPo;
    }
}
