package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.websocket.api.ab.WsMonitorConfigExp;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS3S1000100_11;
import kotlin.jvm.internal.AqS46S0001000_11;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class R1W {
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
    public static final R1W LIZ = new R1W();
    public static boolean LIZIZ = C84763XOl.LJIIJJI;
    public static R1Y LJIIIIZZ = R1Y.UNKNOWN;
    public static final CopyOnWriteArrayList<Integer> LJIIJJI = new CopyOnWriteArrayList<>();
    public static final C62822Ol8 LJIILL = C221108m2.LIZIZ(C68874R1i.LJLIL);
    public static final C62822Ol8 LJIILLIIL = C221108m2.LIZIZ(C58588Mz2.LJLIL);

    public final synchronized void LIZLLL() {
        if (WsMonitorConfigExp.LJFF() && !LJIIJ) {
            QPY.LIZ("WsOnlineRateMonitor", "[init]");
            if (LJII == 0) {
                LJII = FKB.LJ;
            }
            if (!LJIIJ) {
                QPY.LIZ("WsOnlineRateMonitor", "[registerObserver]");
                C84763XOl.LJI().LJJJJZI(C68868R1c.LJLIL);
            }
            LJFF(EnumC112394b5.ALL, C58619MzX.LJLIL);
            LJIIL(System.currentTimeMillis(), "record_date");
            LJI();
            LJIIJJI(this);
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
        if (LJIIIIZZ == R1Y.BACKGROUND_CONNECTED || LJIIIIZZ == R1Y.FOREGROUND_CONNECTED) {
            return true;
        }
        return false;
    }

    public static void LJI() {
        if (LJIIIZ != null) {
            return;
        }
        boolean z = LIZIZ;
        RunnableC68870R1e runnableC68870R1e = RunnableC68870R1e.LJLIL;
        if (z) {
            if (WsMonitorConfigExp.LIZLLL()) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("[startRecordLoop], isAppBackground = ");
                LIZ2.append(LIZIZ);
                QPY.LIZ("WsOnlineRateMonitor", X1D.LIZIZ(LIZ2));
                LJIIIZ = C38995FSd.LJ().scheduleAtFixedRate(runnableC68870R1e, 60L, ((Number) WsMonitorConfigExp.LJI.getValue()).longValue(), TimeUnit.SECONDS);
                return;
            }
        } else if (WsMonitorConfigExp.LJ()) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("[startRecordLoop], isAppBackground = ");
            LIZ3.append(LIZIZ);
            QPY.LIZ("WsOnlineRateMonitor", X1D.LIZIZ(LIZ3));
            LJIIIZ = C38995FSd.LJ().scheduleAtFixedRate(runnableC68870R1e, 60L, ((Number) WsMonitorConfigExp.LJI.getValue()).longValue(), TimeUnit.SECONDS);
            return;
        }
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("[startRecordLoop], settings is closed, isAppBackground = ");
        LIZ4.append(LIZIZ);
        QPY.LIZ("WsOnlineRateMonitor", X1D.LIZIZ(LIZ4));
    }

    public static void LJII() {
        ScheduledFuture<?> scheduledFuture = LJIIIZ;
        if (scheduledFuture != null) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("[stopRecordLoop], isAppBackground = ");
            LIZ2.append(LIZIZ);
            QPY.LIZ("WsOnlineRateMonitor", X1D.LIZIZ(LIZ2));
            scheduledFuture.cancel(true);
            LJIIIZ = null;
        }
    }

    public static void LJIIJJI(R1W r1w) {
        int value = LJIIIIZZ.getValue();
        r1w.getClass();
        C57139Mbf.LIZ(new AqS46S0001000_11(value, 2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0109, code lost:
    
        if (LIZIZ().getInt("if_once_connected", 0) == 1) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJFF(X.EnumC112394b5 r53, X.InterfaceC88472Yns r54) {
        /*
            Method dump skipped, instructions count: 673
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.R1W.LJFF(X.4b5, X.Yns):void");
    }

    public static void LJIIJ(EnumC112394b5 enumC112394b5, long j) {
        Integer num;
        R1Y r1y;
        HashMap hashMap = (HashMap) LIZJ().get(enumC112394b5);
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
                int intValue = num.intValue();
                R1Y[] values = R1Y.values();
                int length = values.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        r1y = values[i];
                        if (r1y.getValue() == intValue) {
                            break;
                        } else {
                            i++;
                        }
                    } else {
                        r1y = R1Y.UNKNOWN;
                        break;
                    }
                }
                String field = r1y.field();
                hashMap.put(field, Long.valueOf(longValue));
                hashMap.remove("scene_start_event");
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("[storeFirstDurationForSingleScene], scene = ");
                LIZ2.append(enumC112394b5);
                C1DI.LIZIZ(LIZ2, ", eventName = ", field, ", currentTime = ");
                LIZ2.append(j);
                LIZ2.append(", startTime = ");
                LIZ2.append(l2);
                LIZ2.append(", duration = ");
                LIZ2.append(longValue);
                QPY.LIZ("WsOnlineRateMonitor", X1D.LIZIZ(LIZ2));
            }
        }
    }

    public static void LJIIL(long j, String str) {
        C57139Mbf.LIZ(new AqS3S1000100_11(str, j, 0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0030, code lost:
    
        if (r0 == true) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIIIZZ(long r5, long r7, java.lang.String r9) {
        /*
            java.util.HashMap r0 = LIZJ()
            java.util.Set r1 = r0.keySet()
            java.lang.String r0 = "sceneMap.keys"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.util.Iterator r2 = r1.iterator()
        L11:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L47
            java.lang.Object r3 = r2.next()
            X.4b5 r3 = (X.EnumC112394b5) r3
            java.util.HashMap r0 = LIZJ()
            java.lang.Object r1 = r0.get(r3)
            java.util.HashMap r1 = (java.util.HashMap) r1
            if (r1 == 0) goto L45
            java.lang.String r0 = "scene_start_event"
            boolean r0 = r1.containsKey(r0)
            r1 = 1
            if (r0 != r1) goto L45
        L32:
            java.lang.String r0 = "it"
            if (r1 == 0) goto L3d
            kotlin.jvm.internal.o.LJIIIIZZ(r3, r0)
            LJIIJ(r3, r5)
            goto L11
        L3d:
            kotlin.jvm.internal.o.LJIIIIZZ(r3, r0)
            r4 = r9
            LJIIIZ(r3, r4, r5, r7)
            goto L11
        L45:
            r1 = 0
            goto L32
        L47:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.R1W.LJIIIIZZ(long, long, java.lang.String):void");
    }

    public static void LJIIIZ(EnumC112394b5 enumC112394b5, String str, long j, long j2) {
        HashMap hashMap = (HashMap) LIZJ().get(enumC112394b5);
        if (hashMap != null) {
            long j3 = j - j2;
            Long l = (Long) hashMap.get(str);
            if (l == null) {
                l = 0L;
            }
            hashMap.put(str, Long.valueOf(l.longValue() + j3));
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("[storeDurationForSingleScene], scene = ");
            LIZ2.append(enumC112394b5);
            C1DI.LIZIZ(LIZ2, ", eventName = ", str, ", currentTime = ");
            LIZ2.append(j);
            C0MT.LIZLLL(LIZ2, ", startTime = ", j2, ", duration = ");
            LIZ2.append(j3);
            QPY.LIZ("WsOnlineRateMonitor", X1D.LIZIZ(LIZ2));
        }
    }

    public static final void LIZ(EnumC112394b5 enumC112394b5, long j, long j2, long j3, long j4, long j5, long j6, int i) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(WM7.SCENE_SERVICE, enumC112394b5.getValue());
        jSONObject.put("error_status_code", i);
        if (enumC112394b5 == EnumC112394b5.ALL) {
            jSONObject.put("if_once_connected", LIZIZ().getInt("if_once_connected", 0));
            String string = LIZIZ().getString("extra_info", "");
            o.LJIIIIZZ(string, "keva.getString(Field.EXTRA_INFO, \"\")");
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
        LIZ2.append(enumC112394b5);
        LIZ2.append(", errorCode = ");
        LIZ2.append(i);
        LIZ2.append(", reportJson = ");
        LIZ2.append(jSONObject);
        QPY.LIZ("WsOnlineRateMonitor", X1D.LIZIZ(LIZ2));
    }
}
