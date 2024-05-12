package X;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Debug;
import android.os.Process;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;

/* loaded from: classes12.dex */
public final class PJ3 {
    /* JADX WARN: Code restructure failed: missing block: B:37:0x005e, code lost:
    
        if (r0 == 1) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0075 A[Catch: Exception -> 0x00a1, TryCatch #2 {Exception -> 0x00a1, blocks: (B:5:0x0016, B:7:0x0021, B:8:0x0024, B:25:0x006c, B:26:0x006f, B:28:0x0075, B:30:0x007e, B:31:0x0087), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static oy0.a LIZ() {
        /*
            X.Ol8 r0 = X.C52786Kne.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r5 = 0
            r9 = 360(0x168, double:1.78E-321)
            if (r0 == 0) goto L32
            oy0.a r8 = new oy0.a
            r8.<init>()
            X.E8q r2 = new X.E8q     // Catch: java.lang.Exception -> La1
            r1 = 0
            r0 = 15
            r2.<init>(r5, r1, r0)     // Catch: java.lang.Exception -> La1
            r2.LIZ()     // Catch: java.lang.Exception -> La1
            java.lang.Thread.sleep(r9)     // Catch: java.lang.InterruptedException -> L24 java.lang.Exception -> La1
        L24:
            r2.LIZ()     // Catch: java.lang.Exception -> La1
            X.E8r r2 = r2.LJFF     // Catch: java.lang.Exception -> La1
            double r0 = r2.LIZ     // Catch: java.lang.Exception -> La1
            r8.LIZ = r0     // Catch: java.lang.Exception -> La1
            double r0 = r2.LIZIZ     // Catch: java.lang.Exception -> La1
            r8.LIZIZ = r0     // Catch: java.lang.Exception -> La1
            goto La1
        L32:
            oy0.a r8 = new oy0.a
            r8.<init>()
            long r11 = java.lang.System.currentTimeMillis()
            long r2 = X.FQS.LIZ()
            int r0 = X.FQS.LIZJ
            r4 = 1
            if (r0 != 0) goto L5e
            java.io.File r1 = new java.io.File
            java.lang.String r0 = "/proc/stat"
            r1.<init>(r0)
            boolean r0 = r1.exists()
            if (r0 == 0) goto L5a
            boolean r0 = r1.canRead()
            if (r0 == 0) goto L5a
            X.FQS.LIZJ = r4
            goto L60
        L5a:
            r0 = 2
            X.FQS.LIZJ = r0
            goto L61
        L5e:
            if (r0 != r4) goto L61
        L60:
            r5 = 1
        L61:
            r6 = 0
            if (r5 == 0) goto L6a
            long r0 = X.FQS.LJFF()
            goto L6c
        L6a:
            r0 = 0
        L6c:
            java.lang.Thread.sleep(r9)     // Catch: java.lang.InterruptedException -> L6f java.lang.Exception -> La1
        L6f:
            long r9 = X.FQS.LIZ()     // Catch: java.lang.Exception -> La1
            if (r5 == 0) goto L85
            long r4 = X.FQS.LJFF()     // Catch: java.lang.Exception -> La1
            long r4 = r4 - r0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 <= 0) goto L85
            float r1 = (float) r9     // Catch: java.lang.Exception -> La1
            float r0 = (float) r2     // Catch: java.lang.Exception -> La1
            float r1 = r1 - r0
            float r0 = (float) r4     // Catch: java.lang.Exception -> La1
            float r1 = r1 / r0
            double r6 = (double) r1     // Catch: java.lang.Exception -> La1
            goto L87
        L85:
            r6 = 0
        L87:
            double r4 = (double) r9     // Catch: java.lang.Exception -> La1
            double r0 = (double) r2     // Catch: java.lang.Exception -> La1
            double r4 = r4 - r0
            r0 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r4 = r4 * r0
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> La1
            long r2 = r2 - r11
            double r0 = (double) r2     // Catch: java.lang.Exception -> La1
            double r4 = r4 / r0
            long r2 = X.FQS.LIZLLL()     // Catch: java.lang.Exception -> La1
            double r0 = (double) r2     // Catch: java.lang.Exception -> La1
            double r4 = r4 / r0
            r8.LIZ = r6     // Catch: java.lang.Exception -> La1
            r8.LIZIZ = r4     // Catch: java.lang.Exception -> La1
        La1:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PJ3.LIZ():oy0.a");
    }

    public static PJ4 LIZIZ(Context context) {
        PJ4 pj4 = new PJ4();
        try {
            long j = Runtime.getRuntime().totalMemory();
            long freeMemory = Runtime.getRuntime().freeMemory();
            pj4.LIZ = j;
            pj4.LIZIZ = freeMemory;
            pj4.LIZJ = j - freeMemory;
            int myPid = Process.myPid();
            Debug.MemoryInfo memoryInfo = null;
            if (context != null) {
                try {
                    ActivityManager activityManager = (ActivityManager) C16880lQ.LLILL(context, "activity");
                    if (activityManager != null) {
                        memoryInfo = C16880lQ.LLJJL(activityManager, new int[]{myPid})[0];
                    }
                } catch (Exception unused) {
                }
            }
            if (memoryInfo != null) {
                int i = memoryInfo.dalvikPss;
                int i2 = memoryInfo.nativePss;
                int totalPss = memoryInfo.getTotalPss();
                if (Build.VERSION.SDK_INT >= 23) {
                    try {
                        pj4.LJI = CastIntegerProtector.parseInt(memoryInfo.getMemoryStat("summary.graphics")) * 1024;
                        CastIntegerProtector.parseInt(memoryInfo.getMemoryStat("summary.java-heap"));
                        CastIntegerProtector.parseInt(memoryInfo.getMemoryStat("summary.native-heap"));
                        CastIntegerProtector.parseInt(memoryInfo.getMemoryStat("summary.code"));
                        CastIntegerProtector.parseInt(memoryInfo.getMemoryStat("summary.stack"));
                        CastIntegerProtector.parseInt(memoryInfo.getMemoryStat("summary.private-other"));
                        CastIntegerProtector.parseInt(memoryInfo.getMemoryStat("summary.system"));
                        CastIntegerProtector.parseInt(memoryInfo.getMemoryStat("summary.total-pss"));
                        CastIntegerProtector.parseInt(memoryInfo.getMemoryStat("summary.total-swap"));
                    } catch (Exception unused2) {
                    }
                }
                pj4.LIZLLL = i * 1024;
                pj4.LJ = i2 * 1024;
                pj4.LJFF = totalPss * 1024;
                memoryInfo.getTotalSwappablePss();
                memoryInfo.getTotalPrivateDirty();
                memoryInfo.getTotalSharedClean();
            }
            pj4.LJII = FQS.LJI() * 1024;
        } catch (Exception unused3) {
        }
        return pj4;
    }
}
