package X;

import android.text.TextUtils;
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.J0r, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48473J0r {
    public java.util.Map<String, int[][]> LIZ = new HashMap();
    public String LIZIZ;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [int[][]] */
    public static C48473J0r LIZ(String str) {
        JSONObject jSONObject;
        JSONArray optJSONArray;
        C48473J0r c48473J0r = new C48473J0r();
        if (!TextUtils.isEmpty(str)) {
            try {
                jSONObject = new JSONObject(str);
            } catch (Exception unused) {
                jSONObject = new JSONObject();
            }
            HashMap hashMap = new HashMap();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!TextUtils.isEmpty(next) && (optJSONArray = jSONObject.optJSONArray(next)) != null) {
                    Class cls = Integer.TYPE;
                    ?? newInstance = Array.newInstance((Class<?>) cls, 0, 0);
                    if (optJSONArray.length() > 0) {
                        newInstance = (int[][]) Array.newInstance((Class<?>) cls, optJSONArray.length(), 2);
                        for (int i = 0; i < optJSONArray.length(); i++) {
                            JSONArray optJSONArray2 = optJSONArray.optJSONArray(i);
                            if (optJSONArray2 != null && optJSONArray2.length() >= 2) {
                                int i2 = 0;
                                do {
                                    newInstance[i][i2] = optJSONArray2.optInt(i2);
                                    i2++;
                                } while (i2 < 2);
                            }
                        }
                    }
                    hashMap.put(next, newInstance);
                }
            }
            c48473J0r.LIZ = hashMap;
            c48473J0r.LIZIZ = str;
        }
        return c48473J0r;
    }
}
