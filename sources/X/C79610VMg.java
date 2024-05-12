package X;

import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: X.VMg, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79610VMg {
    public final JSONObject LIZ;
    public final JSONObject LIZIZ;
    public final JSONObject LIZJ;
    public final JSONObject LIZLLL;
    public final JSONObject LJ;

    public C79610VMg(String str) {
        JSONObject LJJJLL = C77123UOp.LJJJLL(str);
        this.LIZ = C77123UOp.LJJJJJ("apmReportConfig", LJJJLL);
        this.LIZIZ = C77123UOp.LJJJJJ("performanceReportConfig", LJJJLL);
        this.LIZJ = C77123UOp.LJJJJJ("errorMsgReportConfig", LJJJLL);
        this.LIZLLL = C77123UOp.LJJJJJ("resourceTimingReportConfig", LJJJLL);
        this.LJ = C77123UOp.LJJJJJ("commonReportConfig", LJJJLL);
    }

    public static void LIZ(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject2 == null) {
            return;
        }
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            C77123UOp.LJJJLIIL(jSONObject, next, C77123UOp.LJJJJJL(next, jSONObject2));
        }
    }
}
