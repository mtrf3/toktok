package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;
import ujb.s;

/* renamed from: X.EwP, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38041EwP extends O6R {
    public final /* synthetic */ InterfaceC38186Eyk LJLJJI;

    @Override // X.O6R
    public final void LJJIII() {
        this.LJLJJI.release();
    }

    public C38041EwP(InterfaceC38186Eyk interfaceC38186Eyk) {
        this.LJLJJI = interfaceC38186Eyk;
    }

    @Override // X.O6R
    public final void LJJ(String bridgeName, String str, C37945Eur c37945Eur) {
        JSONObject jSONObject;
        o.LJIIIZ(bridgeName, "bridgeName");
        try {
            jSONObject = new JSONObject(str);
        } catch (Exception e) {
            C78983UzD.LJIIZILJ(e);
            if (o.LJ(s.LJZI(str).toString(), "")) {
                jSONObject = new JSONObject();
            } else {
                c37945Eur.LIZ(-1, "params illegal, params = ".concat(str), null);
                return;
            }
        }
        this.LJLJJI.handle(jSONObject, new C38042EwQ(c37945Eur));
    }
}
