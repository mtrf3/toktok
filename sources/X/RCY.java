package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class RCY {
    public final String LIZ;
    public final boolean LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RCY)) {
            return false;
        }
        RCY rcy = (RCY) obj;
        return o.LJ(this.LIZ, rcy.LIZ) && this.LIZIZ == rcy.LIZIZ && o.LJ(this.LIZJ, rcy.LIZJ) && o.LJ(this.LIZLLL, rcy.LIZLLL) && o.LJ(this.LJ, rcy.LJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        boolean z = this.LIZIZ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        String str = this.LIZJ;
        int hashCode2 = (i2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZLLL;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LJ;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SocialPlatformInfo(name=");
        LIZ.append(this.LIZ);
        LIZ.append(", login=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", nickname=");
        LIZ.append(this.LIZJ);
        LIZ.append(", avatar=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", platformUid=");
        return q.LIZIZ(LIZ, this.LJ, ')', LIZ);
    }

    public RCY(String name, String str, String str2, String str3) {
        o.LJIIIZ(name, "name");
        this.LIZ = name;
        this.LIZIZ = true;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = str3;
    }
}
