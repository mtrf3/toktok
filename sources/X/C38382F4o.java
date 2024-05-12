package X;

import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.F4o, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38382F4o {
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

    public static JSONArray LIZJ(List list) {
        JSONArray jSONArray = new JSONArray();
        for (Object obj : list) {
            if (obj instanceof Float) {
                jSONArray.put(((Number) obj).floatValue());
            } else if (obj instanceof Long) {
                jSONArray.put(((Number) obj).longValue());
            } else if (obj instanceof Integer) {
                jSONArray.put(((Number) obj).intValue());
            } else if (obj instanceof Double) {
                jSONArray.put(((Number) obj).doubleValue());
            } else if (obj instanceof String) {
                jSONArray.put(obj);
            } else if (obj instanceof Boolean) {
                jSONArray.put(((Boolean) obj).booleanValue());
            } else if (obj instanceof java.util.Map) {
                if (obj != null) {
                    try {
                        jSONArray.put(LIZLLL((java.util.Map) obj));
                    } catch (Exception unused) {
                    }
                } else {
                    throw new C37692Eqm("null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
                }
            } else if (!(obj instanceof List)) {
                continue;
            } else if (obj != null) {
                jSONArray.put(LIZJ((List) obj));
            } else {
                throw new C37692Eqm("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            }
        }
        return jSONArray;
    }

    public static JSONObject LIZLLL(java.util.Map map) {
        o.LJIIJ(map, "map");
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Long) {
                jSONObject.put(str, ((Number) value).longValue());
            } else if (value instanceof Float) {
                jSONObject.put(str, ((Number) value).floatValue());
            } else if (value instanceof Integer) {
                jSONObject.put(str, ((Number) value).intValue());
            } else if (value instanceof Double) {
                jSONObject.put(str, ((Number) value).doubleValue());
            } else if (value instanceof String) {
                jSONObject.put(str, value);
            } else if (value instanceof Boolean) {
                jSONObject.put(str, ((Boolean) value).booleanValue());
            } else if (value instanceof java.util.Map) {
                try {
                    jSONObject.put(str, LIZLLL((java.util.Map) value));
                } catch (Exception unused) {
                }
            } else if (value instanceof List) {
                jSONObject.put(str, LIZJ((List) value));
            }
        }
        return jSONObject;
    }
}
