package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.services.SmartLockService;

/* loaded from: classes7.dex */
public final class G18 implements R5V {
    public final /* synthetic */ G17 LIZ;
    public final /* synthetic */ boolean LIZIZ;

    @Override // X.R5V
    public final void LIZ() {
        E8V.LIZ(false);
        this.LIZ.LIZLLL();
    }

    @Override // X.R5V
    public final void LIZJ() {
        G1T g1t = (G1T) this.LIZ.LIZ.LIZ(G1T.class);
        if (g1t != null) {
            g1t.PG(true);
        }
        this.LIZ.LJ.storeBoolean("has_smart_lock_info", true);
        G1T g1t2 = (G1T) this.LIZ.LIZ.LIZ(G1T.class);
        if (g1t2 != null) {
            g1t2.KB(true);
        }
        E8V.LIZ(true);
        if (this.LIZIZ) {
            G17 g17 = this.LIZ;
            g17.getClass();
            SmartLockService.createISmartLockServicebyMonsterPlugin(false).loadCredentials(((InterfaceC40755Fz5) g17.LIZ.LJLILLLLZI).LIZ(), true, new G19(g17, new C2UJ()));
            return;
        }
        this.LIZ.LIZLLL();
    }

    @Override // X.R5V
    public final void onFailure() {
        if (this.LIZIZ) {
            C19N.LIZJ(this.LIZ.LJ, "failure_count", 0, 1, "failure_count");
        }
        E8V.LIZ(false);
        this.LIZ.LIZLLL();
    }

    @Override // X.R5V
    public final void LIZIZ(MLL mll) {
        G1T g1t = (G1T) this.LIZ.LIZ.LIZ(G1T.class);
        if (g1t != null) {
            g1t.PG(true);
        }
        this.LIZ.LJ.storeBoolean("has_smart_lock_info", true);
        E8V.LIZ(true);
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_method", "auto_login");
        FMX.LJIIL("express_login_submit", c188727au.LIZ);
        InterfaceC34451Wv interfaceC34451Wv = new InterfaceC34451Wv() { // from class: X.2UG
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
        C12460eI.LJIIJ(interfaceC34451Wv);
        G17 g17 = this.LIZ;
        boolean z = this.LIZIZ;
        g17.getClass();
        SmartLockService.createISmartLockServicebyMonsterPlugin(false).smartLockAccountLogin(((InterfaceC40755Fz5) g17.LIZ.LJLILLLLZI).LIZ(), mll, SystemClock.elapsedRealtime(), "auto_login", true, new G1B(g17, z));
        C12460eI.LJIIIZ(interfaceC34451Wv);
    }

    public G18(G17 g17, boolean z) {
        this.LIZ = g17;
        this.LIZIZ = z;
    }
}
