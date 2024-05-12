package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.2Rz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C58672Rz {
    public final List<C43394H1i> LIZ;

    public C58672Rz() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C58672Rz) && o.LJ(this.LIZ, ((C58672Rz) obj).LIZ);
    }

    public final int hashCode() {
        List<C43394H1i> list = this.LIZ;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SmartSliceConfig(sliceSettings=");
        return C1NE.LIZIZ(LIZ, this.LIZ, ')', LIZ);
    }

    public C58672Rz(List<C43394H1i> list) {
        this.LIZ = list;
    }
}
