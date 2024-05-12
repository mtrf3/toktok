package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.69C, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C69C {
    public static volatile JSONObject LIZ;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        if (X.C138515c7.LIZ() == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0022, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0019, code lost:
    
        if (LIZJ() != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0013, code lost:
    
        if (X.C138515c7.LIZ() == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZIZ() {
        /*
            r2 = 1
            org.json.JSONObject r1 = LIZ()     // Catch: java.lang.Exception -> L15
            if (r1 == 0) goto L15
            java.lang.String r0 = "v1"
            int r0 = r1.optInt(r0)     // Catch: java.lang.Exception -> L15
            if (r0 != r2) goto L15
            boolean r0 = X.C138515c7.LIZ()     // Catch: java.lang.Exception -> L15
            if (r0 != 0) goto L1b
        L15:
            boolean r0 = LIZJ()
            if (r0 == 0) goto L22
        L1b:
            boolean r0 = X.C138515c7.LIZ()
            if (r0 == 0) goto L22
        L21:
            return r2
        L22:
            r2 = 0
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69C.LIZIZ():boolean");
    }

    public static boolean LIZJ() {
        try {
            JSONObject LIZ2 = LIZ();
            if (LIZ2 == null || LIZ2.optInt("v2") != 1) {
                return false;
            }
            return C138515c7.LIZ();
        } catch (Exception unused) {
            return false;
        }
    }

    public static JSONObject LIZ() {
        boolean z;
        JSONObject jSONObject;
        if (LIZ == null) {
            FFL.LJIIIZ().getClass();
            String LJIILJJIL = FFL.LJIILJJIL(31744, "tts_v2_entrance_opt_switch", "", true);
            o.LJIIIIZZ(LJIILJJIL, "getExprVal()");
            if (LJIILJJIL.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                try {
                    FFL.LJIIIZ().getClass();
                    jSONObject = new JSONObject(FFL.LJIILJJIL(31744, "tts_v2_entrance_opt_switch", "", true));
                } catch (Exception unused) {
                    jSONObject = null;
                }
                LIZ = jSONObject;
            }
        }
        return LIZ;
    }
}
