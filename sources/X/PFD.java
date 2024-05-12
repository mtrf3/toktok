package X;

import Y.ARunnableS16S1000000_11;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.monitor.collector.LockMonitorManager;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class PFD implements Runnable {
    public boolean LJLIL;
    public boolean LJLILLLLZI;
    public final long[] LJLJI;
    public final long LJLJJI;
    public final long LJLJJL;
    public final long LJLJJLL;
    public final String LJLJL;
    public final String LJLJLJ;
    public final long LJLJLLL;
    public final C64177PGr LJLL;
    public final C36411bp[] LJLLI;
    public final boolean LJLLILLLL;
    public final java.util.Map<String, String> LJLLJ;

    public final void LIZ() {
        try {
            LinkedList linkedList = new LinkedList();
            long[] jArr = this.LJLJI;
            if (jArr.length > 0) {
                C64229PIr.LJFF(jArr, linkedList, this.LJLJJLL);
                C64229PIr.LJII(linkedList, new PFO());
            }
            if (linkedList.size() > 2) {
                StringBuilder sb = new StringBuilder();
                long max = Math.max(this.LJLJJL, C64229PIr.LJ(linkedList, sb));
                Object LIZJ = C64229PIr.LIZJ(linkedList);
                JSONObject jSONObject = new JSONObject();
                String sb2 = sb.toString();
                C64177PGr c64177PGr = this.LJLL;
                if (c64177PGr != null) {
                    if (!TextUtils.isEmpty("uuid")) {
                        c64177PGr.LJIILIIL = "uuid";
                    }
                    if (!TextUtils.isEmpty(sb2)) {
                        c64177PGr.LJIIL = sb2;
                    }
                }
                jSONObject.put("stack", sb2);
                jSONObject.put("stack_key", LIZJ);
                jSONObject.put(WM7.SCENE_SERVICE, this.LJLJL);
                jSONObject.put("cost_time", max);
                jSONObject.put("cpu_cost", this.LJLJJI);
                jSONObject.put("method_time", max);
                C64125PEr LIZLLL = C64125PEr.LIZLLL();
                long j = this.LJLJJLL;
                JSONObject LIZIZ = LIZLLL.LIZIZ(j - this.LJLJJL, j);
                long j2 = this.LJLJJLL;
                LIZIZ.put("lock_monitor", LockMonitorManager.dumpLockInfo(j2 - this.LJLJJL, j2));
                long j3 = this.LJLJJLL;
                String LIZJ2 = C25500zK.LIZJ(SystemClock.uptimeMillis(), C25500zK.LIZIZ(j3 - this.LJLJJL, j3));
                if (PFC.LJLLLL) {
                    LIZJ2 = C39719FiN.LIZ(new C39720FiO(LIZJ2, max));
                    C39719FiN.LIZ.clear();
                    PFC.LJLLLL = false;
                } else {
                    C39720FiO c39720FiO = new C39720FiO(LIZJ2, max);
                    if (C39719FiN.LIZ == null) {
                        C39719FiN.LIZ = new LinkedBlockingQueue<>(10);
                    }
                    try {
                        if (C39719FiN.LIZ.size() == 10) {
                            C39719FiN.LIZ.take();
                        }
                        C39719FiN.LIZ.put(c39720FiO);
                    } catch (InterruptedException e) {
                        C16880lQ.LLLLIIL(e);
                    }
                }
                LIZIZ.put("evil_method", LIZJ2);
                jSONObject.put("message", C45439HsR.LJII(this.LJLJLJ));
                jSONObject.put("timestamp", this.LJLJJLL);
                jSONObject.put("event_type", "lag_drop_frame");
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("crash_section", C09970aH.LJI(this.LJLJLLL));
                jSONObject2.put("block_frame", String.valueOf(this.LJLILLLLZI));
                jSONObject2.put("block_input", String.valueOf(this.LJLIL));
                jSONObject2.put("trace_type", "message");
                java.util.Map<String, String> map = this.LJLLJ;
                if (map != null && !map.isEmpty()) {
                    for (Map.Entry<String, String> entry : this.LJLLJ.entrySet()) {
                        jSONObject2.put(entry.getKey(), entry.getValue());
                    }
                }
                if (PFC.LJLLL) {
                    LIZIZ.put("dmt_stack_completion", C36411bp.LIZ(this.LJLLI));
                    jSONObject2.put("has_dmt_stack_completion", String.valueOf(!((ArrayList) r2).isEmpty()));
                }
                jSONObject.put("custom", LIZIZ);
                jSONObject.put("filters", jSONObject2);
                PEE pee = new PEE("drop_frame_stack", jSONObject);
                if (this.LJLLILLLL) {
                    pee.LIZJ = true;
                }
                C64089PDh.LJIIJ().LIZLLL(pee);
                F9U.LIZ.LIZJ(new ARunnableS16S1000000_11("evil_method_end", 4));
            }
        } catch (Exception unused) {
            F9U.LIZ.LIZJ(new ARunnableS16S1000000_11("evil_method_analyse_exception", 4));
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public PFD(String str, long[] jArr, long j, long j2, long j3, String str2, long j4, C64177PGr c64177PGr, C36411bp[] c36411bpArr, boolean z, java.util.Map map) {
        this.LJLJL = str;
        this.LJLJJL = j2;
        this.LJLJJI = j;
        this.LJLJI = jArr;
        this.LJLJJLL = j3;
        this.LJLJLJ = str2;
        this.LJLJLLL = j4;
        this.LJLL = c64177PGr;
        this.LJLLI = c36411bpArr;
        this.LJLLILLLL = z;
        this.LJLLJ = map;
    }
}
