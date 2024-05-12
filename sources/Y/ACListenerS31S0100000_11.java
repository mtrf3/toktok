package Y;

import X.AbstractC73635Sv9;
import X.ActivityC45651qj;
import X.C03880Dg;
import X.C0JU;
import X.C198517qh;
import X.C242869g2;
import X.C252949wI;
import X.C35936E8m;
import X.C40450FuA;
import X.C40700FyC;
import X.C65300Pk0;
import X.C69047R7z;
import X.C69054R8g;
import X.C69060R8m;
import X.C69093R9t;
import X.C69101RAb;
import X.C69134RBi;
import X.C69135RBj;
import X.C73636SvA;
import X.C74088T5w;
import X.C74090T5y;
import X.C81273Vv3;
import X.C85144XbI;
import X.C85579XiJ;
import X.C85631Xj9;
import X.DialogC25756A8y;
import X.DialogC66909QNt;
import X.DialogC68993R5x;
import X.EnumC62956OnI;
import X.EnumC66913QNx;
import X.EnumC69113RAn;
import X.EnumC69116RAq;
import X.FMX;
import X.HG3;
import X.Q13;
import X.Q6Z;
import X.R41;
import X.R60;
import X.R67;
import X.R8U;
import X.R8V;
import X.R9N;
import X.RBV;
import X.RC0;
import X.RC3;
import X.RC4;
import X.RC9;
import X.RCH;
import X.RCX;
import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.router.SmartRoute;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.account.agegate.ftc.FtcCreatePasswordFragment;
import com.ss.android.ugc.aweme.account.changemail.VerifyEmailBeforeChangeFragment;
import com.ss.android.ugc.aweme.account.login.auth.ui.ru_instant_login.RuInstantLoginBlockFragment;
import com.ss.android.ugc.aweme.account.login.rememberaccount.LoginMethodListActivity;
import com.ss.android.ugc.aweme.account.login.rememberaccount.OneClickLoginViewModel;
import com.ss.android.ugc.aweme.account.login.ui.CountDownTimer;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.ChildrenChangePasswordFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CombinedEmailSignupLoginFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.EmailSignUpFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputPhoneFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.PhoneNumRecycleProcessFragment;
import com.ss.android.ugc.aweme.account.setpwd.BaseUpdatePasswordFragment;
import com.ss.android.ugc.aweme.account.setpwd.VerifyPasswordFragment;
import com.ss.android.ugc.aweme.account.ui.BindOrModifyPhoneActivity;
import com.ss.android.ugc.aweme.services.BindService;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS161S0100000_11;
import kotlin.jvm.internal.AqS177S0100000_11;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import yq4.a;

