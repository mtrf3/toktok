package com.ss.android.ugc.aweme.services.interceptor;

import X.AbstractC40941G4z;
import X.C10K;
import X.C16880lQ;
import X.C1HQ;
import X.C221108m2;
import X.C35936E8m;
import X.C5H3;
import X.C62962OnO;
import X.C69093R9t;
import X.C78685UuP;
import X.C84763XOl;
import X.EF7;
import X.EnumC69113RAn;
import X.FHD;
import X.FMX;
import X.X1D;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.pns.agegate.data.PNSErrorModel;
import com.ss.android.ugc.aweme.services.IRegistrationAgeGateService;
import com.ss.android.ugc.aweme.services.interceptor.callback.AgeGateCallback;
import com.ss.android.ugc.aweme.services.interceptor.callback.AgeGateCallbackManager;
import com.ss.android.ugc.aweme.services.interceptor.callback.AgeGateResult;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import v5.n;
import yq4.a;

/* loaded from: classes12.dex */
public final class AgeGateInterceptor implements IInterceptor {
    public static final Companion Companion = new Companion();
    public Bundle currentActivityData;
    public Integer currentErrorCode;
    public String currentUrlPath;
    public final SimpleDateFormat requestDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.ROOT);
    public final C5H3 ageGateService$delegate = C221108m2.LIZIZ(AgeGateInterceptor$ageGateService$2.INSTANCE);

    private final AbstractC40941G4z callbackForSDK() {
        return new AbstractC40941G4z() { // from class: com.ss.android.ugc.aweme.services.interceptor.AgeGateInterceptor$callbackForSDK$1
            @Override // X.AbstractC40941G4z
            public boolean onCancel() {
                AgeGateInterceptor.this.mobAgeGateCallbackResult(AgeGateResult.CANCEL);
                AgeGateInterceptor.this.getAgeGateService().dismiss();
                AgeGateCallbackManager companion = AgeGateCallbackManager.Companion.getInstance();
                if (companion != null) {
                    companion.notifyResult(null);
                    return true;
                }
                return true;
            }

            @Override // X.AbstractC40941G4z
            public boolean onDeviceBlocked() {
                AgeGateInterceptor.this.mobAgeGateCallbackResult(AgeGateResult.DEVICE_BLOCK);
                AgeGateInterceptor.this.getAgeGateService().dismiss();
                AgeGateCallbackManager companion = AgeGateCallbackManager.Companion.getInstance();
                if (companion != null) {
                    companion.notifyResult(null);
                    return true;
                }
                return true;
            }

            @Override // X.AbstractC40941G4z
            public boolean onError(PNSErrorModel error) {
                o.LJIIIZ(error, "error");
                AgeGateInterceptor.this.mobAgeGateCallbackResult(AgeGateResult.ERROR);
                AgeGateInterceptor.this.getAgeGateService().dismiss();
                AgeGateCallbackManager companion = AgeGateCallbackManager.Companion.getInstance();
                if (companion != null) {
                    companion.notifyResult(null);
                    return false;
                }
                return false;
            }

            @Override // X.AbstractC40941G4z
            public boolean onSuccess(C62962OnO result) {
                String str;
                o.LJIIIZ(result, "result");
                AgeGateInterceptor.this.mobAgeGateCallbackResult(AgeGateResult.SUCCESS);
                Date date = result.LIZIZ;
                if (date != null) {
                    str = AgeGateInterceptor.this.requestDateFormat.format(date);
                } else {
                    str = null;
                }
                AgeGateCallbackManager companion = AgeGateCallbackManager.Companion.getInstance();
                if (companion != null) {
                    companion.notifyResult(str);
                    return true;
                }
                return true;
            }

            @Override // X.AbstractC40941G4z
            public boolean onUnderage(C62962OnO result) {
                o.LJIIIZ(result, "result");
                AgeGateInterceptor.this.getAgeGateService().dismiss();
                AgeGateInterceptor.this.handleUnderage();
                return true;
            }
        };
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (r4 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void launchSignupAgeGate() {
        /*
            r13 = this;
            android.os.Bundle r2 = r13.currentActivityData
            if (r2 == 0) goto L15
            X.RAg r1 = X.EnumC69113RAn.Companion
            java.lang.String r0 = "next_page"
            int r0 = r2.getInt(r0)
            r1.getClass()
            X.RAn r4 = X.C69106RAg.LIZ(r0)
            if (r4 != 0) goto L17
        L15:
            X.RAn r4 = X.EnumC69113RAn.NONE
        L17:
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            android.os.Bundle r0 = r13.currentActivityData
            java.lang.String r1 = "enter_method"
            java.lang.String r2 = ""
            if (r0 == 0) goto L2a
            java.lang.String r0 = r0.getString(r1)
            if (r0 != 0) goto L2b
        L2a:
            r0 = r2
        L2b:
            r5.put(r1, r0)
            android.os.Bundle r0 = r13.currentActivityData
            java.lang.String r1 = "enter_from"
            if (r0 == 0) goto L3a
            java.lang.String r0 = r0.getString(r1)
            if (r0 != 0) goto L3b
        L3a:
            r0 = r2
        L3b:
            r5.put(r1, r0)
            android.os.Bundle r0 = r13.currentActivityData
            java.lang.String r1 = "login_panel_type"
            if (r0 == 0) goto L4a
            java.lang.String r0 = r0.getString(r1)
            if (r0 != 0) goto L4b
        L4a:
            r0 = r2
        L4b:
            r5.put(r1, r0)
            X.RAn r0 = X.EnumC69113RAn.THIRD_PARTY_AGE_GATE
            java.lang.String r3 = "platform"
            if (r4 != r0) goto La4
            android.os.Bundle r0 = r13.currentActivityData
            if (r0 == 0) goto L5e
            java.lang.String r0 = r0.getString(r3)
            if (r0 != 0) goto La2
        L5e:
            r5.put(r3, r2)
            java.lang.String r1 = "user_type"
            java.lang.String r0 = "new"
            r5.put(r1, r0)
            int r0 = X.EOO.LIZIZ()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "is_in_personalized_nuj"
            r5.put(r0, r1)
            com.ss.android.ugc.aweme.services.IRegistrationAgeGateService r3 = com.ss.android.ugc.aweme.account.agegate.RegistrationAgeGateServiceImpl.LIZ()
            java.lang.String r1 = "registration_flow"
            java.lang.String r0 = "ageGateInterceptor"
            r5.put(r1, r0)
            android.app.Application r0 = X.C58725N2z.LIZ
            android.content.Context r4 = X.C16880lQ.LLLLJI(r0)
            com.ss.android.ugc.aweme.services.AgeGateSdkRegistrationFlow r7 = com.ss.android.ugc.aweme.services.AgeGateSdkRegistrationFlow.SIGN_UP
            android.os.Bundle r6 = r13.currentActivityData
            X.G4z r8 = r13.callbackForSDK()
            java.lang.String r0 = "ageGateService"
            kotlin.jvm.internal.o.LJIIIIZZ(r3, r0)
            java.lang.String r0 = "applicationContext"
            kotlin.jvm.internal.o.LJIIIIZZ(r4, r0)
            r9 = 0
            r10 = 0
            r11 = 64
            r12 = r10
            com.ss.android.ugc.aweme.services.IRegistrationAgeGateService.DefaultImpls.verifyAgeForRegistrationSDK$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        La2:
            r2 = r0
            goto L5e
        La4:
            X.RAn r0 = X.EnumC69113RAn.AGE_GATE_LOGIN
            if (r4 != r0) goto Lab
            java.lang.String r2 = "sms_verification"
            goto L5e
        Lab:
            android.os.Bundle r1 = r13.currentActivityData
            r2 = 1
            if (r1 == 0) goto Lbb
            java.lang.String r0 = "phone_signup"
            boolean r0 = r1.getBoolean(r0)
            if (r0 != r2) goto Lbb
            java.lang.String r2 = "phone_sign_up"
            goto L5e
        Lbb:
            android.os.Bundle r1 = r13.currentActivityData
            if (r1 == 0) goto Lca
            java.lang.String r0 = "email_signup"
            boolean r0 = r1.getBoolean(r0)
            if (r0 != r2) goto Lca
            java.lang.String r2 = "email"
            goto L5e
        Lca:
            java.lang.String r2 = "phone_or_email"
            goto L5e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.services.interceptor.AgeGateInterceptor.launchSignupAgeGate():void");
    }

    private final void mobApiInterceptedMissingBirthday() {
        String str;
        C35936E8m c35936E8m = new C35936E8m();
        Bundle bundle = this.currentActivityData;
        if (bundle == null || (str = bundle.getString("platform")) == null) {
            str = "";
        }
        c35936E8m.LIZLLL("platform", str);
        c35936E8m.LIZ(C78685UuP.LJJJZ(a.LIZIZ().LJ()) ? 1 : 0, "if_exist");
        FMX.LJIIL("api_intercepted_missing_birthday", c35936E8m.LIZ);
    }

    private final void mobInterceptedBirthdayStillMissing() {
        String str;
        C35936E8m c35936E8m = new C35936E8m();
        Bundle bundle = this.currentActivityData;
        if (bundle == null || (str = bundle.getString("platform")) == null) {
            str = "";
        }
        c35936E8m.LIZLLL("platform", str);
        FMX.LJIIL("intercepted_birthday_still_missing", c35936E8m.LIZ);
    }

    public final IRegistrationAgeGateService getAgeGateService() {
        return (IRegistrationAgeGateService) this.ageGateService$delegate.getValue();
    }

    public final void handleUnderage() {
        boolean z;
        mobAgeGateCallbackResult(AgeGateResult.UNDERAGE);
        Bundle bundle = new Bundle();
        bundle.putInt("next_page", EnumC69113RAn.FTC_CREATE_ACCOUNT.getValue());
        Bundle bundle2 = this.currentActivityData;
        if (bundle2 != null) {
            z = bundle2.getBoolean("child_account_not_expected_upon_signup_success");
        } else {
            z = false;
        }
        bundle.putBoolean("child_account_not_expected_upon_signup_success", z);
        SmartRoute buildRoute = SmartRouter.buildRoute(C84763XOl.LJIIIIZZ(), "//account/ftc");
        buildRoute.withParam(bundle);
        buildRoute.open();
    }

    /* loaded from: classes12.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    private final String getPathFromUrl(String str) {
        try {
            return new URI(str).getPath();
        } catch (NullPointerException | URISyntaxException unused) {
            return null;
        }
    }

    public final void mobAgeGateCallbackResult(AgeGateResult ageGateResult) {
        String str;
        C35936E8m c35936E8m = new C35936E8m();
        Bundle bundle = this.currentActivityData;
        if (bundle == null || (str = bundle.getString("platform")) == null) {
            str = "";
        }
        c35936E8m.LIZLLL("platform", str);
        c35936E8m.LIZ(ageGateResult.getValue(), "age_gate_result");
        FMX.LJIIL("age_gate_call_back_result", c35936E8m.LIZ);
    }

    public final void register(final n<String> tcs) {
        o.LJIIIZ(tcs, "tcs");
        AgeGateCallbackManager companion = AgeGateCallbackManager.Companion.getInstance();
        if (companion != null) {
            companion.register(new AgeGateCallback() { // from class: com.ss.android.ugc.aweme.services.interceptor.AgeGateInterceptor$register$1
                @Override // com.ss.android.ugc.aweme.services.interceptor.callback.AgeGateCallback
                public void onComplete(String str) {
                    tcs.LIZJ(str);
                }
            });
        }
    }

    private final C10K<String> startAgeGate(Context context, String str, String str2) {
        n<String> nVar = new n<>();
        if (context == null || str2 == null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Activity or response is null, activity: ");
            LIZ.append(context);
            LIZ.append(", response: ");
            LIZ.append(str2);
            nVar.LIZIZ(new Exception(X1D.LIZIZ(LIZ)));
            return nVar.LIZ;
        }
        this.currentUrlPath = getPathFromUrl(str);
        register(nVar);
        launchSignupAgeGate();
        return nVar.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.services.interceptor.IInterceptor
    public Map<String, String> tryToIntercept(String str, Request request, String str2, int i, Map<String, String> map) {
        Bundle bundle;
        Intent intent;
        C1HQ c1hq = new C1HQ();
        Context LJIIIIZZ = C84763XOl.LJIIIIZZ();
        if (LJIIIIZZ == null) {
            LJIIIIZZ = EF7.LIZIZ();
        }
        this.currentErrorCode = Integer.valueOf(i);
        Activity LJIIIIZZ2 = C84763XOl.LJIIIIZZ();
        if (LJIIIIZZ2 == null || (intent = LJIIIIZZ2.getIntent()) == null || (bundle = C16880lQ.LLJJIJI(intent)) == null) {
            bundle = new Bundle();
        }
        this.currentActivityData = bundle;
        mobApiInterceptedMissingBirthday();
        FHD.LIZLLL().getClass();
        if (!FHD.LIZ(0, "age_gate_interceptor_debug_setting", false, true) && C78685UuP.LJJJZ(a.LIZIZ().LJ())) {
            c1hq.putAll(C69093R9t.LJIIIIZZ());
            return c1hq;
        }
        C10K<String> startAgeGate = startAgeGate(LJIIIIZZ, str, str2);
        if (startAgeGate == null) {
            return c1hq;
        }
        startAgeGate.LJIJI();
        String LJIIJJI = startAgeGate.LJIIJJI();
        String LJ = a.LIZIZ().LJ();
        if (LJ == null || LJ.length() == 0) {
            mobInterceptedBirthdayStillMissing();
            if (C78685UuP.LJJJZ(LJIIJJI)) {
                a.LIZIZ().LJIL(LJIIJJI);
            } else {
                return c1hq;
            }
        }
        c1hq.putAll(C69093R9t.LJIIIIZZ());
        this.currentActivityData = null;
        return c1hq;
    }
}
