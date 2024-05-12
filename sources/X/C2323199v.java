package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.99v, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2323199v {
    public final FVN LIZ;
    public final long LIZIZ;
    public final String LIZJ;
    public final JSONObject LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2323199v)) {
            return false;
        }
        C2323199v c2323199v = (C2323199v) obj;
        return this.LIZ == c2323199v.LIZ && this.LIZIZ == c2323199v.LIZIZ && o.LJ(this.LIZJ, c2323199v.LIZJ) && o.LJ(this.LIZLLL, c2323199v.LIZLLL);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SessionChangeEvent(type=");
        LIZ.append(this.LIZ);
        LIZ.append(", sessionId=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", session=");
        LIZ.append(this.LIZJ);
        LIZ.append(", app_log=");
        LIZ.append(this.LIZLLL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final int hashCode() {
        int hashCode;
        int LIZJ = JBR.LIZJ(this.LIZIZ, this.LIZ.hashCode() * 31, 31);
        String str = this.LIZJ;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (LIZJ + hashCode) * 31;
        JSONObject jSONObject = this.LIZLLL;
        if (jSONObject != null) {
            i = jSONObject.hashCode();
        }
        return i2 + i;
    }

    public C2323199v(FVN type, long j, String str, JSONObject jSONObject) {
        o.LJIIIZ(type, "type");
        this.LIZ = type;
        this.LIZIZ = j;
        this.LIZJ = str;
        this.LIZLLL = jSONObject;
    }
}
