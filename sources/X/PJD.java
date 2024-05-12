package X;

import com.bytedance.crash.MonitorCrash;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class PJD {
    public static MonitorCrash LIZ = null;
    public static int LIZIZ = -1;
    public static int LIZJ;

    public static MonitorCrash LIZ() {
        if (LIZ == null) {
            MonitorCrash initSDK = MonitorCrash.initSDK(PK0.LIZ, "2010", 30107101L, "3.1.7-rc.51.oversea", "");
            LIZ = initSDK;
            initSDK.config().setChannel("release");
        }
        return LIZ;
    }

    public static void LIZIZ(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3 = jSONObject;
        if (PK0.LIZ == null) {
            return;
        }
        if (jSONObject3 == null) {
            jSONObject3 = new JSONObject();
        }
        PJC.LJIIIZ(C64257PJt.LIZJ(new String[]{"aid", "4444", "update_version_code", "000000", "channel", "unknown", "app_version", "0.0.0"}, PK0.LIZIZ().LIZIZ.getCommonParams()), jSONObject3);
        LIZ().reportEvent(str, 1, jSONObject3, jSONObject2, null);
    }
}
