package X;

import Y.IDeS96S0200000_6;
import android.os.Bundle;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.IMandatoryLoginService;

/* renamed from: X.G1z, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC40863G1z implements Runnable {
    public final /* synthetic */ IMandatoryLoginService LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ G16 LJLJI;

    public RunnableC40863G1z(IMandatoryLoginService iMandatoryLoginService, boolean z, G16 g16) {
        this.LJLIL = iMandatoryLoginService;
        this.LJLILLLLZI = z;
        this.LJLJI = g16;
    }

    public final void LIZ() {
        Bundle loginActivityBundle = this.LJLIL.getLoginActivityBundle();
        loginActivityBundle.putBoolean("is_from_new_user_journey", true);
        loginActivityBundle.putBoolean("is_skippable_dialog", false);
        loginActivityBundle.putBoolean("is_express_login", this.LJLILLLLZI);
        G23.LIZ.storeLong("mandatory_login_shown_millis", System.currentTimeMillis());
        ActivityC45651qj LIZ = ((InterfaceC40755Fz5) this.LJLJI.LIZ.LJLILLLLZI).LIZ();
        if (LIZ.isFinishing() || LIZ.isDestroyed()) {
            return;
        }
        C78450Uqc c78450Uqc = new C78450Uqc();
        c78450Uqc.LIZ = LIZ;
        c78450Uqc.LIZIZ = "cold_launch";
        c78450Uqc.LIZJ = "welcome_screen";
        if (this.LJLILLLLZI) {
            c78450Uqc.LIZIZ = "click_login";
        }
        c78450Uqc.LIZLLL = loginActivityBundle;
        c78450Uqc.LJ = new IDeS96S0200000_6(this.LJLIL, this.LJLJI, 5);
        AccountService.LJIJ().LJI().showLoginAndRegisterView(new C78451Uqd(c78450Uqc));
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
