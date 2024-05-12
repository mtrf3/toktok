package X;

/* renamed from: X.Spz, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73315Spz<T> {
    public int LIZ;
    public int LIZIZ;
    public int LIZJ;
    public T[] LIZLLL;

    public C73315Spz(int i) {
        int numberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(i - 1));
        this.LIZ = numberOfLeadingZeros - 1;
        this.LIZJ = (int) (0.75f * numberOfLeadingZeros);
        this.LIZLLL = (T[]) new Object[numberOfLeadingZeros];
    }

    public final void LIZ(Object obj) {
        T t;
        Object obj2;
        Object[] objArr = this.LIZLLL;
        int i = this.LIZ;
        int hashCode = obj.hashCode() * (-1640531527);
        int i2 = (hashCode ^ (hashCode >>> 16)) & i;
        Object obj3 = objArr[i2];
        if (obj3 != null) {
            if (obj3.equals(obj)) {
                return;
            }
            do {
                i2 = (i2 + 1) & i;
                obj2 = objArr[i2];
                if (obj2 == null) {
                }
            } while (!obj2.equals(obj));
            return;
        }
        objArr[i2] = obj;
        int i3 = this.LIZIZ + 1;
        this.LIZIZ = i3;
        if (i3 >= this.LIZJ) {
            T[] tArr = this.LIZLLL;
            int length = tArr.length;
            int i4 = length << 1;
            int i5 = i4 - 1;
            T[] tArr2 = (T[]) new Object[i4];
            while (true) {
                int i6 = i3 - 1;
                if (i3 == 0) {
                    this.LIZ = i5;
                    this.LIZJ = (int) (i4 * 0.75f);
                    this.LIZLLL = tArr2;
                    return;
                }
                do {
                    length--;
                    t = tArr[length];
                } while (t == null);
                int hashCode2 = t.hashCode() * (-1640531527);
                int i7 = (hashCode2 ^ (hashCode2 >>> 16)) & i5;
                if (tArr2[i7] == null) {
                    tArr2[i7] = tArr[length];
                    i3 = i6;
                }
                do {
                    i7 = (i7 + 1) & i5;
                } while (tArr2[i7] != null);
                tArr2[i7] = tArr[length];
                i3 = i6;
            }
        }
    }

    public final boolean LIZIZ(T t) {
        T t2;
        T[] tArr = this.LIZLLL;
        int i = this.LIZ;
        int hashCode = t.hashCode() * (-1640531527);
        int i2 = (hashCode ^ (hashCode >>> 16)) & i;
        T t3 = tArr[i2];
        if (t3 == null) {
            return false;
        }
        if (t3.equals(t)) {
            LIZJ(i2, i, tArr);
            return true;
        }
        do {
            i2 = (i2 + 1) & i;
            t2 = tArr[i2];
            if (t2 == null) {
                return false;
            }
        } while (!t2.equals(t));
        LIZJ(i2, i, tArr);
        return true;
    }

    public final void LIZJ(int i, int i2, Object[] objArr) {
        int i3;
        Object obj;
        this.LIZIZ--;
        while (true) {
            int i4 = i + 1;
            while (true) {
                i3 = i4 & i2;
                obj = objArr[i3];
                if (obj == null) {
                    objArr[i] = null;
                    return;
                }
                int hashCode = obj.hashCode() * (-1640531527);
                int i5 = (hashCode ^ (hashCode >>> 16)) & i2;
                if (i <= i3) {
                    if (i < i5 && i5 <= i3) {
                        i4 = i3 + 1;
                    }
                } else {
                    if (i >= i5 && i5 > i3) {
                        break;
                    }
                    i4 = i3 + 1;
                }
            }
            objArr[i] = obj;
            i = i3;
        }
    }
}
