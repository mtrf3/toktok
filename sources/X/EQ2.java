package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EQ2 extends AbstractC36384EPs {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EQ2)) {
            return false;
        }
        EQ2 eq2 = (EQ2) obj;
        return o.LJ(this.LIZ, eq2.LIZ) && o.LJ(this.LIZIZ, eq2.LIZIZ) && o.LJ(this.LIZJ, eq2.LIZJ);
    }

    public final int hashCode() {
        return this.LIZJ.hashCode() + C79062V1e.LJ(this.LIZIZ, this.LIZ.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PublishSuccess(name=");
        LIZ.append(this.LIZ);
        LIZ.append(", effectId=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", iconPath=");
        return q.LIZIZ(LIZ, this.LIZJ, ')', LIZ);
    }

    public EQ2(String str, String str2, String str3) {
        HH1.LIZ(str, "name", str2, "effectId", str3, "iconPath");
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
    }
}
