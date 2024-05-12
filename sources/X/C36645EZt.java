package X;

import org.json.JSONObject;

/* renamed from: X.EZt, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36645EZt implements InterfaceC36644EZs<String> {
    public final /* synthetic */ String LIZ;

    @Override // X.InterfaceC36644EZs
    public final void onFail() {
    }

    public C36645EZt(String str) {
        this.LIZ = str;
    }

    @Override // X.InterfaceC36644EZs
    public final void onSuccess(String str) {
        JSONObject optJSONObject;
        String str2 = str;
        if (str2.length() == 0) {
            return;
        }
        try {
            JSONObject optJSONObject2 = new JSONObject(str2).optJSONObject("data");
            if (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("user_event")) == null) {
                return;
            }
            int optInt = optJSONObject.optInt("action_ai_disclaimer_show_times", 0);
            int optInt2 = optJSONObject.optInt("action_ai_guidance_hints_show_times", 0);
            if (optInt > 0) {
                C36651EZz.LIZ(this.LIZ, false);
            }
            if (optInt2 <= 0) {
                return;
            }
            C36651EZz.LIZJ(this.LIZ, false);
        } catch (Exception unused) {
        }
    }
}
