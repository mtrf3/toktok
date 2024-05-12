package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Uu8, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78668Uu8 implements C33Q {
    public final boolean LJLIL;
    public final boolean LJLILLLLZI;
    public final C43I<C76800UCe> LJLJI;
    public final C57778Mly LJLJJI;
    public final boolean LJLJJL;
    public final boolean LJLJJLL;
    public final boolean LJLJL;

    public C78668Uu8() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C78668Uu8)) {
            return false;
        }
        C78668Uu8 c78668Uu8 = (C78668Uu8) obj;
        return this.LJLIL == c78668Uu8.LJLIL && this.LJLILLLLZI == c78668Uu8.LJLILLLLZI && o.LJ(this.LJLJI, c78668Uu8.LJLJI) && o.LJ(this.LJLJJI, c78668Uu8.LJLJJI) && this.LJLJJL == c78668Uu8.LJLJJL && this.LJLJJLL == c78668Uu8.LJLJJLL && this.LJLJL == c78668Uu8.LJLJL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v20 */
    public final int hashCode() {
        boolean z = this.LJLIL;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        ?? r02 = this.LJLILLLLZI;
        int i2 = r02;
        if (r02 != 0) {
            i2 = 1;
        }
        int i3 = (i + i2) * 31;
        C43I<C76800UCe> c43i = this.LJLJI;
        int hashCode = (this.LJLJJI.hashCode() + ((i3 + (c43i == null ? 0 : c43i.hashCode())) * 31)) * 31;
        ?? r03 = this.LJLJJL;
        int i4 = r03;
        if (r03 != 0) {
            i4 = 1;
        }
        int i5 = (hashCode + i4) * 31;
        ?? r04 = this.LJLJJLL;
        int i6 = r04;
        if (r04 != 0) {
            i6 = 1;
        }
        return ((i5 + i6) * 31) + (this.LJLJL ? 1 : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VideoUserCardState(isVisible=");
        LIZ.append(this.LJLIL);
        LIZ.append(", withAnimation=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", triggerLoad=");
        LIZ.append(this.LJLJI);
        LIZ.append(", userCardState=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", isSelected=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", isFollowClick=");
        LIZ.append(this.LJLJJLL);
        LIZ.append(", isShown=");
        return C48339Iy7.LIZJ(LIZ, this.LJLJL, ')', LIZ);
    }

    public /* synthetic */ C78668Uu8(int i) {
        this(false, true, null, new C57778Mly(0), true, false, false);
    }

    public C78668Uu8(boolean z, boolean z2, C43I<C76800UCe> c43i, C57778Mly userCardState, boolean z3, boolean z4, boolean z5) {
        o.LJIIIZ(userCardState, "userCardState");
        this.LJLIL = z;
        this.LJLILLLLZI = z2;
        this.LJLJI = c43i;
        this.LJLJJI = userCardState;
        this.LJLJJL = z3;
        this.LJLJJLL = z4;
        this.LJLJL = z5;
    }

    public static C78668Uu8 LIZ(C78668Uu8 c78668Uu8, boolean z, boolean z2, C43I c43i, C57778Mly c57778Mly, boolean z3, boolean z4, boolean z5, int i) {
        boolean z6 = z5;
        boolean z7 = z2;
        boolean z8 = z;
        C43I c43i2 = c43i;
        C57778Mly userCardState = c57778Mly;
        boolean z9 = z3;
        boolean z10 = z4;
        if ((i & 1) != 0) {
            z8 = c78668Uu8.LJLIL;
        }
        if ((i & 2) != 0) {
            z7 = c78668Uu8.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            c43i2 = c78668Uu8.LJLJI;
        }
        if ((i & 8) != 0) {
            userCardState = c78668Uu8.LJLJJI;
        }
        if ((i & 16) != 0) {
            z9 = c78668Uu8.LJLJJL;
        }
        if ((i & 32) != 0) {
            z10 = c78668Uu8.LJLJJLL;
        }
        if ((i & 64) != 0) {
            z6 = c78668Uu8.LJLJL;
        }
        c78668Uu8.getClass();
        o.LJIIIZ(userCardState, "userCardState");
        return new C78668Uu8(z8, z7, c43i2, userCardState, z9, z10, z6);
    }
}
