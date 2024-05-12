package X;

import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: X.PAu, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64024PAu {
    public long LIZ;
    public final java.util.Map<EnumC64008PAe, BNQ> LIZIZ = new HashMap();

    public static C64024PAu LIZ(JSONObject jSONObject) {
        if (C78248UnM.LJIIJ()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("DowngradeRule=");
            LIZ.append(jSONObject.toString());
            C64028PAy.LIZLLL("APM-Slardar", X1D.LIZIZ(LIZ));
        }
        C64024PAu c64024PAu = new C64024PAu();
        long optLong = jSONObject.optLong("duration", 0L);
        long optLong2 = jSONObject.optLong("expire_time", 0L);
        if (optLong2 > 0) {
            c64024PAu.LIZ = optLong2;
        } else {
            c64024PAu.LIZ = (optLong * 1000) + System.currentTimeMillis();
        }
        EnumC64008PAe enumC64008PAe = EnumC64008PAe.OTHER_LOG_TYPE;
        JSONObject optJSONObject = jSONObject.optJSONObject(enumC64008PAe.logType);
        if (optJSONObject != null) {
            ((HashMap) c64024PAu.LIZIZ).put(enumC64008PAe, BNQ.LIZ(optJSONObject));
        }
        EnumC64008PAe enumC64008PAe2 = EnumC64008PAe.SERVICE_MONITOR;
        JSONObject optJSONObject2 = jSONObject.optJSONObject(enumC64008PAe2.logType);
        if (optJSONObject2 != null) {
            ((HashMap) c64024PAu.LIZIZ).put(enumC64008PAe2, BNQ.LIZ(optJSONObject2));
        }
        return c64024PAu;
    }
}
