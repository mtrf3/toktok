package X;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class EZ7 implements InterfaceC38012Evw {
    @Override // X.InterfaceC38012Evw
    public final void call(C38048EwW c38048EwW, JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        QJY.LJI(hashMap, false);
        for (Map.Entry entry : hashMap.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (!C38354F3m.LJ(str) && !C38354F3m.LJ(str2)) {
                try {
                    jSONObject.put(str, str2);
                } catch (JSONException e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
        }
        try {
            jSONObject.put("code", 1);
        } catch (JSONException e2) {
            C16880lQ.LLLLIIL(e2);
        }
    }
}
