package X;

import defpackage.s0;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class L4W {
    public final EnumC53663L4h LIZ;
    public final L4O LIZIZ;
    public final L4P LIZJ;
    public final L4X LIZLLL;
    public final Integer LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L4W)) {
            return false;
        }
        L4W l4w = (L4W) obj;
        return this.LIZ == l4w.LIZ && o.LJ(this.LIZIZ, l4w.LIZIZ) && o.LJ(this.LIZJ, l4w.LIZJ) && o.LJ(this.LIZLLL, l4w.LIZLLL) && o.LJ(this.LJ, l4w.LJ);
    }

    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        L4O l4o = this.LIZIZ;
        int hashCode2 = (this.LIZJ.hashCode() + ((hashCode + (l4o == null ? 0 : l4o.hashCode())) * 31)) * 31;
        L4X l4x = this.LIZLLL;
        int hashCode3 = (hashCode2 + (l4x == null ? 0 : l4x.hashCode())) * 31;
        Integer num = this.LJ;
        return hashCode3 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AvatarNodeFullData(businessTag=");
        LIZ.append(this.LIZ);
        LIZ.append(", businessState=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", nodeConfig=");
        LIZ.append(this.LIZJ);
        LIZ.append(", nodePosition=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", viewIdx=");
        return s0.LIZJ(LIZ, this.LJ, ')', LIZ);
    }

    public L4W(EnumC53663L4h businessTag, L4O l4o, L4P l4p) {
        o.LJIIIZ(businessTag, "businessTag");
        this.LIZ = businessTag;
        this.LIZIZ = l4o;
        this.LIZJ = l4p;
        this.LIZLLL = null;
        this.LJ = null;
    }
}
