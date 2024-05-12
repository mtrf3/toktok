package X;

/* renamed from: X.QcD, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67365QcD {
    public final String LIZ;

    public final int hashCode() {
        return this.LIZ.hashCode() ^ 1000003;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Encoding{name=\"");
        return JBR.LJFF(LIZ, this.LIZ, "\"}", LIZ);
    }

    public C67365QcD(String str) {
        if (str != null) {
            this.LIZ = str;
            return;
        }
        throw new NullPointerException("name is null");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C67365QcD)) {
            return false;
        }
        return this.LIZ.equals(((C67365QcD) obj).LIZ);
    }
}
