package X;

import org.json.JSONObject;

/* renamed from: X.6ve, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C176106ve extends C174666tK {
    public int LJI;

    public C176106ve() {
        super("comment_publish_time", -1L, -1L, -1L, -1L, false);
        this.LJI = 0;
    }

    @Override // X.C174666tK, X.AbstractC174686tM
    public final JSONObject LIZJ() {
        JSONObject LIZJ = super.LIZJ();
        LIZJ.put("comment_length", this.LJI);
        return LIZJ;
    }
}
