package X;

import com.bytedance.android.livesdkapi.host.IHostUser;
import org.json.JSONObject;

/* renamed from: X.BfW, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29350BfW extends AbstractC38123Exj<JSONObject, Object> {
    @Override // X.AbstractC38123Exj
    public final void onTerminate() {
    }

    @Override // X.AbstractC38123Exj
    public final void invoke(JSONObject jSONObject, C38131Exr c38131Exr) {
        JSONObject jSONObject2 = jSONObject;
        ActivityC45651qj LIZ = C29306Beo.LIZ(c38131Exr.LIZ);
        if (LIZ != null) {
            ((IHostUser) CN1.LIZ(IHostUser.class)).bindMobile(LIZ, jSONObject2.optString("source", ""), null, null, new C29351BfX(this));
        } else {
            finishWithFailure();
        }
    }
}
