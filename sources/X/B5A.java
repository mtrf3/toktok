package X;

import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class B5A {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final boolean LJFF;
    public final InterfaceC28213B5l LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B5A)) {
            return false;
        }
        B5A b5a = (B5A) obj;
        return this.LIZ == b5a.LIZ && this.LIZIZ == b5a.LIZIZ && this.LIZJ == b5a.LIZJ && this.LIZLLL == b5a.LIZLLL && this.LJ == b5a.LJ && this.LJFF == b5a.LJFF && o.LJ(this.LJI, b5a.LJI);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int i = ((((((((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31) + this.LIZLLL) * 31) + this.LJ) * 31;
        boolean z = this.LJFF;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int i3 = (i + i2) * 31;
        InterfaceC28213B5l interfaceC28213B5l = this.LJI;
        return i3 + (interfaceC28213B5l == null ? 0 : interfaceC28213B5l.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PlayerChangeLayoutParam(width=");
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
        LIZ.append(", playerChangeListener=");
        LIZ.append(this.LJI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public /* synthetic */ B5A(int i, int i2, int i3, int i4, int i5, boolean z) {
        this(i, i2, i3, i4, i5, z, null);
    }

    public B5A(int i, int i2, int i3, int i4, int i5, boolean z, InterfaceC28213B5l interfaceC28213B5l) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
        this.LIZLLL = i4;
        this.LJ = i5;
        this.LJFF = z;
        this.LJI = interfaceC28213B5l;
    }
}
