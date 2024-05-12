package X;

import org.json.JSONObject;

/* renamed from: X.MNi, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56706MNi extends AbstractC56684MMm {
    public static final C56706MNi LJI = new C56706MNi();
    public static boolean LJII;
    public static boolean LJIIIIZZ;
    public static boolean LJIIIZ;
    public static boolean LJIIJ;
    public static int LJIIJJI;
    public static int LJIIL;

    @Override // X.AbstractC56684MMm
    public final String LJ() {
        return "tt_inbox_follow_api_monitor";
    }

    @Override // X.AbstractC56684MMm
    public final JSONObject LIZ() {
        C198517qh c198517qh = new C198517qh();
        c198517qh.LIZ.put("status", Integer.valueOf(this.LIZIZ));
        c198517qh.LIZ.put("status_code", Integer.valueOf(this.LIZJ));
        c198517qh.LIZ.put("error_code", Integer.valueOf(this.LIZLLL));
        c198517qh.LIZ.put("position", this.LJ);
        c198517qh.LIZ.put("is_first_refresh", Boolean.valueOf(LJII));
        c198517qh.LIZ.put("is_load_more", Boolean.valueOf(LJIIIIZZ));
        c198517qh.LIZ.put("need_follow_request", Boolean.valueOf(LJIIIZ));
        return c198517qh.LJ();
    }

    @Override // X.AbstractC56684MMm
    public final JSONObject LIZIZ() {
        C198517qh c198517qh = new C198517qh();
        c198517qh.LIZ.put("log_id", this.LJFF);
        c198517qh.LIZ.put("has_more", Boolean.valueOf(LJIIJ));
        return c198517qh.LJ();
    }

    @Override // X.AbstractC56684MMm
    public final JSONObject LIZJ() {
        C198517qh c198517qh = new C198517qh();
        c198517qh.LIZ.put("notice_count", Integer.valueOf(LJIIJJI));
        c198517qh.LIZ.put("notice_total", Integer.valueOf(LJIIL));
        return c198517qh.LJ();
    }

    @Override // X.AbstractC56684MMm
    public final void LIZLLL() {
        super.LIZLLL();
        LJIIJJI = 0;
        LJIIL = 0;
        LJII = false;
        LJIIIIZZ = false;
        LJIIIZ = false;
        LJIIJ = false;
    }
}
