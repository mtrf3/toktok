package X;

import Y.ARunnableS47S0100000_11;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class PCE {
    public static boolean LIZ;
    public static volatile C1FC LIZIZ;
    public static volatile boolean LIZJ;
    public static final C64049PBt<InterfaceC64036PBg> LIZLLL;
    public static boolean LJ;
    public static PCG LJFF;

    public static synchronized void LJIIIIZZ(C1FC c1fc) {
        synchronized (PCE.class) {
            LIZ(c1fc);
        }
    }

    static {
        C64049PBt<InterfaceC64036PBg> c64049PBt = new C64049PBt<>(1000);
        LIZLLL = c64049PBt;
        LJ = true;
        c64049PBt.LIZJ = new C64050PBu();
    }

    public static synchronized void LIZIZ() {
        PCF pcf;
        synchronized (PCE.class) {
            if (!LIZJ && (pcf = (PCF) PGH.LIZ(PCF.class)) != null) {
                LJIIIIZZ(pcf.getConfig());
                LIZJ = true;
            }
        }
    }

    public static void LIZ(C1FC c1fc) {
        if (c1fc != null) {
            if (((Boolean) C34162Daw.LIZIZ.getValue()).booleanValue()) {
                F9U.LIZ.LIZJ(new ARunnableS47S0100000_11(c1fc, 2));
            }
            C61576OEq.LJLIL = true;
        }
        synchronized (PCE.class) {
            if (c1fc != null) {
                if (LIZIZ != c1fc) {
                    if (C78248UnM.LJIIJ()) {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("updateConfig ");
                        LIZ2.append(c1fc);
                        C64028PAy.LIZ("APM-CommonEvent", X1D.LIZIZ(LIZ2));
                    }
                    LIZIZ = c1fc;
                    while (true) {
                        C64049PBt<InterfaceC64036PBg> c64049PBt = LIZLLL;
                        if (!c64049PBt.LIZ()) {
                            InterfaceC64036PBg LIZIZ2 = c64049PBt.LIZIZ();
                            if (LIZIZ2 instanceof PCD) {
                                LIZLLL((PCD) LIZIZ2);
                            } else if (LIZIZ2 instanceof PCC) {
                                LIZJ((PCC) LIZIZ2);
                            }
                        } else {
                            return;
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0088, code lost:
    
        if (1 == 0) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(X.PCC r7) {
        /*
            boolean r0 = X.C61576OEq.LJLIL
            r3 = 0
            r4 = 1
            if (r0 != 0) goto L42
            X.Ol8 r0 = X.C34162Daw.LIZIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L42
            if (r7 == 0) goto L41
            java.lang.String r0 = r7.LIZ
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L45
            java.lang.String r6 = r7.LIZ
            java.lang.String r0 = "logType"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            java.util.concurrent.atomic.AtomicBoolean r0 = X.PMA.LIZ
            boolean r0 = r0.compareAndSet(r3, r4)
            if (r0 == 0) goto L37
            X.PE0 r5 = X.F9U.LIZ
            X.PM9 r2 = X.PM9.LJLIL
            r0 = 3000(0xbb8, double:1.482E-320)
            r5.LIZLLL(r0, r2)
        L37:
            X.1FC r0 = X.PMA.LIZJ
            if (r0 == 0) goto L45
            boolean r0 = r0.LIZJ(r6)
            if (r0 != 0) goto L45
        L41:
            return
        L42:
            if (r7 != 0) goto L45
            goto L41
        L45:
            X.1FC r0 = X.PCE.LIZIZ
            java.lang.String r2 = "APM-CommonEvent"
            if (r0 != 0) goto L6d
            X.PBt<X.PBg> r0 = X.PCE.LIZLLL
            r0.LIZJ(r7)
            boolean r0 = X.C78248UnM.LJIIJ()
            if (r0 == 0) goto L69
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "Cached CommonLog: "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.C64028PAy.LIZ(r2, r0)
        L69:
            LIZIZ()
            goto L41
        L6d:
            X.PCG r0 = X.PCE.LJFF
            if (r0 == 0) goto L8a
            org.json.JSONObject r0 = r7.LIZIZ
            boolean r0 = X.PDX.LIZ(r0)
            if (r0 == 0) goto L8a
            X.PCG r0 = X.PCE.LJFF
            org.json.JSONObject r1 = r7.LIZIZ
            r0.getClass()
            if (r1 == 0) goto L94
            java.lang.String r0 = "single_point_only"
            r1.put(r0, r4)     // Catch: org.json.JSONException -> L88
            goto L94
        L88:
            if (r4 != 0) goto L94
        L8a:
            X.1FC r1 = X.PCE.LIZIZ
            java.lang.String r0 = r7.LIZ
            boolean r0 = r1.LIZJ(r0)
            if (r0 == 0) goto Lb9
        L94:
            org.json.JSONObject r0 = r7.LIZIZ
            org.json.JSONObject r0 = X.C64055PBz.LJFF(r0)
            r7.LIZIZ = r0
            boolean r0 = X.C78248UnM.LJIIJ()
            if (r0 == 0) goto Lb5
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "Sampled CommonLog:"
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.C64028PAy.LIZ(r2, r0)
        Lb5:
            X.PC2.LIZ(r7)
            goto L41
        Lb9:
            boolean r0 = X.C78248UnM.LJIIJ()
            if (r0 == 0) goto L41
            org.json.JSONObject r0 = r7.LIZIZ
            org.json.JSONObject r0 = X.C64055PBz.LJFF(r0)
            r7.LIZIZ = r0
            java.lang.String r1 = r7.LIZ
            org.json.JSONObject r0 = r7.LIZ()
            X.PBV.LIZ(r0, r1, r3)
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "UnSampled CommonLog:"
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.C64028PAy.LIZ(r2, r0)
            goto L41
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PCE.LIZJ(X.PCC):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0088, code lost:
    
        if (1 == 0) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZLLL(X.PCD r7) {
        /*
            boolean r0 = X.C61576OEq.LJLIL
            r3 = 0
            r4 = 1
            if (r0 != 0) goto L42
            X.Ol8 r0 = X.C34162Daw.LIZIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L42
            if (r7 == 0) goto L41
            java.lang.String r0 = r7.LIZ
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L45
            java.lang.String r6 = r7.LIZ
            java.lang.String r0 = "service"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            java.util.concurrent.atomic.AtomicBoolean r0 = X.PMA.LIZ
            boolean r0 = r0.compareAndSet(r3, r4)
            if (r0 == 0) goto L37
            X.PE0 r5 = X.F9U.LIZ
            X.PM9 r2 = X.PM9.LJLIL
            r0 = 3000(0xbb8, double:1.482E-320)
            r5.LIZLLL(r0, r2)
        L37:
            X.1FC r0 = X.PMA.LIZJ
            if (r0 == 0) goto L45
            boolean r0 = r0.LIZLLL(r6)
            if (r0 != 0) goto L45
        L41:
            return
        L42:
            if (r7 != 0) goto L45
            goto L41
        L45:
            X.1FC r0 = X.PCE.LIZIZ
            java.lang.String r2 = "APM-CommonEvent"
            if (r0 != 0) goto L6d
            X.PBt<X.PBg> r0 = X.PCE.LIZLLL
            r0.LIZJ(r7)
            boolean r0 = X.C78248UnM.LJIIJ()
            if (r0 == 0) goto L69
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "cached CommonEvent:"
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.C64028PAy.LIZ(r2, r0)
        L69:
            LIZIZ()
            goto L41
        L6d:
            X.PCG r0 = X.PCE.LJFF
            if (r0 == 0) goto L8a
            org.json.JSONObject r0 = r7.LJFF
            boolean r0 = X.PDX.LIZ(r0)
            if (r0 == 0) goto L8a
            X.PCG r0 = X.PCE.LJFF
            org.json.JSONObject r1 = r7.LJFF
            r0.getClass()
            if (r1 == 0) goto L94
            java.lang.String r0 = "single_point_only"
            r1.put(r0, r4)     // Catch: org.json.JSONException -> L88
            goto L94
        L88:
            if (r4 != 0) goto L94
        L8a:
            X.1FC r1 = X.PCE.LIZIZ
            java.lang.String r0 = r7.LIZ
            boolean r0 = r1.LIZLLL(r0)
            if (r0 == 0) goto Lb4
        L94:
            r7.LIZLLL()
            X.PC2.LIZ(r7)
            boolean r0 = X.C78248UnM.LJIIJ()
            if (r0 == 0) goto L41
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "Sampled CommonEvent:"
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.C64028PAy.LIZ(r2, r0)
            goto L41
        Lb4:
            boolean r0 = X.C78248UnM.LJIIJ()
            if (r0 == 0) goto Lcd
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "UnSampled CommonEvent:"
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.C64028PAy.LIZ(r2, r0)
        Lcd:
            boolean r0 = X.C78248UnM.LJIIJ()
            if (r0 == 0) goto L41
            r7.LIZLLL()
            java.lang.String r1 = "service_monitor"
            org.json.JSONObject r0 = r7.LIZ()
            X.PBV.LIZ(r0, r1, r3)
            goto L41
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PCE.LIZLLL(X.PCD):void");
    }

    public static void LJFF(PC4 pc4) {
        if (C78248UnM.LJIIJ()) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("trace_data:");
            LIZ2.append(pc4.LIZ());
            C64028PAy.LIZ("APM-CommonEvent", X1D.LIZIZ(LIZ2));
        }
        PC2.LIZ(pc4);
    }

    public static synchronized void LJII(PDX pdx) {
        synchronized (PCE.class) {
            LJFF = pdx;
        }
    }

    public static boolean LJI(Boolean bool, String str, JSONObject jSONObject) {
        if (!LIZ || LIZIZ == null || TextUtils.isEmpty(str)) {
            return false;
        }
        if (LJFF != null && PDX.LIZ(jSONObject)) {
            LJFF.getClass();
            if (jSONObject != null) {
                try {
                    jSONObject.put("single_point_only", 1);
                } catch (JSONException unused) {
                }
            }
            return false;
        }
        if (bool.booleanValue()) {
            if (LIZIZ.LIZLLL(str)) {
                return false;
            }
        } else if (LIZIZ.LIZJ(str)) {
            return false;
        }
        return true;
    }

    public static void LJ(String str, int i, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        LIZLLL(new PCD(str, i, null, jSONObject, jSONObject2, jSONObject3));
    }
}
