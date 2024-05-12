package X;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* loaded from: classes16.dex */
public class XPM<K, V> extends WeakReference<V> implements XPL<K, V> {
    public final InterfaceC84796XPs<K, V> LJLIL;

    @Override // X.XPL
    public int LIZ() {
        return 1;
    }

    @Override // X.XPL
    public final void LIZJ(V v) {
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
        return get();
    }

    @Override // X.XPL
    public final InterfaceC84796XPs<K, V> LIZIZ() {
        return this.LJLIL;
    }

    public XPM(ReferenceQueue<V> referenceQueue, V v, InterfaceC84796XPs<K, V> interfaceC84796XPs) {
        super(v, referenceQueue);
        this.LJLIL = interfaceC84796XPs;
    }

    @Override // X.XPL
    public XPL<K, V> LJ(ReferenceQueue<V> referenceQueue, V v, InterfaceC84796XPs<K, V> interfaceC84796XPs) {
        return new XPM(referenceQueue, v, interfaceC84796XPs);
    }
}
