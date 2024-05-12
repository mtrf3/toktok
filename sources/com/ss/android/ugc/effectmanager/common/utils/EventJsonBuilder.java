package com.ss.android.ugc.effectmanager.common.utils;

import X.C16880lQ;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public class EventJsonBuilder {
    public HashMap<String, Object> mHashMap = new HashMap<>();

    public static void check(Object obj) {
    }

    public synchronized JSONObject build() {
        try {
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
        return new JSONObject(this.mHashMap);
    }

    public static EventJsonBuilder newBuilder() {
        return new EventJsonBuilder();
    }

    public HashMap<String, Object> getHasMap() {
        return this.mHashMap;
    }

    public static EventJsonBuilder fromJSONObject(JSONObject jSONObject) {
        EventJsonBuilder newBuilder = newBuilder();
        if (jSONObject != null && jSONObject.length() > 0) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    newBuilder.addValuePair(next, JSONObjectProtectorUtils.getString(jSONObject, next));
                } catch (JSONException unused) {
                }
            }
        }
        return newBuilder;
    }

    public EventJsonBuilder addValuePair(String str, Boolean bool) {
        check(this.mHashMap.put(str, bool));
        return this;
    }

    public EventJsonBuilder addValuePair(String str, Double d) {
        check(this.mHashMap.put(str, d));
        return this;
    }

    public EventJsonBuilder addValuePair(String str, Float f) {
        check(this.mHashMap.put(str, f));
        return this;
    }

    public EventJsonBuilder addValuePair(String str, Integer num) {
        check(this.mHashMap.put(str, num));
        return this;
    }

    public EventJsonBuilder addValuePair(String str, Long l) {
        check(this.mHashMap.put(str, l));
        return this;
    }

    public EventJsonBuilder addValuePair(String str, String str2) {
        check(this.mHashMap.put(str, str2));
        return this;
    }

    public EventJsonBuilder addValuePair(String str, List<String> list) {
        check(this.mHashMap.put(str, list));
        return this;
    }
}
