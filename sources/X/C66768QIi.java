package X;

import org.json.JSONObject;

/* renamed from: X.QIi, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66768QIi implements J2V {
    public final /* synthetic */ QI6 LIZ;

    @Override // X.J2V
    public final Object LIZ() {
        JSONObject jSONObject = new JSONObject();
        QB0.LIZIZ(this.LIZ.LIZLLL, jSONObject);
        try {
            jSONObject.put("appId", this.LIZ.LJFF.LJIIIZ);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    public C66768QIi(QI6 qi6) {
        this.LIZ = qi6;
    }
}
