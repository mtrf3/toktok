package X;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Fcy, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39384Fcy {
    public String LIZ;
    public long LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public long LJ;
    public int LJFF;
    public String LJI;

    public final boolean LIZJ() {
        if (!TextUtils.isEmpty(this.LJI) || TextUtils.isEmpty(this.LIZ) || this.LJ <= 0 || System.currentTimeMillis() > this.LJ) {
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RegionBean{code='");
        Q89.LIZIZ(LIZ, this.LIZ, '\'', ", geoNameID=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", asciName='");
        Q89.LIZIZ(LIZ, this.LIZJ, '\'', ", name='");
        Q89.LIZIZ(LIZ, this.LIZLLL, '\'', ", source=");
        LIZ.append(this.LJFF);
        LIZ.append(", expireTime=");
        return C47135Ieh.LIZIZ(LIZ, this.LJ, '}', LIZ);
    }

    public static C39384Fcy LIZ(String str) {
        C39384Fcy c39384Fcy = new C39384Fcy();
        c39384Fcy.LJI = str;
        return c39384Fcy;
    }

    public static C39384Fcy LIZIZ(int i, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            C39384Fcy c39384Fcy = new C39384Fcy();
            c39384Fcy.LIZ = C73340SqO.LJJIJIIJIL(jSONObject, "Code", null);
            long j = 0;
            if (!TextUtils.isEmpty("GeoNameID")) {
                try {
                    j = jSONObject.optLong("GeoNameID", 0L);
                } catch (Throwable unused) {
                }
            }
            c39384Fcy.LIZIZ = j;
            c39384Fcy.LIZJ = C73340SqO.LJJIJIIJIL(jSONObject, "ASCIName", null);
            c39384Fcy.LIZLLL = C73340SqO.LJJIJIIJIL(jSONObject, "Name", null);
            long currentTimeMillis = System.currentTimeMillis() + 21600000;
            if (!TextUtils.isEmpty("expire_time")) {
                try {
                    currentTimeMillis = jSONObject.optLong("expire_time", currentTimeMillis);
                } catch (Throwable unused2) {
                }
            }
            c39384Fcy.LJ = currentTimeMillis;
            c39384Fcy.LJFF = i;
            return c39384Fcy;
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }
}
