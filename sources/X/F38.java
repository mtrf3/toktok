package X;

import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class F38 {
    public String LIZ;
    public String LIZIZ;
    public String LIZJ;
    public JSONObject LIZLLL;
    public JSONObject LJ;
    public JSONObject LJFF;
    public JSONObject LJI;
    public JSONObject LJII;
    public boolean LJIIIIZZ;
    public K1E LJIIIZ;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CustomInfo{url='");
        Q89.LIZIZ(LIZ, this.LIZ, '\'', ", biz='");
        Q89.LIZIZ(LIZ, this.LIZIZ, '\'', ", eventName='");
        LIZ.append(this.LIZJ);
        LIZ.append('\'');
        LIZ.append(", vid='");
        LIZ.append((String) null);
        LIZ.append('\'');
        LIZ.append(", isSample=");
        return C48339Iy7.LIZJ(LIZ, this.LJIIIIZZ, '}', LIZ);
    }
}
