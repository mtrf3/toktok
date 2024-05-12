package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class IGF {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Exception e, String str) {
        o.LJIIIZ(e, "e");
        PEH.LIZLLL(e, str);
        C36922EeM.LJFF(e);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("exception_message", e.getMessage());
            jSONObject.put("bridge_type", str);
            C09900aA.LJIIJJI("get_search_history_exception", 0, C198517qh.LJFF(jSONObject).LJ());
        } catch (Exception e2) {
            C16880lQ.LLLLIIL(e2);
        }
    }
}
