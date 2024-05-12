package X;

import kotlin.jvm.internal.o;

/* renamed from: X.8uT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C226338uT extends AbstractC226378uX {
    public final AbstractC220518l5 LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C226338uT) && o.LJ(this.LJ, ((C226338uT) obj).LJ);
    }

    public final int hashCode() {
        AbstractC220518l5 abstractC220518l5 = this.LJ;
        if (abstractC220518l5 == null) {
            return 0;
        }
        return abstractC220518l5.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AddYoursEntranceWithSticker(sticker=");
        LIZ.append(this.LJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C226338uT(AbstractC220518l5 abstractC220518l5) {
        super(Long.valueOf(abstractC220518l5.LIZ), abstractC220518l5.LIZJ, abstractC220518l5 instanceof C220508l4, true);
        this.LJ = abstractC220518l5;
    }
}
