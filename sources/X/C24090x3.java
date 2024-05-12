package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0x3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C24090x3 {
    public String LIZ;
    public String LIZIZ;
    public List<C23990wt> LIZJ = new ArrayList();
    public java.util.Map<String, C23990wt> LIZLLL = new HashMap();

    public C24090x3(JSONObject jSONObject) {
        this.LIZ = jSONObject.optString("payment_method_id");
        jSONObject.optString("payment_method_type");
        jSONObject.optString("payment_method");
        jSONObject.optString("masked_identity");
        jSONObject.optString("icon_url");
        jSONObject.optString("dark_mode_icon_url");
        jSONObject.optBoolean("is_primary");
        this.LIZIZ = jSONObject.optString("payment_method_token");
        jSONObject.optString("bind_time");
        jSONObject.optString("recent_used_time");
        JSONArray optJSONArray = jSONObject.optJSONArray("needed_elements");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                try {
                    C23990wt c23990wt = new C23990wt((JSONObject) optJSONArray.get(i));
                    ((ArrayList) this.LIZJ).add(c23990wt);
                    ((ArrayList) this.LIZJ).addAll(c23990wt.LJIIIIZZ);
                    Iterator it = ((ArrayList) c23990wt.LJIIIIZZ).iterator();
                    while (it.hasNext()) {
                        C23990wt c23990wt2 = (C23990wt) it.next();
                        ((HashMap) this.LIZLLL).put(c23990wt2.LIZ, c23990wt2);
                    }
                    ((HashMap) this.LIZLLL).put(c23990wt.LIZ, c23990wt);
                } catch (JSONException e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
        }
    }
}
