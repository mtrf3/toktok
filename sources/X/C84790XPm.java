package X;

import java.lang.ref.ReferenceQueue;

/* renamed from: X.XPm, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84790XPm<K, V> extends XPO<K, V> {
    public volatile long LJLJJI;
    public InterfaceC84796XPs<K, V> LJLJJL;
    public InterfaceC84796XPs<K, V> LJLJJLL;
    public volatile long LJLJL;
    public InterfaceC84796XPs<K, V> LJLJLJ;
    public InterfaceC84796XPs<K, V> LJLJLLL;

    @Override // X.XPO, X.InterfaceC84796XPs
    public final InterfaceC84796XPs<K, V> LJ() {
        return this.LJLJLLL;
    }

    @Override // X.XPO, X.InterfaceC84796XPs
    public final InterfaceC84796XPs<K, V> LJFF() {
        return this.LJLJJLL;
    }

    @Override // X.XPO, X.InterfaceC84796XPs
    public final InterfaceC84796XPs<K, V> LJI() {
        return this.LJLJLJ;
    }

    @Override // X.XPO, X.InterfaceC84796XPs
    public final long LJIIIIZZ() {
        return this.LJLJL;
    }

    @Override // X.XPO, X.InterfaceC84796XPs
    public final InterfaceC84796XPs<K, V> LJIIJJI() {
        return this.LJLJJL;
    }

    @Override // X.XPO, X.InterfaceC84796XPs
    public final long LJIIL() {
        return this.LJLJJI;
    }

    @Override // X.XPO, X.InterfaceC84796XPs
    public final void LJIIIZ(long j) {
        this.LJLJJI = j;
    }

    @Override // X.XPO, X.InterfaceC84796XPs
    public final void LJIIJ(long j) {
        this.LJLJL = j;
    }

    @Override // X.XPO, X.InterfaceC84796XPs
    public final void LJIILIIL(InterfaceC84796XPs<K, V> interfaceC84796XPs) {
        this.LJLJJLL = interfaceC84796XPs;
    }

    @Override // X.XPO, X.InterfaceC84796XPs
    public final void LJIILJJIL(InterfaceC84796XPs<K, V> interfaceC84796XPs) {
        this.LJLJJL = interfaceC84796XPs;
    }

    @Override // X.XPO, X.InterfaceC84796XPs
    public final void LJIILL(InterfaceC84796XPs<K, V> interfaceC84796XPs) {
        this.LJLJLJ = interfaceC84796XPs;
    }

    @Override // X.XPO, X.InterfaceC84796XPs
    public final void LJIIZILJ(InterfaceC84796XPs<K, V> interfaceC84796XPs) {
        this.LJLJLLL = interfaceC84796XPs;
    }

    public C84790XPm(int i, InterfaceC84796XPs interfaceC84796XPs, Object obj, ReferenceQueue referenceQueue) {
        super(i, interfaceC84796XPs, obj, referenceQueue);
        this.LJLJJI = Long.MAX_VALUE;
        EnumC84785XPh enumC84785XPh = EnumC84785XPh.LJLIL;
        this.LJLJJL = enumC84785XPh;
        this.LJLJJLL = enumC84785XPh;
        this.LJLJL = Long.MAX_VALUE;
        this.LJLJLJ = enumC84785XPh;
        this.LJLJLLL = enumC84785XPh;
    }
}
