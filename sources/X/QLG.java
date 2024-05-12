package X;

import com.ss.android.common.applog.AppLog;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class QLG {
    public long LIZ;
    public String LIZIZ;
    public boolean LIZJ;
    public String LIZLLL;
    public boolean LJ;
    public String LJFF;
    public long LJI;
    public long LJII;
    public long LJIIIIZZ;

    public final String LIZ() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("start_time", this.LIZ);
            jSONObject.put("session_id", this.LIZIZ);
            jSONObject.put("is_front_continuous", this.LIZJ);
            jSONObject.put("front_session_id", this.LIZLLL);
            jSONObject.put("is_end_continuous", this.LJ);
            jSONObject.put("end_session_id", this.LJFF);
            jSONObject.put("latest_end_time", this.LJI);
            jSONObject.put("non_task_time", this.LJII);
            jSONObject.put("tea_event_index", this.LJIIIIZZ);
            return jSONObject.toString();
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
            return "";
        }
    }

    public final String toString() {
        return LIZ();
    }

    public QLG() {
    }

    public QLG(long j) {
        this.LIZ = j;
        this.LIZIZ = AppLog.genSession();
        this.LJIIIIZZ = AppLog.genEventIndex();
    }
}
