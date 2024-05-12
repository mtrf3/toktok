package X;

import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.2kI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C67142kI {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, HashMap hashMap) {
        if (str == null || str.length() == 0) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String key = keys.next();
                String value = JSONObjectProtectorUtils.getString(jSONObject, key);
                o.LJIIIIZZ(key, "key");
                o.LJIIIIZZ(value, "value");
                hashMap.put(key, value);
            }
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public static void LIZIZ(C188727au c188727au, String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                c188727au.LJI(next, JSONObjectProtectorUtils.getString(jSONObject, next));
            }
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
    }
}
