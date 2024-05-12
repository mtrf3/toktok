package X;

import Y.ARunnableS25S0200000_6;
import android.os.Handler;
import android.os.HandlerThread;

/* renamed from: X.ERb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36419ERb {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0014, code lost:
    
        if (r2 != null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZ() {
        /*
            r3 = 0
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Exception -> L19
            java.io.FileReader r1 = new java.io.FileReader     // Catch: java.lang.Exception -> L19
            java.lang.String r0 = "/proc/self/cpuset"
            r1.<init>(r0)     // Catch: java.lang.Exception -> L19
            r0 = 50
            r2.<init>(r1, r0)     // Catch: java.lang.Exception -> L19
            java.lang.String r3 = r2.readLine()     // Catch: java.lang.Throwable -> L14
            goto L16
        L14:
            if (r2 == 0) goto L19
        L16:
            r2.close()
        L19:
            r1 = 0
            if (r3 == 0) goto L22
            java.lang.String r0 = "background"
            boolean r1 = ujb.s.LJJJLZIJ(r3, r0, r1)
        L22:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36419ERb.LIZ():boolean");
    }

    public static void LIZIZ() {
        try {
            HandlerThread handlerThread = new HandlerThread("push_cpuset_background");
            handlerThread.start();
            Handler handler = new Handler(handlerThread.getLooper());
            handler.postDelayed(new ARunnableS25S0200000_6(handler, handlerThread, 32), 0L);
        } catch (Throwable unused) {
            E3N.LIZ.storeInt("allowed", 0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x003e, code lost:
    
        if (r3 != null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ() {
        /*
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Exception -> L43
            java.io.FileReader r1 = new java.io.FileReader     // Catch: java.lang.Exception -> L43
            java.lang.String r0 = "/proc/self/status"
            r1.<init>(r0)     // Catch: java.lang.Exception -> L43
            r0 = 50
            r3.<init>(r1, r0)     // Catch: java.lang.Exception -> L43
        Le:
            java.lang.String r2 = r3.readLine()     // Catch: java.lang.Throwable -> L3e
            java.lang.String r0 = "it"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)     // Catch: java.lang.Throwable -> L3e
            int r0 = r2.length()     // Catch: java.lang.Throwable -> L3e
            r1 = 0
            if (r0 != 0) goto L1f
            goto L40
        L1f:
            java.lang.String r0 = "Cpus_allowed:"
            boolean r0 = ujb.o.LJJJLIIL(r2, r0, r1)     // Catch: java.lang.Throwable -> L3e
            if (r0 == 0) goto Le
            r0 = 13
            java.lang.String r1 = r2.substring(r0)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r0 = "this as java.lang.String).substring(startIndex)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)     // Catch: java.lang.Throwable -> L3e
            java.lang.CharSequence r0 = ujb.s.LJZI(r1)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r1 = r0.toString()     // Catch: java.lang.Throwable -> L3e
            r3.close()     // Catch: java.lang.Exception -> L45
            goto L45
        L3e:
            if (r3 == 0) goto L43
        L40:
            r3.close()
        L43:
            java.lang.String r1 = ""
        L45:
            r0 = 16
            X.C17N.LJIIJ(r0)
            int r2 = com.bytedance.mt.protector.impl.string2number.CastIntegerProtector.parseInt(r1, r0)
            com.bytedance.keva.Keva r1 = X.E3N.LIZ
            java.lang.String r0 = "allowed"
            r1.storeInt(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36419ERb.LIZJ():void");
    }
}
