package com.ss.android.ugc.effectmanager.common.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class JsonExtKt {
    public static final List<Object> toList(JSONArray toList) {
        o.LJIIJ(toList, "$this$toList");
        ArrayList arrayList = new ArrayList();
        int length = toList.length();
        for (int i = 0; i < length; i++) {
            Object value = toList.get(i);
            if (value instanceof JSONArray) {
                value = toList((JSONArray) value);
            } else if (value instanceof JSONObject) {
                value = toMap((JSONObject) value);
            }
            o.LJFF(value, "value");
            arrayList.add(value);
        }
        return arrayList;
    }

    public static final Map<String, Object> toMap(JSONObject toMap) {
        o.LJIIJ(toMap, "$this$toMap");
        HashMap hashMap = new HashMap();
        Iterator<String> keys = toMap.keys();
        while (keys.hasNext()) {
            String key = keys.next();
            Object value = toMap.get(key);
            if (value instanceof JSONArray) {
                value = toList((JSONArray) value);
            } else if (value instanceof JSONObject) {
                value = toMap((JSONObject) value);
            }
            o.LJFF(key, "key");
            o.LJFF(value, "value");
            hashMap.put(key, value);
        }
        return hashMap;
    }
}
