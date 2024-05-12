package X;

import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EU4 {
    public final Object LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EU4) && o.LJ(this.LIZ, ((EU4) obj).LIZ);
    }

    public final int hashCode() {
        Object obj = this.LIZ;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AwemeSettingsWrap(awemeSettings=");
        return U26.LIZJ(LIZ, this.LIZ, ')', LIZ);
    }

    public EU4(Object obj) {
        this.LIZ = obj;
    }
}
