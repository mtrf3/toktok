package X;

import android.content.Context;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class QKK extends QKR {
    public final Context LJ;

    public QKK(Context context) {
        super(true, true);
        this.LJ = context;
    }

    @Override // X.QKR
    public final boolean LIZ(JSONObject jSONObject) {
        C36860EdM.LJFF("access", C16880lQ.LLJILJILJ(this.LJ), jSONObject);
        return true;
    }
}
