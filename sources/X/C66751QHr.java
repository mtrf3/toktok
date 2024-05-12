package X;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.QHr, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66751QHr implements J2V {
    public final /* synthetic */ Object LIZ;

    @Override // X.J2V
    public final Object LIZ() {
        JSONObject LJIILIIL = ((QI2) this.LIZ).LJIILIIL();
        JSONObject jSONObject = new JSONObject();
        QB0.LIZIZ(LJIILIIL, jSONObject);
        try {
            jSONObject.put("$$APP_ID", ((QI2) this.LIZ).LJLLJ);
            jSONObject.put("$$EVENT_TYPE", QI0.LIZ((QI2) this.LIZ));
            jSONObject.put("$$EVENT_LOCAL_ID", ((QI2) this.LIZ).LJLZ);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public C66751QHr(Object obj) {
        this.LIZ = obj;
    }
}
