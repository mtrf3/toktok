package X;

import android.os.SystemClock;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.IMandatoryLoginService;
import com.ss.android.ugc.aweme.plugin.IPluginService;
import com.ss.android.ugc.aweme.services.CloudTokenLoginService;
import com.ss.android.ugc.aweme.services.MandatoryLoginService;
import com.ss.android.ugc.aweme.services.SmartLockService;
import defpackage.t1;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class G17 extends G0C<C35654Dz0> {
    public DialogC25756A8y LIZLLL;
    public final Keva LJ;
    public long LJFF;

    public static boolean LJII() {
        IMandatoryLoginService createIMandatoryLoginServicebyMonsterPlugin = MandatoryLoginService.createIMandatoryLoginServicebyMonsterPlugin(false);
        o.LJIIIIZZ(createIMandatoryLoginServicebyMonsterPlugin, "get().getService(IMandat…LoginService::class.java)");
        return createIMandatoryLoginServicebyMonsterPlugin.shouldShowForcedLogin(false);
    }

    @Override // X.G0C, X.G04
    public final boolean LIZJ() {
        return false;
    }

    public final void LJFF() {
        DialogC25756A8y dialogC25756A8y = this.LIZLLL;
        if (dialogC25756A8y != null) {
            dialogC25756A8y.dismiss();
        }
        this.LIZLLL = null;
    }

    public final boolean LJI() {
        return ((InterfaceC40755Fz5) this.LIZ.LJLILLLLZI).LJFF().LIZ;
    }

    @Override // X.G0C
    public final void LIZLLL() {
        super.LIZLLL();
        LJFF();
        C35655Dz1.LIZ(SystemClock.elapsedRealtime() - this.LJFF, "Smart Lock");
    }

    @Override // X.G04
    public final EnumC40761FzB type() {
        return EnumC40761FzB.JOURNEY_SMART_LOCK_ID;
    }

    @Override // X.G04
    public final boolean LIZIZ(C35656Dz2 c35656Dz2) {
        C35654Dz0 c35654Dz0 = (C35654Dz0) c35656Dz2;
        if (CloudTokenLoginService.createICloudTokenLoginServicebyMonsterPlugin(false).shouldShowOneClickLoginPanel() || c35654Dz0 == null || t1.LJI()) {
            return false;
        }
        if (LJI() || LJII()) {
            if (!c35654Dz0.LIZ() && !c35654Dz0.LIZIZ()) {
                return false;
            }
            return true;
        }
        return c35654Dz0.LIZJ();
    }

    public final void LJ(boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("autoLogin isNonForceLoginRegion:");
        LIZ.append(z);
        C40741Fyr.LIZ(X1D.LIZIZ(LIZ));
        SmartLockService.createISmartLockServicebyMonsterPlugin(false).checkCredential(new G18(this, z));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G17(G0D context, G15 flowEngine) {
        super(context, flowEngine);
        o.LJIIIZ(context, "context");
        o.LJIIIZ(flowEngine, "flowEngine");
        Keva repo = Keva.getRepo("quick_login_repo");
        o.LJIIIIZZ(repo, "getRepo(REPO_NAME)");
        this.LJ = repo;
    }

    @Override // X.G0C, X.G04
    public final void LIZ(G0D context, C35656Dz2 c35656Dz2, InterfaceC88472Yns interfaceC88472Yns) {
        IPluginService.NonForcedLoginRegionFlow nonForcedLoginRegionFlow;
        int i;
        C35654Dz0 c35654Dz0 = (C35654Dz0) c35656Dz2;
        o.LJIIIZ(context, "context");
        super.LIZ(context, c35654Dz0, interfaceC88472Yns);
        this.LJFF = SystemClock.elapsedRealtime();
        G1T g1t = (G1T) this.LIZ.LIZ(G1T.class);
        if (g1t != null) {
            g1t.PG(false);
        }
        G1T g1t2 = (G1T) this.LIZ.LIZ(G1T.class);
        if (g1t2 != null) {
            g1t2.KB(false);
        }
        G1T g1t3 = (G1T) this.LIZ.LIZ(G1T.class);
        if (g1t3 != null) {
            g1t3.Ys0(false);
        }
        if ((!LJI() && !LJII()) || !EOO.LIZLLL() || c35654Dz0 == null || !c35654Dz0.LIZIZ()) {
            if ((!LJI() && !LJII()) || c35654Dz0 == null || !c35654Dz0.LIZ()) {
                if (!LJI() && !LJII() && c35654Dz0 != null && c35654Dz0.LIZJ() && (nonForcedLoginRegionFlow = c35654Dz0.LIZJ) != null) {
                    Integer num = nonForcedLoginRegionFlow.singleAccountLoginType;
                    if (nonForcedLoginRegionFlow.enableOnAppLaunch != null && num != null && !o.LJ(nonForcedLoginRegionFlow.enableOnAppLaunch, Boolean.FALSE)) {
                        int i2 = this.LJ.getInt("failure_count", 0);
                        Integer num2 = nonForcedLoginRegionFlow.frequencyPostFailure;
                        if (num2 != null) {
                            i = num2.intValue();
                        } else {
                            i = 0;
                        }
                        if (i2 <= i) {
                            G3S g3s = G3S.ONE_CLICK_LOGIN;
                            G3T g3t = G3S.Companion;
                            int intValue = num.intValue();
                            g3t.getClass();
                            if (g3s == G3T.LIZ(intValue)) {
                                SmartLockService.createISmartLockServicebyMonsterPlugin(false).loadCredentials(((InterfaceC40755Fz5) this.LIZ.LJLILLLLZI).LIZ(), true, new G19(this, new C2UJ()));
                                return;
                            } else if (G3S.AUTO_LOGIN == G3T.LIZ(num.intValue())) {
                                LJ(true);
                                return;
                            } else {
                                LIZLLL();
                                return;
                            }
                        }
                    }
                }
                LIZLLL();
                return;
            }
            LJ(false);
            return;
        }
        LJ(false);
    }
}
