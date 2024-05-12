package X;

/* loaded from: classes14.dex */
public final class V85 {
    public static final V85 LIZJ = new V85(-1, false);
    public static final V85 LIZLLL = new V85(-2, false);
    public static final V85 LJ = new V85(-1, true);
    public final int LIZ;
    public final boolean LIZIZ;

    public final String toString() {
        return C16880lQ.LLLZI(null, "%d defer:%b", new Object[]{Integer.valueOf(this.LIZ), Boolean.valueOf(this.LIZIZ)});
    }

    public final int LIZ() {
        int i = this.LIZ;
        if (i == -1) {
            throw new IllegalStateException("Rotation is set to use EXIF");
        }
        return i;
    }

    public final int hashCode() {
        int hashCode;
        Integer valueOf = Integer.valueOf(this.LIZ);
        Boolean valueOf2 = Boolean.valueOf(this.LIZIZ);
        int i = 0;
        if (valueOf == null) {
            hashCode = 0;
        } else {
            hashCode = valueOf.hashCode();
        }
        if (valueOf2 != null) {
            i = valueOf2.hashCode();
        }
        return C0EH.LIZ(hashCode, 31, 31, i);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof V85)) {
            return false;
        }
        V85 v85 = (V85) obj;
        if (this.LIZ == v85.LIZ && this.LIZIZ == v85.LIZIZ) {
            return true;
        }
        return false;
    }

    public V85(int i, boolean z) {
        this.LIZ = i;
        this.LIZIZ = z;
    }
}
