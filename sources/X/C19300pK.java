package X;

/* renamed from: X.0pK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C19300pK {
    public final String LIZ;
    public final int LIZIZ;

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19300pK)) {
            return false;
        }
        C19300pK c19300pK = (C19300pK) obj;
        if (this.LIZIZ != c19300pK.LIZIZ) {
            return false;
        }
        return this.LIZ.equals(c19300pK.LIZ);
    }

    public C19300pK(String str, int i) {
        this.LIZ = str;
        this.LIZIZ = i;
    }
}
