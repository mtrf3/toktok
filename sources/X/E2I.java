package X;

import com.bytedance.android.monitorV2.HybridMultiMonitor;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class E2I implements Runnable {
    public static void LIZ() {
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry<String, JSONObject> entry : C37876Etk.LJI.LIZ.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
            HybridMultiMonitor hybridMultiMonitor = HybridMultiMonitor.getInstance();
            C79605VMb c79605VMb = new C79605VMb("bdx_auth_timeline_event_global");
            c79605VMb.LIZIZ = "bdxbridge_error_monitor";
            c79605VMb.LIZIZ(8);
            c79605VMb.LIZLLL = jSONObject;
            hybridMultiMonitor.customReport(c79605VMb.LIZ());
            C3C5.m7constructorimpl(jSONObject);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
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
}
