package X;

import org.json.JSONObject;

/* renamed from: X.6tL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C174676tL extends AbstractC174686tM {
    public long LIZIZ;
    public long LIZJ;
    public long LIZLLL;
    public long LJ;
    public long LJFF;
    public long LJI;
    public long LJII;
    public long LJIIIIZZ;
    public long LJIIIZ;
    public long LJIIJ;
    public long LJIIJJI;
    public long LJIIL;
    public long LJIILIIL;
    public long LJIILJJIL;
    public long LJIILL;

    public static final long LIZLLL(long j, long j2) {
        if (j <= -1 || j2 <= -1 || j2 < j) {
            return -1L;
        }
        return j2 - j;
    }

    public C174676tL() {
        super("comment_page_load_time_v2");
        this.LIZIZ = -1L;
        this.LIZJ = -1L;
        this.LIZLLL = -1L;
        this.LJ = -1L;
        this.LJFF = -1L;
        this.LJI = -1L;
        this.LJII = -1L;
        this.LJIIIIZZ = -1L;
        this.LJIIIZ = -1L;
        this.LJIIJ = -1L;
        this.LJIIJJI = -1L;
        this.LJIIL = -1L;
        this.LJIILIIL = -1L;
        this.LJIILJJIL = -1L;
        this.LJIILL = -1L;
    }

    @Override // X.AbstractC174686tM
    public final boolean LIZ() {
        if (this.LIZ.length() > 0 && this.LIZIZ > 0 && this.LJIILL > 0 && this.LJIILJJIL > 0) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC174686tM
    public final void LIZIZ() {
        this.LIZIZ = -1L;
        this.LIZJ = -1L;
        this.LIZLLL = -1L;
        this.LJ = -1L;
        this.LJFF = -1L;
        this.LJI = -1L;
        this.LJII = -1L;
        this.LJIIIIZZ = -1L;
        this.LJIIIZ = -1L;
        this.LJIIJ = -1L;
        this.LJIIJJI = -1L;
        this.LJIIL = -1L;
        this.LJIILIIL = -1L;
        this.LJIILJJIL = -1L;
        this.LJIILL = -1L;
    }

    @Override // X.AbstractC174686tM
    public final JSONObject LIZJ() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("page_load_to_data_bind", LIZLLL(this.LIZIZ, this.LJIILJJIL));
        jSONObject.put("page_load_to_first_frame", LIZLLL(this.LIZIZ, this.LJIILL));
        jSONObject.put("first_frame_to_data_bind", LIZLLL(this.LJIILL, this.LJIILJJIL));
        jSONObject.put("page_load_to_page_create_view", LIZLLL(this.LIZIZ, this.LIZJ));
        jSONObject.put("page_create_view_duration", LIZLLL(this.LIZJ, this.LIZLLL));
        jSONObject.put("page_view_inflate_duration", LIZLLL(this.LJ, this.LJFF));
        jSONObject.put("page_view_created_duration", LIZLLL(this.LJI, this.LJII));
        jSONObject.put("list_create_view_duration", LIZLLL(this.LJIIIIZZ, this.LJIIIZ));
        jSONObject.put("list_view_created_duration", LIZLLL(this.LJIIJ, this.LJIIJJI));
        jSONObject.put("list_activity_created_duration", LIZLLL(this.LJIIL, this.LJIILIIL));
        jSONObject.put("list_activity_created_to_first_frame", LIZLLL(this.LJIILIIL, this.LJIILL));
        return jSONObject;
    }
}
