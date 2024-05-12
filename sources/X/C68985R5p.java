package X;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.IAccountBindingsService;
import com.ss.android.ugc.aweme.IPrevLoginPlatformService;
import com.ss.android.ugc.aweme.account.experiment.AccountBindingsService;
import com.ss.android.ugc.aweme.account.login.model.AccountPassLoginMethod;
import com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod;
import com.ss.android.ugc.aweme.account.login.model.LoginMethodName;
import com.ss.android.ugc.aweme.account.login.model.PhoneLoginMethod;
import com.ss.android.ugc.aweme.account.login.prevlogin.PrevLoginPlatformService;
import com.ss.android.ugc.aweme.account.login.utils.PhoneNumberUtil;
import com.ss.android.ugc.aweme.account.login.v2.base.ActionResultModel;
import com.ss.android.ugc.aweme.account.login.v2.ui.SignUpOrLoginActivity;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragment;
import com.ss.android.ugc.aweme.account.network.AccountRetrofitInetcept;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.service.IRegionMockService;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import yq4.a;

/* renamed from: X.R5p, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68985R5p {
    public static final IAccountBindingsService LIZ = AccountBindingsService.LIZJ();

    public static void LIZJ(PhoneNumberUtil.PhoneNumber phoneNumber, InputCodeFragment viewCallback, R7W r7w) {
        JSONObject optJSONObject;
        o.LJIIIZ(viewCallback, "viewCallback");
        Bundle arguments = viewCallback.getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        User LIZJ = R41.LIZJ();
        if (phoneNumber != null) {
            C68517Qun c68517Qun = C68517Qun.LIZ;
            String uid = LIZJ.getUid();
            o.LJIIIIZZ(uid, "curUser.uid");
            synchronized (c68517Qun) {
                Iterator it = ((ArrayList) C68517Qun.LIZJ).iterator();
                boolean z = false;
                while (it.hasNext()) {
                    BaseLoginMethod baseLoginMethod = (BaseLoginMethod) it.next();
                    if (o.LJ(baseLoginMethod.getUid(), uid) && (baseLoginMethod instanceof PhoneLoginMethod)) {
                        ((PhoneLoginMethod) baseLoginMethod).setPhoneNumber(phoneNumber);
                        z = true;
                    }
                }
                if (z) {
                    C68517Qun.LIZIZ.LIZJ(C68517Qun.LIZJ, null);
                }
            }
        }
        if (r7w != null) {
            try {
                JSONObject jSONObject = r7w.LJ;
                if (jSONObject != null && (optJSONObject = jSONObject.optJSONObject("data")) != null) {
                    String phone = optJSONObject.optString("mobile");
                    LIZJ.setPhoneBinded(true);
                    LIZJ.setBindPhone(phone);
                    RBY LIZ2 = R41.LIZ();
                    QTX qtx = new QTX(jSONObject);
                    qtx.LIZ();
                    LIZ2.updateUserInfo(qtx);
                    o.LJIIIIZZ(phone, "phone");
                    String jSONObject2 = optJSONObject.toString();
                    o.LJIIIIZZ(jSONObject2, "data.toString()");
                    R41.LJIIL(7, 1, new RC1(phone, jSONObject2));
                }
            } catch (Exception unused) {
            }
        }
        if (LIZ.LIZ()) {
            arguments.putBoolean("show_modify_phone_success_toast", true);
        }
        viewCallback.Dl(arguments);
    }

    public static void LIZ(Activity activity, QTX qtx, JSONObject jSONObject, boolean z) {
        o.LJIIIZ(activity, "activity");
        C66569QAr.LIZ(qtx.LIZJ, qtx.LJIJ);
        R41.LJIILIIL(qtx);
        AccountRetrofitInetcept.LJLIL.getClass();
        AccountRetrofitInetcept.LJLJI = "";
        Bundle bundle = new Bundle();
        Bundle LLJJIJI = C16880lQ.LLJJIJI(activity.getIntent());
        if (LLJJIJI != null) {
            bundle.putAll(LLJJIJI);
        }
        if (R41.LJII()) {
            bundle.putBoolean("only_login", true);
        }
        ((LocalTestApi) ServiceManager.get().getService(LocalTestApi.class)).setIsLoggedIn(true);
        C39326Fc2.LIZIZ(bundle, new C68979R5j(activity, qtx, jSONObject, z));
        if (C69040R7s.LIZIZ()) {
            ((IRegionMockService) ServiceManager.get().getService(IRegionMockService.class)).LIZIZ();
        }
    }

    public static void LIZIZ(Fragment fragment, InterfaceC69056R8i accountCallback, EnumC69116RAq scene, EnumC69113RAn step, QTZ qtz) {
        String str;
        Bundle extras;
        BaseLoginMethod baseLoginMethod;
        LoginMethodName loginMethodName;
        LoginMethodName loginMethodName2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        QTX qtx;
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(accountCallback, "accountCallback");
        o.LJIIIZ(scene, "scene");
        o.LJIIIZ(step, "step");
        String str2 = qtz.LIZJ;
        if ((qtz instanceof QTX) && (qtx = (QTX) qtz) != null) {
            str = qtx.LJIJ;
        } else {
            str = null;
        }
        C66569QAr.LIZ(str2, str);
        R41.LJIILIIL(qtz);
        AccountRetrofitInetcept.LJLIL.getClass();
        String str3 = "";
        AccountRetrofitInetcept.LJLJI = "";
        if (scene == EnumC69116RAq.SIGN_UP) {
            Bundle extras2 = accountCallback.getExtras();
            if (extras2 != null) {
                extras2.putString("auth_type", "signup");
            }
        } else if (scene == EnumC69116RAq.LOGIN && (extras = accountCallback.getExtras()) != null) {
            extras.putString("auth_type", "login");
        }
        Bundle extras3 = accountCallback.getExtras();
        if (extras3 == null) {
            extras3 = new Bundle();
        }
        if (!AV1.LJIILLIIL()) {
            if (extras3.getSerializable("recover_account_data") != null) {
                Serializable serializable = extras3.getSerializable("recover_account_data");
                o.LJII(serializable, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.recover.RecoverAccountModel");
                if (!((C68988R5s) serializable).getNeedStoreLastMethod()) {
                    C68517Qun.LIZ.LJIIL(new BaseLoginMethod(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null));
                }
            }
            C68517Qun c68517Qun = C68517Qun.LIZ;
            C69106RAg c69106RAg = EnumC69113RAn.Companion;
            int i = extras3.getInt("current_page");
            c69106RAg.getClass();
            switch (C69107RAh.LIZ[C69106RAg.LIZ(i).ordinal()]) {
                case 4:
                case 5:
                case 10:
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                case 12:
                case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                    PhoneNumberUtil.PhoneNumber phoneNumber = (PhoneNumberUtil.PhoneNumber) extras3.getSerializable("args_phone_number");
                    if (phoneNumber != null) {
                        baseLoginMethod = new PhoneLoginMethod(R41.LIZLLL(), LoginMethodName.PHONE_SMS, phoneNumber, null, Long.valueOf(System.currentTimeMillis()), null, null, 104, null);
                        break;
                    } else {
                        baseLoginMethod = new BaseLoginMethod(null, null, null, null, Long.valueOf(System.currentTimeMillis()), null, null, null, null, null, null, null, null, 8175, null);
                        break;
                    }
                case 6:
                case 9:
                default:
                    PhoneNumberUtil.PhoneNumber phoneNumber2 = (PhoneNumberUtil.PhoneNumber) extras3.getSerializable("args_phone_number");
                    String LIZJ = RBV.LIZJ(extras3);
                    if (C47261Igj.LJIILLIIL(LIZJ)) {
                        loginMethodName2 = LoginMethodName.EMAIL_PASS;
                    } else {
                        loginMethodName2 = LoginMethodName.USER_NAME_PASS;
                    }
                    if (phoneNumber2 != null) {
                        baseLoginMethod = new PhoneLoginMethod(R41.LIZLLL(), LoginMethodName.PHONE_SMS, phoneNumber2, null, Long.valueOf(System.currentTimeMillis()), null, null, 104, null);
                        break;
                    } else if (TextUtils.isEmpty(LIZJ)) {
                        baseLoginMethod = new AccountPassLoginMethod(R41.LIZLLL(), loginMethodName2, LIZJ, null, Long.valueOf(System.currentTimeMillis()), null, null, 104, null);
                        break;
                    } else {
                        baseLoginMethod = new BaseLoginMethod(null, null, null, null, Long.valueOf(System.currentTimeMillis()), null, null, null, null, null, null, null, null, 8175, null);
                        break;
                    }
                case 7:
                case 8:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    String LIZJ2 = RBV.LIZJ(extras3);
                    if (C47261Igj.LJIILLIIL(LIZJ2)) {
                        loginMethodName = LoginMethodName.EMAIL_PASS;
                    } else {
                        loginMethodName = LoginMethodName.USER_NAME_PASS;
                    }
                    baseLoginMethod = new AccountPassLoginMethod(R41.LIZLLL(), loginMethodName, LIZJ2, null, Long.valueOf(System.currentTimeMillis()), null, null, 104, null);
                    break;
                case 14:
                case 15:
                case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                    PhoneNumberUtil.PhoneNumber phoneNumber3 = (PhoneNumberUtil.PhoneNumber) extras3.getSerializable("args_phone_number");
                    if (phoneNumber3 != null) {
                        baseLoginMethod = new PhoneLoginMethod(R41.LIZLLL(), LoginMethodName.PHONE_NUMBER_PASS, phoneNumber3, null, Long.valueOf(System.currentTimeMillis()), null, null, 104, null);
                        break;
                    } else {
                        baseLoginMethod = new BaseLoginMethod(null, null, null, null, Long.valueOf(System.currentTimeMillis()), null, null, null, null, null, null, null, null, 8175, null);
                        break;
                    }
            }
            c68517Qun.LJIIL(baseLoginMethod);
        }
        boolean z6 = true;
        ((LocalTestApi) ServiceManager.get().getService(LocalTestApi.class)).setIsLoggedIn(true);
        ActivityC45651qj mo49getActivity = fragment.mo49getActivity();
        if (mo49getActivity != null) {
            MediatorLiveData<Bundle> mediatorLiveData = ((ActionResultModel) ViewModelProviders.of(mo49getActivity).get(ActionResultModel.class)).LJLILLLLZI;
            String str4 = "email";
            if (qtz.LJ) {
                Bundle extras4 = accountCallback.getExtras();
                if (extras4 != null) {
                    if (step == EnumC69113RAn.EMAIL_SMS_SIGN_UP || step == EnumC69113RAn.CREATE_PASSWORD_FOR_EMAIL) {
                        extras4.putString("set_nickname_platform", "email");
                        extras4.putString("platform_profile", "email");
                    } else if (!qtz.LJIIIZ) {
                        extras4.putString("set_nickname_platform", "sms_verification");
                        extras4.putString("platform_profile", "sms_verification");
                    }
                }
            } else if (fragment.mo49getActivity() instanceof SignUpOrLoginActivity) {
                a.LIZIZ().LJIL(null);
            }
            JSONObject jSONObject = qtz.LJIILJJIL;
            if (jSONObject != null) {
                z = jSONObject.optBoolean("email_collected", false);
            } else {
                z = false;
            }
            if (!TextUtils.isEmpty(qtz.LJII) || z) {
                z2 = true;
            } else {
                z2 = false;
            }
            extras3.putBoolean("should_bind_email", !z2);
            JSONObject jSONObject2 = qtz.LJIILJJIL;
            if (jSONObject2 != null) {
                z3 = jSONObject2.optBoolean("phone_collected", false);
            } else {
                z3 = false;
            }
            if (!TextUtils.isEmpty(qtz.LJI) || z3) {
                z4 = true;
            } else {
                z4 = false;
            }
            extras3.putBoolean("should_bind_phone", !z4);
            JSONObject jSONObject3 = qtz.LJIILJJIL;
            if (jSONObject3 != null && jSONObject3.optInt("is_kids_mode") != 1) {
                z5 = true;
            } else {
                z5 = false;
            }
            extras3.putBoolean("is_user_age_legal", z5);
            JSONObject jSONObject4 = qtz.LJIILJJIL;
            if (jSONObject4 == null || jSONObject4.optInt("cmpl_check_box_type") != 1) {
                z6 = false;
            }
            extras3.putBoolean("is_check_box_legal", z6);
            int[] iArr = C69107RAh.LIZ;
            switch (iArr[step.ordinal()]) {
                case 4:
                case 5:
                case 10:
                case 12:
                case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                case 14:
                case 15:
                case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                case 24:
                    str4 = "mobile";
                    break;
                case 6:
                case 9:
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                case 19:
                default:
                    str4 = "";
                    break;
                case 7:
                case 8:
                case 17:
                case 18:
                case 20:
                case 21:
                case 22:
                case 23:
                    break;
            }
            IPrevLoginPlatformService LJIIL = PrevLoginPlatformService.LJIIL();
            if (!o.LJ(LJIIL.LJFF(qtz.LIZ), "username")) {
                LJIIL.LJIIJJI(qtz.LIZ, str4);
                LJIIL.LJIIIIZZ(str4);
            }
            if (!TextUtils.isEmpty(str4)) {
                extras3.putString("platform", str4);
            }
            switch (iArr[step.ordinal()]) {
                case 4:
                case 5:
                case 10:
                case 24:
                    str3 = "phone_sms";
                    break;
                case 7:
                case 8:
                case 17:
                case 18:
                case 20:
                case 23:
                    str3 = "email_or_username";
                    break;
                case 12:
                    str3 = "phone_sms_two_factor_password";
                    break;
                case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                    str3 = "phone_sms_two_factor_email_code";
                    break;
                case 14:
                case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                    str3 = "phone_password";
                    break;
                case 15:
                    str3 = "reset_password_for_phone";
                    break;
                case 21:
                    str3 = "email_password_two_factor_email_code";
                    break;
                case 22:
                    str3 = "email_password_two_factor_sms";
                    break;
                case 25:
                    str3 = "qr_code_login";
                    break;
            }
            if (!TextUtils.isEmpty(str3)) {
                extras3.putString("login_path", str3);
            }
            mediatorLiveData.postValue(extras3);
        }
        if (C69040R7s.LIZIZ()) {
            ((IRegionMockService) ServiceManager.get().getService(IRegionMockService.class)).LIZIZ();
        }
    }
}
