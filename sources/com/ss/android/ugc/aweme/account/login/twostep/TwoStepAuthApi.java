package com.ss.android.ugc.aweme.account.login.twostep;

import X.AbstractC66965QPx;
import X.C10K;
import X.C221108m2;
import X.C62822Ol8;
import X.C69077R9d;
import X.C77800Ug8;
import X.C78685UuP;
import X.C84721XMv;
import X.E4Q;
import X.E4T;
import X.EFJ;
import X.EJ6;
import X.InterfaceC195757mF;
import X.InterfaceC195767mG;
import X.InterfaceC64987Pex;
import X.InterfaceC67352kd;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.QQN;
import X.R9U;
import X.WM7;
import X.X1D;
import android.content.Context;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.account.interfaces.GetNonceResponse;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class TwoStepAuthApi {
    public static final TwoStepAuthApi LIZ = new TwoStepAuthApi();
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C84721XMv.LJLIL);
    public static String LIZJ;

    /* loaded from: classes16.dex */
    public interface Api {
        @InterfaceC195757mF
        @E4T("/passport/safe/two_step_verification/add_auth_device/")
        C10K<AuthDeviceResponse> addAuthDevice(@InterfaceC64987Pex("verify_ticket") String str, @InterfaceC64987Pex("target_device") Long l, @InterfaceC64987Pex("ticket") String str2);

        @InterfaceC195757mF
        @E4T("/passport/safe/two_step_verification/add_verification/")
        C10K<AddVerificationResponse> addVerification(@InterfaceC64987Pex("verify_ticket") String str, @InterfaceC64987Pex("verify_way") String str2, @InterfaceC64987Pex("is_default") int i);

        @InterfaceC195757mF
        @E4T("/passport/totp/bind_verify/")
        C10K<BindVerifyResponse> bindTotpVerify(@InterfaceC64987Pex("aid") int i, @InterfaceC64987Pex("code") String str, @InterfaceC195767mG List<EJ6> list);

        @InterfaceC195757mF
        @E4T("/passport/totp/status/")
        C10K<Object> checkTotpStatus(@InterfaceC64987Pex("aid") int i, @InterfaceC195767mG List<EJ6> list);

        @E4Q("/passport/safe/two_step_verification/get_auth_device_list/")
        C10K<AuthDeviceResponse> getAuthDeviceList();

        @E4Q("/passport/auth/available_ways/")
        C10K<AvailableWaysResponse> getAvailableWays();

        @InterfaceC195757mF
        @E4T("/passport/auth/get_nonce/")
        Object getNonce(@InterfaceC64987Pex("platform") String str, @InterfaceC195767mG List<EJ6> list, InterfaceC67352kd<? super GetNonceResponse> interfaceC67352kd);

        @E4Q("/passport/safe/recommend_device/list/")
        C10K<RecommendDeviceResponse> getRecommendDeviceList(@InterfaceC195767mG List<EJ6> list);

        @E4Q("/passport/safe/api/user/unusual_info_preview/")
        C10K<UnusualInfoResponse> getUnusualInfo();

        @E4Q("/passport/safe/two_step_verification/get_verification_list/")
        C10K<AddVerificationResponse> getVerification();

        @InterfaceC195757mF
        @E4T("/passport/totp/register/v2/")
        C10K<BindOrUpdateTOTPResponse> registerTotp(@InterfaceC64987Pex("aid") int i, @InterfaceC64987Pex("device_id") long j, @InterfaceC64987Pex("verify_ticket") String str, @InterfaceC195767mG List<EJ6> list);

        @InterfaceC195757mF
        @E4T("/passport/safe/two_step_verification/remove_all/")
        C10K<AddVerificationResponse> removeAllVerification(@InterfaceC64987Pex("verify_ticket") String str);

        @InterfaceC195757mF
        @E4T("/passport/safe/two_step_verification/remove_auth_device/")
        C10K<AuthDeviceResponse> removeAuthDevice(@InterfaceC64987Pex("del_did") String str);

        @InterfaceC195757mF
        @E4T("/passport/safe/two_step_verification/remove_verification/")
        C10K<AddVerificationResponse> removeVerification(@InterfaceC64987Pex("verify_ticket") String str, @InterfaceC64987Pex("verify_way") String str2);

        @InterfaceC195757mF
        @E4T("/passport/email/send_code/")
        C10K<SendEmailCodeResponse> sendEmailCode(@InterfaceC64987Pex("verify_ticket") String str, @InterfaceC64987Pex("type") Integer num);

        @InterfaceC195757mF
        @E4T("/passport/mobile/send_code/v1/")
        C10K<SendSmsCodeResponse> sendSmsCode(@InterfaceC64987Pex("verify_ticket") String str, @InterfaceC64987Pex("is6Digits") Integer num, @InterfaceC64987Pex("type") Integer num2);

        @InterfaceC195757mF
        @E4T("/passport/totp/update/")
        C10K<BindOrUpdateTOTPResponse> updateTotp(@InterfaceC64987Pex("aid") int i, @InterfaceC64987Pex("device_id") long j, @InterfaceC64987Pex("verify_ticket") String str, @InterfaceC195767mG List<EJ6> list);

        @InterfaceC195757mF
        @E4T("/passport/email/check_code/")
        C10K<TwoStepApiResponse> verifyEmailCode(@InterfaceC64987Pex("mix_mode") Integer num, @InterfaceC64987Pex("email") String str, @InterfaceC64987Pex("code") String str2, @InterfaceC64987Pex("type") int i, @InterfaceC64987Pex("verify_ticket") String str3);

        @InterfaceC195757mF
        @E4T("/passport/account/verify/")
        C10K<TwoStepApiResponse> verifyPassword(@InterfaceC64987Pex("username") String str, @InterfaceC64987Pex("mobile") String str2, @InterfaceC64987Pex("email") String str3, @InterfaceC64987Pex("password") String str4, @InterfaceC64987Pex("mix_mode") int i, @InterfaceC64987Pex("verify_ticket") String str5);

        @InterfaceC195757mF
        @E4T("/passport/mobile/check_code/")
        C10K<TwoStepApiResponse> verifySmsCode(@InterfaceC64987Pex("mix_mode") Integer num, @InterfaceC64987Pex("mobile") String str, @InterfaceC64987Pex("code") String str2, @InterfaceC64987Pex("type") int i, @InterfaceC64987Pex("verify_ticket") String str3);

        @InterfaceC195757mF
        @E4T("/passport/auth/verify/")
        C10K<TwoStepApiResponse> verifyThirdParty(@InterfaceC64987Pex("access_token") String str, @InterfaceC64987Pex("access_token_secret") String str2, @InterfaceC64987Pex("code") String str3, @InterfaceC64987Pex("expires_in") Integer num, @InterfaceC64987Pex("openid") Integer num2, @InterfaceC64987Pex("platform") String str4, @InterfaceC64987Pex("platform_app_id") Integer num3, @InterfaceC64987Pex("mid") Integer num4, @InterfaceC64987Pex("verify_ticket") String str5);

        @InterfaceC195757mF
        @E4T("/passport/totp/verify/")
        C10K<VerifyTOTPResponse> verifyTotp(@InterfaceC64987Pex("aid") int i, @InterfaceC64987Pex("code") String str, @InterfaceC195767mG List<EJ6> list);

        @InterfaceC195757mF
        @E4T("/passport/totp/verify_without_login/")
        C10K<VerifyTOTPResponse> verifyTotpWithoutLogin(@InterfaceC64987Pex("aid") int i, @InterfaceC64987Pex("code") String str, @InterfaceC64987Pex("verify_ticket") String str2, @InterfaceC195767mG List<EJ6> list);
    }

    public static Api LIZIZ() {
        return (Api) LIZIZ.getValue();
    }

    public static boolean LJ() {
        return Keva.getRepo("two_step_verification").getBoolean("ask_next_time", true);
    }

    public static List LIZJ(String str) {
        ArrayList arrayList = new ArrayList();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(EFJ.LIZJ);
        LIZ2.append(str);
        String LIZLLL = AbstractC66965QPx.LIZLLL(X1D.LIZIZ(LIZ2));
        if (C78685UuP.LJJJZ(LIZLLL)) {
            C77800Ug8.LJFF("x-tt-passport-csrf-token", LIZLLL, arrayList);
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(java.lang.String r7, X.InterfaceC67352kd<? super com.ss.android.ugc.aweme.account.interfaces.GetNonceResponse> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C54347LUp
            if (r0 == 0) goto L1e
            r5 = r8
            X.LUp r5 = (X.C54347LUp) r5
            int r2 = r5.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L1e
            int r2 = r2 - r1
            r5.LJLJI = r2
        L12:
            java.lang.Object r4 = r5.LJLIL
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLJI
            r2 = 1
            if (r0 == 0) goto L2c
            if (r0 != r2) goto L24
            goto L42
        L1e:
            X.LUp r5 = new X.LUp
            r5.<init>(r6, r8)
            goto L12
        L24:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2c:
            X.C141335gf.LIZJ(r4)
            com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi$Api r1 = LIZIZ()     // Catch: java.lang.Exception -> L48
            java.lang.String r0 = "/passport/auth/get_nonce/"
            java.util.List r0 = LIZJ(r0)     // Catch: java.lang.Exception -> L48
            r5.LJLJI = r2     // Catch: java.lang.Exception -> L48
            java.lang.Object r4 = r1.getNonce(r7, r0, r5)     // Catch: java.lang.Exception -> L48
            if (r4 != r3) goto L45
            return r3
        L42:
            X.C141335gf.LIZJ(r4)     // Catch: java.lang.Exception -> L48
        L45:
            com.ss.android.ugc.aweme.account.interfaces.GetNonceResponse r4 = (com.ss.android.ugc.aweme.account.interfaces.GetNonceResponse) r4     // Catch: java.lang.Exception -> L48
            goto L53
        L48:
            r0 = move-exception
            com.ss.android.ugc.aweme.account.interfaces.GetNonceResponse r4 = new com.ss.android.ugc.aweme.account.interfaces.GetNonceResponse
            java.lang.String r1 = r0.getMessage()
            r0 = 0
            r4.<init>(r1, r0)
        L53:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi.LIZLLL(java.lang.String, X.2kd):java.lang.Object");
    }

    public final C10K<VerifyTOTPResponse> verifyTotp(@InterfaceC64987Pex("aid") int i, @InterfaceC64987Pex("code") String code) {
        o.LJIIIZ(code, "code");
        return LIZIZ().verifyTotp(i, code, LIZJ("/passport/totp/verify/"));
    }

    public static C10K LJFF(int i, long j, String verifyTicket) {
        o.LJIIIZ(verifyTicket, "verifyTicket");
        return LIZIZ().updateTotp(i, j, verifyTicket, LIZJ("/passport/totp/update/"));
    }

    public final C10K<VerifyTOTPResponse> verifyTotpWithoutLogin(@InterfaceC64987Pex("aid") int i, @InterfaceC64987Pex("code") String code, @InterfaceC64987Pex("verify_ticket") String verify_ticket) {
        o.LJIIIZ(code, "code");
        o.LJIIIZ(verify_ticket, "verify_ticket");
        return LIZIZ().verifyTotpWithoutLogin(i, code, verify_ticket, LIZJ("/passport/totp/verify_without_login/"));
    }

    public static void LIZ(Context context, InterfaceC88472Yns interfaceC88472Yns, InterfaceC88472Yns interfaceC88472Yns2, InterfaceC88471Ynr interfaceC88471Ynr) {
        QQN qqn = new QQN();
        qqn.LIZ = "/passport/shark/safe_verify/verification_manage/";
        qqn.LIZJ(WM7.SCENE_SERVICE, "two_step_manage");
        new R9U(context, qqn.LIZIZ(), new C69077R9d(interfaceC88472Yns, interfaceC88472Yns2, interfaceC88471Ynr)).LJIIIZ();
    }
}
