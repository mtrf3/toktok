package X;

import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes15.dex */
public final class VSR {
    public static int LIZJ;
    public static PthreadThread LJ;
    public static VSQ LJFF;
    public static long LIZ = -1;
    public static long LIZIZ = -1;
    public static final AtomicBoolean LIZLLL = new AtomicBoolean(true);

    /* JADX WARN: Code restructure failed: missing block: B:18:0x007a, code lost:
    
        if (r1 > r11.frequencyLimit) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(long r9, com.ss.android.ugc.network.observer.bean.DetectorParam r11, X.HHM r12, X.InterfaceC88471Ynr r13, X.InterfaceC88472Yns r14) {
        /*
            java.lang.String r0 = "param"
            kotlin.jvm.internal.o.LJIIJ(r11, r0)
            java.lang.String r0 = "localParam"
            kotlin.jvm.internal.o.LJIIJ(r12, r0)
            java.lang.String r0 = "callback"
            kotlin.jvm.internal.o.LJIIJ(r13, r0)
            java.lang.String r0 = "callback2"
            kotlin.jvm.internal.o.LJIIJ(r14, r0)
            com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread r0 = X.VSR.LJ
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L38
            boolean r0 = r0.isAlive()
            if (r0 == 0) goto L38
        L20:
            X.VSQ r2 = X.VSR.LJFF
            if (r2 == 0) goto L37
            java.util.concurrent.CopyOnWriteArrayList<X.OSZ<X.Ynr<X.VSk, java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.String, java.lang.Object>>, X.UCe>, X.Yns<java.util.HashMap<java.lang.String, java.lang.Object>, X.UCe>>> r1 = r2.LJLILLLLZI
            X.OSZ r0 = new X.OSZ
            r0.<init>(r13, r14)
            r1.add(r0)
            java.util.concurrent.CopyOnWriteArrayList<java.lang.Long> r1 = r2.LJLJI
            java.lang.Long r0 = java.lang.Long.valueOf(r9)
            r1.add(r0)
        L37:
            return
        L38:
            long r7 = java.lang.System.currentTimeMillis()
            long r0 = X.VSR.LIZ
            long r5 = r7 - r0
            int r0 = r11.blackTimeout
            long r0 = (long) r0
            int r4 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r4 <= 0) goto L7c
            long r0 = X.VSR.LIZIZ
            long r5 = r7 - r0
            r0 = 60000(0xea60, float:8.4078E-41)
            long r0 = (long) r0
            int r4 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r4 <= 0) goto L72
            X.VSR.LIZIZ = r7
            X.VSR.LIZJ = r2
            java.util.concurrent.atomic.AtomicBoolean r0 = X.VSR.LIZLLL
            r0.set(r2)
        L5c:
            X.VSQ r0 = new X.VSQ
            r0.<init>(r11, r12)
            X.VSR.LJFF = r0
            com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread r2 = new com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread
            X.VSQ r1 = X.VSR.LJFF
            java.lang.String r0 = "NetworkStateManager"
            r2.<init>(r1, r0)
            X.VSR.LJ = r2
            r2.start()
            goto L20
        L72:
            int r0 = X.VSR.LIZJ
            int r1 = r0 + 1
            X.VSR.LIZJ = r1
            int r0 = r11.frequencyLimit
            if (r1 <= r0) goto L5c
        L7c:
            X.VSk r1 = X.EnumC79770VSk.UNKNOWN_STATUS
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r13.invoke(r1, r0)
            java.util.concurrent.atomic.AtomicBoolean r0 = X.VSR.LIZLLL
            boolean r0 = r0.compareAndSet(r2, r3)
            if (r0 == 0) goto Lb8
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            int r0 = r1.ordinal()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "network_status"
            r3.put(r0, r1)
            java.lang.String r0 = "1"
            java.util.HashMap r1 = X.VSU.LIZ(r0, r12)
            java.lang.String r0 = "extra_info"
            r2.put(r0, r1)
            java.lang.String r0 = "network_status_detail"
            r3.put(r0, r2)
            r14.invoke(r3)
        Lb8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.VSR.LIZ(long, com.ss.android.ugc.network.observer.bean.DetectorParam, X.HHM, X.Ynr, X.Yns):void");
    }
}
