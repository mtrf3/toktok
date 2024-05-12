package com.ss.android.ugc.aweme.services.interceptor;

import X.C10K;
import X.C16880lQ;
import X.C221108m2;
import X.C237429Tm;
import X.C5H3;
import X.EnumC69113RAn;
import X.InterfaceC64592gB;
import X.RCC;
import X.RCD;
import X.RCE;
import X.RCF;
import X.X1D;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthActivity;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerifyPushFor2067Activity;
import com.ss.android.ugc.aweme.account.login.twostep.TwpStep2046Bean;
import com.ss.android.ugc.aweme.account.login.twostep.TwpStep2067Bean;
import com.ss.android.ugc.aweme.account.login.v2.network.Request2svPushChallengeResponse;
import defpackage.i0;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS161S0100000_11;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import ujb.s;
import v5.n;

/* loaded from: classes12.dex */
public final class TwoStepAuthenticationInterceptor implements IInterceptor {
    public Integer currentErrorCode;
    public String currentUrlPath;
    public final C5H3 isCarrierLogin$delegate = C221108m2.LIZIZ(new AqS161S0100000_11(this, 59));

    /* loaded from: classes12.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC69113RAn.values().length];
            try {
                iArr[EnumC69113RAn.TWO_STEP_EMAIL_PASSWORD_VERIFY_SMS_2SV.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC69113RAn.TWO_STEP_EMAIL_PASSWORD_VERIFY_EMAIL_CODE_2SV.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC69113RAn.TWO_STEP_PHONE_VERIFY_EMAIL_CODE_2SV.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC69113RAn.TWO_STEP_PHONE_VERIFY_PASSWORD_2SV.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC69113RAn.PUSH_VERIFY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final boolean isCarrierLogin() {
        return ((Boolean) this.isCarrierLogin$delegate.getValue()).booleanValue();
    }

    private final String getPathFromUrl(String str) {
        try {
            return new URI(str).getPath();
        } catch (NullPointerException | URISyntaxException unused) {
            return null;
        }
    }

    public final void register(final n<RCD> tcs) {
        o.LJIIIZ(tcs, "tcs");
        RCE LIZ = RCE.LIZ();
        RCF rcf = new RCF() { // from class: com.ss.android.ugc.aweme.services.interceptor.TwoStepAuthenticationInterceptor$register$1
            @Override // X.RCF
            public void onComplete(RCD rcd) {
                tcs.LIZJ(rcd);
            }
        };
        LIZ.getClass();
        synchronized (RCE.LIZJ) {
            LIZ.LIZ = rcf;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:24:0x003a. Please report as an issue. */
    private final Integer getAuthType(Integer num, String str) {
        String optString;
        if (num != null && num.intValue() == 2020) {
            return 2;
        }
        if (num == null || num.intValue() != 2032) {
            if (num == null || num.intValue() != 2033) {
                if (num != null) {
                    if (num.intValue() == 2025) {
                        return 3;
                    }
                    if (num.intValue() == 2031) {
                        return 5;
                    }
                    if (num.intValue() == 2067) {
                        return 6;
                    }
                }
                if (num != null && num.intValue() == 2046) {
                    if (str == null) {
                        str = "";
                    }
                    JSONObject optJSONObject = new JSONObject(str).optJSONObject("data");
                    if (optJSONObject != null && (optString = optJSONObject.optString("default_verify_way")) != null) {
                        switch (optString.hashCode()) {
                            case -797498437:
                                if (optString.equals("pwd_verify")) {
                                    return 2;
                                }
                                break;
                            case 300626556:
                                if (optString.equals("email_verify")) {
                                    return 4;
                                }
                                break;
                            case 312290780:
                                if (optString.equals("mobile_sms_verify")) {
                                    return 1;
                                }
                                break;
                            case 961294113:
                                if (optString.equals("oauth_verify")) {
                                    return 3;
                                }
                                break;
                            case 1972338561:
                                if (optString.equals("totp_verify")) {
                                    return 7;
                                }
                                break;
                        }
                    }
                }
                return null;
            }
            return 4;
        }
        return 1;
    }

