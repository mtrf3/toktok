package X;

/* renamed from: X.0qp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20230qp {
    public final long LIZ;
    public final long LIZIZ;

    public final int hashCode() {
        return C61876OQe.LIZJ(this.LIZIZ) + (C61876OQe.LIZJ(this.LIZ) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SelectionColors(selectionHandleColor=");
        C78920UyC.LJ(this.LIZ, LIZ, ", selectionBackgroundColor=");
        LIZ.append((Object) C11850dJ.LJIIIIZZ(this.LIZIZ));
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20230qp)) {
            return false;
        }
        C20230qp c20230qp = (C20230qp) obj;
        if (C11850dJ.LIZJ(this.LIZ, c20230qp.LIZ) && C11850dJ.LIZJ(this.LIZIZ, c20230qp.LIZIZ)) {
            return true;
        }
        return false;
    }

    public C20230qp(long j, long j2) {
        this.LIZ = j;
        this.LIZIZ = j2;
    }
}
