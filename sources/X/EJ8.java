package X;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class EJ8 {
    public static final ConcurrentHashMap<EJA, EJ9> LIZ = new ConcurrentHashMap<>();

    public static String LIZ() {
        JSONObject jSONObject = new JSONObject();
        Iterator LIZLLL = C47135Ieh.LIZLLL(LIZ, "paramMap.values");
        while (LIZLLL.hasNext()) {
            try {
                OSZ<String, String> param = ((EJ9) LIZLLL.next()).getParam();
                if (param != null && param.getSecond() != null) {
                    jSONObject.put(param.getFirst(), param.getSecond());
                }
            } catch (Exception unused) {
            }
        }
        String jSONObject2 = jSONObject.toString();
        o.LJIIIIZZ(jSONObject2, "jsonObject.toString()");
        return jSONObject2;
    }
}
