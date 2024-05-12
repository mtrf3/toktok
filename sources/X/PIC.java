package X;

import android.os.Process;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public abstract class PIC {
    public long LIZ;
    public final PIE LIZJ;
    public final java.util.Map<String, String> LIZIZ = new ConcurrentHashMap();
    public final List<String> LIZLLL = new CopyOnWriteArrayList();

    public abstract void LIZIZ(JSONObject jSONObject, String str, boolean z);

    public final void LIZ() {
        if (C09970aH.LJII()) {
            Iterator it = ((CopyOnWriteArrayList) this.LIZLLL).iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (((ConcurrentHashMap) this.LIZIZ).containsKey(str)) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("span's tag key can't be same as trace's tag key: ");
                    LIZ.append(str);
                    X1D.LIZIZ(LIZ);
                    Process.killProcess(Process.myPid());
                }
            }
        }
    }

    public PIC(PIE pie) {
        this.LIZJ = pie;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
    
        if (java.lang.Double.isNaN(r1) != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(org.json.JSONObject r6, boolean r7) {
        /*
            r5 = this;
            X.PIE r0 = r5.LIZJ
            java.lang.String r1 = r0.LIZ
            java.lang.String r0 = "service"
            r6.put(r0, r1)
            X.PIE r0 = r5.LIZJ
            java.lang.String r1 = r0.LIZJ
            java.lang.String r0 = "trace_id"
            r6.put(r0, r1)
            X.PIE r0 = r5.LIZJ
            boolean r0 = r0.LJFF
            r4 = 1
            if (r0 == 0) goto L4b
            r2 = 1
        L1a:
            X.PIE r0 = r5.LIZJ
            boolean r1 = r0.LJFF
            java.lang.String r3 = "sample_rate"
            java.lang.String r0 = "hit_rules"
            if (r1 == 0) goto L2b
            r6.put(r0, r2)
            r6.put(r3, r4)
        L2a:
            return
        L2b:
            r6.put(r0, r2)
            X.PDa r2 = X.C64082PDa.LIZIZ()
            X.PIE r0 = r5.LIZJ
            java.lang.String r1 = r0.LIZ
            org.json.JSONObject r0 = r2.LJLJI
            if (r0 != 0) goto L40
        L3a:
            r1 = 0
        L3c:
            r6.put(r3, r1)
            goto L2a
        L40:
            double r1 = r0.optDouble(r1)
            boolean r0 = java.lang.Double.isNaN(r1)
            if (r0 == 0) goto L3c
            goto L3a
        L4b:
            X.PDa r1 = X.C64082PDa.LIZIZ()
            X.PIE r0 = r5.LIZJ
            java.lang.String r0 = r0.LIZ
            byte r2 = r1.LIZJ(r0, r7)
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PIC.LIZJ(org.json.JSONObject, boolean):void");
    }
}
