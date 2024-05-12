package X;

import java.util.Collection;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.E9m, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35962E9m<K, V> implements InterfaceC35963E9n<K, V> {
    public final java.util.Map<K, V> LJLIL;
    public final InterfaceC88472Yns<K, V> LJLILLLLZI;

    @Override // java.util.Map
    public final void clear() {
        this.LJLIL.clear();
    }

    @Override // java.util.Map
    public final java.util.Set<Map.Entry<K, V>> entrySet() {
        return this.LJLIL.entrySet();
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.LJLIL.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.LJLIL.isEmpty();
    }

    @Override // java.util.Map
    public final java.util.Set<K> keySet() {
        return this.LJLIL.keySet();
    }

    @Override // java.util.Map
    public final int size() {
        return this.LJLIL.size();
    }

    public final String toString() {
        return this.LJLIL.toString();
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        return this.LJLIL.values();
    }

    @Override // X.InterfaceC35963E9n
    public final java.util.Map<K, V> LJIIJ() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC35961E9l
    public final V LJFF(K k) {
        java.util.Map<K, V> map = this.LJLIL;
        V v = map.get(k);
        if (v == null && !map.containsKey(k)) {
            return this.LJLILLLLZI.invoke(k);
        }
        return v;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.LJLIL.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.LJLIL.containsValue(obj);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return this.LJLIL.equals(obj);
    }

    @Override // java.util.Map
    public final V get(Object obj) {
        return this.LJLIL.get(obj);
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map<? extends K, ? extends V> from) {
        o.LJIIIZ(from, "from");
        this.LJLIL.putAll(from);
    }

    @Override // java.util.Map
    public final V remove(Object obj) {
        return this.LJLIL.remove(obj);
    }

    public C35962E9m(java.util.Map map, C35964E9o c35964E9o) {
        o.LJIIIZ(map, "map");
        o.LJIIIZ(c35964E9o, "default");
        this.LJLIL = map;
        this.LJLILLLLZI = c35964E9o;
    }

    @Override // java.util.Map
    public final V put(K k, V v) {
        return this.LJLIL.put(k, v);
    }
}
