package X;

import defpackage.b0;

/* renamed from: X.VEl, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79407VEl {
    public final int LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C79407VEl)) {
            return false;
        }
        C79407VEl c79407VEl = (C79407VEl) obj;
        return this.LIZ == c79407VEl.LIZ && this.LIZIZ == c79407VEl.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RadialColor(centerColor=");
        LIZ.append(this.LIZ);
        LIZ.append(", edgeColor=");
        return b0.LIZJ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C79407VEl(int i, int i2) {
        this.LIZ = i;
        this.LIZIZ = i2;
    }
}
