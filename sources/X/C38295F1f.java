package X;

import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import org.json.JSONObject;

/* renamed from: X.F1f, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38295F1f implements Handler.Callback {
    public final /* synthetic */ C38048EwW LJLIL;
    public final /* synthetic */ C38297F1h LJLILLLLZI;

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        JSONObject jSONObject;
        int i = message.what;
        if (i == 25 || i == 32 || i == 33 || i == 34) {
            Object obj = message.obj;
            if (obj == null) {
                return true;
            }
            try {
                JSONObject jSONObject2 = (JSONObject) obj;
                C38297F1h c38297F1h = this.LJLILLLLZI;
                if (c38297F1h.LJ != null) {
                    F1F f1f = new F1F(c38297F1h.LJIIIIZZ, c38297F1h.LIZ(c38297F1h.LJII, c38297F1h.LJIIIZ), this.LJLILLLLZI.LJIIJ);
                    if (jSONObject2 != null && jSONObject2.has("response")) {
                        jSONObject = jSONObject2.optJSONObject("response");
                    } else {
                        jSONObject = null;
                    }
                    C38297F1h c38297F1h2 = this.LJLILLLLZI;
                    c38297F1h2.LJ.LIZ(f1f, new F1E(c38297F1h2.LJIILJJIL, jSONObject));
                }
                C38297F1h c38297F1h3 = this.LJLILLLLZI;
                if (c38297F1h3.LIZJ != null && !TextUtils.isEmpty(c38297F1h3.LJI) && !this.LJLIL.LJII.booleanValue()) {
                    C38297F1h c38297F1h4 = this.LJLILLLLZI;
                    c38297F1h4.LIZJ.LIZLLL(c38297F1h4.LJI, jSONObject2);
                    return false;
                }
                F1M f1m = this.LJLILLLLZI.LIZLLL;
                if (f1m != null) {
                    f1m.LIZ(jSONObject2);
                    return false;
                }
                return false;
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
                return false;
            }
        }
        return false;
    }

    public C38295F1f(C38297F1h c38297F1h, C38048EwW c38048EwW) {
        this.LJLILLLLZI = c38297F1h;
        this.LJLIL = c38048EwW;
    }
}
