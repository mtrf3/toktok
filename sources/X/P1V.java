package X;

import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class P1V {
    public final ActivityC45651qj LIZ;
    public final EnumC58085Mqv LIZIZ;
    public final P1J LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final C73306Spq LJI;
    public final C73306Spq LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P1V)) {
            return false;
        }
        P1V p1v = (P1V) obj;
        return o.LJ(this.LIZ, p1v.LIZ) && this.LIZIZ == p1v.LIZIZ && o.LJ(this.LIZJ, p1v.LIZJ) && this.LIZLLL == p1v.LIZLLL && this.LJ == p1v.LJ && this.LJFF == p1v.LJFF && o.LJ(this.LJI, p1v.LJI) && o.LJ(this.LJII, p1v.LJII);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = (this.LIZJ.hashCode() + ((this.LIZIZ.hashCode() + (this.LIZ.hashCode() * 31)) * 31)) * 31;
        boolean z = this.LIZLLL;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean z2 = this.LJ;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (((i2 + i3) * 31) + (this.LJFF ? 1 : 0)) * 31;
        C73306Spq c73306Spq = this.LJI;
        int hashCode2 = (i4 + (c73306Spq == null ? 0 : c73306Spq.hashCode())) * 31;
        C73306Spq c73306Spq2 = this.LJII;
        return hashCode2 + (c73306Spq2 != null ? c73306Spq2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Config(context=");
        LIZ.append(this.LIZ);
        LIZ.append(", authApiScene=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", trackInfo=");
        LIZ.append(this.LIZJ);
        LIZ.append(", enableRefresh=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", shouldShowInvite=");
        LIZ.append(this.LJ);
        LIZ.append(", shouldShowTitle=");
        LIZ.append(this.LJFF);
        LIZ.append(", emptyStatus=");
        LIZ.append(this.LJI);
        LIZ.append(", errorStatus=");
        LIZ.append(this.LJII);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public P1V(ActivityC45651qj activityC45651qj, EnumC58085Mqv authApiScene, P1J p1j) {
        o.LJIIIZ(authApiScene, "authApiScene");
        this.LIZ = activityC45651qj;
        this.LIZIZ = authApiScene;
        this.LIZJ = p1j;
        this.LIZLLL = true;
        this.LJ = true;
        this.LJFF = true;
        this.LJI = null;
        this.LJII = null;
    }
}
