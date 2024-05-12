package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.EwD, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38029EwD extends O6R {
    public final /* synthetic */ InterfaceC38012Evw LJLJJI;

    @Override // X.O6R
    public final void LJJIII() {
    }

    public C38029EwD(InterfaceC38012Evw interfaceC38012Evw) {
        this.LJLJJI = interfaceC38012Evw;
    }

    @Override // X.O6R
    public final void LJJ(String bridgeName, String str, C37945Eur c37945Eur) {
        JSONObject jSONObject;
        o.LJIIIZ(bridgeName, "bridgeName");
        InterfaceC38012Evw interfaceC38012Evw = this.LJLJJI;
        try {
            if (str.length() == 0) {
                jSONObject = new JSONObject();
            } else {
                jSONObject = new JSONObject(str);
            }
            JSONObject jSONObject2 = new JSONObject();
            C38048EwW c38048EwW = new C38048EwW();
            c38048EwW.LIZJ = bridgeName;
            c38048EwW.LIZLLL = jSONObject;
            interfaceC38012Evw.call(c38048EwW, jSONObject2);
            c37945Eur.LIZ(1, "success", jSONObject2);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }
}
