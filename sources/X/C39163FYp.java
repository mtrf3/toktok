package X;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import com.bytedance.keva.Keva;
import defpackage.e1;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.FYp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39163FYp {
    public static boolean LJ;
    public static volatile Boolean LJI;
    public static boolean LJII;
    public static boolean LJIIIIZZ;
    public static final C39163FYp LIZ = new C39163FYp();
    public static final boolean LIZIZ = e1.LIZ(31744, "restore_mock_android_version", true, false);
    public static String LIZJ = "";
    public static long LIZLLL = -1;
    public static final C62822Ol8 LJFF = C221108m2.LIZIZ(C39164FYq.LJLIL);

    public static Keva LJFF() {
        return (Keva) LJFF.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
    
        if (r1.getReason() <= 6) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
    
        if (r3 <= 0) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZIZ(android.content.Context r8) {
        /*
            int r1 = android.os.Build.VERSION.SDK_INT
            r7 = 3
            r0 = 30
            r6 = 0
            if (r1 < r0) goto L36
            boolean r0 = X.C39163FYp.LIZIZ
            if (r0 != 0) goto L36
            android.app.ApplicationExitInfo r1 = LIZLLL(r8)
            if (r1 == 0) goto L1f
            int r0 = r1.getReason()
            if (r0 < r7) goto L1f
            int r1 = r1.getReason()
            r0 = 6
            if (r1 <= r0) goto L20
        L1f:
            r6 = 1
        L20:
            LIZJ(r8)
            LJ(r8)
            X.XIA r0 = X.C78613UtF.LIZJ
            X.2gm r2 = X.C48841JEv.LIZ(r0)
            X.FYm r1 = new X.FYm
            r0 = 0
            r1.<init>(r0)
            X.XKX.LIZLLL(r2, r0, r0, r1, r7)
            return r6
        L36:
            com.bytedance.keva.Keva r1 = LJFF()
            java.lang.String r0 = "low_memory"
            boolean r5 = r1.getBoolean(r0, r6)
            com.bytedance.keva.Keva r3 = LJFF()
            java.lang.String r2 = "exit_by_exception_time"
            r0 = -1
            long r3 = r3.getLong(r2, r0)
            if (r5 != 0) goto L20
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L20
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39163FYp.LIZIZ(android.content.Context):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006c, code lost:
    
        if (r2.intValue() == 6) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0049, code lost:
    
        if (r3 == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZJ(android.content.Context r6) {
        /*
            java.lang.String r0 = X.C39163FYp.LIZJ
            int r0 = r0.length()
            r2 = 0
            r5 = 1
            if (r0 <= 0) goto Ld
            java.lang.String r0 = X.C39163FYp.LIZJ
            return r0
        Ld:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 30
            r4 = 3
            if (r1 < r0) goto L2d
            boolean r0 = X.C39163FYp.LIZIZ
            if (r0 != 0) goto L2d
            android.app.ApplicationExitInfo r0 = LIZLLL(r6)
            if (r0 == 0) goto L28
            int r0 = r0.getReason()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            if (r2 != 0) goto L4e
        L28:
            java.lang.String r0 = "kill_app"
        L2a:
            X.C39163FYp.LIZJ = r0
            return r0
        L2d:
            com.bytedance.keva.Keva r1 = LJFF()
            java.lang.String r0 = "low_memory"
            boolean r3 = r1.getBoolean(r0, r2)
            com.bytedance.keva.Keva r2 = LJFF()
            java.lang.String r1 = "exit_exception"
            r0 = -1
            int r1 = r2.getInt(r1, r0)
            if (r1 == r5) goto L55
            r0 = 2
            if (r1 == r0) goto L6e
            if (r1 == r4) goto L4b
            if (r3 == 0) goto L28
        L4b:
            java.lang.String r0 = "OOM"
            goto L2a
        L4e:
            int r1 = r2.intValue()
            r0 = 4
            if (r1 != r0) goto L58
        L55:
            java.lang.String r0 = "crash"
            goto L2a
        L58:
            int r1 = r2.intValue()
            r0 = 5
            if (r1 != r0) goto L60
            goto L55
        L60:
            int r0 = r2.intValue()
            if (r0 != r4) goto L67
            goto L4b
        L67:
            int r1 = r2.intValue()
            r0 = 6
            if (r1 != r0) goto L28
        L6e:
            java.lang.String r0 = "anr"
            goto L2a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39163FYp.LIZJ(android.content.Context):java.lang.String");
    }

    public static ApplicationExitInfo LIZLLL(Context context) {
        if (context == null) {
            return null;
        }
        try {
            Object LLILL = C16880lQ.LLILL(context, "activity");
            o.LJII(LLILL, "null cannot be cast to non-null type android.app.ActivityManager");
            List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) LLILL).getHistoricalProcessExitReasons(context.getPackageName(), 0, 1);
            o.LJIIIIZZ(historicalProcessExitReasons, "activityManager.getHisto…ontext.packageName, 0, 1)");
            return (ApplicationExitInfo) ORZ.LJLLLL(historicalProcessExitReasons);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static long LJ(Context context) {
        long j = LIZLLL;
        long j2 = 0;
        if (j > 0) {
            return j;
        }
        if (Build.VERSION.SDK_INT >= 30 && !LIZIZ) {
            ApplicationExitInfo LIZLLL2 = LIZLLL(context);
            if (LIZLLL2 != null) {
                j2 = LIZLLL2.getTimestamp();
            }
        } else {
            boolean z = LJFF().getBoolean("low_memory", false);
            long j3 = LJFF().getLong("exit_by_exception_time", 0L);
            if (j3 > 0) {
                j2 = j3;
            } else if (z) {
                j2 = LJFF().getLong("low_memory_time", 0L);
            } else {
                j2 = LJFF().getLong("in_background_time", 0L);
            }
        }
        LIZLLL = j2;
        return j2;
    }

    public final boolean LIZ(Context context) {
        Boolean bool = LJI;
        if (bool == null) {
            synchronized (this) {
                bool = LJI;
                if (bool == null) {
                    bool = Boolean.valueOf(LIZIZ(context));
                    LJI = bool;
                }
            }
        }
        return bool.booleanValue();
    }
}
