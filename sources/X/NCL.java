package X;

import defpackage.b0;

/* loaded from: classes11.dex */
public final class NCL extends NCK {
    public final int LIZ;

    public NCL() {
        super(0);
        this.LIZ = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NCL) && this.LIZ == ((NCL) obj).LIZ;
    }

    public final int hashCode() {
        return this.LIZ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Progress(value=");
        return b0.LIZJ(LIZ, this.LIZ, ')', LIZ);
    }
}
