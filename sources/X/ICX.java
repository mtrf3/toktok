package X;

import com.ss.android.common.applog.AppLog;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class ICX extends AbstractC39622Fgo {
    public final String LIZIZ;
    public final boolean LIZJ;

    @Override // X.AbstractC39622Fgo
    public final boolean LIZ() {
        return this.LIZJ;
    }

    @Override // X.AbstractC39622Fgo
    public final String LIZIZ() {
        return this.LIZIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ICX(WRQ cameraApiComponent) {
        super(cameraApiComponent);
        o.LJIIIZ(cameraApiComponent, "cameraApiComponent");
        this.LIZIZ = "requestUserInformation";
        this.LIZJ = true;
    }

    @Override // X.AbstractC39622Fgo
    public final void LIZJ(int i, String str) {
        if (!C44172HVg.LJIJ.isLogin()) {
            C5OG.LIZJ(ICZ.LJLIL);
            return;
        }
        C44423Hc3 LJ = C73098SmU.LJ();
        if (LJ != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("interface", this.LIZIZ);
            jSONObject.put("status", 0);
            JSONObject jSONObject2 = new JSONObject();
            String uid = LJ.getUid();
            String str2 = "";
            if (uid == null) {
                uid = "";
            }
            jSONObject2.put("userID", uid);
            C60903NvH.LJIIJJI().getApplicationService().getClass();
            String serverDeviceId = AppLog.getServerDeviceId();
            if (serverDeviceId != null) {
                str2 = serverDeviceId;
            }
            jSONObject2.put("deviceID", str2);
            C60903NvH.LJIIJJI().getApplicationService().getClass();
            jSONObject2.put("appID", String.valueOf(EF7.LJIIIZ));
            jSONObject.put("body", jSONObject2);
            String jSONObject3 = jSONObject.toString();
            o.LJIIIIZZ(jSONObject3, "jsonObject.toString()");
            LIZLLL(i, jSONObject3);
            return;
        }
        H78.LIZIZ("EffectUserIDHandler", "handleEffectMessage::currentUser is null");
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put("interface", this.LIZIZ);
        jSONObject4.put("status", 1);
        String jSONObject5 = jSONObject4.toString();
        o.LJIIIIZZ(jSONObject5, "jsonObject.toString()");
        LIZLLL(i, jSONObject5);
    }
}
