package X;

import org.json.JSONObject;

/* renamed from: X.6vf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C176116vf extends C174666tK {
    public String LJI;

    public C176116vf() {
        super("comment_collect_time", -1L, -1L, -1L, -1L, false);
        this.LJI = "";
    }

    @Override // X.C174666tK, X.AbstractC174686tM
    public final JSONObject LIZJ() {
        JSONObject LIZJ = super.LIZJ();
        LIZJ.put("collect_type", this.LJI);
        return LIZJ;
    }
}
