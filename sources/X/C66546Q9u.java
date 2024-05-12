package X;

import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import defpackage.a1;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Q9u, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66546Q9u {
    public static Long LIZ(JSONObject jSONObject) {
        T2R.LJIILLIIL(jSONObject, "json must not be null");
        if (!jSONObject.has("expires_at") || jSONObject.isNull("expires_at")) {
            return null;
        }
        try {
            return Long.valueOf(JSONObjectProtectorUtils.getLong(jSONObject, "expires_at"));
        } catch (JSONException unused) {
            return null;
        }
    }

    public static JSONObject LJI(java.util.Map<String, String> map) {
        map.getClass();
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            T2R.LJIILLIIL(entry.getKey(), "map entries must not have null keys");
            T2R.LJIILLIIL(entry.getValue(), "map entries must not have null values");
            LJIIIIZZ(entry.getKey(), entry.getValue(), jSONObject);
        }
        return jSONObject;
    }

    public static String LIZIZ(JSONObject jSONObject, String str) {
        T2R.LJIILLIIL(jSONObject, "json must not be null");
        if (jSONObject.has(str)) {
            String string = JSONObjectProtectorUtils.getString(jSONObject, str);
            if (string != null) {
                return string;
            }
            throw new JSONException(a1.LJ("field \"", str, "\" is mapped to a null value"));
        }
        throw new JSONException(a1.LJ("field \"", str, "\" not found in json object"));
    }

    public static String LIZJ(String str, JSONObject jSONObject) {
        T2R.LJIILLIIL(jSONObject, "json must not be null");
        if (!jSONObject.has(str)) {
            return null;
        }
        String string = JSONObjectProtectorUtils.getString(jSONObject, str);
        if (string != null) {
            return string;
        }
        throw new JSONException(a1.LJ("field \"", str, "\" is mapped to a null value"));
    }

    public static java.util.Map LIZLLL(String str, JSONObject jSONObject) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        T2R.LJIILLIIL(jSONObject, "json must not be null");
        if (!jSONObject.has(str)) {
            return linkedHashMap;
        }
        JSONObject jSONObject2 = JSONObjectProtectorUtils.getJSONObject(jSONObject, str);
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String string = JSONObjectProtectorUtils.getString(jSONObject2, next);
            T2R.LJIILLIIL(string, "additional parameter values must not be null");
            linkedHashMap.put(next, string);
        }
        return linkedHashMap;
    }

    public static android.net.Uri LJ(String str, JSONObject jSONObject) {
        T2R.LJIILLIIL(jSONObject, "json must not be null");
        String string = JSONObjectProtectorUtils.getString(jSONObject, str);
        if (string != null) {
            return UriProtector.parse(string);
        }
        throw new JSONException(a1.LJ("field \"", str, "\" is mapped to a null value"));
    }

    public static android.net.Uri LJFF(String str, JSONObject jSONObject) {
        T2R.LJIILLIIL(jSONObject, "json must not be null");
        if (!jSONObject.has(str)) {
            return null;
        }
        String string = JSONObjectProtectorUtils.getString(jSONObject, str);
        if (string != null) {
            return UriProtector.parse(string);
        }
        throw new JSONException(a1.LJ("field \"", str, "\" is mapped to a null value"));
    }

    public static void LJII(int i, String str, JSONObject jSONObject) {
        T2R.LJIILLIIL(Integer.valueOf(i), "value must not be null");
        try {
            jSONObject.put(str, i);
        } catch (JSONException unused) {
            throw new IllegalStateException("JSONException thrown in violation of contract, ex");
        }
    }

    public static void LJIIIIZZ(String str, String str2, JSONObject jSONObject) {
        T2R.LJIILLIIL(str, "field must not be null");
        T2R.LJIILLIIL(str2, "value must not be null");
        try {
            jSONObject.put(str, str2);
        } catch (JSONException e) {
            throw new IllegalStateException("JSONException thrown in violation of contract", e);
        }
    }

    public static void LJIIIZ(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        T2R.LJIILLIIL(jSONObject2, "value must not be null");
        try {
            jSONObject.put(str, jSONObject2);
        } catch (JSONException e) {
            throw new IllegalStateException("JSONException thrown in violation of contract", e);
        }
    }

    public static void LJIIJ(String str, String str2, JSONObject jSONObject) {
        if (str2 == null) {
            return;
        }
        try {
            jSONObject.put(str, str2);
        } catch (JSONException e) {
            throw new IllegalStateException("JSONException thrown in violation of contract", e);
        }
    }
}
