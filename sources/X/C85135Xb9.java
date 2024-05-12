package X;

import Y.IDeS98S0200000_15;
import android.os.Bundle;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationManageActivity;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.BindService;
import com.ss.android.ugc.aweme.services.PasswordService;

/* renamed from: X.Xb9, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85135Xb9 implements C2YO {
    public final /* synthetic */ TwoStepVerificationManageActivity LIZ;
    public final /* synthetic */ InterfaceC88472Yns<C85114Xao, C76800UCe> LIZIZ;
    public final /* synthetic */ String LIZJ;

    @Override // X.C2YO
    public final void onUpdateFailed(String str) {
        this.LIZ.LLIIJI(null, str);
    }

    @Override // X.C2YO
    public final void onUpdateSuccess(boolean z) {
        User LIZJ = R41.LIZJ();
        if (z) {
            PasswordService LJFF = R41.LJFF();
            TwoStepVerificationManageActivity twoStepVerificationManageActivity = this.LIZ;
            String enterFrom = twoStepVerificationManageActivity.getEnterFrom();
            Bundle LLIIIILZ = this.LIZ.LLIIIILZ();
            LLIIIILZ.putInt("current_scene", EnumC69116RAq.VERIFY_ACCOUNT_FROM_2SV.getValue());
            LJFF.verifyPassword(twoStepVerificationManageActivity, enterFrom, LLIIIILZ, new IDeS98S0200000_15(this.LIZ, this.LIZIZ, 5));
            return;
        }
        if (LIZJ.isPhoneBinded()) {
            BindService LIZIZ = R41.LIZIZ();
            TwoStepVerificationManageActivity twoStepVerificationManageActivity2 = this.LIZ;
            LIZIZ.verifyMobileForTicket(twoStepVerificationManageActivity2, twoStepVerificationManageActivity2.getEnterFrom(), this.LIZ.getEnterMethod(), this.LIZ.LLIIIILZ(), new IDeS98S0200000_15(this.LIZ, this.LIZIZ, 6));
        } else {
            if (LIZJ.isEmailVerified() || LIZJ.isHasEmail()) {
                BindService LIZIZ2 = R41.LIZIZ();
                TwoStepVerificationManageActivity twoStepVerificationManageActivity3 = this.LIZ;
                LIZIZ2.verifyEmailForTicket(twoStepVerificationManageActivity3, twoStepVerificationManageActivity3.getEnterFrom(), this.LIZ.getEnterMethod(), this.LIZ.LLIIIILZ(), new IDeS98S0200000_15(this.LIZ, this.LIZIZ, 7));
                return;
            }
            this.LIZIZ.invoke(new C85114Xao(this.LIZJ, "oauth_verify"));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C85135Xb9(TwoStepVerificationManageActivity twoStepVerificationManageActivity, InterfaceC88472Yns<? super C85114Xao, C76800UCe> interfaceC88472Yns, String str) {
        this.LIZ = twoStepVerificationManageActivity;
        this.LIZIZ = interfaceC88472Yns;
        this.LIZJ = str;
    }
}
