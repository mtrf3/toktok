package X;

import kotlin.jvm.internal.o;

/* renamed from: X.3nF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C94453nF implements C33Q {
    public final int LJLIL;
    public final C43I<Boolean> LJLILLLLZI;
    public final C43I<Boolean> LJLJI;
    public final C43I<Boolean> LJLJJI;

    public C94453nF() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C94453nF)) {
            return false;
        }
        C94453nF c94453nF = (C94453nF) obj;
        return this.LJLIL == c94453nF.LJLIL && o.LJ(this.LJLILLLLZI, c94453nF.LJLILLLLZI) && o.LJ(this.LJLJI, c94453nF.LJLJI) && o.LJ(this.LJLJJI, c94453nF.LJLJJI);
    }

    public final int hashCode() {
        int i = this.LJLIL * 31;
        C43I<Boolean> c43i = this.LJLILLLLZI;
        int hashCode = (i + (c43i == null ? 0 : c43i.hashCode())) * 31;
        C43I<Boolean> c43i2 = this.LJLJI;
        return this.LJLJJI.hashCode() + ((hashCode + (c43i2 != null ? c43i2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MemberListState(groupMemberShowCount=");
        LIZ.append(this.LJLIL);
        LIZ.append(", memberListUpdated=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", adminUpdated=");
        LIZ.append(this.LJLJI);
        LIZ.append(", refreshMemberList=");
        return C61845OOz.LIZIZ(LIZ, this.LJLJJI, ')', LIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C94453nF(int r5) {
        /*
            r4 = this;
            X.43I r3 = new X.43I
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r3.<init>(r0)
            X.43I r2 = new X.43I
            r2.<init>(r0)
            X.43I r1 = new X.43I
            r1.<init>(r0)
            r0 = 12
            r4.<init>(r0, r3, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C94453nF.<init>(int):void");
    }

    public C94453nF(int i, C43I<Boolean> c43i, C43I<Boolean> c43i2, C43I<Boolean> refreshMemberList) {
        o.LJIIIZ(refreshMemberList, "refreshMemberList");
        this.LJLIL = i;
        this.LJLILLLLZI = c43i;
        this.LJLJI = c43i2;
        this.LJLJJI = refreshMemberList;
    }

    public static C94453nF LIZ(C94453nF c94453nF, int i, C43I c43i, C43I c43i2, C43I refreshMemberList, int i2) {
        if ((i2 & 1) != 0) {
            i = c94453nF.LJLIL;
        }
        if ((i2 & 2) != 0) {
            c43i = c94453nF.LJLILLLLZI;
        }
        if ((i2 & 4) != 0) {
            c43i2 = c94453nF.LJLJI;
        }
        if ((i2 & 8) != 0) {
            refreshMemberList = c94453nF.LJLJJI;
        }
        c94453nF.getClass();
        o.LJIIIZ(refreshMemberList, "refreshMemberList");
        return new C94453nF(i, c43i, c43i2, refreshMemberList);
    }
}
