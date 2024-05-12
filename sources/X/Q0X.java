package X;

import com.bytedance.bpea.basics.Cert;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class Q0X implements InterfaceC66311Q0t {
    @Override // X.InterfaceC66311Q0t
    public final String name() {
        return "LegalChecker";
    }

    @Override // X.InterfaceC66311Q0t
    public final C66300Q0i LIZ(OHW context) {
        String certToken;
        Object obj;
        o.LJIIJ(context, "context");
        Cert cert = context.LIZIZ;
        if (cert == null || (certToken = cert.certToken()) == null || certToken.length() == 0) {
            C66300Q0i c66300Q0i = new C66300Q0i(-1000, "empty cert!", 4);
            c66300Q0i.LIZ = true;
            c66300Q0i.LIZIZ = true;
            return c66300Q0i;
        }
        try {
            cert.validate(context);
            JSONObject LIZ = Q0J.LIZ(cert);
            C66300Q0i c66300Q0i2 = new C66300Q0i(0, null, 7);
            C78923UyF.LIZLLL(c66300Q0i2, "factInfo", LIZ);
            if (LIZ != null) {
                JSONArray optJSONArray = LIZ.optJSONArray("dataTypes");
                if (optJSONArray != null && !C78688UuS.LJII(optJSONArray, context.LIZLLL)) {
                    c66300Q0i2.LIZLLL = -1002;
                    c66300Q0i2.LJ = "fact check fail, dataTypes not match";
                    c66300Q0i2.LIZ = true;
                    return c66300Q0i2;
                }
                JSONObject optJSONObject = LIZ.optJSONObject("params");
                if (optJSONObject != null && (obj = ((LinkedHashMap) context.LIZ).get("params")) != null && (obj instanceof JSONObject)) {
                    JSONObject jSONObject = (JSONObject) obj;
                    Iterator<String> keys = jSONObject.keys();
                    while (true) {
                        if (!keys.hasNext()) {
                            break;
                        }
                        String next = keys.next();
                        Object opt = jSONObject.opt(next);
                        JSONArray optJSONArray2 = optJSONObject.optJSONArray(next);
                        if (opt != null && (opt instanceof Object[]) && optJSONArray2 != null && !C78688UuS.LJII(optJSONArray2, (Object[]) opt)) {
                            c66300Q0i2.LIZLLL = -1003;
                            c66300Q0i2.LJ = "fact check fail, params not match";
                            c66300Q0i2.LIZ = true;
                            break;
                        }
                    }
                }
            }
            return c66300Q0i2;
        } catch (Q0C e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("cert content illegal:");
            LIZ2.append(e.getErrorMsg());
            C66300Q0i c66300Q0i3 = new C66300Q0i(-1001, X1D.LIZIZ(LIZ2), 4);
            c66300Q0i3.LIZ = true;
            return c66300Q0i3;
        }
    }
}
