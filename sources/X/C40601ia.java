package X;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.1ia, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C40601ia<K, V> implements java.util.Map<K, V>, EHO {
    public final /* synthetic */ java.util.Map LJLIL;

    public C40601ia() {
        this(false);
    }

    @Override // java.util.Map
    public final void clear() {
        this.LJLIL.clear();
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
    public final V get(Object obj) {
        return (V) this.LJLIL.get(obj);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.LJLIL.isEmpty();
    }

    @Override // java.util.Map
    public final V put(K k, V v) {
        return (V) this.LJLIL.put(k, v);
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map<? extends K, ? extends V> from) {
        o.LJIIJ(from, "from");
        this.LJLIL.putAll(from);
    }

    @Override // java.util.Map
    public final V remove(Object obj) {
        return (V) this.LJLIL.remove(obj);
    }

    @Override // java.util.Map
    public final java.util.Set<Map.Entry<K, V>> entrySet() {
        return this.LJLIL.entrySet();
    }

    @Override // java.util.Map
    public final java.util.Set<K> keySet() {
        return this.LJLIL.keySet();
    }

    @Override // java.util.Map
    public final int size() {
        return this.LJLIL.size();
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        return this.LJLIL.values();
    }

    public C40601ia(boolean z) {
        java.util.Map linkedHashMap;
        if (z) {
            linkedHashMap = new ConcurrentHashMap();
        } else {
            linkedHashMap = new LinkedHashMap(0, 0.75f, true);
        }
        this.LJLIL = linkedHashMap;
    }
}
