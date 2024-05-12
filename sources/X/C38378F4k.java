package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.react.bridge.ReadableType;
import java.util.Iterator;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.F4k, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38378F4k {
    public static final C38378F4k LIZ = new C38378F4k();

    public static JavaOnlyArray LIZ(JSONArray jSONArray) {
        JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Object obj = jSONArray.get(i);
            if ((obj instanceof Float) || (obj instanceof Double)) {
                javaOnlyArray.pushDouble(JSONArrayProtectorUtils.getDouble(jSONArray, i));
            } else if (obj instanceof Long) {
                javaOnlyArray.pushDouble(JSONArrayProtectorUtils.getLong(jSONArray, i));
            } else if (obj instanceof Number) {
                javaOnlyArray.pushInt(JSONArrayProtectorUtils.getInt(jSONArray, i));
            } else if (obj instanceof String) {
                javaOnlyArray.pushString(JSONArrayProtectorUtils.getString(jSONArray, i));
            } else if (obj instanceof Boolean) {
                javaOnlyArray.pushBoolean(JSONArrayProtectorUtils.getBoolean(jSONArray, i));
            } else if (obj instanceof JSONObject) {
                JSONObject jSONObject = JSONArrayProtectorUtils.getJSONObject(jSONArray, i);
                o.LJFF(jSONObject, "jsonArray.getJSONObject(i)");
                javaOnlyArray.pushMap(LIZIZ(jSONObject));
            } else if (obj instanceof JSONArray) {
                JSONArray jSONArray2 = JSONArrayProtectorUtils.getJSONArray(jSONArray, i);
                o.LJFF(jSONArray2, "jsonArray.getJSONArray(i)");
                javaOnlyArray.pushArray(LIZ(jSONArray2));
            } else if (o.LJ(obj, JSONObject.NULL)) {
                javaOnlyArray.pushNull();
            }
        }
        return javaOnlyArray;
    }

    public static JavaOnlyMap LIZIZ(JSONObject jsonObject) {
        o.LJIIJ(jsonObject, "jsonObject");
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        Iterator<String> keys = jsonObject.keys();
        o.LJFF(keys, "jsonObject.keys()");
        while (keys.hasNext()) {
            String next = keys.next();
            if (next != null) {
                String str = next;
                Object obj = jsonObject.get(str);
                if ((obj instanceof Float) || (obj instanceof Double)) {
                    javaOnlyMap.putDouble(str, JSONObjectProtectorUtils.getDouble(jsonObject, str));
                } else if (obj instanceof Long) {
                    javaOnlyMap.putDouble(str, JSONObjectProtectorUtils.getLong(jsonObject, str));
                } else if (obj instanceof Number) {
                    javaOnlyMap.putInt(str, JSONObjectProtectorUtils.getInt(jsonObject, str));
                } else if (obj instanceof String) {
                    javaOnlyMap.putString(str, JSONObjectProtectorUtils.getString(jsonObject, str));
                } else if (obj instanceof Boolean) {
                    javaOnlyMap.putBoolean(str, JSONObjectProtectorUtils.getBoolean(jsonObject, str));
                } else if (obj instanceof JSONObject) {
                    JSONObject jSONObject = JSONObjectProtectorUtils.getJSONObject(jsonObject, str);
                    o.LJFF(jSONObject, "jsonObject.getJSONObject(key)");
                    javaOnlyMap.putMap(str, LIZIZ(jSONObject));
                } else if (obj instanceof JSONArray) {
                    JSONArray jSONArray = JSONObjectProtectorUtils.getJSONArray(jsonObject, str);
                    o.LJFF(jSONArray, "jsonObject.getJSONArray(key)");
                    javaOnlyMap.putArray(str, LIZ(jSONArray));
                } else if (o.LJ(obj, JSONObject.NULL)) {
                    javaOnlyMap.putNull(str);
                }
            } else {
                throw new C37692Eqm("null cannot be cast to non-null type kotlin.String");
            }
        }
        return javaOnlyMap;
    }

    public static JSONArray LIZJ(ReadableArray readableArray) {
        Object LIZ2;
        int i;
        Object LIZ3;
        double d;
        Number valueOf;
        JSONArray jSONArray = new JSONArray();
        int size = readableArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            ReadableType type = readableArray.getType(i2);
            if (type != null) {
                switch (C38374F4g.LIZIZ[type.ordinal()]) {
                    case 1:
                        jSONArray.put(readableArray.getBoolean(i2));
                        break;
                    case 2:
                        try {
                            LIZ2 = Integer.valueOf(readableArray.getInt(i2));
                            C3C5.m7constructorimpl(LIZ2);
                        } catch (Throwable th) {
                            LIZ2 = C141335gf.LIZ(th);
                            C3C5.m7constructorimpl(LIZ2);
                        }
                        Object obj = null;
                        if (C3C5.m12isFailureimpl(LIZ2)) {
                            LIZ2 = null;
                        }
                        Integer num = (Integer) LIZ2;
                        if (num != null) {
                            i = num.intValue();
                        } else {
                            i = 0;
                        }
                        try {
                            LIZ3 = Double.valueOf(readableArray.getDouble(i2));
                            C3C5.m7constructorimpl(LIZ3);
                        } catch (Throwable th2) {
                            LIZ3 = C141335gf.LIZ(th2);
                            C3C5.m7constructorimpl(LIZ3);
                        }
                        if (!C3C5.m12isFailureimpl(LIZ3)) {
                            obj = LIZ3;
                        }
                        Double d2 = (Double) obj;
                        if (d2 != null) {
                            d = d2.doubleValue();
                        } else {
                            d = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
                        }
                        if (Double.compare(i, d) == 0) {
                            valueOf = Integer.valueOf(i);
                        } else {
                            long j = (long) d;
                            if (Double.compare(d, j) == 0) {
                                valueOf = Long.valueOf(j);
                            } else {
                                valueOf = Double.valueOf(d);
                            }
                        }
                        if (valueOf instanceof Double) {
                            jSONArray.put(valueOf.doubleValue());
                            break;
                        } else if (valueOf instanceof Long) {
                            jSONArray.put(valueOf.longValue());
                            break;
                        } else if (valueOf instanceof Integer) {
                            jSONArray.put(valueOf.intValue());
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        jSONArray.put(readableArray.getLong(i2));
                        break;
                    case 4:
                        jSONArray.put(readableArray.getString(i2));
                        break;
                    case 5:
                        ReadableMap map = readableArray.getMap(i2);
                        o.LJFF(map, "readableArray.getMap(i)");
                        jSONArray.put(LIZLLL(map));
                        break;
                    case 6:
                        ReadableArray array = readableArray.getArray(i2);
                        o.LJFF(array, "readableArray.getArray(i)");
                        jSONArray.put(LIZJ(array));
                        break;
                    case 7:
                        jSONArray.put(JSONObject.NULL);
                        break;
                }
            }
        }
        return jSONArray;
    }

    public static JSONObject LIZLLL(ReadableMap readableMap) {
        Object LIZ2;
        int i;
        Object LIZ3;
        double d;
        Number valueOf;
        o.LJIIJ(readableMap, "readableMap");
        JSONObject jSONObject = new JSONObject();
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String key = keySetIterator.nextKey();
            ReadableType type = readableMap.getType(key);
            if (type != null) {
                switch (C38374F4g.LIZ[type.ordinal()]) {
                    case 1:
                        jSONObject.put(key, readableMap.getBoolean(key));
                        break;
                    case 2:
                        o.LJFF(key, "key");
                        try {
                            LIZ2 = Integer.valueOf(readableMap.getInt(key));
                            C3C5.m7constructorimpl(LIZ2);
                        } catch (Throwable th) {
                            LIZ2 = C141335gf.LIZ(th);
                            C3C5.m7constructorimpl(LIZ2);
                        }
                        Object obj = null;
                        if (C3C5.m12isFailureimpl(LIZ2)) {
                            LIZ2 = null;
                        }
                        Integer num = (Integer) LIZ2;
                        if (num != null) {
                            i = num.intValue();
                        } else {
                            i = 0;
                        }
                        try {
                            LIZ3 = Double.valueOf(readableMap.getDouble(key));
                            C3C5.m7constructorimpl(LIZ3);
                        } catch (Throwable th2) {
                            LIZ3 = C141335gf.LIZ(th2);
                            C3C5.m7constructorimpl(LIZ3);
                        }
                        if (!C3C5.m12isFailureimpl(LIZ3)) {
                            obj = LIZ3;
                        }
                        Double d2 = (Double) obj;
                        if (d2 != null) {
                            d = d2.doubleValue();
                        } else {
                            d = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
                        }
                        if (Double.compare(i, d) == 0) {
                            valueOf = Integer.valueOf(i);
                        } else {
                            long j = (long) d;
                            if (Double.compare(d, j) == 0) {
                                valueOf = Long.valueOf(j);
                            } else {
                                valueOf = Double.valueOf(d);
                            }
                        }
                        if (valueOf instanceof Double) {
                            jSONObject.put(key, valueOf.doubleValue());
                            break;
                        } else if (valueOf instanceof Long) {
                            jSONObject.put(key, valueOf.longValue());
                            break;
                        } else if (!(valueOf instanceof Integer)) {
                            break;
                        } else {
                            jSONObject.put(key, valueOf.intValue());
                            break;
                        }
                    case 3:
                        jSONObject.put(key, readableMap.getLong(key));
                        break;
                    case 4:
                        jSONObject.put(key, readableMap.getString(key));
                        break;
                    case 5:
                        ReadableMap map = readableMap.getMap(key);
                        o.LJFF(map, "readableMap.getMap(key)");
                        jSONObject.put(key, LIZLLL(map));
                        break;
                    case 6:
                        ReadableArray array = readableMap.getArray(key);
                        o.LJFF(array, "readableMap.getArray(key)");
                        jSONObject.put(key, LIZJ(array));
                        break;
                    case 7:
                        jSONObject.put(key, JSONObject.NULL);
                        break;
                }
            }
        }
        return jSONObject;
    }
}
