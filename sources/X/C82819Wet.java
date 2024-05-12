package X;

import defpackage.b0;

/* renamed from: X.Wet, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82819Wet {
    public final int LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C82819Wet)) {
            return false;
        }
        C82819Wet c82819Wet = (C82819Wet) obj;
        return this.LIZ == c82819Wet.LIZ && this.LIZIZ == c82819Wet.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Size(width=");
        LIZ.append(this.LIZ);
        LIZ.append(", height=");
        return b0.LIZJ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C82819Wet(int i, int i2) {
        this.LIZ = i;
        this.LIZIZ = i2;
    }
}
