package X;

import com.bytedance.android.livesdkapi.host.IHostUser;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.BPf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28727BPf extends C0NE {
    public static C28727BPf LIZ;

    @Override // X.C0NE
    public final JSONObject LJI() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("user_id", String.valueOf(((IHostUser) CN1.LIZ(IHostUser.class)).getCurUserId()));
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        return jSONObject;
    }
}
