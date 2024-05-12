package X;

/* loaded from: classes16.dex */
public class XPQ<K, V> extends XPP<K, V> {
    public final K LJLIL;
    public final int LJLILLLLZI;
    public final InterfaceC84796XPs<K, V> LJLJI;
    public volatile XPL<K, V> LJLJJI = XQ3.LLFF;

    @Override // X.XPP, X.InterfaceC84796XPs
    public final InterfaceC84796XPs<K, V> LIZJ() {
        return this.LJLJI;
    }

    @Override // X.XPP, X.InterfaceC84796XPs
    public final XPL<K, V> LIZLLL() {
        return this.LJLJJI;
    }

    @Override // X.XPP, X.InterfaceC84796XPs
    public final int LJII() {
        return this.LJLILLLLZI;
    }

    @Override // X.XPP, X.InterfaceC84796XPs
    public final K getKey() {
        return this.LJLIL;
    }

    @Override // X.XPP, X.InterfaceC84796XPs
    public final void LJIILLIIL(XPL<K, V> xpl) {
        this.LJLJJI = xpl;
    }

    public XPQ(K k, int i, InterfaceC84796XPs<K, V> interfaceC84796XPs) {
        this.LJLIL = k;
        this.LJLILLLLZI = i;
        this.LJLJI = interfaceC84796XPs;
    }
}
