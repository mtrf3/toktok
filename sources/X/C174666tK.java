package X;

import org.json.JSONObject;

/* renamed from: X.6tK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public class C174666tK extends AbstractC174686tM {
    public long LIZIZ;
    public long LIZJ;
    public long LIZLLL;
    public long LJ;
    public boolean LJFF;

    public static final long LIZLLL(long j, long j2) {
        if (j <= -1 || j2 <= -1 || j2 < j) {
            return -1L;
        }
        return j2 - j;
    }

    @Override // X.AbstractC174686tM
    public final boolean LIZ() {
        if (this.LIZ.length() <= 0) {
            return false;
        }
        long j = this.LIZLLL;
        if (j <= -1) {
            return false;
        }
        long j2 = this.LJ;
        if (j2 <= -1 || LIZLLL(j, j2) <= 0) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC174686tM
    public final void LIZIZ() {
        this.LIZIZ = -1L;
        this.LIZJ = -1L;
        this.LIZLLL = -1L;
        this.LJ = -1L;
        this.LJFF = false;
    }

    @Override // X.AbstractC174686tM
    public JSONObject LIZJ() {
        JSONObject jSONObject = new JSONObject();
        if (LIZLLL(this.LIZIZ, this.LIZJ) >= 0) {
            jSONObject.put("duration", LIZLLL(this.LIZIZ, this.LIZJ));
        }
        if (LIZLLL(this.LIZIZ, this.LIZLLL) >= 0) {
            jSONObject.put("duration_before_network", LIZLLL(this.LIZIZ, this.LIZLLL));
        }
        if (LIZLLL(this.LIZLLL, this.LJ) > 0) {
            jSONObject.put("duration_network", LIZLLL(this.LIZLLL, this.LJ));
        }
        if (LIZLLL(this.LJ, this.LIZJ) >= 0) {
            jSONObject.put("duration_after_network", LIZLLL(this.LJ, this.LIZJ));
        }
        jSONObject.put("is_poor_network", this.LJFF);
        return jSONObject;
    }

    public C174666tK(String str, long j, long j2, long j3, long j4, boolean z) {
        super(str);
        this.LIZIZ = j;
        this.LIZJ = j2;
        this.LIZLLL = j3;
        this.LJ = j4;
        this.LJFF = z;
    }
}
