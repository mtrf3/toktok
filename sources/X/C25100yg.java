package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.0yg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C25100yg {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final List<String> LIZLLL;
    public final List<String> LJ;

    public final int hashCode() {
        return this.LJ.hashCode() + C77339UWx.LIZ(this.LIZLLL, C79062V1e.LJ(this.LIZJ, C79062V1e.LJ(this.LIZIZ, this.LIZ.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ForeignKey{referenceTable='");
        Q89.LIZIZ(LIZ, this.LIZ, '\'', ", onDelete='");
        Q89.LIZIZ(LIZ, this.LIZIZ, '\'', ", onUpdate='");
        Q89.LIZIZ(LIZ, this.LIZJ, '\'', ", columnNames=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", referenceColumnNames=");
        return C1NE.LIZIZ(LIZ, this.LJ, '}', LIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25100yg)) {
            return false;
        }
        C25100yg c25100yg = (C25100yg) obj;
        if (!this.LIZ.equals(c25100yg.LIZ) || !this.LIZIZ.equals(c25100yg.LIZIZ) || !this.LIZJ.equals(c25100yg.LIZJ) || !this.LIZLLL.equals(c25100yg.LIZLLL)) {
            return false;
        }
        return this.LJ.equals(c25100yg.LJ);
    }

    public C25100yg(String str, String str2, String str3, List<String> list, List<String> list2) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = Collections.unmodifiableList(list);
        this.LJ = Collections.unmodifiableList(list2);
    }
}
