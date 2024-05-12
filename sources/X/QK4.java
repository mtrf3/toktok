package X;

import android.text.TextUtils;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class QK4 extends QKR {
    public final QIF LJ;

    public QK4(QIF qif) {
        super(true, true);
        this.LJ = qif;
    }

    @Override // X.QKR
    public final boolean LIZ(JSONObject jSONObject) {
        String LIZIZ = JGC.LIZIZ(this.LJ);
        if (!TextUtils.isEmpty(LIZIZ)) {
            jSONObject.put("cdid", LIZIZ);
            return true;
        }
        return false;
    }

    @Override // X.QKR
    public final void LIZIZ(JSONObject jSONObject) {
        jSONObject.remove("cdid");
    }
}
