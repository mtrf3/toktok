package X;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class PPK implements J2V {
    public final /* synthetic */ java.util.Map LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ JSONObject LIZLLL;
    public final /* synthetic */ int LJ;
    public final /* synthetic */ long LJFF;
    public final /* synthetic */ QH8 LJI;

    @Override // X.J2V
    public final Object LIZ() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        java.util.Map map = this.LIZ;
        if (map != null) {
            try {
                for (Map.Entry entry : map.entrySet()) {
                    jSONObject2.put((String) entry.getKey(), entry.getValue());
                }
            } catch (Throwable unused) {
            }
        }
        try {
            jSONObject.put("appId", this.LJI.LIZIZ.LJIIIZ);
            jSONObject.put("nid", this.LIZIZ);
            jSONObject.put("url", this.LIZJ);
            jSONObject.put("data", this.LIZLLL);
            jSONObject.put("header", jSONObject2);
            jSONObject.put("method", this.LJ);
            jSONObject.put("time", this.LJFF);
        } catch (Throwable unused2) {
        }
        return jSONObject;
    }

    public PPK(QH8 qh8, java.util.Map map, String str, String str2, JSONObject jSONObject, int i, long j) {
        this.LJI = qh8;
        this.LIZ = map;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = jSONObject;
        this.LJ = i;
        this.LJFF = j;
    }
}
