package X;

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

/* renamed from: X.F4j, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38377F4j {
    public static final JSONArray LIZ(ReadableArray readableArray) {
        int i;
        JSONArray jSONArray = new JSONArray();
        int size = readableArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            ReadableType type = readableArray.getType(i2);
            if (type == null) {
                i = -1;
            } else {
                i = C38368F4a.LIZ[type.ordinal()];
            }
            switch (i) {
                case 1:
                    jSONArray.put(readableArray.getBoolean(i2));
                    break;
                case 2:
                    try {
                        jSONArray.put(readableArray.getLong(i2));
                        break;
                    } catch (Exception unused) {
                        jSONArray.put(readableArray.getDouble(i2));
                        break;
                    }
                case 3:
                    jSONArray.put(readableArray.getString(i2));
                    break;
                case 4:
                    ReadableMap map = readableArray.getMap(i2);
                    o.LJIIIIZZ(map, "getMap(i)");
                    jSONArray.put(LIZIZ(map));
                    break;
                case 5:
                    ReadableArray array = readableArray.getArray(i2);
                    o.LJIIIIZZ(array, "getArray(i)");
                    jSONArray.put(LIZ(array));
                    break;
                case 6:
                    jSONArray.put(JSONObject.NULL);
                    break;
                case 7:
                    jSONArray.put(readableArray.getInt(i2));
                    break;
                case 8:
                    jSONArray.put(readableArray.getLong(i2));
                    break;
            }
        }
        return jSONArray;
    }

    public static final JSONObject LIZIZ(ReadableMap readableMap) {
        int i;
        o.LJIIIZ(readableMap, "<this>");
        JSONObject jSONObject = new JSONObject();
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            ReadableType type = readableMap.getType(nextKey);
            if (type == null) {
                i = -1;
            } else {
                i = C38368F4a.LIZ[type.ordinal()];
            }
            switch (i) {
                case 1:
                    jSONObject.put(nextKey, readableMap.getBoolean(nextKey));
                    break;
                case 2:
                    try {
                        jSONObject.put(nextKey, readableMap.getLong(nextKey));
                        break;
                    } catch (Exception unused) {
                        jSONObject.put(nextKey, readableMap.getDouble(nextKey));
                        break;
                    }
                case 3:
                    jSONObject.put(nextKey, readableMap.getString(nextKey));
                    break;
                case 4:
                    ReadableMap map = readableMap.getMap(nextKey);
                    o.LJIIIIZZ(map, "getMap(key)");
                    jSONObject.put(nextKey, LIZIZ(map));
                    break;
                case 5:
                    ReadableArray array = readableMap.getArray(nextKey);
                    o.LJIIIIZZ(array, "getArray(key)");
                    jSONObject.put(nextKey, LIZ(array));
                    break;
                case 6:
                    jSONObject.put(nextKey, JSONObject.NULL);
                    break;
                case 7:
                    jSONObject.put(nextKey, readableMap.getInt(nextKey));
                    break;
                case 8:
                    jSONObject.put(nextKey, readableMap.getLong(nextKey));
                    break;
            }
        }
        return jSONObject;
    }

    public static final JavaOnlyArray LIZJ(JSONArray jSONArray) {
        JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Object obj = jSONArray.get(i);
            if ((obj instanceof Float) || (obj instanceof Double)) {
                javaOnlyArray.pushDouble(JSONArrayProtectorUtils.getDouble(jSONArray, i));
            } else if (obj instanceof Number) {
                javaOnlyArray.pushLong(JSONArrayProtectorUtils.getLong(jSONArray, i));
            } else if (obj instanceof String) {
                javaOnlyArray.pushString(JSONArrayProtectorUtils.getString(jSONArray, i));
            } else if (obj instanceof Boolean) {
                javaOnlyArray.pushBoolean(JSONArrayProtectorUtils.getBoolean(jSONArray, i));
            } else if (obj instanceof JSONObject) {
                JSONObject jSONObject = JSONArrayProtectorUtils.getJSONObject(jSONArray, i);
                o.LJIIIIZZ(jSONObject, "getJSONObject(i)");
                javaOnlyArray.pushMap(LIZLLL(jSONObject));
            } else if (obj instanceof JSONArray) {
                JSONArray jSONArray2 = JSONArrayProtectorUtils.getJSONArray(jSONArray, i);
                o.LJIIIIZZ(jSONArray2, "getJSONArray(i)");
                javaOnlyArray.pushArray(LIZJ(jSONArray2));
            } else if (o.LJ(obj, JSONObject.NULL)) {
                javaOnlyArray.pushNull();
            }
        }
        return javaOnlyArray;
    }

    public static final JavaOnlyMap LIZLLL(JSONObject jSONObject) {
        o.LJIIIZ(jSONObject, "<this>");
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        Iterator<String> keys = jSONObject.keys();
        o.LJIIIIZZ(keys, "keys()");
        while (keys.hasNext()) {
            String next = keys.next();
            o.LJII(next, "null cannot be cast to non-null type kotlin.String");
            String str = next;
            Object obj = jSONObject.get(str);
            if ((obj instanceof Float) || (obj instanceof Double)) {
                javaOnlyMap.putDouble(str, JSONObjectProtectorUtils.getDouble(jSONObject, str));
            } else if (obj instanceof Number) {
                javaOnlyMap.putLong(str, JSONObjectProtectorUtils.getLong(jSONObject, str));
            } else if (obj instanceof String) {
                javaOnlyMap.putString(str, JSONObjectProtectorUtils.getString(jSONObject, str));
            } else if (obj instanceof Boolean) {
                javaOnlyMap.putBoolean(str, JSONObjectProtectorUtils.getBoolean(jSONObject, str));
            } else if (obj instanceof JSONObject) {
                JSONObject jSONObject2 = JSONObjectProtectorUtils.getJSONObject(jSONObject, str);
                o.LJIIIIZZ(jSONObject2, "getJSONObject(key)");
                javaOnlyMap.putMap(str, LIZLLL(jSONObject2));
            } else if (obj instanceof JSONArray) {
                JSONArray jSONArray = JSONObjectProtectorUtils.getJSONArray(jSONObject, str);
                o.LJIIIIZZ(jSONArray, "getJSONArray(key)");
                javaOnlyMap.putArray(str, LIZJ(jSONArray));
            } else if (o.LJ(obj, JSONObject.NULL)) {
                javaOnlyMap.putNull(str);
            }
        }
        return javaOnlyMap;
    }
}
