package X;

import android.os.SystemClock;
import com.bytedance.android.livesdk.livesetting.linkmic.TTliveAnchorDeviceScoreSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveLogMonitorSampleSetting;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import defpackage.i0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.OWq, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62044OWq {
    public static final java.util.Map<String, Long> LIZ = new ConcurrentHashMap();
    public static final java.util.Map<String, Long> LIZIZ = new ConcurrentHashMap();
    public static final List<String> LIZJ = new CopyOnWriteArrayList();

    public static void LIZ(String str) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long uptimeMillis = SystemClock.uptimeMillis();
        String LJ = LJ(str, false);
        ((ConcurrentHashMap) LIZIZ).put(LJ, Long.valueOf(elapsedRealtime));
        ((ConcurrentHashMap) LIZ).put(LJ, Long.valueOf(uptimeMillis));
    }

    public static void LIZIZ(String str) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long uptimeMillis = SystemClock.uptimeMillis();
        String LJ = LJ(str, true);
        ((ConcurrentHashMap) LIZIZ).put(LJ, Long.valueOf(elapsedRealtime));
        ((ConcurrentHashMap) LIZ).put(LJ, Long.valueOf(uptimeMillis));
        ((CopyOnWriteArrayList) LIZJ).add(str);
    }

    public static void LIZJ(final boolean z, final boolean z2) {
        final boolean z3;
        if (!LiveLogMonitorSampleSetting.INSTANCE.isReport("livesdk_init_time_all", LiveLogMonitorSampleSetting.getSAMPLE_10())) {
            return;
        }
        if (C16880lQ.LLLLIIIILLL() == C16880lQ.LLJJJJ().getThread()) {
            z3 = true;
        } else {
            z3 = false;
        }
        final String stackTraceString = android.util.Log.getStackTraceString(new Throwable(""));
        C38995FSd.LIZIZ().execute(new Runnable() { // from class: X.OWr
            @Override // java.lang.Runnable
            public final void run() {
                String str;
                boolean z4 = z;
                String str2 = stackTraceString;
                boolean z5 = z3;
                boolean z6 = z2;
                BZI LIZ2 = C28787BRn.LIZ("livesdk_init_time_all");
                java.util.Map<String, Long> map = C62044OWq.LIZIZ;
                HashMap hashMap = new HashMap(map);
                ((ConcurrentHashMap) map).clear();
                java.util.Map<String, Long> map2 = C62044OWq.LIZ;
                HashMap hashMap2 = new HashMap(map2);
                ((ConcurrentHashMap) map2).clear();
                Iterator it = ((CopyOnWriteArrayList) C62044OWq.LIZJ).iterator();
                while (it.hasNext()) {
                    String str3 = (String) it.next();
                    String LJ = C62044OWq.LJ(str3, true);
                    String LJ2 = C62044OWq.LJ(str3, false);
                    long LIZLLL = C62044OWq.LIZLLL(LJ, hashMap);
                    long LIZLLL2 = C62044OWq.LIZLLL(LJ2, hashMap);
                    long LIZLLL3 = C62044OWq.LIZLLL(LJ, hashMap2);
                    long LIZLLL4 = C62044OWq.LIZLLL(LJ2, hashMap2);
                    if (LIZLLL > 0 && LIZLLL2 > 0) {
                        I9A.LIZ(LIZLLL2, LIZLLL, LIZ2, str3);
                    }
                    if (LIZLLL3 > 0 && LIZLLL4 > 0) {
                        I9A.LIZ(LIZLLL4, LIZLLL3, LIZ2, i0.LJFF(str3, "_no_sleep"));
                    }
                }
                if (z4) {
                    str = "LiveInjectContextTask";
                    if (!str2.contains("LiveInjectContextTask")) {
                        str = "LivePrefetchLoadOptTask";
                        if (!str2.contains("LivePrefetchLoadOptTask")) {
                            str = "GetBubbleSettingTask";
                            if (!str2.contains("GetBubbleSettingTask")) {
                                str = "InitLiveServiceTask";
                                if (!str2.contains("InitLiveServiceTask")) {
                                    str = "OtherAutoCall";
                                }
                            }
                        }
                    }
                } else {
                    str = "BusinessNeededCall";
                }
                LIZ2.LJIL("device_score", Float.valueOf(TTliveAnchorDeviceScoreSetting.INSTANCE.getValue()));
                LIZ2.LJIJJ(Boolean.valueOf(z5), "is_main_thread");
                LIZ2.LJIJJ(Boolean.TRUE, "is_opt");
                LIZ2.LJIJJ(Boolean.valueOf(z4), "is_preload");
                LIZ2.LJIJJ(Boolean.valueOf(!z6), "contain_lite_init");
                LIZ2.LJIJJ(str, "call_path");
                if (!z4 || str.equals("OtherAutoCall")) {
                    LIZ2.LJIJJ(str2, "load_stack");
                }
                if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(LIZ2.LJIILL())) {
                    LIZ2.LJJIIJZLJL();
                } else {
                    LIZ2.LJJIJ();
                    LIZ2.LJJIIZI();
                }
            }
        });
    }

    public static long LIZLLL(String str, java.util.Map map) {
        Long l = (Long) ((HashMap) map).get(str);
        if (l == null) {
            return 0L;
        }
        return l.longValue();
    }

    public static String LJ(String str, boolean z) {
        if (z) {
            return i0.LJFF(str, "_start");
        }
        return i0.LJFF(str, "_end");
    }
}
