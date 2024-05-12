package X;

/* renamed from: X.Uzs, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79024Uzs {
    public final C79022Uzq LIZ;
    public final int[] LIZIZ;

    public final boolean LIZIZ() {
        if (this.LIZIZ[0] != 0) {
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.LIZIZ.length - 1) * 8);
        int length = this.LIZIZ.length;
        while (true) {
            length--;
            if (length < 0) {
                break;
            }
            int i = this.LIZIZ[(r1.length - 1) - length];
            if (i != 0) {
                if (i < 0) {
                    sb.append(" - ");
                    i = -i;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (length == 0 || i != 1) {
                    C79022Uzq c79022Uzq = this.LIZ;
                    if (i != 0) {
                        int i2 = c79022Uzq.LIZIZ[i];
                        if (i2 == 0) {
                            sb.append('1');
                        } else if (i2 == 1) {
                            sb.append('a');
                        } else {
                            sb.append("a^");
                            sb.append(i2);
                        }
                        if (length == 0) {
                            break;
                        }
                    } else {
                        c79022Uzq.getClass();
                        throw new IllegalArgumentException();
                    }
                }
                if (length == 1) {
                    sb.append('x');
                } else {
                    sb.append("x^");
                    sb.append(length);
                }
            }
        }
        return sb.toString();
    }

    public final C79024Uzs LIZ(C79024Uzs c79024Uzs) {
        if (this.LIZ.equals(c79024Uzs.LIZ)) {
            if (LIZIZ()) {
                return c79024Uzs;
            }
            if (c79024Uzs.LIZIZ()) {
                return this;
            }
            int[] iArr = this.LIZIZ;
            int[] iArr2 = c79024Uzs.LIZIZ;
            if (iArr.length <= iArr2.length) {
                iArr = iArr2;
                iArr2 = iArr;
            }
            int[] iArr3 = new int[iArr.length];
            int length = iArr.length - iArr2.length;
            System.arraycopy(iArr, 0, iArr3, 0, length);
            for (int i = length; i < iArr.length; i++) {
                iArr3[i] = iArr2[i - length] ^ iArr[i];
            }
            return new C79024Uzs(this.LIZ, iArr3);
        }
        throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
    }

    public C79024Uzs(C79022Uzq c79022Uzq, int[] iArr) {
        if (iArr.length != 0) {
            this.LIZ = c79022Uzq;
            int length = iArr.length;
            if (length > 1 && iArr[0] == 0) {
                int i = 1;
                while (iArr[i] == 0 && (i = i + 1) < length) {
                }
                if (i == length) {
                    this.LIZIZ = new int[]{0};
                    return;
                }
                int i2 = length - i;
                int[] iArr2 = new int[i2];
                this.LIZIZ = iArr2;
                System.arraycopy(iArr, i, iArr2, 0, i2);
                return;
            }
            this.LIZIZ = iArr;
            return;
        }
        throw new IllegalArgumentException();
    }

    public final C79024Uzs LIZJ(int i, int i2) {
        if (i >= 0) {
            if (i2 == 0) {
                return this.LIZ.LIZJ;
            }
            int length = this.LIZIZ.length;
            int[] iArr = new int[i + length];
            for (int i3 = 0; i3 < length; i3++) {
                iArr[i3] = this.LIZ.LIZ(this.LIZIZ[i3], i2);
            }
            return new C79024Uzs(this.LIZ, iArr);
        }
        throw new IllegalArgumentException();
    }
}
