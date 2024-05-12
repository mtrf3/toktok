package X;

import com.bytedance.pumbaa.common.interfaces.IAppLog;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class Q1B {
    public C66335Q1r LIZ;
    public boolean LIZIZ;

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(java.lang.String r12, X.InterfaceC88472Yns<? super X.C66322Q1e, X.C76800UCe> r13) {
        /*
            r11 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.o.LJIIJ(r12, r0)
            r9 = 100000(0x186a0, double:4.94066E-319)
            X.Q19 r0 = X.Q1A.LIZIZ     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto L23
            com.google.gson.m r0 = r0.LJIILJJIL     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto L23
            com.google.gson.j r0 = r0.LJJIJ(r12)     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto L23
            long r7 = r0.LJIJJLI()     // Catch: java.lang.Throwable -> L1b
            goto L26
        L1b:
            r0 = move-exception
            X.3C4 r0 = X.C141335gf.LIZ(r0)
            X.C3C5.m7constructorimpl(r0)
        L23:
            r7 = 100000(0x186a0, double:4.94066E-319)
        L26:
            r3 = 1
            r5 = 0
            int r4 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r4 != 0) goto L2e
        L2d:
            return
        L2e:
            r1 = 1
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 != 0) goto L6b
        L34:
            java.lang.Thread r1 = X.C16880lQ.LLLLIIIILLL()
            java.lang.String r0 = "Thread.currentThread()"
            kotlin.jvm.internal.o.LJFF(r1, r0)
            long r4 = r1.getId()
            long r1 = X.C48226IwI.LJ
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 != 0) goto L69
        L47:
            java.lang.ThreadLocal<java.lang.Boolean> r0 = X.Q1K.LIZIZ
            java.lang.Object r1 = r0.get()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L5f
            kotlin.jvm.internal.AqS40S0210000_11 r1 = new kotlin.jvm.internal.AqS40S0210000_11
            r0 = 0
            r1.<init>(r11, r13, r3, r0)
            X.Q1K.LIZ(r1)
        L5e:
            return
        L5f:
            kotlin.jvm.internal.AqS40S0210000_11 r1 = new kotlin.jvm.internal.AqS40S0210000_11
            r0 = 1
            r1.<init>(r11, r13, r3, r0)
            X.C48226IwI.LIZIZ(r1)
            goto L5e
        L69:
            r3 = 0
            goto L47
        L6b:
            if (r4 >= 0) goto L77
        L6d:
            long r1 = android.os.SystemClock.elapsedRealtime()
            long r1 = r1 % r9
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 != 0) goto L2d
            goto L34
        L77:
            r9 = r7
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 <= 0) goto L2d
            goto L6d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Q1B.LIZ(java.lang.String, X.Yns):void");
    }

    public final void LIZIZ(String eventName, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        Q15 q15;
        C66335Q1r c66335Q1r;
        if (this.LIZIZ && (c66335Q1r = this.LIZ) != null) {
            JSONObject LIZ = ETU.LIZ(ETU.LIZ(jSONObject, jSONObject2), jSONObject3);
            o.LJIIIZ(eventName, "eventName");
            IAppLog iAppLog = c66335Q1r.LIZ;
            if (LIZ == null) {
                LIZ = new JSONObject();
            }
            iAppLog.log(eventName, LIZ);
        }
        Q19 q19 = Q1A.LIZIZ;
        if (q19 != null && (q15 = q19.LJI) != null) {
            q15.LIZ(eventName, jSONObject, jSONObject2, jSONObject3);
        }
    }
}
