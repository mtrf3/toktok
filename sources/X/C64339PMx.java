package X;

/* renamed from: X.PMx, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C64339PMx {
    public EnumC64341PMz LIZ;
    public String LIZIZ;

    public final int hashCode() {
        int hashCode;
        EnumC64341PMz enumC64341PMz = this.LIZ;
        int i = 0;
        if (enumC64341PMz == null) {
            hashCode = 0;
        } else {
            hashCode = enumC64341PMz.hashCode();
        }
        String str = this.LIZIZ;
        if (str != null) {
            i = str.hashCode();
        }
        return (i * 31) + hashCode;
    }

    public final String toString() {
        String replace = this.LIZIZ.replace('\n', (char) 182);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Diff(");
        LIZ.append(this.LIZ);
        LIZ.append(",\"");
        LIZ.append(replace);
        LIZ.append("\")");
        return X1D.LIZIZ(LIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C64339PMx.class != obj.getClass()) {
            return false;
        }
        C64339PMx c64339PMx = (C64339PMx) obj;
        if (this.LIZ != c64339PMx.LIZ) {
            return false;
        }
        String str = this.LIZIZ;
        if (str == null) {
            if (c64339PMx.LIZIZ != null) {
                return false;
            }
        } else if (!str.equals(c64339PMx.LIZIZ)) {
            return false;
        }
        return true;
    }

    public C64339PMx(EnumC64341PMz enumC64341PMz, String str) {
        this.LIZ = enumC64341PMz;
        this.LIZIZ = str;
    }
}
