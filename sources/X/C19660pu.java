package X;

import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.0pu */
/* loaded from: classes.dex */
public final class C19660pu {
    public static final java.util.Map<String, Object> LIZ = C113554cx.LJJLIIIIJ(new OSZ("livesdk_har_status", -1), new OSZ("livesdk_ohr_status", 0));

    public static /* synthetic */ void LIZJ(String str) {
        LIZIZ(str, new JSONObject());
    }

    public static void LIZIZ(String str, JSONObject value) {
        o.LJIIIZ(value, "value");
        C0IT.LIZIZ(new C524223y(value, str), C46661sM.LJLIL);
    }

    public static void LIZ(String str, java.util.Map map, Object obj) {
        try {
            JSONObject jSONObject = new JSONObject(C09650Zl.LIZIZ.LJIILL(obj));
            java.util.Set<Map.Entry> entrySet = map.entrySet();
            if (entrySet != null) {
                for (Map.Entry entry : entrySet) {
                    jSONObject.putOpt((String) entry.getKey(), entry.getValue());
                }
            }
            LIZIZ(str, jSONObject);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }
}
