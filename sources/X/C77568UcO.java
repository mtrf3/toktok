package X;

import kotlin.jvm.internal.o;

/* renamed from: X.UcO, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77568UcO {
    public static final /* synthetic */ int LJII = 0;
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public boolean LJFF;
    public String LJI;

    public C77568UcO() {
        this(null, null, null, null, null, 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C77568UcO)) {
            return false;
        }
        C77568UcO c77568UcO = (C77568UcO) obj;
        return o.LJ(this.LIZ, c77568UcO.LIZ) && o.LJ(this.LIZIZ, c77568UcO.LIZIZ) && o.LJ(this.LIZJ, c77568UcO.LIZJ) && o.LJ(this.LIZLLL, c77568UcO.LIZLLL) && o.LJ(this.LJ, c77568UcO.LJ);
    }

    public final int hashCode() {
        return this.LJ.hashCode() + C79062V1e.LJ(this.LIZLLL, C79062V1e.LJ(this.LIZJ, C79062V1e.LJ(this.LIZIZ, this.LIZ.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder();
        if (this.LIZLLL.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            sb.append(this.LIZLLL);
            sb.append(", ");
        }
        if (this.LIZJ.length() > 0) {
            sb.append(this.LIZJ);
            sb.append(", ");
        }
        if (this.LJ.length() > 0) {
            sb.append(this.LJ);
            sb.append(", ");
        }
        if (this.LIZIZ.length() > 0) {
            sb.append(this.LIZIZ);
            sb.append(", ");
        }
        if (this.LIZ.length() > 0) {
            sb.append(this.LIZ);
        }
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "StringBuilder().apply {\n…   }\n        }.toString()");
        return sb2;
    }

    public C77568UcO(String country, String state, String county, String city, String province, int i) {
        country = (i & 1) != 0 ? "" : country;
        state = (i & 2) != 0 ? "" : state;
        county = (i & 4) != 0 ? "" : county;
        city = (i & 8) != 0 ? "" : city;
        province = (i & 16) != 0 ? "" : province;
        o.LJIIIZ(country, "country");
        o.LJIIIZ(state, "state");
        o.LJIIIZ(county, "county");
        o.LJIIIZ(city, "city");
        o.LJIIIZ(province, "province");
        this.LIZ = country;
        this.LIZIZ = state;
        this.LIZJ = county;
        this.LIZLLL = city;
        this.LJ = province;
        this.LJI = "";
    }
}
