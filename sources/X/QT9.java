package X;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class QT9 implements QTA {
    public C64009PAf LIZ;
    public final QT7 LIZIZ;

    public QT9() {
        C16880lQ.LJLLJ(QT9.class);
        this.LIZIZ = new QT7();
    }

    public final void LIZ(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        if (this.LIZ == null) {
            QT7 qt7 = this.LIZIZ;
            if (qt7.LIZ == null) {
                synchronized (qt7) {
                    if (qt7.LIZ == null) {
                        qt7.LIZ = qt7.LIZ();
                    }
                }
            }
            this.LIZ = qt7.LIZ;
        }
        int i = ((C78261UnZ) C78273Unl.LJIIIZ().LIZ()).LIZ.LJIILIIL.LJIIIIZZ;
        if (((C78261UnZ) C78273Unl.LJIIIZ().LIZ()).LIZ.LJIIIIZZ) {
            JSONObject jSONObject4 = new JSONObject();
            try {
                jSONObject4.put("event_name", str);
                jSONObject4.put("category", jSONObject);
                jSONObject4.put("metric", jSONObject2);
                jSONObject4.put("extra", jSONObject3);
                jSONObject4.put("order_platform", i);
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
            C39670Fha LJ = C78273Unl.LJIIIZ().LJ();
            jSONObject4.toString();
            LJ.getClass();
        }
        if (jSONObject3 == null) {
            jSONObject3 = new JSONObject();
        }
        try {
            jSONObject3.put("order_platform", i);
        } catch (JSONException e2) {
            C16880lQ.LLLLIIL(e2);
        }
        C64009PAf c64009PAf = this.LIZ;
        if (c64009PAf != null) {
            c64009PAf.LJIIJ(str, jSONObject, jSONObject2, jSONObject3);
        }
    }
}
