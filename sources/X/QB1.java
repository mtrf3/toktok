package X;

import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class QB1 implements J2V {
    public final /* synthetic */ JSONObject LIZ;
    public final /* synthetic */ QH8 LIZIZ;

    @Override // X.J2V
    public final Object LIZ() {
        JSONObject jSONObject = new JSONObject();
        QB0.LIZIZ(this.LIZ, jSONObject);
        try {
            jSONObject.put("appId", this.LIZIZ.LIZIZ.LJIIIZ);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    public QB1(QH8 qh8, JSONObject jSONObject) {
        this.LIZIZ = qh8;
        this.LIZ = jSONObject;
    }
}
