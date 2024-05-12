package X;

import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V] */
/* renamed from: X.Pov, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65605Pov<V> extends AbstractC65557Po9<V> {
    public final AbstractC65557Po9<Map.Entry<K, V>> LJLIL;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.LJLIL.hasNext();
    }

    @Override // java.util.Iterator
    public final V next() {
        return (V) ((Map.Entry) this.LJLIL.next()).getValue();
    }

    public C65605Pov(C65604Pou c65604Pou) {
        this.LJLIL = c65604Pou.LJLILLLLZI.entrySet().iterator();
    }
}
