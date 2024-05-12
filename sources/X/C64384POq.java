package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.POq, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64384POq {
    public final String LIZ;
    public String LIZIZ;
    public EnumC64385POr LIZJ;
    public int LIZLLL;
    public int LJ;
    public JSONObject LJFF;
    public JSONObject LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C64384POq)) {
            return false;
        }
        C64384POq c64384POq = (C64384POq) obj;
        return o.LJ(this.LIZ, c64384POq.LIZ) && o.LJ(this.LIZIZ, c64384POq.LIZIZ) && this.LIZJ == c64384POq.LIZJ && this.LIZLLL == c64384POq.LIZLLL && this.LJ == c64384POq.LJ && o.LJ(this.LJFF, c64384POq.LJFF) && o.LJ(this.LJI, c64384POq.LJI);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PageWrapData(pageName=");
        LIZ.append(this.LIZ);
        LIZ.append(", pageTraceId=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", state=");
        LIZ.append(this.LIZJ);
        LIZ.append(", visibleCount=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", inVisibleCount=");
        LIZ.append(this.LJ);
        LIZ.append(", pageStartExtraJson=");
        LIZ.append(this.LJFF);
        LIZ.append(", pageEndExtraJson=");
        LIZ.append(this.LJI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (((((this.LIZJ.hashCode() + C79062V1e.LJ(this.LIZIZ, this.LIZ.hashCode() * 31, 31)) * 31) + this.LIZLLL) * 31) + this.LJ) * 31;
        JSONObject jSONObject = this.LJFF;
        int i = 0;
        if (jSONObject == null) {
            hashCode = 0;
        } else {
            hashCode = jSONObject.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        JSONObject jSONObject2 = this.LJI;
        if (jSONObject2 != null) {
            i = jSONObject2.hashCode();
        }
        return i2 + i;
    }

    public C64384POq(String pageName, EnumC64385POr state) {
        o.LJIIIZ(pageName, "pageName");
        o.LJIIIZ(state, "state");
        this.LIZ = pageName;
        this.LIZIZ = "";
        this.LIZJ = state;
        this.LIZLLL = 0;
        this.LJ = 0;
        this.LJFF = null;
        this.LJI = null;
    }
}
