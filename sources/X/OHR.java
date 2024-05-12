package X;

import com.bytedance.bpea.basics.Cert;
import kotlin.jvm.internal.AqS141S0200000_10;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class OHR {
    public static void LIZ(String[] strArr, Cert cert, AqS141S0200000_10 aqS141S0200000_10) {
        OHW ohw = new OHW(cert, "permission_request", new String[]{OHQ.LIZ}, Integer.valueOf(EnumC39200Fa0.BPEA_ENTRY.getType()), "Collect", 102601);
        JSONObject jSONObject = new JSONObject();
        OHQ.LIZJ.getClass();
        jSONObject.put(OHQ.LIZIZ, strArr);
        ohw.LIZ.put("params", jSONObject);
        C39207Fa7.LIZ(ohw, aqS141S0200000_10);
    }
}
