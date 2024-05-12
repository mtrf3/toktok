package com.ss.ttlivestreamer.core.utils;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class TTLSThreadConfigHelper {
    public static final TTLSThreadConfigHelper INSTANCE = new TTLSThreadConfigHelper();
    public static Map<String, Integer> configs;

    public static final void release() {
        DebugLogUtils.isEnableDebugLog();
        synchronized (INSTANCE) {
            Map<String, Integer> map = configs;
            if (map != null) {
                map.clear();
                configs = null;
            }
        }
    }

    public static final void init(Map<String, Integer> map) {
        if (map == null || map.isEmpty()) {
            release();
            return;
        }
        synchronized (INSTANCE) {
            Map<String, Integer> map2 = configs;
            if (map2 == null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.putAll(map);
                configs = linkedHashMap;
            } else {
                map2.clear();
                map2.putAll(map);
            }
            DebugLogUtils.isEnableDebugLog();
        }
    }

    public static final int getPriority(String name, int i) {
        Integer num;
        o.LJIIJ(name, "name");
        Map<String, Integer> map = configs;
        if (map != null && (num = map.get(name)) != null) {
            i = num.intValue();
        }
        DebugLogUtils.isEnableDebugLog();
        return i;
    }
}
