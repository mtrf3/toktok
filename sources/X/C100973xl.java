package X;

import kotlin.jvm.internal.o;

/* renamed from: X.3xl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C100973xl implements C33Q {
    public final boolean LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;
    public final int LJLJJL;
    public final boolean LJLJJLL;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C100973xl() {
        /*
            r6 = this;
            r1 = 0
            r2 = 0
            r5 = 63
            r0 = r6
            r3 = r1
            r4 = r2
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C100973xl.<init>():void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C100973xl)) {
            return false;
        }
        C100973xl c100973xl = (C100973xl) obj;
        return this.LJLIL == c100973xl.LJLIL && o.LJ(this.LJLILLLLZI, c100973xl.LJLILLLLZI) && o.LJ(this.LJLJI, c100973xl.LJLJI) && o.LJ(this.LJLJJI, c100973xl.LJLJJI) && this.LJLJJL == c100973xl.LJLJJL && this.LJLJJLL == c100973xl.LJLJJLL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    public final int hashCode() {
        boolean z = this.LJLIL;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        String str = this.LJLILLLLZI;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LJLJI;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LJLJJI;
        return ((((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.LJLJJL) * 31) + (this.LJLJJLL ? 1 : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GroupTitleBarState(rightDotVisibility=");
        LIZ.append(this.LJLIL);
        LIZ.append(", groupIcon=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", previousGroupIcon=");
        LIZ.append(this.LJLJI);
        LIZ.append(", title=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", memberCount=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", isGroupChatValid=");
        return C48339Iy7.LIZJ(LIZ, this.LJLJJLL, ')', LIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C100973xl(java.lang.String r8, boolean r9, java.lang.String r10, int r11, int r12) {
        /*
            r7 = this;
            r6 = r9
            r2 = r8
            r1 = r11
            r3 = 0
            r0 = r12 & 2
            r5 = 0
            if (r0 == 0) goto La
            r2 = r5
        La:
            r4 = 0
            r0 = r12 & 8
            if (r0 == 0) goto L1e
        Lf:
            r0 = r12 & 16
            if (r0 == 0) goto L14
            r1 = 0
        L14:
            r0 = r12 & 32
            if (r0 == 0) goto L19
            r6 = 1
        L19:
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        L1e:
            r5 = r10
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C100973xl.<init>(java.lang.String, boolean, java.lang.String, int, int):void");
    }

    public C100973xl(int i, String str, boolean z, String str2, String str3, boolean z2) {
        this.LJLIL = z;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = str3;
        this.LJLJJL = i;
        this.LJLJJLL = z2;
    }

    public static C100973xl LIZ(C100973xl c100973xl, boolean z, String str, String str2, String str3, int i, boolean z2, int i2) {
        boolean z3 = z2;
        int i3 = i;
        String str4 = str3;
        String str5 = str2;
        boolean z4 = z;
        String str6 = str;
        if ((i2 & 1) != 0) {
            z4 = c100973xl.LJLIL;
        }
        if ((i2 & 2) != 0) {
            str6 = c100973xl.LJLILLLLZI;
        }
        if ((i2 & 4) != 0) {
            str5 = c100973xl.LJLJI;
        }
        if ((i2 & 8) != 0) {
            str4 = c100973xl.LJLJJI;
        }
        if ((i2 & 16) != 0) {
            i3 = c100973xl.LJLJJL;
        }
        if ((i2 & 32) != 0) {
            z3 = c100973xl.LJLJJLL;
        }
        c100973xl.getClass();
        return new C100973xl(i3, str6, z4, str5, str4, z3);
    }
}
