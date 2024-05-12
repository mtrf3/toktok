package X;

import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class PCV extends AbstractRunnableC64070PCo {
    public final /* synthetic */ JSONObject LJLJJI;
    public final /* synthetic */ boolean LJLJJL;
    public final /* synthetic */ PCU LJLJJLL;

    public final void LIZ() {
        try {
            C64071PCp.LIZ(PD6.LIGHT_WEIGHT).LIZIZ(this.LJLJJLL.LJLIL.LJI);
            PCT pct = this.LJLJJLL.LJLIL;
            pct.LJI = null;
            pct.LIZLLL(this.LJLJJI, this.LJLJJL);
            if (C78248UnM.LJIIJ()) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("updateCurrentConfig:");
                LIZ.append(this.LJLJJI);
                C64028PAy.LIZ("APM-Config", X1D.LIZIZ(LIZ));
            }
        } catch (Exception e) {
            C64028PAy.LIZJ("APM-Config", "onConfigChanged", e);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public PCV(PCU pcu, JSONObject jSONObject, boolean z) {
        this.LJLJJLL = pcu;
        this.LJLJJI = jSONObject;
        this.LJLJJL = z;
    }
}
