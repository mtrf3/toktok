package X;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.QJn, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66799QJn implements Cloneable {
    public String LJLIL = "";
    public String LJLILLLLZI = "";
    public String LJLJI;
    public String LJLJJI;
    public String LJLJJL;

    /* renamed from: LIZ, reason: merged with bridge method [inline-methods] */
    public final C66799QJn clone() {
        try {
            return (C66799QJn) super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("{d='");
        Q89.LIZIZ(LIZ, this.LJLIL, '\'', ", i='");
        Q89.LIZIZ(LIZ, this.LJLILLLLZI, '\'', ", o='");
        Q89.LIZIZ(LIZ, this.LJLJI, '\'', ", c='");
        Q89.LIZIZ(LIZ, this.LJLJJI, '\'', ", s='");
        return C77800Ug8.LIZJ(LIZ, this.LJLJJL, '\'', '}', LIZ);
    }

    public static C66799QJn LIZIZ(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            C66799QJn c66799QJn = new C66799QJn();
            c66799QJn.LJLIL = jSONObject.optString("did", "");
            c66799QJn.LJLILLLLZI = jSONObject.optString("iid", "");
            c66799QJn.LJLJI = jSONObject.optString("openudid", "");
            c66799QJn.LJLJJI = jSONObject.optString("cliend_udid", "");
            c66799QJn.LJLJJL = jSONObject.optString("ssid", "");
            return c66799QJn;
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }
}
