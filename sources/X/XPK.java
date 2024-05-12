package X;

import java.lang.ref.ReferenceQueue;

/* loaded from: classes16.dex */
public final class XPK<K, V> extends XPH<K, V> {
    public final int LJLILLLLZI;

    @Override // X.XPH, X.XPL
    public final int LIZ() {
        return this.LJLILLLLZI;
    }

    @Override // X.XPH, X.XPL
    public final XPL<K, V> LJ(ReferenceQueue<V> referenceQueue, V v, InterfaceC84796XPs<K, V> interfaceC84796XPs) {
        return new XPK(this.LJLILLLLZI, interfaceC84796XPs, v, referenceQueue);
    }

    public XPK(int i, InterfaceC84796XPs interfaceC84796XPs, Object obj, ReferenceQueue referenceQueue) {
        super(referenceQueue, obj, interfaceC84796XPs);
        this.LJLILLLLZI = i;
    }
}
