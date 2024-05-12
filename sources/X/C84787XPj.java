package X;

/* renamed from: X.XPj, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84787XPj<K, V> extends XPQ<K, V> {
    public volatile long LJLJJL;
    public InterfaceC84796XPs<K, V> LJLJJLL;
    public InterfaceC84796XPs<K, V> LJLJL;

    @Override // X.XPP, X.InterfaceC84796XPs
    public final InterfaceC84796XPs<K, V> LJ() {
        return this.LJLJL;
    }

    @Override // X.XPP, X.InterfaceC84796XPs
    public final InterfaceC84796XPs<K, V> LJI() {
        return this.LJLJJLL;
    }

    @Override // X.XPP, X.InterfaceC84796XPs
    public final long LJIIIIZZ() {
        return this.LJLJJL;
    }

    @Override // X.XPP, X.InterfaceC84796XPs
    public final void LJIIJ(long j) {
        this.LJLJJL = j;
    }

    @Override // X.XPP, X.InterfaceC84796XPs
    public final void LJIILL(InterfaceC84796XPs<K, V> interfaceC84796XPs) {
        this.LJLJJLL = interfaceC84796XPs;
    }

    @Override // X.XPP, X.InterfaceC84796XPs
    public final void LJIIZILJ(InterfaceC84796XPs<K, V> interfaceC84796XPs) {
        this.LJLJL = interfaceC84796XPs;
    }

    public C84787XPj(K k, int i, InterfaceC84796XPs<K, V> interfaceC84796XPs) {
        super(k, i, interfaceC84796XPs);
        this.LJLJJL = Long.MAX_VALUE;
        EnumC84785XPh enumC84785XPh = EnumC84785XPh.LJLIL;
        this.LJLJJLL = enumC84785XPh;
        this.LJLJL = enumC84785XPh;
    }
}
