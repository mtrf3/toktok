package X;

import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.F4r, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38385F4r {
    public static final /* synthetic */ int LIZ = 0;

    public static List LIZ(JSONArray json) {
        o.LJIIJ(json, "json");
        ArrayList arrayList = new ArrayList();
        int length = json.length();
        for (int i = 0; i < length; i++) {
            Object opt = json.opt(i);
            if (opt instanceof Long) {
                arrayList.add(Long.valueOf(json.optLong(i)));
            } else if (opt instanceof Double) {
                arrayList.add(Double.valueOf(json.optDouble(i)));
            } else if (opt instanceof Integer) {
                arrayList.add(Integer.valueOf(JSONArrayProtectorUtils.getInt(json, i)));
            } else if (opt instanceof String) {
                arrayList.add(json.optString(i));
            } else if (opt instanceof JSONObject) {
                JSONObject optJSONObject = json.optJSONObject(i);
                o.LJFF(optJSONObject, "json.optJSONObject(index)");
                arrayList.add(LIZIZ(optJSONObject));
            } else if (opt instanceof JSONArray) {
                JSONArray optJSONArray = json.optJSONArray(i);
                o.LJFF(optJSONArray, "json.optJSONArray(index)");
                arrayList.add(LIZ(optJSONArray));
            } else if (opt instanceof Boolean) {
                arrayList.add(Boolean.valueOf(json.optBoolean(i)));
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public static java.util.Map LIZIZ(JSONObject json) {
        o.LJIIJ(json, "json");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> keys = json.keys();
        while (keys.hasNext()) {
            String key = keys.next();
            Object opt = json.opt(key);
            if (opt instanceof Long) {
                o.LJFF(key, "key");
                linkedHashMap.put(key, Long.valueOf(json.optLong(key)));
            } else if (opt instanceof Double) {
                o.LJFF(key, "key");
                linkedHashMap.put(key, Double.valueOf(json.optDouble(key)));
            } else if (opt instanceof Integer) {
                o.LJFF(key, "key");
                linkedHashMap.put(key, Integer.valueOf(json.optInt(key)));
            } else if (opt instanceof String) {
                o.LJFF(key, "key");
                linkedHashMap.put(key, json.optString(key));
            } else if (opt instanceof JSONObject) {
                o.LJFF(key, "key");
                JSONObject optJSONObject = json.optJSONObject(key);
                o.LJFF(optJSONObject, "json.optJSONObject(key)");
                linkedHashMap.put(key, LIZIZ(optJSONObject));
            } else if (opt instanceof JSONArray) {
                o.LJFF(key, "key");
                JSONArray optJSONArray = json.optJSONArray(key);
                o.LJFF(optJSONArray, "json.optJSONArray(key)");
                linkedHashMap.put(key, LIZ(optJSONArray));
            } else if (opt instanceof Boolean) {
                o.LJFF(key, "key");
                linkedHashMap.put(key, Boolean.valueOf(json.optBoolean(key)));
            } else {
                o.LJFF(key, "key");
                linkedHashMap.put(key, null);
            }
        }
        return linkedHashMap;
    }
}
