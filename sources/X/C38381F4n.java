package X;

import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.react.bridge.ReadableType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.F4n, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38381F4n {
    public static final /* synthetic */ int LIZ = 0;

    public static final JavaOnlyArray LIZ(List sourceArray) {
        o.LJIIJ(sourceArray, "sourceArray");
        JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
        int size = sourceArray.size();
        for (int i = 0; i < size; i++) {
            Object obj = ListProtector.get(sourceArray, i);
            if (obj instanceof java.util.Map) {
                try {
                    javaOnlyArray.pushMap(LIZLLL((java.util.Map) obj));
                } catch (Exception unused) {
                }
            } else if (obj instanceof List) {
                javaOnlyArray.pushArray(LIZ((List) obj));
            } else if (obj instanceof Boolean) {
                javaOnlyArray.pushBoolean(((Boolean) obj).booleanValue());
            } else if (obj instanceof Integer) {
                javaOnlyArray.pushInt(((Number) obj).intValue());
            } else if (obj instanceof Long) {
                javaOnlyArray.pushDouble(((Number) obj).longValue());
            } else if (obj instanceof Float) {
                javaOnlyArray.pushDouble(((Number) obj).floatValue());
            } else if (obj instanceof Double) {
                javaOnlyArray.pushDouble(((Number) obj).doubleValue());
            } else if (obj instanceof String) {
                javaOnlyArray.pushString((String) obj);
            } else {
                javaOnlyArray.pushString(obj.toString());
            }
        }
        return javaOnlyArray;
    }

    public static final JavaOnlyArray LIZIZ(JSONArray jsonArray) {
        o.LJIIJ(jsonArray, "jsonArray");
        JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
        int length = jsonArray.length();
        for (int i = 0; i < length; i++) {
            Object obj = jsonArray.get(i);
            if (obj instanceof JSONObject) {
                javaOnlyArray.pushMap(LIZJ((JSONObject) obj));
            } else if (obj instanceof JSONArray) {
                javaOnlyArray.pushArray(LIZIZ((JSONArray) obj));
            } else if (obj instanceof Boolean) {
                javaOnlyArray.pushBoolean(((Boolean) obj).booleanValue());
            } else if (obj instanceof Integer) {
                javaOnlyArray.pushInt(((Number) obj).intValue());
            } else if (obj instanceof Long) {
                javaOnlyArray.pushDouble(((Number) obj).longValue());
            } else if (obj instanceof Float) {
                javaOnlyArray.pushDouble(((Number) obj).floatValue());
            } else if (obj instanceof Double) {
                javaOnlyArray.pushDouble(((Number) obj).doubleValue());
            } else if (obj instanceof String) {
                javaOnlyArray.pushString((String) obj);
            } else if (o.LJ(JSONObject.NULL, obj) || obj == null) {
                javaOnlyArray.pushNull();
            } else {
                javaOnlyArray.pushString(obj.toString());
            }
        }
        return javaOnlyArray;
    }

    public static final JavaOnlyMap LIZJ(JSONObject jsonObject) {
        o.LJIIJ(jsonObject, "jsonObject");
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        Iterator<String> keys = jsonObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            o.LJFF(next, "iterator.next()");
            String str = next;
            Object obj = jsonObject.get(str);
            if (obj instanceof JSONObject) {
                javaOnlyMap.putMap(str, LIZJ((JSONObject) obj));
            } else if (obj instanceof JSONArray) {
                javaOnlyMap.putArray(str, LIZIZ((JSONArray) obj));
            } else if (obj instanceof Boolean) {
                javaOnlyMap.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Integer) {
                javaOnlyMap.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                javaOnlyMap.putDouble(str, ((Number) obj).longValue());
            } else if (obj instanceof Float) {
                javaOnlyMap.putDouble(str, ((Number) obj).floatValue());
            } else if (obj instanceof Double) {
                javaOnlyMap.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof String) {
                javaOnlyMap.putString(str, (String) obj);
            } else if (o.LJ(obj, JSONObject.NULL)) {
                javaOnlyMap.putMap(str, null);
            } else {
                javaOnlyMap.putString(str, obj.toString());
            }
        }
        return javaOnlyMap;
    }

    public static final JavaOnlyMap LIZLLL(java.util.Map source) {
        o.LJIIJ(source, "source");
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        for (Map.Entry entry : source.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof java.util.Map) {
                try {
                    javaOnlyMap.putMap(str, LIZLLL((java.util.Map) value));
                } catch (Exception unused) {
                }
            } else if (value instanceof List) {
                javaOnlyMap.putArray(str, LIZ((List) value));
            } else if (value instanceof Object[]) {
                javaOnlyMap.putArray(str, LJ((Object[]) value));
            } else if (value instanceof Boolean) {
                javaOnlyMap.putBoolean(str, ((Boolean) value).booleanValue());
            } else if (value instanceof Integer) {
                javaOnlyMap.putInt(str, ((Number) value).intValue());
            } else if (value instanceof Long) {
                javaOnlyMap.putDouble(str, ((Number) value).longValue());
            } else if (value instanceof Float) {
                javaOnlyMap.putDouble(str, ((Number) value).floatValue());
            } else if (value instanceof Double) {
                javaOnlyMap.putDouble(str, ((Number) value).doubleValue());
            } else if (value instanceof String) {
                javaOnlyMap.putString(str, (String) value);
            } else if (value instanceof JSONObject) {
                javaOnlyMap.putMap(str, LIZJ((JSONObject) value));
            } else if (value instanceof JSONArray) {
                javaOnlyMap.putArray(str, LIZIZ((JSONArray) value));
            } else if (value == null || o.LJ(value, JSONObject.NULL)) {
                javaOnlyMap.putNull(str);
            } else {
                javaOnlyMap.putString(str, value.toString());
            }
        }
        return javaOnlyMap;
    }

    public static JavaOnlyArray LJ(Object[] objArr) {
        JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
        for (Object obj : objArr) {
            if ((obj instanceof Float) || (obj instanceof Double)) {
                if (obj != null) {
                    javaOnlyArray.pushDouble(((Double) obj).doubleValue());
                } else {
                    throw new C37692Eqm("null cannot be cast to non-null type kotlin.Double");
                }
            } else if (obj instanceof Long) {
                if (obj != null) {
                    javaOnlyArray.pushLong(((Long) obj).longValue());
                } else {
                    throw new C37692Eqm("null cannot be cast to non-null type kotlin.Long");
                }
            } else if (obj instanceof Number) {
                if (obj != null) {
                    javaOnlyArray.pushInt(((Integer) obj).intValue());
                } else {
                    throw new C37692Eqm("null cannot be cast to non-null type kotlin.Int");
                }
            } else if (obj instanceof String) {
                if (obj != null) {
                    javaOnlyArray.pushString((String) obj);
                } else {
                    throw new C37692Eqm("null cannot be cast to non-null type kotlin.String");
                }
            } else if (obj instanceof Boolean) {
                if (obj != null) {
                    javaOnlyArray.pushBoolean(((Boolean) obj).booleanValue());
                } else {
                    throw new C37692Eqm("null cannot be cast to non-null type kotlin.Boolean");
                }
            } else if (obj instanceof java.util.Map) {
                if (obj != null) {
                    javaOnlyArray.pushMap(LIZLLL((java.util.Map) obj));
                } else {
                    throw new C37692Eqm("null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
                }
            } else if (obj instanceof List) {
                if (obj != null) {
                    javaOnlyArray.pushArray(LIZ((List) obj));
                } else {
                    throw new C37692Eqm("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                }
            } else if (obj instanceof Object[]) {
                if (obj != null) {
                    javaOnlyArray.pushArray(LJ((Object[]) obj));
                } else {
                    throw new C37692Eqm("null cannot be cast to non-null type kotlin.Array<kotlin.Any>");
                }
            } else if (obj instanceof JSONArray) {
                javaOnlyArray.pushArray(LIZIZ((JSONArray) obj));
            } else if (obj instanceof JSONObject) {
                javaOnlyArray.pushMap(LIZJ((JSONObject) obj));
            }
        }
        return javaOnlyArray;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.ArrayList] */
    public static Object LJFF(Object obj) {
        Object hashMap;
        if (obj instanceof ReadableArray) {
            ReadableArray readableArray = (ReadableArray) obj;
            int size = readableArray.size();
            hashMap = new ArrayList();
            for (int i = 0; i < size; i++) {
                F5B dynamic = readableArray.getDynamic(i);
                o.LJFF(dynamic, "value.getDynamic(i)");
                hashMap.add(LJFF(LJI(dynamic)));
            }
        } else if (obj instanceof ReadableMap) {
            ReadableMap readableMap = (ReadableMap) obj;
            ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
            hashMap = new HashMap();
            while (keySetIterator.hasNextKey()) {
                String key = keySetIterator.nextKey();
                o.LJFF(key, "key");
                F5B dynamic2 = readableMap.getDynamic(key);
                o.LJFF(dynamic2, "value.getDynamic(key)");
                hashMap.put(key, LJFF(LJI(dynamic2)));
            }
        } else {
            if (obj instanceof Number) {
                Number number = (Number) obj;
                double doubleValue = number.doubleValue();
                int intValue = number.intValue();
                if (doubleValue == intValue) {
                    return Integer.valueOf(intValue);
                }
                return Double.valueOf(doubleValue);
            }
            return obj;
        }
        return hashMap;
    }

    public static Object LJI(F5B f5b) {
        ReadableType type = f5b.getType();
        if (type != null) {
            int i = C38389F4v.LIZ[type.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                return f5b.asArray();
                            }
                        } else {
                            return f5b.asMap();
                        }
                    } else {
                        return Boolean.valueOf(f5b.asBoolean());
                    }
                } else {
                    double asDouble = f5b.asDouble();
                    int asInt = f5b.asInt();
                    if (asInt == asDouble) {
                        return Integer.valueOf(asInt);
                    }
                    return Double.valueOf(asDouble);
                }
            } else {
                return f5b.asString();
            }
        }
        return null;
    }

    public static List LJII(JSONArray json) {
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
                arrayList.add(LJIIIIZZ(optJSONObject));
            } else if (opt instanceof JSONArray) {
                JSONArray optJSONArray = json.optJSONArray(i);
                o.LJFF(optJSONArray, "json.optJSONArray(index)");
                arrayList.add(LJII(optJSONArray));
            } else if (opt instanceof Boolean) {
                arrayList.add(Boolean.valueOf(json.optBoolean(i)));
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public static java.util.Map LJIIIIZZ(JSONObject json) {
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
                linkedHashMap.put(key, LJIIIIZZ(optJSONObject));
            } else if (opt instanceof JSONArray) {
                o.LJFF(key, "key");
                JSONArray optJSONArray = json.optJSONArray(key);
                o.LJFF(optJSONArray, "json.optJSONArray(key)");
                linkedHashMap.put(key, LJII(optJSONArray));
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

    public static JSONArray LJIIIZ(List list) {
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
                        jSONArray.put(LJIIJ((java.util.Map) obj));
                    } catch (Exception unused) {
                    }
                } else {
                    throw new C37692Eqm("null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
                }
            } else if (!(obj instanceof List)) {
                continue;
            } else if (obj != null) {
                jSONArray.put(LJIIIZ((List) obj));
            } else {
                throw new C37692Eqm("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            }
        }
        return jSONArray;
    }

    public static JSONObject LJIIJ(java.util.Map map) {
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
            } else if (value instanceof JSONObject) {
                jSONObject.put(str, value);
            } else if (value instanceof JSONArray) {
                jSONObject.put(str, value);
            } else if (value instanceof java.util.Map) {
                try {
                    jSONObject.put(str, LJIIJ((java.util.Map) value));
                } catch (Exception unused) {
                }
            } else if (value instanceof List) {
                jSONObject.put(str, LJIIIZ((List) value));
            }
        }
        return jSONObject;
    }
}
