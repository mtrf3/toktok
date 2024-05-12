package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class B5C {
    public final String LIZ;
    public String LIZIZ;
    public String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B5C)) {
            return false;
        }
        B5C b5c = (B5C) obj;
        return o.LJ(this.LIZ, b5c.LIZ) && o.LJ(this.LIZIZ, b5c.LIZIZ) && o.LJ(this.LIZJ, b5c.LIZJ);
    }

    public final int hashCode() {
        return this.LIZJ.hashCode() + C79062V1e.LJ(this.LIZIZ, this.LIZ.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LiveGameMonitorActionInfo(actionType=");
        LIZ.append(this.LIZ);
        LIZ.append(", errorCode=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", errorMsg=");
        return q.LIZIZ(LIZ, this.LIZJ, ')', LIZ);
    }

    public B5C(String str, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
    }
}
