package com.ss.android.ugc.aweme.account.login.v2.ui;

import X.AGJ;
import X.AV1;
import X.AVJ;
import X.AVK;
import X.AbstractActivityC69131RBf;
import X.C16880lQ;
import X.C207998Eh;
import X.C35831E4l;
import X.C38986FRu;
import X.C39326Fc2;
import X.C40453FuD;
import X.C41122GBy;
import X.C65803Ps7;
import X.C69101RAb;
import X.C69106RAg;
import X.C77275UUl;
import X.C78685UuP;
import X.C85596Xia;
import X.C85603Xih;
import X.C85635XjD;
import X.DialogC81625W1t;
import X.EOO;
import X.EnumC69113RAn;
import X.HG3;
import X.InterfaceC36571c5;
import X.InterfaceC62984Onk;
import X.InterfaceC69103RAd;
import X.O0X;
import X.R41;
import X.R46;
import X.RAE;
import X.RAG;
import X.RAJ;
import X.RAL;
import X.RAO;
import X.RAP;
import X.RAS;
import X.RBW;
import X.RBX;
import Y.ARunnableS10S0101000_6;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.account.agegate.RegistrationAgeGateServiceImpl;
import com.ss.android.ugc.aweme.account.guestmode.GuestModeServiceImpl;
import com.ss.android.ugc.aweme.account.login.v2.base.ActionResultModel;
import com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.PhoneEmailLoginFragment;
import com.ss.android.ugc.aweme.compliance.api.services.policy.ICompliancePolicyService;
import com.ss.android.ugc.aweme.profile.ui.v2.UserProfilePreloadHelper;
import com.ss.android.ugc.aweme.service.nickname.NicknameSignupExperiment;
import com.ss.android.ugc.aweme.services.AgeGateSdkRegistrationFlow;
import com.ss.android.ugc.aweme.services.IRegistrationAgeGateService;
import com.ss.android.ugc.aweme.user.UserStore;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS161S0100000_11;
import kotlin.jvm.internal.AqS197S0100000_15;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes12.dex */
public class SignUpOrLoginActivity extends AbstractActivityC69131RBf implements InterfaceC69103RAd, InterfaceC62984Onk {
    public static final HashSet<Integer> LJLLLLLL = C77275UUl.LIZLLL(2013, 1039, 2100);
    public static final HashSet<Integer> LJLZ = C77275UUl.LIZLLL(1051, 1031, 17, 1049, 1047, 1383, 2017);
    public Integer LJLJI;
    public boolean LJLJJLL;
    public DialogC81625W1t LJLJL;
    public DialogC81625W1t LJLJLJ;
    public DialogC81625W1t LJLJLLL;
    public boolean LJLL;
    public boolean LJLLILLLL;
    public String LJLLJ;
    public boolean LJLLL;
    public final Map<Integer, View> LJLLLL = new LinkedHashMap();
    public EnumC69113RAn LJLJJI = EnumC69113RAn.PHONE_EMAIL_LOGIN;
    public EnumC69113RAn LJLJJL = EnumC69113RAn.NONE;
    public Bundle LJLLI = new Bundle();

