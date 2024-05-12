package Y;

import X.C188727au;
import X.C35936E8m;
import X.C85926Xnu;
import X.C85927Xnv;
import X.C85934Xo2;
import X.DialogC85670Xjm;
import X.FMX;
import X.V1B;
import android.content.Context;
import android.view.View;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.PhoneLoginFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.PhoneSignUpFragment;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class ACListenerS33S0110000_15 implements View.OnClickListener {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                return;
            case 1:
                onClick$1(this, view);
                return;
            case 2:
                onClick$2(this, view);
                return;
            case 3:
                onClick$3(this, view);
                return;
            case 4:
                onClick$4(this, view);
                return;
            default:
                return;
        }
    }

    public static final void onClick$0(ACListenerS33S0110000_15 aCListenerS33S0110000_15, View view) {
        String str;
        PhoneLoginFragment phoneLoginFragment = (PhoneLoginFragment) aCListenerS33S0110000_15.l0;
        boolean z = aCListenerS33S0110000_15.z1;
        phoneLoginFragment.getClass();
        if (z) {
            str = "phone_verification_click_whatsapp";
        } else {
            str = "phone_verification_click_sms";
        }
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZLLL("enter_type", phoneLoginFragment.LJLJL);
        FMX.LJIIL(str, c35936E8m.LIZ);
        ((PhoneLoginFragment) aCListenerS33S0110000_15.l0).Tl(aCListenerS33S0110000_15.z1, true);
        DialogC85670Xjm dialogC85670Xjm = ((PhoneLoginFragment) aCListenerS33S0110000_15.l0).LJZL;
        if (dialogC85670Xjm != null) {
            V1B.LJLILLLLZI(dialogC85670Xjm);
        }
    }

    public static final void onClick$1(ACListenerS33S0110000_15 aCListenerS33S0110000_15, View view) {
        String str;
        PhoneLoginFragment phoneLoginFragment = (PhoneLoginFragment) aCListenerS33S0110000_15.l0;
        boolean z = !aCListenerS33S0110000_15.z1;
        phoneLoginFragment.getClass();
        if (z) {
            str = "phone_verification_click_whatsapp";
        } else {
            str = "phone_verification_click_sms";
        }
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZLLL("enter_type", phoneLoginFragment.LJLJL);
        FMX.LJIIL(str, c35936E8m.LIZ);
        ((PhoneLoginFragment) aCListenerS33S0110000_15.l0).Tl(!aCListenerS33S0110000_15.z1, true);
        DialogC85670Xjm dialogC85670Xjm = ((PhoneLoginFragment) aCListenerS33S0110000_15.l0).LJZL;
        if (dialogC85670Xjm != null) {
            V1B.LJLILLLLZI(dialogC85670Xjm);
        }
    }

    public static final void onClick$2(ACListenerS33S0110000_15 aCListenerS33S0110000_15, View view) {
        String str;
        PhoneSignUpFragment phoneSignUpFragment = (PhoneSignUpFragment) aCListenerS33S0110000_15.l0;
        boolean z = aCListenerS33S0110000_15.z1;
        phoneSignUpFragment.getClass();
        if (z) {
            str = "phone_verification_click_whatsapp";
        } else {
            str = "phone_verification_click_sms";
        }
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZLLL("enter_type", phoneSignUpFragment.LJLJL);
        FMX.LJIIL(str, c35936E8m.LIZ);
        ((PhoneSignUpFragment) aCListenerS33S0110000_15.l0).Sl(aCListenerS33S0110000_15.z1, true);
        DialogC85670Xjm dialogC85670Xjm = ((PhoneSignUpFragment) aCListenerS33S0110000_15.l0).LJZL;
        if (dialogC85670Xjm != null) {
            V1B.LJLILLLLZI(dialogC85670Xjm);
        }
    }

    public static final void onClick$3(ACListenerS33S0110000_15 aCListenerS33S0110000_15, View view) {
        String str;
        PhoneSignUpFragment phoneSignUpFragment = (PhoneSignUpFragment) aCListenerS33S0110000_15.l0;
        boolean z = !aCListenerS33S0110000_15.z1;
        phoneSignUpFragment.getClass();
        if (z) {
            str = "phone_verification_click_whatsapp";
        } else {
            str = "phone_verification_click_sms";
        }
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZLLL("enter_type", phoneSignUpFragment.LJLJL);
        FMX.LJIIL(str, c35936E8m.LIZ);
        ((PhoneSignUpFragment) aCListenerS33S0110000_15.l0).Sl(!aCListenerS33S0110000_15.z1, true);
        DialogC85670Xjm dialogC85670Xjm = ((PhoneSignUpFragment) aCListenerS33S0110000_15.l0).LJZL;
        if (dialogC85670Xjm != null) {
            V1B.LJLILLLLZI(dialogC85670Xjm);
        }
    }

    public static final void onClick$4(ACListenerS33S0110000_15 aCListenerS33S0110000_15, View v) {
        o.LJIIIZ(v, "v");
        if (((C85927Xnv) aCListenerS33S0110000_15.l0).LJIILLIIL()) {
            Context context = v.getContext();
            o.LJIIIIZZ(context, "v.context");
            if (!C85926Xnu.LIZIZ(context)) {
                return;
            }
        }
        String str = ((C85927Xnv) aCListenerS33S0110000_15.l0).LJLJJLL.schema;
        if (str.length() > 0) {
            SmartRoute buildRoute = SmartRouter.buildRoute(v.getContext(), str);
            buildRoute.withParam("enter_from", "settings_page");
            buildRoute.open();
        }
        C85927Xnv c85927Xnv = (C85927Xnv) aCListenerS33S0110000_15.l0;
        if (aCListenerS33S0110000_15.z1) {
            if (o.LJ(c85927Xnv.LJLJJLL.itemId, "sms")) {
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("previous_page", "notification_setting_page");
                c188727au.LJIIIZ("page_name", "sms_setting_page");
                c188727au.LJIIIZ("exp_name", "sms_notification");
                FMX.LJIIL("enter_sms_notification_setting", c188727au.LIZ);
                return;
            }
        } else {
            c85927Xnv.getClass();
        }
        C85934Xo2.LIZJ(c85927Xnv.LJLJJLL.itemId);
    }

    public ACListenerS33S0110000_15(Object obj, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z1 = z;
    }
}
