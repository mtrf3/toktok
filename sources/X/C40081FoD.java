package X;

import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.FoD, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40081FoD extends AbstractC65781Prl implements InterfaceC88471Ynr<JSONObject, String, Object> {
    public static final C40081FoD LJLIL = new C40081FoD();

    public C40081FoD() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(JSONObject jSONObject, String str) {
        JSONObject self = jSONObject;
        String k = str;
        o.LJIIJ(self, "self");
        o.LJIIJ(k, "k");
        Object LJ = C40082FoE.LJ(self, k);
        if (LJ instanceof Boolean) {
            return String.valueOf(LJ);
        }
        if (LJ instanceof Object[]) {
            return ORY.LJJJJLL((Object[]) LJ, null, null, null, null, 63);
        }
        if (LJ instanceof java.util.Map) {
            return new JSONObject((java.util.Map) LJ).toString();
        }
        if (LJ instanceof JSONObject) {
            return LJ.toString();
        }
        if (!(LJ instanceof JSONArray)) {
            return LJ;
        }
        return LJ.toString();
    }
}
