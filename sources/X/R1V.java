package X;

import android.os.SystemClock;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.websocket.api.ab.WsMonitorConfigExp;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.AqS3S1000100_11;
import kotlin.jvm.internal.AqS46S0001000_11;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class R1V {
    public static long LIZJ;
    public static long LIZLLL;
    public static long LJ;
    public static long LJFF;
    public static long LJI;
    public static long LJII;
    public static volatile ScheduledFuture<?> LJIIIZ;
    public static volatile boolean LJIIJ;
    public static long LJIIL;
    public static long LJIILIIL;
    public static boolean LJIILJJIL;
    public static final R1V LIZ = new R1V();
    public static boolean LIZIZ = C84763XOl.LJIIJJI;
    public static int LJIIIIZZ = 1;
    public static final CopyOnWriteArrayList<Integer> LJIIJJI = new CopyOnWriteArrayList<>();
    public static final C62822Ol8 LJIILL = C221108m2.LIZIZ(C68873R1h.LJLIL);
    public static final C62822Ol8 LJIILLIIL = C221108m2.LIZIZ(C46544IOm.LJLIL);

    public final synchronized void LIZLLL() {
        if (WsMonitorConfigExp.LJFF() && !LJIIJ) {
            C221018lt.LJFF("WsOnlineRateMonitor", "[init]");
            if (LJII == 0) {
                LJII = FKB.LJ;
            }
            if (!LJIIJ) {
                C221018lt.LJFF("WsOnlineRateMonitor", "[registerObserver]");
                C84763XOl.LJI().LJJJJZI(C68867R1b.LJLIL);
            }
            LJFF(0, QX1.LJLIL);
            LJIILIIL(System.currentTimeMillis(), "record_date");
            LJI();
            MS5.LJI(new AqS46S0001000_11(LJIIIIZZ, 3));
            LJIIJ = true;
        }
    }

    public static Keva LIZIZ() {
        Object value = LJIILL.getValue();
        o.LJIIIIZZ(value, "<get-keva>(...)");
        return (Keva) value;
    }

    public static HashMap LIZJ() {
        return (HashMap) LJIILLIIL.getValue();
    }

    public static boolean LJ() {
        int i = LJIIIIZZ;
        if (i == 103 || i == 100) {
            return true;
        }
        return false;
    }

    public static void LJI() {
        if (LJIIIZ != null) {
            return;
        }
        boolean z = LIZIZ;
        RunnableC68869R1d runnableC68869R1d = RunnableC68869R1d.LJLIL;
        if (z) {
            if (WsMonitorConfigExp.LIZLLL()) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("[startRecordLoop], isAppBackground=");
                LIZ2.append(LIZIZ);
                C221018lt.LJFF("WsOnlineRateMonitor", X1D.LIZIZ(LIZ2));
                LJIIIZ = C38995FSd.LJ().scheduleAtFixedRate(runnableC68869R1d, 60L, ((Number) WsMonitorConfigExp.LJI.getValue()).longValue(), TimeUnit.SECONDS);
                return;
            }
        } else if (WsMonitorConfigExp.LJ()) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("[startRecordLoop], isAppBackground=");
            LIZ3.append(LIZIZ);
            C221018lt.LJFF("WsOnlineRateMonitor", X1D.LIZIZ(LIZ3));
            LJIIIZ = C38995FSd.LJ().scheduleAtFixedRate(runnableC68869R1d, 60L, ((Number) WsMonitorConfigExp.LJI.getValue()).longValue(), TimeUnit.SECONDS);
            return;
        }
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("[startRecordLoop], settings is closed, isAppBackground=");
        HH1.LIZIZ(LIZ4, LIZIZ, LIZ4, "WsOnlineRateMonitor");
    }

    public static void LJIIIIZZ() {
        ScheduledFuture<?> scheduledFuture = LJIIIZ;
        if (scheduledFuture != null) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("[stopRecordLoop], isAppBackground=");
            LIZ2.append(LIZIZ);
            C221018lt.LJFF("WsOnlineRateMonitor", X1D.LIZIZ(LIZ2));
            scheduledFuture.cancel(true);
            LJIIIZ = null;
        }
    }

    public static void LJIIIZ(int i) {
        HashMap hashMap;
        long j;
        if (!WsMonitorConfigExp.LIZIZ()) {
            return;
        }
        List list = (List) WsMonitorConfigExp.LJIIIZ.getValue();
        if ((list != null && list.contains(Integer.valueOf(i))) || (hashMap = (HashMap) LIZJ().get(Integer.valueOf(i))) == null) {
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("[stopTracking], scene = ");
        LIZ2.append(C68871R1f.LIZIZ(i));
        C221018lt.LJFF("WsOnlineRateMonitor", X1D.LIZIZ(LIZ2));
        long uptimeMillis = SystemClock.uptimeMillis();
        if (hashMap.containsKey("scene_start_event")) {
            LJIIL(i, uptimeMillis);
        } else {
            int i2 = LJIIIIZZ;
            switch (i2) {
                case 100:
                    j = LIZJ;
                    break;
                case 101:
                    j = LJ;
                    break;
                case 102:
                    j = LJIIL;
                    break;
                case 103:
                    j = LIZLLL;
                    break;
                case 104:
                    j = LJFF;
                    break;
                case 105:
                    j = LJIILIIL;
                    break;
            }
            if (j != 0) {
                LJIIJJI(i, uptimeMillis, j, C68871R1f.LIZ(i2));
            }
        }
        Long l = (Long) hashMap.get("scene_start_time");
        if (l == null) {
            l = 0L;
        }
        hashMap.put("scene_total_time", Long.valueOf(uptimeMillis - l.longValue()));
        LJFF(i, new AqS167S0100000_1(hashMap, (HashMap<String, Long>) 442));
        LIZJ().remove(Integer.valueOf(i));
    }

    public final void LJII(int i) {
        if (!WsMonitorConfigExp.LIZIZ()) {
            return;
        }
        List list = (List) WsMonitorConfigExp.LJIIIZ.getValue();
        if (list != null && list.contains(Integer.valueOf(i))) {
            return;
        }
        if (!LJIIJ) {
            LIZLLL();
        }
        if (LIZJ().containsKey(Integer.valueOf(i))) {
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("[startTracking], scene = ");
        LIZ2.append(C68871R1f.LIZIZ(i));
        C221018lt.LJFF("WsOnlineRateMonitor", X1D.LIZIZ(LIZ2));
        LIZJ().put(Integer.valueOf(i), new HashMap());
        HashMap hashMap = (HashMap) LIZJ().get(Integer.valueOf(i));
        if (hashMap != null) {
            hashMap.put("scene_start_time", Long.valueOf(SystemClock.uptimeMillis()));
        }
        HashMap hashMap2 = (HashMap) LIZJ().get(Integer.valueOf(i));
        if (hashMap2 != null) {
            hashMap2.put("scene_start_event", Long.valueOf(LJIIIIZZ));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0107, code lost:
    
        if (LIZIZ().getInt("if_once_connected", 0) == 1) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJFF(int r50, X.InterfaceC88472Yns r51) {
        /*
            Method dump skipped, instructions count: 501
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.R1V.LJFF(int, X.Yns):void");
    }

    public static void LJIIL(int i, long j) {
        Integer num;
        HashMap hashMap = (HashMap) LIZJ().get(Integer.valueOf(i));
        if (hashMap != null) {
            Long l = (Long) hashMap.get("scene_start_event");
            if (l != null) {
                num = Integer.valueOf((int) l.longValue());
            } else {
                num = null;
            }
            Long l2 = (Long) hashMap.get("scene_start_time");
            if (num != null && l2 != null) {
                long longValue = j - l2.longValue();
                String LIZ2 = C68871R1f.LIZ(num.intValue());
                hashMap.put(LIZ2, Long.valueOf(longValue));
                hashMap.remove("scene_start_event");
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("[storeFirstDurationForSingleScene], scene = ");
                LIZ3.append(C68871R1f.LIZIZ(i));
                LIZ3.append(", eventName = ");
                LIZ3.append(LIZ2);
                LIZ3.append(", currentTime = ");
                LIZ3.append(j);
                LIZ3.append(", startTime = ");
                LIZ3.append(l2);
                LIZ3.append(", duration = ");
                LIZ3.append(longValue);
                C221018lt.LJFF("WsOnlineRateMonitor", X1D.LIZIZ(LIZ3));
            }
        }
    }

    public static void LJIILIIL(long j, String str) {
        MS5.LJI(new AqS3S1000100_11(str, j, 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0030, code lost:
    
        if (r0 == true) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIJ(long r5, long r7, java.lang.String r9) {
        /*
            java.util.HashMap r0 = LIZJ()
            java.util.Set r1 = r0.keySet()
            java.lang.String r0 = "sceneMap.keys"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.util.Iterator r3 = r1.iterator()
        L11:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L4e
            java.lang.Object r2 = r3.next()
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.util.HashMap r0 = LIZJ()
            java.lang.Object r1 = r0.get(r2)
            java.util.HashMap r1 = (java.util.HashMap) r1
            if (r1 == 0) goto L4c
            java.lang.String r0 = "scene_start_event"
            boolean r0 = r1.containsKey(r0)
            r1 = 1
            if (r0 != r1) goto L4c
        L32:
            java.lang.String r0 = "it"
            if (r1 == 0) goto L41
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
            int r0 = r2.intValue()
            LJIIL(r0, r5)
            goto L11
        L41:
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
            int r4 = r2.intValue()
            LJIIJJI(r4, r5, r7, r9)
            goto L11
        L4c:
            r1 = 0
            goto L32
        L4e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.R1V.LJIIJ(long, long, java.lang.String):void");
    }

    public static void LJIIJJI(int i, long j, long j2, String str) {
        HashMap hashMap = (HashMap) LIZJ().get(Integer.valueOf(i));
        if (hashMap != null) {
            long j3 = j - j2;
            Long l = (Long) hashMap.get(str);
            if (l == null) {
                l = 0L;
            }
            hashMap.put(str, Long.valueOf(l.longValue() + j3));
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("[storeDurationForSingleScene], scene = ");
            LIZ2.append(C68871R1f.LIZIZ(i));
            LIZ2.append(", eventName = ");
            LIZ2.append(str);
            LIZ2.append(", currentTime = ");
            LIZ2.append(j);
            C0MT.LIZLLL(LIZ2, ", startTime = ", j2, ", duration = ");
            LIZ2.append(j3);
            C221018lt.LJFF("WsOnlineRateMonitor", X1D.LIZIZ(LIZ2));
        }
    }

    public static final void LIZ(int i, long j, long j2, long j3, long j4, long j5, long j6, int i2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(WM7.SCENE_SERVICE, i);
        jSONObject.put("error_status_code", i2);
        if (i == 0) {
            jSONObject.put("if_once_connected", LIZIZ().getInt("if_once_connected", 0));
            String string = LIZIZ().getString("extra_info", "");
            o.LJIIIIZZ(string, "keva.getString(WsMonitorConstants.EXTRA_INFO, \"\")");
            String LJJJJZ = ujb.o.LJJJJZ(string, " ", "", false);
            if (LJJJJZ.length() <= 30) {
                jSONObject.put("extra_info", LJJJJZ);
            } else {
                String substring = LJJJJZ.substring(0, 30);
                o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                jSONObject.put("extra_info", substring);
            }
        }
        jSONObject.put("foreground_online_time", j);
        jSONObject.put("foreground_offline_time", j2);
        jSONObject.put("background_online_time", j3);
        jSONObject.put("background_offline_time", j4);
        jSONObject.put("prepare_time", j5);
        jSONObject.put("total_time", j6);
        FMX.LJIILJJIL("ws_error_msg", jSONObject);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("[checkIfDataValid], report fail, scene = ");
        LIZ2.append(C68871R1f.LIZIZ(i));
        LIZ2.append(", errorCode = ");
        LIZ2.append(i2);
        LIZ2.append(", reportJson = ");
        LIZ2.append(jSONObject);
        C221018lt.LJFF("WsOnlineRateMonitor", X1D.LIZIZ(LIZ2));
    }
}
