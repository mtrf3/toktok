package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.HKc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43882HKc {
    public static final InterfaceC170656mr LIZ = C60903NvH.LJIIJJI().LJJIIZI();

    public static final void LIZIZ(String logtype, JSONObject jSONObject) {
        o.LJIIIZ(logtype, "logtype");
        LIZ.LJIJ(logtype, jSONObject);
    }

    public static final void LIZ(String str, String str2, JSONObject jSONObject) {
        LIZ.LJIILLIIL(str, str2, jSONObject);
    }

    public static final void LIZJ(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        LIZ.LJIILIIL(str, jSONObject, jSONObject2);
    }

    public static final void LJ(String str, int i, JSONObject jSONObject) {
        LIZLLL(i, str, jSONObject, true);
    }

    public static final void LIZLLL(int i, String serviceName, JSONObject jSONObject, boolean z) {
        o.LJIIIZ(serviceName, "serviceName");
        LIZ.LJFF(serviceName, i, jSONObject, Boolean.valueOf(z));
    }
}
