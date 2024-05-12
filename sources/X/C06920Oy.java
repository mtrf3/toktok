package X;

import android.graphics.Insets;
import android.graphics.Rect;
import defpackage.b0;

/* renamed from: X.0Oy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C06920Oy {
    public static final C06920Oy LJ = new C06920Oy(0, 0, 0, 0);
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;

    public final Insets LJ() {
        return Insets.of(this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL);
    }

    public final int hashCode() {
        return (((((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31) + this.LIZLLL;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Insets{left=");
        LIZ.append(this.LIZ);
        LIZ.append(", top=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", right=");
        LIZ.append(this.LIZJ);
        LIZ.append(", bottom=");
        return b0.LIZJ(LIZ, this.LIZLLL, '}', LIZ);
    }

    public static C06920Oy LIZJ(Rect rect) {
        return LIZIZ(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static C06920Oy LIZLLL(Insets insets) {
        return LIZIZ(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C06920Oy.class != obj.getClass()) {
            return false;
        }
        C06920Oy c06920Oy = (C06920Oy) obj;
        if (this.LIZLLL == c06920Oy.LIZLLL && this.LIZ == c06920Oy.LIZ && this.LIZJ == c06920Oy.LIZJ && this.LIZIZ == c06920Oy.LIZIZ) {
            return true;
        }
        return false;
    }

    public static C06920Oy LIZ(C06920Oy c06920Oy, C06920Oy c06920Oy2) {
        return LIZIZ(Math.max(c06920Oy.LIZ, c06920Oy2.LIZ), Math.max(c06920Oy.LIZIZ, c06920Oy2.LIZIZ), Math.max(c06920Oy.LIZJ, c06920Oy2.LIZJ), Math.max(c06920Oy.LIZLLL, c06920Oy2.LIZLLL));
    }

    public C06920Oy(int i, int i2, int i3, int i4) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
        this.LIZLLL = i4;
    }

    public static C06920Oy LIZIZ(int i, int i2, int i3, int i4) {
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return LJ;
        }
        return new C06920Oy(i, i2, i3, i4);
    }
}
