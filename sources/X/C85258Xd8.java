package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Xd8, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85258Xd8 {
    public String LIZ;
    public String LIZIZ;
    public final String LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public final Boolean LJFF;
    public final Boolean LJI;
    public final Boolean LJII;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C85258Xd8() {
        /*
            r6 = this;
            r1 = 0
            r4 = 0
            r5 = 255(0xff, float:3.57E-43)
            r0 = r6
            r2 = r1
            r3 = r1
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C85258Xd8.<init>():void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C85258Xd8)) {
            return false;
        }
        C85258Xd8 c85258Xd8 = (C85258Xd8) obj;
        return o.LJ(this.LIZ, c85258Xd8.LIZ) && o.LJ(this.LIZIZ, c85258Xd8.LIZIZ) && o.LJ(this.LIZJ, c85258Xd8.LIZJ) && this.LIZLLL == c85258Xd8.LIZLLL && this.LJ == c85258Xd8.LJ && o.LJ(this.LJFF, c85258Xd8.LJFF) && o.LJ(this.LJI, c85258Xd8.LJI) && o.LJ(this.LJII, c85258Xd8.LJII);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LIZJ;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        boolean z = this.LIZLLL;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (((hashCode3 + i) * 31) + (this.LJ ? 1 : 0)) * 31;
        Boolean bool = this.LJFF;
        int hashCode4 = (i2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.LJI;
        int hashCode5 = (hashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.LJII;
        return hashCode5 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ExtensionParams(enterFrom=");
        LIZ.append(this.LIZ);
        LIZ.append(", enterMethod=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", previousPage=");
        LIZ.append(this.LIZJ);
        LIZ.append(", forceDisableOpenSettings=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", isBlackLayer=");
        LIZ.append(this.LJ);
        LIZ.append(", needPrecise=");
        LIZ.append(this.LJFF);
        LIZ.append(", needPreciseOpenSettings=");
        LIZ.append(this.LJI);
        LIZ.append(", needInAppPrecise=");
        return C78920UyC.LIZIZ(LIZ, this.LJII, ')', LIZ);
    }

    public /* synthetic */ C85258Xd8(String str, String str2, String str3, boolean z, int i) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? false : z, false, null, null, null);
    }

    public C85258Xd8(String str, String str2, String str3, boolean z, boolean z2, Boolean bool, Boolean bool2, Boolean bool3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = z;
        this.LJ = z2;
        this.LJFF = bool;
        this.LJI = bool2;
        this.LJII = bool3;
    }
}
