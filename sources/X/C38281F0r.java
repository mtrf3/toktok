package X;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.F0r, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38281F0r {
    public final String LIZ;
    public final Object LIZIZ = new ArrayList();
    public final Serializable LIZJ = "UTF-8";

    public final String LJ() {
        if (((List) this.LIZIZ).isEmpty()) {
            return this.LIZ;
        }
        String LJJIII = C63081OpJ.LJJIII((List) this.LIZIZ, (String) this.LIZJ);
        String str = this.LIZ;
        if (str == null || str.length() == 0) {
            return LJJIII;
        }
        if (this.LIZ.indexOf(63) >= 0) {
            StringBuilder LIZ = X1D.LIZ();
            return C025908h.LIZIZ(LIZ, this.LIZ, "&", LJJIII, LIZ);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        return C025908h.LIZIZ(LIZ2, this.LIZ, "?", LJJIII, LIZ2);
    }

    public final String toString() {
        return LJ();
    }

    public C38281F0r(String str) {
        this.LIZ = str;
    }

    public final void LIZ(int i, String str) {
        ((List) this.LIZIZ).add(new C66619QCp(str, String.valueOf(i)));
    }

    public final void LIZIZ(long j, String str) {
        ((List) this.LIZIZ).add(new C66619QCp(str, String.valueOf(j)));
    }

    public final void LIZJ(String str, double d) {
        ((List) this.LIZIZ).add(new C66619QCp(str, String.valueOf(d)));
    }

    public final void LIZLLL(String str, String str2) {
        ((List) this.LIZIZ).add(new C66619QCp(str, str2));
    }
}
