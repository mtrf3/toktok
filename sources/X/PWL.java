package X;

/* loaded from: classes12.dex */
public final class PWL {
    public static final C64537PUn LIZLLL = C64537PUn.encodeUtf8(":");
    public static final C64537PUn LJ = C64537PUn.encodeUtf8(":status");
    public static final C64537PUn LJFF = C64537PUn.encodeUtf8(":method");
    public static final C64537PUn LJI = C64537PUn.encodeUtf8(":path");
    public static final C64537PUn LJII = C64537PUn.encodeUtf8(":scheme");
    public static final C64537PUn LJIIIIZZ = C64537PUn.encodeUtf8(":authority");
    public final C64537PUn LIZ;
    public final C64537PUn LIZIZ;
    public final int LIZJ;

    public final String toString() {
        return PVA.LJIIJJI("%s: %s", this.LIZ.utf8(), this.LIZIZ.utf8());
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode() + ((this.LIZ.hashCode() + 527) * 31);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PWL)) {
            return false;
        }
        PWL pwl = (PWL) obj;
        if (!this.LIZ.equals(pwl.LIZ) || !this.LIZIZ.equals(pwl.LIZIZ)) {
            return false;
        }
        return true;
    }

    public PWL(C64537PUn c64537PUn, C64537PUn c64537PUn2) {
        this.LIZ = c64537PUn;
        this.LIZIZ = c64537PUn2;
        this.LIZJ = c64537PUn2.size() + c64537PUn.size() + 32;
    }

    public PWL(String str, String str2) {
        this(C64537PUn.encodeUtf8(str), C64537PUn.encodeUtf8(str2));
    }

    public PWL(String str, C64537PUn c64537PUn) {
        this(c64537PUn, C64537PUn.encodeUtf8(str));
    }
}
