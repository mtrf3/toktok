package X;

import java.util.Collections;
import java.util.HashMap;

/* renamed from: X.Pp8, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65618Pp8<K, V> extends HashMap<K, V> {
    public static <K, V> java.util.Map<K, V> of() {
        return Collections.unmodifiableMap(new HashMap());
    }

    public C65618Pp8(java.util.Map<? extends K, ? extends V> map) {
        super(map);
    }

    public static <K, V> C65618Pp8<K, V> copyOf(java.util.Map<? extends K, ? extends V> map) {
        return new C65618Pp8<>(map);
    }

    public static <K, V> java.util.Map<K, V> of(K k, V v) {
        HashMap hashMap = new HashMap(1);
        hashMap.put(k, v);
        return Collections.unmodifiableMap(hashMap);
    }

    public static <K, V> java.util.Map<K, V> of(K k, V v, K k2, V v2) {
        HashMap hashMap = new HashMap(2);
        hashMap.put(k, v);
        hashMap.put(k2, v2);
        return Collections.unmodifiableMap(hashMap);
    }

    public static <K, V> java.util.Map<K, V> of(K k, V v, K k2, V v2, K k3, V v3) {
        HashMap hashMap = new HashMap(3);
        hashMap.put(k, v);
        hashMap.put(k2, v2);
        hashMap.put(k3, v3);
        return Collections.unmodifiableMap(hashMap);
    }

    public static <K, V> java.util.Map<K, V> of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        HashMap hashMap = new HashMap(4);
        hashMap.put(k, v);
        hashMap.put(k2, v2);
        hashMap.put(k3, v3);
        hashMap.put(k4, v4);
        return Collections.unmodifiableMap(hashMap);
    }

    public static <K, V> java.util.Map<K, V> of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v6) {
        HashMap hashMap = new HashMap(5);
        hashMap.put(k, v);
        hashMap.put(k2, v2);
        hashMap.put(k3, v3);
        hashMap.put(k4, v4);
        hashMap.put(k5, v6);
        return Collections.unmodifiableMap(hashMap);
    }

    public static <K, V> java.util.Map<K, V> of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v6, K k6, V v7) {
        HashMap hashMap = new HashMap(6);
        hashMap.put(k, v);
        hashMap.put(k2, v2);
        hashMap.put(k3, v3);
        hashMap.put(k4, v4);
        hashMap.put(k5, v6);
        hashMap.put(k6, v7);
        return Collections.unmodifiableMap(hashMap);
    }
}
