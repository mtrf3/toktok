package X;

import android.os.Bundle;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.account.login.auth.ui.login.LoginDialogFragment;
import com.ss.android.ugc.aweme.account.login.model.LoginMethodName;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS181S0100000_15;
import kotlin.jvm.internal.o;

/* renamed from: X.XiG, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85576XiG extends AbstractC85577XiH {
    @Override // X.InterfaceC85586XiQ
    public final void LJIIL(int i) {
    }

    @Override // X.InterfaceC85586XiQ
    public final boolean LJJLIIIJLLLLLLLZ() {
        return false;
    }

    @Override // X.InterfaceC85586XiQ
    public final boolean LJJLIIJ() {
        return false;
    }

    @Override // X.InterfaceC85586XiQ
    public final boolean LJJLIL() {
        return false;
    }

    @Override // X.InterfaceC85586XiQ
    public final InterfaceC85593XiX getContent() {
        LoginDialogFragment loginDialogFragment = new LoginDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putBoolean("is_signup_view", true);
        bundle.putString("view_type_string", "signup");
        LIZ(bundle);
        loginDialogFragment.setArguments(bundle);
        return new C85587XiR(loginDialogFragment);
    }

    @Override // X.AbstractC85577XiH
    public final Bundle LIZJ() {
        return LIZIZ().nv0();
    }

    @Override // X.InterfaceC85586XiQ
    public final void LJJLJ(Bundle bundle) {
        boolean z;
        AccountService.LJIJ().tryInit();
        this.LIZ.activityConfiguration(new AqS181S0100000_15(this, 0));
        LJI();
        if (bundle == null) {
            java.util.Map LIZJ = C68972R5c.LIZJ(LIZIZ().nv0());
            if (LIZJ == null) {
                LIZJ = new LinkedHashMap();
            }
            if (!TextUtils.isEmpty(LIZIZ().iv0())) {
                String iv0 = LIZIZ().iv0();
                o.LJIIIIZZ(iv0, "dependencies.forceLoginTrigger");
                LIZJ.put("force_login_trigger", iv0);
            }
            LIZJ.put("is_skippable", Integer.valueOf(LIZIZ().sv0() ? 1 : 0));
            LoginMethodName loginMethodName = C68517Qun.LIZ.LJIIJJI().getLoginMethodName();
            int i = 0;
            if (LIZIZ().nv0().getBoolean("force_use_default_login_method", false) || LIZIZ().nv0().getBoolean("is_fullscreen_dialog")) {
                z = true;
            } else {
                z = false;
            }
            if (loginMethodName == LoginMethodName.DEFAULT || z) {
                i = 1;
            }
            LIZIZ().nv0().putInt("login_last_time", i ^ 1);
            LIZIZ().nv0().putString("enter_type", "click_sign_up");
            LIZIZ().nv0().putString("login_panel_type", "signup_login");
            String enterFrom = LIZIZ().getEnterFrom();
            o.LJIIIIZZ(enterFrom, "dependencies.enterFrom");
            String enterMethod = LIZIZ().getEnterMethod();
            o.LJIIIIZZ(enterMethod, "dependencies.enterMethod");
            String str = (String) LIZIZ().LJLJLLL.getValue();
            o.LJIIIIZZ(str, "dependencies.enterType");
            String string = LIZIZ().nv0().getString("channel");
            if (string == null) {
                string = "";
            }
            List<C85542Xhi> hv0 = LIZIZ().hv0();
            int size = LIZIZ().hv0().size();
            String jv0 = LIZIZ().jv0();
            o.LJIIIIZZ(jv0, "dependencies.groupId");
            boolean qv0 = LIZIZ().qv0();
            String str2 = (String) LIZIZ().LJLLILLLL.getValue();
            o.LJIIIIZZ(str2, "dependencies.authorId");
            Bundle nv0 = LIZIZ().nv0();
            boolean rv0 = LIZIZ().rv0();
            String str3 = (String) LIZIZ().LJLLJ.getValue();
            if (str3 == null) {
                str3 = "";
            }
            C68971R5b.LIZIZ(enterFrom, enterMethod, str, string, LIZJ, hv0, size, jv0, qv0, str2, "signup_login", nv0, rv0, str3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C85576XiG(ActivityC86117Xqz activity, R6A signupListener, InterfaceC85592XiW signupContentListener) {
        super(activity, signupListener, signupContentListener);
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(signupListener, "signupListener");
        o.LJIIIZ(signupContentListener, "signupContentListener");
    }
}
