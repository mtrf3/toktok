package X;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class OHU implements InterfaceC66311Q0t {
    public final JSONObject LIZ;

    @Override // X.InterfaceC66311Q0t
    public final String name() {
        return "AccuracyChecker";
    }

    public OHU() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("location_mode", 0);
        jSONObject.put("enable_h3", true);
        this.LIZ = jSONObject;
    }

    @Override // X.InterfaceC66311Q0t
    public final C66300Q0i LIZ(OHW context) {
        o.LJIIIZ(context, "context");
        Object obj = null;
        C66300Q0i c66300Q0i = new C66300Q0i(0, null, 7);
        String[] strArr = context.LIZLLL;
        if (strArr != null && ORY.LJJIJIIJIL("location", strArr)) {
            Object obj2 = ((LinkedHashMap) context.LIZ).get("certConfig");
            if (obj2 instanceof JSONObject) {
                obj = obj2;
            }
            JSONObject jSONObject = (JSONObject) obj;
            if (jSONObject != null && jSONObject.has("location_mode")) {
                InterfaceC58609MzN interfaceC58609MzN = EP3.LIZIZ;
                if (interfaceC58609MzN != null) {
                    interfaceC58609MzN.LIZ();
                }
                C78923UyF.LIZIZ(c66300Q0i, this.LIZ);
            }
        }
        return c66300Q0i;
    }
}