    public final String getPlatForm(String str, Map<String, String> map, EnumC69113RAn enumC69113RAn) {
        if (TextUtils.isEmpty(str)) {
            return "unknown";
        }
        o.LJI(str);
        if (s.LJJJLZIJ(str, "/password/reset_by_ticket", false) || s.LJJJLZIJ(str, "/password/reset_by_email_ticket", false)) {
            return "forgot_password";
        }
        if (s.LJJJLZIJ(str, "/password/forced_reset_by_mobile_ticket", false)) {
            return "force_password_reset";
        }
        if (s.LJJJLZIJ(str, "/passport/auth/login_only", false)) {
            o.LJI(map);
            String str2 = map.get("platform");
            if (str2 == null) {
                return "";
            }
            return str2;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[enumC69113RAn.ordinal()];
        if (i != 1 && i != 2) {
            if (i == 3 || i == 4) {
                return "sms_verification";
            }
            if (i != 5) {
                return str;
            }
            if (s.LJJJLZIJ(str, "sms", false)) {
                return "sms_verification";
            }
            if (s.LJJJLZIJ(str, "user/login", false)) {
                if (map == null || map.isEmpty()) {
                    return "unknown";
                }
                if (map.containsKey("email")) {
                    return "email";
                }
                if (!map.containsKey("username")) {
                    return "unknown";
                }
                return "username";
            }
            return str;
        }
        if (map == null || map.isEmpty()) {
            return "email";
        }
        if (map.containsKey("mobile")) {
            return "phone";
        }
        if (map.containsKey("email")) {
            return "email";
        }
        if (map.containsKey("username")) {
            return "handle";
        }
        if (!map.containsKey("not_login_ticket")) {
            return "unknown";
        }
        return "ticket";
    }

    private final C10K<RCD> startTwoStepAuthentication(Context context, String str, String str2, Map<String, String> map) {
        n<RCD> nVar = new n<>();
        if (context == null || str2 == null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Activity or response is null, activity: ");
            LIZ.append(context);
            LIZ.append(", response: ");
            LIZ.append(str2);
            nVar.LIZIZ(new Exception(X1D.LIZIZ(LIZ)));
            return nVar.LIZ;
        }
        Integer authType = getAuthType(this.currentErrorCode, str2);
        if (authType == null) {
            nVar.LIZIZ(new Exception(i0.LJFF("Failed to parse error code from JSON response: ", str2)));
            return nVar.LIZ;
        }
        this.currentUrlPath = getPathFromUrl(str);
        Integer num = this.currentErrorCode;
        if (num == null || num.intValue() != 2046) {
            Integer num2 = this.currentErrorCode;
            if (num2 == null || num2.intValue() != 2067) {
                register(nVar);
                Intent intent = new Intent(context, (Class<?>) TwoStepAuthActivity.class);
                intent.putExtra("auth_type", authType.intValue());
                intent.putExtra("auth_data", str2);
                intent.putExtra("url_path", this.currentUrlPath);
                if (!(context instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                C16880lQ.LIZJ(context, intent);
                return nVar.LIZ;
            }
            return authFor2067(context, nVar, str2, map);
        }
        return authFor2046(context, nVar, str2, map, authType);
    }

    public final C10K<RCD> authFor2067(final Context context, n<RCD> tcs, String str, final Map<String, String> map) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(tcs, "tcs");
        if (!(context instanceof Activity)) {
            tcs.LIZIZ(new Exception("context is not Activity"));
            return tcs.LIZ;
        }
        register(tcs);
        final TwpStep2067Bean twpStep2067Bean = (TwpStep2067Bean) C237429Tm.LIZ(new JSONObject(str).optString("data"), TwpStep2067Bean.class);
        RCC.LIZ(twpStep2067Bean.getVerify_ticket(), "").LJIIJ(new InterfaceC64592gB() { // from class: com.ss.android.ugc.aweme.services.interceptor.TwoStepAuthenticationInterceptor$authFor2067$1
            @Override // X.InterfaceC64592gB
            public final void accept(Request2svPushChallengeResponse request2svPushChallengeResponse) {
                if (o.LJ("ok", request2svPushChallengeResponse.result)) {
                    Intent intent = new Intent(context, (Class<?>) TwoStepVerifyPushFor2067Activity.class);
                    intent.putExtra("ticket", twpStep2067Bean.getVerify_ticket());
                    intent.putExtra("wait_ticket", request2svPushChallengeResponse.wait_ticket);
                    intent.putExtra("sms_code_key", twpStep2067Bean.getSms_code_key());
                    intent.putExtra("profile_key", twpStep2067Bean.getProfile_key());
                    TwoStepAuthenticationInterceptor twoStepAuthenticationInterceptor = this;
                    intent.putExtra("platform", twoStepAuthenticationInterceptor.getPlatForm(twoStepAuthenticationInterceptor.currentUrlPath, map, EnumC69113RAn.PUSH_VERIFY));
                    if (C16880lQ.LLJJIJI(((Activity) context).getIntent()) != null) {
                        Bundle LLJJIJI = C16880lQ.LLJJIJI(((Activity) context).getIntent());
                        o.LJI(LLJJIJI);
                        intent.putExtras(LLJJIJI);
                    }
                    ArrayList arrayList = new ArrayList();
                    List<String> list = request2svPushChallengeResponse.active_device_names;
                    if (list != null) {
                        arrayList.addAll(list);
                    }
                    intent.putExtra("device_list", arrayList);
                    if (!(context instanceof Activity)) {
                        intent.addFlags(268435456);
                    }
                    C16880lQ.LIZJ(context, intent);
                    return;
                }
                RCE LIZ = RCE.LIZ();
                String str2 = request2svPushChallengeResponse.reason;
                if (str2 == null) {
                    str2 = "server error";
                }
                LIZ.LIZIZ(new RCD(null, null, 0, str2, twpStep2067Bean.getSms_code_key()));
            }
        }, new InterfaceC64592gB() { // from class: com.ss.android.ugc.aweme.services.interceptor.TwoStepAuthenticationInterceptor$authFor2067$2
            @Override // X.InterfaceC64592gB
            public final void accept(Throwable th) {
                RCE LIZ = RCE.LIZ();
                String message = th.getMessage();
                if (message == null) {
                    message = "server error";
                }
                LIZ.LIZIZ(new RCD(null, null, 0, message, TwpStep2067Bean.this.getSms_code_key()));
            }
        });
        return tcs.LIZ;
    }

    private final C10K<RCD> authFor2046(final Context context, n<RCD> nVar, final String str, final Map<String, String> map, final Integer num) {
        boolean z;
        String optString;
        if (!(context instanceof Activity)) {
            nVar.LIZIZ(new Exception("context is not Activity"));
            return nVar.LIZ;
        }
        register(nVar);
        final TwpStep2046Bean twpStep2046Bean = (TwpStep2046Bean) C237429Tm.LIZ(new JSONObject(str).optString("data"), TwpStep2046Bean.class);
        TwoStepAuthApi twoStepAuthApi = TwoStepAuthApi.LIZ;
        String verify_ticket = twpStep2046Bean.getVerify_ticket();
        twoStepAuthApi.getClass();
        TwoStepAuthApi.LIZJ = verify_ticket;
        JSONObject optJSONObject = new JSONObject(str).optJSONObject("data");
        if (optJSONObject == null || (optString = optJSONObject.optString("profile_key")) == null || ujb.o.LJJJJJL(optString)) {
            z = true;
        } else {
            z = false;
        }
        final boolean z2 = !z;
        ((Activity) context).runOnUiThread(new Runnable() { // from class: com.ss.android.ugc.aweme.services.interceptor.TwoStepAuthenticationInterceptor$authFor2046$1
            @Override // java.lang.Runnable
            public final void run() {
                com_ss_android_ugc_aweme_services_interceptor_TwoStepAuthenticationInterceptor$authFor2046$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
            /* JADX WARN: Removed duplicated region for block: B:18:0x005b  */
            /* JADX WARN: Removed duplicated region for block: B:24:0x0090  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void com_ss_android_ugc_aweme_services_interceptor_TwoStepAuthenticationInterceptor$authFor2046$1__run$___twin___() {
                /*
                    r14 = this;
                    java.util.Map<java.lang.String, java.lang.String> r1 = r1
                    if (r1 == 0) goto Lcb
                    java.lang.String r0 = "mobile"
                    java.lang.Object r1 = r1.get(r0)
                    java.lang.String r1 = (java.lang.String) r1
                Lc:
                    r0 = 0
                    java.lang.Boolean[] r0 = new java.lang.Boolean[r0]
                    java.lang.String r4 = X.C38354F3m.LIZ(r1, r0)
                    com.ss.android.ugc.aweme.services.interceptor.TwoStepAuthenticationInterceptor r0 = r2
                    boolean r0 = r0.isCarrierLogin()
                    r2 = 1
                    if (r0 == 0) goto L26
                    if (r4 == 0) goto L24
                    int r0 = r4.length()
                    if (r0 != 0) goto L26
                L24:
                    java.lang.String r4 = X.C82727WdP.LIZLLL
                L26:
                    java.lang.Integer r3 = r3
                    if (r3 != 0) goto L92
                L2a:
                    X.RAn r8 = X.EnumC69113RAn.TWO_STEP_PHONE_VERIFY_PASSWORD_2SV
                L2c:
                    android.content.Context r7 = r5
                    android.app.Activity r7 = (android.app.Activity) r7
                    X.RAq r9 = X.EnumC69116RAq.TWO_STEP_VERIFICATION
                    android.content.Intent r0 = r7.getIntent()
                    android.os.Bundle r10 = X.C16880lQ.LLJJIJI(r0)
                    if (r10 != 0) goto L42
                    android.os.Bundle r10 = new android.os.Bundle
                    r10.<init>()
                L42:
                    com.ss.android.ugc.aweme.account.login.twostep.TwpStep2046Bean r6 = r6
                    com.ss.android.ugc.aweme.services.interceptor.TwoStepAuthenticationInterceptor r5 = r2
                    java.util.Map<java.lang.String, java.lang.String> r4 = r1
                    java.util.ArrayList r1 = r6.getVerify_ways()
                    java.lang.String r0 = "verify_ways"
                    r10.putSerializable(r0, r1)
                    java.lang.String r3 = r6.getVerify_ticket()
                    java.lang.String r1 = ""
                    if (r3 != 0) goto L5c
                    r3 = r1
                L5c:
                    java.lang.String r0 = "verify_ticket"
                    r10.putString(r0, r3)
                    java.lang.String r0 = r6.getNot_login_ticket()
                    if (r0 != 0) goto L90
                L68:
                    java.lang.String r0 = "not_login_ticket"
                    r10.putString(r0, r1)
                    java.lang.String r0 = "login_with_2sv"
                    r10.putBoolean(r0, r2)
                    java.lang.String r0 = r5.currentUrlPath
                    java.lang.String r1 = r5.getPlatForm(r0, r4, r8)
                    java.lang.String r0 = "platform"
                    r10.putString(r0, r1)
                    java.lang.String r0 = "use_last_ttp_context"
                    r10.putBoolean(r0, r2)
                    com.ss.android.ugc.aweme.services.interceptor.TwoStepAuthenticationInterceptor$authFor2046$1$2 r11 = new com.ss.android.ugc.aweme.services.interceptor.TwoStepAuthenticationInterceptor$authFor2046$1$2
                    java.lang.String r0 = r7
                    r11.<init>()
                    r12 = 0
                    java.lang.Boolean r13 = java.lang.Boolean.FALSE
                    com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity.Companion.LIZIZ(r7, r8, r9, r10, r11, r12, r13)
                    return
                L90:
                    r1 = r0
                    goto L68
                L92:
                    int r0 = r3.intValue()
                    if (r0 != r2) goto L9b
                    X.RAn r8 = X.EnumC69113RAn.TWO_STEP_EMAIL_PASSWORD_VERIFY_SMS_2SV
                    goto L2c
                L9b:
                    int r1 = r3.intValue()
                    r0 = 4
                    if (r1 != r0) goto Lb5
                    if (r4 == 0) goto Laa
                    boolean r0 = ujb.o.LJJJJJL(r4)
                    if (r0 == 0) goto Lad
                Laa:
                    X.RAn r8 = X.EnumC69113RAn.TWO_STEP_EMAIL_PASSWORD_VERIFY_EMAIL_CODE_2SV
                    goto L2c
                Lad:
                    boolean r0 = r4
                    if (r0 != 0) goto Laa
                    X.RAn r8 = X.EnumC69113RAn.TWO_STEP_PHONE_VERIFY_EMAIL_CODE_2SV
                    goto L2c
                Lb5:
                    int r1 = r3.intValue()
                    r0 = 2
                    if (r1 != r0) goto Lc0
                    X.RAn r8 = X.EnumC69113RAn.TWO_STEP_PHONE_VERIFY_PASSWORD_2SV
                    goto L2c
                Lc0:
                    int r1 = r3.intValue()
                    r0 = 7
                    if (r1 != r0) goto L2a
                    X.RAn r8 = X.EnumC69113RAn.VERIFY_TOTP
                    goto L2c
                Lcb:
                    r1 = 0
                    goto Lc
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.services.interceptor.TwoStepAuthenticationInterceptor$authFor2046$1.com_ss_android_ugc_aweme_services_interceptor_TwoStepAuthenticationInterceptor$authFor2046$1__run$___twin___():void");
            }

            public static void com_ss_android_ugc_aweme_services_interceptor_TwoStepAuthenticationInterceptor$authFor2046$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(TwoStepAuthenticationInterceptor$authFor2046$1 twoStepAuthenticationInterceptor$authFor2046$1) {
                boolean LIZ;
                try {
                    twoStepAuthenticationInterceptor$authFor2046$1.com_ss_android_ugc_aweme_services_interceptor_TwoStepAuthenticationInterceptor$authFor2046$1__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
        return nVar.LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00dc, code lost:
    
        if (r4 == null) goto L38;
     */
    @Override // com.ss.android.ugc.aweme.services.interceptor.IInterceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.Map<java.lang.String, java.lang.String> tryToIntercept(java.lang.String r9, com.bytedance.retrofit2.client.Request r10, java.lang.String r11, int r12, java.util.Map<java.lang.String, java.lang.String> r13) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.services.interceptor.TwoStepAuthenticationInterceptor.tryToIntercept(java.lang.String, com.bytedance.retrofit2.client.Request, java.lang.String, int, java.util.Map):java.util.Map");
    }
}
