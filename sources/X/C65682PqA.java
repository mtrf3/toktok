package X;

/* renamed from: X.PqA, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C65682PqA<K, V> extends AbstractC65680Pq8<K> {
    public final java.util.Map<K, V> LJLIL;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.LJLIL.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.LJLIL.size();
    }

    public C65682PqA(java.util.Map<K, V> map) {
        map.getClass();
        this.LJLIL = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.LJLIL.containsKey(obj);
    }
}
