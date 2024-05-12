package X;

import defpackage.b0;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JZX {
    public final Integer LIZ;
    public final String LIZIZ;
    public final Integer LIZJ;
    public final int LIZLLL;

    public JZX() {
        this(-100, null, -1, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JZX)) {
            return false;
        }
        JZX jzx = (JZX) obj;
        return o.LJ(this.LIZ, jzx.LIZ) && o.LJ(this.LIZIZ, jzx.LIZIZ) && o.LJ(this.LIZJ, jzx.LIZJ) && this.LIZLLL == jzx.LIZLLL;
    }

    public final int hashCode() {
        Integer num = this.LIZ;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.LIZIZ;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.LIZJ;
        return ((hashCode2 + (num2 != null ? num2.hashCode() : 0)) * 31) + this.LIZLLL;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CardItemInfo(itemType=");
        LIZ.append(this.LIZ);
        LIZ.append(", lynxItemType=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", rank=");
        LIZ.append(this.LIZJ);
        LIZ.append(", ecSearchEntranceValue=");
        return b0.LIZJ(LIZ, this.LIZLLL, ')', LIZ);
    }

    public JZX(int i, Integer num, Integer num2, String str) {
        this.LIZ = num;
        this.LIZIZ = str;
        this.LIZJ = num2;
        this.LIZLLL = i;
    }
}
