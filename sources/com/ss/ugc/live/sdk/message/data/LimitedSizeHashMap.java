package com.ss.ugc.live.sdk.message.data;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public class LimitedSizeHashMap<K, V> extends LinkedHashMap<K, V> {
    public int mMaxSize;

    public LimitedSizeHashMap(int i) {
        this.mMaxSize = i;
    }

    @Override // java.util.LinkedHashMap
    public boolean removeEldestEntry(Map.Entry<K, V> entry) {
        if (size() > this.mMaxSize) {
            return true;
        }
        return false;
    }
}
