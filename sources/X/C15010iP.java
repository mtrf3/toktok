package X;

import kotlin.jvm.internal.o;

/* renamed from: X.0iP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15010iP {
    public final C08440Uu LIZ;
    public final long LIZIZ;
    public final C08350Ul LIZJ;

    static {
        C0MJ.LIZ(C517921n.LJLIL, C517821m.LJLIL);
    }

    public final int hashCode() {
        int i;
        int LIZJ = JBR.LIZJ(this.LIZIZ, this.LIZ.hashCode() * 31, 31);
        C08350Ul c08350Ul = this.LIZJ;
        if (c08350Ul != null) {
            i = C16880lQ.LLJIJIL(c08350Ul.LIZ);
        } else {
            i = 0;
        }
        return LIZJ + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TextFieldValue(text='");
        LIZ.append((Object) this.LIZ);
        LIZ.append("', selection=");
        LIZ.append((Object) C08350Ul.LJI(this.LIZIZ));
        LIZ.append(", composition=");
        LIZ.append(this.LIZJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15010iP)) {
            return false;
        }
        C15010iP c15010iP = (C15010iP) obj;
        if (C08350Ul.LIZ(this.LIZIZ, c15010iP.LIZIZ) && o.LJ(this.LIZJ, c15010iP.LIZJ) && o.LJ(this.LIZ, c15010iP.LIZ)) {
            return true;
        }
        return false;
    }

    public static C15010iP LIZIZ(C15010iP c15010iP, String text) {
        long j = c15010iP.LIZIZ;
        C08350Ul c08350Ul = c15010iP.LIZJ;
        c15010iP.getClass();
        o.LJIIIZ(text, "text");
        return new C15010iP(new C08440Uu(text, null, 6), j, c08350Ul);
    }

    public C15010iP(C08440Uu c08440Uu, long j, C08350Ul c08350Ul) {
        C08350Ul c08350Ul2;
        this.LIZ = c08440Uu;
        this.LIZIZ = C17N.LJIIJJI(c08440Uu.LJLIL.length(), j);
        if (c08350Ul != null) {
            c08350Ul2 = new C08350Ul(C17N.LJIIJJI(c08440Uu.LJLIL.length(), c08350Ul.LIZ));
        } else {
            c08350Ul2 = null;
        }
        this.LIZJ = c08350Ul2;
    }

    public C15010iP(String str, long j, int i) {
        this(new C08440Uu((i & 1) != 0 ? "" : str, null, 6), (i & 2) != 0 ? C08350Ul.LIZIZ : j, (C08350Ul) null);
    }

    public static C15010iP LIZ(C15010iP c15010iP, C08440Uu annotatedString, long j, int i) {
        C08350Ul c08350Ul;
        if ((i & 1) != 0) {
            annotatedString = c15010iP.LIZ;
        }
        if ((i & 2) != 0) {
            j = c15010iP.LIZIZ;
        }
        if ((i & 4) != 0) {
            c08350Ul = c15010iP.LIZJ;
        } else {
            c08350Ul = null;
        }
        c15010iP.getClass();
        o.LJIIIZ(annotatedString, "annotatedString");
        return new C15010iP(annotatedString, j, c08350Ul);
    }
}
