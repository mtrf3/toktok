package X;

import com.bytedance.vcloud.abrmodule.ABRConfig;

/* renamed from: X.FfG, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39526FfG {
    public static final C39526FfG LJ = new C39526FfG(0, 0, 1, "VZCBSIFJD");
    public static final C39526FfG LJFF = new C39526FfG(1, 1, 2, "VZCBSIFJD");
    public static final C39526FfG LJI = new C39526FfG(2, 2, 3, "VZCBSIFJD");
    public static final C39526FfG LJII = new C39526FfG(3, 3, 4, "VZCBSIFJD");
    public static final C39526FfG LJIIIIZZ = new C39526FfG(4, 4, 5, "VZCBSIFJD");
    public static final C39526FfG LJIIIZ = new C39526FfG(5, 5, 6, "VZCBSIFJD");
    public static final C39526FfG LJIIJ = new C39526FfG(6, 6, 7, "VZCBSIFJD");
    public static final C39526FfG LJIIJJI = new C39526FfG(7, 7, 8, "VZCBSIFJD");
    public static final C39526FfG LJIIL = new C39526FfG(8, 8, 9, "VZCBSIFJD");
    public final int LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;

    public final String LIZ() {
        switch (this.LIZ) {
            case 0:
                return "void";
            case 1:
                return "boolean";
            case 2:
                return "char";
            case 3:
                return "byte";
            case 4:
                return "short";
            case 5:
                return "int";
            case 6:
                return "float";
            case 7:
                return "long";
            case 8:
                return "double";
            case 9:
                int i = 1;
                int i2 = 1;
                while (this.LIZIZ.charAt(this.LIZJ + i2) == '[') {
                    i2++;
                }
                StringBuilder sb = new StringBuilder(LIZIZ(this.LIZJ + i2, this.LIZLLL, this.LIZIZ).LIZ());
                while (this.LIZIZ.charAt(this.LIZJ + i) == '[') {
                    i++;
                }
                while (i > 0) {
                    sb.append("[]");
                    i--;
                }
                return sb.toString();
            case 10:
            case 12:
                return this.LIZIZ.substring(this.LIZJ, this.LIZLLL).replace('/', '.');
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
            default:
                throw new AssertionError();
        }
    }

    public final int hashCode() {
        int i;
        int i2 = this.LIZ;
        if (i2 == 12) {
            i = 10;
        } else {
            i = i2;
        }
        int i3 = i * 13;
        if (i2 >= 9) {
            int i4 = this.LIZLLL;
            for (int i5 = this.LIZJ; i5 < i4; i5++) {
                i3 = (this.LIZIZ.charAt(i5) + i3) * 17;
            }
        }
        return i3;
    }

    public final String toString() {
        int i = this.LIZ;
        if (i == 10) {
            return this.LIZIZ.substring(this.LIZJ - 1, this.LIZLLL + 1);
        }
        if (i == 12) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append('L');
            LIZ.append(this.LIZIZ.substring(this.LIZJ, this.LIZLLL));
            LIZ.append(';');
            return X1D.LIZIZ(LIZ);
        }
        return this.LIZIZ.substring(this.LIZJ, this.LIZLLL);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39526FfG)) {
            return false;
        }
        C39526FfG c39526FfG = (C39526FfG) obj;
        int i = this.LIZ;
        int i2 = 10;
        if (i == 12) {
            i = 10;
        }
        int i3 = c39526FfG.LIZ;
        if (i3 != 12) {
            i2 = i3;
        }
        if (i != i2) {
            return false;
        }
        int i4 = this.LIZJ;
        int i5 = this.LIZLLL;
        int i6 = c39526FfG.LIZJ;
        if (i5 - i4 != c39526FfG.LIZLLL - i6) {
            return false;
        }
        while (i4 < i5) {
            if (this.LIZIZ.charAt(i4) != c39526FfG.LIZIZ.charAt(i6)) {
                return false;
            }
            i4++;
            i6++;
        }
        return true;
    }

    public static C39526FfG LIZIZ(int i, int i2, String str) {
        char charAt = str.charAt(i);
        if (charAt != '(') {
            if (charAt != 'F') {
                if (charAt != 'L') {
                    if (charAt != 'S') {
                        if (charAt != 'V') {
                            if (charAt != 'I') {
                                if (charAt != 'J') {
                                    if (charAt != 'Z') {
                                        if (charAt != '[') {
                                            switch (charAt) {
                                                case 'B':
                                                    return LJII;
                                                case 'C':
                                                    return LJI;
                                                case 'D':
                                                    return LJIIL;
                                                default:
                                                    throw new IllegalArgumentException();
                                            }
                                        }
                                        return new C39526FfG(9, i, i2, str);
                                    }
                                    return LJFF;
                                }
                                return LJIIJJI;
                            }
                            return LJIIIZ;
                        }
                        return LJ;
                    }
                    return LJIIIIZZ;
                }
                return new C39526FfG(10, i + 1, i2 - 1, str);
            }
            return LJIIJ;
        }
        return new C39526FfG(11, i, i2, str);
    }

    public C39526FfG(int i, int i2, int i3, String str) {
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = i2;
        this.LIZLLL = i3;
    }
}
