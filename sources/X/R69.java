package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.app.services.IFeed0VVManagerService;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes12.dex */
public final class R69 implements View.OnClickListener {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ R6A LJLJI;
    public final /* synthetic */ Context LJLJJI;
    public final /* synthetic */ Bundle LJLJJL;

    public R69(String str, String str2, R6A r6a, Context context, Bundle bundle) {
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = r6a;
        this.LJLJJI = context;
        this.LJLJJL = bundle;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        SmartRoute LIZJ;
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZLLL("enter_from", this.LJLIL);
        c35936E8m.LIZLLL("enter_method", this.LJLILLLLZI);
        if (C62783OkV.LIZ()) {
            str = "signup_login";
        } else {
            str = "signup";
        }
        c35936E8m.LIZLLL("login_panel_type", str);
        FMX.LJIIL("click_phone_email", c35936E8m.LIZ);
        this.LJLJI.LJJLIL("click_platform");
        IFeed0VVManagerService iFeed0VVManagerService = (IFeed0VVManagerService) C58725N2z.LIZIZ(IFeed0VVManagerService.class);
        if (iFeed0VVManagerService != null) {
            iFeed0VVManagerService.log("click_sign_up");
            iFeed0VVManagerService.LIZ("SIGNUP");
        }
        if (a.LIZIZ().LJIILLIIL()) {
            SmartRoute LIZIZ = R67.LIZIZ(this.LJLJJI);
            Bundle bundle = this.LJLJJL;
            R6A r6a = this.LJLJI;
            if (bundle != null) {
                bundle.putBoolean("age_gate_block", true);
                LIZIZ.withParam(bundle);
            }
            if (!r6a.LJLLLLLL(LIZIZ)) {
                LIZIZ.open();
                return;
            }
            return;
        }
        if (C62783OkV.LIZ()) {
            Context context = this.LJLJJI;
            o.LJIIIZ(context, "context");
            LIZJ = SmartRouter.buildRoute(context, "//account/login/signup_or_login");
            LIZJ.withParam("current_scene", EnumC69116RAq.SIGN_UP.getValue());
            LIZJ.withParam("next_page", EnumC69113RAn.COMBINED_LOGIN_SIGN_UP.getValue());
            o.LJIIIIZZ(LIZJ, "buildRoute(context, SIGN…INED_LOGIN_SIGN_UP.value)");
        } else {
            LIZJ = R67.LIZJ(this.LJLJJI);
        }
        Bundle bundle2 = this.LJLJJL;
        if (bundle2 != null) {
            LIZJ.withParam(bundle2);
        }
        if (this.LJLJI.LJLLLLLL(LIZJ)) {
            return;
        }
        LIZJ.open();
    }
}
