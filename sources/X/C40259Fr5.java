package X;

import org.json.JSONException;
import org.json.JSONObject;
import yq4.a;

/* renamed from: X.Fr5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40259Fr5 implements InterfaceC38012Evw {
    public final C38049EwX LJLIL;

    public C40259Fr5(C38049EwX c38049EwX) {
        this.LJLIL = c38049EwX;
    }

    @Override // X.InterfaceC38012Evw
    public final void call(C38048EwW c38048EwW, JSONObject jSONObject) {
        int i;
        JSONObject jSONObject2 = new JSONObject();
        try {
            if (a.LJIILL().LJIJ()) {
                i = 1;
            } else {
                i = 0;
            }
            jSONObject2.put("isTeenagersModel", i);
            jSONObject2.put("language", C85990Xow.LIZIZ());
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        C38049EwX c38049EwX = this.LJLIL;
        if (c38049EwX != null) {
            c38049EwX.LIZLLL(c38048EwW.LIZIZ, jSONObject2);
        }
    }
}
