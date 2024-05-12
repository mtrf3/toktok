package X;

import Y.ARunnableS18S0000000_11;
import android.os.Handler;
import android.text.TextUtils;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.QMv, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66885QMv implements InterfaceC66884QMu {
    public static int LIZ;
    public static Handler LIZJ;
    public static InterfaceC217858gn LIZLLL;
    public static boolean LJII;
    public static final C66885QMv LJIIIIZZ = new C66885QMv();
    public static JSONObject LIZIZ = C66888QMy.LIZ;
    public static final List<InterfaceC66884QMu> LJ = new LinkedList();
    public static final List<InterfaceC66884QMu> LJFF = new LinkedList();
    public static final ARunnableS18S0000000_11 LJI = new ARunnableS18S0000000_11(37);

    public static void LIZIZ() {
        QN1 qn1 = QN0.LIZ;
        List<InterfaceC66884QMu> list = LJ;
        synchronized (list) {
            ((LinkedList) list).add(qn1);
        }
    }

    public static String LIZLLL(String str) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("");
        LIZ2.append("host");
        return LIZJ(str, X1D.LIZIZ(LIZ2));
    }

    public static JSONObject LJ(String str) {
        JSONObject optJSONObject = LIZIZ.optJSONObject(str);
        if (optJSONObject == null && (optJSONObject = C66888QMy.LIZ.optJSONObject(str)) == null) {
            optJSONObject = new JSONObject();
        }
        if (LIZLLL != null) {
            OIP.LIZ.LIZ.getClass();
            return optJSONObject;
        }
        o.LJIJI("configProvider");
        throw null;
    }

    public static long LJFF(boolean z) {
        if (!z && LIZ < LJ("common").optInt("retry_count", 0) && LJ("common").optLong("retry_interval", 30000L) != 0) {
            LIZ++;
            return LJ("common").optLong("retry_interval", 30000L);
        }
        return Math.max(Math.min(LIZIZ.optLong("available_time") - System.currentTimeMillis(), LJ("common").optLong("period", 30000L)), 30000L);
    }

    public static void LJI(long j) {
        Handler handler = LIZJ;
        if (handler != null) {
            handler.removeCallbacks(LJI);
        }
        Handler handler2 = LIZJ;
        if (handler2 != null) {
            handler2.postDelayed(LJI, j);
        }
    }

    public static void LJII(String str) {
        try {
            LIZIZ = new JSONObject(str);
            LIZIZ.put("available_time", System.currentTimeMillis() + LJ("common").optLong("period", 30000L));
            C66886QMw.LIZIZ.LIZJ(str);
        } catch (JSONException e) {
            if (C61349O5x.LIZ < 3) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }

    public static String LIZJ(String str, String str2) {
        String str3;
        JSONObject optJSONObject;
        JSONObject optJSONObject2 = LJ(str).optJSONObject(str2);
        if (optJSONObject2 != null) {
            if (LIZLLL != null) {
                str3 = optJSONObject2.optString(OIP.LIZ.LIZ.LIZ);
            } else {
                o.LJIJI("configProvider");
                throw null;
            }
        } else {
            str3 = null;
        }
        if (!TextUtils.isEmpty(str3)) {
            return str3;
        }
        JSONObject optJSONObject3 = C66888QMy.LIZ.optJSONObject(str);
        if (optJSONObject3 == null || (optJSONObject = optJSONObject3.optJSONObject(str2)) == null) {
            return null;
        }
        if (LIZLLL != null) {
            return optJSONObject.optString(OIP.LIZ.LIZ.LIZ);
        }
        o.LJIJI("configProvider");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031 A[LOOP:0: B:9:0x002b->B:11:0x0031, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v3, types: [T, java.util.ArrayList] */
    @Override // X.InterfaceC66884QMu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(int r5, long r6, java.lang.String r8) {
        /*
            r4 = this;
            r0 = 200(0xc8, float:2.8E-43)
            r1 = 0
            if (r5 != r0) goto L46
            r3 = 1
            if (r8 == 0) goto Le
            int r0 = r8.length()
            if (r0 != 0) goto L3b
        Le:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "pull settings fail,code:"
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = ",content:"
            r1.append(r0)
            r1.append(r8)
            X.X1D.LIZIZ(r1)
        L25:
            java.util.List<X.QMu> r0 = X.C66885QMv.LJ
            java.util.Iterator r1 = r0.iterator()
        L2b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L48
            java.lang.Object r0 = r1.next()
            X.QMu r0 = (X.InterfaceC66884QMu) r0
            r0.LIZ(r5, r6, r8)
            goto L2b
        L3b:
            java.lang.String r0 = "pull settings success,"
            X.C1JX.LJIIIIZZ(r0, r8)
            LJII(r8)
            X.C66885QMv.LIZ = r1
            goto L25
        L46:
            r3 = 0
            goto Le
        L48:
            X.2mC r2 = new X.2mC
            r2.<init>()
            monitor-enter(r4)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L80
            r1.<init>()     // Catch: java.lang.Throwable -> L80
            java.util.List<X.QMu> r0 = X.C66885QMv.LJFF     // Catch: java.lang.Throwable -> L80
            r1.addAll(r0)     // Catch: java.lang.Throwable -> L80
            r2.element = r1     // Catch: java.lang.Throwable -> L80
            java.util.LinkedList r0 = (java.util.LinkedList) r0     // Catch: java.lang.Throwable -> L80
            r0.clear()     // Catch: java.lang.Throwable -> L80
            monitor-exit(r4)
            T r0 = r2.element
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r1 = r0.iterator()
        L68:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L78
            java.lang.Object r0 = r1.next()
            X.QMu r0 = (X.InterfaceC66884QMu) r0
            r0.LIZ(r5, r6, r8)
            goto L68
        L78:
            long r0 = LJFF(r3)
            LJI(r0)
            return
        L80:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66885QMv.LIZ(int, long, java.lang.String):void");
    }
}
