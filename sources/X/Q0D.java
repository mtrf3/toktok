package X;

import com.bytedance.bpea.basics.Cert;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public abstract class Q0D implements InterfaceC61649OHl {
    public JSONObject LIZ;
    public JSONObject LIZIZ;
    public JSONObject LIZJ;

    public abstract String LIZLLL(Cert cert);

    @Override // X.InterfaceC61649OHl
    public final JSONArray LIZ(String limitId) {
        o.LJIIJ(limitId, "limitId");
        JSONObject jSONObject = this.LIZIZ;
        if (jSONObject != null) {
            return jSONObject.optJSONArray(limitId);
        }
        return null;
    }

    @Override // X.InterfaceC61649OHl
    public final String LIZIZ(Cert cert) {
        String LIZLLL = LIZLLL(cert);
        JSONObject jSONObject = this.LIZ;
        if (jSONObject != null) {
            return jSONObject.optString(LIZLLL);
        }
        return null;
    }

    @Override // X.InterfaceC61649OHl
    public final String LIZJ(String str) {
        JSONObject jSONObject = this.LIZJ;
        if (jSONObject != null) {
            return jSONObject.optString(str);
        }
        return null;
    }
}
