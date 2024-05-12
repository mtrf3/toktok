package X;

import org.json.JSONObject;

/* renamed from: X.QJu, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66806QJu extends QKR {
    public final QIF LJ;
    public final C48852JFg LJFF;

    @Override // X.QKR
    public final boolean LIZ(JSONObject jSONObject) {
        String str;
        C39246Fak c39246Fak = this.LJ.LJJIIJZLJL;
        String str2 = "";
        if (c39246Fak == null) {
            str = "";
        } else {
            str = c39246Fak.LLLZ();
        }
        C36860EdM.LJFF("carrier", str, jSONObject);
        C39246Fak c39246Fak2 = this.LJ.LJJIIJZLJL;
        if (c39246Fak2 != null) {
            str2 = c39246Fak2.LLLLZLLLI();
        }
        C36860EdM.LJFF("mcc_mnc", str2, jSONObject);
        QKU qku = (QKU) JFZ.LIZ(QKU.class, String.valueOf(this.LJ.LIZ));
        C36860EdM.LJFF("clientudid", qku.A3(), jSONObject);
        if (!this.LJFF.LJLIL) {
            C36860EdM.LJFF("openudid", qku.getOpenUdid(), jSONObject);
            return true;
        }
        return true;
    }

    @Override // X.QKR
    public final void LIZIZ(JSONObject jSONObject) {
        jSONObject.remove("carrier");
        jSONObject.remove("mcc_mnc");
        jSONObject.remove("clientudid");
        jSONObject.remove("openudid");
    }

    public C66806QJu(C48852JFg c48852JFg, QIF qif) {
        super(false, true);
        this.LJ = qif;
        this.LJFF = c48852JFg;
    }
}
