package X;

import org.json.JSONObject;

/* renamed from: X.QIb, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C66761QIb implements QJU, QJQ {
    public final QJO LIZ;
    public JSONObject LIZIZ;
    public C66799QJn LIZJ;
    public boolean LIZLLL;

    public final void LIZJ() {
        synchronized (this) {
            if (this.LIZLLL) {
                QJO qjo = this.LIZ;
                JSONObject jSONObject = this.LIZIZ;
                QJ3 qj3 = (QJ3) qjo;
                qj3.LIZ.LL |= 4;
                qj3.LIZ.LJLJLJ.LJFF(jSONObject);
                qj3.LIZ.LJLJI.LJJIZ.LJIIIZ(0, QI4.LLF, "bdinstall onUpdate", new Object[0]);
            } else {
                JSONObject jSONObject2 = this.LIZIZ;
                if (jSONObject2 != null && this.LIZJ != null) {
                    this.LIZLLL = true;
                    QJ3 qj32 = (QJ3) this.LIZ;
                    qj32.LIZ.LL |= 2;
                    qj32.LIZ.LJLJLJ.LJFF(jSONObject2);
                    qj32.LIZ.LJLJI.LJJIZ.LJIIIZ(0, QI4.LLF, "bdinstall onLoad", new Object[0]);
                }
            }
        }
    }

    public C66761QIb(QJ3 qj3) {
        this.LIZ = qj3;
    }

    @Override // X.QJQ
    public final void LIZ(JSONObject jSONObject) {
        this.LIZIZ = jSONObject;
        LIZJ();
    }

    @Override // X.QJU
    public final void LIZIZ(C66799QJn c66799QJn) {
        this.LIZJ = c66799QJn;
        LIZJ();
    }
}
