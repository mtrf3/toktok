package X;

import Y.AgS45S0000000_6;
import android.app.Application;
import android.os.Handler;
import com.bytedance.ies.abmock.debugtool.mock.ConfigMock;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public final class FH5 {
    public static volatile FH5 LJII;
    public Application LIZ;
    public volatile C43659HBn LIZIZ;
    public volatile C43659HBn LIZJ;
    public volatile Boolean LIZLLL;
    public C38704FGy LJFF;
    public final java.util.Map<String, List<F67>> LJ = new HashMap();
    public final FI6 LJI = new FI6();

    public static FH5 LIZIZ() {
        if (LJII == null) {
            synchronized (FH5.class) {
                if (LJII == null) {
                    LJII = new FH5();
                }
            }
        }
        return LJII;
    }

    public final boolean LIZLLL() {
        if (this.LIZLLL == null) {
            this.LIZLLL = Boolean.valueOf(this.LIZIZ.LIZJ());
        }
        return this.LIZLLL.booleanValue();
    }

    public final void LJII() {
        if (this.LIZIZ != null) {
            this.LIZIZ.getClass();
        }
    }

    public static void LIZ(String str) {
        FH1.LJI.getClass();
        E7F LJI = FH1.LJI();
        LJI.getClass();
        List<String> LIZIZ = E7F.LIZIZ(str);
        if (LIZIZ != null) {
            LJI.LIZJ.LIZ(LIZIZ);
        }
        FH1.LIZLLL();
        FH1.LIZLLL();
    }

    public final void LJ(java.util.Set<String> set) {
        if (set == null || set.isEmpty()) {
            return;
        }
        HashMap hashMap = new HashMap();
        synchronized (this.LJ) {
            for (Map.Entry entry : ((HashMap) this.LJ).entrySet()) {
                hashMap.put(entry.getKey(), new ArrayList((Collection) entry.getValue()));
            }
        }
        new Handler(C16880lQ.LLJJJJ()).post(new F65(0, set, hashMap));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x009b. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:320:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0532 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0522 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.String[], java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(X.C36187EId r19) {
        /*
            Method dump skipped, instructions count: 2414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FH5.LJI(X.EId):void");
    }

    public final void LIZJ(Application application, FGZ fgz) {
        long nanoTime = System.nanoTime();
        this.LIZ = application;
        this.LIZIZ = fgz;
        C38719FHn c38719FHn = C38719FHn.LIZIZ;
        c38719FHn.LIZ = new FI4(this);
        FHD.LIZLLL().getClass();
        FHC LIZIZ = FHC.LIZIZ();
        ConfigMock LIZLLL = LIZIZ().LIZIZ.LIZLLL();
        LIZIZ.LIZLLL = fgz;
        LIZIZ.LIZJ = LIZLLL;
        C10K.LJII(2000L).LIZLLL(new AgS45S0000000_6(3));
        if (LIZIZ().LIZLLL()) {
            LIZIZ().LIZIZ.LIZLLL().init(application);
        }
        C38718FHm c38718FHm = new C38718FHm();
        c38718FHm.LIZIZ = "config_center_init";
        c38718FHm.LIZ("cost", String.valueOf(System.nanoTime() - nanoTime));
        c38719FHn.onEvent(c38718FHm);
        C38731FHz c38731FHz = C38731FHz.LIZIZ;
        FI6 fi6 = this.LJI;
        InterfaceC38722FHq interfaceC38722FHq = c38731FHz.LIZ;
        if (interfaceC38722FHq != null) {
            interfaceC38722FHq.LJII(fi6);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        if (r1 != null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(java.lang.Class r5, X.F67 r6) {
        /*
            r4 = this;
            X.FHD r0 = X.FHD.LIZLLL()     // Catch: java.lang.Exception -> L43
            r0.getClass()     // Catch: java.lang.Exception -> L43
            java.lang.String r3 = X.FHD.LJFF(r5)     // Catch: java.lang.Exception -> L43
            if (r3 != 0) goto Le
            goto L43
        Le:
            java.util.Map<java.lang.String, java.util.List<X.F67>> r2 = r4.LJ
            monitor-enter(r2)
            java.util.Map<java.lang.String, java.util.List<X.F67>> r0 = r4.LJ     // Catch: java.lang.Throwable -> L40
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch: java.lang.Throwable -> L40
            boolean r0 = r0.containsKey(r3)     // Catch: java.lang.Throwable -> L40
            if (r0 == 0) goto L32
            java.util.Map<java.lang.String, java.util.List<X.F67>> r0 = r4.LJ     // Catch: java.lang.Throwable -> L40
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch: java.lang.Throwable -> L40
            java.lang.Object r1 = r0.get(r3)     // Catch: java.lang.Throwable -> L40
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L40
            if (r1 == 0) goto L30
        L27:
            boolean r0 = r1.contains(r6)     // Catch: java.lang.Throwable -> L40
            if (r0 != 0) goto L30
            r1.add(r6)     // Catch: java.lang.Throwable -> L40
        L30:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L40
            goto L3f
        L32:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L40
            r1.<init>()     // Catch: java.lang.Throwable -> L40
            java.util.Map<java.lang.String, java.util.List<X.F67>> r0 = r4.LJ     // Catch: java.lang.Throwable -> L40
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch: java.lang.Throwable -> L40
            r0.put(r3, r1)     // Catch: java.lang.Throwable -> L40
            goto L27
        L3f:
            return
        L40:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L40
            throw r0
        L43:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FH5.LJFF(java.lang.Class, X.F67):void");
    }
}
