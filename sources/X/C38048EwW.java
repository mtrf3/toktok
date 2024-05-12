package X;

import android.text.TextUtils;
import defpackage.q;
import org.json.JSONObject;

/* renamed from: X.EwW, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38048EwW {
    public String LIZ;
    public String LIZIZ;
    public String LIZJ;
    public JSONObject LIZLLL;
    public int LJ;
    public String LJFF;
    public String LJI;
    public String LJIIIZ;
    public Boolean LJII = Boolean.FALSE;
    public String LJIIIIZZ = "";
    public boolean LJIIJ = true;

    public final String toString() {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("JsMsg{type='");
        Q89.LIZIZ(LIZ, this.LIZ, '\'', ", callback_id='");
        Q89.LIZIZ(LIZ, this.LIZIZ, '\'', ", func='");
        Q89.LIZIZ(LIZ, this.LIZJ, '\'', ", params=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", version=");
        LIZ.append(this.LJ);
        LIZ.append(", namespace=");
        LIZ.append(this.LJFF);
        LIZ.append(", iFrameUrl=");
        LIZ.append(this.LJI);
        LIZ.append(", permissionGroup=");
        if (TextUtils.isEmpty(this.LJIIIZ)) {
            str = "";
        } else {
            str = this.LJIIIZ;
        }
        return q.LIZIZ(LIZ, str, '}', LIZ);
    }
}
