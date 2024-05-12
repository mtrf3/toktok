package X;

import com.bytedance.android.monitorV2.HybridMultiMonitor;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.VPu, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79702VPu extends C79700VPs {
    public C79702VPu(VNU vnu, int i) {
        super(i, vnu);
    }

    public final void LIZIZ(int i, Integer num, String playerType, String message, String str, boolean z) {
        o.LJIIJ(playerType, "playerType");
        o.LJIIJ(message, "message");
        JSONObject jSONObject = new JSONObject();
        C77123UOp.LJJJJZI("code", String.valueOf(i), jSONObject);
        C77123UOp.LJJJJZI("playerType", playerType, jSONObject);
        C77123UOp.LJJJJZI("autoPlay", String.valueOf(z), jSONObject);
        C77123UOp.LJJJJZI("message", message, jSONObject);
        if (str != null) {
            C77123UOp.LJJJJZI("src", str, jSONObject);
        }
        if (num != null) {
            C77123UOp.LJJJJZI("playStatus", String.valueOf(num.intValue()), jSONObject);
        }
        try {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("eventName: ");
            LIZ.append(this.LIZIZ);
            LIZ.append(", common: ");
            LIZ.append((String) null);
            LIZ.append(", category: ");
            LIZ.append(jSONObject.toString(4));
            X1D.LIZIZ(LIZ);
            HybridMultiMonitor.getInstance().customReport("", "", this.LIZIZ, jSONObject, null, null, null, 2);
        } catch (Exception e) {
            J7Z.LIZ("AUDIO_MONITOR_TAG", e.getMessage());
        }
        LIZ(jSONObject);
    }
}
