package X;

import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class O5C {
    public C64009PAf LIZ;
    public final AtomicBoolean LIZIZ = new AtomicBoolean(false);

    public final void LIZ(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        if (this.LIZIZ.get()) {
            C64009PAf c64009PAf = this.LIZ;
            if (c64009PAf == null) {
                return;
            }
            c64009PAf.LJIIJ(str, jSONObject, jSONObject2, jSONObject3);
            return;
        }
        throw new IllegalStateException("Please init MonitorManager first");
    }
}
