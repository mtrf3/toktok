package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class EDN extends EDT {
    public final EDQ LIZIZ;
    public final List<EDO> LIZJ;

    public final String toString() {
        EDQ resultCode = EDQ.SUCCESS;
        o.LJIIIZ(resultCode, "resultCode");
        int value = resultCode.getValue();
        JSONObject jSONObject = new JSONObject();
        String str = this.LIZ;
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        List<EDO> list = this.LIZJ;
        ArrayList arrayList = new ArrayList();
        for (EDO edo : list) {
            if (edo.L() >= value) {
                arrayList.add(edo);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            EDO edo2 = (EDO) it.next();
            jSONObject3.put(edo2.LJLIL, edo2.LJLILLLLZI.getValue());
            if (edo2.L() > value) {
                value = edo2.L();
            }
        }
        jSONObject2.put("errors", jSONObject3);
        jSONObject2.put("result", value);
        jSONObject.put(str, jSONObject2);
        String jSONObject4 = jSONObject.toString();
        o.LJIIIIZZ(jSONObject4, "JSONObject().apply {\n   …  })\n        }.toString()");
        return jSONObject4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EDN(String checker, EDQ resultCode, List<EDO> list) {
        super(checker);
        o.LJIIIZ(checker, "checker");
        o.LJIIIZ(resultCode, "resultCode");
        this.LIZIZ = resultCode;
        this.LIZJ = list;
    }
}
