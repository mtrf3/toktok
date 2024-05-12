package X;

import android.app.Application;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.account.login.utils.PhoneNumberUtil;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.R9l, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C69085R9l<T> implements InterfaceC73592SuS {
    public final /* synthetic */ InterfaceC69056R8i LJLIL;
    public final /* synthetic */ C34K LJLILLLLZI;
    public final /* synthetic */ Fragment LJLJI;

    public C69085R9l(InterfaceC69056R8i interfaceC69056R8i, C34K c34k, Fragment fragment) {
        this.LJLIL = interfaceC69056R8i;
        this.LJLILLLLZI = c34k;
        this.LJLJI = fragment;
    }

    @Override // X.InterfaceC73592SuS
    public final boolean test(Object obj) {
        boolean z;
        boolean z2;
        String str;
        String str2;
        String optString;
        String optString2;
        String optString3;
        AbstractC69088R9o abstractC69088R9o;
        Throwable it = (Throwable) obj;
        o.LJIIIZ(it, "it");
        this.LJLIL.ee(0);
        this.LJLILLLLZI.element = true;
        if (it instanceof C69084R9k) {
            Fragment fragment = this.LJLJI;
            InterfaceC69056R8i accountCallback = this.LJLIL;
            C69084R9k c69084R9k = (C69084R9k) it;
            int errorCode = c69084R9k.getErrorCode();
            String message = it.getMessage();
            String str3 = "";
            if (message == null) {
                message = "";
            }
            EnumC69116RAq scene = c69084R9k.getScene();
            EnumC69113RAn step = c69084R9k.getStep();
            JSONObject extra = c69084R9k.getExtra();
            o.LJIIIZ(fragment, "fragment");
            o.LJIIIZ(accountCallback, "accountCallback");
            o.LJIIIZ(scene, "scene");
            o.LJIIIZ(step, "step");
            Bundle extras = accountCallback.getExtras();
            if (extras != null && extras.getBoolean("from_ProAccount")) {
                z = true;
            } else {
                z = false;
            }
            if (QQD.LIZ.contains(Integer.valueOf(errorCode)) || QQD.LIZIZ.contains(Integer.valueOf(errorCode)) || errorCode == 2135) {
                return true;
            }
            ((LocalTestApi) ServiceManager.get().getService(LocalTestApi.class)).setIsLoggedIn(false);
            Application application = C58725N2z.LIZ;
            if (accountCallback.LJLLLL() == EnumC69113RAn.PHONE_PASSWORD_LOGIN || accountCallback.LJLLLL() == EnumC69113RAn.PHONE_EMAIL_LOGIN) {
                z2 = true;
            } else {
                z2 = false;
            }
            switch (errorCode) {
                case 1001:
                    if (z) {
                        C35936E8m c35936E8m = new C35936E8m();
                        c35936E8m.LIZLLL("page", "Input Phone Captcha");
                        c35936E8m.LIZLLL("error_code", "2");
                        FMX.LJIIL("input_wrong_phone", c35936E8m.LIZ);
                    }
                    abstractC69088R9o = new C69057R8j(fragment, accountCallback, errorCode, message);
                    break;
                case 1002:
                case 1003:
                    if (z) {
                        C35936E8m c35936E8m2 = new C35936E8m();
                        c35936E8m2.LIZLLL("page", "Input Phone Captcha");
                        c35936E8m2.LIZLLL("error_code", "1");
                        FMX.LJIIL("input_wrong_phone", c35936E8m2.LIZ);
                    }
                    String string = application.getString(R.string.dqf);
                    o.LJIIIIZZ(string, "applicationContext.getSt…ration_phone_input_error)");
                    abstractC69088R9o = new C69057R8j(fragment, accountCallback, errorCode, string);
                    break;
                case 1009:
                    if (z2) {
                        String string2 = application.getString(R.string.dol);
                        o.LJIIIIZZ(string2, "applicationContext.getSt…mon_login_password_error)");
                        abstractC69088R9o = new C69057R8j(fragment, accountCallback, errorCode, string2);
                        break;
                    } else if (accountCallback.LJLLLL() == EnumC69113RAn.EMAIL_PASSWORD_LOGIN || accountCallback.LJLLLL() == EnumC69113RAn.INPUT_EMAIL_LOGIN || accountCallback.LJLLLL() == EnumC69113RAn.COMBINED_INPUT_EMAIL_LOGIN_SIGN_UP) {
                        String string3 = application.getString(R.string.dnz);
                        o.LJIIIIZZ(string3, "applicationContext.getSt…common_login_email_error)");
                        abstractC69088R9o = new C69057R8j(fragment, accountCallback, errorCode, string3);
                        break;
                    } else {
                        abstractC69088R9o = new C69057R8j(fragment, accountCallback, errorCode, message);
                        break;
                    }
                    break;
                case 1011:
                    switch (C69107RAh.LIZ[accountCallback.LJLLLL().ordinal()]) {
                        case 1:
                        case 2:
                        case 3:
                            abstractC69088R9o = new C69090R9q(fragment, accountCallback, extra, accountCallback.LJLLLL());
                            break;
                        case 4:
                            if (extra != null && (optString3 = extra.optString("sms_code_key")) != null) {
                                str3 = optString3;
                            }
                            abstractC69088R9o = new RAI(fragment, accountCallback, str3);
                            break;
                        case 5:
                            if (extra != null && (optString2 = extra.optString("sms_code_key")) != null) {
                                str3 = optString2;
                            }
                            abstractC69088R9o = new RAH(fragment, accountCallback, str3);
                            break;
                        case 6:
                        case 7:
                        case 8:
                            String string4 = application.getString(R.string.dnz);
                            o.LJIIIIZZ(string4, "applicationContext.getSt…common_login_email_error)");
                            abstractC69088R9o = new C69057R8j(fragment, accountCallback, errorCode, string4);
                            break;
                        case 9:
                            String string5 = application.getString(R.string.doy);
                            o.LJIIIIZZ(string5, "applicationContext.getSt…_reset_email_input_error)");
                            abstractC69088R9o = new C69057R8j(fragment, accountCallback, errorCode, string5);
                            break;
                        default:
                            abstractC69088R9o = new C69057R8j(fragment, accountCallback, errorCode, message);
                            break;
                    }
                case 1023:
                    if (z) {
                        C35936E8m c35936E8m3 = new C35936E8m();
                        c35936E8m3.LIZLLL("page", "Input Email Captcha");
                        c35936E8m3.LIZLLL("error_code", "2");
                        FMX.LJIIL("input_wrong_email", c35936E8m3.LIZ);
                    }
                    String string6 = application.getString(R.string.g1z);
                    o.LJIIIIZZ(string6, "applicationContext.getSt…(R.string.email_is_taken)");
                    abstractC69088R9o = new C69057R8j(fragment, accountCallback, errorCode, string6);
                    break;
                case 1024:
                case 1028:
                    String string7 = application.getString(R.string.dr2);
                    o.LJIIIIZZ(string7, "applicationContext.getSt…istration_username_error)");
                    abstractC69088R9o = new C69057R8j(fragment, accountCallback, errorCode, string7);
                    break;
                case 1027:
                    String string8 = application.getString(R.string.dr3);
                    o.LJIIIIZZ(string8, "applicationContext.getSt…on_username_error_format)");
                    abstractC69088R9o = new C69057R8j(fragment, accountCallback, errorCode, string8);
                    break;
                case 1033:
                case 1034:
                    abstractC69088R9o = new C69057R8j(fragment, accountCallback, errorCode, message);
                    break;
                case 1039:
                    PhoneNumberUtil.PhoneNumber LJ = RBV.LJ(fragment);
                    if (z2 && LJ != null) {
                        abstractC69088R9o = new RAY(fragment, accountCallback, LJ, scene, step);
                        break;
                    } else {
                        abstractC69088R9o = new C69057R8j(fragment, accountCallback, errorCode, message);
                        break;
                    }
                case 1051:
                    String string9 = application.getString(R.string.dqa);
                    o.LJIIIIZZ(string9, "applicationContext.getSt…istration_password_error)");
                    abstractC69088R9o = new C69057R8j(fragment, accountCallback, errorCode, string9);
                    break;
                case 1053:
                    String string10 = application.getString(R.string.t_f);
                    o.LJIIIIZZ(string10, "applicationContext.getSt…sv_login_sms_block_title)");
                    abstractC69088R9o = new C69057R8j(fragment, accountCallback, errorCode, string10);
                    break;
                case 1054:
                    String string11 = application.getString(R.string.dp6);
                    o.LJIIIIZZ(string11, "applicationContext.getSt…_reset_phone_input_error)");
                    abstractC69088R9o = new C69057R8j(fragment, accountCallback, errorCode, string11);
                    break;
                case 1075:
                case 2006:
                    if (scene == EnumC69116RAq.RECOVER_ACCOUNT) {
                        String string12 = application.getString(R.string.pxa);
                        o.LJIIIIZZ(string12, "applicationContext.getSt…ver_account_error_access)");
                        abstractC69088R9o = new C69057R8j(fragment, accountCallback, errorCode, string12);
                        break;
                    } else {
                        abstractC69088R9o = new C69057R8j(fragment, accountCallback, errorCode, message);
                        break;
                    }
                case 1092:
                    if (accountCallback.scene() == EnumC69116RAq.BIND_PHONE || accountCallback.scene() == EnumC69116RAq.MODIFY_PHONE) {
                        String string13 = application.getString(R.string.qvp);
                        o.LJIIIIZZ(string13, "applicationContext.getSt…ssword_phone_input_error)");
                        abstractC69088R9o = new C69057R8j(fragment, accountCallback, errorCode, string13);
                        break;
                    } else if (scene == EnumC69116RAq.RECOVER_ACCOUNT) {
                        String string14 = application.getString(R.string.pxa);
                        o.LJIIIIZZ(string14, "applicationContext.getSt…ver_account_error_access)");
                        abstractC69088R9o = new C69057R8j(fragment, accountCallback, errorCode, string14);
                        break;
                    } else {
                        abstractC69088R9o = new C69057R8j(fragment, accountCallback, errorCode, message);
                        break;
                    }
                    break;
                case 1202:
                    String string15 = application.getString(R.string.dqk);
                    o.LJIIIIZZ(string15, "applicationContext.getSt…stration_phone_sms_error)");
                    abstractC69088R9o = new C69057R8j(fragment, accountCallback, errorCode, string15);
                    break;
                case 1203:
                    String string16 = application.getString(R.string.ibg);
                    o.LJIIIIZZ(string16, "applicationContext.getSt…(R.string.mus_error_code)");
                    abstractC69088R9o = new C69057R8j(fragment, accountCallback, errorCode, string16);
                    break;
                case 1320:
                    abstractC69088R9o = new C69100RAa(fragment, accountCallback);
                    break;
                case 1356:
                    String string17 = application.getString(R.string.t_w);
                    o.LJIIIIZZ(string17, "applicationContext.getSt…v_recover_pw_popup_title)");
                    abstractC69088R9o = new C69057R8j(fragment, accountCallback, errorCode, string17);
                    break;
                case 1381:
                    R70 r70 = new R70(fragment, scene, step, accountCallback, extra);
                    boolean z3 = r70.LIZJ.LIZJ;
                    abstractC69088R9o = r70;
                    if (!z3) {
                        String string18 = application.getString(R.string.g5w);
                        o.LJIIIIZZ(string18, "applicationContext.getSt…g(R.string.error_unknown)");
                        abstractC69088R9o = new C69057R8j(fragment, accountCallback, errorCode, string18);
                        break;
                    }
                    break;
                case 1382:
                    String string19 = application.getString(R.string.dyw);
                    o.LJIIIIZZ(string19, "applicationContext.getSt….string.createpw_error_1)");
                    abstractC69088R9o = new C69057R8j(fragment, accountCallback, errorCode, string19);
                    break;
                case 1383:
                    String string20 = application.getString(R.string.dyx);
                    o.LJIIIIZZ(string20, "applicationContext.getSt….string.createpw_error_3)");
                    abstractC69088R9o = new C69057R8j(fragment, accountCallback, errorCode, string20);
                    break;
                case 1388:
                    C188727au c188727au = new C188727au();
                    c188727au.LJIIIZ("enter_from", "missing_birthday");
                    FMX.LJIIL("pns_analysis_event", c188727au.LIZ);
                    abstractC69088R9o = new R75(fragment, accountCallback, message);
                    break;
                case 1421:
                    if (extra == null || (str = extra.optString("sms_code_key")) == null) {
                        str = "";
                    }
                    if (extra == null || (str2 = extra.optString("name")) == null) {
                        str2 = "";
                    }
                    if (extra != null && (optString = extra.optString("avatar_url")) != null) {
                        str3 = optString;
                    }
                    abstractC69088R9o = new C69086R9m(fragment, accountCallback, str, str2, str3);
                    break;
                case 1450:
                    abstractC69088R9o = new R71(fragment, accountCallback, extra);
                    break;
                case 2003:
                case 2004:
                    if (accountCallback.scene() == EnumC69116RAq.BIND_PHONE || accountCallback.scene() == EnumC69116RAq.MODIFY_PHONE) {
                        String string21 = application.getString(R.string.qvp);
                        o.LJIIIIZZ(string21, "applicationContext.getSt…ssword_phone_input_error)");
                        abstractC69088R9o = new C69057R8j(fragment, accountCallback, errorCode, string21);
                        break;
                    } else {
                        abstractC69088R9o = new C69057R8j(fragment, accountCallback, errorCode, message);
                        break;
                    }
                case 2013:
                    abstractC69088R9o = new RAX(fragment, accountCallback, extra);
                    break;
                case 2015:
                    abstractC69088R9o = new C69089R9p(fragment, scene, step, accountCallback);
                    break;
                case 2027:
                case 2028:
                    if (TextUtils.isEmpty(message)) {
                        message = application.getString(R.string.hxi);
                    }
                    o.LJIIIIZZ(message, "if (TextUtils.isEmpty(er…_page_lock) else errorMsg");
                    abstractC69088R9o = new C69057R8j(fragment, accountCallback, errorCode, message);
                    break;
                case 2037:
                    abstractC69088R9o = new C69087R9n(fragment, accountCallback);
                    break;
                case 2100:
                    abstractC69088R9o = new R73(fragment, accountCallback, errorCode, message);
                    break;
                case 15000:
                case 15001:
                    if (message.length() == 0) {
                        message = application.getString(R.string.g5w);
                        o.LJIIIIZZ(message, "applicationContext.getSt…g(R.string.error_unknown)");
                    }
                    abstractC69088R9o = new C69057R8j(fragment, accountCallback, errorCode, message);
                    break;
                default:
                    abstractC69088R9o = new C69057R8j(fragment, accountCallback, errorCode, message);
                    break;
            }
            abstractC69088R9o.LIZ();
            return true;
        }
        return true;
    }
}
