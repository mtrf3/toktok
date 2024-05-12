package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class POK {
    public final String LIZ;
    public final POJ LIZIZ;
    public final POK LIZJ;
    public POY LIZLLL;
    public POM LJ;
    public JSONObject LJFF;
    public final Object LJI;
    public final long LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof POK)) {
            return false;
        }
        POK pok = (POK) obj;
        return o.LJ(this.LIZ, pok.LIZ) && o.LJ(this.LIZIZ, pok.LIZIZ) && o.LJ(this.LIZJ, pok.LIZJ) && this.LIZLLL == pok.LIZLLL && o.LJ(this.LJ, pok.LJ) && o.LJ(this.LJFF, pok.LJFF) && o.LJ(this.LJI, pok.LJI) && this.LJII == pok.LJII;
    }

    public final int hashCode() {
        int hashCode = (this.LIZIZ.hashCode() + (this.LIZ.hashCode() * 31)) * 31;
        POK pok = this.LIZJ;
        int hashCode2 = (this.LIZLLL.hashCode() + ((hashCode + (pok == null ? 0 : pok.hashCode())) * 31)) * 31;
        POM pom = this.LJ;
        int hashCode3 = (hashCode2 + (pom == null ? 0 : pom.hashCode())) * 31;
        JSONObject jSONObject = this.LJFF;
        int hashCode4 = (hashCode3 + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
        Object obj = this.LJI;
        return C16880lQ.LLJIJIL(this.LJII) + ((hashCode4 + (obj != null ? obj.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SpanLogModel(spanId=");
        LIZ.append(this.LIZ);
        LIZ.append(", traceModel=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", parentSpan=");
        LIZ.append(this.LIZJ);
        LIZ.append(", logCategory=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", keyLogModel=");
        LIZ.append(this.LJ);
        LIZ.append(", extraLog=");
        LIZ.append(this.LJFF);
        LIZ.append(", realSpanObjRef=");
        LIZ.append(this.LJI);
        LIZ.append(", createTs=");
        return C47135Ieh.LIZIZ(LIZ, this.LJII, ')', LIZ);
    }

    public POK(String str, POJ traceModel, POK pok, PIR pir, long j, int i) {
        POY logCategory;
        pok = (i & 4) != 0 ? null : pok;
        if ((i & 8) != 0) {
            logCategory = POY.UNKNOWN_LOG;
        } else {
            logCategory = null;
        }
        o.LJIIIZ(traceModel, "traceModel");
        o.LJIIIZ(logCategory, "logCategory");
        this.LIZ = str;
        this.LIZIZ = traceModel;
        this.LIZJ = pok;
        this.LIZLLL = logCategory;
        this.LJ = null;
        this.LJFF = null;
        this.LJI = pir;
        this.LJII = j;
    }
}
