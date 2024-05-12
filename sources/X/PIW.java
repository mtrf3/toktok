package X;

import android.os.StatFs;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class PIW {
    public static JSONObject LIZ() {
        long j;
        JSONObject jSONObject = new JSONObject();
        try {
            long j2 = 0;
            try {
                j = new StatFs(C16880lQ.LLIIJLIL(PK0.LIZ).getPath()).getFreeBytes();
            } catch (Throwable unused) {
                j = 0;
            }
            jSONObject.put("inner_free_real", j);
            try {
                j2 = new StatFs(C16880lQ.LLIIJLIL(PK0.LIZ).getPath()).getTotalBytes();
            } catch (Throwable unused2) {
            }
            jSONObject.put("inner_total_real", j2);
        } catch (Throwable unused3) {
        }
        return jSONObject;
    }
}
