package X;

import java.lang.ref.ReferenceQueue;

/* renamed from: X.XQq, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public class C84820XQq<K, V> implements InterfaceC84815XQl<K, V> {
    public final V LIZ;

    @Override // X.InterfaceC84815XQl
    public int LIZ() {
        return 1;
    }

    @Override // X.InterfaceC84815XQl
    public final InterfaceC84816XQm<K, V> LIZIZ() {
        return null;
    }

    @Override // X.InterfaceC84815XQl
    public final void LIZJ() {
    }

    @Override // X.InterfaceC84815XQl
    public final InterfaceC84815XQl<K, V> LIZLLL(ReferenceQueue<V> referenceQueue, V v, InterfaceC84816XQm<K, V> interfaceC84816XQm) {
        return this;
    }

    @Override // X.InterfaceC84815XQl
    public final boolean isActive() {
        return true;
    }

    @Override // X.InterfaceC84815XQl
    public final void isLoading() {
    }

    @Override // X.InterfaceC84815XQl
    public final V get() {
        return this.LIZ;
    }

    public C84820XQq(V v) {
        this.LIZ = v;
    }
}
