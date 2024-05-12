package X;

import org.json.JSONObject;

/* renamed from: X.6tO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C174706tO extends AbstractC174686tM {
    public String LIZIZ;
    public long LIZJ;
    public long LIZLLL;

    public C174706tO() {
        super("comment_view_holder_inflate");
        this.LIZIZ = "";
        this.LIZJ = -1L;
        this.LIZLLL = -1L;
    }

    @Override // X.AbstractC174686tM
    public final boolean LIZ() {
        if (this.LIZ.length() > 0 && this.LIZJ > 0 && this.LIZLLL > 0) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC174686tM
    public final void LIZIZ() {
        this.LIZJ = -1L;
        this.LIZLLL = -1L;
    }

    @Override // X.AbstractC174686tM
    public final JSONObject LIZJ() {
        JSONObject jSONObject = new JSONObject();
        long j = this.LIZJ;
        long j2 = this.LIZLLL;
        long j3 = -1;
        if (j > -1 && j2 > -1 && j2 >= j) {
            j3 = j2 - j;
        }
        jSONObject.put("inflate_duration", j3);
        if (this.LIZIZ.length() > 0) {
            jSONObject.put("layout_name", this.LIZIZ);
        }
        return jSONObject;
    }

    public final void LIZLLL() {
        this.LIZLLL = System.currentTimeMillis();
        C176096vd.LIZJ(this);
    }

    public final void LJ() {
        this.LIZJ = System.currentTimeMillis();
    }
}
