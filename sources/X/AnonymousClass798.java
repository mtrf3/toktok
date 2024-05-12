package X;

import kotlin.jvm.internal.o;

/* renamed from: X.798, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AnonymousClass798 {
    public final String LIZ;
    public final boolean LIZIZ;
    public final EnumC1810178n LIZJ;
    public final int LIZLLL;
    public final String LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass798)) {
            return false;
        }
        AnonymousClass798 anonymousClass798 = (AnonymousClass798) obj;
        return o.LJ(this.LIZ, anonymousClass798.LIZ) && this.LIZIZ == anonymousClass798.LIZIZ && this.LIZJ == anonymousClass798.LIZJ && this.LIZLLL == anonymousClass798.LIZLLL && o.LJ(this.LJ, anonymousClass798.LJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        boolean z = this.LIZIZ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int hashCode2 = (((this.LIZJ.hashCode() + ((hashCode + i) * 31)) * 31) + this.LIZLLL) * 31;
        String str = this.LJ;
        return hashCode2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Request{aid:");
        LIZ.append(this.LIZ);
        LIZ.append(", isRefresh:");
        LIZ.append(this.LIZIZ);
        LIZ.append(", scenario:");
        LIZ.append(this.LIZJ);
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    public AnonymousClass798(String aid, boolean z, String str, int i) {
        EnumC1810178n scenario;
        z = (i & 2) != 0 ? false : z;
        if ((i & 4) != 0) {
            scenario = EnumC1810178n.NORMAL;
        } else {
            scenario = null;
        }
        int i2 = (i & 8) != 0 ? 20 : 0;
        str = (i & 16) != 0 ? null : str;
        o.LJIIIZ(aid, "aid");
        o.LJIIIZ(scenario, "scenario");
        this.LIZ = aid;
        this.LIZIZ = z;
        this.LIZJ = scenario;
        this.LIZLLL = i2;
        this.LJ = str;
    }
}
