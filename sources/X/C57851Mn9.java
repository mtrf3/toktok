package X;

import com.zhiliaoapp.musically.R;
import defpackage.b0;

/* renamed from: X.Mn9, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57851Mn9 extends AbstractC57844Mn2 {
    public final int LJLILLLLZI;
    public final int LJLJI;
    public final int LJLJJI;
    public final int LJLJJL;
    public final String LJLJJLL;

    public C57851Mn9() {
        this(0, 0, 0, 15);
    }

    public final int hashCode() {
        return (((((this.LJLILLLLZI * 31) + this.LJLJI) * 31) + this.LJLJJI) * 31) + this.LJLJJL;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NormalTitle(textRes=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", colorLight=");
        LIZ.append(this.LJLJI);
        LIZ.append(", tuxFont=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", colorDark=");
        return b0.LIZJ(LIZ, this.LJLJJL, ')', LIZ);
    }

    @Override // X.AbstractC57844Mn2
    public final int LIZ() {
        return this.LJLJJL;
    }

    @Override // X.AbstractC57844Mn2
    public final int LIZIZ() {
        return this.LJLJI;
    }

    @Override // X.AbstractC57844Mn2
    public final int LIZJ() {
        return this.LJLILLLLZI;
    }

    @Override // X.AbstractC57844Mn2
    public final int LIZLLL() {
        return this.LJLJJI;
    }

    @Override // X.InterfaceC57927MoN
    public final String getElementId() {
        return this.LJLJJLL;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C57851Mn9)) {
            return false;
        }
        C57851Mn9 c57851Mn9 = (C57851Mn9) obj;
        if (this.LJLILLLLZI == c57851Mn9.LJLILLLLZI && this.LJLJI == c57851Mn9.LJLJI && this.LJLJJI == c57851Mn9.LJLJJI && this.LJLJJL == c57851Mn9.LJLJJL) {
            return true;
        }
        return false;
    }

    public C57851Mn9(int i, int i2, int i3, int i4) {
        int i5;
        i = (i4 & 1) != 0 ? R.string.puu : i;
        i2 = (i4 & 2) != 0 ? R.attr.gv : i2;
        i3 = (i4 & 4) != 0 ? 62 : i3;
        if ((i4 & 8) != 0) {
            i5 = R.attr.dm;
        } else {
            i5 = 0;
        }
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
        this.LJLJJI = i3;
        this.LJLJJL = i5;
        this.LJLJJLL = "Normal_Title";
    }
}
