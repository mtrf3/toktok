package X;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: X.1gS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C39281gS extends C275816k {
    public final boolean LIZIZ;
    public boolean LIZJ;
    public java.util.Map<String, JSONObject> LIZLLL;

    public C39281gS(C275716j c275716j) {
        JSONObject optJSONObject;
        c275716j.getClass();
        this.LIZ = false;
        this.LIZIZ = c275716j.LIZ;
        C78555UsJ.LJJIFFI(null);
        JSONObject jSONObject = c275716j.LIZIZ;
        if (jSONObject == null) {
            return;
        }
        try {
            this.LIZ = C275816k.LIZ(jSONObject, "is_enable", true);
        } catch (Throwable th) {
            th.getMessage();
        }
        try {
            jSONObject.optString("appid", "");
            if (this.LIZLLL == null) {
                this.LIZLLL = new HashMap();
            }
            C275816k.LIZ(jSONObject, "is_enable_monitor", false);
            this.LIZJ = C275816k.LIZ(jSONObject, "is_enable_net_opt", false);
            ((HashMap) this.LIZLLL).clear();
            JSONObject optJSONObject2 = jSONObject.optJSONObject("settings");
            if (optJSONObject2 == null) {
                return;
            }
            Iterator<String> keys = optJSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!TextUtils.isEmpty(next) && (optJSONObject = optJSONObject2.optJSONObject(next)) != null) {
                    ((HashMap) this.LIZLLL).put(next, optJSONObject);
                }
            }
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }
}
