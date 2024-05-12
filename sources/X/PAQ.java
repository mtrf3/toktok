package X;

import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class PAQ {
    public static final ConcurrentHashMap<Long, Long> LIZIZ = new ConcurrentHashMap<>();
    public static PAS LIZJ;
    public volatile boolean LIZ;

    public final synchronized void LIZ() {
        if (this.LIZ) {
            return;
        }
        this.LIZ = true;
        LIZJ = new PAS(C51029K0z.LJIJJLI(), C51029K0z.LJIILJJIL());
        PAR par = PAW.LIZ;
        par.LIZJ = LIZJ;
        par.LIZ();
        PAD pad = PAG.LIZ;
        pad.getClass();
        C48661J7x.LIZ.LIZ(pad);
    }

    public final void LIZIZ(JSONObject jSONObject, long j) {
        JSONObject jSONObject2;
        try {
            if (!PAJ.LIZ.LIZIZ((int) j, jSONObject)) {
                return;
            }
            ConcurrentHashMap<Long, Long> concurrentHashMap = LIZIZ;
            if (!concurrentHashMap.containsKey(Long.valueOf(j))) {
                PA8 LIZJ2 = PA8.LIZJ();
                synchronized (C63985P9h.class) {
                    jSONObject2 = C63985P9h.LIZIZ.get(Long.valueOf(j));
                }
                concurrentHashMap.put(Long.valueOf(j), Long.valueOf(LIZJ2.LIZLLL(jSONObject2, j)));
            }
            LIZ();
            try {
                if (JSONObjectProtectorUtils.getJSONObject(jSONObject, "_debug_self") == null) {
                    jSONObject.put("_debug_self", new JSONObject());
                }
                new JSONObject().put("sdk_report_from", "apm6");
            } catch (Exception unused) {
            }
            LIZJ.LIZJ(jSONObject, j, LIZIZ.get(Long.valueOf(j)).longValue());
        } catch (Throwable th) {
            PAU.LIZIZ("record", th);
        }
    }
}
