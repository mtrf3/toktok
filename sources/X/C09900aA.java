package X;

import Y.IDRunnableS0S1201000;
import Y.IDRunnableS0S1300000;
import Y.IDRunnableS1S0400000;
import Y.IDRunnableS29S0200000;
import Y.IDRunnableS4S1100000;
import com.bytedance.apm.config.SlardarConfigManagerImpl;
import com.bytedance.apm.internal.ApmDelegate;
import java.io.File;
import java.nio.MappedByteBuffer;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0aA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C09900aA {
    public static boolean LIZ = false;
    public static File LIZIZ = null;
    public static long LIZJ = -1;
    public static boolean LIZLLL;
    public static MappedByteBuffer LJ;
    public static final AtomicLong LJFF = new AtomicLong(0);

    public static void LIZIZ(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(C09970aH.LJFF());
            LIZ2.append("_");
            LIZ2.append(LJFF.getAndAdd(1L));
            jSONObject2.put("_debug_uuid", X1D.LIZIZ(LIZ2));
            jSONObject.put("_debug_self", jSONObject2);
        } catch (Exception unused) {
        }
    }

    public static boolean LIZJ(String str) {
        SlardarConfigManagerImpl slardarConfigManagerImpl;
        ApmDelegate apmDelegate = OIO.LIZ;
        if (!apmDelegate.LJLJL || (slardarConfigManagerImpl = apmDelegate.LJLJJLL) == null) {
            return false;
        }
        return slardarConfigManagerImpl.getServiceSwitch(str);
    }

    public static void LJII(C38459F7n c38459F7n) {
        PP2.LIZIZ.LIZIZ(c38459F7n.LJ, c38459F7n.LIZ, false);
        if (PCE.LJI(Boolean.TRUE, c38459F7n.LIZ, c38459F7n.LJ)) {
            return;
        }
        JSONObject jSONObject = c38459F7n.LJ;
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (jSONObject.isNull("timestamp")) {
            try {
                jSONObject.put("timestamp", System.currentTimeMillis());
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        LIZIZ(jSONObject);
        F9U.LIZ.LIZJ(new IDRunnableS29S0200000(c38459F7n, jSONObject, 26));
        if (!C09970aH.LIZJ) {
            return;
        }
        C64236PIy.LIZ().LIZIZ(new IDRunnableS1S0400000(c38459F7n, LJIIL(c38459F7n.LIZJ, true), LJIIL(c38459F7n.LIZLLL, true), LJIIL(jSONObject, true), 2));
    }

    public static JSONObject LJIILIIL(JSONObject jSONObject) {
        if (LIZ) {
            return C43001GuD.LJIJJLI(jSONObject);
        }
        if (LIZLLL) {
            return LJIILJJIL(jSONObject);
        }
        return LJIILL(jSONObject);
    }

    public static JSONObject LJIILJJIL(JSONObject jSONObject) {
        JSONObject jSONObject2 = null;
        if (jSONObject != null) {
            try {
                Iterator<String> keys = jSONObject.keys();
                if (keys != null) {
                    jSONObject2 = new JSONObject();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        jSONObject2.put(next, jSONObject.opt(next));
                    }
                }
            } catch (Exception unused) {
                return jSONObject;
            }
        }
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        if (jSONObject2.isNull("timestamp")) {
            jSONObject2.put("timestamp", System.currentTimeMillis());
        }
        return jSONObject2;
    }

    public static JSONObject LJIILL(JSONObject jSONObject) {
        if (jSONObject == null) {
            try {
                jSONObject = new JSONObject();
            } catch (Exception unused) {
            }
        }
        if (jSONObject.isNull("timestamp")) {
            jSONObject.put("timestamp", System.currentTimeMillis());
        }
        return jSONObject;
    }

    public static void LJ(String str, JSONObject jSONObject) {
        JSONObject LJIILL;
        PP2.LIZIZ.LIZIZ(jSONObject, str, true);
        if (PCE.LJI(Boolean.FALSE, str, jSONObject)) {
            return;
        }
        if (LIZLLL) {
            LJIILL = LJIILJJIL(jSONObject);
        } else {
            LJIILL = LJIILL(jSONObject);
        }
        LIZIZ(LJIILL);
        F9U.LIZ.LIZJ(new IDRunnableS4S1100000(LJIILL, str, 6));
        if (!C09970aH.LIZJ) {
            return;
        }
        C64236PIy.LIZ().LIZIZ(new IDRunnableS4S1100000(LJIIL(LJIILL, true), str, 7));
    }

    public static JSONObject LJIIL(JSONObject jSONObject, boolean z) {
        if (!LIZ && LIZLLL) {
            return C43001GuD.LJII(jSONObject);
        }
        if (!z) {
            return jSONObject;
        }
        return C43001GuD.LJIJJLI(jSONObject);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0179, code lost:
    
        if (r2.getFreeSpace() < 1073741824) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIILLIIL(java.lang.String r14, java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09900aA.LJIILLIIL(java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJFF(java.lang.String r10, org.json.JSONObject r11, org.json.JSONObject r12) {
        /*
            X.PP2 r1 = X.PP2.LIZIZ
            r0 = 0
            r5 = r10
            r1.LIZIZ(r12, r5, r0)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = X.PCE.LJI(r0, r5, r12)
            if (r0 == 0) goto L10
        Lf:
            return
        L10:
            org.json.JSONObject r10 = LJIILL(r12)
            LIZIZ(r10)
            boolean r0 = X.C09900aA.LIZLLL
            if (r0 == 0) goto L65
            if (r11 != 0) goto L45
        L1d:
            r7 = 0
        L1e:
            X.PCD r4 = new X.PCD
            r6 = 0
            r8 = 0
            r9 = r8
            r4.<init>(r5, r6, r7, r8, r9, r10)
            X.PCE.LIZLLL(r4)
            boolean r0 = X.C09970aH.LIZJ
            if (r0 == 0) goto Lf
            r0 = 1
            org.json.JSONObject r4 = LJIIL(r11, r0)
            org.json.JSONObject r3 = LJIIL(r10, r0)
            X.PIy r2 = X.C64236PIy.LIZ()
            Y.IDRunnableS0S1200000 r1 = new Y.IDRunnableS0S1200000
            r0 = 11
            r1.<init>(r3, r5, r4, r0)
            r2.LIZIZ(r1)
            goto Lf
        L45:
            java.util.Iterator r2 = r11.keys()
            if (r2 != 0) goto L4c
            goto L1d
        L4c:
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch: java.lang.Exception -> L65
            r7.<init>()     // Catch: java.lang.Exception -> L65
        L51:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Exception -> L65
            if (r0 == 0) goto L1e
            java.lang.Object r1 = r2.next()     // Catch: java.lang.Exception -> L65
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L65
            java.lang.Object r0 = r11.opt(r1)     // Catch: java.lang.Exception -> L65
            r7.put(r1, r0)     // Catch: java.lang.Exception -> L65
            goto L51
        L65:
            r7 = r11
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09900aA.LJFF(java.lang.String, org.json.JSONObject, org.json.JSONObject):void");
    }

    public static void LJIIJJI(final String str, final int i, JSONObject jSONObject) {
        JSONObject LJIILL;
        PP2.LIZIZ.LIZIZ(jSONObject, str, false);
        if (PCE.LJI(Boolean.TRUE, str, jSONObject)) {
            return;
        }
        if (LIZLLL) {
            LJIILL = LJIILJJIL(jSONObject);
        } else {
            LJIILL = LJIILL(jSONObject);
        }
        LIZIZ(LJIILL);
        PCE.LJ(str, i, null, null, LJIILL);
        if (!C09970aH.LIZJ) {
            return;
        }
        final JSONObject LJIIL = LJIIL(LJIILL, true);
        C64236PIy.LIZ().LIZIZ(new Runnable() { // from class: X.0a5
            @Override // java.lang.Runnable
            public final void run() {
                boolean LIZ2;
                try {
                    JSONObject LIZ3 = new C64096PDo(str, i, null, null, null, LJIIL).LIZ();
                    if (LIZ3 != null) {
                        C09900aA.LJIILLIIL("monitorStatusRate", LIZ3.toString());
                    }
                } finally {
                    if (LIZ2) {
                    }
                }
            }
        });
    }

    public static void LJI(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        JSONObject LJIILL;
        PP2.LIZIZ.LIZIZ(jSONObject3, str, false);
        if (PCE.LJI(Boolean.TRUE, str, jSONObject3)) {
            return;
        }
        if (LIZLLL) {
            LJIILL = LJIILJJIL(jSONObject3);
        } else {
            LJIILL = LJIILL(jSONObject3);
        }
        LIZIZ(LJIILL);
        PCE.LJ(str, 0, LJIIL(jSONObject, true), LJIIL(jSONObject2, true), LJIILL);
        if (!C09970aH.LIZJ) {
            return;
        }
        JSONObject LJIIL = LJIIL(jSONObject, true);
        JSONObject LJIIL2 = LJIIL(jSONObject2, true);
        C64236PIy.LIZ().LIZIZ(new IDRunnableS0S1300000(LJIIL(LJIILL, true), LJIIL, str, LJIIL2, 4));
    }

    public static void LJIIIZ(String str, int i, JSONObject jSONObject, JSONObject jSONObject2) {
        PP2.LIZIZ.LIZIZ(jSONObject2, str, false);
        if (PCE.LJI(Boolean.TRUE, str, jSONObject2)) {
            return;
        }
        JSONObject LJIILIIL = LJIILIIL(jSONObject2);
        LIZIZ(LJIILIIL);
        PCE.LIZLLL(new PCD(str, i, LJIIL(jSONObject, true), null, null, LJIIL(LJIILIIL, false)));
        if (!C09970aH.LIZJ) {
            return;
        }
        C64236PIy.LIZ().LIZIZ(new IDRunnableS0S1201000(str, i, LJIIL(jSONObject, true), LJIIL(jSONObject2, true), 3));
    }

    public static void LJIIZILJ(long j, String str, String str2, String str3) {
        EGD.LIZ.LJIIIIZZ(j, str, str2, str3, null, null);
    }

    public static void LJIIJ(final String str, final int i, final JSONObject jSONObject, final JSONObject jSONObject2, JSONObject jSONObject3) {
        PP2.LIZIZ.LIZIZ(jSONObject3, str, false);
        if (PCE.LJI(Boolean.TRUE, str, jSONObject3)) {
            return;
        }
        final JSONObject LJIILIIL = LJIILIIL(jSONObject3);
        LIZIZ(LJIILIIL);
        F9U.LIZ.LIZJ(new Runnable() { // from class: X.0a3
            @Override // java.lang.Runnable
            public final void run() {
                boolean LIZ2;
                try {
                    PCE.LJ(str, i, C09900aA.LJIIL(jSONObject, true), C09900aA.LJIIL(jSONObject2, true), C09900aA.LJIIL(LJIILIIL, false));
                } finally {
                    if (LIZ2) {
                    }
                }
            }
        });
        if (!C09970aH.LIZJ) {
            return;
        }
        final JSONObject LJIIL = LJIIL(jSONObject, true);
        final JSONObject LJIIL2 = LJIIL(jSONObject2, true);
        final JSONObject LJIIL3 = LJIIL(LJIILIIL, true);
        C64236PIy.LIZ().LIZIZ(new Runnable() { // from class: X.0a4
            @Override // java.lang.Runnable
            public final void run() {
                boolean LIZ2;
                try {
                    JSONObject LIZ3 = new C64096PDo(str, i, null, LJIIL, LJIIL2, LJIIL3).LIZ();
                    if (LIZ3 != null) {
                        C09900aA.LJIILLIIL("monitorStatusAndEvent", LIZ3.toString());
                    }
                } finally {
                    if (LIZ2) {
                    }
                }
            }
        });
    }

    public static void LIZ(String str, long j, long j2, String str2, InterfaceC11190cF interfaceC11190cF, InterfaceC11180cE interfaceC11180cE) {
        ApmDelegate apmDelegate = OIO.LIZ;
        if (apmDelegate.LJLLJ) {
            F9U.LIZ.LJII(new RunnableC38973FRh(str, j, j2, str2, interfaceC11190cF, interfaceC11180cE));
        } else if (interfaceC11180cE != null) {
            interfaceC11180cE.LIZ(C78540Us4.LJII(false, 9, null, null), false);
        }
        if (apmDelegate.LJLLL) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("alog_scene: ");
            LIZ2.append(str2);
            C78983UzD.LJIILL(X1D.LIZIZ(LIZ2));
        }
    }

    public static void LIZLLL(final long j, final long j2, final String str, final String str2, final String str3, final int i, JSONObject jSONObject) {
        if (C64471PRz.LIZ) {
            ((LinkedBlockingDeque) C64471PRz.LIZLLL).add(new PS0(j, j2, str, str2, str3, i, jSONObject, null, null));
        } else {
            final JSONObject LJIILIIL = LJIILIIL(jSONObject);
            F9U.LIZ.LIZJ(new Runnable() { // from class: X.0a8
                @Override // java.lang.Runnable
                public final void run() {
                    boolean LIZ2;
                    try {
                        C64094PDm.LIZ.LIZLLL(new C64062PCg("api_error", j, j2, str, str2, str3, i, C09900aA.LJIIL(LJIILIIL, false)));
                    } finally {
                        if (LIZ2) {
                        }
                    }
                }
            });
            if (!C09970aH.LIZJ) {
                return;
            }
            C64236PIy.LIZ().LIZIZ(new Runnable() { // from class: X.0a9
                public final void LIZ() {
                    JSONObject LIZ2 = new C64062PCg("api_error", j, j2, str, str2, str3, i, LJIILIIL).LIZ();
                    if (LIZ2 != null) {
                        C09900aA.LJIILLIIL("monitorApiError", LIZ2.toString());
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean LIZ2;
                    try {
                        LIZ();
                    } finally {
                        if (LIZ2) {
                        }
                    }
                }
            });
        }
    }

    public static void LJIIIIZZ(final long j, final long j2, final String str, final String str2, final String str3, final int i, JSONObject jSONObject) {
        if (C64471PRz.LIZ) {
            ((LinkedBlockingDeque) C64471PRz.LIZIZ).add(new PS0(j, j2, str, str2, str3, i, jSONObject, null, null));
        } else {
            final JSONObject LJIILIIL = LJIILIIL(jSONObject);
            F9U.LIZ.LIZJ(new Runnable() { // from class: X.0a6
                @Override // java.lang.Runnable
                public final void run() {
                    boolean LIZ2;
                    try {
                        C64094PDm.LIZ.LIZLLL(new C64062PCg("api_all", j, j2, str, str2, str3, i, C09900aA.LJIIL(LJIILIIL, false)));
                    } finally {
                        if (LIZ2) {
                        }
                    }
                }
            });
            if (!C09970aH.LIZJ) {
                return;
            }
            C64236PIy.LIZ().LIZIZ(new Runnable() { // from class: X.0a7
                public final void LIZ() {
                    JSONObject LIZ2 = new C64062PCg("api_all", j, j2, str, str2, str3, i, LJIILIIL).LIZ();
                    if (LIZ2 != null) {
                        C09900aA.LJIILLIIL("monitorSLA", LIZ2.toString());
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean LIZ2;
                    try {
                        LIZ();
                    } finally {
                        if (LIZ2) {
                        }
                    }
                }
            });
        }
    }
}
