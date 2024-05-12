package X;

import org.json.JSONObject;

/* renamed from: X.6vg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C176126vg extends C174666tK {
    public int LJI;
    public int LJII;

    public C176126vg() {
        super("comment_load_more_time", -1L, -1L, -1L, -1L, false);
        this.LJI = 1;
        this.LJII = 1;
    }

    @Override // X.C174666tK, X.AbstractC174686tM
    public final JSONObject LIZJ() {
        JSONObject LIZJ = super.LIZJ();
        LIZJ.put("page_num", this.LJI);
        LIZJ.put("page_size", this.LJII);
        return LIZJ;
    }
}
