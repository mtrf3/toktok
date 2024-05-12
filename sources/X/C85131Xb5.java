package X;

import Y.IDeS98S0200000_15;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.ss.android.ugc.aweme.account.login.twostep.BindOrUpdateTOTPResponse;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationActivityViewModel;
import com.ss.android.ugc.aweme.services.BindService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Xb5, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85131Xb5<TTaskResult, TContinuationResult> implements C10I {
    public final /* synthetic */ TwoStepVerificationActivityViewModel LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ InterfaceC88472Yns<String, C76800UCe> LIZLLL;
    public final /* synthetic */ boolean LJ;

    /* JADX WARN: Multi-variable type inference failed */
    public C85131Xb5(TwoStepVerificationActivityViewModel twoStepVerificationActivityViewModel, String str, String str2, InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns, boolean z) {
        this.LIZ = twoStepVerificationActivityViewModel;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = interfaceC88472Yns;
        this.LJ = z;
    }

    @Override // X.C10I
    public final Object then(C10K<BindOrUpdateTOTPResponse> c10k) {
        int i;
        String string;
        Integer errorCode;
        Activity activity = null;
        if (!C82544WaS.LJ(c10k)) {
            if (c10k.LJIIJ() instanceof C64698PaI) {
                TwoStepVerificationActivityViewModel twoStepVerificationActivityViewModel = this.LIZ;
                Exception LJIIJ = c10k.LJIIJ();
                o.LJIIIIZZ(LJIIJ, "it.error");
                TwoStepVerificationActivityViewModel.hv0(twoStepVerificationActivityViewModel, Integer.valueOf(C78688UuS.LJJIIZ(LJIIJ)), null, 6);
            } else {
                TwoStepVerificationActivityViewModel.hv0(this.LIZ, null, null, 7);
            }
            return null;
        }
        BindOrUpdateTOTPResponse LJIIJJI = c10k.LJIIJJI();
        String str = "";
        if (!ujb.o.LJJJJIZL("success", LJIIJJI.getMessage(), true) || LJIIJJI.getData() == null) {
            BindOrUpdateTOTPResponse.RegisterData data = LJIIJJI.getData();
            if (data != null && (errorCode = data.getErrorCode()) != null) {
                i = errorCode.intValue();
            } else {
                i = -2;
            }
            Context context = this.LIZ.lv0().LJLJI;
            if (context != null && (string = context.getString(R.string.sg8)) != null) {
                str = string;
            }
            if (1366 == i) {
                TwoStepVerificationActivityViewModel twoStepVerificationActivityViewModel2 = this.LIZ;
                String str2 = this.LIZIZ;
                String str3 = this.LIZJ;
                InterfaceC88472Yns<String, C76800UCe> interfaceC88472Yns = this.LIZLLL;
                twoStepVerificationActivityViewModel2.getClass();
                BindService LIZIZ = R41.LIZIZ();
                Context context2 = twoStepVerificationActivityViewModel2.lv0().LJLJI;
                if (context2 != null) {
                    activity = C45804HyK.LJIJJ(context2);
                }
                String enterFrom = twoStepVerificationActivityViewModel2.getEnterFrom();
                Bundle jv0 = twoStepVerificationActivityViewModel2.jv0();
                jv0.putString("ticket", str3);
                LIZIZ.verifyTOTP(activity, enterFrom, str2, jv0, new IDeS98S0200000_15(twoStepVerificationActivityViewModel2, interfaceC88472Yns, 12));
                return C76800UCe.LIZ;
            }
            TwoStepVerificationActivityViewModel.hv0(this.LIZ, Integer.valueOf(i), R4R.LIZ(Integer.valueOf(i), str), 4);
            return null;
        }
        String totpSecret = LJIIJJI.getData().getTotpSecret();
        if (totpSecret == null) {
            totpSecret = "";
        }
        String totpKeyUri = LJIIJJI.getData().getTotpKeyUri();
        if (totpKeyUri != null) {
            str = totpKeyUri;
        }
        if (this.LJ) {
            TwoStepVerificationActivityViewModel twoStepVerificationActivityViewModel3 = this.LIZ;
            String str4 = this.LIZIZ;
            InterfaceC88472Yns<String, C76800UCe> interfaceC88472Yns2 = this.LIZLLL;
            twoStepVerificationActivityViewModel3.getClass();
            BindService LIZIZ2 = R41.LIZIZ();
            Context context3 = twoStepVerificationActivityViewModel3.lv0().LJLJI;
            if (context3 != null) {
                activity = C45804HyK.LJIJJ(context3);
            }
            String enterFrom2 = twoStepVerificationActivityViewModel3.getEnterFrom();
            Bundle jv02 = twoStepVerificationActivityViewModel3.jv0();
            jv02.putString("totp_secret", totpSecret);
            jv02.putString("totp_key_uri", str);
            LIZIZ2.updateTOTP(activity, enterFrom2, str4, jv02, new IDeS98S0200000_15(twoStepVerificationActivityViewModel3, interfaceC88472Yns2, 10));
        } else {
            TwoStepVerificationActivityViewModel twoStepVerificationActivityViewModel4 = this.LIZ;
            InterfaceC88472Yns<String, C76800UCe> interfaceC88472Yns3 = this.LIZLLL;
            twoStepVerificationActivityViewModel4.getClass();
            BindService LIZIZ3 = R41.LIZIZ();
            Context context4 = twoStepVerificationActivityViewModel4.lv0().LJLJI;
            if (context4 != null) {
                activity = C45804HyK.LJIJJ(context4);
            }
            String enterFrom3 = twoStepVerificationActivityViewModel4.getEnterFrom();
            String enterMethod = twoStepVerificationActivityViewModel4.getEnterMethod();
            Bundle jv03 = twoStepVerificationActivityViewModel4.jv0();
            jv03.putString("totp_secret", totpSecret);
            jv03.putString("totp_key_uri", str);
            LIZIZ3.bindTOTP(activity, enterFrom3, enterMethod, jv03, new IDeS98S0200000_15(twoStepVerificationActivityViewModel4, interfaceC88472Yns3, 8));
        }
        return C76800UCe.LIZ;
    }
}
