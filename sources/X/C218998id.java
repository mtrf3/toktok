package X;

import Y.ACallableS31S1100000_3;
import org.json.JSONObject;

/* renamed from: X.8id, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C218998id {
    public static final C5H3 LIZ = C221118m3.LIZ(C219008ie.LJLIL);

    public static final boolean LIZ() {
        return ((Boolean) LIZ.getValue()).booleanValue();
    }

    public static final void LIZIZ(String str, InterfaceC88472Yns<? super JSONObject, C76800UCe> interfaceC88472Yns) {
        Object LIZ2;
        JSONObject jSONObject = new JSONObject();
        try {
            interfaceC88472Yns.invoke(jSONObject);
            LIZ2 = C76800UCe.LIZ;
            C3C5.m7constructorimpl(LIZ2);
        } catch (Throwable th) {
            LIZ2 = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ2);
        }
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ2);
        if (m10exceptionOrNullimpl == null || !LIZ()) {
            if (C3C5.m13isSuccessimpl(LIZ2)) {
                C10K.LIZJ(new ACallableS31S1100000_3(jSONObject, str, 3));
                return;
            }
            return;
        }
        C221018lt.LIZJ("AYEventTracking", "error occurs when assembling mob params", m10exceptionOrNullimpl);
        throw m10exceptionOrNullimpl;
    }
}
