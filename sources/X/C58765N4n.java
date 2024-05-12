package X;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.N4n, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C58765N4n {
    public JSONObject LIZ;

    public final void LIZ(String str, Object obj) {
        try {
            if (this.LIZ == null) {
                this.LIZ = new JSONObject();
            }
            this.LIZ.put(str, obj);
        } catch (JSONException e) {
            C78983UzD.LJIIZILJ(e);
        }
    }
}
