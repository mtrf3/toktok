package X;

import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.N0m, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58660N0m {
    public static java.util.Map LIZ(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            o.LJIIIIZZ(keys, "jsonObject.keys()");
            while (keys.hasNext()) {
                String next = keys.next();
                String string = JSONObjectProtectorUtils.getString(jSONObject, next);
                o.LJIIIIZZ(string, "jsonObject.getString(next)");
                hashMap.put(next, string);
            }
        }
        return hashMap;
    }
}
