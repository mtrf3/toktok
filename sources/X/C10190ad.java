package X;

import defpackage.b0;

/* renamed from: X.0ad, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10190ad {
    public final int LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10190ad)) {
            return false;
        }
        C10190ad c10190ad = (C10190ad) obj;
        return this.LIZ == c10190ad.LIZ && this.LIZIZ == c10190ad.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Interval(start=");
        LIZ.append(this.LIZ);
        LIZ.append(", end=");
        return b0.LIZJ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C10190ad(int i, int i2) {
        boolean z;
        this.LIZ = i;
        this.LIZIZ = i2;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i2 >= i) {
                return;
            }
            "Failed requirement.".toString();
            throw new IllegalArgumentException("Failed requirement.");
        }
        "Failed requirement.".toString();
        throw new IllegalArgumentException("Failed requirement.");
    }
}
