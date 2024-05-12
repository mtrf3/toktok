package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ATE {
    public final boolean LIZ;
    public final C4RB LIZIZ;
    public final List<InterfaceC62486Ofi> LIZJ;
    public final List<InterfaceC62486Ofi> LIZLLL;
    public final List<C4NN> LJ;
    public final boolean LJFF;

    public ATE() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ATE)) {
            return false;
        }
        ATE ate = (ATE) obj;
        return this.LIZ == ate.LIZ && o.LJ(this.LIZIZ, ate.LIZIZ) && o.LJ(this.LIZJ, ate.LIZJ) && o.LJ(this.LIZLLL, ate.LIZLLL) && o.LJ(this.LJ, ate.LJ) && this.LJFF == ate.LJFF;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    public final int hashCode() {
        int hashCode;
        boolean z = this.LIZ;
        int i = 1;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i2 = r0 * 31;
        C4RB c4rb = this.LIZIZ;
        if (c4rb == null) {
            hashCode = 0;
        } else {
            hashCode = c4rb.hashCode();
        }
        int LIZIZ = AnonymousClass391.LIZIZ(this.LJ, AnonymousClass391.LIZIZ(this.LIZLLL, AnonymousClass391.LIZIZ(this.LIZJ, (i2 + hashCode) * 31, 31), 31), 31);
        if (!this.LJFF) {
            i = 0;
        }
        return LIZIZ + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LongPressSharePanelConfig(supportIM=");
        LIZ.append(this.LIZ);
        LIZ.append(", imShareHook=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", actions=");
        LIZ.append(this.LIZJ);
        LIZ.append(", reasonActions=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", batchGroups=");
        LIZ.append(this.LJ);
        LIZ.append(", vibrate=");
        return C48339Iy7.LIZJ(LIZ, this.LJFF, ')', LIZ);
    }

    public ATE(boolean z, C4RB c4rb, List list, List list2, List list3, int i) {
        boolean z2;
        List list4 = list3;
        List list5 = list;
        List list6 = list2;
        c4rb = (i & 2) != 0 ? null : c4rb;
        list5 = (i & 4) != 0 ? C61878OQg.INSTANCE : list5;
        list6 = (i & 8) != 0 ? C61878OQg.INSTANCE : list6;
        list4 = (i & 16) != 0 ? C61878OQg.INSTANCE : list4;
        if ((i & 32) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        C00F.LJ(list5, "actions", list6, "reasonActions", list4, "batchGroups");
        this.LIZ = z;
        this.LIZIZ = c4rb;
        this.LIZJ = list5;
        this.LIZLLL = list6;
        this.LJ = list4;
        this.LJFF = z2;
    }
}
