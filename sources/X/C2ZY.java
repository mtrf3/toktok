package X;

import kotlin.jvm.internal.o;

/* renamed from: X.2ZY, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2ZY {
    public final Float LIZ;

    public C2ZY() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2ZY) && o.LJ(this.LIZ, ((C2ZY) obj).LIZ);
    }

    public final int hashCode() {
        Float f = this.LIZ;
        if (f == null) {
            return 0;
        }
        return f.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VolumeEvent(volume=");
        LIZ.append(this.LIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C2ZY(Float f) {
        this.LIZ = f;
    }
}
