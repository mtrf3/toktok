package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class PAD implements PCY {
    public static final AtomicInteger LIZLLL = new AtomicInteger(0);
    public final AtomicLong LIZ = new AtomicLong(0);
    public final ConcurrentLinkedQueue<PAF> LIZIZ = new ConcurrentLinkedQueue<>();
    public long LIZJ;

    /* JADX WARN: Code restructure failed: missing block: B:96:0x0059, code lost:
    
        if (r4 != null) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL() {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PAD.LIZLLL():void");
    }

    public static void LIZ(List list) {
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            PAT pat = (PAT) it.next();
            try {
                File file = pat.LIZJ;
                if (file != null) {
                    OPR.LIZ(file);
                }
            } catch (Exception unused) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("delete LogFile's source File failed. logFile=");
                LIZ.append(pat.LIZJ);
                X1D.LIZIZ(LIZ);
                InterfaceC64004PAa interfaceC64004PAa = PAU.LIZ;
                if (interfaceC64004PAa != null) {
                    interfaceC64004PAa.LIZ();
                }
            }
        }
    }

    public static java.util.Map LIZJ(List list) {
        HashMap hashMap = new HashMap();
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            for (PAE pae : ((PAT) it.next()).LIZLLL) {
                long j = pae.LIZ;
                long j2 = pae.LIZIZ;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(j);
                LIZ.append("_");
                LIZ.append(j2);
                String LIZIZ = X1D.LIZIZ(LIZ);
                List list2 = (List) hashMap.get(LIZIZ);
                if (list2 == null) {
                    list2 = new ArrayList();
                    hashMap.put(LIZIZ, list2);
                }
                list2.add(pae);
            }
        }
        return hashMap;
    }

    public static byte[] LJFF(List list) {
        try {
            JSONArray LJI = LJI(LIZJ(list));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("list", LJI);
            return PAK.LIZ(jSONObject.toString());
        } catch (Throwable th) {
            PAU.LIZIZ("LogSender serialize failed.", th);
            return null;
        }
    }

    public static JSONArray LJI(java.util.Map map) {
        JSONArray jSONArray = new JSONArray();
        for (Map.Entry entry : ((HashMap) map).entrySet()) {
            entry.getKey();
            List list = (List) entry.getValue();
            if (!C78915Uy7.LJIJJ(list)) {
                JSONArray jSONArray2 = new JSONArray();
                for (int i = 0; i < list.size(); i++) {
                    PAE pae = (PAE) ListProtector.get(list, i);
                    try {
                        JSONObject jSONObject = new JSONObject(new String(pae.LIZJ));
                        if (PAJ.LIZ.LIZIZ((int) pae.LIZIZ, jSONObject)) {
                            JSONObject optJSONObject = jSONObject.optJSONObject("_debug_self");
                            if (optJSONObject == null) {
                                try {
                                    optJSONObject = new JSONObject();
                                    jSONObject.put("_debug_self", optJSONObject);
                                } catch (Exception unused) {
                                }
                            }
                            optJSONObject.put("debug_sender_number", LIZLLL.getAndIncrement());
                            jSONArray2.put(jSONObject);
                        }
                    } catch (Exception e) {
                        PAU.LIZIZ("toJSON", e);
                    }
                }
                JSONObject LIZIZ = PA8.LIZJ().LIZIZ(((PAE) ListProtector.get(list, 0)).LIZIZ, ((PAE) ListProtector.get(list, 0)).LIZ);
                if (LIZIZ != null) {
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("data", jSONArray2);
                        jSONObject2.put("header", LIZIZ);
                        jSONArray.put(jSONObject2);
                    } catch (Exception e2) {
                        PAU.LIZIZ("toJSON", e2);
                    }
                }
            }
        }
        return jSONArray;
    }

    @Override // X.PCY
    public final void LIZIZ(long j) {
        if (j - this.LIZJ >= 90000) {
            try {
                LIZLLL();
            } catch (Throwable th) {
                PAU.LIZIZ("onTimeEvent", th);
            }
            this.LIZJ = System.currentTimeMillis();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0031, code lost:
    
        if (r3.LJIIJJI != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(java.util.List<X.PAT> r12) {
        /*
            r11 = this;
            X.PAL r3 = X.PAH.LIZ     // Catch: java.lang.Throwable -> La0
            boolean r0 = r3.LJIIJJI     // Catch: java.lang.Throwable -> La0
            r5 = 1
            r10 = 0
            if (r0 == 0) goto L2f
            long r8 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> La0
            java.util.concurrent.atomic.AtomicLong r0 = r3.LJIIIIZZ     // Catch: java.lang.Throwable -> La0
            long r0 = r0.get()     // Catch: java.lang.Throwable -> La0
            long r8 = r8 - r0
            int r1 = r3.LIZIZ     // Catch: java.lang.Throwable -> La0
            int r0 = r3.LIZLLL     // Catch: java.lang.Throwable -> La0
            if (r1 <= r0) goto L24
            int r0 = r3.LIZIZ     // Catch: java.lang.Throwable -> La0
        L1b:
            long r1 = (long) r0     // Catch: java.lang.Throwable -> La0
            int r0 = r3.LJ     // Catch: java.lang.Throwable -> La0
            long r6 = (long) r0     // Catch: java.lang.Throwable -> La0
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 <= 0) goto L27
            goto L2a
        L24:
            int r0 = r3.LIZLLL     // Catch: java.lang.Throwable -> La0
            goto L1b
        L27:
            int r0 = r3.LJ     // Catch: java.lang.Throwable -> La0
            long r1 = (long) r0     // Catch: java.lang.Throwable -> La0
        L2a:
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 > 0) goto L37
            goto L33
        L2f:
            boolean r0 = r3.LJIIJJI     // Catch: java.lang.Throwable -> La0
            if (r0 == 0) goto L37
        L33:
            LIZ(r12)     // Catch: java.lang.Throwable -> La0
            return
        L37:
            byte[] r4 = LJFF(r12)     // Catch: java.lang.Throwable -> La0
            if (r4 != 0) goto L41
            LIZ(r12)     // Catch: java.lang.Throwable -> La0
            return
        L41:
            long r1 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> La0
            java.util.concurrent.atomic.AtomicLong r0 = r11.LIZ     // Catch: java.lang.Throwable -> La0
            long r6 = r0.get()     // Catch: java.lang.Throwable -> La0
            long r8 = r1 - r6
            r6 = 5000(0x1388, double:2.4703E-320)
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r0 < 0) goto L71
            java.util.concurrent.atomic.AtomicLong r0 = r11.LIZ     // Catch: java.lang.Throwable -> La0
            r0.set(r1)     // Catch: java.lang.Throwable -> La0
            boolean r0 = r3.LIZIZ()     // Catch: java.lang.Throwable -> La0
            if (r0 == 0) goto L6d
            android.content.Context r0 = X.C63985P9h.LIZ     // Catch: java.lang.Throwable -> La0
            boolean r0 = X.C16880lQ.LLLLILI(r0)     // Catch: java.lang.Throwable -> La0
            if (r0 == 0) goto L6d
            X.PAM r0 = X.PAI.LIZ     // Catch: java.lang.Throwable -> La0
            boolean r10 = r0.LIZLLL(r4)     // Catch: java.lang.Throwable -> La0
            goto L6e
        L6d:
            r5 = 0
        L6e:
            if (r10 != 0) goto L9c
            goto L72
        L71:
            r5 = 0
        L72:
            long r0 = X.PAL.LIZ(r5)     // Catch: java.lang.Throwable -> La0
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> La0
            long r2 = r2 + r0
            X.PA5 r0 = X.PA7.LIZ     // Catch: java.lang.Throwable -> La0
            boolean r0 = r0.LIZLLL(r5, r4, r2)     // Catch: java.lang.Throwable -> La0
            if (r0 != 0) goto L9c
            java.util.concurrent.ConcurrentLinkedQueue<X.PAF> r1 = r11.LIZIZ     // Catch: java.lang.Throwable -> La0
            X.PAF r0 = new X.PAF     // Catch: java.lang.Throwable -> La0
            r0.<init>(r5, r4, r2)     // Catch: java.lang.Throwable -> La0
            r1.add(r0)     // Catch: java.lang.Throwable -> La0
            java.util.concurrent.ConcurrentLinkedQueue<X.PAF> r0 = r11.LIZIZ     // Catch: java.lang.Throwable -> La0
            int r1 = r0.size()     // Catch: java.lang.Throwable -> La0
            r0 = 10
            if (r1 <= r0) goto L9c
            java.util.concurrent.ConcurrentLinkedQueue<X.PAF> r0 = r11.LIZIZ     // Catch: java.lang.Throwable -> La0
            r0.poll()     // Catch: java.lang.Throwable -> La0
        L9c:
            LIZ(r12)     // Catch: java.lang.Throwable -> La0
            goto La6
        La0:
            r1 = move-exception
            java.lang.String r0 = "sendLog"
            X.PAU.LIZIZ(r0, r1)
        La6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PAD.LJ(java.util.List):void");
    }
}
