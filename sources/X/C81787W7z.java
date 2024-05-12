package X;

/* renamed from: X.W7z, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81787W7z {
    public final int LIZ;
    public final int LIZIZ;

    public final String toString() {
        String num;
        Object[] objArr = new Object[2];
        int i = this.LIZ;
        String str = "";
        if (i == Integer.MAX_VALUE) {
            num = "";
        } else {
            num = Integer.toString(i);
        }
        objArr[0] = num;
        int i2 = this.LIZIZ;
        if (i2 != Integer.MAX_VALUE) {
            str = Integer.toString(i2);
        }
        objArr[1] = str;
        return C16880lQ.LLLZI(null, "%s-%s", objArr);
    }

    public final int hashCode() {
        return C0EH.LIZ(this.LIZ, 31, 31, this.LIZIZ);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C81787W7z)) {
            return false;
        }
        C81787W7z c81787W7z = (C81787W7z) obj;
        if (this.LIZ == c81787W7z.LIZ && this.LIZIZ == c81787W7z.LIZIZ) {
            return true;
        }
        return false;
    }

    public C81787W7z(int i, int i2) {
        this.LIZ = i;
        this.LIZIZ = i2;
    }
}
