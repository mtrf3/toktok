package X;

import Y.IDCallableS415S0100000_17;
import org.json.JSONObject;

/* loaded from: classes19.dex */
public final class ZUR implements ZU6 {
    public final /* synthetic */ ZUU LIZ;

    public ZUR(ZUU zuu) {
        this.LIZ = zuu;
    }

    public final void LIZIZ(int i, String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("info： ");
        LIZ.append(i);
        LIZ.append(", message: ");
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
        C47261Igj.LJIILJJIL("BytebenchV2");
        switch (i) {
            case 100:
                this.LIZ.LIZLLL = ZUA.INIT;
                return;
            case 101:
                this.LIZ.LIZLLL = ZUA.RUN;
                return;
            case 102:
                this.LIZ.LIZLLL = ZUA.STOP;
                return;
            case 103:
                this.LIZ.LIZLLL = ZUA.LOAD;
                long currentTimeMillis = System.currentTimeMillis() - this.LIZ.LIZJ;
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("cost_time", currentTimeMillis);
                    jSONObject.put("result", 0);
                    jSONObject.put("message", str);
                    C38891fp.LJJII("bytebench_collection_load_task_v2", jSONObject);
                    return;
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                    return;
                }
            case 104:
                this.LIZ.LIZLLL = ZUA.QUITTING;
                this.LIZ.LIZIZ();
                return;
            case 105:
                C89999ZTv.LIZ(new IDCallableS415S0100000_17(this, 3), C89999ZTv.LJ).LIZIZ(new ZUQ(), C89999ZTv.LJFF);
                return;
            default:
                return;
        }
    }

    public final void LIZ(int i, int i2, String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("event： ");
        LIZ.append(i);
        LIZ.append("result: ");
        LIZ.append(i2);
        LIZ.append(", message: ");
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
        C47261Igj.LJJJJZ("BytebenchV2");
        switch (i) {
            case 100:
                this.LIZ.LIZLLL = ZUA.INVALID;
                return;
            case 101:
                this.LIZ.LIZLLL = ZUA.LOAD;
                return;
            case 102:
                this.LIZ.LIZLLL = ZUA.INIT;
                return;
            case 103:
                this.LIZ.LIZLLL = ZUA.INIT;
                long currentTimeMillis = System.currentTimeMillis() - this.LIZ.LIZJ;
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("cost_time", currentTimeMillis);
                    jSONObject.put("result", i2);
                    jSONObject.put("message", str);
                    C38891fp.LJJII("bytebench_collection_load_task_v2", jSONObject);
                    return;
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                    return;
                }
            case 104:
                this.LIZ.LIZIZ();
                this.LIZ.LIZLLL = ZUA.INVALID;
                return;
            default:
                return;
        }
    }
}
