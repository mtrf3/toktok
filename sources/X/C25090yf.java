package X;

import java.util.Locale;

/* renamed from: X.0yf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C25090yf {
    public final String LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final boolean LIZLLL;
    public final int LJ;
    public final String LJFF;
    public final int LJI;

    public final int hashCode() {
        int i;
        int hashCode = ((this.LIZ.hashCode() * 31) + this.LIZJ) * 31;
        if (this.LIZLLL) {
            i = 1231;
        } else {
            i = 1237;
        }
        return ((hashCode + i) * 31) + this.LJ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Column{name='");
        Q89.LIZIZ(LIZ, this.LIZ, '\'', ", type='");
        Q89.LIZIZ(LIZ, this.LIZIZ, '\'', ", affinity='");
        LIZ.append(this.LIZJ);
        LIZ.append('\'');
        LIZ.append(", notNull=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", primaryKeyPosition=");
        LIZ.append(this.LJ);
        LIZ.append(", defaultValue='");
        return C77800Ug8.LIZJ(LIZ, this.LJFF, '\'', '}', LIZ);
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25090yf)) {
            return false;
        }
        C25090yf c25090yf = (C25090yf) obj;
        if (this.LJ != c25090yf.LJ || !this.LIZ.equals(c25090yf.LIZ) || this.LIZLLL != c25090yf.LIZLLL) {
            return false;
        }
        if (this.LJI == 1 && c25090yf.LJI == 2 && (str3 = this.LJFF) != null && !LIZ(str3, c25090yf.LJFF)) {
            return false;
        }
        if (this.LJI == 2 && c25090yf.LJI == 1 && (str2 = c25090yf.LJFF) != null && !LIZ(str2, this.LJFF)) {
            return false;
        }
        int i = this.LJI;
        if ((i == 0 || i != c25090yf.LJI || ((str = this.LJFF) == null ? c25090yf.LJFF == null : LIZ(str, c25090yf.LJFF))) && this.LIZJ == c25090yf.LIZJ) {
            return true;
        }
        return false;
    }

    public static boolean LIZ(String str, String str2) {
        if (str2 == null) {
            return false;
        }
        if (str.equals(str2)) {
            return true;
        }
        if (str.length() != 0) {
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i < str.length()) {
                    char charAt = str.charAt(i);
                    if (i == 0) {
                        if (charAt != '(') {
                            break;
                        }
                        i2++;
                    } else {
                        if (charAt != '(') {
                            if (charAt == ')' && i2 - 1 == 0 && i != str.length() - 1) {
                                break;
                            }
                        }
                        i2++;
                    }
                    i++;
                } else if (i2 == 0) {
                    return str.substring(1, str.length() - 1).trim().equals(str2);
                }
            }
        }
        return false;
    }

    public C25090yf(String str, String str2, boolean z, int i) {
        this(i, 0, str, str2, null, z);
    }

    public C25090yf(int i, int i2, String str, String str2, String str3, boolean z) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZLLL = z;
        this.LJ = i;
        int i3 = 5;
        if (str2 != null) {
            String upperCase = str2.toUpperCase(Locale.US);
            if (upperCase.contains("INT")) {
                i3 = 3;
            } else if (upperCase.contains("CHAR") || upperCase.contains("CLOB") || upperCase.contains("TEXT")) {
                i3 = 2;
            } else if (!upperCase.contains("BLOB")) {
                i3 = (upperCase.contains("REAL") || upperCase.contains("FLOA") || upperCase.contains("DOUB")) ? 4 : 1;
            }
        }
        this.LIZJ = i3;
        this.LJFF = str3;
        this.LJI = i2;
    }
}
