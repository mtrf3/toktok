package X;

import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class QHF implements J2V {
    public final /* synthetic */ QI4 LIZ;
    public final /* synthetic */ N3D LIZIZ;

    @Override // X.J2V
    public final Object LIZ() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("appId", this.LIZ.LJLJI.LJIIIZ);
            jSONObject.put("config", this.LIZIZ.LIZIZ);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    public QHF(QI4 qi4, N3D n3d) {
        this.LIZ = qi4;
        this.LIZIZ = n3d;
    }
}
