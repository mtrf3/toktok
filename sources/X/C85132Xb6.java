package X;

import Y.IDeS359S0100000_15;
import Y.IDeS98S0200000_15;
import android.os.Bundle;
import androidx.credentials.playservices.HiddenActivity$$ExternalSyntheticOutline0;
import com.ss.android.ugc.aweme.account.login.twostep.BindOrUpdateTOTPResponse;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationManageActivity;
import com.ss.android.ugc.aweme.services.BindService;
import com.zhiliaoapp.musically.R;
import ujb.o;

/* renamed from: X.Xb6, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85132Xb6<TTaskResult, TContinuationResult> implements C10I {
    public final /* synthetic */ TwoStepVerificationManageActivity LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ InterfaceC88472Yns<String, C76800UCe> LIZLLL;
    public final /* synthetic */ boolean LJ;

    /* JADX WARN: Multi-variable type inference failed */
    public C85132Xb6(TwoStepVerificationManageActivity twoStepVerificationManageActivity, String str, String str2, InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns, boolean z) {
        this.LIZ = twoStepVerificationManageActivity;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = interfaceC88472Yns;
        this.LJ = z;
    }

    @Override // X.C10I
    public final Object then(C10K<BindOrUpdateTOTPResponse> c10k) {
        Integer errorCode;
        String str;
        String totpKeyUri;
        int i = -2;
        if (!C82544WaS.LJ(c10k)) {
            if (c10k.LJIIJ() instanceof C64698PaI) {
                this.LIZ.LLIIJI(-2, R4R.LIZ(null, null));
            } else {
                TwoStepVerificationManageActivity twoStepVerificationManageActivity = this.LIZ;
                twoStepVerificationManageActivity.LLIIJI(-2, twoStepVerificationManageActivity.getString(R.string.sg8));
            }
            return null;
        }
        BindOrUpdateTOTPResponse LJIIJJI = c10k.LJIIJJI();
        if (!o.LJJJJIZL("success", LJIIJJI.getMessage(), true) || LJIIJJI.getData() == null) {
            BindOrUpdateTOTPResponse.RegisterData data = LJIIJJI.getData();
            if (data != null && (errorCode = data.getErrorCode()) != null) {
                i = errorCode.intValue();
            }
            String string = this.LIZ.getString(R.string.sg8);
            kotlin.jvm.internal.o.LJIIIIZZ(string, "getString(\n             …App_codePage_serverError)");
            this.LIZ.LLIIJLIL();
            if (1366 == i) {
                TwoStepVerificationManageActivity twoStepVerificationManageActivity2 = this.LIZ;
                String str2 = this.LIZIZ;
                String str3 = this.LIZJ;
                InterfaceC88472Yns<String, C76800UCe> interfaceC88472Yns = this.LIZLLL;
                twoStepVerificationManageActivity2.getClass();
                BindService LIZIZ = R41.LIZIZ();
                String enterFrom = twoStepVerificationManageActivity2.getEnterFrom();
                Bundle LIZJ = AnonymousClass036.LIZJ("ticket", str3, "page", "twosv_setup");
                LIZJ.putBoolean("show_success_toast", false);
                LIZJ.putBoolean("is_mandatory_two_sv", twoStepVerificationManageActivity2.LLIL());
                LIZIZ.verifyTOTP(twoStepVerificationManageActivity2, enterFrom, str2, LIZJ, new IDeS359S0100000_15(interfaceC88472Yns, 4));
                return C76800UCe.LIZ;
            }
            this.LIZ.LLIIJI(Integer.valueOf(i), R4R.LIZ(Integer.valueOf(i), string));
            return null;
        }
        BindOrUpdateTOTPResponse.RegisterData data2 = LJIIJJI.getData();
        String str4 = "";
        if (data2 == null || (str = data2.getTotpSecret()) == null) {
            str = "";
        }
        BindOrUpdateTOTPResponse.RegisterData data3 = LJIIJJI.getData();
        if (data3 != null && (totpKeyUri = data3.getTotpKeyUri()) != null) {
            str4 = totpKeyUri;
        }
        if (this.LJ) {
            TwoStepVerificationManageActivity twoStepVerificationManageActivity3 = this.LIZ;
            String str5 = this.LIZIZ;
            InterfaceC88472Yns<String, C76800UCe> interfaceC88472Yns2 = this.LIZLLL;
            twoStepVerificationManageActivity3.getClass();
            BindService LIZIZ2 = R41.LIZIZ();
            String enterFrom2 = twoStepVerificationManageActivity3.getEnterFrom();
            Bundle m = HiddenActivity$$ExternalSyntheticOutline0.m("show_success_toast", false, "page", "twosv_setup");
            m.putBoolean("is_mandatory_two_sv", twoStepVerificationManageActivity3.LLIL());
            m.putString("totp_secret", str);
            m.putString("totp_key_uri", str4);
            LIZIZ2.updateTOTP(twoStepVerificationManageActivity3, enterFrom2, str5, m, new IDeS98S0200000_15(twoStepVerificationManageActivity3, interfaceC88472Yns2, 1));
        } else {
            TwoStepVerificationManageActivity twoStepVerificationManageActivity4 = this.LIZ;
            InterfaceC88472Yns<String, C76800UCe> interfaceC88472Yns3 = this.LIZLLL;
            twoStepVerificationManageActivity4.getClass();
            BindService LIZIZ3 = R41.LIZIZ();
            String enterFrom3 = twoStepVerificationManageActivity4.getEnterFrom();
            String enterMethod = twoStepVerificationManageActivity4.getEnterMethod();
            Bundle LIZ = C01R.LIZ("show_success_toast", false);
            LIZ.putBoolean("is_mandatory_two_sv", twoStepVerificationManageActivity4.LLIL());
            LIZ.putString("totp_secret", str);
            LIZ.putString("totp_key_uri", str4);
            LIZ.putString("page", "twosv_setup");
            LIZIZ3.bindTOTP(twoStepVerificationManageActivity4, enterFrom3, enterMethod, LIZ, new IDeS98S0200000_15(twoStepVerificationManageActivity4, interfaceC88472Yns3, 0));
        }
        this.LIZ.LLIIJLIL();
        return C76800UCe.LIZ;
    }
}
