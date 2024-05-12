package X;

import kotlin.jvm.internal.o;

/* renamed from: X.2Zn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C60632Zn {
    public final Float LIZ;

    public C60632Zn() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C60632Zn) && o.LJ(this.LIZ, ((C60632Zn) obj).LIZ);
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
        LIZ.append("SpeedEvent(speed=");
        LIZ.append(this.LIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C60632Zn(Float f) {
        this.LIZ = f;
    }
}
