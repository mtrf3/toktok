package X;

import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class W3N {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final boolean LIZLLL;
    public final int LJ;
    public final InterfaceC88472Yns<C62Q, C76800UCe> LJFF;
    public final boolean LJI;
    public final InterfaceC88471Ynr<C62Q, W3N, C76800UCe> LJII;

    public W3N() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof W3N)) {
            return false;
        }
        W3N w3n = (W3N) obj;
        return this.LIZ == w3n.LIZ && this.LIZIZ == w3n.LIZIZ && this.LIZJ == w3n.LIZJ && this.LIZLLL == w3n.LIZLLL && this.LJ == w3n.LJ && o.LJ(this.LJFF, w3n.LJFF) && this.LJI == w3n.LJI && o.LJ(this.LJII, w3n.LJII);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int i = ((((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31;
        boolean z = this.LIZLLL;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int i3 = (((i + i2) * 31) + this.LJ) * 31;
        InterfaceC88472Yns<C62Q, C76800UCe> interfaceC88472Yns = this.LJFF;
        return this.LJII.hashCode() + ((((i3 + (interfaceC88472Yns == null ? 0 : interfaceC88472Yns.hashCode())) * 31) + (this.LJI ? 1 : 0)) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NowToolbarItemModel(toolbarType=");
        LIZ.append(this.LIZ);
        LIZ.append(", defaultIcon=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", iconRes=");
        LIZ.append(this.LIZJ);
        LIZ.append(", isSelected=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", selectIconRes=");
        LIZ.append(this.LJ);
        LIZ.append(", selectedCheckRunnable=");
        LIZ.append(this.LJFF);
        LIZ.append(", showNewItemAlert=");
        LIZ.append(this.LJI);
        LIZ.append(", clickListener=");
        LIZ.append(this.LJII);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public W3N(int i, int i2, boolean z, int i3, AqS180S0100000_14 aqS180S0100000_14, boolean z2, InterfaceC88471Ynr interfaceC88471Ynr, int i4) {
        int i5;
        i2 = (i4 & 2) != 0 ? -1 : i2;
        if ((i4 & 4) != 0) {
            i5 = -1;
        } else {
            i5 = 0;
        }
        z = (i4 & 8) != 0 ? false : z;
        i3 = (i4 & 16) != 0 ? -1 : i3;
        aqS180S0100000_14 = (i4 & 32) != 0 ? null : aqS180S0100000_14;
        z2 = (i4 & 64) != 0 ? false : z2;
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i5;
        this.LIZLLL = z;
        this.LJ = i3;
        this.LJFF = aqS180S0100000_14;
        this.LJI = z2;
        this.LJII = interfaceC88471Ynr;
    }
}
