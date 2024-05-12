package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.account.login.auth.I18nSignUpActivity;

/* loaded from: classes7.dex */
public final class G1D implements R5Y {
    public final /* synthetic */ boolean LIZ;
    public final /* synthetic */ I18nSignUpActivity LIZIZ;

    @Override // X.R5Y
    public final void onSuccess() {
    }

    @Override // X.R5Y
    public final void onFailure() {
        if (this.LIZ) {
            C19N.LIZJ(Keva.getRepo("quick_login_repo"), "failure_count", 0, 1, "failure_count");
        }
        DialogC25756A8y dialogC25756A8y = this.LIZIZ.LJLJJLL;
        if (dialogC25756A8y != null) {
            dialogC25756A8y.dismiss();
        }
        if (!this.LIZ) {
            this.LIZIZ.LLIIJLIL();
        }
    }

    public G1D(boolean z, I18nSignUpActivity i18nSignUpActivity) {
        this.LIZ = z;
        this.LIZIZ = i18nSignUpActivity;
    }
}
