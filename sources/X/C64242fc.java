package X;

import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.2fc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C64242fc {
    public static final /* synthetic */ int LIZ = 0;

    public static HashMap LIZ(String logExtra) {
        o.LJIIIZ(logExtra, "logExtra");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject = new JSONObject(logExtra);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        Iterator<String> keys = jSONObject.keys();
        HashMap hashMap = new HashMap();
        while (keys.hasNext()) {
            String key = keys.next();
            String value = jSONObject.optString(key);
            keys.remove();
            o.LJIIIIZZ(key, "key");
            o.LJIIIIZZ(value, "value");
            hashMap.put(key, value);
        }
        return hashMap;
    }
}
