package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.EuI, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37910EuI {
    public static C37911EuJ LIZ(int i, String msg, JSONObject jSONObject) {
        o.LJIIJ(msg, "msg");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("code", i);
        jSONObject2.put("msg", msg);
        jSONObject2.put("data", jSONObject);
        return new C37911EuJ(jSONObject2);
    }
}
