package X;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class PJC {
    public static boolean LJI(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return true;
        }
        return false;
    }

    public static boolean LJII(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0) {
            return true;
        }
        return false;
    }

    public static JSONArray LJIIJJI(JSONArray jSONArray) {
        int i;
        if (jSONArray.length() <= 384) {
            return jSONArray;
        }
        JSONArray jSONArray2 = new JSONArray();
        int i2 = 0;
        do {
            jSONArray2.put(jSONArray.opt(i2));
            i2++;
            i = 256;
        } while (i2 < 256);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("... skip ");
        LIZ.append((jSONArray.length() - 128) - 256);
        LIZ.append(" lines");
        jSONArray2.put(X1D.LIZIZ(LIZ));
        do {
            jSONArray2.put(jSONArray.opt(jSONArray.length() - (384 - i)));
            i++;
        } while (i < 384);
        return jSONArray2;
    }

    public static void LIZ(JSONObject jSONObject, Object... objArr) {
        if (jSONObject == null || objArr.length % 2 != 0 || objArr.length == 0) {
            C78685UuP.LJJI();
            return;
        }
        for (int i = 0; i < objArr.length; i += 2) {
            LJIIJ(jSONObject, String.valueOf(objArr[i]), objArr[i + 1]);
        }
    }

    public static void LIZIZ(JSONObject jSONObject, JSONObject jSONObject2) {
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            try {
                String next = keys.next();
                if (!jSONObject.has(next)) {
                    jSONObject.put(next, jSONObject2.opt(next));
                }
            } catch (Throwable unused) {
                return;
            }
        }
    }

    public static JSONArray LIZJ(JSONObject jSONObject, String... strArr) {
        JSONObject LJ = LJ(jSONObject, strArr);
        if (LJ == null) {
            return null;
        }
        return LJ.optJSONArray(strArr[strArr.length - 1]);
    }

    public static JSONObject LJ(JSONObject jSONObject, String... strArr) {
        if (jSONObject == null) {
            new RuntimeException();
            C78685UuP.LJJJLZIJ();
            return null;
        }
        for (int i = 0; i < strArr.length - 1; i++) {
            jSONObject = jSONObject.optJSONObject(strArr[i]);
            if (jSONObject == null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("err get json: not found node:");
                LIZ.append(strArr[i]);
                X1D.LIZIZ(LIZ);
                C78685UuP.LJJJLZIJ();
                return null;
            }
        }
        return jSONObject;
    }

    public static String LJFF(JSONObject jSONObject, String... strArr) {
        JSONObject LJ = LJ(jSONObject, strArr);
        if (LJ == null) {
            return null;
        }
        return LJ.optString(strArr[strArr.length - 1]);
    }

    public static boolean LJIIIIZZ(String str, JSONArray jSONArray) {
        if (!LJI(jSONArray)) {
            for (int i = 0; i < jSONArray.length(); i++) {
                Object opt = jSONArray.opt(i);
                if (!(opt instanceof String)) {
                    break;
                }
                if (((String) opt).contains(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void LJIIIZ(java.util.Map map, JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                for (Map.Entry entry : map.entrySet()) {
                    jSONObject.put((String) entry.getKey(), entry.getValue());
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static int LIZLLL(JSONObject jSONObject, int i, String... strArr) {
        JSONObject LJ = LJ(jSONObject, strArr);
        if (LJ == null) {
            return i;
        }
        return LJ.optInt(strArr[strArr.length - 1], i);
    }

    public static JSONObject LJIIJ(JSONObject jSONObject, String str, Object obj) {
        if (jSONObject != null && obj != null && !TextUtils.isEmpty(str)) {
            try {
                jSONObject.put(str, obj);
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }
}
