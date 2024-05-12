package X;

import com.bytedance.bpea.basics.Cert;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class Q0J {
    public static JSONObject LIZ;

    public static JSONObject LIZ(Cert cert) {
        boolean z;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        o.LJIIJ(cert, "cert");
        String certToken = cert.certToken();
        if (certToken == null || certToken.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || (jSONObject = LIZ) == null || !jSONObject.has(certToken) || (jSONObject2 = LIZ) == null) {
            return null;
        }
        return jSONObject2.optJSONObject(certToken);
    }
}