/* loaded from: classes12.dex */
public class ACListenerS31S0100000_11 implements View.OnClickListener {
    public final int $t;
    public Object l0;

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
            case 5:
                onClick$5(this, view);
                return;
            case 6:
                onClick$6(this, view);
                return;
            case 7:
                onClick$7(this, view);
                return;
            case 8:
                onClick$8(this, view);
                return;
            case 9:
                onClick$9(this, view);
                return;
            case 10:
                onClick$10(this, view);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                onClick$11(this, view);
                return;
            case 12:
                onClick$12(this, view);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                onClick$13(this, view);
                return;
            case 14:
                onClick$14(this, view);
                return;
            case 15:
                onClick$15(this, view);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                onClick$16(this, view);
                return;
            case 17:
                onClick$17(this, view);
                return;
            case 18:
                onClick$18(this, view);
                return;
            case 19:
                onClick$19(this, view);
                return;
            case 20:
                onClick$20(this, view);
                return;
            case 21:
                onClick$21(this, view);
                return;
            case 22:
                onClick$22(this, view);
                return;
            case 23:
                onClick$23(this, view);
                return;
            case 24:
                onClick$24(this, view);
                return;
            default:
                return;
        }
    }

    public ACListenerS31S0100000_11(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onClick$0(ACListenerS31S0100000_11 aCListenerS31S0100000_11, View view) {
        ((FtcCreatePasswordFragment) aCListenerS31S0100000_11.l0).Pl();
        FtcCreatePasswordFragment ftcCreatePasswordFragment = (FtcCreatePasswordFragment) aCListenerS31S0100000_11.l0;
        RC4 rc4 = ftcCreatePasswordFragment.LJZL;
        if (rc4 != null) {
            String str = (String) ftcCreatePasswordFragment.LLD.getValue();
            String password = ((C74090T5y) ((FtcCreatePasswordFragment) aCListenerS31S0100000_11.l0)._$_findCachedViewById(R.id.dp2)).getText();
            o.LJIIIZ(password, "password");
            if (rc4.LIZIZ) {
                RC9 rc9 = rc4.LIZLLL;
                AqS161S0100000_11 aqS161S0100000_11 = new AqS161S0100000_11(rc4, 113);
                AqS177S0100000_11 aqS177S0100000_11 = new AqS177S0100000_11(rc4, 45);
                rc9.getClass();
                LinkedHashMap LIZ = C0JU.LIZ("rules_version", "v2");
                LIZ.putAll(C69093R9t.LJIIIIZZ());
                rc9.LIZ.LJIILL(password, LIZ, new RC3(aqS161S0100000_11, aqS177S0100000_11));
                return;
            }
            RC9 rc92 = rc4.LIZLLL;
            if (str == null) {
                str = "";
            }
            AqS177S0100000_11 aqS177S0100000_112 = new AqS177S0100000_11(rc4, 46);
            AqS177S0100000_11 aqS177S0100000_113 = new AqS177S0100000_11(rc4, 47);
            rc92.getClass();
            LinkedHashMap LIZ2 = C0JU.LIZ("rules_version", "v2");
            LIZ2.putAll(C69093R9t.LJIIIIZZ());
            rc92.LIZ.LJIJJLI(str, password, LIZ2, new C69047R7z(aqS177S0100000_113, aqS177S0100000_112));
            FMX.LJIIL("click_create_password_next", new C35936E8m().LIZ);
            return;
        }
        o.LJIJI("presenter");
        throw null;
    }

    public static final void onClick$1(ACListenerS31S0100000_11 aCListenerS31S0100000_11, View view) {
        CountDownTimer countDownTimer;
        if (((VerifyEmailBeforeChangeFragment) aCListenerS31S0100000_11.l0).LLIIJI.LIZ()) {
            ((VerifyEmailBeforeChangeFragment) aCListenerS31S0100000_11.l0).Wl();
            return;
        }
        if (R41.LIZJ().isPhoneBinded() && !TextUtils.isEmpty(R41.LIZJ().getBindPhone())) {
            String phone = R41.LIZJ().getBindPhone();
            ActivityC45651qj mo49getActivity = ((VerifyEmailBeforeChangeFragment) aCListenerS31S0100000_11.l0).mo49getActivity();
            o.LJIIIIZZ(phone, "phone");
            C69135RBj LIZ = C69134RBi.LIZ(mo49getActivity, phone, ((VerifyEmailBeforeChangeFragment) aCListenerS31S0100000_11.l0).xl());
            if (LIZ != null && (countDownTimer = LIZ.LIZ) != null && countDownTimer.isRunning()) {
                ((VerifyEmailBeforeChangeFragment) aCListenerS31S0100000_11.l0).lm(false);
                return;
            } else {
                RCH.LIZ((VerifyEmailBeforeChangeFragment) aCListenerS31S0100000_11.l0, phone, "auto_system").LJIIIZ(new AfS63S0100000_11((VerifyEmailBeforeChangeFragment) aCListenerS31S0100000_11.l0, 8)).LJIILL();
                return;
            }
        }
        C242869g2.LIZIZ(((VerifyEmailBeforeChangeFragment) aCListenerS31S0100000_11.l0).getContext(), ((VerifyEmailBeforeChangeFragment) aCListenerS31S0100000_11.l0).getEnterFrom(), ((VerifyEmailBeforeChangeFragment) aCListenerS31S0100000_11.l0).getEnterMethod());
    }

    public static final void onClick$10(ACListenerS31S0100000_11 aCListenerS31S0100000_11, View view) {
        PhoneNumRecycleProcessFragment phoneNumRecycleProcessFragment = (PhoneNumRecycleProcessFragment) aCListenerS31S0100000_11.l0;
        phoneNumRecycleProcessFragment.getClass();
        if (!TextUtils.isEmpty(a.LIZIZ().LJ())) {
            phoneNumRecycleProcessFragment.LJII();
            C69093R9t.LJIILJJIL(phoneNumRecycleProcessFragment, phoneNumRecycleProcessFragment, phoneNumRecycleProcessFragment.xl(), phoneNumRecycleProcessFragment.Al(), (String) phoneNumRecycleProcessFragment.LLF.getValue(), phoneNumRecycleProcessFragment.Ql(), null).LJI(new IDaS220S0100000_11(phoneNumRecycleProcessFragment, 0)).LJIILL();
            return;
        }
        EnumC62956OnI LJI = a.LIZIZ().LJI();
        if (a.LIZIZ().LIZ()) {
            String str = phoneNumRecycleProcessFragment.LLIFFJFJJ;
            C198517qh c198517qh = new C198517qh();
            c198517qh.LIZ.put("reason", "need age gate");
            JSONObject LJ = c198517qh.LJ();
            o.LJIIIIZZ(LJ, "newBuilder()\n           …te\")\n            .build()");
            Q13.LIZIZ(str, 0, LJ);
            C35936E8m c35936E8m = new C35936E8m();
            c35936E8m.LIZ(LJI.getValue(), "register_age_gate_action");
            c35936E8m.LIZ(1, "show");
            FMX.LJIIL("tns_phone_not_registered_age_gate_action", c35936E8m.LIZ);
            Bundle arguments = phoneNumRecycleProcessFragment.getArguments();
            if (arguments == null) {
                arguments = new Bundle();
            }
            arguments.putInt("next_page", EnumC69113RAn.AGE_GATE_PHONE_RECYCLE_PROCESS_LOGIN.getValue());
            arguments.putString("sms_code_key", phoneNumRecycleProcessFragment.Ql());
            phoneNumRecycleProcessFragment.rh(arguments);
            return;
        }
        C35936E8m c35936E8m2 = new C35936E8m();
        c35936E8m2.LIZ(LJI.getValue(), "register_age_gate_action");
        c35936E8m2.LIZ(0, "show");
        FMX.LJIIL("tns_phone_not_registered_age_gate_action", c35936E8m2.LIZ);
        if (a.LJIJI().LJFF()) {
            String str2 = phoneNumRecycleProcessFragment.LLIFFJFJJ;
            C198517qh c198517qh2 = new C198517qh();
            c198517qh2.LIZ.put("reason", "need terms consent");
            JSONObject LJ2 = c198517qh2.LJ();
            o.LJIIIIZZ(LJ2, "newBuilder()\n           …nt\")\n            .build()");
            Q13.LIZIZ(str2, 0, LJ2);
            Bundle arguments2 = phoneNumRecycleProcessFragment.getArguments();
            if (arguments2 == null) {
                arguments2 = new Bundle();
            }
            arguments2.putInt("next_page", EnumC69113RAn.TERMS_CONSENT_NEW_PHONE_USER.getValue());
            arguments2.putString("sms_code_key", phoneNumRecycleProcessFragment.Ql());
            phoneNumRecycleProcessFragment.rh(arguments2);
            return;
        }
        phoneNumRecycleProcessFragment.LJII();
        C69093R9t.LJIILJJIL(phoneNumRecycleProcessFragment, phoneNumRecycleProcessFragment, phoneNumRecycleProcessFragment.xl(), phoneNumRecycleProcessFragment.Al(), (String) phoneNumRecycleProcessFragment.LLF.getValue(), phoneNumRecycleProcessFragment.Ql(), null).LJI(new IDaS220S0100000_11(phoneNumRecycleProcessFragment, 1)).LJIILL();
    }

    public static final void onClick$11(ACListenerS31S0100000_11 aCListenerS31S0100000_11, View view) {
        ((BaseUpdatePasswordFragment) aCListenerS31S0100000_11.l0).Xl();
    }

    public static final void onClick$12(ACListenerS31S0100000_11 aCListenerS31S0100000_11, View view) {
        VerifyPasswordFragment verifyPasswordFragment = (VerifyPasswordFragment) aCListenerS31S0100000_11.l0;
        EditText editText = verifyPasswordFragment.LLF;
        if (editText != null) {
            String pwd = editText.getText().toString();
            Map LJI = C85631Xj9.LJI((VerifyPasswordFragment) aCListenerS31S0100000_11.l0);
            o.LJIIIZ(pwd, "pwd");
            C73636SvA.LIZ(verifyPasswordFragment, verifyPasswordFragment, AbstractC73635Sv9.LJ(new C69060R8m(verifyPasswordFragment, verifyPasswordFragment, pwd, LJI)).LJIIIZ(new AfS63S0100000_11(verifyPasswordFragment, 12)).LJIIIIZZ(new AfS63S0100000_11(verifyPasswordFragment, 14))).LJIIIZ(new AfS63S0100000_11((VerifyPasswordFragment) aCListenerS31S0100000_11.l0, 38)).LJIIIIZZ(new AfS63S0100000_11((VerifyPasswordFragment) aCListenerS31S0100000_11.l0, 39)).LJIILL();
            return;
        }
        o.LJIJI("passwordInput");
        throw null;
    }

    public static final void onClick$13(ACListenerS31S0100000_11 aCListenerS31S0100000_11, View view) {
        String enterFrom = ((VerifyPasswordFragment) aCListenerS31S0100000_11.l0).getEnterFrom();
        o.LJIIIIZZ(enterFrom, "enterFrom");
        String enterMethod = ((VerifyPasswordFragment) aCListenerS31S0100000_11.l0).getEnterMethod();
        o.LJIIIIZZ(enterMethod, "enterMethod");
        String platform = ((VerifyPasswordFragment) aCListenerS31S0100000_11.l0).Xl();
        o.LJIIIIZZ(platform, "platform");
        C85144XbI.LJIJJLI(enterFrom, enterMethod, platform, "password", ((CompoundButton) ((VerifyPasswordFragment) aCListenerS31S0100000_11.l0)._$_findCachedViewById(R.id.b_d)).isChecked());
        HashMap hashMap = new HashMap();
        VerifyPasswordFragment fragment = (VerifyPasswordFragment) aCListenerS31S0100000_11.l0;
        o.LJIIIZ(fragment, "fragment");
        Bundle arguments = fragment.getArguments();
        o.LJI(arguments);
        String string = arguments.getString("not_login_ticket", "");
        o.LJIIIIZZ(string, "fragment.arguments!!.get…ing(NOT_LOGIN_TICKET, \"\")");
        hashMap.put("not_login_ticket", string);
        String LJFF = C85631Xj9.LJFF((VerifyPasswordFragment) aCListenerS31S0100000_11.l0);
        if (LJFF != null) {
            hashMap.put("passport_ticket", LJFF);
        }
        VerifyPasswordFragment fragment2 = (VerifyPasswordFragment) aCListenerS31S0100000_11.l0;
        String LJII = RBV.LJII(fragment2);
        EditText editText = ((VerifyPasswordFragment) aCListenerS31S0100000_11.l0).LLF;
        if (editText != null) {
            String pwd = editText.getText().toString();
            AqS177S0100000_11 aqS177S0100000_11 = new AqS177S0100000_11((VerifyPasswordFragment) aCListenerS31S0100000_11.l0, 18);
            o.LJIIIZ(fragment2, "fragment");
            o.LJIIIZ(pwd, "pwd");
            C73636SvA.LIZ(fragment2, fragment2, AbstractC73635Sv9.LJ(new R8V(fragment2, pwd, LJII, hashMap)).LJIIIZ(new AfS63S0100000_11(fragment2, 20)).LJIIIIZZ(new AfS60S0200000_11(fragment2, aqS177S0100000_11, 4))).LJIIIZ(new AfS63S0100000_11((VerifyPasswordFragment) aCListenerS31S0100000_11.l0, 40)).LJIILL();
            return;
        }
        o.LJIJI("passwordInput");
        throw null;
    }

    public static final void onClick$14(ACListenerS31S0100000_11 aCListenerS31S0100000_11, View view) {
        if (C40700FyC.LIZ(aCListenerS31S0100000_11)) {
            return;
        }
        try {
            ((C81273Vv3) aCListenerS31S0100000_11.l0).LIZ();
        } catch (Throwable unused) {
        }
    }

    public static final void onClick$15(ACListenerS31S0100000_11 aCListenerS31S0100000_11, View view) {
        if (C40700FyC.LIZ(aCListenerS31S0100000_11)) {
            return;
        }
        try {
            Q6Z q6z = (Q6Z) aCListenerS31S0100000_11.l0;
            q6z.getContext();
            C40700FyC.LIZ(q6z);
            Q6Z q6z2 = (Q6Z) aCListenerS31S0100000_11.l0;
            View.OnClickListener onClickListener = null;
            if (!C40700FyC.LIZ(Q6Z.class)) {
                if (q6z2.LJLJJI != null) {
                    Q6Z q6z3 = (Q6Z) aCListenerS31S0100000_11.l0;
                    if (!C40700FyC.LIZ(Q6Z.class)) {
                        try {
                            onClickListener = q6z3.LJLJJI;
                        } catch (Throwable unused) {
                        }
                    }
                    onClickListener.onClick(view);
                }
            }
            Q6Z q6z4 = (Q6Z) aCListenerS31S0100000_11.l0;
            if (!C40700FyC.LIZ(Q6Z.class) && q6z4.LJLJI != null) {
                Q6Z q6z5 = (Q6Z) aCListenerS31S0100000_11.l0;
                if (!C40700FyC.LIZ(Q6Z.class)) {
                    try {
                        onClickListener = q6z5.LJLJI;
                    } catch (Throwable unused2) {
                    }
                }
                onClickListener.onClick(view);
            }
        } catch (Throwable unused3) {
        }
    }

    public static final void onClick$16(ACListenerS31S0100000_11 aCListenerS31S0100000_11, View view) {
        int id = view.getId();
        if (id == R.id.aw8) {
            ((DialogC66909QNt) aCListenerS31S0100000_11.l0).LJZ = EnumC66913QNx.CLOSE_FB_CLOSE;
        } else if (id == R.id.aw7) {
            ((DialogC66909QNt) aCListenerS31S0100000_11.l0).LJZ = EnumC66913QNx.CLOSE_FB_FEEDBACK;
        }
        ((DialogC66909QNt) aCListenerS31S0100000_11.l0).dismiss();
    }

    public static final void onClick$17(ACListenerS31S0100000_11 aCListenerS31S0100000_11, View view) {
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZJ("result", "turn_on");
        if (((RCX) aCListenerS31S0100000_11.l0).LJLJJL) {
            FMX.LJIIL("close_twosv_mandatory_popup", c35936E8m.LIZ);
            R41.LIZIZ.LJIIL().openTwoStepVerificationManageActivity(((RCX) aCListenerS31S0100000_11.l0).LJLJJI, "mandatory_popup");
        } else {
            FMX.LJIIL("close_twosv_nudge_popup", c35936E8m.LIZ);
            R41.LIZIZ.LJIIL().openTwoStepVerificationManageActivity(((RCX) aCListenerS31S0100000_11.l0).LJLJJI, "nudge_popup");
        }
        RCX rcx = (RCX) aCListenerS31S0100000_11.l0;
        if (!rcx.LJLJJL) {
            rcx.dismiss();
        }
    }

    public static final void onClick$18(ACListenerS31S0100000_11 aCListenerS31S0100000_11, View view) {
        C35936E8m c35936E8m = new C35936E8m();
        RCX rcx = (RCX) aCListenerS31S0100000_11.l0;
        if (rcx.LJLJJL) {
            c35936E8m.LIZJ("result", "logout");
            FMX.LJIIL("close_twosv_mandatory_popup", c35936E8m.LIZ);
            DialogC25756A8y dialogC25756A8y = new DialogC25756A8y(((RCX) aCListenerS31S0100000_11.l0).LJLJJI);
            if (!new C03880Dg(2).LIZJ(300000, "com/bytedance/tux/status/loading/TuxLoadingDialogHUD", "show", dialogC25756A8y, new Object[0], "void", new C65300Pk0(false, "()V", "-3030215059706131235")).LIZ) {
                dialogC25756A8y.show();
            }
            HG3.LJIIIIZZ().logout("user_logout", "user_logout");
            return;
        }
        rcx.dismiss();
        c35936E8m.LIZJ("result", "not_now");
        FMX.LJIIL("close_twosv_nudge_popup", c35936E8m.LIZ);
    }

    public static final void onClick$19(ACListenerS31S0100000_11 aCListenerS31S0100000_11, View view) {
        Activity mContext = ((R60) aCListenerS31S0100000_11.l0).LJLIL;
        o.LJIIIIZZ(mContext, "mContext");
        SmartRoute LIZIZ = R67.LIZIZ(mContext);
        LIZIZ.withParam(((R60) aCListenerS31S0100000_11.l0).LJLILLLLZI);
        LIZIZ.open();
    }

    public static final void onClick$2(ACListenerS31S0100000_11 aCListenerS31S0100000_11, View view) {
        String platform = ((RuInstantLoginBlockFragment) aCListenerS31S0100000_11.l0).Hl();
        o.LJIIIIZZ(platform, "platform");
        C85579XiJ.LIZJ("create_account", platform);
        if (a.LIZIZ().LIZ()) {
            RuInstantLoginBlockFragment ruInstantLoginBlockFragment = (RuInstantLoginBlockFragment) aCListenerS31S0100000_11.l0;
            Bundle arguments = ruInstantLoginBlockFragment.getArguments();
            if (arguments == null) {
                arguments = new Bundle();
            }
            RuInstantLoginBlockFragment ruInstantLoginBlockFragment2 = (RuInstantLoginBlockFragment) aCListenerS31S0100000_11.l0;
            arguments.putInt("next_page", EnumC69113RAn.AGE_GATE_LOGIN.getValue());
            arguments.putString("mobile_profile", (String) ruInstantLoginBlockFragment2.LJLLLLLL.getValue());
            arguments.putString("login_continue_method", "login_continue_method_ru");
            ruInstantLoginBlockFragment.rh(arguments);
            return;
        }
        RuInstantLoginBlockFragment ruInstantLoginBlockFragment3 = (RuInstantLoginBlockFragment) aCListenerS31S0100000_11.l0;
        String mobileProfile = (String) ruInstantLoginBlockFragment3.LJLLLLLL.getValue();
        o.LJIIIIZZ(mobileProfile, "mobileProfile");
        C69093R9t.LIZIZ(ruInstantLoginBlockFragment3, ruInstantLoginBlockFragment3, mobileProfile);
    }

    public static final void onClick$20(ACListenerS31S0100000_11 aCListenerS31S0100000_11, View view) {
        new Handler().postDelayed(new ARunnableS47S0100000_11((R60) aCListenerS31S0100000_11.l0, 154), 300L);
        R60 r60 = (R60) aCListenerS31S0100000_11.l0;
        r60.LJLJLLL = true;
        r60.dismiss();
    }

    public static final void onClick$21(ACListenerS31S0100000_11 aCListenerS31S0100000_11, View view) {
        ((R60) aCListenerS31S0100000_11.l0).dismiss();
    }

    public static final void onClick$22(ACListenerS31S0100000_11 aCListenerS31S0100000_11, View view) {
        DialogC68993R5x dialogC68993R5x = (DialogC68993R5x) aCListenerS31S0100000_11.l0;
        dialogC68993R5x.LJLLJ = false;
        dialogC68993R5x.LJLJLJ = true;
        if (dialogC68993R5x.isShowing()) {
            ((DialogC68993R5x) aCListenerS31S0100000_11.l0).dismiss();
        }
        DialogC68993R5x dialogC68993R5x2 = (DialogC68993R5x) aCListenerS31S0100000_11.l0;
        dialogC68993R5x2.LJ(dialogC68993R5x2.LJLLILLLL.getPlatform());
    }

    public static final void onClick$23(ACListenerS31S0100000_11 aCListenerS31S0100000_11, View view) {
        DialogC68993R5x dialogC68993R5x = (DialogC68993R5x) aCListenerS31S0100000_11.l0;
        dialogC68993R5x.LJLJLJ = true;
        dialogC68993R5x.LJLLJ = false;
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZLLL("enter_method", ((DialogC68993R5x) aCListenerS31S0100000_11.l0).LJLJJI);
        c35936E8m.LIZLLL("enter_from", ((DialogC68993R5x) aCListenerS31S0100000_11.l0).LJLJI);
        FMX.LJIIL("switch_login_account", c35936E8m.LIZ);
        ((DialogC68993R5x) aCListenerS31S0100000_11.l0).dismiss();
        R41.LJ().retryLogin(true);
    }

    public static final void onClick$24(ACListenerS31S0100000_11 aCListenerS31S0100000_11, View view) {
        ((DialogC68993R5x) aCListenerS31S0100000_11.l0).dismiss();
    }

    public static final void onClick$3(ACListenerS31S0100000_11 aCListenerS31S0100000_11, View view) {
        String platform = ((RuInstantLoginBlockFragment) aCListenerS31S0100000_11.l0).Hl();
        o.LJIIIIZZ(platform, "platform");
        C85579XiJ.LIZJ("other_method", platform);
        C69101RAb.LIZIZ(9);
        C69101RAb.LIZIZ(16);
    }

    public static final void onClick$4(ACListenerS31S0100000_11 aCListenerS31S0100000_11, View view) {
        FMX.LJIIL("click_topic_question", new C35936E8m().LIZ);
        LoginMethodListActivity loginMethodListActivity = (LoginMethodListActivity) aCListenerS31S0100000_11.l0;
        C242869g2.LIZ(loginMethodListActivity, "trust_one_click_pad", loginMethodListActivity.LJJLIIIJLLLLLLLZ());
        OneClickLoginViewModel oneClickLoginViewModel = ((LoginMethodListActivity) aCListenerS31S0100000_11.l0).LJLLJ;
        if (oneClickLoginViewModel != null) {
            oneClickLoginViewModel.gv0();
        } else {
            o.LJIJI("oneClickLoginViewModel");
            throw null;
        }
    }

    public static final void onClick$5(ACListenerS31S0100000_11 aCListenerS31S0100000_11, View view) {
        if (!o.LJ(((C74090T5y) ((ChildrenChangePasswordFragment) aCListenerS31S0100000_11.l0)._$_findCachedViewById(R.id.baa)).getText(), ((C74090T5y) ((ChildrenChangePasswordFragment) aCListenerS31S0100000_11.l0)._$_findCachedViewById(R.id.ba9)).getText())) {
            ChildrenChangePasswordFragment childrenChangePasswordFragment = (ChildrenChangePasswordFragment) aCListenerS31S0100000_11.l0;
            String string = childrenChangePasswordFragment.getString(R.string.iew);
            o.LJIIIIZZ(string, "getString(R.string.mus_type_same_password)");
            childrenChangePasswordFragment.Sg(0, string);
            return;
        }
        ((C74088T5w) ((ChildrenChangePasswordFragment) aCListenerS31S0100000_11.l0)._$_findCachedViewById(R.id.bab)).LIZIZ(true);
        ChildrenChangePasswordFragment childrenChangePasswordFragment2 = (ChildrenChangePasswordFragment) aCListenerS31S0100000_11.l0;
        String oldPassword = ((C74090T5y) childrenChangePasswordFragment2._$_findCachedViewById(R.id.bac)).getText();
        String newPassword = ((C74090T5y) ((ChildrenChangePasswordFragment) aCListenerS31S0100000_11.l0)._$_findCachedViewById(R.id.baa)).getText();
        o.LJIIIZ(oldPassword, "oldPassword");
        o.LJIIIZ(newPassword, "newPassword");
        C73636SvA.LIZ(childrenChangePasswordFragment2, childrenChangePasswordFragment2, AbstractC73635Sv9.LJ(new R8U(childrenChangePasswordFragment2, oldPassword, newPassword))).LJIILL();
    }

    public static final void onClick$6(ACListenerS31S0100000_11 aCListenerS31S0100000_11, View view) {
        String str;
        CombinedEmailSignupLoginFragment combinedEmailSignupLoginFragment = (CombinedEmailSignupLoginFragment) aCListenerS31S0100000_11.l0;
        boolean Rl = combinedEmailSignupLoginFragment.Rl();
        C35936E8m c35936E8m = new C35936E8m();
        String str2 = "handle";
        if (!Rl) {
            str = "handle";
        } else {
            str = "email";
        }
        c35936E8m.LIZLLL("platform", str);
        c35936E8m.LIZLLL("enter_method", combinedEmailSignupLoginFragment.getEnterMethod());
        c35936E8m.LIZLLL("enter_from", combinedEmailSignupLoginFragment.getEnterFrom());
        c35936E8m.LIZLLL("login_panel_type", combinedEmailSignupLoginFragment.wl());
        c35936E8m.LIZIZ(System.currentTimeMillis() - combinedEmailSignupLoginFragment.LJZL, "stay_time");
        FMX.LJIIL("phone_email_click_next", c35936E8m.LIZ);
        CombinedEmailSignupLoginFragment combinedEmailSignupLoginFragment2 = (CombinedEmailSignupLoginFragment) aCListenerS31S0100000_11.l0;
        if (combinedEmailSignupLoginFragment2.LLFFF) {
            ((C252949wI) combinedEmailSignupLoginFragment2._$_findCachedViewById(R.id.ctg)).LIZ();
            EditText editText = combinedEmailSignupLoginFragment2.LLFII;
            if (editText != null) {
                String username = editText.getText().toString();
                if (combinedEmailSignupLoginFragment2.Rl()) {
                    combinedEmailSignupLoginFragment2.LL = System.currentTimeMillis();
                    String enterFrom = combinedEmailSignupLoginFragment2.getEnterFrom();
                    o.LJIIIIZZ(enterFrom, "enterFrom");
                    String enterMethod = combinedEmailSignupLoginFragment2.getEnterMethod();
                    o.LJIIIIZZ(enterMethod, "enterMethod");
                    RC0.LIZLLL("login_signup_email_username_submit", enterFrom, enterMethod, "email");
                    C69093R9t.LJ(combinedEmailSignupLoginFragment2, EnumC69116RAq.SIGN_UP, combinedEmailSignupLoginFragment2.Al(), combinedEmailSignupLoginFragment2, username).LJIIIZ(new AfS24S1100000_11((Object) combinedEmailSignupLoginFragment2, username, 0)).LJIILL();
                    return;
                }
                combinedEmailSignupLoginFragment2.LL = System.currentTimeMillis();
                String enterFrom2 = combinedEmailSignupLoginFragment2.getEnterFrom();
                o.LJIIIIZZ(enterFrom2, "enterFrom");
                String enterMethod2 = combinedEmailSignupLoginFragment2.getEnterMethod();
                o.LJIIIIZZ(enterMethod2, "enterMethod");
                RC0.LIZLLL("login_signup_email_username_submit", enterFrom2, enterMethod2, "username");
                EnumC69116RAq scene = EnumC69116RAq.SIGN_UP;
                EnumC69113RAn step = combinedEmailSignupLoginFragment2.Al();
                o.LJIIIZ(username, "username");
                o.LJIIIZ(scene, "scene");
                o.LJIIIZ(step, "step");
                C73636SvA.LIZ(combinedEmailSignupLoginFragment2, combinedEmailSignupLoginFragment2, AbstractC73635Sv9.LJ(new R9N(combinedEmailSignupLoginFragment2, scene, step, combinedEmailSignupLoginFragment2, username)).LJIIIIZZ(new AfS63S0100000_11(combinedEmailSignupLoginFragment2, 15))).LJIIIZ(new AfS24S1100000_11((Object) combinedEmailSignupLoginFragment2, username, 1)).LJIILL();
                return;
            }
            o.LJIJI("emailInput");
            throw null;
        }
        combinedEmailSignupLoginFragment2.LLFF = false;
        C40450FuA.LIZ(combinedEmailSignupLoginFragment2.getContext());
        EditText editText2 = combinedEmailSignupLoginFragment2.LLFII;
        if (editText2 != null) {
            String obj = editText2.getText().toString();
            EditText editText3 = combinedEmailSignupLoginFragment2.LLFZ;
            if (editText3 != null) {
                String obj2 = editText3.getText().toString();
                if (combinedEmailSignupLoginFragment2.Rl()) {
                    str2 = "email";
                }
                C69093R9t.LJIIJJI(combinedEmailSignupLoginFragment2, combinedEmailSignupLoginFragment2, obj, obj2, str2).LJIILL();
                return;
            }
            o.LJIJI("passwordInput");
            throw null;
        }
        o.LJIJI("emailInput");
        throw null;
    }

    public static final void onClick$7(ACListenerS31S0100000_11 aCListenerS31S0100000_11, View view) {
        String str;
        C35936E8m c35936E8m = new C35936E8m();
        EmailSignUpFragment emailSignUpFragment = (EmailSignUpFragment) aCListenerS31S0100000_11.l0;
        if (emailSignUpFragment.LLD) {
            if (((CompoundButton) emailSignUpFragment._$_findCachedViewById(R.id.cti)).isChecked()) {
                str = "checked";
            } else {
                str = "unchecked";
            }
            c35936E8m.LIZJ("email_checkbox_status", str);
            c35936E8m.LIZJ("text_type", "long_version");
        }
        c35936E8m.LIZLLL("platform", "email");
        c35936E8m.LIZLLL("enter_method", ((EmailSignUpFragment) aCListenerS31S0100000_11.l0).getEnterMethod());
        c35936E8m.LIZLLL("enter_from", ((EmailSignUpFragment) aCListenerS31S0100000_11.l0).getEnterFrom());
        c35936E8m.LIZLLL("login_panel_type", ((EmailSignUpFragment) aCListenerS31S0100000_11.l0).wl());
        c35936E8m.LIZIZ(System.currentTimeMillis() - ((EmailSignUpFragment) aCListenerS31S0100000_11.l0).LJZL, "stay_time");
        FMX.LJIIL("phone_email_click_next", c35936E8m.LIZ);
        String text = ((C74090T5y) ((EmailSignUpFragment) aCListenerS31S0100000_11.l0)._$_findCachedViewById(R.id.ctf)).getText();
        if (!TextUtils.isEmpty(text) && Patterns.EMAIL_ADDRESS.matcher(text).matches()) {
            ((C252949wI) ((EmailSignUpFragment) aCListenerS31S0100000_11.l0)._$_findCachedViewById(R.id.ctg)).LIZ();
            EmailSignUpFragment emailSignUpFragment2 = (EmailSignUpFragment) aCListenerS31S0100000_11.l0;
            String text2 = ((C74090T5y) emailSignUpFragment2._$_findCachedViewById(R.id.ctf)).getText();
            C69093R9t.LJ(emailSignUpFragment2, EnumC69116RAq.SIGN_UP, emailSignUpFragment2.Al(), emailSignUpFragment2, text2).LJIIIZ(new AfS24S1100000_11((Object) emailSignUpFragment2, text2, 2)).LJIILL();
            return;
        }
        EmailSignUpFragment emailSignUpFragment3 = (EmailSignUpFragment) aCListenerS31S0100000_11.l0;
        String string = emailSignUpFragment3.getString(R.string.dps);
        o.LJIIIIZZ(string, "getString(R.string.commo…ration_email_input_error)");
        emailSignUpFragment3.Sg(0, string);
        String enterMethod = ((EmailSignUpFragment) aCListenerS31S0100000_11.l0).getEnterMethod();
        o.LJIIIIZZ(enterMethod, "enterMethod");
        RC0.LJ(null, enterMethod, "email");
    }

    public static final void onClick$8(ACListenerS31S0100000_11 aCListenerS31S0100000_11, View view) {
        if (((InputPhoneFragment) aCListenerS31S0100000_11.l0).Sl()) {
            FMX.onEventV3("set_up_by_email");
        }
        Bundle arguments = ((InputPhoneFragment) aCListenerS31S0100000_11.l0).getArguments();
        if (arguments != null && arguments.getInt("last_scene", -1) == -1) {
            BindService LIZIZ = R41.LIZIZ();
            ActivityC45651qj mo49getActivity = ((InputPhoneFragment) aCListenerS31S0100000_11.l0).mo49getActivity();
            String enterFrom = ((InputPhoneFragment) aCListenerS31S0100000_11.l0).getEnterFrom();
            String enterMethod = ((InputPhoneFragment) aCListenerS31S0100000_11.l0).getEnterMethod();
            ActivityC45651qj mo49getActivity2 = ((InputPhoneFragment) aCListenerS31S0100000_11.l0).mo49getActivity();
            o.LJII(mo49getActivity2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.ui.BindOrModifyPhoneActivity");
            Bundle bundle = (Bundle) ((BindOrModifyPhoneActivity) mo49getActivity2).LJLJLJ.getValue();
            bundle.putInt("current_scene", ((InputPhoneFragment) aCListenerS31S0100000_11.l0).xl().getValue());
            LIZIZ.bindEmail(mo49getActivity, enterFrom, enterMethod, bundle, new IDeS356S0100000_11((InputPhoneFragment) aCListenerS31S0100000_11.l0, 1));
            return;
        }
        ActivityC45651qj mo49getActivity3 = ((InputPhoneFragment) aCListenerS31S0100000_11.l0).mo49getActivity();
        if (mo49getActivity3 != null) {
            mo49getActivity3.finish();
        }
    }

    public static final void onClick$9(ACListenerS31S0100000_11 aCListenerS31S0100000_11, View view) {
        PhoneNumRecycleProcessFragment phoneNumRecycleProcessFragment = (PhoneNumRecycleProcessFragment) aCListenerS31S0100000_11.l0;
        phoneNumRecycleProcessFragment.LJII();
        EnumC69116RAq scene = phoneNumRecycleProcessFragment.xl();
        EnumC69113RAn step = phoneNumRecycleProcessFragment.Al();
        String str = (String) phoneNumRecycleProcessFragment.LLF.getValue();
        String Ql = phoneNumRecycleProcessFragment.Ql();
        o.LJIIIZ(scene, "scene");
        o.LJIIIZ(step, "step");
        C73636SvA.LIZ(phoneNumRecycleProcessFragment, phoneNumRecycleProcessFragment, AbstractC73635Sv9.LJ(new C69054R8g(Ql, str, phoneNumRecycleProcessFragment)).LJIIIIZZ(new AfS63S0100000_11(phoneNumRecycleProcessFragment, 17)).LJIIIZ(new AfS23S0400000_11(phoneNumRecycleProcessFragment, phoneNumRecycleProcessFragment, scene, step, 1))).LJI(new IDaS220S0100000_11(phoneNumRecycleProcessFragment, 2)).LJIILL();
    }
}
