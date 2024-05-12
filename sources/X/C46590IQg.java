package X;

import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.IQg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46590IQg {
    public final String LIZ;
    public final JSONObject LIZIZ;
    public final JSONArray LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C46590IQg)) {
            return false;
        }
        C46590IQg c46590IQg = (C46590IQg) obj;
        return o.LJ(this.LIZ, c46590IQg.LIZ) && o.LJ(this.LIZIZ, c46590IQg.LIZIZ) && o.LJ(this.LIZJ, c46590IQg.LIZJ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        JSONObject jSONObject = this.LIZIZ;
        int hashCode2 = (hashCode + (jSONObject != null ? jSONObject.hashCode() : 0)) * 31;
        JSONArray jSONArray = this.LIZJ;
        return hashCode2 + (jSONArray != null ? jSONArray.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RequestTask(url=");
        LIZ.append(this.LIZ);
        LIZ.append(", header=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", protocols=");
        LIZ.append(this.LIZJ);
        LIZ.append(")");
        return X1D.LIZIZ(LIZ);
    }

    public C46590IQg(String str, JSONArray jSONArray, JSONObject jSONObject) {
        this.LIZ = str;
        this.LIZIZ = jSONObject;
        this.LIZJ = jSONArray;
    }
}
