package X;

import java.util.Date;
import kotlin.jvm.internal.o;

/* renamed from: X.OnO, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62962OnO {
    public final EnumC63002Oo2 LIZ;
    public final Date LIZIZ;
    public final boolean LIZJ;
    public final String LIZLLL;
    public final Boolean LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C62962OnO)) {
            return false;
        }
        C62962OnO c62962OnO = (C62962OnO) obj;
        return this.LIZ == c62962OnO.LIZ && o.LJ(this.LIZIZ, c62962OnO.LIZIZ) && this.LIZJ == c62962OnO.LIZJ && o.LJ(this.LIZLLL, c62962OnO.LIZLLL) && o.LJ(this.LJ, c62962OnO.LJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        Date date = this.LIZIZ;
        int hashCode2 = (hashCode + (date == null ? 0 : date.hashCode())) * 31;
        boolean z = this.LIZJ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode2 + i) * 31;
        String str = this.LIZLLL;
        int hashCode3 = (i2 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.LJ;
        return hashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PNSAgeGateResult(ageGateMode=");
        LIZ.append(this.LIZ);
        LIZ.append(", date=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", hasUnderage=");
        LIZ.append(this.LIZJ);
        LIZ.append(", statusMsg=");
        LIZ.append((Object) this.LIZLLL);
        LIZ.append(", isMixedAge=");
        return C78920UyC.LIZIZ(LIZ, this.LJ, ')', LIZ);
    }

    public C62962OnO(EnumC63002Oo2 ageGateMode, Date date, boolean z, String str, Boolean bool) {
        o.LJIIIZ(ageGateMode, "ageGateMode");
        this.LIZ = ageGateMode;
        this.LIZIZ = date;
        this.LIZJ = z;
        this.LIZLLL = str;
        this.LJ = bool;
    }
}
