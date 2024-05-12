package X;

import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.sdk.xbridge.registry.core.model.idl.IDLXDynamic;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.F4p, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38383F4p {
    public static final /* synthetic */ int LIZ = 0;

    public static List LIZ(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Object opt = jSONArray.opt(i);
            if (opt instanceof Long) {
                arrayList.add(Long.valueOf(jSONArray.optLong(i)));
            } else if (opt instanceof Double) {
                arrayList.add(Double.valueOf(jSONArray.optDouble(i)));
            } else if (opt instanceof Integer) {
                arrayList.add(Integer.valueOf(JSONArrayProtectorUtils.getInt(jSONArray, i)));
            } else if (opt instanceof String) {
                arrayList.add(jSONArray.optString(i));
            } else if (opt instanceof JSONObject) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                o.LJFF(optJSONObject, "json.optJSONObject(index)");
                arrayList.add(LIZIZ(optJSONObject));
            } else if (opt instanceof JSONArray) {
                JSONArray optJSONArray = jSONArray.optJSONArray(i);
                o.LJFF(optJSONArray, "json.optJSONArray(index)");
                arrayList.add(LIZ(optJSONArray));
            } else if (opt instanceof Boolean) {
                arrayList.add(Boolean.valueOf(jSONArray.optBoolean(i)));
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public static java.util.Map LIZIZ(JSONObject jSONObject) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String key = keys.next();
            Object opt = jSONObject.opt(key);
            if (opt instanceof Long) {
                o.LJFF(key, "key");
                linkedHashMap.put(key, Long.valueOf(jSONObject.optLong(key)));
            } else if (opt instanceof Double) {
                o.LJFF(key, "key");
                linkedHashMap.put(key, Double.valueOf(jSONObject.optDouble(key)));
            } else if (opt instanceof Integer) {
                o.LJFF(key, "key");
                linkedHashMap.put(key, Integer.valueOf(jSONObject.optInt(key)));
            } else if (opt instanceof String) {
                o.LJFF(key, "key");
                linkedHashMap.put(key, jSONObject.optString(key));
            } else if (opt instanceof JSONObject) {
                o.LJFF(key, "key");
                JSONObject optJSONObject = jSONObject.optJSONObject(key);
                o.LJFF(optJSONObject, "json.optJSONObject(key)");
                linkedHashMap.put(key, LIZIZ(optJSONObject));
            } else if (opt instanceof JSONArray) {
                o.LJFF(key, "key");
                JSONArray optJSONArray = jSONObject.optJSONArray(key);
                o.LJFF(optJSONArray, "json.optJSONArray(key)");
                linkedHashMap.put(key, LIZ(optJSONArray));
            } else if (opt instanceof Boolean) {
                o.LJFF(key, "key");
                linkedHashMap.put(key, Boolean.valueOf(jSONObject.optBoolean(key)));
            } else {
                o.LJFF(key, "key");
                linkedHashMap.put(key, null);
            }
        }
        return linkedHashMap;
    }

    public static JSONArray LIZJ(List list) {
        o.LJIIJ(list, "list");
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
            } else if (obj instanceof List) {
                if (obj != null) {
                    jSONArray.put(LIZJ((List) obj));
                } else {
                    throw new C37692Eqm("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                }
            } else if (obj instanceof IDLXDynamic) {
                jSONArray.put(C77357UXp.LJJIFFI((IDLXDynamic) obj));
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
            } else if (value instanceof IDLXDynamic) {
                jSONObject.put(str, C77357UXp.LJJIFFI((IDLXDynamic) value));
            }
        }
        return jSONObject;
    }
}
