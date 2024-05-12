package com.ss.android.ugc.aweme.services;

import X.AGJ;
import X.C03880Dg;
import X.C16880lQ;
import X.C1DH;
import X.C242869g2;
import X.C30581Hy;
import X.C33884DRo;
import X.C35936E8m;
import X.C38489F8r;
import X.C38995FSd;
import X.C40455FuF;
import X.C40926G4k;
import X.C53203KuN;
import X.C53262KvK;
import X.C58725N2z;
import X.C63026OoQ;
import X.C65300Pk0;
import X.C68517Qun;
import X.C68973R5d;
import X.C68988R5s;
import X.C68989R5t;
import X.C78451Uqd;
import X.C85997Xp3;
import X.DialogC81625W1t;
import X.EF7;
import X.EZM;
import X.EnumC69113RAn;
import X.EnumC69116RAq;
import X.EnumC85993Xoz;
import X.FGR;
import X.FMX;
import X.GBL;
import X.HG3;
import X.InterfaceC40454FuE;
import X.O0X;
import X.R41;
import X.R42;
import X.R46;
import X.R4B;
import X.R4D;
import X.R60;
import X.R67;
import X.RBV;
import X.RBX;
import X.RBY;
import X.V1B;
import X.X1D;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.Window;
import android.view.WindowManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.keva.Keva;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.account.guestmode.GuestModeServiceImpl;
import com.ss.android.ugc.aweme.account.login.model.AccountPassLoginMethod;
import com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod;
import com.ss.android.ugc.aweme.account.login.model.LoginMethodName;
import com.ss.android.ugc.aweme.account.login.model.PhoneLoginMethod;
import com.ss.android.ugc.aweme.account.login.ui.MusCountryListActivity;
import com.ss.android.ugc.aweme.account.login.v2.ui.SignUpOrLoginActivity;
import com.ss.android.ugc.aweme.account.reactive.ReactiveAccountActivity;
import com.ss.android.ugc.aweme.app.PushLoginActivity;
import com.ss.android.ugc.aweme.app.services.IFeed0VVManagerService;
import com.ss.android.ugc.aweme.service.increaseloginnotify.IncreaseLoginNotifyService;
import com.ss.android.ugc.aweme.services.LoginService;
import com.ss.android.ugc.aweme.user.SignificantUserInfo;
import com.zhiliaoapp.musically.R;
import defpackage.b0;
import defpackage.e1;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;
import yq4.a;

/* loaded from: classes12.dex */
public class LoginService extends BaseLoginService {
    public Dialog mLoginDialog;

    public static /* synthetic */ void lambda$openPrivacyPolicy$3(boolean z) {
    }

    public static /* synthetic */ void lambda$showLoginAndRegisterViewInner$0() {
        R41.LJIIL(1, 3, "");
        R41.LJIIIZ();
    }

    @Override // com.ss.android.ugc.aweme.services.BaseLoginService, X.InterfaceC65895Ptb
    public void checkin() {
        FGR.LIZIZ().LIZ(null, EZM.LJLIL, 0);
    }

