package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Nsw, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60758Nsw implements InterfaceC86859Y7b {
    @Override // X.InterfaceC86859Y7b
    public final void LIZ(String reason) {
        o.LJIIJ(reason, "reason");
    }

    @Override // X.InterfaceC86859Y7b
    public final void LIZIZ(String str, JSONObject jSONObject) {
        boolean z = true;
        if (jSONObject != null && jSONObject.optInt("enable", 1) == 0) {
            z = false;
        }
        C60757Nsv.LIZ = z;
        long j = 3000;
        if (jSONObject != null) {
            j = jSONObject.optLong("max_block_duration", 3000L);
        }
        C60757Nsv.LIZIZ = j;
    }

    @Override // X.InterfaceC86859Y7b
    public final void LIZJ(String content, JSONObject config) {
        o.LJIIJ(config, "config");
        o.LJIIJ(content, "content");
        boolean z = true;
        if (config.optInt("enable", 1) == 0) {
            z = false;
        }
        C60757Nsv.LIZ = z;
        C60757Nsv.LIZIZ = config.optLong("max_block_duration", 3000L);
    }
}
