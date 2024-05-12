package X;

import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class FPB implements InterfaceC36612EYm {
    public final String LIZ;
    public long LIZIZ;
    public final /* synthetic */ FPA LIZJ;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0092 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // X.InterfaceC36612EYm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(X.C36608EYi r6) {
        /*
            r5 = this;
            long r2 = java.lang.System.currentTimeMillis()
            long r0 = r5.LIZIZ
            long r2 = r2 - r0
            r5.LIZIZ = r2
            java.lang.StringBuilder r2 = X.X1D.LIZ()
            java.lang.String r0 = "onSuccess(), passed time: "
            r2.append(r0)
            long r0 = r5.LIZIZ
            r2.append(r0)
            X.X1D.LIZIZ(r2)
            r4 = 0
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Exception -> L7a
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.Exception -> L7a
            byte[] r0 = r6.LIZIZ     // Catch: java.lang.Exception -> L7a
            r1.<init>(r0)     // Catch: java.lang.Exception -> L7a
            r2.<init>(r1)     // Catch: java.lang.Exception -> L7a
            java.lang.String r0 = "data"
            org.json.JSONObject r1 = r2.optJSONObject(r0)     // Catch: java.lang.Exception -> L7a
            if (r1 != 0) goto L58
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Exception -> L7a
            r3.<init>()     // Catch: java.lang.Exception -> L7a
            java.lang.String r1 = "label"
            java.lang.String r0 = "notice"
            r3.put(r1, r0)     // Catch: java.lang.Exception -> L7a
            java.lang.String r0 = "data"
            r2.put(r0, r3)     // Catch: java.lang.Exception -> L7a
        L40:
            java.lang.String r1 = "scc_reason"
            java.lang.String r0 = "scc_res"
            r2.put(r1, r0)     // Catch: java.lang.Exception -> L7a
            java.lang.String r3 = "scc_passed_time"
            long r0 = r5.LIZIZ     // Catch: java.lang.Exception -> L7a
            r2.put(r3, r0)     // Catch: java.lang.Exception -> L7a
            X.FPA r0 = r5.LIZJ     // Catch: java.lang.Exception -> L7a
            r0.getClass()     // Catch: java.lang.Exception -> L7a
            java.lang.String r3 = X.FPA.LIZJ(r6)     // Catch: java.lang.Exception -> L7a
            goto L6e
        L58:
            java.lang.String r0 = "label"
            java.lang.String r1 = com.bytedance.mt.protector.impl.JSONObjectProtectorUtils.getString(r1, r0)     // Catch: java.lang.Exception -> L7a
            java.lang.String r0 = "allow"
            boolean r0 = android.text.TextUtils.equals(r1, r0)     // Catch: java.lang.Exception -> L7a
            if (r0 == 0) goto L40
            X.FPA r1 = r5.LIZJ     // Catch: java.lang.Exception -> L7a
            java.lang.String r0 = r5.LIZ     // Catch: java.lang.Exception -> L7a
            r1.LIZ(r0)     // Catch: java.lang.Exception -> L7a
            goto L40
        L6e:
            java.lang.String r1 = "scc_logid"
            if (r3 != 0) goto L78
            java.lang.String r0 = ""
        L74:
            r2.put(r1, r0)     // Catch: java.lang.Exception -> L7d
            goto L8e
        L78:
            r0 = r3
            goto L74
        L7a:
            r2 = move-exception
            r3 = r4
            goto L7e
        L7d:
            r2 = move-exception
        L7e:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "cloud service onSuccess catch exception: "
            r1.append(r0)
            r1.append(r2)
            X.X1D.LIZIZ(r1)
            goto L8f
        L8e:
            r4 = r2
        L8f:
            java.lang.Class<X.FPA> r2 = X.FPA.class
            monitor-enter(r2)
            X.FPA r1 = r5.LIZJ     // Catch: java.lang.Throwable -> Laf
            java.lang.String r0 = r5.LIZ     // Catch: java.lang.Throwable -> Laf
            boolean r0 = r1.LIZIZ(r0)     // Catch: java.lang.Throwable -> Laf
            if (r0 == 0) goto La8
            X.FPA r1 = r5.LIZJ     // Catch: java.lang.Throwable -> Laf
            java.lang.String r0 = r5.LIZ     // Catch: java.lang.Throwable -> Laf
            r1.LJII(r0, r4)     // Catch: java.lang.Throwable -> Laf
            X.FPA r0 = r5.LIZJ     // Catch: java.lang.Throwable -> Laf
            r0.LJIIIIZZ()     // Catch: java.lang.Throwable -> Laf
        La8:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Laf
            long r0 = r5.LIZIZ
            LIZJ(r0, r3)
            return
        Laf:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Laf
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FPB.LIZ(X.EYi):void");
    }

    @Override // X.InterfaceC36612EYm
    public final void LIZIZ(C36608EYi c36608EYi) {
        this.LIZIZ = System.currentTimeMillis() - this.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onFail(), passed time: ");
        LIZ.append(this.LIZIZ);
        X1D.LIZIZ(LIZ);
        FPA fpa = this.LIZJ;
        long j = this.LIZIZ;
        fpa.getClass();
        JSONObject LJ = FPA.LJ(j, c36608EYi);
        synchronized (FPA.class) {
            if (this.LIZJ.LIZIZ(this.LIZ)) {
                this.LIZJ.LJII(this.LIZ, LJ);
                this.LIZJ.LJIIIIZZ();
            }
        }
        long j2 = this.LIZIZ;
        this.LIZJ.getClass();
        LIZJ(j2, FPA.LIZJ(c36608EYi));
    }

    public static void LIZJ(long j, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("scc_passed_time", Long.valueOf(j));
        if (str == null) {
            str = "";
        }
        hashMap.put("scc_logid", str);
        C38639FEl.LIZJ("scc_cloudservice_result", hashMap);
    }

    public FPB(FPA fpa, String str, long j) {
        this.LIZJ = fpa;
        this.LIZ = str;
        this.LIZIZ = j;
    }
}
