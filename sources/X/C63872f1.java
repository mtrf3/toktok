package X;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.2f1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C63872f1 {
    public static final ConcurrentHashMap<String, Object> LIZ(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            ConcurrentHashMap<String, Object> concurrentHashMap = new ConcurrentHashMap<>();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String key = keys.next();
                o.LJIIIIZZ(key, "key");
                Object obj = jSONObject.get(key);
                o.LJIIIIZZ(obj, "jsonObject.get(key)");
                concurrentHashMap.put(key, obj);
            }
            return concurrentHashMap;
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    public static final String LIZIZ(java.util.Map<String, ? extends Object> map) {
        if (map != null && !map.isEmpty()) {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
            return jSONObject.toString();
        }
        return null;
    }
}
