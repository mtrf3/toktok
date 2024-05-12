package X;

import org.json.JSONObject;

/* renamed from: X.NpX, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60547NpX {
    public String LIZ;
    public final String LIZIZ;
    public AbstractC60548NpY LIZJ;
    public String LIZLLL;
    public String LJ;
    public String LJFF;
    public JSONObject LJI;
    public JSONObject LJII;
    public Boolean LJIIIIZZ;
    public final JSONObject LJIIIZ;
    public JSONObject LJIIJ;

    public C60547NpX(String str, String str2, JSONObject jSONObject, int i) {
        Boolean bool;
        str2 = (i & 4) != 0 ? null : str2;
        jSONObject = (i & 8) != 0 ? null : jSONObject;
        if ((i & 32) != 0) {
            bool = Boolean.FALSE;
        } else {
            bool = null;
        }
        this.LIZLLL = str;
        this.LJ = null;
        this.LJFF = str2;
        this.LJI = jSONObject;
        this.LJII = null;
        this.LJIIIIZZ = bool;
        this.LJIIIZ = null;
        this.LJIIJ = null;
        this.LIZIZ = "";
    }
}
