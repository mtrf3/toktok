package com.ss.ttlivestreamer.livestreamv2.utils;

import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class JsonUtils {
    public static void mergeJson(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject != null && jSONObject2 != null) {
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object obj = jSONObject2.get(next);
                if (jSONObject.has(next)) {
                    Object obj2 = jSONObject.get(next);
                    if ((obj2 instanceof JSONObject) && (obj instanceof JSONObject)) {
                        mergeJson((JSONObject) obj2, (JSONObject) obj);
                    } else if ((obj2 instanceof JSONArray) && obj != null) {
                        JSONArray jSONArray = (JSONArray) obj2;
                        if (obj instanceof JSONArray) {
                            JSONArray jSONArray2 = (JSONArray) obj;
                            for (int i = 0; i < jSONArray2.length(); i++) {
                                jSONArray.put(jSONArray2.get(i));
                            }
                        } else {
                            jSONArray.put(obj);
                        }
                    } else {
                        jSONObject.remove(next);
                        jSONObject.put(next, obj);
                    }
                } else {
                    jSONObject.put(next, obj);
                }
            }
        }
    }
}
