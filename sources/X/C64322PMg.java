package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.PMg, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64322PMg {
    public final String LIZ;
    public final String LIZIZ;
    public final JSONObject LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C64322PMg)) {
            return false;
        }
        C64322PMg c64322PMg = (C64322PMg) obj;
        return o.LJ(this.LIZ, c64322PMg.LIZ) && o.LJ(this.LIZIZ, c64322PMg.LIZIZ) && o.LJ(this.LIZJ, c64322PMg.LIZJ);
    }

    public final int hashCode() {
        return this.LIZJ.hashCode() + C79062V1e.LJ(this.LIZIZ, this.LIZ.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CommonLogItem(type='");
        LIZ.append(this.LIZ);
        LIZ.append("', subType='");
        LIZ.append(this.LIZIZ);
        LIZ.append("', log=");
        LIZ.append(this.LIZJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C64322PMg(String type, String subType, JSONObject log) {
        o.LJIIIZ(type, "type");
        o.LJIIIZ(subType, "subType");
        o.LJIIIZ(log, "log");
        this.LIZ = type;
        this.LIZIZ = subType;
        this.LIZJ = log;
    }
}
