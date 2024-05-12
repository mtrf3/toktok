package X;

/* renamed from: X.0tw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22160tw {
    public static final C22160tw LIZJ = new C22160tw(C79043V0l.LJIIIIZZ(0), C79043V0l.LJIIIIZZ(0));
    public final long LIZ;
    public final long LIZIZ;

    public final int hashCode() {
        return C16880lQ.LLJIJIL(this.LIZIZ) + (C16880lQ.LLJIJIL(this.LIZ) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TextIndent(firstLine=");
        LIZ.append((Object) C23520w8.LIZLLL(this.LIZ));
        LIZ.append(", restLine=");
        LIZ.append((Object) C23520w8.LIZLLL(this.LIZIZ));
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22160tw)) {
            return false;
        }
        C22160tw c22160tw = (C22160tw) obj;
        if (C23520w8.LIZ(this.LIZ, c22160tw.LIZ) && C23520w8.LIZ(this.LIZIZ, c22160tw.LIZIZ)) {
            return true;
        }
        return false;
    }

    public C22160tw(long j, long j2) {
        this.LIZ = j;
        this.LIZIZ = j2;
    }
}
