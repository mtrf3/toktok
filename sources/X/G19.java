package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.services.SmartLockService;
import com.zhiliaoapp.musically.R;

/* loaded from: classes7.dex */
public final class G19 implements R5X {
    public final /* synthetic */ G17 LIZ;
    public final /* synthetic */ C2UJ LIZIZ;

    @Override // X.R5X
    public final void onDialogShow() {
        this.LIZ.LJFF();
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "google_smart_lock");
        c188727au.LJ(System.currentTimeMillis() - C56662Kg.LIZ().LJIIJ, "notify_duration");
        FMX.LJIIL("express_login_notify", c188727au.LIZ);
        E8V.LIZ(true);
        C12460eI.LJIIJ(this.LIZIZ);
    }

    @Override // X.R5X
    public final void onFailure(int i) {
        this.LIZ.LJFF();
        C19N.LIZJ(this.LIZ.LJ, "failure_count", 0, 1, "failure_count");
        this.LIZ.LIZLLL();
        if (i == 2) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("exit_method", "switch_login_method");
            FMX.LJIIL("exit_express_login_notify", c188727au.LIZ);
        } else if (i != 2) {
            E8V.LIZ(false);
            return;
        }
        C12460eI.LJIIIZ(this.LIZIZ);
    }

    @Override // X.R5X
    public final void onSuccess(MLL mll) {
        G17 g17 = this.LIZ;
        ActivityC45651qj LIZ = ((InterfaceC40755Fz5) g17.LIZ.LJLILLLLZI).LIZ();
        if (LIZ != null) {
            DialogC25756A8y dialogC25756A8y = new DialogC25756A8y(LIZ);
            g17.LIZLLL = dialogC25756A8y;
            dialogC25756A8y.LIZLLL(false);
            DialogC25756A8y dialogC25756A8y2 = g17.LIZLLL;
            if (dialogC25756A8y2 != null) {
                dialogC25756A8y2.LIZ(false);
            }
            DialogC25756A8y dialogC25756A8y3 = g17.LIZLLL;
            if (dialogC25756A8y3 != null) {
                dialogC25756A8y3.LIZIZ(R.string.rjz);
            }
            DialogC25756A8y dialogC25756A8y4 = g17.LIZLLL;
            if (dialogC25756A8y4 != null && !new C03880Dg(2).LIZJ(300000, "com/bytedance/tux/status/loading/TuxLoadingDialogHUD", "show", dialogC25756A8y4, new Object[0], "void", new C65300Pk0(false, "()V", "5012361033936211493")).LIZ) {
                dialogC25756A8y4.show();
            }
        }
        G17 g172 = this.LIZ;
        g172.getClass();
        SmartLockService.createISmartLockServicebyMonsterPlugin(false).smartLockAccountLogin(((InterfaceC40755Fz5) g172.LIZ.LJLILLLLZI).LIZ(), mll, SystemClock.elapsedRealtime(), "click_login", true, new G1B(g172, true));
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("exit_method", "submit");
        FMX.LJIIL("express_login_submit", C44847Hit.LIZIZ("exit_express_login_notify", c188727au.LIZ, "enter_method", "click_login").LIZ);
        C12460eI.LJIIIZ(this.LIZIZ);
    }

    public G19(G17 g17, C2UJ c2uj) {
        this.LIZ = g17;
        this.LIZIZ = c2uj;
    }
}
