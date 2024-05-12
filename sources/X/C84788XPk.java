package X;

/* renamed from: X.XPk, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84788XPk<K, V> extends XPQ<K, V> {
    public volatile long LJLJJL;
    public InterfaceC84796XPs<K, V> LJLJJLL;
    public InterfaceC84796XPs<K, V> LJLJL;

    @Override // X.XPP, X.InterfaceC84796XPs
    public final InterfaceC84796XPs<K, V> LJFF() {
        return this.LJLJL;
    }

    @Override // X.XPP, X.InterfaceC84796XPs
    public final InterfaceC84796XPs<K, V> LJIIJJI() {
        return this.LJLJJLL;
    }

    @Override // X.XPP, X.InterfaceC84796XPs
    public final long LJIIL() {
        return this.LJLJJL;
    }

    @Override // X.XPP, X.InterfaceC84796XPs
    public final void LJIIIZ(long j) {
        this.LJLJJL = j;
    }

    @Override // X.XPP, X.InterfaceC84796XPs
    public final void LJIILIIL(InterfaceC84796XPs<K, V> interfaceC84796XPs) {
        this.LJLJL = interfaceC84796XPs;
    }

    @Override // X.XPP, X.InterfaceC84796XPs
    public final void LJIILJJIL(InterfaceC84796XPs<K, V> interfaceC84796XPs) {
        this.LJLJJLL = interfaceC84796XPs;
    }

    public C84788XPk(K k, int i, InterfaceC84796XPs<K, V> interfaceC84796XPs) {
        super(k, i, interfaceC84796XPs);
        this.LJLJJL = Long.MAX_VALUE;
        EnumC84785XPh enumC84785XPh = EnumC84785XPh.LJLIL;
        this.LJLJJLL = enumC84785XPh;
        this.LJLJL = enumC84785XPh;
    }
}
