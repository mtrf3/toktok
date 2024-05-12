package X;

import Y.ACallableS36S1100000_9;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.L6v, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53729L6v {
    public static final int LIZ(String str) {
        if (o.LJ(str, "homepage_friends")) {
            return C52215KeR.LIZ();
        }
        if (o.LJ(str, "homepage_follow")) {
            return C52219KeV.LIZ();
        }
        return -1;
    }

    public static final void LIZIZ(String str, InterfaceC88472Yns<? super JSONObject, C76800UCe> interfaceC88472Yns) {
        JSONObject jSONObject = new JSONObject();
        interfaceC88472Yns.invoke(jSONObject);
        C10K.LIZJ(new ACallableS36S1100000_9(jSONObject, str, 4));
    }
}
