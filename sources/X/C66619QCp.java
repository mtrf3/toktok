package X;

/* renamed from: X.QCp, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66619QCp implements InterfaceC49552Jca, Cloneable {
    public final String LJLIL;
    public final String LJLILLLLZI;

    public final int hashCode() {
        return C1GE.LJIIJ(C1GE.LJIIJ(17, this.LJLIL), this.LJLILLLLZI);
    }

    public final String toString() {
        int length = this.LJLIL.length();
        String str = this.LJLILLLLZI;
        if (str != null) {
            length = C1FL.LIZ(str, 1, length);
        }
        C66622QCs c66622QCs = new C66622QCs(length);
        c66622QCs.LIZIZ(this.LJLIL);
        if (this.LJLILLLLZI != null) {
            c66622QCs.LIZIZ("=");
            c66622QCs.LIZIZ(this.LJLILLLLZI);
        }
        return c66622QCs.toString();
    }

    public final Object clone() {
        return super.clone();
    }

    @Override // X.InterfaceC49552Jca
    public final String getName() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC49552Jca
    public final String getValue() {
        return this.LJLILLLLZI;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterfaceC49552Jca)) {
            return false;
        }
        C66619QCp c66619QCp = (C66619QCp) obj;
        if (!this.LJLIL.equals(c66619QCp.LJLIL)) {
            return false;
        }
        String str = this.LJLILLLLZI;
        String str2 = c66619QCp.LJLILLLLZI;
        if (str == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str.equals(str2)) {
            return false;
        }
        return true;
    }

    public C66619QCp(String str, String str2) {
        if (str != null) {
            this.LJLIL = str;
            this.LJLILLLLZI = str2;
            return;
        }
        throw new IllegalArgumentException("Name may not be null");
    }
}
