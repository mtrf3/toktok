package X;

import java.util.Iterator;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.OHa, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61638OHa extends AbstractC61642OHe {
    public JSONObject LIZIZ;

    public C61638OHa() {
        super(EnumC61643OHf.CONFIG);
    }

    @Override // X.InterfaceC61646OHi
    public final C66300Q0i LIZ(OHW context) {
        JSONObject optJSONObject;
        o.LJIIJ(context, "context");
        C66300Q0i c66300Q0i = new C66300Q0i(0, null, 7);
        JSONObject jSONObject = this.LIZIZ;
        if (jSONObject != null && (optJSONObject = jSONObject.optJSONObject("configuration")) != null) {
            long nanoTime = System.nanoTime();
            JSONObject jSONObject2 = new JSONObject();
            Iterator<String> keys = optJSONObject.keys();
            o.LJFF(keys, "originJSON.keys()");
            while (keys.hasNext()) {
                String next = keys.next();
                jSONObject2.put(next, optJSONObject.get(next));
            }
            long nanoTime2 = System.nanoTime() - nanoTime;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("copyJSON cost time:");
            LIZ.append(nanoTime2 / 1000);
            LIZ.append("us");
            String msg = X1D.LIZIZ(LIZ);
            o.LJIIJ(msg, "msg");
            C78923UyF.LIZIZ(c66300Q0i, jSONObject2);
        }
        return c66300Q0i;
    }

    @Override // X.AbstractC61642OHe
    public final void LIZIZ(JSONObject jSONObject) {
        this.LIZIZ = jSONObject;
    }
}
