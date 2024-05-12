package X;

import kotlin.jvm.internal.o;

/* renamed from: X.IxK, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48290IxK implements Comparable<C48290IxK> {
    public static final C48290IxK LJLJJL = new C48290IxK();
    public final int LJLIL = 1;
    public final int LJLILLLLZI = 7;
    public final int LJLJI = 21;
    public final int LJLJJI;

    public C48290IxK() {
        if (new C40517FvF(0, 255).LJIILJJIL(1) && new C40517FvF(0, 255).LJIILJJIL(7) && new C40517FvF(0, 255).LJIILJJIL(21)) {
            this.LJLJJI = 67349;
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Version components are out of range: ");
        LIZ.append(1);
        LIZ.append('.');
        LIZ.append(7);
        LIZ.append('.');
        LIZ.append(21);
        String LIZIZ = X1D.LIZIZ(LIZ);
        LIZIZ.toString();
        throw new IllegalArgumentException(LIZIZ);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJLIL);
        LIZ.append('.');
        LIZ.append(this.LJLILLLLZI);
        LIZ.append('.');
        LIZ.append(this.LJLJI);
        return X1D.LIZIZ(LIZ);
    }

    public final int hashCode() {
        return this.LJLJJI;
    }

    @Override // java.lang.Comparable
    public final int compareTo(C48290IxK c48290IxK) {
        C48290IxK other = c48290IxK;
        o.LJIIIZ(other, "other");
        return this.LJLJJI - other.LJLJJI;
    }

    public final boolean equals(Object obj) {
        C48290IxK c48290IxK;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C48290IxK) {
            c48290IxK = (C48290IxK) obj;
        } else {
            c48290IxK = null;
        }
        if (c48290IxK != null && this.LJLJJI == c48290IxK.LJLJJI) {
            return true;
        }
        return false;
    }
}
