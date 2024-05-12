package X;

/* renamed from: X.6mK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C170326mK {
    public static final /* synthetic */ int LIZJ = 0;
    public final int LIZ;
    public final float LIZIZ;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("op = ");
        LIZ.append(this.LIZ);
        LIZ.append(", duration = ");
        LIZ.append(this.LIZIZ);
        return X1D.LIZIZ(LIZ);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C170326mK)) {
            return false;
        }
        C170326mK c170326mK = (C170326mK) obj;
        if (this.LIZ != c170326mK.LIZ || this.LIZIZ != c170326mK.LIZIZ) {
            return false;
        }
        return true;
    }

    public C170326mK(float f, int i) {
        this.LIZ = i;
        this.LIZIZ = f;
    }
}
