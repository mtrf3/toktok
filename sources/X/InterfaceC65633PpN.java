package X;

import java.util.Collection;
import java.util.Map;

/* renamed from: X.PpN, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC65633PpN<K, V> {
    java.util.Map<K, Collection<V>> asMap();

    void clear();

    boolean containsEntry(Object obj, Object obj2);

    boolean containsKey(Object obj);

    Collection<Map.Entry<K, V>> entries();

    Collection<V> get(K k);

    boolean isEmpty();

    java.util.Set<K> keySet();

    boolean put(K k, V v);

    boolean remove(Object obj, Object obj2);

    Collection<V> removeAll(Object obj);

    int size();
}
