package X;

import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class F1N implements InterfaceC38012Evw {
    public final C38049EwX LJLIL;
    public final F1G LJLILLLLZI;

    public F1N(C38049EwX c38049EwX, F1G f1g) {
        this.LJLIL = c38049EwX;
        this.LJLILLLLZI = f1g;
    }

    @Override // X.InterfaceC38012Evw
    public final void call(C38048EwW c38048EwW, JSONObject jSONObject) {
        try {
            c38048EwW.LJIIJ = false;
            C38294F1e.LIZ(c38048EwW, jSONObject, this.LJLIL, new F1O(this, c38048EwW), this.LJLILLLLZI).execute();
        } catch (Exception unused) {
        }
    }
}
