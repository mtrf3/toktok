package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.a4Z, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92055a4Z {
    public static final List<C92285a8H> LIZ = C47261Igj.LJJIJIIJI(new C92285a8H("pipo_checkout", "pipo_ui_default_checkout.json"), new C92285a8H("pipo_cashier_components", "pipo_ui_default_components.json"));

    public static final java.util.Map<String, String> LIZ(String str) {
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            o.LJIIIIZZ(keys, "obj.keys()");
            while (keys.hasNext()) {
                String key = keys.next();
                o.LJIIIIZZ(key, "key");
                String optString = jSONObject.optString(key);
                o.LJIIIIZZ(optString, "obj.optString(key)");
                hashMap.put(key, optString);
            }
        } catch (Throwable unused) {
            System.out.println((Object) "read asset error");
        }
        return hashMap;
    }
}
