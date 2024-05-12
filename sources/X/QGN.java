package X;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class QGN extends QGE {
    public static final QGO LIZLLL = (QGO) C81814W9a.LJIIJ().LIZIZ.LJJIJIIJIL.LIZ();

    @Override // X.UF5, X.InterfaceC81754W6s
    public final void LJIIJ(W5O w5o, Object obj, String str, boolean z) {
        QGO qgo = LIZLLL;
        if (qgo != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(obj);
            LIZ.append("@@");
            LIZ.append(qgo.LIZ());
            obj = X1D.LIZIZ(LIZ);
        }
        long currentTimeMillis = System.currentTimeMillis();
        C81939WDv.LIZIZ();
        QGH qgh = new QGH();
        qgh.LIZ = currentTimeMillis;
        qgh.LIZLLL = obj;
        if (!TextUtils.isEmpty(str)) {
            JSONObject jSONObject = new JSONObject();
            if (QGG.LIZLLL) {
                try {
                    jSONObject.put("image_monitor_data", new JSONObject());
                } catch (JSONException e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
            qgh.LIZJ = jSONObject;
        }
        this.LIZ.put(str, qgh);
        C81939WDv.LIZIZ();
    }
}
