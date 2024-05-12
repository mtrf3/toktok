package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.OHc, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61640OHc extends AbstractC61642OHe {
    public final List<String> LIZIZ;

    public C61640OHc() {
        super(EnumC61643OHf.ENTRY_VERIFY);
        this.LIZIZ = new ArrayList();
    }

    @Override // X.InterfaceC61646OHi
    public final C66300Q0i LIZ(OHW context) {
        o.LJIIJ(context, "context");
        Object obj = ((LinkedHashMap) context.LIZ).get("methodName");
        if (obj == null) {
            obj = context.LIZJ;
        }
        if ((!((ArrayList) this.LIZIZ).isEmpty()) && obj != null) {
            Iterator it = ((ArrayList) this.LIZIZ).iterator();
            boolean z = false;
            while (it.hasNext()) {
                if (o.LJ(obj, it.next())) {
                    z = true;
                }
            }
            if (!z) {
                throw new Q0C(-2001, "entryToken verify fail");
            }
        }
        return new C66300Q0i(0, null, 7);
    }

    @Override // X.AbstractC61642OHe
    public final void LIZIZ(JSONObject jSONObject) {
        JSONArray optJSONArray;
        if (jSONObject != null && (optJSONArray = jSONObject.optJSONArray("allowList")) != null) {
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                List<String> list = this.LIZIZ;
                String optString = optJSONArray.optString(i);
                o.LJFF(optString, "optString(i)");
                ((ArrayList) list).add(optString);
            }
        }
    }
}
