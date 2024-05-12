package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.FrZ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40289FrZ implements InterfaceC38012Evw {
    public final C38049EwX LJLIL;

    public C40289FrZ(C38049EwX c38049EwX) {
        this.LJLIL = c38049EwX;
    }

    @Override // X.InterfaceC38012Evw
    public final void call(C38048EwW c38048EwW, JSONObject jSONObject) {
        if (c38048EwW == null) {
            return;
        }
        c38048EwW.LJIIJ = false;
        String str = c38048EwW.LIZJ;
        o.LJIIIIZZ(str, "msg.func");
        JSONObject jSONObject2 = c38048EwW.LIZLLL;
        C2U8.LIZ(new C40304Fro(this.LJLIL, str, c38048EwW.LIZIZ, jSONObject2));
    }
}
