package X;

import android.os.SystemClock;
import android.text.TextUtils;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.network.spi.INetworkStateService;
import com.ss.android.ugc.aweme.services.NetworkStateServiceImpl;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class E6T {
    public static String LJI;
    public static boolean LJIIIIZZ;
    public static final java.util.Map<String, String> LIZ = new LinkedHashMap();
    public static int LIZIZ = 1;
    public static final java.util.Set<String> LIZJ = new LinkedHashSet();
    public static final java.util.Set<String> LIZLLL = new LinkedHashSet();
    public static final java.util.Set<String> LJ = new LinkedHashSet();
    public static final java.util.Set<String> LJFF = new LinkedHashSet();
    public static final INetworkStateService LJII = NetworkStateServiceImpl.createINetworkStateServicebyMonsterPlugin(false);

    public static void LIZ(int i, String featureName, String errorMsg, boolean z, long j) {
        long j2;
        o.LJIIIZ(featureName, "featureName");
        o.LJIIIZ(errorMsg, "errorMsg");
        long j3 = C56662Kg.LIZ().LJIIJJI;
        long j4 = -1;
        if (j3 > 0) {
            j2 = SystemClock.elapsedRealtime() - j3;
        } else {
            j2 = -1;
        }
        C188727au LIZJ2 = C78920UyC.LIZJ(i, "status");
        LIZJ2.LJ(SystemClock.elapsedRealtime() - j, "req_duration");
        LIZJ2.LIZLLL(E73.LIZ() ? 1 : 0, "is_cold_start_first_launch");
        int i2 = 1;
        LIZJ2.LIZLLL(!TextUtils.isEmpty(DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId()) ? 1 : 0, "is_did_ready");
        LIZJ2.LIZLLL(LIZIZ, "is_in_nuj_process");
        LIZJ2.LJ(j2, "from_start_to_current_duration");
        LIZJ2.LJIIIZ("feature_name", featureName);
        LIZJ2.LJIIIZ("error_message", errorMsg);
        LIZJ2.LIZLLL(z ? 1 : 0, "is_from_network_change");
        LIZJ2.LIZLLL(C84763XOl.LJIIJJI ? 1 : 0, "is_app_background");
        LIZJ2.LIZLLL(LJII.getNetworkStatus().ordinal(), "network_status");
        java.util.Set<String> set = LJFF;
        if (set.size() != 0) {
            i2 = 0;
        }
        LIZJ2.LIZLLL(i2, "full_exposure");
        LIZJ2.LJIIIZ("logid", LJI);
        FMX.LJIIL("hybrid_ab_api_req_recv", LIZJ2.LIZ);
        if (set.size() != 0) {
            long j5 = C56662Kg.LIZ().LJIIJJI;
            if (j5 > 0) {
                j4 = SystemClock.elapsedRealtime() - j5;
            }
            C188727au c188727au = new C188727au();
            c188727au.LIZLLL(E73.LIZ() ? 1 : 0, "is_cold_start_first_launch");
            c188727au.LJIIIZ("step", "full");
            c188727au.LJ(j4, "duration_from_start");
            java.util.Set<String> set2 = LIZJ;
            c188727au.LJIIIZ("delivered_vids", set2.toString());
            c188727au.LIZLLL(set2.size(), "delivered_vids_cnt");
            java.util.Set<String> set3 = LIZLLL;
            c188727au.LJIIIZ("f_delivered_vids", set3.toString());
            c188727au.LIZLLL(set3.size(), "f_delivered_vids_cnt");
            java.util.Set<String> set4 = LJ;
            c188727au.LJIIIZ("f_append_vids", set4.toString());
            c188727au.LIZLLL(set4.size(), "f_append_vids_cnt");
            c188727au.LJIIIZ("f_unappend_vids", set.toString());
            c188727au.LIZLLL(set.size(), "f_unappend_vids_cnt");
            c188727au.LJIIIZ("logid", LJI);
            FMX.LJIIL("hybrid_ab_flow_track", c188727au.LIZ);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.7au] */
    /* JADX WARN: Type inference failed for: r9v1, types: [int] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    public static void LIZIZ(String str, String key, String str2, boolean z, int i) {
        long j;
        if ((i & 4) != 0) {
            str2 = null;
        }
        ?? r9 = z;
        if ((i & 8) != 0) {
            r9 = 0;
        }
        o.LJIIIZ(key, "key");
        java.util.Map<String, String> map = LIZ;
        if (o.LJ(((LinkedHashMap) map).get(key), str)) {
            return;
        }
        map.put(key, str);
        long j2 = C56662Kg.LIZ().LJIIJJI;
        if (j2 > 0) {
            j = SystemClock.elapsedRealtime() - j2;
        } else {
            j = -1;
        }
        ?? c188727au = new C188727au();
        c188727au.LIZLLL(E73.LIZ() ? 1 : 0, "is_cold_start_first_launch");
        c188727au.LJIIIZ("step", "precise");
        c188727au.LJ(j, "duration_from_start");
        c188727au.LJIIIZ("p_key", key);
        c188727au.LJIIIZ("p_vid", str2);
        c188727au.LJIIIZ("status", str);
        c188727au.LJIIIZ("logid", LJI);
        if (o.LJ(str, "time_out")) {
            c188727au.LIZLLL(r9, "stable");
        }
        FMX.LJIIL("hybrid_ab_flow_track", c188727au.LIZ);
    }
}
