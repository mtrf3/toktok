package X;

import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: X.PAc, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64006PAc {
    public long LIZ;
    public final java.util.Map<EnumC64007PAd, BNT> LIZIZ = new HashMap();

    public static C64006PAc LIZ(JSONObject jSONObject) {
        C64006PAc c64006PAc = new C64006PAc();
        long optLong = jSONObject.optLong("duration", 0L);
        long optLong2 = jSONObject.optLong("expire_time", 0L);
        if (optLong2 > 0) {
            c64006PAc.LIZ = optLong2;
        } else {
            c64006PAc.LIZ = (optLong * 1000) + System.currentTimeMillis();
        }
        EnumC64007PAd enumC64007PAd = EnumC64007PAd.OTHER_LOG_TYPE;
        JSONObject optJSONObject = jSONObject.optJSONObject(enumC64007PAd.logType);
        if (optJSONObject != null) {
            ((HashMap) c64006PAc.LIZIZ).put(enumC64007PAd, BNT.LIZ(optJSONObject));
        }
        EnumC64007PAd enumC64007PAd2 = EnumC64007PAd.SERVICE_MONITOR;
        JSONObject optJSONObject2 = jSONObject.optJSONObject(enumC64007PAd2.logType);
        if (optJSONObject2 != null) {
            ((HashMap) c64006PAc.LIZIZ).put(enumC64007PAd2, BNT.LIZ(optJSONObject2));
        }
        return c64006PAc;
    }
}
