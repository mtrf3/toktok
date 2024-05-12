package X;

import android.util.LruCache;

/* loaded from: classes12.dex */
public final class Q1Z<K, V> extends LruCache<K, V> {
    public InterfaceC66326Q1i<K, V> LIZ;
    public boolean LIZIZ;

    public Q1Z() {
        super(1000);
    }

    @Override // android.util.LruCache
    public final void entryRemoved(boolean z, K k, V v, V v2) {
        InterfaceC66326Q1i<K, V> interfaceC66326Q1i;
        super.entryRemoved(z, k, v, v2);
        if (v2 == null && z && !this.LIZIZ && (interfaceC66326Q1i = this.LIZ) != null) {
            interfaceC66326Q1i.LIZ(k, v);
        }
    }
}
