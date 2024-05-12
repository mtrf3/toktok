package X;

import org.json.JSONObject;

/* renamed from: X.Exg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38120Exg implements InterfaceC38012Evw {
    public final java.util.Set<String> LJLIL;
    public final C38115Exb LJLILLLLZI;

    public C38120Exg(C38115Exb c38115Exb, java.util.Set<String> set) {
        this.LJLIL = set;
        this.LJLILLLLZI = c38115Exb;
    }

    @Override // X.InterfaceC38012Evw
    public final void call(C38048EwW c38048EwW, JSONObject jSONObject) {
        if (this.LJLIL.contains(c38048EwW.LIZJ)) {
            jSONObject.put("code", "-1");
            return;
        }
        c38048EwW.LJIIJ = false;
        C38128Exo c38128Exo = new C38128Exo();
        c38128Exo.LIZJ = c38048EwW.LIZJ;
        c38128Exo.LIZIZ = c38048EwW.LIZ;
        c38128Exo.LIZLLL = c38048EwW.LIZLLL.toString();
        c38128Exo.LJ = c38048EwW.LIZIZ;
        c38128Exo.LIZ = String.valueOf(c38048EwW.LJ);
        c38128Exo.LJFF = c38048EwW.LJFF;
        c38128Exo.LJI = c38048EwW.LJI;
        this.LJLILLLLZI.LJIIL(new C38117Exd(c38128Exo));
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Legacy call forwarded to new bridge: ");
        LIZ.append(c38048EwW.toString());
        X1D.LIZIZ(LIZ);
    }
}
