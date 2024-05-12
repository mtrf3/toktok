package X;

import defpackage.b0;

/* renamed from: X.1LG, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1LG extends AbstractC07660Ru {
    public final int LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1LG) && this.LIZ == ((C1LG) obj).LIZ;
    }

    public final int hashCode() {
        return this.LIZ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NewRequestCount(count=");
        return b0.LIZJ(LIZ, this.LIZ, ')', LIZ);
    }

    public C1LG(int i) {
        this.LIZ = i;
    }
}
