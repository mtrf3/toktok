package com.byted.cast.common;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes29.dex */
public class MaxSizeLinkedHashMap<K, V> extends LinkedHashMap<K, V> {
    public final int mMaxSize;

    public MaxSizeLinkedHashMap(int i) {
        this.mMaxSize = i;
        if (i > 0) {
        } else {
            throw new IllegalArgumentException("maxSize <= 0");
        }
    }

    @Override // java.util.LinkedHashMap
    public boolean removeEldestEntry(Map.Entry<K, V> entry) {
        if (size() > this.mMaxSize) {
            return true;
        }
        return false;
    }
}
