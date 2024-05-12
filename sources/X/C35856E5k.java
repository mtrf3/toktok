package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.network.spi.INetworkStateService;
import com.ss.android.ugc.aweme.services.NetworkStateServiceImpl;
import kotlin.jvm.internal.o;

/* renamed from: X.E5k, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35856E5k {
    public static final INetworkStateService LIZ = NetworkStateServiceImpl.createINetworkStateServicebyMonsterPlugin(false);

    public static void LIZ(int i, int i2, long j, String str) {
        long j2;
        long j3 = C56662Kg.LIZ().LJIIJJI;
        if (j3 > 0) {
            j2 = SystemClock.elapsedRealtime() - j3;
        } else {
            j2 = -1;
        }
        C188727au LIZJ = C78920UyC.LIZJ(i2, "status");
        LIZJ.LJ(SystemClock.elapsedRealtime() - j, "req_duration");
        Boolean LIZLLL = C38987FRv.LIZLLL();
        o.LJIIIIZZ(LIZLLL, "isFirstInstallAndFirstLaunch()");
        LIZJ.LIZLLL(LIZLLL.booleanValue() ? 1 : 0, "is_cold_start_first_launch");
        LIZJ.LJ(j2, "duration_from_start");
        LIZJ.LJIIIZ("error_message", str);
        LIZJ.LIZLLL(C84763XOl.LJIIJJI ? 1 : 0, "is_app_background");
        LIZJ.LIZLLL(LIZ.getNetworkStatus().ordinal(), "network_status");
        LIZJ.LIZLLL(i, WM7.SCENE_SERVICE);
        FMX.LJIIL("plugin_api_req_recv", LIZJ.LIZ);
    }
}
