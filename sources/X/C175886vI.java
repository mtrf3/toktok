package X;

import kotlin.jvm.internal.o;

/* renamed from: X.6vI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C175886vI implements C33Q {
    public C43I<Integer> LJLIL;
    public C43I<Boolean> LJLILLLLZI;
    public C43I<? extends AbstractC175546uk> LJLJI;
    public C43I<? extends AbstractC175526ui> LJLJJI;
    public C43I<? extends AbstractC175586uo> LJLJJL;
    public boolean LJLJJLL;

    public C175886vI() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C175886vI)) {
            return false;
        }
        C175886vI c175886vI = (C175886vI) obj;
        return o.LJ(this.LJLIL, c175886vI.LJLIL) && o.LJ(this.LJLILLLLZI, c175886vI.LJLILLLLZI) && o.LJ(this.LJLJI, c175886vI.LJLJI) && o.LJ(this.LJLJJI, c175886vI.LJLJJI) && o.LJ(this.LJLJJL, c175886vI.LJLJJL) && this.LJLJJLL == c175886vI.LJLJJLL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int LIZIZ = C40328FsC.LIZIZ(this.LJLILLLLZI, this.LJLIL.hashCode() * 31, 31);
        C43I<? extends AbstractC175546uk> c43i = this.LJLJI;
        int i = 0;
        if (c43i == null) {
            hashCode = 0;
        } else {
            hashCode = c43i.hashCode();
        }
        int i2 = (LIZIZ + hashCode) * 31;
        C43I<? extends AbstractC175526ui> c43i2 = this.LJLJJI;
        if (c43i2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = c43i2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        C43I<? extends AbstractC175586uo> c43i3 = this.LJLJJL;
        if (c43i3 != null) {
            i = c43i3.hashCode();
        }
        int i4 = (i3 + i) * 31;
        boolean z = this.LJLJJLL;
        int i5 = z;
        if (z != 0) {
            i5 = 1;
        }
        return i4 + i5;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CommentManagementVMState(selectedCount=");
        LIZ.append(this.LJLIL);
        LIZ.append(", manageStatus=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", batchDeleteResult=");
        LIZ.append(this.LJLJI);
        LIZ.append(", batchReportResult=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", batchBlockResult=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", isTabSelected=");
        return C48339Iy7.LIZJ(LIZ, this.LJLJJLL, ')', LIZ);
    }

    public /* synthetic */ C175886vI(int i) {
        this(new C43I(0), new C43I(Boolean.FALSE), null, null, null, true);
    }

    public C175886vI(C43I<Integer> selectedCount, C43I<Boolean> manageStatus, C43I<? extends AbstractC175546uk> c43i, C43I<? extends AbstractC175526ui> c43i2, C43I<? extends AbstractC175586uo> c43i3, boolean z) {
        o.LJIIIZ(selectedCount, "selectedCount");
        o.LJIIIZ(manageStatus, "manageStatus");
        this.LJLIL = selectedCount;
        this.LJLILLLLZI = manageStatus;
        this.LJLJI = c43i;
        this.LJLJJI = c43i2;
        this.LJLJJL = c43i3;
        this.LJLJJLL = z;
    }

    public static C175886vI LIZ(C175886vI c175886vI, C43I c43i, C43I c43i2, C43I c43i3, C43I c43i4, C43I c43i5, boolean z, int i) {
        boolean z2 = z;
        C43I c43i6 = c43i5;
        C43I c43i7 = c43i4;
        C43I c43i8 = c43i3;
        C43I selectedCount = c43i;
        C43I manageStatus = c43i2;
        if ((i & 1) != 0) {
            selectedCount = c175886vI.LJLIL;
        }
        if ((i & 2) != 0) {
            manageStatus = c175886vI.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            c43i8 = c175886vI.LJLJI;
        }
        if ((i & 8) != 0) {
            c43i7 = c175886vI.LJLJJI;
        }
        if ((i & 16) != 0) {
            c43i6 = c175886vI.LJLJJL;
        }
        if ((i & 32) != 0) {
            z2 = c175886vI.LJLJJLL;
        }
        c175886vI.getClass();
        o.LJIIIZ(selectedCount, "selectedCount");
        o.LJIIIZ(manageStatus, "manageStatus");
        return new C175886vI(selectedCount, manageStatus, c43i8, c43i7, c43i6, z2);
    }
}
