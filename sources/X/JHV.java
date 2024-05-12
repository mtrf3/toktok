package X;

import com.ss.android.common.lib.AppLogNewUtils;
import java.util.Iterator;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class JHV {
    public long LIZ;
    public int LIZIZ;
    public String LIZJ = "";
    public long LIZLLL;
    public long LJ;
    public long LJFF;
    public int LJI;

    public final void LIZ() {
        if (o.LJ(this, JHW.LIZ) || this.LIZ == 0) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.LJI = (int) (currentTimeMillis - this.LIZ);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("load_lynx_time", this.LJ - this.LIZ);
        jSONObject.put("token_type", this.LIZJ);
        jSONObject.put("load_cover_cost", currentTimeMillis - this.LJFF);
        jSONObject.put("loading_cost", currentTimeMillis - this.LIZLLL);
        jSONObject.put("position", this.LIZIZ);
        jSONObject.put("cost", this.LJI);
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            Object obj = jSONObject.get(keys.next());
            if (((obj instanceof Integer) && ((Number) obj).intValue() < 0) || ((obj instanceof Long) && ((Number) obj).longValue() < 0)) {
                keys.remove();
            }
        }
        AppLogNewUtils.onEventV3("search_trigger_horizontal_monitor", jSONObject);
        FUA.LIZJ("search_trigger_horizontal_monitor", jSONObject);
        this.LIZ = 0L;
    }

    public JHV(String str) {
    }
}
