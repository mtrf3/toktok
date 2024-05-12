package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.j;
import com.google.gson.m;
import com.google.gson.n;
import com.google.gson.o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.F4z, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38393F4z {
    public static final o LIZ = new o();

    public static List<Object> LIZIZ(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Object opt = jSONArray.opt(i);
            if (opt instanceof Long) {
                arrayList.add(Long.valueOf(jSONArray.optLong(i)));
            } else if (opt instanceof Double) {
                arrayList.add(Double.valueOf(jSONArray.optDouble(i)));
            } else if (opt instanceof Integer) {
                arrayList.add(Integer.valueOf(jSONArray.optInt(i)));
            } else if (opt instanceof String) {
                arrayList.add(jSONArray.optString(i));
            } else if (opt instanceof JSONObject) {
                arrayList.add(LIZJ(jSONArray.optJSONObject(i)));
            } else if (opt instanceof JSONArray) {
                arrayList.add(LIZIZ(jSONArray.optJSONArray(i)));
            } else if (opt instanceof Boolean) {
                arrayList.add(Boolean.valueOf(jSONArray.optBoolean(i)));
            }
        }
        return arrayList;
    }

    public static java.util.Map<String, Object> LIZJ(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object opt = jSONObject.opt(next);
            if (opt instanceof Long) {
                hashMap.put(next, Long.valueOf(jSONObject.optLong(next)));
            } else if (opt instanceof Double) {
                hashMap.put(next, Double.valueOf(jSONObject.optDouble(next)));
            } else if (opt instanceof Integer) {
                hashMap.put(next, Integer.valueOf(jSONObject.optInt(next)));
            } else if (opt instanceof String) {
                hashMap.put(next, jSONObject.optString(next));
            } else if (opt instanceof JSONObject) {
                hashMap.put(next, LIZJ(jSONObject.optJSONObject(next)));
            } else if (opt instanceof JSONArray) {
                hashMap.put(next, LIZIZ(jSONObject.optJSONArray(next)));
            } else if (opt instanceof Boolean) {
                hashMap.put(next, Boolean.valueOf(jSONObject.optBoolean(next)));
            }
        }
        return hashMap;
    }

    public static JSONObject LIZLLL(java.util.Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            try {
                jSONObject.put(entry.getKey(), entry.getValue());
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }

    public static m LJ(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            LIZ.getClass();
            return o.LIZ(str).LJIIZILJ();
        } catch (Throwable th) {
            throw new n(th);
        }
    }

    public static String LJFF(Object obj) {
        if (obj == null) {
            return "";
        }
        try {
            return C09650Zl.LIZIZ.LJIILL(obj);
        } catch (Throwable th) {
            throw new n(th);
        }
    }

    public static List LIZ(Class cls, String str) {
        if (TextUtils.isEmpty(str)) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<j> it = GsonProtectorUtils.parse(new o(), str).LJIILLIIL().iterator();
        while (it.hasNext()) {
            arrayList.add(GsonProtectorUtils.fromJson(C09650Zl.LIZIZ, it.next(), cls));
        }
        return arrayList;
    }
}
