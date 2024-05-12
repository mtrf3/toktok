package X;

/* renamed from: X.QCs, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66622QCs {
    public char[] LIZ;
    public int LIZIZ;

    public final String toString() {
        return new String(this.LIZ, 0, this.LIZIZ);
    }

    public C66622QCs(int i) {
        if (i >= 0) {
            this.LIZ = new char[i];
            return;
        }
        throw new IllegalArgumentException("Buffer capacity may not be negative");
    }

    public final void LIZ(char c) {
        int i = this.LIZIZ + 1;
        if (i > this.LIZ.length) {
            LIZJ(i);
        }
        this.LIZ[this.LIZIZ] = c;
        this.LIZIZ = i;
    }

    public final void LIZIZ(String str) {
        if (str == null) {
            str = "null";
        }
        int length = str.length();
        int i = this.LIZIZ + length;
        if (i > this.LIZ.length) {
            LIZJ(i);
        }
        str.getChars(0, length, this.LIZ, this.LIZIZ);
        this.LIZIZ = i;
    }

    public final void LIZJ(int i) {
        char[] cArr = new char[Math.max(this.LIZ.length << 1, i)];
        System.arraycopy(this.LIZ, 0, cArr, 0, this.LIZIZ);
        this.LIZ = cArr;
    }

    public final String LIZLLL(int i, int i2) {
        if (i >= 0) {
            if (i2 <= this.LIZIZ) {
                if (i <= i2) {
                    while (i < i2 && C62814Ol0.LJJI(this.LIZ[i])) {
                        i++;
                    }
                    while (i2 > i && C62814Ol0.LJJI(this.LIZ[i2 - 1])) {
                        i2--;
                    }
                    return new String(this.LIZ, i, i2 - i);
                }
                throw new IndexOutOfBoundsException();
            }
            throw new IndexOutOfBoundsException();
        }
        throw new IndexOutOfBoundsException();
    }
}
