package X;

import com.bytedance.common.utility.Logger;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class QF8 extends QF9 {
    public final /* synthetic */ java.util.Map LJLJJI;
    public final /* synthetic */ List LJLJJL;
    public final /* synthetic */ QFB LJLJJLL;

    public final void LIZ() {
        Iterator it = ((ConcurrentHashMap) this.LJLJJLL.LJFF).entrySet().iterator();
        while (it.hasNext()) {
            if (!((Boolean) ((Map.Entry) it.next()).getValue()).booleanValue()) {
                int incrementAndGet = this.LJLJJLL.LIZJ.incrementAndGet();
                Logger.debug();
                this.LJLJJLL.LIZ();
                this.LJLJJLL.LIZIZ.set(false);
                this.LJLJJLL.LIZJ(this.LJLJJL, this.LJLJJI);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("retry_attempts", incrementAndGet);
                    jSONObject.put("reason", "connect timeout fallback");
                    this.LJLJJLL.getClass();
                    jSONObject.put("report_type", 1);
                    jSONObject.put("report_time", System.currentTimeMillis());
                    Logger.debug();
                    C66653QDx.LIZIZ().LIZJ(jSONObject.toString(), "private_protocol");
                    return;
                } catch (JSONException e) {
                    C16880lQ.LLLLIIL(e);
                    return;
                }
            }
        }
        this.LJLJJLL.LIZJ.set(0);
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QF8(QFB qfb, String str, java.util.Map map, List list) {
        super(10000L, str);
        this.LJLJJLL = qfb;
        this.LJLJJI = map;
        this.LJLJJL = list;
    }
}
