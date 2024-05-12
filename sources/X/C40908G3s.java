package X;

import org.json.JSONObject;

/* renamed from: X.G3s, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40908G3s {
    public static G41 LIZ;
    public static C40912G3w LIZIZ;
    public static C39388Fd2 LIZJ;
    public static JSONObject LIZLLL;

    public static void LIZ() {
        C40912G3w c40912G3w = LIZIZ;
        if (c40912G3w == null) {
            return;
        }
        JSONObject jSONObject = LIZLLL;
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        C38458F7m c38458F7m = new C38458F7m();
        c38458F7m.LIZ = "patch_load_event";
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("duration", c40912G3w.LIZIZ - c40912G3w.LIZ);
        c38458F7m.LIZJ = jSONObject2;
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("type", c40912G3w.LIZJ);
        jSONObject3.put("from", c40912G3w.LIZLLL);
        jSONObject3.put("load_status", c40912G3w.LJII);
        jSONObject3.put("locale", O5Y.LJJJJJ(c40912G3w.LJ));
        c38458F7m.LIZIZ = jSONObject3;
        jSONObject.put("path", c40912G3w.LJFF);
        jSONObject.put("content", c40912G3w.LJI);
        jSONObject.put("exception_message", c40912G3w.LJIIIIZZ);
        c38458F7m.LIZLLL = jSONObject;
        C09900aA.LJII(new C38459F7n(c38458F7m));
        LIZIZ = new C40912G3w();
    }
}
