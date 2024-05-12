package X;

import defpackage.s0;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LH6 {
    public final C53986LGs LIZ;
    public final C53986LGs LIZIZ;
    public final C53986LGs LIZJ;
    public final C53986LGs LIZLLL;
    public final Integer LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LH6)) {
            return false;
        }
        LH6 lh6 = (LH6) obj;
        return o.LJ(this.LIZ, lh6.LIZ) && o.LJ(this.LIZIZ, lh6.LIZIZ) && o.LJ(this.LIZJ, lh6.LIZJ) && o.LJ(this.LIZLLL, lh6.LIZLLL) && o.LJ(this.LJ, lh6.LJ);
    }

    public final int hashCode() {
        int hashCode = (this.LIZLLL.hashCode() + ((this.LIZJ.hashCode() + ((this.LIZIZ.hashCode() + (this.LIZ.hashCode() * 31)) * 31)) * 31)) * 31;
        Integer num = this.LJ;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BottomTabIcon(iconSelectLight=");
        LIZ.append(this.LIZ);
        LIZ.append(", iconSelectDark=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", iconUnselectLight=");
        LIZ.append(this.LIZJ);
        LIZ.append(", iconUnselectDark=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", id=");
        return s0.LIZJ(LIZ, this.LJ, ')', LIZ);
    }

    public LH6(C53986LGs c53986LGs, C53986LGs iconSelectDark, C53986LGs c53986LGs2, C53986LGs c53986LGs3, Integer num) {
        o.LJIIIZ(iconSelectDark, "iconSelectDark");
        this.LIZ = c53986LGs;
        this.LIZIZ = iconSelectDark;
        this.LIZJ = c53986LGs2;
        this.LIZLLL = c53986LGs3;
        this.LJ = num;
    }
}
