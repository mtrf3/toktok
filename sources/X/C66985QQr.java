package X;

import android.text.TextUtils;
import defpackage.i0;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.QQr, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66985QQr {
    public int LIZ;
    public int LIZIZ;
    public String LIZJ;
    public List<String> LIZLLL;

    public final boolean LIZ() {
        List<String> list;
        if (this.LIZ != 0 && this.LIZIZ != 0 && !TextUtils.isEmpty(this.LIZJ) && (list = this.LIZLLL) != null && ((ArrayList) list).size() > 0) {
            return true;
        }
        return false;
    }

    public static C66985QQr LIZIZ(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        C66985QQr c66985QQr = new C66985QQr();
        JSONArray optJSONArray = jSONObject.optJSONArray("urls");
        if (optJSONArray != null) {
            c66985QQr.LIZLLL = new ArrayList();
            for (int i = 0; i < optJSONArray.length(); i++) {
                String optString = optJSONArray.optString(i);
                if (!TextUtils.isEmpty(optString)) {
                    if (!optString.endsWith("/ws/v2")) {
                        if (optString.endsWith("/")) {
                            optString = i0.LJFF(optString, "ws/v2");
                        } else {
                            optString = i0.LJFF(optString, "/ws/v2");
                        }
                    }
                    c66985QQr.LIZLLL.add(optString);
                }
            }
        }
        c66985QQr.LIZ = jSONObject.optInt("aid");
        c66985QQr.LIZIZ = jSONObject.optInt("pid");
        c66985QQr.LIZJ = jSONObject.optString("app_key");
        return c66985QQr;
    }
}
