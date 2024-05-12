package com.byted.cast.common.utils;

import java.util.LinkedHashMap;

/* loaded from: classes29.dex */
public class FIFOMap<K, V> extends LinkedHashMap<K, V> {
    public final int maxSize;

    public FIFOMap(int i) {
        this.maxSize = i;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        if (size() >= this.maxSize) {
            remove(entrySet().iterator().next().getKey());
        }
        return (V) super.put(k, v);
    }
}
