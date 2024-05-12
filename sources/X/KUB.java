package X;

import defpackage.q;
import java.util.Arrays;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KUB {
    public String LIZ;
    public String LIZIZ;
    public String LJ;
    public String LIZJ = null;
    public String LIZLLL = null;
    public final C62822Ol8 LJFF = C221108m2.LIZIZ(KUJ.LJLIL);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KUB)) {
            return false;
        }
        KUB kub = (KUB) obj;
        return o.LJ(this.LIZ, kub.LIZ) && o.LJ(this.LIZIZ, kub.LIZIZ) && o.LJ(this.LIZJ, kub.LIZJ) && o.LJ(this.LIZLLL, kub.LIZLLL);
    }

    public final int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.LIZIZ, this.LIZ.hashCode() * 31, 31);
        String str = this.LIZJ;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (LJ + hashCode) * 31;
        String str2 = this.LIZLLL;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("extra={");
        LIZ.append(this.LIZLLL);
        LIZ.append("},logId={");
        LIZ.append(this.LIZJ);
        LIZ.append("} aids={");
        Object[] objArr = (Object[]) this.LJFF.getValue();
        if (objArr != null) {
            str = Arrays.toString(objArr);
            o.LJIIIIZZ(str, "toString(this)");
        } else {
            str = null;
        }
        LIZ.append(str);
        LIZ.append("},bindAid=");
        LIZ.append(this.LJ);
        LIZ.append(",fragment={");
        LIZ.append(this.LIZ);
        LIZ.append("}, lifecycleState={");
        return q.LIZIZ(LIZ, this.LIZIZ, '}', LIZ);
    }

    public KUB(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
