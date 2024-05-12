package X;

/* renamed from: X.VaH, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79985VaH {
    public String LIZ;
    public long LIZIZ;
    public C47164IfA LIZLLL;
    public String LJ;
    public String LJFF;
    public String LJI;
    public String LJII;
    public C79994VaQ LJIIIIZZ = C79994VaQ.LIZ();
    public long LIZJ = -1;

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        String str = this.LIZ;
        int i4 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i5 = i * 31;
        String str2 = this.LJ;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 31 * 31 * 31 * 31 * 31;
        String str3 = this.LJI;
        if (str3 != null) {
            i3 = str3.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (i6 + i3) * 31;
        String str4 = this.LJFF;
        if (str4 != null) {
            i4 = str4.hashCode();
        }
        return ((i7 + i4) * 31) + ((int) (this.LIZIZ * 31));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C79985VaH.class != obj.getClass()) {
            return false;
        }
        C79985VaH c79985VaH = (C79985VaH) obj;
        if (this.LIZIZ == c79985VaH.LIZIZ && LIZ(this.LIZ, c79985VaH.LIZ) && LIZ(this.LIZLLL, c79985VaH.LIZLLL) && LIZ(this.LJ, c79985VaH.LJ) && LIZ(null, null) && LIZ(null, null) && LIZ(null, null) && LIZ(null, null) && LIZ(this.LJI, c79985VaH.LJI) && LIZ(this.LJFF, c79985VaH.LJFF)) {
            return true;
        }
        return false;
    }

    public static boolean LIZ(Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 == null) {
                return true;
            }
            return false;
        }
        return obj.equals(obj2);
    }
}
