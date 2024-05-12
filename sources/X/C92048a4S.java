package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.a4S, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public class C92048a4S {
    public final String LIZ;
    public final long LIZIZ;
    public long LIZJ;

    public C92048a4S(String pageID) {
        o.LJIIIZ(pageID, "pageID");
        this.LIZ = pageID;
        this.LIZIZ = C92047a4R.LIZ();
    }

    public final void LIZ(String eventName, JSONObject jSONObject) {
        o.LJIIIZ(eventName, "eventName");
        jSONObject.put("click_use_time", C92047a4R.LIZ() - this.LIZJ);
        LIZJ(eventName, jSONObject);
    }

    public final void LIZIZ(String eventName, EnumC92041a4L finishType) {
        o.LJIIIZ(eventName, "eventName");
        o.LJIIIZ(finishType, "finishType");
        long LIZ = C92047a4R.LIZ() - this.LIZJ;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("finish_type", finishType.getType());
        jSONObject.put("stay_time", LIZ);
        LIZJ(eventName, jSONObject);
    }

    public final void LIZJ(String eventName, JSONObject content) {
        o.LJIIIZ(eventName, "eventName");
        o.LJIIIZ(content, "content");
        try {
            content.put("timestamp", C92047a4R.LIZ());
            content.put("page_id", this.LIZ);
            C92046a4Q.LIZ(eventName, content);
        } catch (Throwable unused) {
        }
    }

    public final void LIZLLL(String eventName, JSONObject jSONObject) {
        o.LJIIIZ(eventName, "eventName");
        long LIZ = C92047a4R.LIZ();
        this.LIZJ = LIZ;
        jSONObject.put("render_cost", LIZ - this.LIZIZ);
        LIZJ(eventName, jSONObject);
    }
}
