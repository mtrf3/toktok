package X;

import android.os.SystemClock;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.account.login.auth.I18nSignUpActivity;
import com.ss.android.ugc.aweme.services.SmartLockService;

/* loaded from: classes7.dex */
public final class G1C implements R5X {
    public final /* synthetic */ I18nSignUpActivity LIZ;
    public final /* synthetic */ C2UI LIZIZ;
    public final /* synthetic */ boolean LIZJ;

    @Override // X.R5X
    public final void onDialogShow() {
        DialogC25756A8y dialogC25756A8y = this.LIZ.LJLJJLL;
        if (dialogC25756A8y != null) {
            dialogC25756A8y.dismiss();
        }
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZLLL("enter_from", "google_smart_lock");
        c35936E8m.LIZIZ(System.currentTimeMillis() - C56662Kg.LIZ().LJIIJ, "notify_duration");
        FMX.LJIIL("express_login_notify", c35936E8m.LIZ);
        C12460eI.LJIIJ(this.LIZIZ);
    }

    @Override // X.R5X
    public final void onFailure(int i) {
        if (this.LIZJ) {
            C19N.LIZJ(Keva.getRepo("quick_login_repo"), "failure_count", 0, 1, "failure_count");
        }
        DialogC25756A8y dialogC25756A8y = this.LIZ.LJLJJLL;
        if (dialogC25756A8y != null) {
            dialogC25756A8y.dismiss();
        }
        if (i == 2) {
            C35936E8m c35936E8m = new C35936E8m();
            c35936E8m.LIZLLL("exit_method", "switch_login_method");
            FMX.LJIIL("exit_express_login_notify", c35936E8m.LIZ);
            C12460eI.LJIIIZ(this.LIZIZ);
        }
        if (!this.LIZJ) {
            this.LIZ.LLIIJLIL();
        }
    }

    @Override // X.R5X
    public final void onSuccess(MLL mll) {
        if (this.LIZ.isFinishing() || this.LIZ.isDestroyed()) {
            return;
        }
        try {
            this.LIZ.LLIIIJ();
            SmartLockService.createISmartLockServicebyMonsterPlugin(false).smartLockAccountLogin(this.LIZ, mll, SystemClock.elapsedRealtime(), "click_login", false, new G1D(this.LIZJ, this.LIZ));
            C35936E8m c35936E8m = new C35936E8m();
            c35936E8m.LIZLLL("exit_method", "submit");
            FMX.LJIIL("exit_express_login_notify", c35936E8m.LIZ);
            C35936E8m c35936E8m2 = new C35936E8m();
            c35936E8m2.LIZLLL("enter_method", "click_login");
            FMX.LJIIL("express_login_submit", c35936E8m2.LIZ);
            C12460eI.LJIIIZ(this.LIZIZ);
        } catch (Throwable unused) {
        }
    }

    public G1C(I18nSignUpActivity i18nSignUpActivity, C2UI c2ui, boolean z) {
        this.LIZ = i18nSignUpActivity;
        this.LIZIZ = c2ui;
        this.LIZJ = z;
    }
}
