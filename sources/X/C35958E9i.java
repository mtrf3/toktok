package X;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.E9i, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35958E9i<K, V> extends LinkedHashMap<K, V> {
    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ java.util.Set<Map.Entry<K, V>> entrySet() {
        return (java.util.Set<Map.Entry<K, V>>) getEntries();
    }

    public /* bridge */ java.util.Set<Map.Entry<Object, Object>> getEntries() {
        return super.entrySet();
    }

    public /* bridge */ java.util.Set<Object> getKeys() {
        return super.keySet();
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public /* bridge */ Collection<Object> getValues() {
        return super.values();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ java.util.Set<K> keySet() {
        return (java.util.Set<K>) getKeys();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Collection<V> values() {
        return (Collection<V>) getValues();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        if (v == null) {
            return null;
        }
        return (V) super.put(k, v);
    }
}