package X;

import org.json.JSONObject;

/* renamed from: X.6uX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C175416uX extends C174666tK {
    public String LJI;

    public C175416uX() {
        super("comment_digg_time", -1L, -1L, -1L, -1L, false);
        this.LJI = "";
    }

    @Override // X.C174666tK, X.AbstractC174686tM
    public final JSONObject LIZJ() {
        JSONObject LIZJ = super.LIZJ();
        LIZJ.put("digg_type", this.LJI);
        return LIZJ;
    }
}
