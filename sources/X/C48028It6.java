package X;

import defpackage.q;
import org.json.JSONObject;

/* renamed from: X.It6, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48028It6 {
    public String LIZ;
    public String LIZIZ;
    public int LIZJ;
    public long LJ;
    public long LJI;
    public JSONObject LJIIIZ;
    public int LIZLLL = -1;
    public int LJFF = -1;
    public int LJII = -1;
    public int LJIIIIZZ = -1;

    public final String toString() {
        String str;
        String str2;
        String str3;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Record{scene='");
        Q89.LIZIZ(LIZ, this.LIZ, '\'', ", subScene='");
        Q89.LIZIZ(LIZ, this.LIZIZ, '\'', ", isFirst=");
        LIZ.append(this.LIZJ);
        String str4 = "";
        if (this.LIZLLL < 0) {
            str = "";
        } else {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(", type=");
            LIZ2.append(this.LIZLLL);
            str = X1D.LIZIZ(LIZ2);
        }
        LIZ.append(str);
        if (this.LJFF < 0) {
            str2 = "";
        } else {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(", status=");
            LIZ3.append(this.LJFF);
            str2 = X1D.LIZIZ(LIZ3);
        }
        LIZ.append(str2);
        LIZ.append(", duration=");
        LIZ.append(this.LJI);
        if (this.LJII < 0) {
            str3 = "";
        } else {
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append(", reason=");
            LIZ4.append(this.LJII);
            str3 = X1D.LIZIZ(LIZ4);
        }
        LIZ.append(str3);
        if (this.LJIIIIZZ >= 0) {
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append(", code=");
            LIZ5.append(this.LJIIIIZZ);
            str4 = X1D.LIZIZ(LIZ5);
        }
        return q.LIZIZ(LIZ, str4, '}', LIZ);
    }
}
