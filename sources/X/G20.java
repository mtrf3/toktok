package X;

import Y.IDeS96S0200000_6;
import android.os.Bundle;
import com.ss.android.ugc.aweme.IMandatoryLoginService;
import com.ss.android.ugc.aweme.account.main.LoginAndConsentAssem;
import com.ss.android.ugc.aweme.services.MandatoryLoginService;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class G20 implements Runnable {
    public final /* synthetic */ LoginAndConsentAssem LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;

    public G20(LoginAndConsentAssem loginAndConsentAssem, boolean z, String str, String str2) {
        this.LJLIL = loginAndConsentAssem;
        this.LJLILLLLZI = z;
        this.LJLJI = str;
        this.LJLJJI = str2;
    }

    public final void LIZ() {
        InterfaceC65895Ptb LJIIIIZZ = HG3.LJIIIIZZ();
        LoginAndConsentAssem loginAndConsentAssem = this.LJLIL;
        boolean z = this.LJLILLLLZI;
        String str = this.LJLJI;
        String str2 = this.LJLJJI;
        loginAndConsentAssem.getClass();
        IMandatoryLoginService createIMandatoryLoginServicebyMonsterPlugin = MandatoryLoginService.createIMandatoryLoginServicebyMonsterPlugin(false);
        Bundle loginActivityBundle = createIMandatoryLoginServicebyMonsterPlugin.getLoginActivityBundle();
        loginActivityBundle.putBoolean("is_disable_animation", z);
        C78450Uqc c78450Uqc = new C78450Uqc();
        ActivityC45651qj activityC45651qj = loginAndConsentAssem.LJLIL;
        if (activityC45651qj != null) {
            c78450Uqc.LIZ = activityC45651qj;
            c78450Uqc.LIZIZ = str;
            c78450Uqc.LIZJ = str2;
            c78450Uqc.LJ = new IDeS96S0200000_6(loginAndConsentAssem, createIMandatoryLoginServicebyMonsterPlugin, 4);
            c78450Uqc.LIZLLL = loginActivityBundle;
            LJIIIIZZ.showLoginAndRegisterView(c78450Uqc.LIZ());
            return;
        }
        o.LJIJI("activity");
        throw null;
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
