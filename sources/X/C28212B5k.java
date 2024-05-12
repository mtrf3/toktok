package X;

import android.widget.FrameLayout;
import kotlin.jvm.internal.o;

/* renamed from: X.B5k, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28212B5k {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final boolean LJFF;
    public final EnumC74991Tbv LJI;
    public final String LJII;
    public final InterfaceC28213B5l LJIIIIZZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28212B5k)) {
            return false;
        }
        C28212B5k c28212B5k = (C28212B5k) obj;
        return this.LIZ == c28212B5k.LIZ && this.LIZIZ == c28212B5k.LIZIZ && this.LIZJ == c28212B5k.LIZJ && this.LIZLLL == c28212B5k.LIZLLL && this.LJ == c28212B5k.LJ && this.LJFF == c28212B5k.LJFF && this.LJI == c28212B5k.LJI && o.LJ(this.LJII, c28212B5k.LJII) && o.LJ(this.LJIIIIZZ, c28212B5k.LJIIIIZZ);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AudienceLayoutParams(width=");
        LIZ.append(this.LIZ);
        LIZ.append(", height=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", topMargin=");
        LIZ.append(this.LIZJ);
        LIZ.append(", leftMargin=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", rightMargin=");
        LIZ.append(this.LJ);
        LIZ.append(", isFullScreen=");
        LIZ.append(this.LJFF);
        LIZ.append(", layoutName=");
        LIZ.append(this.LJI);
        LIZ.append(", from=");
        LIZ.append(this.LJII);
        LIZ.append(", changeListener=");
        LIZ.append(this.LJIIIIZZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final FrameLayout.LayoutParams LIZ() {
        if (this.LJFF) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.rightMargin = 0;
            layoutParams.bottomMargin = 0;
            layoutParams.gravity = 17;
            layoutParams.leftMargin = 0;
            layoutParams.topMargin = 0;
            return layoutParams;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(this.LIZ, this.LIZIZ);
        layoutParams2.gravity = 51;
        layoutParams2.leftMargin = this.LIZLLL;
        layoutParams2.rightMargin = this.LJ;
        layoutParams2.topMargin = this.LIZJ;
        return layoutParams2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int i = ((((((((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31) + this.LIZLLL) * 31) + this.LJ) * 31;
        boolean z = this.LJFF;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int LJ = C79062V1e.LJ(this.LJII, (this.LJI.hashCode() + ((i + i2) * 31)) * 31, 31);
        InterfaceC28213B5l interfaceC28213B5l = this.LJIIIIZZ;
        if (interfaceC28213B5l == null) {
            hashCode = 0;
        } else {
            hashCode = interfaceC28213B5l.hashCode();
        }
        return LJ + hashCode;
    }

    public C28212B5k(int i, int i2, int i3, int i4, int i5, boolean z, EnumC74991Tbv layoutName, String from, InterfaceC28213B5l interfaceC28213B5l, int i6) {
        from = (i6 & 128) != 0 ? "multi-guest v3 widget" : from;
        interfaceC28213B5l = (i6 & 256) != 0 ? null : interfaceC28213B5l;
        o.LJIIIZ(layoutName, "layoutName");
        o.LJIIIZ(from, "from");
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
        this.LIZLLL = i4;
        this.LJ = i5;
        this.LJFF = z;
        this.LJI = layoutName;
        this.LJII = from;
        this.LJIIIIZZ = interfaceC28213B5l;
    }
}
