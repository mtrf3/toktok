package X;

import android.os.Bundle;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class R6E {
    public final String LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;
    public final String LIZLLL;
    public final String LJ;

    public final Bundle LIZ() {
        String str;
        Bundle bundle = new Bundle();
        if (o.LJ(this.LIZIZ, "mobile")) {
            str = "phone";
        } else {
            str = "email";
        }
        bundle.putString("platform", str);
        bundle.putString("enter_from", "force_update");
        String str2 = this.LIZ;
        o.LJI(str2);
        bundle.putString("conditional_login_ticket", str2);
        bundle.putString("otp_type", this.LIZIZ);
        if (o.LJ(this.LIZIZ, "mobile")) {
            bundle.putString("args_string_phone_number", this.LIZLLL);
        } else {
            bundle.putString("args_email", this.LJ);
        }
        bundle.putString("page", "login_force_reset_password");
        return bundle;
    }

    public R6E(JSONObject jSONObject) {
        String str;
        String str2;
        String str3;
        boolean z;
        boolean z2;
        if (jSONObject != null) {
            str = jSONObject.optString("mobile", "");
        } else {
            str = null;
        }
        this.LIZLLL = str;
        if (jSONObject != null) {
            str2 = jSONObject.optString("email", "");
        } else {
            str2 = null;
        }
        this.LJ = str2;
        if (jSONObject != null) {
            str3 = jSONObject.optString("conditional_login_ticket");
        } else {
            str3 = null;
        }
        this.LIZ = str3;
        String optString = jSONObject != null ? jSONObject.optString("otp_type") : null;
        this.LIZIZ = optString;
        if (str3 != null && str3.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (optString != null && optString.length() > 0 && (o.LJ(optString, "email") || o.LJ(optString, "mobile"))) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.LIZJ = z && z2;
    }
}
