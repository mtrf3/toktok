package X;

import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.react.bridge.JavaOnlyMap;
import java.util.Iterator;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.F4h, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38375F4h {
    public static final JavaOnlyArray LIZ(JSONArray jsonArray) {
        o.LJIIJ(jsonArray, "jsonArray");
        JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
        int length = jsonArray.length();
        for (int i = 0; i < length; i++) {
            Object obj = jsonArray.get(i);
            if (obj instanceof JSONObject) {
                javaOnlyArray.pushMap(LIZIZ((JSONObject) obj));
            } else if (obj instanceof JSONArray) {
                javaOnlyArray.pushArray(LIZ((JSONArray) obj));
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

    public static final JavaOnlyMap LIZIZ(JSONObject jsonObject) {
        o.LJIIJ(jsonObject, "jsonObject");
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        Iterator<String> keys = jsonObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            o.LJFF(next, "iterator.next()");
            String str = next;
            Object obj = jsonObject.get(str);
            if (obj instanceof JSONObject) {
                javaOnlyMap.putMap(str, LIZIZ((JSONObject) obj));
            } else if (obj instanceof JSONArray) {
                javaOnlyMap.putArray(str, LIZ((JSONArray) obj));
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
            } else {
                javaOnlyMap.putString(str, obj.toString());
            }
        }
        return javaOnlyMap;
    }
}
