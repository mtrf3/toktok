package X;

import com.ss.android.ugc.aweme.websocket.api.ab.EventSampleRateExp;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class QPV implements Runnable {
    public static final QPV LJLIL = new QPV();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    public static void LIZ() {
        int i;
        if (!EventSampleRateExp.LIZ("ws_online_state")) {
            return;
        }
        try {
            C67128QWe c67128QWe = C67128QWe.LIZIZ;
            int i2 = 1;
            int i3 = 0;
            if (c67128QWe.isConnected()) {
                i = 1;
            } else {
                i = 0;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status", i);
            Object LIZ = QPU.LIZ(QPU.LIZIZ);
            if (LIZ == null) {
                LIZ = "";
            }
            jSONObject.put("url", LIZ);
            jSONObject.put("connection_state", c67128QWe.getState().getTypeValue());
            if (!C84763XOl.LJIIJJI) {
                i2 = 0;
            }
            jSONObject.put("is_background", i2);
            jSONObject.put("network_code", C48208Iw0.LIZ());
            EF7.LIZIZ();
            try {
                i3 = C2NU.LIZ.LIZIZ();
            } catch (Exception unused) {
            }
            jSONObject.put("is_network_available", i3);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("event = ws_online_state, json = ");
            LIZ2.append(jSONObject);
            QPY.LIZ("WsStateReport", X1D.LIZIZ(LIZ2));
            FMX.LJIILJJIL("ws_online_state", jSONObject);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
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
