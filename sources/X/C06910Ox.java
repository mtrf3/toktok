package X;

import java.util.Objects;

/* renamed from: X.0Ox, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C06910Ox {
    public final Object LIZ;

    public final int hashCode() {
        Object obj = this.LIZ;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DisplayCutoutCompat{");
        LIZ.append(this.LIZ);
        LIZ.append("}");
        return X1D.LIZIZ(LIZ);
    }

    public C06910Ox(Object obj) {
        this.LIZ = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C06910Ox.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.LIZ, ((C06910Ox) obj).LIZ);
    }
}
