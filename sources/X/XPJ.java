package X;

import java.lang.ref.ReferenceQueue;

/* loaded from: classes16.dex */
public class XPJ<K, V> implements XPL<K, V> {
    public final V LJLIL;

    @Override // X.XPL
    public int LIZ() {
        return 1;
    }

    @Override // X.XPL
    public final InterfaceC84796XPs<K, V> LIZIZ() {
        return null;
    }

    @Override // X.XPL
    public final void LIZJ(V v) {
    }

    @Override // X.XPL
    public final XPL<K, V> LJ(ReferenceQueue<V> referenceQueue, V v, InterfaceC84796XPs<K, V> interfaceC84796XPs) {
        return this;
    }

    @Override // X.XPL
    public final boolean isActive() {
        return true;
    }

    @Override // X.XPL
    public final boolean isLoading() {
        return false;
    }

    @Override // X.XPL
    public final V LIZLLL() {
        return this.LJLIL;
    }

    @Override // X.XPL
    public final V get() {
        return this.LJLIL;
    }

    public XPJ(V v) {
        this.LJLIL = v;
    }
}
