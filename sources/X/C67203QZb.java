package X;

/* renamed from: X.QZb, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67203QZb extends AbstractC67210QZi {
    public final String LIZ;
    public final String LIZIZ;

    public final int hashCode() {
        return ((this.LIZ.hashCode() ^ 1000003) * 1000003) ^ this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LibraryVersion{libraryName=");
        LIZ.append(this.LIZ);
        LIZ.append(", version=");
        return JBR.LJFF(LIZ, this.LIZIZ, "}", LIZ);
    }

    @Override // X.AbstractC67210QZi
    public final String LIZ() {
        return this.LIZ;
    }

    @Override // X.AbstractC67210QZi
    public final String LIZIZ() {
        return this.LIZIZ;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC67210QZi)) {
            return false;
        }
        AbstractC67210QZi abstractC67210QZi = (AbstractC67210QZi) obj;
        if (this.LIZ.equals(abstractC67210QZi.LIZ()) && this.LIZIZ.equals(abstractC67210QZi.LIZIZ())) {
            return true;
        }
        return false;
    }

    public C67203QZb(String str, String str2) {
        if (str != null) {
            this.LIZ = str;
            if (str2 != null) {
                this.LIZIZ = str2;
                return;
            }
            throw new NullPointerException("Null version");
        }
        throw new NullPointerException("Null libraryName");
    }
}
