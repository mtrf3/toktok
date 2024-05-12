package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.account.login.twostep.AddVerificationResponse;
import com.ss.android.ugc.aweme.account.login.twostep.VerifyWay;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.XbI */
/* loaded from: classes16.dex */
public final class C85144XbI {
    public static final /* synthetic */ int LIZ = 0;

    public static C188727au LJFF() {
        C188727au c188727au = new C188727au();
        c188727au.LIZLLL(EF7.LJIIIZ, "aid");
        c188727au.LJIIIZ("user_id", R41.LIZLLL());
        c188727au.LJIIIZ("params_for_special", "uc_login");
        return c188727au;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0009. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:3:0x000c A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LJI(java.lang.String r1) {
        /*
            java.lang.String r0 = "way"
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)
            int r0 = r1.hashCode()
            switch(r0) {
                case -797498437: goto L3f;
                case 300626556: goto L33;
                case 312290780: goto L27;
                case 961294113: goto L1b;
                case 1972338561: goto Lf;
                default: goto Lc;
            }
        Lc:
            java.lang.String r0 = ""
        Le:
            return r0
        Lf:
            java.lang.String r0 = "totp_verify"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L18
            goto Lc
        L18:
            java.lang.String r0 = "totp"
            goto Le
        L1b:
            java.lang.String r0 = "oauth_verify"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L24
            goto Lc
        L24:
            java.lang.String r0 = "oauth"
            goto Le
        L27:
            java.lang.String r0 = "mobile_sms_verify"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L30
            goto Lc
        L30:
            java.lang.String r0 = "sms"
            goto Le
        L33:
            java.lang.String r0 = "email_verify"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L3c
            goto Lc
        L3c:
            java.lang.String r0 = "email"
            goto Le
        L3f:
            java.lang.String r0 = "pwd_verify"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L48
            goto Lc
        L48:
            java.lang.String r0 = "password"
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C85144XbI.LJI(java.lang.String):java.lang.String");
    }

    public static String LJII(List ways) {
        o.LJIIIZ(ways, "ways");
        Iterator it = ways.iterator();
        String str = "";
        while (it.hasNext()) {
            String str2 = (String) it.next();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(str);
            if (str.length() > 0) {
                str2 = QZZ.LIZIZ(',', str2);
            }
            LIZ2.append(str2);
            str = X1D.LIZIZ(LIZ2);
        }
        return str;
    }

    public static void LJIL(String enterFrom) {
        o.LJIIIZ(enterFrom, "enterFrom");
        C188727au LJFF = LJFF();
        LJFF.LJIIIZ("enter_from", enterFrom);
        LJFF.LJIIIZ("popup_type", "totp");
        LJFF.LJIIIZ("click_button", "update");
        FMX.LJIIL("twosv_setup_update_confirmation_click", LJFF.LIZ);
    }

    public static void LJJIJIL(String str) {
        C188727au LJFF = LJFF();
        LJFF.LJIIIZ("result", str);
        FMX.LJIIL("submit_2sv_mandatory_enrollment", LJFF.LIZ);
    }

    public static void LIZ(String enterFrom, boolean z) {
        String str;
        o.LJIIIZ(enterFrom, "enterFrom");
        C188727au LJFF = LJFF();
        LJFF.LJIIIZ("enter_from", enterFrom);
        if (z) {
            str = "success";
        } else {
            str = "fail";
        }
        LJFF.LJIIIZ("result", str);
        FMX.LJIIL("authorized_logins_result", LJFF.LIZ);
    }

    public static void LIZIZ(String methodType, String enterFrom) {
        o.LJIIIZ(methodType, "methodType");
        o.LJIIIZ(enterFrom, "enterFrom");
        C188727au LJFF = LJFF();
        LJFF.LJIIIZ("method_edited", LJI(methodType));
        LJFF.LJIIIZ("enter_from", enterFrom);
        FMX.LJIIL("twosv_setup_confirm_update", LJFF.LIZ);
    }

    public static void LIZLLL(String methodType, String enterFrom) {
        o.LJIIIZ(methodType, "methodType");
        o.LJIIIZ(enterFrom, "enterFrom");
        C188727au LJFF = LJFF();
        LJFF.LJIIIZ("method_edited", LJI(methodType));
        LJFF.LJIIIZ("enter_from", enterFrom);
        FMX.LJIIL("twosv_setup_popup_show", LJFF.LIZ);
    }

    public static void LJIILLIIL(String str, String flowType) {
        o.LJIIIZ(flowType, "flowType");
        C188727au LJFF = LJFF();
        LJFF.LJIIIZ("enter_from", str);
        LJFF.LJIIIZ("popup_type", "totp");
        LJFF.LJIIIZ("flow_type", flowType);
        FMX.LJIIL("twosv_totp_code_submit", LJFF.LIZ);
    }

    public static void LJIIZILJ(String str, String flowType) {
        o.LJIIIZ(flowType, "flowType");
        C188727au LJFF = LJFF();
        LJFF.LJIIIZ("enter_from", str);
        LJFF.LJIIIZ("popup_type", "totp");
        LJFF.LJIIIZ("flow_type", flowType);
        FMX.LJIIL("twosv_totp_key_copy", LJFF.LIZ);
    }

    public static void LJIJ(String str, String flowType) {
        o.LJIIIZ(flowType, "flowType");
        C188727au LJFF = LJFF();
        LJFF.LJIIIZ("enter_from", str);
        LJFF.LJIIIZ("popup_type", "totp");
        LJFF.LJIIIZ("flow_type", flowType);
        FMX.LJIIL("twosv_totp_update_success", LJFF.LIZ);
    }

    public static void LJJI(String str, String enterFrom) {
        o.LJIIIZ(enterFrom, "enterFrom");
        C188727au LJFF = LJFF();
        LJFF.LJIIIZ("click_button", str);
        LJFF.LJIIIZ("enter_from", enterFrom);
        FMX.LJIIL("two_step_verification_manage_click", LJFF.LIZ);
    }

    public static void LJJIIJ(int i, String enterFrom) {
        o.LJIIIZ(enterFrom, "enterFrom");
        C188727au LJFF = LJFF();
        LJFF.LJIIIZ("enter_from", enterFrom);
        LJFF.LIZLLL(i, "trusted_device_cnt");
        FMX.LJIIL("trusted_devices_page_show", LJFF.LIZ);
    }

    public static void LJJIIJZLJL(String methodType, String enterFrom) {
        o.LJIIIZ(methodType, "methodType");
        o.LJIIIZ(enterFrom, "enterFrom");
        C188727au LJFF = LJFF();
        LJFF.LJIIIZ("method_edited", LJI(methodType));
        LJFF.LJIIIZ("enter_from", enterFrom);
        FMX.LJIIL("twosv_setup_popup_click_remove", LJFF.LIZ);
    }

    public static void LJJIIZ(String methodType, String enterFrom) {
        o.LJIIIZ(methodType, "methodType");
        o.LJIIIZ(enterFrom, "enterFrom");
        C188727au LJFF = LJFF();
        LJFF.LJIIIZ("method_edited", LJI(methodType));
        LJFF.LJIIIZ("enter_from", enterFrom);
        FMX.LJIIL("twosv_setup_popup_click_update", LJFF.LIZ);
    }

    public static void LJJIJ(String methodType, String enterFrom) {
        o.LJIIIZ(methodType, "methodType");
        o.LJIIIZ(enterFrom, "enterFrom");
        C188727au LJFF = LJFF();
        LJFF.LJIIIZ("method_edited", LJI(methodType));
        LJFF.LJIIIZ("enter_from", enterFrom);
        FMX.LJIIL("twosv_remove_confirm", LJFF.LIZ);
    }

    public static void LJJIJL(String methodType, String enterFrom) {
        o.LJIIIZ(methodType, "methodType");
        o.LJIIIZ(enterFrom, "enterFrom");
        C188727au LJFF = LJFF();
        LJFF.LJIIIZ("method_edited", LJI(methodType));
        LJFF.LJIIIZ("enter_from", enterFrom);
        FMX.LJIIL("twosv_turnoff_confirm", LJFF.LIZ);
    }

    public static void LJJIJLIJ(String methodType, String enterFrom) {
        o.LJIIIZ(methodType, "methodType");
        o.LJIIIZ(enterFrom, "enterFrom");
        C188727au LJFF = LJFF();
        LJFF.LJIIIZ("method_edited", LJI(methodType));
        LJFF.LJIIIZ("enter_from", enterFrom);
        FMX.LJIIL("twosv_turnoff_popup", LJFF.LIZ);
    }

    public static void LIZJ(String str, String popup_type, String enterFrom) {
        o.LJIIIZ(popup_type, "popup_type");
        o.LJIIIZ(enterFrom, "enterFrom");
        C188727au LJFF = LJFF();
        LJFF.LJIIIZ("popup_type", popup_type);
        LJFF.LJIIIZ("click_button", str);
        LJFF.LJIIIZ("enter_from", enterFrom);
        FMX.LJIIL("twosv_setup_popup_click", LJFF.LIZ);
    }

    public static void LJIIJ(String str, String str2, String str3) {
        C188727au LJFF = LJFF();
        LJFF.LJIIIZ("page", "twosv_setup");
        LJFF.LJIIIZ("verification_method", str3);
        LJFF.LJIIIZ("enter_from", str);
        LJFF.LJIIIZ("enter_method", str2);
        FMX.LJIIL("identity_verification_show", LJFF.LIZ);
    }

    public static void LJIIJJI(String str, String str2, String str3) {
        C188727au LJFF = LJFF();
        LJFF.LJIIIZ("verification_method", str3);
        LJFF.LJIIIZ("enter_from", str);
        LJFF.LJIIIZ("enter_method", str2);
        FMX.LJIIL("identity_verification_typing", LJFF.LIZ);
    }

    public static void LJJ(String platForm, String str, boolean z) {
        String str2;
        o.LJIIIZ(platForm, "platForm");
        C188727au LJFF = LJFF();
        LJFF.LJIIIZ("platform", platForm);
        LJFF.LJIIIZ("verification_method", str);
        if (z) {
            str2 = "success";
        } else {
            str2 = "fail";
        }
        LJFF.LJIIIZ("status", str2);
        FMX.LJIIL("login_two_step_verification_result", LJFF.LIZ);
    }

    public static void LJJIII(String str, String str2, String str3) {
        C188727au LJFF = LJFF();
        LJFF.LJIIIZ("enter_from", str);
        LJFF.LJIIIZ("enter_method", str2);
        LJFF.LJIIIZ("recovery_method", str3);
        FMX.LJIIL("skip_optional_recovery", LJFF.LIZ);
    }

    public static void LJIIIIZZ(String str, String enterFrom, List ways, boolean z) {
        o.LJIIIZ(ways, "ways");
        o.LJIIIZ(enterFrom, "enterFrom");
        boolean contains = ways.contains("mobile_sms_verify");
        boolean contains2 = ways.contains("pwd_verify");
        boolean contains3 = ways.contains("email_verify");
        boolean contains4 = ways.contains("totp_verify");
        C188727au LJFF = LJFF();
        LJFF.LJIIIZ("page_type", str);
        LJFF.LJFF(Boolean.valueOf(contains), "is_sms_selected");
        LJFF.LJFF(Boolean.valueOf(contains3), "is_email_selected");
        LJFF.LJFF(Boolean.valueOf(contains2), "is_pw_selected");
        LJFF.LJFF(Boolean.valueOf(contains4), "is_totp_selected");
        LJFF.LJFF(Boolean.valueOf(z), "is_trusted");
        LJFF.LJIIIZ("enter_from", enterFrom);
        FMX.LJIIL("twosv_setup_method_add_submit", LJFF.LIZ);
    }

    public static void LJIIIZ(String enterFrom, String enterMethod, String str, boolean z) {
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(enterMethod, "enterMethod");
        C188727au LJFF = LJFF();
        LJFF.LIZLLL(z ? 1 : 0, "is_success");
        LJFF.LJIIIZ("verification_method", str);
        LJFF.LJIIIZ("enter_from", enterFrom);
        LJFF.LJIIIZ("enter_method", enterMethod);
        FMX.LJIIL("identity_verification_result", LJFF.LIZ);
    }

    public static void LJJIFFI(String str, String action, Integer num, Integer num2) {
        o.LJIIIZ(action, "action");
        C188727au LJFF = LJFF();
        LJFF.LJIIIZ("enter_from", str);
        LJFF.LJIIIZ("action", action);
        if (num != null) {
            LJFF.LIZLLL(num.intValue(), "is_success");
        }
        if (num2 != null) {
            LJFF.LIZLLL(num2.intValue(), "error_code");
        }
        FMX.LJIIL("adding_trusted_device_response", LJFF.LIZ);
    }

    public static void LJJII(int i, int i2, int i3, String enterFrom) {
        o.LJIIIZ(enterFrom, "enterFrom");
        C188727au LJFF = LJFF();
        LJFF.LJIIIZ("enter_from", enterFrom);
        LJFF.LIZLLL(i, "trusted_device_cnt");
        LJFF.LIZLLL(i2, "is_success");
        if (i2 == 0) {
            LJFF.LIZLLL(i3, "error_code");
        }
        FMX.LJIIL("click_add_trusted_device_response", LJFF.LIZ);
    }

    public static void LJJIJIIJIL(String str, String str2, String verifyMethod, String str3) {
        o.LJIIIZ(verifyMethod, "verifyMethod");
        C188727au LJFF = LJFF();
        LJFF.LJIIIZ("enter_from", str);
        LJFF.LJIIIZ("enter_method", str2);
        LJFF.LJIIIZ("verification_method", verifyMethod);
        LJFF.LJIIIZ("platform", str3);
        FMX.LJIIL("start_two_step_verification_typing", LJFF.LIZ);
    }

    public static void LJJIZ(String str, String str2, String platForm, String str3) {
        o.LJIIIZ(platForm, "platForm");
        C188727au LJFF = LJFF();
        LJFF.LJIIIZ("platform", platForm);
        LJFF.LJIIIZ("verification_method", str3);
        LJFF.LJIIIZ("enter_from", str);
        LJFF.LJIIIZ("enter_method", str2);
        FMX.LJIIL("login_two_step_verification_notify", LJFF.LIZ);
    }

    public static /* synthetic */ void LJIJJ(String str, String str2, String str3, String str4, boolean z) {
        LJIJI(str, str2, str3, str4, z, 1, null);
    }

    public static void LJIJJLI(String str, String str2, String platForm, String str3, boolean z) {
        o.LJIIIZ(platForm, "platForm");
        C188727au LJFF = LJFF();
        LJFF.LJIIIZ("enter_from", str);
        LJFF.LJIIIZ("enter_method", str2);
        LJFF.LJIIIZ("platform", platForm);
        LJFF.LJIIIZ("verification_method", str3);
        LJFF.LJIIIZ("verification_method", str3);
        LJFF.LJFF(Boolean.valueOf(z), "is_trusted_environment_added");
        FMX.LJIIL("login_two_step_verification_code_submit", LJFF.LIZ);
    }

    public static void LJIIL(int i, String ways, String enterFrom, String verifyMethod, String str, boolean z) {
        String str2;
        o.LJIIIZ(ways, "ways");
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(verifyMethod, "verifyMethod");
        boolean LJJJLZIJ = s.LJJJLZIJ(ways, "mobile_sms_verify", false);
        boolean LJJJLZIJ2 = s.LJJJLZIJ(ways, "pwd_verify", false);
        boolean LJJJLZIJ3 = s.LJJJLZIJ(ways, "email_verify", false);
        boolean LJJJLZIJ4 = s.LJJJLZIJ(ways, "totp_verify", false);
        C188727au LJFF = LJFF();
        LJFF.LJFF(Boolean.valueOf(LJJJLZIJ), "is_sms_selected");
        LJFF.LJFF(Boolean.valueOf(LJJJLZIJ3), "is_email_selected");
        LJFF.LJFF(Boolean.valueOf(LJJJLZIJ2), "is_pw_selected");
        LJFF.LJFF(Boolean.valueOf(LJJJLZIJ4), "is_totp_selected");
        LJFF.LJI("verify_method", verifyMethod);
        LJFF.LJI("enter_from", enterFrom);
        if (i == 1) {
            str2 = "new";
        } else {
            str2 = "backup";
        }
        LJFF.LJI("type", str2);
        LJFF.LJI("page_type", str);
        LJFF.LJFF(Boolean.valueOf(z), "is_trusted");
        FMX.LJIIL("twosv_setup_method_add_success", LJFF.LIZ);
    }

    public static void LJIILJJIL(AddVerificationResponse response, String enterFrom, boolean z, boolean z2, boolean z3, boolean z4) {
        String str;
        boolean z5;
        boolean z6;
        boolean z7;
        List<VerifyWay> two_step_verify_ways;
        o.LJIIIZ(response, "response");
        o.LJIIIZ(enterFrom, "enterFrom");
        AddVerificationResponse.Data data = response.getData();
        if (data != null) {
            str = data.getDefault_verify_way();
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            LJJIJIIJI("off", enterFrom, false, false, false, false, z, z2, z3, z4);
            return;
        }
        AddVerificationResponse.Data data2 = response.getData();
        boolean z8 = false;
        if (data2 != null && (two_step_verify_ways = data2.getTwo_step_verify_ways()) != null) {
            z7 = false;
            z6 = false;
            z5 = false;
            for (VerifyWay verifyWay : two_step_verify_ways) {
                boolean LJ = o.LJ(verifyWay.is_available(), Boolean.TRUE);
                String verify_way = verifyWay.getVerify_way();
                if (verify_way != null) {
                    switch (verify_way.hashCode()) {
                        case -797498437:
                            if (verify_way.equals("pwd_verify")) {
                                z5 = LJ;
                                break;
                            } else {
                                break;
                            }
                        case 300626556:
                            if (verify_way.equals("email_verify")) {
                                z8 = LJ;
                                break;
                            } else {
                                break;
                            }
                        case 312290780:
                            if (verify_way.equals("mobile_sms_verify")) {
                                z6 = LJ;
                                break;
                            } else {
                                break;
                            }
                        case 1972338561:
                            if (verify_way.equals("totp_verify")) {
                                z7 = LJ;
                                break;
                            } else {
                                break;
                            }
                    }
                }
            }
        } else {
            z5 = false;
            z6 = false;
            z8 = false;
            z7 = false;
        }
        LJJIJIIJI("on", enterFrom, z5, z6, z8, z7, z, z2, z3, z4);
    }

    public static void LJIILIIL(String str, String enterFrom, String verifyMethod, boolean z, boolean z2, boolean z3, boolean z4) {
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(verifyMethod, "verifyMethod");
        C188727au LJFF = LJFF();
        LJFF.LJFF(Boolean.valueOf(z), "is_sms_removed");
        LJFF.LJFF(Boolean.valueOf(z2), "is_email_removed");
        LJFF.LJFF(Boolean.valueOf(z3), "is_pw_removed");
        LJFF.LJFF(Boolean.valueOf(z4), "is_totp_removed");
        LJFF.LJIIIZ("type", str);
        LJFF.LJIIIZ("enter_from", enterFrom);
        LJFF.LJIIIZ("verify_method", verifyMethod);
        FMX.LJIIL("twosv_setup_method_remove_success", LJFF.LIZ);
    }

    public static void LJIJI(String str, String str2, String platForm, String str3, boolean z, int i, Integer num) {
        o.LJIIIZ(platForm, "platForm");
        C188727au LJFF = LJFF();
        LJFF.LJIIIZ("enter_from", str);
        LJFF.LJIIIZ("enter_method", str2);
        LJFF.LJIIIZ("platform", platForm);
        LJFF.LJIIIZ("verification_method", str3);
        LJFF.LJIIIZ("verification_method", str3);
        LJFF.LJFF(Boolean.valueOf(z), "is_trusted_environment_added");
        LJFF.LIZLLL(i, "is_success");
        LJFF.LJFF(num, "error_code");
        FMX.LJIIL("login_two_step_verification_code_result", LJFF.LIZ);
    }

    public static void LJJIL(String str, String str2, String platForm, boolean z, boolean z2, boolean z3, boolean z4) {
        o.LJIIIZ(platForm, "platForm");
        C188727au LJFF = LJFF();
        LJFF.LJIIIZ("enter_from", str);
        LJFF.LJIIIZ("enter_method", str2);
        LJFF.LJIIIZ("platform", platForm);
        LJFF.LJFF(Boolean.valueOf(z), "is_pw_show");
        LJFF.LJFF(Boolean.valueOf(z2), "is_sms_show");
        LJFF.LJFF(Boolean.valueOf(z3), "is_email_show");
        LJFF.LJFF(Boolean.valueOf(z4), "is_totp_show");
        FMX.LJIIL("two_step_verification_list_show", LJFF.LIZ);
    }

    public static void LJJIIZI(String enterFrom, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        o.LJIIIZ(enterFrom, "enterFrom");
        C188727au LJFF = LJFF();
        LJFF.LJIIIZ("enter_from", enterFrom);
        LJFF.LIZLLL(i, "is_hva");
        LJFF.LIZLLL(i2, "is_ttba");
        LJFF.LIZLLL(i3, "is_ttlive");
        LJFF.LIZLLL(i4, "is_ttshop");
        LJFF.LIZLLL(i5, "is_managed_account");
        LJFF.LIZLLL(0, "is_creators_30k_fans");
        LJFF.LIZLLL(0, "is_hpa");
        LJFF.LIZLLL(i6, "is_gen_pop_wallet");
        LJFF.LIZLLL(i7, "popup_freq");
        FMX.LJIIL("profile_twosv_popup_show", LJFF.LIZ);
    }

    public static void LJ(int i, int i2, int i3, int i4, int i5, int i6, int i7, String enterFrom, String str) {
        o.LJIIIZ(enterFrom, "enterFrom");
        C188727au LJFF = LJFF();
        LJFF.LJIIIZ("enter_from", enterFrom);
        LJFF.LJIIIZ("action", str);
        LJFF.LIZLLL(i, "is_hva");
        LJFF.LIZLLL(i2, "is_ttba");
        LJFF.LIZLLL(i3, "is_ttlive");
        LJFF.LIZLLL(i4, "is_ttshop");
        LJFF.LIZLLL(i5, "is_managed_account");
        LJFF.LIZLLL(0, "is_creators_30k_fans");
        LJFF.LIZLLL(0, "is_hpa");
        LJFF.LIZLLL(i6, "is_gen_pop_wallet");
        LJFF.LIZLLL(i7, "popup_freq");
        FMX.LJIIL("exit_profile_twosv_popup", LJFF.LIZ);
    }

    public static void LJJIJIIJI(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        C188727au LJFF = LJFF();
        LJFF.LJIIIZ("enter_from", str2);
        LJFF.LJIIIZ("page_type", str);
        LJFF.LJFF(Boolean.valueOf(z), "is_pw_turned_on");
        LJFF.LJFF(Boolean.valueOf(z2), "is_sms_turned_on");
        LJFF.LJFF(Boolean.valueOf(z3), "is_email_turned_on");
        LJFF.LJFF(Boolean.valueOf(z4), "is_totp_turned_on");
        LJFF.LJFF(Boolean.valueOf(z5), "is_pw_selected");
        LJFF.LJFF(Boolean.valueOf(z6), "is_sms_selected");
        LJFF.LJFF(Boolean.valueOf(z7), "is_email_selected");
        LJFF.LJFF(Boolean.valueOf(z8), "is_totp_selected");
        FMX.LJIIL("twosv_setup_show", LJFF.LIZ);
    }
}
