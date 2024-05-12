package X;

import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class QHX implements J2V {
    public final /* synthetic */ QI4 LIZ;

    @Override // X.J2V
    public final Object LIZ() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("appId", this.LIZ.LJLJI.LJIIIZ);
            jSONObject.put("isMainProcess", this.LIZ.LJLJJI.LIZLLL());
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    public QHX(QI4 qi4) {
        this.LIZ = qi4;
    }
}
