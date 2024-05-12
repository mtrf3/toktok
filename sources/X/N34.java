package X;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class N34 extends QKR {
    public final QIF LJ;

    public N34(QIF qif) {
        super(false, true);
        this.LJ = qif;
    }

    @Override // X.QKR
    public final boolean LIZ(JSONObject jSONObject) {
        java.util.Map<String, Object> map = this.LJ.LJIILJJIL;
        if (map != null) {
            try {
                if (!map.isEmpty()) {
                    for (Map.Entry<String, Object> entry : map.entrySet()) {
                        if (entry != null) {
                            jSONObject.put(entry.getKey(), entry.getValue());
                        }
                    }
                    return true;
                }
                return true;
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
                return true;
            }
        }
        return true;
    }
}
