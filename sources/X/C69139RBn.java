package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.account.bind.BindEmailCodeVerifyFragment;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.RBn, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C69139RBn<T> implements InterfaceC64592gB {
    public final /* synthetic */ BindEmailCodeVerifyFragment LJLIL;

    public C69139RBn(BindEmailCodeVerifyFragment bindEmailCodeVerifyFragment) {
        this.LJLIL = bindEmailCodeVerifyFragment;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        JSONObject optJSONObject;
        String optString;
        JSONObject optJSONObject2;
        R40 r40 = (R40) obj;
        BindEmailCodeVerifyFragment bindEmailCodeVerifyFragment = this.LJLIL;
        RC0.LJI(bindEmailCodeVerifyFragment.LLIIIILZ, bindEmailCodeVerifyFragment.LLIIII);
        User LIZJ = R41.LIZJ();
        JSONObject jSONObject = r40.LJIIIZ.LJ;
        String str = null;
        if (jSONObject != null && (optJSONObject2 = jSONObject.optJSONObject("data")) != null) {
            str = optJSONObject2.optString("email");
        }
        String str2 = "";
        if (str == null) {
            str = "";
        }
        Bundle arguments = this.LJLIL.getArguments();
        boolean z = false;
        if (arguments != null) {
            z = arguments.getBoolean("is_mandatory_two_sv", false);
        }
        if (!z) {
            LIZJ.setEmail(str);
            LIZJ.setEmailVerified(true);
            LIZJ.setHasEmail(true);
        }
        Bundle arguments2 = this.LJLIL.getArguments();
        o.LJI(arguments2);
        if (arguments2.getBoolean("show_success_toast", true)) {
            C5S1 c5s1 = new C5S1(C58725N2z.LIZ);
            c5s1.LIZLLL(this.LJLIL.getString(R.string.g1r));
            c5s1.LJ();
        }
        FMX.LJIIL("email_bundling_success", C78920UyC.LIZJ(1, "type").LIZ);
        if (((Boolean) this.LJLIL.LLIIJI.getValue()).booleanValue()) {
            C35936E8m c35936E8m = new C35936E8m();
            c35936E8m.LIZLLL("page", "Input Email Captcha");
            c35936E8m.LIZLLL("method", "set_by_email");
            c35936E8m.LIZIZ(System.currentTimeMillis() - this.LJLIL.LJLIL, "duration");
            FMX.LJIIL("set_up_proAccount", c35936E8m.LIZ);
        }
        Bundle arguments3 = this.LJLIL.getArguments();
        o.LJI(arguments3);
        Bundle bundle = new Bundle();
        bundle.putString("platform", "email");
        bundle.putString("bound_email", str);
        JSONObject jSONObject2 = r40.LJIIIZ.LJ;
        if (jSONObject2 != null && (optJSONObject = jSONObject2.optJSONObject("data")) != null && (optString = optJSONObject.optString("ticket")) != null) {
            str2 = optString;
        }
        RBV.LJIILL(bundle, str2);
        arguments3.putBundle("final_data", bundle);
        BindEmailCodeVerifyFragment bindEmailCodeVerifyFragment2 = this.LJLIL;
        Bundle arguments4 = bindEmailCodeVerifyFragment2.getArguments();
        o.LJI(arguments4);
        bindEmailCodeVerifyFragment2.Dl(arguments4);
    }
}
