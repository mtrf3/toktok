package X;

import java.util.ConcurrentModificationException;

/* renamed from: X.0MA, reason: invalid class name */
/* loaded from: classes.dex */
public class C0MA<K, V> {
    public static Object[] LJLJJI;
    public static int LJLJJL;
    public static Object[] LJLJJLL;
    public static int LJLJL;
    public int[] LJLIL;
    public Object[] LJLILLLLZI;
    public int LJLJI;

    public final int LJI() {
        int i = this.LJLJI;
        if (i == 0) {
            return -1;
        }
        try {
            int LIZLLL = C60903NvH.LIZLLL(i, 0, this.LJLIL);
            if (LIZLLL < 0) {
                return LIZLLL;
            }
            if (this.LJLILLLLZI[LIZLLL << 1] == null) {
                return LIZLLL;
            }
            int i2 = LIZLLL + 1;
            while (i2 < i && this.LJLIL[i2] == 0) {
                if (this.LJLILLLLZI[i2 << 1] == null) {
                    return i2;
                }
                i2++;
            }
            for (int i3 = LIZLLL - 1; i3 >= 0 && this.LJLIL[i3] == 0; i3--) {
                if (this.LJLILLLLZI[i3 << 1] == null) {
                    return i3;
                }
            }
            return ~i2;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final void clear() {
        int i = this.LJLJI;
        if (i > 0) {
            int[] iArr = this.LJLIL;
            Object[] objArr = this.LJLILLLLZI;
            this.LJLIL = C60903NvH.LIZ;
            this.LJLILLLLZI = C60903NvH.LIZJ;
            this.LJLJI = 0;
            LIZJ(iArr, objArr, i);
        }
        if (this.LJLJI <= 0) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    public final int hashCode() {
        int hashCode;
        int[] iArr = this.LJLIL;
        Object[] objArr = this.LJLILLLLZI;
        int i = this.LJLJI;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            int i5 = iArr[i3];
            if (obj == null) {
                hashCode = 0;
            } else {
                hashCode = obj.hashCode();
            }
            i4 += hashCode ^ i5;
            i3++;
            i2 += 2;
        }
        return i4;
    }

    public final boolean isEmpty() {
        if (this.LJLJI <= 0) {
            return true;
        }
        return false;
    }

    public C0MA() {
        this.LJLIL = C60903NvH.LIZ;
        this.LJLILLLLZI = C60903NvH.LIZJ;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.LJLJI * 28);
        sb.append('{');
        for (int i = 0; i < this.LJLJI; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            K LJIIIIZZ = LJIIIIZZ(i);
            if (LJIIIIZZ != this) {
                sb.append(LJIIIIZZ);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V LJIIJJI = LJIIJJI(i);
            if (LJIIJJI != this) {
                sb.append(LJIIJJI);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final int size() {
        return this.LJLJI;
    }

    public C0MA(int i) {
        if (i == 0) {
            this.LJLIL = C60903NvH.LIZ;
            this.LJLILLLLZI = C60903NvH.LIZJ;
        } else {
            LIZ(i);
        }
        this.LJLJI = 0;
    }

    private void LIZ(int i) {
        if (i == 8) {
            synchronized (C0MA.class) {
                Object[] objArr = LJLJJLL;
                if (objArr != null) {
                    this.LJLILLLLZI = objArr;
                    LJLJJLL = (Object[]) objArr[0];
                    this.LJLIL = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    LJLJL--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C0MA.class) {
                Object[] objArr2 = LJLJJI;
                if (objArr2 != null) {
                    this.LJLILLLLZI = objArr2;
                    LJLJJI = (Object[]) objArr2[0];
                    this.LJLIL = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    LJLJJL--;
                    return;
                }
            }
        }
        this.LJLIL = new int[i];
        this.LJLILLLLZI = new Object[i << 1];
    }

    public final void LIZIZ(int i) {
        int i2 = this.LJLJI;
        int[] iArr = this.LJLIL;
        if (iArr.length < i) {
            Object[] objArr = this.LJLILLLLZI;
            LIZ(i);
            if (this.LJLJI > 0) {
                System.arraycopy(iArr, 0, this.LJLIL, 0, i2);
                System.arraycopy(objArr, 0, this.LJLILLLLZI, 0, i2 << 1);
            }
            LIZJ(iArr, objArr, i2);
        }
        if (this.LJLJI == i2) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    public final int LJ(Object obj) {
        if (obj == null) {
            return LJI();
        }
        return LIZLLL(obj.hashCode(), obj);
    }

    public final int LJII(Object obj) {
        int i = this.LJLJI * 2;
        Object[] objArr = this.LJLILLLLZI;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public final K LJIIIIZZ(int i) {
        return (K) this.LJLILLLLZI[i << 1];
    }

    public final V LJIIIZ(int i) {
        Object[] objArr = this.LJLILLLLZI;
        int i2 = i << 1;
        V v = (V) objArr[i2 + 1];
        int i3 = this.LJLJI;
        int i4 = 0;
        if (i3 <= 1) {
            LIZJ(this.LJLIL, objArr, i3);
            this.LJLIL = C60903NvH.LIZ;
            this.LJLILLLLZI = C60903NvH.LIZJ;
        } else {
            int i5 = i3 - 1;
            int[] iArr = this.LJLIL;
            int i6 = 8;
            if (iArr.length > 8 && i3 < iArr.length / 3) {
                if (i3 > 8) {
                    i6 = i3 + (i3 >> 1);
                }
                LIZ(i6);
                if (i3 == this.LJLJI) {
                    if (i > 0) {
                        System.arraycopy(iArr, 0, this.LJLIL, 0, i);
                        System.arraycopy(objArr, 0, this.LJLILLLLZI, 0, i2);
                    }
                    if (i < i5) {
                        int i7 = i + 1;
                        int i8 = i5 - i;
                        System.arraycopy(iArr, i7, this.LJLIL, i, i8);
                        System.arraycopy(objArr, i7 << 1, this.LJLILLLLZI, i2, i8 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            } else {
                if (i < i5) {
                    int i9 = i + 1;
                    int i10 = i5 - i;
                    System.arraycopy(iArr, i9, iArr, i, i10);
                    Object[] objArr2 = this.LJLILLLLZI;
                    System.arraycopy(objArr2, i9 << 1, objArr2, i2, i10 << 1);
                }
                Object[] objArr3 = this.LJLILLLLZI;
                int i11 = i5 << 1;
                objArr3[i11] = null;
                objArr3[i11 + 1] = null;
            }
            i4 = i5;
        }
        if (i3 == this.LJLJI) {
            this.LJLJI = i4;
            return v;
        }
        throw new ConcurrentModificationException();
    }

    public final V LJIIJJI(int i) {
        return (V) this.LJLILLLLZI[(i << 1) + 1];
    }

    public final boolean containsKey(Object obj) {
        if (LJ(obj) >= 0) {
            return true;
        }
        return false;
    }

    public final boolean containsValue(Object obj) {
        if (LJII(obj) >= 0) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0MA) {
            C0MA c0ma = (C0MA) obj;
            if (this.LJLJI != c0ma.LJLJI) {
                return false;
            }
            for (int i = 0; i < this.LJLJI; i++) {
                try {
                    K LJIIIIZZ = LJIIIIZZ(i);
                    V LJIIJJI = LJIIJJI(i);
                    Object orDefault = c0ma.getOrDefault(LJIIIIZZ, null);
                    if (LJIIJJI == null) {
                        if (orDefault == null && c0ma.containsKey(LJIIIIZZ)) {
                        }
                        return false;
                    }
                    if (!LJIIJJI.equals(orDefault)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof java.util.Map) {
            java.util.Map map = (java.util.Map) obj;
            if (this.LJLJI != map.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.LJLJI; i2++) {
                try {
                    K LJIIIIZZ2 = LJIIIIZZ(i2);
                    V LJIIJJI2 = LJIIJJI(i2);
                    Object obj2 = map.get(LJIIIIZZ2);
                    if (LJIIJJI2 == null) {
                        if (obj2 == null && map.containsKey(LJIIIIZZ2)) {
                        }
                        return false;
                    }
                    if (!LJIIJJI2.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public final V get(Object obj) {
        return getOrDefault(obj, null);
    }

    public final V remove(Object obj) {
        int LJ = LJ(obj);
        if (LJ >= 0) {
            return LJIIIZ(LJ);
        }
        return null;
    }

    public final int LIZLLL(int i, Object obj) {
        int i2 = this.LJLJI;
        if (i2 == 0) {
            return -1;
        }
        try {
            int LIZLLL = C60903NvH.LIZLLL(i2, i, this.LJLIL);
            if (LIZLLL < 0) {
                return LIZLLL;
            }
            if (obj.equals(this.LJLILLLLZI[LIZLLL << 1])) {
                return LIZLLL;
            }
            int i3 = LIZLLL + 1;
            while (i3 < i2 && this.LJLIL[i3] == i) {
                if (obj.equals(this.LJLILLLLZI[i3 << 1])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = LIZLLL - 1; i4 >= 0 && this.LJLIL[i4] == i; i4--) {
                if (obj.equals(this.LJLILLLLZI[i4 << 1])) {
                    return i4;
                }
            }
            return ~i3;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final V getOrDefault(Object obj, V v) {
        int LJ = LJ(obj);
        if (LJ >= 0) {
            return (V) this.LJLILLLLZI[(LJ << 1) + 1];
        }
        return v;
    }

    public final V put(K k, V v) {
        int hashCode;
        int LIZLLL;
        int i = this.LJLJI;
        if (k == null) {
            LIZLLL = LJI();
            hashCode = 0;
        } else {
            hashCode = k.hashCode();
            LIZLLL = LIZLLL(hashCode, k);
        }
        if (LIZLLL >= 0) {
            int i2 = (LIZLLL << 1) + 1;
            Object[] objArr = this.LJLILLLLZI;
            V v2 = (V) objArr[i2];
            objArr[i2] = v;
            return v2;
        }
        int i3 = ~LIZLLL;
        int[] iArr = this.LJLIL;
        if (i >= iArr.length) {
            int i4 = 8;
            if (i >= 8) {
                i4 = (i >> 1) + i;
            } else if (i < 4) {
                i4 = 4;
            }
            Object[] objArr2 = this.LJLILLLLZI;
            LIZ(i4);
            if (i == this.LJLJI) {
                int[] iArr2 = this.LJLIL;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr2, 0, this.LJLILLLLZI, 0, objArr2.length);
                }
                LIZJ(iArr, objArr2, i);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i3 < i) {
            int[] iArr3 = this.LJLIL;
            int i5 = i3 + 1;
            System.arraycopy(iArr3, i3, iArr3, i5, i - i3);
            Object[] objArr3 = this.LJLILLLLZI;
            System.arraycopy(objArr3, i3 << 1, objArr3, i5 << 1, (this.LJLJI - i3) << 1);
        }
        int i6 = this.LJLJI;
        if (i == i6) {
            int[] iArr4 = this.LJLIL;
            if (i3 < iArr4.length) {
                iArr4[i3] = hashCode;
                Object[] objArr4 = this.LJLILLLLZI;
                int i7 = i3 << 1;
                objArr4[i7] = k;
                objArr4[i7 + 1] = v;
                this.LJLJI = i6 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final V putIfAbsent(K k, V v) {
        V orDefault = getOrDefault(k, null);
        if (orDefault == null) {
            return put(k, v);
        }
        return orDefault;
    }

    public final boolean remove(Object obj, Object obj2) {
        int LJ = LJ(obj);
        if (LJ >= 0) {
            V LJIIJJI = LJIIJJI(LJ);
            if (obj2 == LJIIJJI || (obj2 != null && obj2.equals(LJIIJJI))) {
                LJIIIZ(LJ);
                return true;
            }
            return false;
        }
        return false;
    }

    public final V replace(K k, V v) {
        int LJ = LJ(k);
        if (LJ >= 0) {
            int i = (LJ << 1) + 1;
            Object[] objArr = this.LJLILLLLZI;
            V v2 = (V) objArr[i];
            objArr[i] = v;
            return v2;
        }
        return null;
    }

    public static void LIZJ(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C0MA.class) {
                if (LJLJL < 10) {
                    objArr[0] = LJLJJLL;
                    objArr[1] = iArr;
                    for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    LJLJJLL = objArr;
                    LJLJL++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (C0MA.class) {
                if (LJLJJL < 10) {
                    objArr[0] = LJLJJI;
                    objArr[1] = iArr;
                    for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    LJLJJI = objArr;
                    LJLJJL++;
                }
            }
        }
    }

    public final boolean replace(K k, V v, V v2) {
        int LJ = LJ(k);
        if (LJ >= 0) {
            V LJIIJJI = LJIIJJI(LJ);
            if (LJIIJJI == v || (v != null && v.equals(LJIIJJI))) {
                this.LJLILLLLZI[(LJ << 1) + 1] = v2;
                return true;
            }
            return false;
        }
        return false;
    }
}
