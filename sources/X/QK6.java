package X;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class QK6 extends QKR {
    public final QIF LJ;

    public QK6(QIF qif) {
        super(true, true);
        this.LJ = qif;
    }

    @Override // X.QKR
    public final boolean LIZ(JSONObject jSONObject) {
        String str;
        try {
            EnumC86802Y4w enumC86802Y4w = this.LJ.LJJIIJ;
            if (enumC86802Y4w != null) {
                str = enumC86802Y4w.getLower();
            } else {
                str = null;
            }
            jSONObject.put("device_category", str);
            return true;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
}
