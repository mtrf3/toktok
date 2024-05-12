package X;

import android.os.SystemClock;
import com.bytedance.pumbaa.common.interfaces.IEventMonitor;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class Q15 {
    public final Q18 LIZ;
    public final IEventMonitor LIZIZ;

    public Q15(Q18 q18, IEventMonitor iEventMonitor) {
        this.LIZ = q18;
        this.LIZIZ = iEventMonitor;
    }

    public final void LIZ(String serviceName, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        o.LJIIIZ(serviceName, "serviceName");
        if (jSONObject3 != null) {
            jSONObject3.put("cold_boot_now", SystemClock.elapsedRealtime() - this.LIZ.LIZ());
        }
        if (this.LIZ.LIZJ() > 0) {
            if (jSONObject3 != null) {
                jSONObject3.put("cold_boot_time", this.LIZ.LIZJ() - this.LIZ.LIZ());
            }
        } else if (jSONObject3 != null) {
            jSONObject3.put("cold_boot_time", -1L);
        }
        this.LIZIZ.monitorEvent(serviceName, jSONObject, jSONObject3, jSONObject2);
    }
}
