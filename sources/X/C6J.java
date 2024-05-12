package X;

import com.bytedance.android.livesdk.livesetting.other.LiveMonitorSampleSetting;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public final class C6J {
    public static final C6J LIZ = new C6J();
    public static C6M LIZIZ;

    public static long LIZ(long j, long j2) {
        if (j == -1 || j2 < j) {
            return -1L;
        }
        return j2 - j;
    }

    public static C6M LIZIZ() {
        C6M c6m = LIZIZ;
        if (c6m == null) {
            C6M c6m2 = new C6M();
            LIZIZ = c6m2;
            return c6m2;
        }
        return c6m;
    }

    public final void LIZLLL() {
        C6M LIZIZ2 = LIZIZ();
        long LIZ2 = LIZ(LIZIZ2.LJII, LIZIZ2.LJIIIIZZ);
        HashMap hashMap = new HashMap(LIZIZ2.LIZIZ());
        hashMap.put("duration", Long.valueOf(LIZ2));
        LIZJ(this, "container_create", 0, hashMap);
    }

    public final void LJFF() {
        C6M LIZIZ2 = LIZIZ();
        long LIZ2 = LIZ(LIZIZ2.LJIIIZ, LIZIZ2.LJIIJ);
        HashMap hashMap = new HashMap(LIZIZ2.LIZIZ());
        hashMap.put("duration", Long.valueOf(LIZ2));
        LIZJ(this, "container_load", 0, hashMap);
    }

    public final void LJI() {
        C6M LIZIZ2 = LIZIZ();
        long LIZ2 = LIZ(LIZIZ2.LJIIJ, LIZIZ2.LJIIJJI);
        long j = LIZIZ2.LJFF;
        if (j <= 0) {
            j = LIZIZ2.LJII;
        }
        long LIZ3 = LIZ(j, LIZIZ2.LJIIJJI);
        HashMap hashMap = new HashMap(LIZIZ2.LIZIZ());
        hashMap.put("duration", Long.valueOf(LIZ2));
        hashMap.put("duration_from_network", Long.valueOf(LIZ3));
        LIZJ(this, "container_show", 0, hashMap);
    }

    public final void LJ(String str) {
        C6M LIZIZ2 = LIZIZ();
        long LIZ2 = LIZ(LIZIZ2.LJIIIZ, LIZIZ2.LJIIJ);
        HashMap hashMap = new HashMap(LIZIZ2.LIZIZ());
        hashMap.put("duration", Long.valueOf(LIZ2));
        if (str == null) {
            str = "unknown";
        }
        hashMap.put("error_message", str);
        LIZJ(this, "container_load", 1, hashMap);
    }

    public static void LIZJ(C6J c6j, String str, int i, java.util.Map map) {
        String str2;
        c6j.getClass();
        HashMap hashMap = (HashMap) map;
        hashMap.put("action", str);
        if (LiveMonitorSampleSetting.INSTANCE.isReportSlardar("ttlive_live_sdk_banner_all_in_one")) {
            C0K2.LJII(i, "live_sdk_banner_all_in_one", map);
        }
        hashMap.put("event_name", "live_sdk_banner_all_in_one");
        if (i == 0) {
            C28733BPl.LJIILIIL().LJIIIIZZ("ttlive_banner", map);
        } else {
            C28733BPl.LJIILIIL().LJ("ttlive_banner", map);
        }
        BZI LIZ2 = C28787BRn.LIZ("live_banner_all_in_one");
        for (Map.Entry entry : hashMap.entrySet()) {
            String str3 = (String) entry.getKey();
            Object value = entry.getValue();
            if (value != null) {
                str2 = value.toString();
            } else {
                str2 = null;
            }
            LIZ2.LJIJJ(str2, str3);
        }
        if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(LIZ2.LJIILL())) {
            LIZ2.LJJIIJZLJL();
        } else {
            LIZ2.LJJIJ();
            LIZ2.LJJIIZI();
        }
    }
}
