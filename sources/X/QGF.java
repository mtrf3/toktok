package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class QGF implements QG3 {
    public final /* synthetic */ QGE LIZ;

    public QGF(QGE qge) {
        this.LIZ = qge;
    }

    @Override // X.QG3
    public final void LIZIZ(long j, long j2, QGL qgl, C64672PZs c64672PZs, JSONObject jSONObject) {
        LIZJ(j, j2, qgl, c64672PZs, null, jSONObject);
    }

    @Override // X.QG3
    public final void LIZ(long j, long j2, QGL qgl, C64672PZs c64672PZs, Throwable th, JSONObject jSONObject) {
        LIZJ(j, j2, qgl, c64672PZs, th, jSONObject);
    }

    public final void LIZJ(long j, long j2, QGL qgl, C64672PZs c64672PZs, Throwable th, JSONObject jSONObject) {
        int i;
        long j3;
        Object remove = jSONObject.remove("requestId");
        Object remove2 = jSONObject.remove("retryCount");
        Object remove3 = jSONObject.remove("queue_time");
        Object remove4 = jSONObject.remove("fetch_time");
        Iterator it = ((ArrayList) QGG.LIZ).iterator();
        while (it.hasNext()) {
            QGM qgm = (QGM) it.next();
            if (qgm != null) {
                qgm.LIZ();
            }
        }
        try {
            if (remove instanceof String) {
                String str = (String) remove;
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                if (remove2 instanceof Integer) {
                    i = ((Integer) remove2).intValue();
                } else {
                    i = -1;
                }
                long j4 = -1;
                if (remove3 instanceof Long) {
                    j3 = ((Long) remove3).longValue();
                } else {
                    j3 = -1;
                }
                if (remove4 instanceof Long) {
                    j4 = ((Long) remove4).longValue();
                }
                QGH qgh = this.LIZ.LIZ.get(str);
                if (qgh == null) {
                    return;
                }
                JSONObject jSONObject2 = qgh.LIZJ;
                jSONObject2.put("is_request_network", true);
                jSONObject2.put("http_status", jSONObject.optInt("http_status", 0));
                jSONObject2.put("retry_count", i);
                jSONObject2.put("queue_duration", j3);
                jSONObject2.put("download_duration", j4);
                QGE.LJIJ(c64672PZs, jSONObject2);
                QGE.LJIJI(qgl, jSONObject2);
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }
}
