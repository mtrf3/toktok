package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Uf9, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77739Uf9 implements InterfaceC77746UfG {
    public static final C77739Uf9 LIZ = new C77739Uf9();

    @Override // X.InterfaceC77746UfG
    public final void LIZ(EnumC77742UfC monitorType, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4) {
        o.LJIIIZ(monitorType, "monitorType");
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        if (jSONObject3 == null) {
            jSONObject3 = new JSONObject();
        }
        int i = C77741UfB.LIZ[monitorType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                C0K2.LJ(str, jSONObject, jSONObject2, jSONObject3);
                if (jSONObject4 != null) {
                    BZI LIZ2 = C28787BRn.LIZ(str);
                    LIZ2.LJJ(jSONObject4);
                    LIZ2.LJJIIJZLJL();
                    return;
                } else {
                    BZI LIZ3 = C28787BRn.LIZ(str);
                    LIZ3.LJJ(jSONObject);
                    LIZ3.LJJ(jSONObject2);
                    LIZ3.LJJ(jSONObject3);
                    LIZ3.LJJIIJZLJL();
                    return;
                }
            }
            if (jSONObject4 != null) {
                BZI LIZ4 = C28787BRn.LIZ(str);
                LIZ4.LJJ(jSONObject4);
                LIZ4.LJJIIJZLJL();
                return;
            } else {
                BZI LIZ5 = C28787BRn.LIZ(str);
                LIZ5.LJJ(jSONObject);
                LIZ5.LJJ(jSONObject2);
                LIZ5.LJJ(jSONObject3);
                LIZ5.LJJIIJZLJL();
                return;
            }
        }
        C0K2.LJ(str, jSONObject, jSONObject2, jSONObject3);
    }
}
