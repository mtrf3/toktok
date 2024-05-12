package X;

import org.json.JSONObject;

/* renamed from: X.P9p, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C63993P9p {
    public final JSONObject LIZ = new JSONObject();
    public final JSONObject LIZIZ = new JSONObject();
    public final String LIZJ;

    public final void LIZJ() {
        if (PK0.LIZ == null) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("upload ");
        LIZ.append(this.LIZJ);
        LIZ.append(" ");
        LIZ.append(this.LIZIZ);
        LIZ.append(" ");
        LIZ.append(this.LIZ);
        X1D.LIZIZ(LIZ);
        C78685UuP.LJJJLL();
        PJD.LIZIZ(this.LIZJ, this.LIZ, this.LIZIZ);
    }

    public C63993P9p(String str) {
        this.LIZJ = str;
    }

    public final void LIZ(Object... objArr) {
        PJC.LIZ(this.LIZ, objArr);
    }

    public final void LIZIZ(Object... objArr) {
        PJC.LIZ(this.LIZIZ, objArr);
    }
}
