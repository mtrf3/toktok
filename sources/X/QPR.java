package X;

import com.ss.android.ugc.aweme.websocket.api.ab.EventSampleRateExp;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class QPR implements Runnable {
    public static final QPR LJLIL = new QPR();

    public static void LIZ() {
        int i;
        int i2;
        int i3;
        if (!EventSampleRateExp.LIZ("ws_online_state")) {
            return;
        }
        try {
            C67143QWt c67143QWt = QWY.LJIIIZ;
            EnumC66933QOr enumC66933QOr = c67143QWt.LIZ().LIZLLL;
            int i4 = 0;
            if (enumC66933QOr == EnumC66933QOr.CONNECTED) {
                i = 1;
            } else {
                i = 0;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status", i);
            String LIZ = QPQ.LIZ(QPQ.LIZIZ);
            if (LIZ == null) {
                LIZ = "";
            }
            jSONObject.put("url", LIZ);
            if (enumC66933QOr != null) {
                i2 = enumC66933QOr.getTypeValue();
            } else {
                i2 = -1;
            }
            jSONObject.put("connection_state", i2);
            if (C84763XOl.LJIIJJI) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            jSONObject.put("is_background", i3);
            c67143QWt.LIZ();
            jSONObject.put("network_code", QWY.LIZ());
            if (C48203Ivv.LJ(EF7.LIZIZ())) {
                i4 = 1;
            }
            jSONObject.put("is_network_available", i4);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("ws_online_state: ");
            LIZ2.append(jSONObject);
            C221018lt.LIZ("WsPerfTracker", X1D.LIZIZ(LIZ2));
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
