package X;

import kotlin.jvm.internal.o;

/* renamed from: X.XbA, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85136XbA {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final EnumC85151XbP LIZJ;
    public final String LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C85136XbA() {
        /*
            r8 = this;
            r1 = 0
            r3 = 0
            r7 = 63
            r0 = r8
            r2 = r1
            r4 = r3
            r5 = r1
            r6 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C85136XbA.<init>():void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C85136XbA)) {
            return false;
        }
        C85136XbA c85136XbA = (C85136XbA) obj;
        return this.LIZ == c85136XbA.LIZ && this.LIZIZ == c85136XbA.LIZIZ && this.LIZJ == c85136XbA.LIZJ && o.LJ(this.LIZLLL, c85136XbA.LIZLLL) && this.LJ == c85136XbA.LJ && this.LJFF == c85136XbA.LJFF;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean] */
    public final int hashCode() {
        boolean z = this.LIZ;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        ?? r02 = this.LIZIZ;
        int i2 = r02;
        if (r02 != 0) {
            i2 = 1;
        }
        int hashCode = (this.LIZJ.hashCode() + ((i + i2) * 31)) * 31;
        String str = this.LIZLLL;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        ?? r03 = this.LJ;
        int i3 = r03;
        if (r03 != 0) {
            i3 = 1;
        }
        return ((hashCode2 + i3) * 31) + (this.LJFF ? 1 : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TwoStepVerificationMethodModel(isMethodBound=");
        LIZ.append(this.LIZ);
        LIZ.append(", isMethodOn=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", methodType=");
        LIZ.append(this.LIZJ);
        LIZ.append(", methodValue=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", isChecked=");
        LIZ.append(this.LJ);
        LIZ.append(", isTwoStepVerificationOn=");
        return C48339Iy7.LIZJ(LIZ, this.LJFF, ')', LIZ);
    }

    public C85136XbA(boolean z, boolean z2, EnumC85151XbP methodType, String str, boolean z3, boolean z4) {
        o.LJIIIZ(methodType, "methodType");
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = methodType;
        this.LIZLLL = str;
        this.LJ = z3;
        this.LJFF = z4;
    }

    public /* synthetic */ C85136XbA(boolean z, boolean z2, EnumC85151XbP enumC85151XbP, String str, boolean z3, boolean z4, int i) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? EnumC85151XbP.SMS : enumC85151XbP, (i & 8) != 0 ? null : str, (i & 16) != 0 ? false : z3, (i & 32) != 0 ? false : z4);
    }

    public static C85136XbA LIZ(C85136XbA c85136XbA, boolean z, boolean z2, String str, boolean z3, boolean z4, int i) {
        EnumC85151XbP methodType;
        boolean z5 = z4;
        boolean z6 = z3;
        String str2 = str;
        boolean z7 = z;
        boolean z8 = z2;
        if ((i & 1) != 0) {
            z7 = c85136XbA.LIZ;
        }
        if ((i & 2) != 0) {
            z8 = c85136XbA.LIZIZ;
        }
        if ((i & 4) != 0) {
            methodType = c85136XbA.LIZJ;
        } else {
            methodType = null;
        }
        if ((i & 8) != 0) {
            str2 = c85136XbA.LIZLLL;
        }
        if ((i & 16) != 0) {
            z6 = c85136XbA.LJ;
        }
        if ((i & 32) != 0) {
            z5 = c85136XbA.LJFF;
        }
        o.LJIIIZ(methodType, "methodType");
        return new C85136XbA(z7, z8, methodType, str2, z6, z5);
    }
}
