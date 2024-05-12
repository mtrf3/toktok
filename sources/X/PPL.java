package X;

import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class PPL implements J2V {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ Object LIZIZ;
    public final /* synthetic */ QI3 LIZJ;

    @Override // X.J2V
    public final Object LIZ() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put("appId", this.LIZJ.LJIIIZ);
            jSONObject2.put(this.LIZ, this.LIZIZ);
            jSONObject.put("config", jSONObject2);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    public PPL(QI3 qi3, String str, Object obj) {
        this.LIZJ = qi3;
        this.LIZ = str;
        this.LIZIZ = obj;
    }
}
