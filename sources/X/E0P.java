package X;

import defpackage.b0;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class E0P {
    public final List<C63210OrO> LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E0P)) {
            return false;
        }
        E0P e0p = (E0P) obj;
        return o.LJ(this.LIZ, e0p.LIZ) && this.LIZIZ == e0p.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SaveMessageListResult(resultList=");
        LIZ.append(this.LIZ);
        LIZ.append(", failedToSaveMessages=");
        return b0.LIZJ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public E0P(List<C63210OrO> list, int i) {
        this.LIZ = list;
        this.LIZIZ = i;
    }
}
