package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.account.changemail.ChangeEmailVerifyFragment;
import com.ss.android.ugc.aweme.account.login.model.AccountPassLoginMethod;
import com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod;
import com.ss.android.ugc.aweme.account.login.model.LoginMethodName;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.RBl, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C69137RBl<T> implements InterfaceC64592gB {
    public final /* synthetic */ ChangeEmailVerifyFragment LJLIL;

    public C69137RBl(ChangeEmailVerifyFragment changeEmailVerifyFragment) {
        this.LJLIL = changeEmailVerifyFragment;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        R40 r40 = (R40) obj;
        ChangeEmailVerifyFragment changeEmailVerifyFragment = this.LJLIL;
        RC0.LJI(changeEmailVerifyFragment.LLIIIILZ, changeEmailVerifyFragment.LLIIII);
        RBV.LJIILLIIL(this.LJLIL, "");
        User LIZJ = R41.LIZJ();
        C68517Qun c68517Qun = C68517Qun.LIZ;
        String uid = LIZJ.getUid();
        o.LJIIIIZZ(uid, "user.uid");
        String newName = this.LJLIL.getEmail();
        synchronized (c68517Qun) {
            o.LJIIIZ(newName, "newName");
            Iterator it = ((ArrayList) C68517Qun.LIZJ).iterator();
            boolean z = false;
            while (it.hasNext()) {
                BaseLoginMethod baseLoginMethod = (BaseLoginMethod) it.next();
                if (o.LJ(baseLoginMethod.getUid(), uid) && baseLoginMethod.getLoginMethodName() == LoginMethodName.EMAIL_PASS) {
                    ((AccountPassLoginMethod) baseLoginMethod).setName(newName);
                    z = true;
                }
            }
            str = null;
            if (z) {
                C68517Qun.LIZIZ.LIZJ(C68517Qun.LIZJ, null);
            }
        }
        JSONObject jSONObject = r40.LJIIIZ.LJ;
        if (jSONObject == null || (optJSONObject2 = jSONObject.optJSONObject("data")) == null || (str2 = optJSONObject2.optString("email")) == null) {
            str2 = "";
        }
        LIZJ.setEmail(str2);
        LIZJ.setEmailVerified(true);
        LIZJ.setHasEmail(true);
        Bundle bundle = new Bundle();
        ChangeEmailVerifyFragment changeEmailVerifyFragment2 = this.LJLIL;
        bundle.putString("platform", "email");
        JSONObject jSONObject2 = r40.LJIIIZ.LJ;
        if (jSONObject2 == null || (optJSONObject = jSONObject2.optJSONObject("data")) == null || (str3 = optJSONObject.optString("ticket")) == null) {
            str3 = "";
        }
        RBV.LJIILL(bundle, str3);
        Bundle arguments = changeEmailVerifyFragment2.getArguments();
        o.LJI(arguments);
        arguments.putBundle("final_data", bundle);
        Bundle arguments2 = this.LJLIL.getArguments();
        if (arguments2 != null && arguments2.getBoolean("show_modify_email_success_toast", false)) {
            C5S1 c5s1 = new C5S1(C58725N2z.LIZ);
            c5s1.LIZLLL(this.LJLIL.getString(R.string.c_3));
            c5s1.LJ();
        } else {
            Bundle arguments3 = this.LJLIL.getArguments();
            if (arguments3 != null && arguments3.getBoolean("show_success_toast", true)) {
                C5S1 c5s12 = new C5S1(C58725N2z.LIZ);
                c5s12.LIZLLL(this.LJLIL.getString(R.string.g22));
                c5s12.LJ();
            }
        }
        Bundle arguments4 = this.LJLIL.getArguments();
        if (arguments4 != null && arguments4.getBoolean("is_from_prompt", false)) {
            C188727au c188727au = new C188727au();
            Bundle arguments5 = this.LJLIL.getArguments();
            if (arguments5 != null) {
                str4 = arguments5.getString("enter_from", "");
            } else {
                str4 = null;
            }
            c188727au.LJIIIZ("enter_from", str4);
            Bundle arguments6 = this.LJLIL.getArguments();
            if (arguments6 != null) {
                str5 = arguments6.getString("enter_method", "");
            } else {
                str5 = null;
            }
            c188727au.LJIIIZ("enter_method", str5);
            Bundle arguments7 = this.LJLIL.getArguments();
            if (arguments7 != null) {
                str6 = arguments7.getString("page", "");
            } else {
                str6 = null;
            }
            c188727au.LJIIIZ("page", str6);
            c188727au.LJIIIZ("bind_status", "changed_to_new_email");
            FMX.LJIIL("email_bind_status", c188727au.LIZ);
        }
        String enterFrom = this.LJLIL.getEnterFrom();
        Bundle arguments8 = this.LJLIL.getArguments();
        if (arguments8 != null) {
            str = arguments8.getString("page", "");
        }
        C1JD.LJJIII(1, r40.LJIIIZ.LIZ, enterFrom, str, this.LJLIL.getEnterMethod());
        FMX.LJIIL("email_bundling_success", C78920UyC.LIZJ(2, "type").LIZ);
        if (this.LJLIL.lm()) {
            C35936E8m c35936E8m = new C35936E8m();
            c35936E8m.LIZLLL("page", "Input Email Captcha");
            c35936E8m.LIZLLL("method", "use_new_email");
            c35936E8m.LIZIZ(System.currentTimeMillis() - this.LJLIL.LJLIL, "duration");
            FMX.LJIIL("set_up_proAccount", c35936E8m.LIZ);
        }
        ChangeEmailVerifyFragment changeEmailVerifyFragment3 = this.LJLIL;
        String enterFrom2 = changeEmailVerifyFragment3.getEnterFrom();
        o.LJIIIIZZ(enterFrom2, "enterFrom");
        String enterMethod = this.LJLIL.getEnterMethod();
        o.LJIIIIZZ(enterMethod, "enterMethod");
        C85631Xj9.LJIIJ(changeEmailVerifyFragment3, false, enterFrom2, enterMethod, String.valueOf(r40.LJIIIZ.LIZIZ), 1, false);
        ChangeEmailVerifyFragment changeEmailVerifyFragment4 = this.LJLIL;
        Bundle arguments9 = changeEmailVerifyFragment4.getArguments();
        o.LJI(arguments9);
        changeEmailVerifyFragment4.Dl(arguments9);
    }
}
