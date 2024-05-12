package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.HFe, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43754HFe {
    public int LIZIZ;
    public Integer LIZJ;
    public Boolean LIZLLL;
    public Boolean LJ;
    public Integer LJFF;
    public int LJI;
    public long LJIIIIZZ;
    public String LIZ = "";
    public Boolean LJII = Boolean.FALSE;
    public String LJIIIZ = "";

    public final JSONObject LIZ() {
        int i;
        C6BK c6bk = new C6BK();
        c6bk.LIZ.put("stage", 2);
        c6bk.LIZ.put("aweme_id", this.LIZ);
        c6bk.LIZ.put("match_factors", Integer.valueOf(this.LIZIZ));
        c6bk.LIZ.put("origin", this.LIZJ);
        c6bk.LIZ.put("is_draft", this.LIZLLL);
        c6bk.LIZ.put("is_backup", this.LJ);
        Integer num = this.LJFF;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        c6bk.LIZ.put("err_code", Integer.valueOf(i));
        c6bk.LIZ.put("status", Integer.valueOf(this.LJI));
        c6bk.LIZ.put("is_retry", this.LJII);
        c6bk.LIZ.put("upload_err_code", Long.valueOf(this.LJIIIIZZ));
        c6bk.LIZ.put("description", this.LJIIIZ);
        JSONObject LJ = c6bk.LJ();
        o.LJIIIIZZ(LJ, "newBuilder()\n           …ion)\n            .build()");
        return LJ;
    }
}
