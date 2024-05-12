package X;

import kotlin.jvm.internal.o;

/* renamed from: X.6Wp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C161796Wp {
    public final int LIZ;
    public final C08630Vn<Integer> LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C161796Wp)) {
            return false;
        }
        C161796Wp c161796Wp = (C161796Wp) obj;
        return this.LIZ == c161796Wp.LIZ && o.LJ(this.LIZIZ, c161796Wp.LIZIZ) && this.LIZJ == c161796Wp.LIZJ && this.LIZLLL == c161796Wp.LIZLLL && this.LJ == c161796Wp.LJ && this.LJFF == c161796Wp.LJFF;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int i = this.LIZ * 31;
        C08630Vn<Integer> c08630Vn = this.LIZIZ;
        int hashCode = (i + (c08630Vn == null ? 0 : c08630Vn.hashCode())) * 31;
        boolean z = this.LIZJ;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int i3 = (hashCode + i2) * 31;
        boolean z2 = this.LIZLLL;
        int i4 = z2;
        if (z2 != 0) {
            i4 = 1;
        }
        int i5 = (i3 + i4) * 31;
        boolean z3 = this.LJ;
        int i6 = z3;
        if (z3 != 0) {
            i6 = 1;
        }
        return ((i5 + i6) * 31) + (this.LJFF ? 1 : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NowsPrivacyStates(defaultState=");
        LIZ.append(this.LIZ);
        LIZ.append(", changePrivacy=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", showStoryTitle=");
        LIZ.append(this.LIZJ);
        LIZ.append(", showPostTitle=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", isPrivateAccount=");
        LIZ.append(this.LJ);
        LIZ.append(", enableChangePrivacy=");
        return C48339Iy7.LIZJ(LIZ, this.LJFF, ')', LIZ);
    }

    public static C161796Wp LIZ(C161796Wp c161796Wp, int i, C08630Vn c08630Vn, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        C08630Vn c08630Vn2 = c08630Vn;
        int i3 = i;
        if ((i2 & 1) != 0) {
            i3 = c161796Wp.LIZ;
        }
        if ((i2 & 2) != 0) {
            c08630Vn2 = c161796Wp.LIZIZ;
        }
        if ((i2 & 4) != 0) {
            z = c161796Wp.LIZJ;
        } else {
            z = false;
        }
        if ((i2 & 8) != 0) {
            z2 = c161796Wp.LIZLLL;
        } else {
            z2 = false;
        }
        if ((i2 & 16) != 0) {
            z3 = c161796Wp.LJ;
        } else {
            z3 = false;
        }
        if ((i2 & 32) != 0) {
            z4 = c161796Wp.LJFF;
        } else {
            z4 = false;
        }
        c161796Wp.getClass();
        return new C161796Wp(i3, c08630Vn2, z, z2, z3, z4);
    }

    public C161796Wp(int i, C08630Vn<Integer> c08630Vn, boolean z, boolean z2, boolean z3, boolean z4) {
        this.LIZ = i;
        this.LIZIZ = c08630Vn;
        this.LIZJ = z;
        this.LIZLLL = z2;
        this.LJ = z3;
        this.LJFF = z4;
    }
}
