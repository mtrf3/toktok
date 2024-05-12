package X;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.ECm, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C36040ECm<K, V> extends AbstractC87649Yab<java.util.Map<K, ? extends V>> implements java.util.Map<K, V>, EHO {
    public final java.util.Map<K, V> LJLJI;

    public C36040ECm() {
        this(null);
    }

    @Override // java.util.Map
    public final void clear() {
        this.LJLJI.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.LJLJI.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.LJLJI.containsValue(obj);
    }

    @Override // java.util.Map
    public final V get(Object obj) {
        return this.LJLJI.get(obj);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.LJLJI.isEmpty();
    }

    @Override // java.util.Map
    public final java.util.Set<Map.Entry<K, V>> entrySet() {
        return this.LJLJI.entrySet();
    }

    @Override // java.util.Map
    public final java.util.Set<K> keySet() {
        return this.LJLJI.keySet();
    }

    @Override // java.util.Map
    public final int size() {
        return this.LJLJI.size();
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        return this.LJLJI.values();
    }

    public C36040ECm(Object obj) {
        this.LJLJI = new ConcurrentHashMap();
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map<? extends K, ? extends V> from) {
        o.LJIIIZ(from, "from");
        this.LJLJI.putAll(from);
        LIZJ(this);
    }

    @Override // java.util.Map
    public final V remove(Object obj) {
        V remove = this.LJLJI.remove(obj);
        LIZJ(this);
        return remove;
    }

    @Override // java.util.Map
    public final V put(K k, V v) {
        V put = this.LJLJI.put(k, v);
        LIZJ(this);
        return put;
    }
}
