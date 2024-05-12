package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3MD, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3MD {
    public final List<C3ML> LIZ;
    public final boolean LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final boolean LJFF;

    public C3MD() {
        this((List) null, false, 0, 0, 0, 63);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3MD)) {
            return false;
        }
        C3MD c3md = (C3MD) obj;
        return o.LJ(this.LIZ, c3md.LIZ) && this.LIZIZ == c3md.LIZIZ && this.LIZJ == c3md.LIZJ && this.LIZLLL == c3md.LIZLLL && this.LJ == c3md.LJ && this.LJFF == c3md.LJFF;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        boolean z = this.LIZIZ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((((((((hashCode + i) * 31) + this.LIZJ) * 31) + this.LIZLLL) * 31) + this.LJ) * 31) + (this.LJFF ? 1 : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("entranceList: ");
        DIL.LIZIZ(this.LIZ, LIZ, " hasMore:");
        LIZ.append(this.LIZIZ);
        LIZ.append(" tabType:");
        LIZ.append(this.LIZJ);
        LIZ.append(" filterType:");
        LIZ.append(this.LIZLLL);
        LIZ.append(" state:");
        LIZ.append(this.LJ);
        LIZ.append(" hasUnreadMessageRequest:");
        LIZ.append(this.LJFF);
        return X1D.LIZIZ(LIZ);
    }

    public static C3MD LIZ(C3MD c3md, List list, boolean z, boolean z2, int i) {
        int i2;
        int i3;
        int i4;
        boolean z3 = z2;
        List entranceList = list;
        boolean z4 = z;
        if ((i & 1) != 0) {
            entranceList = c3md.LIZ;
        }
        if ((i & 2) != 0) {
            z4 = c3md.LIZIZ;
        }
        if ((i & 4) != 0) {
            i2 = c3md.LIZJ;
        } else {
            i2 = 0;
        }
        if ((i & 8) != 0) {
            i3 = c3md.LIZLLL;
        } else {
            i3 = 0;
        }
        if ((i & 16) != 0) {
            i4 = c3md.LJ;
        } else {
            i4 = 0;
        }
        if ((i & 32) != 0) {
            z3 = c3md.LJFF;
        }
        c3md.getClass();
        o.LJIIIZ(entranceList, "entranceList");
        return new C3MD((List<C3ML>) entranceList, z4, i2, i3, i4, z3);
    }

    public C3MD(List list, boolean z, int i, int i2, int i3, int i4) {
        this((List<C3ML>) ((i4 & 1) != 0 ? C61878OQg.INSTANCE : list), (i4 & 2) != 0 ? true : z, (i4 & 4) != 0 ? -1 : i, (i4 & 8) != 0 ? -1 : i2, (i4 & 16) != 0 ? 1 : i3, false);
    }

    public C3MD(List<C3ML> entranceList, boolean z, int i, int i2, int i3, boolean z2) {
        o.LJIIIZ(entranceList, "entranceList");
        this.LIZ = entranceList;
        this.LIZIZ = z;
        this.LIZJ = i;
        this.LIZLLL = i2;
        this.LJ = i3;
        this.LJFF = z2;
    }
}
