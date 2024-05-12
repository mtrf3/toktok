package X;

import Y.ARunnableS25S0200000_6;
import android.os.SystemClock;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.plugin.PluginService;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class G06 extends G0C<C35656Dz2> {
    public long LIZLLL;
    public int LJ;

    @Override // X.G04
    public final boolean LIZIZ(C35656Dz2 c35656Dz2) {
        return true;
    }

    @Override // X.G0C
    public final void LIZLLL() {
        super.LIZLLL();
        C35655Dz1.LIZ(SystemClock.elapsedRealtime() - this.LIZLLL, "Server");
        if (C78857UxB.LJJJIL(DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId())) {
            C35865E5t.LIZIZ();
        } else {
            DeviceRegisterManager.addOnDeviceConfigUpdateListener(new C35876E6e());
        }
        int i = this.LJ;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int LIZ = C61653OHp.LIZ();
        long j = G2E.LIZJ;
        long j2 = G2E.LIZIZ;
        long j3 = j - j2;
        long j4 = elapsedRealtime - j;
        long j5 = elapsedRealtime - j2;
        G2H g2h = G2H.SLOGAN_OPTIMIZE;
        C188727au LJ = C169696lJ.LJ(j3, "slogan_duration");
        LJ.LJ(j4, "plugin_duration");
        LJ.LJ(j5, "total_duration");
        LJ.LIZLLL(i, "status");
        java.util.Map<String, String> map = LJ.LIZ;
        o.LJIIIIZZ(map, "newBuilder()\n           …               .builder()");
        C36222EJm.LIZIZ(g2h, map);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("group:");
        LIZ2.append(LIZ);
        LIZ2.append(", status:");
        LIZ2.append(i);
        LIZ2.append(", slogan_duration:");
        LIZ2.append(j3);
        C0MT.LIZLLL(LIZ2, ", plugin_duration:", j4, ", total_duration:");
        LIZ2.append(j5);
        C40741Fyr.LIZ(X1D.LIZIZ(LIZ2));
    }

    @Override // X.G04
    public final EnumC40761FzB type() {
        return EnumC40761FzB.JOURNEY_SERVER_DELAY;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G06(G0D context, G15 flowEngine) {
        super(context, flowEngine);
        o.LJIIIZ(context, "context");
        o.LJIIIZ(flowEngine, "flowEngine");
    }

    @Override // X.G0C, X.G04
    public final void LIZ(G0D context, C35656Dz2 c35656Dz2, InterfaceC88472Yns<? super C40745Fyv, C76800UCe> interfaceC88472Yns) {
        long j;
        long j2;
        o.LJIIIZ(context, "context");
        super.LIZ(context, c35656Dz2, interfaceC88472Yns);
        this.LIZLLL = SystemClock.elapsedRealtime();
        G2E.LIZJ = SystemClock.elapsedRealtime();
        C34K c34k = new C34K();
        G07 g07 = new G07(c34k, this);
        PluginService.createIPluginServicebyMonsterPlugin(false).observeInitialLaunchRequestResult(((InterfaceC40755Fz5) this.LIZ.LJLILLLLZI).LIZLLL(), g07);
        G08 g08 = (G08) this.LIZ.LIZ(G08.class);
        if (g08 != null) {
            j = g08.Z1();
        } else {
            j = 0;
        }
        if (C61653OHp.LIZ() == 2) {
            j2 = 3500;
        } else {
            j2 = 2500;
        }
        ARunnableS25S0200000_6 aRunnableS25S0200000_6 = new ARunnableS25S0200000_6(g07, c34k, 31);
        long j3 = j2 - j;
        if (j3 <= j2) {
            j2 = j3;
        }
        if (j2 <= 0) {
            C35604DyC.LIZ(aRunnableS25S0200000_6);
        } else {
            C35604DyC.LIZ.postDelayed(aRunnableS25S0200000_6, j2);
        }
    }
}
