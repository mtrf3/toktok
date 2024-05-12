package X;

import java.lang.ref.ReferenceQueue;

/* renamed from: X.XPl, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84789XPl<K, V> extends XPO<K, V> {
    public volatile long LJLJJI;
    public InterfaceC84796XPs<K, V> LJLJJL;
    public InterfaceC84796XPs<K, V> LJLJJLL;

    @Override // X.XPO, X.InterfaceC84796XPs
    public final InterfaceC84796XPs<K, V> LJFF() {
        return this.LJLJJLL;
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
    public final void LJIILIIL(InterfaceC84796XPs<K, V> interfaceC84796XPs) {
        this.LJLJJLL = interfaceC84796XPs;
    }

    @Override // X.XPO, X.InterfaceC84796XPs
    public final void LJIILJJIL(InterfaceC84796XPs<K, V> interfaceC84796XPs) {
        this.LJLJJL = interfaceC84796XPs;
    }

    public C84789XPl(int i, InterfaceC84796XPs interfaceC84796XPs, Object obj, ReferenceQueue referenceQueue) {
        super(i, interfaceC84796XPs, obj, referenceQueue);
        this.LJLJJI = Long.MAX_VALUE;
        EnumC84785XPh enumC84785XPh = EnumC84785XPh.LJLIL;
        this.LJLJJL = enumC84785XPh;
        this.LJLJJLL = enumC84785XPh;
    }
}
