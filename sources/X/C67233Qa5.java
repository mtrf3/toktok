package X;

import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: X.Qa5, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67233Qa5 {
    public long LIZ;
    public long LIZIZ;
    public int LIZJ;
    public long LIZLLL;
    public String LJ = "";
    public String LJFF = "";
    public String LJI = "";

    public static java.util.Map<String, String> LIZ(C67233Qa5 c67233Qa5) {
        HashMap hashMap = new HashMap();
        hashMap.put("push_label", c67233Qa5.LJ);
        hashMap.put("rule_id", String.valueOf(c67233Qa5.LIZ));
        hashMap.put("aggregate_num", c67233Qa5.LJFF);
        hashMap.put("itemid", c67233Qa5.LJI);
        hashMap.put("revoke_type", String.valueOf(c67233Qa5.LIZJ));
        return hashMap;
    }

    public static C67233Qa5 LIZIZ(JSONObject jSONObject) {
        C67233Qa5 c67233Qa5 = new C67233Qa5();
        c67233Qa5.LIZ = jSONObject.optLong("rid", 0L);
        c67233Qa5.LIZIZ = jSONObject.optLong("revoke_id", 0L);
        c67233Qa5.LIZJ = jSONObject.optInt("revoke_type", 0);
        c67233Qa5.LIZLLL = jSONObject.optLong("ts", 0L);
        c67233Qa5.LJ = jSONObject.optString("push_label", "");
        c67233Qa5.LJFF = jSONObject.optString("aggregate_num", "");
        c67233Qa5.LJI = jSONObject.optString("itemid", "");
        return c67233Qa5;
    }
}
