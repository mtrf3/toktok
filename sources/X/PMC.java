package X;

import org.json.JSONObject;

/* loaded from: classes12.dex */
public class PMC implements CHP {
    public final PH4 LIZ;

    public static final int LIZJ() {
        int i = PH9.LIZIZ;
        if (i == 0) {
            return 60;
        }
        return i;
    }

    @Override // X.CHP
    public final void start() {
        this.LIZ.LIZLLL();
    }

    @Override // X.CHP
    public final void stop() {
        this.LIZ.LJ();
    }

    public PMC(String str) {
        this.LIZ = new PH4(str, true);
    }

    @Override // X.CHP
    public final void LIZ(final CHZ chz) {
        this.LIZ.LIZJ(new PH7() { // from class: X.PMD
            @Override // X.PH7
            public final void LIZLLL(double d) {
                CHZ.this.LIZLLL(d);
            }
        });
    }

    @Override // X.CHP
    public final void LIZIZ(final CHY chy) {
        PH4 ph4 = this.LIZ;
        PH6 ph6 = new PH6() { // from class: X.PME
            @Override // X.PH6
            public final void LIZJ(JSONObject jSONObject) {
                CHY.this.LIZJ(jSONObject);
            }
        };
        PH3 ph3 = ph4.LJ;
        if (ph3 != null) {
            ph3.LJ = ph6;
        }
        ph4.LIZLLL = ph6;
    }

    public final void LIZLLL(CHN chn) {
        PH4 ph4 = this.LIZ;
        XWV xwv = new XWV(chn);
        PH3 ph3 = ph4.LJ;
        if (ph3 != null) {
            ph3.LJFF = xwv;
        }
    }
}
