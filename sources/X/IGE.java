package X;

import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class IGE {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Exception exc, String str) {
        PEH.LIZLLL(exc, str);
        C36922EeM.LJFF(exc);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("exception_message", exc.getMessage());
            jSONObject.put("bridge_type", str);
            C09900aA.LJIIJJI("get_search_history_exception", 0, C198517qh.LJFF(jSONObject).LJ());
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }
}
