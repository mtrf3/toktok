package X;

import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.7qh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C198517qh {
    public final HashMap<String, Object> LIZ = new HashMap<>();

    public final JSONObject LJ() {
        try {
            return new JSONObject(this.LIZ);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    public static C198517qh LJFF(JSONObject jSONObject) {
        C198517qh c198517qh = new C198517qh();
        if (jSONObject != null && jSONObject.length() > 0) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    c198517qh.LIZLLL(next, JSONObjectProtectorUtils.getString(jSONObject, next));
                } catch (JSONException unused) {
                }
            }
        }
        return c198517qh;
    }

    public final void LIZ(Boolean bool, String str) {
        this.LIZ.put(str, bool);
    }

    public final void LIZIZ(Integer num, String str) {
        this.LIZ.put(str, num);
    }

    public final void LIZJ(Long l, String str) {
        this.LIZ.put(str, l);
    }

    public final void LIZLLL(String str, String str2) {
        this.LIZ.put(str, str2);
    }
}
