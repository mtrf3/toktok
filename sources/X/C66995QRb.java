package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.QRb, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66995QRb {
    public final List<C66996QRc> LIZ = new ArrayList();
    public final String LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public String LJ;

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        List<C66996QRc> list = this.LIZ;
        int i5 = 0;
        if (list != null) {
            i = list.hashCode();
        } else {
            i = 0;
        }
        int i6 = i * 31;
        String str = this.LIZIZ;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 31;
        String str2 = this.LIZJ;
        if (str2 != null) {
            i3 = str2.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 31;
        String str3 = this.LIZLLL;
        if (str3 != null) {
            i4 = str3.hashCode();
        } else {
            i4 = 0;
        }
        int i9 = (i8 + i4) * 31;
        String str4 = this.LJ;
        if (str4 != null) {
            i5 = str4.hashCode();
        }
        return i9 + i5;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Component{name='");
        Q89.LIZIZ(LIZ, this.LIZIZ, '\'', ", intentFilter=");
        LIZ.append(this.LIZ);
        LIZ.append(", processName='");
        Q89.LIZIZ(LIZ, this.LIZJ, '\'', ", permission='");
        Q89.LIZIZ(LIZ, this.LIZLLL, '\'', ", authorities='");
        return C77800Ug8.LIZJ(LIZ, this.LJ, '\'', '}', LIZ);
    }

    public C66995QRb(String str) {
        this.LIZIZ = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C66995QRb)) {
            return false;
        }
        C66995QRb c66995QRb = (C66995QRb) obj;
        List<C66996QRc> list = this.LIZ;
        if (list == null ? c66995QRb.LIZ != null : !list.equals(c66995QRb.LIZ)) {
            return false;
        }
        String str = this.LIZIZ;
        if (str == null ? c66995QRb.LIZIZ != null : !str.equals(c66995QRb.LIZIZ)) {
            return false;
        }
        String str2 = this.LIZJ;
        if (str2 == null ? c66995QRb.LIZJ != null : !str2.equals(c66995QRb.LIZJ)) {
            return false;
        }
        String str3 = this.LIZLLL;
        if (str3 == null ? c66995QRb.LIZLLL != null : !str3.equals(c66995QRb.LIZLLL)) {
            return false;
        }
        String str4 = this.LJ;
        String str5 = c66995QRb.LJ;
        if (str4 == null ? str5 == null : str4.equals(str5)) {
            return true;
        }
        return false;
    }
}
