package X;

import android.os.SystemClock;
import android.text.TextUtils;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.app.services.HybridABInfoService;
import defpackage.s1;
import kotlin.jvm.internal.o;

/* renamed from: X.EJm, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36222EJm {
    public static void LIZ(C188727au c188727au) {
        int i;
        Integer LIZIZ = HybridABInfoService.LIZJ().LIZIZ();
        if (LIZIZ != null) {
            i = LIZIZ.intValue();
        } else {
            i = 0;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - C56662Kg.LIZ().LJIIJJI;
        boolean LIZLLL = s1.LIZLLL("isFirstInstallAndFirstLaunch()");
        int i2 = !TextUtils.isEmpty(DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId()) ? 1 : 0;
        c188727au.LJ(elapsedRealtime, "from_start_to_current_duration");
        c188727au.LIZLLL(i, "is_hybrid_ab_recv");
        c188727au.LIZLLL(LIZLLL ? 1 : 0, "is_cold_start_first_launch");
        c188727au.LIZLLL(i2, "is_did_ready");
        c188727au.LIZLLL(E6T.LJIIIIZZ ? 1 : 0, "is_hybrid_ab_api_rev");
        c188727au.LIZLLL(C38985FRt.LIZIZ.LJI(), "is_in_nuj_process");
    }

    public final void onEventV3(G2H event) {
        o.LJIIIZ(event, "event");
        FMX.onEventV3(event.toString());
    }

    public static void LIZIZ(G2H event, java.util.Map map) {
        o.LJIIIZ(event, "event");
        FMX.LJIIL(event.toString(), map);
    }
}
