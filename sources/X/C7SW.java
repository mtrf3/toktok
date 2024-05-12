package X;

import android.os.SystemClock;
import defpackage.i0;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.7SW, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7SW {
    public static final HashMap<String, Long> LIZ = new HashMap<>();
    public static boolean LIZIZ;

    public static final synchronized void LIZIZ(String str) {
        synchronized (C7SW.class) {
            LIZ.clear();
            LIZIZ = false;
            LIZLLL("detail_session", str);
            LIZLLL("detail_page_init", str);
        }
    }

    public static final synchronized void LIZ(String phaseKey, String pageName) {
        Long l;
        synchronized (C7SW.class) {
            o.LJIIIZ(phaseKey, "phaseKey");
            o.LJIIIZ(pageName, "pageName");
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(phaseKey);
            LIZ2.append(pageName);
            String LIZIZ2 = X1D.LIZIZ(LIZ2);
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("detail_session");
            LIZ3.append(pageName);
            String LIZIZ3 = X1D.LIZIZ(LIZ3);
            HashMap<String, Long> hashMap = LIZ;
            Long remove = hashMap.remove(LIZIZ2);
            if (remove == null) {
                return;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime() - remove.longValue();
            Long l2 = hashMap.get(LIZIZ3);
            if (l2 != null) {
                l = Long.valueOf(SystemClock.elapsedRealtime() - l2.longValue());
            } else {
                l = null;
            }
            if (elapsedRealtime < 10000) {
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("detail_phrase", phaseKey);
                c188727au.LJFF(l, "duration_from_begin");
                c188727au.LJ(elapsedRealtime, "duration");
                c188727au.LJIIIZ("detail_page_name", pageName);
                FMX.LJIIL("detail_performance_metrics", c188727au.LIZ);
            }
            if (o.LJ(phaseKey, "detail_content_render") || o.LJ(phaseKey, "detail_header_render")) {
                if (LIZIZ) {
                    LIZIZ = false;
                    C188727au c188727au2 = new C188727au();
                    c188727au2.LJIIIZ("detail_phrase", "detail_session");
                    c188727au2.LJFF(l, "duration_from_begin");
                    c188727au2.LJFF(l, "duration");
                    c188727au2.LJIIIZ("detail_page_name", pageName);
                    FMX.LJIIL("detail_performance_metrics", c188727au2.LIZ);
                } else {
                    LIZIZ = true;
                }
            }
        }
    }

    public static final void LIZJ(String str, String str2) {
        LIZ.remove(i0.LJFF(str, str2));
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("detail_phrase", str);
        c188727au.LJ(-1L, "duration");
        c188727au.LJIIIZ("detail_page_name", str2);
        FMX.LJIIL("detail_performance_metrics", c188727au.LIZ);
    }

    public static final synchronized void LIZLLL(String str, String str2) {
        synchronized (C7SW.class) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(str);
            LIZ2.append(str2);
            String LIZIZ2 = X1D.LIZIZ(LIZ2);
            HashMap<String, Long> hashMap = LIZ;
            Long l = hashMap.get(LIZIZ2);
            if (l == null || SystemClock.elapsedRealtime() - l.longValue() >= 10000) {
                hashMap.put(LIZIZ2, Long.valueOf(SystemClock.elapsedRealtime()));
            }
        }
    }
}
