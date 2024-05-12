package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class POA {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final JSONObject LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof POA)) {
            return false;
        }
        POA poa = (POA) obj;
        return o.LJ(this.LIZ, poa.LIZ) && o.LJ(this.LIZIZ, poa.LIZIZ) && o.LJ(this.LIZJ, poa.LIZJ) && o.LJ(this.LIZLLL, poa.LIZLLL);
    }

    public final int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.LIZIZ, this.LIZ.hashCode() * 31, 31);
        String str = this.LIZJ;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return this.LIZLLL.hashCode() + ((LJ + hashCode) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AppLogItem(category='");
        LIZ.append(this.LIZ);
        LIZ.append("', tag='");
        LIZ.append(this.LIZIZ);
        LIZ.append("', label='");
        LIZ.append(this.LIZJ);
        LIZ.append("', extJson=");
        LIZ.append(this.LIZLLL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public POA(String category, String tag, String str, JSONObject extJson) {
        o.LJIIIZ(category, "category");
        o.LJIIIZ(tag, "tag");
        o.LJIIIZ(extJson, "extJson");
        this.LIZ = category;
        this.LIZIZ = tag;
        this.LIZJ = str;
        this.LIZLLL = extJson;
    }
}
