package X;

import org.json.JSONObject;

/* loaded from: classes14.dex */
public final class TVS {
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(TVV.LJLIL);
    public int LIZ = Integer.MAX_VALUE;
    public int LIZIZ;

    public final boolean LIZ() {
        if (this.LIZ == -14) {
            return false;
        }
        this.LIZIZ = 1;
        return true;
    }

    public final void LIZIZ(int i, String str, long j, String str2, String str3, boolean z) {
        int i2;
        if (!C32777Cth.LIZ(0.1f, "ttlive_linkmic_aab_install")) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        C05630Jz.LIZ(this.LIZIZ, "is_aab_opt", jSONObject);
        if (z) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        C05630Jz.LIZ(i2, "is_silent_install", jSONObject);
        C05630Jz.LJI(jSONObject, "user_role", "audience");
        C05630Jz.LJI(jSONObject, "trigger_source", str);
        if (str2 != null && str2.length() > 0) {
            C05630Jz.LJI(jSONObject, "error_reason", str2);
        }
        if (str3 != null && str3.length() > 0) {
            C05630Jz.LJI(jSONObject, "error_msg", str3);
        }
        C05630Jz.LJI(jSONObject, "live_type", "live_studio");
        C0K2.LJIILIIL(i, 0, j, "ttlive_linkmic_aab_install", jSONObject);
    }
}
