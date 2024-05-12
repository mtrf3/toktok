package X;

import java.lang.ref.ReferenceQueue;

/* renamed from: X.XPn, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84791XPn<K, V> extends XPO<K, V> {
    public volatile long LJLJJI;
    public InterfaceC84796XPs<K, V> LJLJJL;
    public InterfaceC84796XPs<K, V> LJLJJLL;

    @Override // X.XPO, X.InterfaceC84796XPs
    public final InterfaceC84796XPs<K, V> LJ() {
        return this.LJLJJLL;
    }

    @Override // X.XPO, X.InterfaceC84796XPs
    public final InterfaceC84796XPs<K, V> LJI() {
        return this.LJLJJL;
    }

    @Override // X.XPO, X.InterfaceC84796XPs
    public final long LJIIIIZZ() {
        return this.LJLJJI;
    }

    @Override // X.XPO, X.InterfaceC84796XPs
    public final void LJIIJ(long j) {
        this.LJLJJI = j;
    }

    @Override // X.XPO, X.InterfaceC84796XPs
    public final void LJIILL(InterfaceC84796XPs<K, V> interfaceC84796XPs) {
        this.LJLJJL = interfaceC84796XPs;
    }

    @Override // X.XPO, X.InterfaceC84796XPs
    public final void LJIIZILJ(InterfaceC84796XPs<K, V> interfaceC84796XPs) {
        this.LJLJJLL = interfaceC84796XPs;
    }

    public C84791XPn(int i, InterfaceC84796XPs interfaceC84796XPs, Object obj, ReferenceQueue referenceQueue) {
        super(i, interfaceC84796XPs, obj, referenceQueue);
        this.LJLJJI = Long.MAX_VALUE;
        EnumC84785XPh enumC84785XPh = EnumC84785XPh.LJLIL;
        this.LJLJJL = enumC84785XPh;
        this.LJLJJLL = enumC84785XPh;
    }
}
