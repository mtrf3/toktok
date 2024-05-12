package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Rhk, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70256Rhk implements InterfaceC70269Rhx {
    public final String LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int LJ = C79062V1e.LJ(this.LIZIZ, this.LIZ.hashCode() * 31, 31);
        boolean z = this.LIZJ;
        int i = 1;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int i3 = (LJ + i2) * 31;
        boolean z2 = this.LIZLLL;
        int i4 = z2;
        if (z2 != 0) {
            i4 = 1;
        }
        int i5 = (i3 + i4) * 31;
        if (!this.LJ) {
            i = 0;
        }
        return i5 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UI(id=");
        LIZ.append(this.LIZ);
        LIZ.append(", text=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", hasStock=");
        LIZ.append(this.LIZJ);
        LIZ.append(", isSelected=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", isEnable=");
        return C48339Iy7.LIZJ(LIZ, this.LJ, ')', LIZ);
    }

    @Override // X.InterfaceC70269Rhx
    public final boolean LIZ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC70269Rhx
    public final String getId() {
        return this.LIZ;
    }

    @Override // X.InterfaceC70269Rhx
    public final boolean isEnable() {
        return this.LJ;
    }

    @Override // X.InterfaceC70269Rhx
    public final InterfaceC70269Rhx LIZIZ(boolean z) {
        return LIZJ(this, false, z, false, 23);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C70256Rhk)) {
            return false;
        }
        C70256Rhk c70256Rhk = (C70256Rhk) obj;
        if (o.LJ(this.LIZ, c70256Rhk.LIZ) && o.LJ(this.LIZIZ, c70256Rhk.LIZIZ) && this.LIZJ == c70256Rhk.LIZJ && this.LIZLLL == c70256Rhk.LIZLLL && this.LJ == c70256Rhk.LJ) {
            return true;
        }
        return false;
    }

    public C70256Rhk(boolean z, String str, boolean z2, boolean z3, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = z;
        this.LIZLLL = z2;
        this.LJ = z3;
    }

    public static C70256Rhk LIZJ(C70256Rhk c70256Rhk, boolean z, boolean z2, boolean z3, int i) {
        String id;
        boolean z4 = z3;
        boolean z5 = z;
        boolean z6 = z2;
        String text = null;
        if ((i & 1) != 0) {
            id = c70256Rhk.LIZ;
        } else {
            id = null;
        }
        if ((i & 2) != 0) {
            text = c70256Rhk.LIZIZ;
        }
        if ((i & 4) != 0) {
            z5 = c70256Rhk.LIZJ;
        }
        if ((i & 8) != 0) {
            z6 = c70256Rhk.LIZLLL;
        }
        if ((i & 16) != 0) {
            z4 = c70256Rhk.LJ;
        }
        c70256Rhk.getClass();
        o.LJIIIZ(id, "id");
        o.LJIIIZ(text, "text");
        return new C70256Rhk(z5, id, z6, z4, text);
    }
}