    @Override // X.AbstractActivityC69131RBf, X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLLL).clear();
    }

    @Override // X.AbstractActivityC69131RBf, X.ActivityC86117Xqz, X.KMV
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLLL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.InterfaceC62984Onk
    public final boolean getCanCollectConsent() {
        return false;
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onResume() {
        C65803Ps7.LIZLLL(this);
        super.onResume();
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.v2.ui.SignUpOrLoginActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public static boolean LLILIL() {
        UserStore.AccountUser LIZ = UserStore.LIZ(RBW.LJLLI.LIZJ());
        if (LIZ == null || LIZ.privateAccountPrompt <= 0 || !((RBX) HG3.LJIILL()).isNewUser()) {
            return false;
        }
        return true;
    }

    public final boolean LLIL() {
        if ((C16880lQ.LLJJIJI(getIntent()) != null && (!r3.getBoolean("should_restart_later", true))) || !this.LJLL) {
            return false;
        }
        if (C38986FRu.LIZ().LIZJ() != 0 && !C38986FRu.LIZ().LIZ) {
            return false;
        }
        return true;
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity
    public final void finish() {
        Bundle LLJJIJI;
        PhoneEmailLoginFragment phoneEmailLoginFragment;
        C85603Xih c85603Xih;
        String string;
        String str;
        super.finish();
        int i = RAL.LIZ[this.LJLJJI.ordinal()];
        if (i != 1 && i != 2 && i != 3) {
            if (i == 4) {
                Intent intent = getIntent();
                if (intent != null) {
                    str = C16880lQ.LLJJIJIIJIL(intent, "page");
                } else {
                    str = null;
                }
                if (o.LJ("twosv_setup", str) && !this.LJLLI.getBoolean("is_success", false)) {
                    R41.LJIIL(13, 2, null);
                }
            }
        } else {
            EnumC69113RAn enumC69113RAn = this.LJLJJL;
            if (enumC69113RAn == EnumC69113RAn.NONE) {
                if (this.LJLJJLL) {
                    UserProfilePreloadHelper.LJIIIIZZ().clearCache();
                    C69101RAb.LIZIZ(11);
                }
            } else if ((enumC69113RAn == EnumC69113RAn.INPUT_PHONE_LOGIN || enumC69113RAn == EnumC69113RAn.INPUT_EMAIL_LOGIN) && (LLJJIJI = C16880lQ.LLJJIJI(getIntent())) != null && !LLJJIJI.getBoolean("has_callBack", true)) {
                BaseAccountFlowFragment LLFII = LLFII();
                if ((LLFII instanceof PhoneEmailLoginFragment) && (phoneEmailLoginFragment = (PhoneEmailLoginFragment) LLFII) != null) {
                    if (phoneEmailLoginFragment.LLD == 0) {
                        c85603Xih = (C85603Xih) phoneEmailLoginFragment.LLFFF.getValue();
                    } else {
                        c85603Xih = (C85603Xih) phoneEmailLoginFragment.LLFII.getValue();
                    }
                    InterfaceC36571c5 interfaceC36571c5 = c85603Xih.LIZ;
                    o.LJII(interfaceC36571c5, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.NeedCancelThisLoginMethod");
                    if (((RAS) interfaceC36571c5).o0() && !R41.LJI()) {
                        R41.LJ().retryLogin();
                    }
                }
                R41.LJIIJJI(7, 4);
                if (!this.LJLJJLL) {
                    R41.LJIIL(1, 2, "");
                }
            }
        }
        if (LLIL()) {
            this.LJLLI.putBoolean("is_start_by_switch_account", true);
            new ARunnableS10S0101000_6(1, this.LJLLI, 14).run();
        } else {
            if (!this.LJLLILLLL || AV1.LJIILLIIL() || (string = this.LJLLI.getString("launch_webview_after_restart_url")) == null) {
                return;
            }
            SmartRoute buildRoute = SmartRouter.buildRoute(this, "//webview");
            buildRoute.withParam("url", string);
            buildRoute.open();
        }
    }

    @Override // X.AbstractActivityC69131RBf, X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        ((CopyOnWriteArrayList) C69101RAb.LIZJ).remove(this);
        C69101RAb.LIZ = null;
        AVJ.LIZ.erase("use_current_user_info");
        super.onDestroy();
        RAP.LIZ().getClass();
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStop() {
        C65803Ps7.LJFF(this);
        super.onStop();
        if (this.LJLLL) {
            finish();
        }
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        try {
            getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable unused2) {
        }
    }

    @Override // X.InterfaceC69103RAd
    public final void LJIIL(int i) {
        if (i == 9) {
            finish();
        }
    }

    @Override // X.AbstractActivityC69131RBf
    public final void LLFZ(Bundle bundle) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        Bundle bundle2 = new Bundle(bundle);
        C69106RAg c69106RAg = EnumC69113RAn.Companion;
        EnumC69113RAn enumC69113RAn = EnumC69113RAn.PHONE_EMAIL_SIGN_UP;
        int i = bundle2.getInt("next_page", enumC69113RAn.getValue());
        c69106RAg.getClass();
        EnumC69113RAn LIZ = C69106RAg.LIZ(i);
        int i2 = bundle2.getInt("previous_page");
        EnumC69113RAn enumC69113RAn2 = EnumC69113RAn.BIND_PHONE_ON_SIGN_UP_OR_LOGIN;
        if ((i2 == enumC69113RAn2.getValue() || bundle2.getInt("current_page") == enumC69113RAn2.getValue()) && LIZ == EnumC69113RAn.BIND_EMAIL_WITHOUT_VERIFY_ON_SIGN_UP_OR_LOGIN) {
            LIZ = EnumC69113RAn.FINISH;
        }
        int i3 = RAL.LIZ[LIZ.ordinal()];
        if (i3 != 5) {
            if (i3 != 6) {
                if (i3 != 7) {
                    boolean LJIIJ = GuestModeServiceImpl.LJIIJJI().LJIIJ();
                    EnumC69113RAn enumC69113RAn3 = EnumC69113RAn.NONE;
                    int i4 = bundle2.getInt("current_page", enumC69113RAn3.getValue());
                    bundle2.putInt("previous_page", i4);
                    if (LIZ == enumC69113RAn && !LJIIJ && i4 == enumC69113RAn3.getValue() && !RAJ.LIZ()) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (bundle2.getBoolean("is_multi_account", false) && AVK.LIZIZ()) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z3 && !z4 && a.LIZIZ().LIZ()) {
                        LIZ = EnumC69113RAn.AGE_GATE_SIGN_UP;
                    } else if (a.LJIJI().LJFF() && LIZ == enumC69113RAn && (i4 == enumC69113RAn3.getValue() || i4 == EnumC69113RAn.AGE_GATE_SIGN_UP.getValue())) {
                        LIZ = EnumC69113RAn.TERMS_CONSENT_SIGN_UP;
                    }
                    bundle2.putInt("current_page", LIZ.getValue());
                    bundle2.remove("next_page");
                    EnumC69113RAn enumC69113RAn4 = EnumC69113RAn.THIRD_PARTY_AGE_GATE;
                    if (LIZ == enumC69113RAn4) {
                        bundle2.putString("platform", C16880lQ.LLJJIJIIJIL(getIntent(), "platform"));
                    }
                    bundle2.putBoolean("is_multi_account_same_user", z4);
                    if (bundle2.getBoolean("cancel_animation")) {
                        bundle2.remove("cancel_animation");
                        BaseAccountFlowFragment LLFII = LLFII();
                        if (LLFII != null) {
                            LLFII.ee(0);
                        }
                    }
                    if (LIZ == enumC69113RAn4 || LIZ == EnumC69113RAn.AGE_GATE_SIGN_UP || LIZ == EnumC69113RAn.AGE_GATE_LOGIN || LIZ == EnumC69113RAn.AGE_GATE_PHONE_RECYCLE_PROCESS_LOGIN) {
                        HashMap<String, String> hashMap = new HashMap<>();
                        String string = bundle2.getString("enter_method");
                        String str = "";
                        if (string == null) {
                            string = "";
                        }
                        hashMap.put("enter_method", string);
                        String string2 = bundle2.getString("enter_from");
                        if (string2 == null) {
                            string2 = "";
                        }
                        hashMap.put("enter_from", string2);
                        String string3 = bundle2.getString("login_panel_type");
                        if (string3 == null) {
                            string3 = "";
                        }
                        hashMap.put("login_panel_type", string3);
                        if (LIZ == enumC69113RAn4) {
                            String string4 = bundle2.getString("platform");
                            if (string4 != null) {
                                str = string4;
                            }
                        } else if (LIZ == EnumC69113RAn.AGE_GATE_LOGIN) {
                            str = "sms_verification";
                        } else if (bundle2.getBoolean("phone_signup")) {
                            str = "phone_sign_up";
                        } else if (bundle2.getBoolean("email_signup")) {
                            str = "email";
                        } else {
                            str = "phone_or_email";
                        }
                        hashMap.put("platform", str);
                        hashMap.put("user_type", "new");
                        hashMap.put("is_in_personalized_nuj", String.valueOf(EOO.LIZIZ()));
                        IRegistrationAgeGateService ageGateService = RegistrationAgeGateServiceImpl.LIZ();
                        hashMap.put("registration_flow", "signUpOrLogin");
                        o.LJIIIIZZ(ageGateService, "ageGateService");
                        ageGateService.verifyAgeForRegistrationSDK(this, hashMap, bundle2, AgeGateSdkRegistrationFlow.SIGN_UP, new RAE(this, LIZ, bundle2, new AqS161S0100000_11(ageGateService, 35), new AqS197S0100000_15(ageGateService, 14)), false, new C85596Xia(this));
                        return;
                    }
                    AbstractActivityC69131RBf.LLIIIZ(this, C85635XjD.LIZ(LIZ), bundle2);
                    return;
                }
                if (bundle2.getBoolean("phone_signup", false)) {
                    if (C40453FuD.LIZ(bundle2) == 1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    this.LJLL = z2;
                    int i5 = bundle2.getInt("previous_page", EnumC69113RAn.NONE.getValue());
                    if (i5 == EnumC69113RAn.INPUT_PHONE_SIGN_UP.getValue() || i5 == EnumC69113RAn.AGE_GATE_POST_PHONE_SIGNUP.getValue() || i5 == EnumC69113RAn.AGE_GATE_LOGIN.getValue()) {
                        LLILLJJLI(bundle2);
                        return;
                    }
                    if (i5 == EnumC69113RAn.CREATE_PASSWORD_FOR_PHONE.getValue()) {
                        if (LLILIL()) {
                            LLILZ(bundle2);
                            return;
                        } else {
                            LLILLL(bundle2);
                            return;
                        }
                    }
                    if (i5 == EnumC69113RAn.PRIVACY_HIGHLIGHT_FOR_TEENS.getValue()) {
                        LLIZLLLIL(bundle2);
                        return;
                    }
                    if (i5 == EnumC69113RAn.PRIVATE_ACCOUNT_PROMPT.getValue()) {
                        if (LLILIL()) {
                            LLILLL(bundle2);
                            return;
                        } else {
                            finish();
                            return;
                        }
                    }
                    if (i5 == EnumC69113RAn.CREATE_NICKNAME.getValue()) {
                        if (C35831E4l.LIZ() == 2) {
                            LLILLIZIL(bundle2);
                            return;
                        } else {
                            LLIILII(bundle2);
                            return;
                        }
                    }
                    if (i5 == EnumC69113RAn.CREATE_AVATAR.getValue() || i5 == EnumC69113RAn.CREATE_AVATAR_AND_NICKNAME.getValue()) {
                        LLIILII(bundle2);
                        return;
                    } else if (i5 == EnumC69113RAn.BIND_EMAIL_WITHOUT_VERIFY_ON_SIGN_UP_OR_LOGIN.getValue()) {
                        LLILLJJLI(bundle2);
                        return;
                    } else {
                        finish();
                        return;
                    }
                }
                if (bundle2.getBoolean("email_signup", false)) {
                    if (C40453FuD.LIZ(bundle2) == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.LJLL = z;
                    int i6 = bundle2.getInt("previous_page", EnumC69113RAn.NONE.getValue());
                    if (i6 == EnumC69113RAn.INPUT_EMAIL_SIGN_UP.getValue() || i6 == EnumC69113RAn.AGE_GATE_POST_EMAIL_SIGNUP.getValue()) {
                        if (LLILIL()) {
                            LLILZ(bundle2);
                            return;
                        } else {
                            LLILLL(bundle2);
                            return;
                        }
                    }
                    if (i6 == EnumC69113RAn.PRIVACY_HIGHLIGHT_FOR_TEENS.getValue()) {
                        LLIZLLLIL(bundle2);
                        return;
                    }
                    if (i6 == EnumC69113RAn.PRIVATE_ACCOUNT_PROMPT.getValue()) {
                        if (LLILIL()) {
                            LLILLL(bundle2);
                            return;
                        } else {
                            finish();
                            return;
                        }
                    }
                    if (i6 == EnumC69113RAn.PHONE_SMS_BIND.getValue() || i6 == enumC69113RAn2.getValue()) {
                        if (LLILIL()) {
                            LLILZ(bundle2);
                            return;
                        } else {
                            LLILLL(bundle2);
                            return;
                        }
                    }
                    if (i6 == EnumC69113RAn.CREATE_NICKNAME.getValue()) {
                        if (C35831E4l.LIZ() == 2) {
                            LLILLIZIL(bundle2);
                            return;
                        } else {
                            LLIILII(bundle2);
                            return;
                        }
                    }
                    if (i6 == EnumC69113RAn.CREATE_AVATAR.getValue() || i6 == EnumC69113RAn.CREATE_AVATAR_AND_NICKNAME.getValue()) {
                        LLIILII(bundle2);
                        return;
                    } else {
                        finish();
                        return;
                    }
                }
                if (bundle2.getBoolean("is_new_3p_signup")) {
                    int i7 = bundle2.getInt("previous_page", EnumC69113RAn.NONE.getValue());
                    if (i7 == EnumC69113RAn.CREATE_NICKNAME.getValue()) {
                        if (C35831E4l.LIZ() == 2) {
                            LLILLIZIL(bundle2);
                            return;
                        } else {
                            LLIILII(bundle2);
                            return;
                        }
                    }
                    if (i7 == EnumC69113RAn.CREATE_AVATAR.getValue() || i7 == EnumC69113RAn.CREATE_AVATAR_AND_NICKNAME.getValue()) {
                        LLIILII(bundle2);
                        return;
                    }
                    if (i7 == EnumC69113RAn.PRIVACY_HIGHLIGHT_FOR_TEENS.getValue()) {
                        LLIZLLLIL(bundle2);
                        return;
                    }
                    if (i7 == EnumC69113RAn.PRIVATE_ACCOUNT_PROMPT.getValue()) {
                        if (LLILIL()) {
                            LLILLL(bundle2);
                            return;
                        } else {
                            finish();
                            return;
                        }
                    }
                    if (NicknameSignupExperiment.LIZ().isEnabled() || C35831E4l.LIZ() == 1 || C35831E4l.LIZ() == 2 || C35831E4l.LIZ() == 3) {
                        if (LLILIL()) {
                            LLILZ(bundle2);
                            return;
                        } else {
                            LLILLL(bundle2);
                            return;
                        }
                    }
                    if (LLILIL()) {
                        LLILZ(bundle2);
                        return;
                    } else {
                        LLIILII(bundle2);
                        return;
                    }
                }
                finish();
                return;
            }
            SmartRoute buildRoute = SmartRouter.buildRoute(this, "//account/ftc");
            buildRoute.withParam("child_account_not_expected_upon_signup_success", this.LJLLILLLL);
            buildRoute.withParam("next_page", EnumC69113RAn.FTC_CREATE_ACCOUNT.getValue());
            buildRoute.withParam(bundle2);
            buildRoute.open();
            finish();
            return;
        }
        if (bundle2.getInt("result_code", -99988) != -99988) {
            Intent intent = new Intent();
            intent.putExtra("birthday", C16880lQ.LLJJIJIIJIL(getIntent(), "birthday"));
            setResult(bundle2.getInt("result_code", -99988), intent);
        }
        this.LJLLI = bundle2;
        finish();
    }

    @Override // X.AbstractActivityC69131RBf
    public final void LLII(Bundle bundle) {
        this.LJLJJLL = true;
        BaseAccountFlowFragment LLFII = LLFII();
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (!TextUtils.isEmpty(R46.LIZIZ)) {
            bundle.putString("enter_from", R46.LIZIZ);
        }
        if (!TextUtils.isEmpty(R46.LIZ)) {
            bundle.putString("enter_method", R46.LIZ);
        }
        if (!TextUtils.isEmpty(R46.LIZJ)) {
            bundle.putString("login_panel_type", R46.LIZJ);
        }
        if (R41.LJII()) {
            bundle.putBoolean("only_login", true);
        }
        Bundle LLJJIJI = C16880lQ.LLJJIJI(getIntent());
        if (LLJJIJI != null) {
            bundle.putAll(LLJJIJI);
        }
        Integer num = this.LJLJI;
        if (num != null) {
            bundle.putInt("kr_marketing_notification_operation", num.intValue());
        }
        if (LLFII != null) {
            LLFII.ee(1);
        }
        if (C40453FuD.LIZ(bundle) != 1) {
            this.LJLLI.putString("launch_webview_after_restart_url", this.LJLLJ);
        }
        C39326Fc2.LIZIZ(bundle, new RAG(LLFII, bundle, this));
    }

    public final void LLIIJI(EnumC69113RAn enumC69113RAn) {
        if (RAL.LIZ[enumC69113RAn.ordinal()] == 9) {
            Bundle bundle = new Bundle();
            bundle.putInt("next_page", EnumC69113RAn.FINISH.getValue());
            bundle.putInt("current_page", enumC69113RAn.getValue());
            bundle.putInt("result_code", -99);
            LLFZ(bundle);
            return;
        }
        finish();
    }

    public final void LLIIJLIL(String str) {
        ICompliancePolicyService LJII = a.LJII();
        if (LJII != null) {
            LJII.LIZIZ(new O0X(AGJ.ACCOUNT_AGE_GATE.getValue(), str, true, true, 4), new RAO());
        }
    }

    public final void LLIILII(Bundle bundle) {
        if (((RBX) HG3.LJIILL()).getCurUser().notifyPrivatePolicy && ((RBX) HG3.LJIILL()).isNewUser() && !bundle.getBoolean("is_from_new_user_journey", false)) {
            EnumC69113RAn enumC69113RAn = EnumC69113RAn.PRIVATE_ACCOUNT_TIPS;
            bundle.putInt("next_page", enumC69113RAn.getValue());
            AbstractActivityC69131RBf.LLIIIZ(this, C85635XjD.LIZ(enumC69113RAn), bundle);
            return;
        }
        finish();
    }

    public final void LLILLIZIL(Bundle bundle) {
        EnumC69113RAn enumC69113RAn = EnumC69113RAn.CREATE_AVATAR;
        bundle.putInt("next_page", enumC69113RAn.getValue());
        Map<String, BaseAccountFlowFragment> map = C207998Eh.LIZLLL;
        BaseAccountFlowFragment baseAccountFlowFragment = (BaseAccountFlowFragment) ((LinkedHashMap) map).get(((RBX) HG3.LJIILL()).getCurUserId());
        if (baseAccountFlowFragment == null) {
            baseAccountFlowFragment = C85635XjD.LIZ(enumC69113RAn);
        }
        map.put(((RBX) HG3.LJIILL()).getCurUserId(), baseAccountFlowFragment);
        AbstractActivityC69131RBf.LLIIIZ(this, baseAccountFlowFragment, bundle);
    }

    public final void LLILLJJLI(Bundle bundle) {
        EnumC69113RAn enumC69113RAn = EnumC69113RAn.CREATE_PASSWORD_FOR_PHONE;
        bundle.putBoolean("show_skip", true);
        bundle.putInt("current_page", enumC69113RAn.getValue());
        AbstractActivityC69131RBf.LLIIIZ(this, C85635XjD.LIZ(enumC69113RAn), bundle);
    }

    public final void LLILLL(Bundle bundle) {
        boolean z;
        if (C35831E4l.LIZ() == 3) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            EnumC69113RAn enumC69113RAn = EnumC69113RAn.CREATE_AVATAR_AND_NICKNAME;
            bundle.putInt("next_page", enumC69113RAn.getValue());
            Map<String, BaseAccountFlowFragment> map = C207998Eh.LIZLLL;
            BaseAccountFlowFragment baseAccountFlowFragment = (BaseAccountFlowFragment) ((LinkedHashMap) map).get(((RBX) HG3.LJIILL()).getCurUserId());
            if (baseAccountFlowFragment == null) {
                baseAccountFlowFragment = C85635XjD.LIZ(enumC69113RAn);
            }
            map.put(((RBX) HG3.LJIILL()).getCurUserId(), baseAccountFlowFragment);
            AbstractActivityC69131RBf.LLIIIZ(this, baseAccountFlowFragment, bundle);
            return;
        }
        EnumC69113RAn enumC69113RAn2 = EnumC69113RAn.CREATE_NICKNAME;
        bundle.putInt("next_page", enumC69113RAn2.getValue());
        AbstractActivityC69131RBf.LLIIIZ(this, C85635XjD.LIZ(enumC69113RAn2), bundle);
    }

    public final void LLILZ(Bundle bundle) {
        UserStore.AccountUser LIZ = UserStore.LIZ(RBW.LJLLI.LIZJ());
        if (LIZ != null && LIZ.privacyHighlights == 1 && ((RBX) HG3.LJIILL()).isNewUser()) {
            EnumC69113RAn enumC69113RAn = EnumC69113RAn.PRIVACY_HIGHLIGHT_FOR_TEENS;
            bundle.putInt("next_page", enumC69113RAn.getValue());
            AbstractActivityC69131RBf.LLIIIZ(this, C85635XjD.LIZ(enumC69113RAn), bundle);
            return;
        }
        LLIZLLLIL(bundle);
    }

    public final void LLIZLLLIL(Bundle bundle) {
        int i;
        EnumC69113RAn enumC69113RAn = EnumC69113RAn.PRIVATE_ACCOUNT_PROMPT;
        bundle.putInt("next_page", enumC69113RAn.getValue());
        UserStore.AccountUser LIZ = UserStore.LIZ(RBW.LJLLI.LIZJ());
        if (LIZ != null) {
            i = LIZ.privateAccountPrompt;
        } else {
            i = 0;
        }
        bundle.putInt("private_account_prompt", i);
        AbstractActivityC69131RBf.LLIIIZ(this, C85635XjD.LIZ(enumC69113RAn), bundle);
    }

    @Override // X.AbstractActivityC69131RBf, X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.v2.ui.SignUpOrLoginActivity", "onCreate", true);
        activityConfiguration(C41122GBy.LJLIL);
        super.onCreate(bundle);
        ((CopyOnWriteArrayList) C69101RAb.LIZJ).add(this);
        C69106RAg c69106RAg = EnumC69113RAn.Companion;
        int intExtra = getIntent().getIntExtra("next_page", EnumC69113RAn.PHONE_EMAIL_LOGIN.getValue());
        c69106RAg.getClass();
        this.LJLJJI = C69106RAg.LIZ(intExtra);
        this.LJLJJL = C69106RAg.LIZ(getIntent().getIntExtra("child_page", EnumC69113RAn.NONE.getValue()));
        if (bundle == null) {
            MediatorLiveData<Bundle> mediatorLiveData = ((ActionResultModel) ViewModelProviders.of(this).get(ActionResultModel.class)).LJLIL;
            Bundle LLJJIJI = C16880lQ.LLJJIJI(getIntent());
            if (LLJJIJI == null) {
                LLJJIJI = new Bundle();
            }
            LLJJIJI.putString("enter_from", LJJLIIIJJI());
            LLJJIJI.putString("enter_method", LJJLIIIJLLLLLLLZ());
            String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(getIntent(), "enter_type");
            if (LLJJIJIIJIL == null) {
                LLJJIJIIJIL = "";
            }
            LLJJIJI.putString("enter_type", LLJJIJIIJIL);
            LLJJIJI.putInt("next_page", this.LJLJJI.getValue());
            mediatorLiveData.postValue(LLJJIJI);
        }
        RAP.LIZ().getClass();
        this.LJLLILLLL = getIntent().getBooleanExtra("js_bridge_initiated", false);
        this.LJLLJ = C16880lQ.LLJJIJIIJIL(getIntent(), "launch_webview_after_restart_url");
        Intent intent = getIntent();
        this.LJLL = intent.getBooleanExtra("should_restart_later", false);
        Bundle LJJLIIIIJ = C16880lQ.LJJLIIIIJ(intent, "restart_bundle");
        if (LJJLIIIIJ == null) {
            LJJLIIIIJ = new Bundle();
        }
        this.LJLLI = LJJLIIIIJ;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.v2.ui.SignUpOrLoginActivity", "onCreate", false);
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity
    public final void onRestoreInstanceState(Bundle savedInstanceState) {
        o.LJIIIZ(savedInstanceState, "savedInstanceState");
        super.onRestoreInstanceState(savedInstanceState);
        String string = savedInstanceState.getString("birthday");
        if (string != null) {
            String LJ = a.LIZIZ().LJ();
            if (LJ == null || LJ.length() == 0) {
                a.LIZIZ().LJIL(string);
            }
            getIntent().putExtra("birthday", string);
        }
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onSaveInstanceState(Bundle outState) {
        String LLJJIJIIJIL;
        o.LJIIIZ(outState, "outState");
        if (C78685UuP.LJJJZ(a.LIZIZ().LJ())) {
            LLJJIJIIJIL = a.LIZIZ().LJ();
        } else {
            LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(getIntent(), "birthday");
        }
        outState.putString("birthday", LLJJIJIIJIL);
        super.onSaveInstanceState(outState);
    }

    @Override // X.AbstractActivityC69131RBf, X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        RAP.LIZ().getClass();
    }
}
