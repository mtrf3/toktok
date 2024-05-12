package X;

import android.os.SystemClock;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.account.login.auth.I18nSignUpActivity;
import com.ss.android.ugc.aweme.services.SmartLockService;

/* loaded from: classes7.dex */
public final class G1E implements R5V {
    public final /* synthetic */ I18nSignUpActivity LIZ;

    @Override // X.R5V
    public final void LIZ() {
    }

    @Override // X.R5V
    public final void LIZJ() {
        this.LIZ.LLIIIZ(true);
    }

    @Override // X.R5V
    public final void onFailure() {
        C19N.LIZJ(Keva.getRepo("quick_login_repo"), "failure_count", 0, 1, "failure_count");
    }

    public G1E(I18nSignUpActivity i18nSignUpActivity) {
        this.LIZ = i18nSignUpActivity;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [X.2UH, X.1Wv] */
    @Override // X.R5V
    public final void LIZIZ(MLL mll) {
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZLLL("enter_method", "auto_login");
        FMX.LJIIL("express_login_submit", c35936E8m.LIZ);
        ?? r1 = new InterfaceC34451Wv() { // from class: X.2UH
            @Override // X.InterfaceC34451Wv
            public final Object LJJIII() {
                return null;
            }

            @Override // X.InterfaceC34451Wv
            public final boolean Wi() {
                return false;
            }

            @Override // X.InterfaceC34451Wv, X.InterfaceC18010nF
            public String getBtmPageCode() {
                return "b8637";
            }

            @Override // X.InterfaceC18010nF
            public final java.util.Map<String, String> x3() {
                return null;
            }

            @Override // X.InterfaceC34451Wv, X.InterfaceC18010nF
            public final String LLZIL() {
                return C18030nH.LIZ(this);
            }
        };
        C12460eI.LJIIJ(r1);
        SmartLockService.createISmartLockServicebyMonsterPlugin(false).smartLockAccountLogin(this.LIZ, mll, SystemClock.elapsedRealtime(), "auto_login", false, new G1F(r1, this.LIZ));
    }
}
