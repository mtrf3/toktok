package X;

import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class QK7 extends QKR {
    public final QIF LJ;

    public QK7(QIF qif) {
        super(true, false);
        this.LJ = qif;
    }

    @Override // X.QKR
    public final boolean LIZ(JSONObject jSONObject) {
        String str;
        C39246Fak c39246Fak = this.LJ.LJJIIJZLJL;
        if (c39246Fak != null) {
            str = c39246Fak.LLLZI();
        } else {
            str = "";
        }
        C36860EdM.LJFF("sim_region", str, jSONObject);
        return true;
    }
}
