package X;

/* loaded from: classes7.dex */
public final class EJ6 {
    public final String LIZ;
    public final String LIZIZ;

    public final int hashCode() {
        int i;
        String str = this.LIZ;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        String str2 = this.LIZIZ;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i3 + i2;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        String str = this.LIZ;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        LIZ.append(str);
        LIZ.append(": ");
        String str3 = this.LIZIZ;
        if (str3 != null) {
            str2 = str3;
        }
        LIZ.append(str2);
        return X1D.LIZIZ(LIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || EJ6.class != obj.getClass()) {
            return false;
        }
        EJ6 ej6 = (EJ6) obj;
        String str = this.LIZ;
        if (str == null ? ej6.LIZ != null : !str.equals(ej6.LIZ)) {
            return false;
        }
        String str2 = this.LIZIZ;
        String str3 = ej6.LIZIZ;
        if (str2 == null ? str3 == null : str2.equals(str3)) {
            return true;
        }
        return false;
    }

    public EJ6(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}