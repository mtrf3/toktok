package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class M03 {
    public final String LIZ;
    public final JSONObject LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public final boolean LJII;

    public M03() {
        this(null, false, 255);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M03)) {
            return false;
        }
        M03 m03 = (M03) obj;
        return o.LJ(this.LIZ, m03.LIZ) && o.LJ(this.LIZIZ, m03.LIZIZ) && o.LJ(this.LIZJ, m03.LIZJ) && o.LJ(this.LIZLLL, m03.LIZLLL) && o.LJ(this.LJ, m03.LJ) && o.LJ(this.LJFF, m03.LJFF) && o.LJ(this.LJI, m03.LJI) && this.LJII == m03.LJII;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        JSONObject jSONObject = this.LIZIZ;
        int hashCode2 = (hashCode + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
        String str2 = this.LIZJ;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LIZLLL;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LJ;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.LJFF;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.LJI;
        int hashCode7 = (hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31;
        boolean z = this.LJII;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode7 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ShopRouteParams(previousPage=");
        LIZ.append(this.LIZ);
        LIZ.append(", mallExtraInfo=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", diversionParams=");
        LIZ.append(this.LIZJ);
        LIZ.append(", extraRouteSchema=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", openFrom=");
        LIZ.append(this.LJ);
        LIZ.append(", topProductId=");
        LIZ.append(this.LJFF);
        LIZ.append(", enterMethod=");
        LIZ.append(this.LJI);
        LIZ.append(", isMockRoute=");
        return C48339Iy7.LIZJ(LIZ, this.LJII, ')', LIZ);
    }

    public /* synthetic */ M03(String str, boolean z, int i) {
        this(null, null, null, (i & 8) != 0 ? null : str, null, null, null, (i & 128) != 0 ? false : z);
    }

    public M03(String str, JSONObject jSONObject, String str2, String str3, String str4, String str5, String str6, boolean z) {
        this.LIZ = str;
        this.LIZIZ = jSONObject;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = str4;
        this.LJFF = str5;
        this.LJI = str6;
        this.LJII = z;
    }
}
