package X;

import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class QHD implements J2V {
    public final /* synthetic */ QHA LIZ;
    public final /* synthetic */ QH9 LIZIZ;

    @Override // X.J2V
    public final Object LIZ() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("appId", this.LIZIZ.LJIIL.LJIIIZ);
            jSONObject.put("config", this.LIZ.LJFF);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    public QHD(QH9 qh9, QHA qha) {
        this.LIZIZ = qh9;
        this.LIZ = qha;
    }
}
