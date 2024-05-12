package X;

import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class PRG implements PH6 {
    public final /* synthetic */ PRD LJLIL;

    public PRG(PRD prd) {
        this.LJLIL = prd;
    }

    @Override // X.PH6
    public final void LIZJ(JSONObject jSONObject) {
        PQU pqu = this.LJLIL.LIZLLL;
        if (pqu != null) {
            pqu.LIZJ(jSONObject);
        }
    }
}