    @Override // com.ss.android.ugc.aweme.services.BaseLoginService, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public void retryLogin() {
        retryLogin(false);
    }

    @Override // com.ss.android.ugc.aweme.services.BaseLoginService, X.InterfaceC65895Ptb
    public void tryUpdateStoredLoginPlatform() {
    }

    /* renamed from: com.ss.android.ugc.aweme.services.LoginService$1 */
    /* loaded from: classes12.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$android$ugc$aweme$account$login$model$LoginMethodName;

        static {
            int[] iArr = new int[LoginMethodName.values().length];
            $SwitchMap$com$ss$android$ugc$aweme$account$login$model$LoginMethodName = iArr;
            try {
                iArr[LoginMethodName.THIRD_PARTY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$android$ugc$aweme$account$login$model$LoginMethodName[LoginMethodName.PHONE_NUMBER_PASS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$ss$android$ugc$aweme$account$login$model$LoginMethodName[LoginMethodName.PHONE_SMS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$ss$android$ugc$aweme$account$login$model$LoginMethodName[LoginMethodName.EMAIL_PASS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$ss$android$ugc$aweme$account$login$model$LoginMethodName[LoginMethodName.USER_NAME_PASS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.services.BaseLoginService, X.InterfaceC65895Ptb
    public List<C40926G4k> getAllSupportedLoginPlatform() {
        C40926G4k c40926G4k;
        LinkedList linkedList = new LinkedList(super.getAllSupportedLoginPlatform());
        linkedList.add(new C40926G4k("Email", "email"));
        EnumC85993Xoz[] values = EnumC85993Xoz.values();
        LinkedList linkedList2 = new LinkedList();
        if (values != null) {
            C38489F8r LJJIIJZLJL = C30581Hy.LJJIIJZLJL(values);
            while (LJJIIJZLJL.hasNext()) {
                EnumC85993Xoz enumC85993Xoz = (EnumC85993Xoz) LJJIIJZLJL.next();
                o.LJI(enumC85993Xoz);
                if (C68973R5d.LIZIZ(enumC85993Xoz)) {
                    switch (C85997Xp3.LIZ[enumC85993Xoz.ordinal()]) {
                        case 1:
                            c40926G4k = new C40926G4k("Facebook", "facebook");
                            break;
                        case 2:
                            c40926G4k = new C40926G4k("Twitter", "twitter");
                            break;
                        case 3:
                            c40926G4k = new C40926G4k("Google", "google");
                            break;
                        case 4:
                            c40926G4k = new C40926G4k("Line", "line");
                            break;
                        case 5:
                            c40926G4k = new C40926G4k("Kakao Talk", "kakaotalk");
                            break;
                        case 6:
                            c40926G4k = new C40926G4k("Instagram", "instagram");
                            break;
                        case 7:
                            c40926G4k = new C40926G4k("VK", "vk");
                            break;
                    }
                    linkedList2.add(c40926G4k);
                }
            }
        }
        linkedList.addAll(linkedList2);
        return linkedList;
    }

    @Override // com.ss.android.ugc.aweme.services.BaseLoginService, X.InterfaceC65895Ptb
    public boolean isEnableMultiAccountLogin() {
        if (e1.LIZ(31744, "enable_multi_account_login", true, true) && !((RBY) HG3.LJIILL()).isChildrenMode()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.services.BaseLoginService
    public void onDestroy() {
        super.onDestroy();
        Dialog dialog = this.mLoginDialog;
        if (dialog != null) {
            dialog.dismiss();
            this.mLoginDialog = null;
        }
    }

    @Override // com.ss.android.ugc.aweme.services.BaseLoginService
    public void onShowLoginPanel() {
        IncreaseLoginNotifyService.LJI().LJFF();
    }

    @Override // com.ss.android.ugc.aweme.services.BaseLoginService, X.InterfaceC65895Ptb
    public Class<? extends Activity> getPushLoginActivityClass() {
        return PushLoginActivity.class;
    }

    public /* synthetic */ void lambda$retryLogin$4(boolean z) {
        C68517Qun.LIZ.LJIIL(new BaseLoginMethod());
        if (getLoginParam() != null) {
            getLoginParam().LIZLLL.putBoolean("from_third_party_login", z);
            showLoginAndRegisterView(getLoginParam());
        }
    }

    private boolean shouldAvoidOneTapLogin(C78451Uqd c78451Uqd) {
        return "homepage_hot_proactive".equals(c78451Uqd.LIZJ);
    }

    @Override // com.ss.android.ugc.aweme.services.BaseLoginService
    public boolean isLoginActivity(Activity activity) {
        return activity instanceof SignUpOrLoginActivity;
    }

    @Override // com.ss.android.ugc.aweme.services.BaseLoginService
    public void openPrivacyPolicy(Activity activity) {
        if (C53203KuN.LIZ()) {
            a.LJII().LIZIZ(new O0X(false, AGJ.ACCOUNT_SIGNUP_OR_LOGIN.getValue(), true, true, "privacy-policy"), new b0());
        } else {
            V1B.LJLJJL(DialogC81625W1t.LIZIZ(activity));
        }
    }

    public void retryLogin(final boolean z) {
        new Handler().postDelayed(new Runnable() { // from class: X.R5k
            @Override // java.lang.Runnable
            public final void run() {
                LoginService.this.lambda$retryLogin$4(z);
            }
        }, 300L);
    }

    @Override // com.ss.android.ugc.aweme.services.BaseLoginService, X.InterfaceC65895Ptb
    public void showLoginAndRegisterView(C78451Uqd c78451Uqd) {
        super.showLoginAndRegisterView(c78451Uqd);
        Activity activity = c78451Uqd.LIZ;
        if (activity == null || activity.isFinishing()) {
            return;
        }
        boolean z = c78451Uqd.LIZLLL.getBoolean("is_fullscreen_dialog");
        R46.LIZ = c78451Uqd.LIZLLL.getString("enter_method", "");
        R46.LIZIZ = c78451Uqd.LIZLLL.getString("enter_from", "");
        R46.LIZJ = c78451Uqd.LIZLLL.getString("login_panel_type", "");
        if (a.LIZIZ().LJIILLIIL() && !z) {
            Activity activity2 = c78451Uqd.LIZ;
            Bundle data = c78451Uqd.LIZLLL;
            o.LJIIIZ(activity2, "activity");
            o.LJIIIZ(data, "data");
            R60 r60 = new R60(activity2, data);
            Window window = r60.getWindow();
            if (window != null) {
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.gravity = 80;
                attributes.flags |= 2;
                window.setAttributes(attributes);
                window.setWindowAnimations(R.style.a4w);
            }
            if (!new C03880Dg(2).LIZJ(300000, "com/ss/android/ugc/aweme/account/login/AgeGateBlockingLoginDialog", "show", r60, new Object[0], "void", new C65300Pk0(false, "()V", "4772092528057986209")).LIZ) {
                r60.show();
            }
            this.mLoginDialog = r60;
            return;
        }
        showLoginAndRegisterViewInner(c78451Uqd);
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void showLoginAndRegisterViewInner(X.C78451Uqd r26) {
        /*
            Method dump skipped, instructions count: 736
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.services.LoginService.showLoginAndRegisterViewInner(X.Uqd):void");
    }

    @Override // com.ss.android.ugc.aweme.services.BaseLoginService, X.InterfaceC65895Ptb
    public void showLoginView(C78451Uqd c78451Uqd) {
        super.showLoginView(c78451Uqd);
        RBV.LIZ = GuestModeServiceImpl.LJIIJJI().LJIIJ();
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZLLL("enter_method", R46.LIZ);
        FMX.LJIIL("click_login", c35936E8m.LIZ);
        IFeed0VVManagerService iFeed0VVManagerService = (IFeed0VVManagerService) C58725N2z.LIZIZ(IFeed0VVManagerService.class);
        if (iFeed0VVManagerService != null) {
            iFeed0VVManagerService.log("click_login");
            iFeed0VVManagerService.LIZ("LOGIN");
        }
        SmartRoute LIZ = R67.LIZ(c78451Uqd.LIZ);
        if (TextUtils.isEmpty(c78451Uqd.LIZLLL.getString("enter_type"))) {
            c78451Uqd.LIZLLL.putString("enter_type", "click_login");
        }
        LIZ.withParam(c78451Uqd.LIZLLL);
        LIZ.open();
    }

    @Override // com.ss.android.ugc.aweme.services.BaseLoginService, X.InterfaceC65895Ptb
    public boolean toRecoverDeletedAccount(String str) {
        if (R41.LIZJ().isUserCancelled()) {
            ((InterfaceC40454FuE) C58725N2z.LIZIZ(InterfaceC40454FuE.class)).LIZIZ();
            C40455FuF.LIZ();
            Context LIZIZ = EF7.LIZIZ();
            Intent intent = new Intent(LIZIZ, (Class<?>) ReactiveAccountActivity.class);
            intent.addFlags(268435456);
            if (!TextUtils.isEmpty(str)) {
                intent.putExtra("enter_from", str);
            }
            C16880lQ.LIZJ(LIZIZ, intent);
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.services.BaseLoginService, X.InterfaceC65895Ptb
    public void uploadAccountNum(boolean z) {
        if (C33884DRo.LIZLLL()) {
            C38995FSd.LIZIZ().execute(new Runnable() { // from class: X.R45
                @Override // java.lang.Runnable
                public final void run() {
                    R42.LIZ();
                }
            });
        } else {
            R42.LIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.services.BaseLoginService, X.InterfaceC65895Ptb
    public void loginByPlatform(C78451Uqd c78451Uqd, C40926G4k c40926G4k) {
        EnumC69113RAn enumC69113RAn;
        LoginMethodName loginMethodName;
        super.loginByPlatform(c78451Uqd, c40926G4k);
        if (c78451Uqd.LIZIZ.equals("find_account")) {
            try {
                JSONObject jSONObject = new JSONObject(c78451Uqd.LIZLLL.getString("jsb_parmas"));
                jSONObject.optString("uid", "");
                String optString = jSONObject.optString("nickname", "");
                String optString2 = jSONObject.optString("email", "");
                String optString3 = jSONObject.optString("mobile", "");
                String optString4 = jSONObject.optString("not_login_ticket", "");
                Boolean valueOf = Boolean.valueOf(jSONObject.optBoolean("is_safe", false));
                String str = c40926G4k.LJLILLLLZI;
                C68988R5s c68988R5s = new C68988R5s("", optString, optString2, optString3, null, optString4, valueOf.booleanValue(), valueOf.booleanValue());
                c78451Uqd.LIZLLL.putString("args_email", optString2);
                c78451Uqd.LIZLLL.putString("enter_from", "find_account");
                c78451Uqd.LIZLLL.putString("enter_method", "find_account");
                c78451Uqd.LIZLLL.putSerializable("recover_account_data", c68988R5s);
                Bundle bundle = c78451Uqd.LIZLLL;
                EnumC69116RAq enumC69116RAq = EnumC69116RAq.RECOVER_ACCOUNT;
                bundle.putInt("current_scene", enumC69116RAq.getValue());
                c78451Uqd.LIZLLL.putString("previous_uid", ((RBX) HG3.LJIILL()).getCurUserId());
                if (valueOf.booleanValue() && !optString4.isEmpty() && "mobile".equals(str)) {
                    Bundle bundle2 = c78451Uqd.LIZLLL;
                    EnumC69113RAn enumC69113RAn2 = EnumC69113RAn.PHONE_SMS_LOGIN;
                    bundle2.putInt("next_page", enumC69113RAn2.getValue());
                    c78451Uqd.LIZLLL.putInt("current_scene", enumC69116RAq.getValue());
                    c78451Uqd.LIZLLL.putInt("next_page", enumC69113RAn2.getValue());
                    c78451Uqd.LIZLLL.putBoolean("email_should_add_email", true);
                } else if ("mobile".equals(str)) {
                    c78451Uqd.LIZLLL.putInt("next_page", EnumC69113RAn.PHONE_EMAIL_LOGIN.getValue());
                    c78451Uqd.LIZLLL.putInt("child_page", EnumC69113RAn.INPUT_PHONE_LOGIN.getValue());
                } else if ("email".equals(str)) {
                    c78451Uqd.LIZLLL.putInt("next_page", EnumC69113RAn.PHONE_EMAIL_LOGIN.getValue());
                    c78451Uqd.LIZLLL.putInt("child_page", EnumC69113RAn.INPUT_EMAIL_LOGIN.getValue());
                }
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        if (c78451Uqd.LIZLLL.getBoolean("is_login", true)) {
            if (TextUtils.equals(c40926G4k.LJLILLLLZI, "mobile")) {
                loginMethodName = LoginMethodName.PHONE_SMS;
            } else if (TextUtils.equals(c40926G4k.LJLILLLLZI, "email")) {
                loginMethodName = LoginMethodName.EMAIL_PASS;
            }
            if (loginMethodName != null) {
                loginByMethodName(c78451Uqd.LIZ, c78451Uqd.LIZLLL, loginMethodName, null);
                return;
            }
        }
        String str2 = c40926G4k.LJLILLLLZI;
        str2.getClass();
        if (!str2.equals("mobile") && !str2.equals("email")) {
            if (TextUtils.isEmpty(c78451Uqd.LIZLLL.getString("enter_type"))) {
                c78451Uqd.LIZLLL.putString("enter_type", "click_login");
            }
            C68989R5t.LIZJ(c78451Uqd.LIZ, c40926G4k.LJLILLLLZI, new C63026OoQ(c78451Uqd.LIZLLL.getString("enter_from", ""), c78451Uqd.LIZLLL.getString("enter_method", ""), "click_login", "login", "", c78451Uqd.LIZLLL));
            return;
        }
        SmartRoute LIZJ = R67.LIZJ(c78451Uqd.LIZ);
        if (TextUtils.equals(c40926G4k.LJLILLLLZI, "mobile")) {
            enumC69113RAn = EnumC69113RAn.INPUT_PHONE_SIGN_UP;
        } else {
            enumC69113RAn = EnumC69113RAn.INPUT_EMAIL_SIGN_UP;
        }
        LIZJ.withParam("child_page", enumC69113RAn.getValue());
        if (TextUtils.isEmpty(c78451Uqd.LIZLLL.getString("enter_type"))) {
            c78451Uqd.LIZLLL.putString("enter_type", "click_sign_up");
        }
        LIZJ.withParam(c78451Uqd.LIZLLL);
        LIZJ.open();
    }

    @Override // com.ss.android.ugc.aweme.services.BaseLoginService, X.InterfaceC65895Ptb
    public void openCountryListActivity(Activity activity, GBL gbl) {
        Intent intent = new Intent(activity, (Class<?>) MusCountryListActivity.class);
        MusCountryListActivity.LJLJLJ = gbl;
        C16880lQ.LIZIZ(activity, intent);
    }

    @Override // com.ss.android.ugc.aweme.services.BaseLoginService, X.InterfaceC65895Ptb
    public void saveDTicket(String str, String uid) {
        if (str == null) {
            str = "";
        }
        o.LJIIIZ(uid, "uid");
        if (TextUtils.isEmpty(uid)) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("aweme_user_config__");
        LIZ.append(uid);
        Keva.getRepo(X1D.LIZIZ(LIZ)).storeString("d_ticket", str);
    }

    @Override // com.ss.android.ugc.aweme.services.BaseLoginService, X.InterfaceC65895Ptb
    public void showFTCCreateAccountView(Activity activity, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putInt("next_page", EnumC69113RAn.FTC_CREATE_ACCOUNT.getValue());
        if (z) {
            bundle.putBoolean("show_consent", true);
        }
        SmartRoute buildRoute = SmartRouter.buildRoute(activity, "//account/ftc");
        buildRoute.withParam(bundle);
        buildRoute.open();
    }

    public static void lambda$showLoginAndRegisterViewInner$1(int i, int i2, Object obj) {
        R41.LJIIJJI(10, 4);
        if (i2 == 1) {
            if (i == EnumC69116RAq.ONE_KEY_LOGIN.getValue()) {
                R41.LJIIL(1, 1, "");
                R41.LJIIIIZZ(R41.LIZJ());
                return;
            }
            return;
        }
        C1DH.LJJIJIIJIL(200L, new Runnable() { // from class: X.R5m
            @Override // java.lang.Runnable
            public final void run() {
                LoginService.lambda$showLoginAndRegisterViewInner$0();
            }
        });
    }

    public boolean loginByMethod(Activity activity, Bundle bundle, BaseLoginMethod baseLoginMethod) {
        String str;
        LoginMethodName loginMethodName = baseLoginMethod.getLoginMethodName();
        bundle.putString("enter_type", "history_login");
        if (baseLoginMethod.isHistoryLogin()) {
            int i = AnonymousClass1.$SwitchMap$com$ss$android$ugc$aweme$account$login$model$LoginMethodName[loginMethodName.ordinal()];
            if (i != 1) {
                if (i != 2 && i != 3) {
                    if (i == 4 || i == 5) {
                        bundle.putInt("current_scene", EnumC69116RAq.HISTORY_LOGIN.getValue());
                        bundle.putSerializable("auto_fill_account_name", ((AccountPassLoginMethod) baseLoginMethod).getName());
                    }
                } else {
                    PhoneLoginMethod phoneLoginMethod = (PhoneLoginMethod) baseLoginMethod;
                    bundle.putSerializable("auto_fill_phone_number", phoneLoginMethod.getPhoneNumber());
                    if (C53262KvK.LIZIZ()) {
                        bundle.putInt("next_page", EnumC69113RAn.PHONE_SMS_LOGIN.getValue());
                        bundle.putInt("current_scene", EnumC69116RAq.HISTORY_LOGIN.getValue());
                        bundle.putSerializable("args_phone_number", phoneLoginMethod.getPhoneNumber());
                        bundle.putBoolean("code_sent", false);
                        bundle.putBoolean("use_whatsapp", false);
                        bundle.putBoolean("from_choose_dialog", false);
                    }
                }
            } else {
                bundle.putInt("current_scene", EnumC69116RAq.HISTORY_LOGIN.getValue());
                str = baseLoginMethod.findPlatform();
                return loginByMethodName(activity, bundle, loginMethodName, str);
            }
        }
        str = "";
        return loginByMethodName(activity, bundle, loginMethodName, str);
    }

    @Override // com.ss.android.ugc.aweme.services.BaseLoginService
    public void openFeedback(Activity activity, String str, String str2) {
        C242869g2.LIZ(activity, str, str2);
    }

    @Override // com.ss.android.ugc.aweme.services.BaseLoginService, X.InterfaceC65895Ptb
    public void switchAccount(SignificantUserInfo significantUserInfo, Bundle bundle, R4B r4b) {
        R4D.LIZJ(significantUserInfo.uid, bundle, false, false, r4b);
    }

    private boolean loginByMethodName(Activity activity, Bundle bundle, LoginMethodName loginMethodName, String str) {
        String string = bundle.getString("enter_type");
        if (string == null || TextUtils.isEmpty(string)) {
            string = "click_login";
        }
        int i = AnonymousClass1.$SwitchMap$com$ss$android$ugc$aweme$account$login$model$LoginMethodName[loginMethodName.ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3) {
                if (i != 4 && i != 5) {
                    return false;
                }
                SmartRoute LIZ = R67.LIZ(activity);
                LIZ.withParam("child_page", EnumC69113RAn.INPUT_EMAIL_LOGIN.getValue());
                bundle.putString("enter_type", string);
                LIZ.withParam(bundle);
                LIZ.open();
                return true;
            }
            SmartRoute LIZ2 = R67.LIZ(activity);
            LIZ2.withParam("child_page", EnumC69113RAn.INPUT_PHONE_LOGIN.getValue());
            bundle.putString("enter_type", string);
            LIZ2.withParam(bundle);
            LIZ2.open();
            return true;
        }
        if (str.isEmpty()) {
            return false;
        }
        C68989R5t.LIZJ(activity, str, new C63026OoQ(bundle.getString("enter_from", ""), bundle.getString("enter_method", ""), string, bundle.getString("login_panel_type", "login"), "", bundle));
        return true;
    }
}
