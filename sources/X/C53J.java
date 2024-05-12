package X;

import android.graphics.drawable.Drawable;
import defpackage.b0;
import kotlin.jvm.internal.o;

/* renamed from: X.53J, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C53J {
    public final Drawable LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final int LJI;
    public final int LJII;

    public C53J() {
        this(null, 0, 0, 255);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C53J)) {
            return false;
        }
        C53J c53j = (C53J) obj;
        return o.LJ(this.LIZ, c53j.LIZ) && this.LIZIZ == c53j.LIZIZ && this.LIZJ == c53j.LIZJ && this.LIZLLL == c53j.LIZLLL && this.LJ == c53j.LJ && this.LJFF == c53j.LJFF && this.LJI == c53j.LJI && this.LJII == c53j.LJII;
    }

    public final int hashCode() {
        Drawable drawable = this.LIZ;
        return ((((((((((((((drawable == null ? 0 : drawable.hashCode()) * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31) + this.LIZLLL) * 31) + this.LJ) * 31) + this.LJFF) * 31) + this.LJI) * 31) + this.LJII;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SubMenuViewConfig(backIconDrawable=");
        LIZ.append(this.LIZ);
        LIZ.append(", backIconContainerBg=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", backIconContainerWidth=");
        LIZ.append(this.LIZJ);
        LIZ.append(", backIconContainerHeight=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", backIconContainerStartMargin=");
        LIZ.append(this.LJ);
        LIZ.append(", backIconContainerEndMargin=");
        LIZ.append(this.LJFF);
        LIZ.append(", backIconContainerTopMargin=");
        LIZ.append(this.LJI);
        LIZ.append(", backIconContainerBottomMargin=");
        return b0.LIZJ(LIZ, this.LJII, ')', LIZ);
    }

    public C53J(SY9 sy9, int i, int i2, int i3) {
        sy9 = (i3 & 1) != 0 ? null : sy9;
        i = (i3 & 2) != 0 ? 0 : i;
        i2 = (i3 & 64) != 0 ? 0 : i2;
        this.LIZ = sy9;
        this.LIZIZ = i;
        this.LIZJ = 0;
        this.LIZLLL = 0;
        this.LJ = 0;
        this.LJFF = 0;
        this.LJI = i2;
        this.LJII = 0;
    }
}
