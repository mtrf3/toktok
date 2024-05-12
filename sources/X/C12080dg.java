package X;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import kotlin.jvm.internal.o;

/* renamed from: X.0dg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12080dg<K, V> {
    public int[] LIZ;
    public Object[] LIZIZ;
    public int LIZJ;

    public C12080dg() {
        this(0);
    }

    public final int LIZJ() {
        int i = this.LIZJ;
        if (i == 0) {
            return -1;
        }
        int LIZIZ = C32810CuE.LIZIZ(i, 0, this.LIZ);
        if (LIZIZ < 0) {
            return LIZIZ;
        }
        if (this.LIZIZ[LIZIZ << 1] == null) {
            return LIZIZ;
        }
        int i2 = LIZIZ + 1;
        while (i2 < i && this.LIZ[i2] == 0) {
            if (this.LIZIZ[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = LIZIZ - 1; i3 >= 0 && this.LIZ[i3] == 0; i3--) {
            if (this.LIZIZ[i3 << 1] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    public final int hashCode() {
        int i;
        int[] iArr = this.LIZ;
        Object[] objArr = this.LIZIZ;
        int i2 = this.LIZJ;
        int i3 = 1;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            Object obj = objArr[i3];
            int i6 = iArr[i4];
            if (obj != null) {
                i = obj.hashCode();
            } else {
                i = 0;
            }
            i5 += i ^ i6;
            i4++;
            i3 += 2;
        }
        return i5;
    }

    public final String toString() {
        int i = this.LIZJ;
        if (i <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i * 28);
        sb.append('{');
        int i2 = this.LIZJ;
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            int i4 = i3 << 1;
            Object obj = this.LIZIZ[i4];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object obj2 = this.LIZIZ[i4 + 1];
            if (obj2 != this) {
                sb.append(obj2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "buffer.toString()");
        return sb2;
    }

    public C12080dg(int i) {
        this.LIZ = C32810CuE.LJLJI;
        this.LIZIZ = C32810CuE.LJLJJI;
        this.LIZJ = 0;
    }

    public final V LIZ(K k) {
        int LIZIZ;
        if (k == null) {
            LIZIZ = LIZJ();
        } else {
            LIZIZ = LIZIZ(k.hashCode(), k);
        }
        if (LIZIZ >= 0) {
            return (V) this.LIZIZ[(LIZIZ << 1) + 1];
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean equals(Object obj) {
        int LIZIZ;
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof C12080dg) {
                C12080dg c12080dg = (C12080dg) obj;
                int i = this.LIZJ;
                if (i != c12080dg.LIZJ) {
                    return false;
                }
                for (int i2 = 0; i2 < i; i2++) {
                    Object[] objArr = this.LIZIZ;
                    int i3 = i2 << 1;
                    Object obj2 = objArr[i3];
                    Object obj3 = objArr[i3 + 1];
                    Object LIZ = c12080dg.LIZ(obj2);
                    if (obj3 == null) {
                        if (LIZ == null) {
                            if (obj2 == null) {
                                LIZIZ = c12080dg.LIZJ();
                            } else {
                                LIZIZ = c12080dg.LIZIZ(obj2.hashCode(), obj2);
                            }
                            if (LIZIZ >= 0) {
                            }
                        }
                        return false;
                    }
                    if (!o.LJ(obj3, LIZ)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof java.util.Map) || this.LIZJ != ((java.util.Map) obj).size()) {
                return false;
            }
            int i4 = this.LIZJ;
            for (int i5 = 0; i5 < i4; i5++) {
                Object[] objArr2 = this.LIZIZ;
                int i6 = i5 << 1;
                Object obj4 = objArr2[i6];
                Object obj5 = objArr2[i6 + 1];
                Object obj6 = ((java.util.Map) obj).get(obj4);
                if (obj5 == null) {
                    if (obj6 == null && ((java.util.Map) obj).containsKey(obj4)) {
                    }
                    return false;
                }
                if (!o.LJ(obj5, obj6)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final int LIZIZ(int i, Object key) {
        o.LJIIIZ(key, "key");
        int i2 = this.LIZJ;
        if (i2 == 0) {
            return -1;
        }
        int LIZIZ = C32810CuE.LIZIZ(i2, i, this.LIZ);
        if (LIZIZ < 0) {
            return LIZIZ;
        }
        if (o.LJ(key, this.LIZIZ[LIZIZ << 1])) {
            return LIZIZ;
        }
        int i3 = LIZIZ + 1;
        while (i3 < i2 && this.LIZ[i3] == i) {
            if (o.LJ(key, this.LIZIZ[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = LIZIZ - 1; i4 >= 0 && this.LIZ[i4] == i; i4--) {
            if (o.LJ(key, this.LIZIZ[i4 << 1])) {
                return i4;
            }
        }
        return ~i3;
    }

    public final Object LIZLLL(C13400fo c13400fo, C13390fn c13390fn) {
        int hashCode;
        int LIZIZ;
        int i = this.LIZJ;
        if (c13400fo == null) {
            LIZIZ = LIZJ();
            hashCode = 0;
        } else {
            hashCode = c13400fo.hashCode();
            LIZIZ = LIZIZ(hashCode, c13400fo);
        }
        if (LIZIZ >= 0) {
            int i2 = (LIZIZ << 1) + 1;
            Object[] objArr = this.LIZIZ;
            Object obj = objArr[i2];
            objArr[i2] = c13390fn;
            return obj;
        }
        int i3 = ~LIZIZ;
        int[] iArr = this.LIZ;
        if (i >= iArr.length) {
            int i4 = 8;
            if (i >= 8) {
                i4 = (i >> 1) + i;
            } else if (i < 4) {
                i4 = 4;
            }
            int[] copyOf = Arrays.copyOf(iArr, i4);
            o.LJIIIIZZ(copyOf, "copyOf(this, newSize)");
            this.LIZ = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.LIZIZ, i4 << 1);
            o.LJIIIIZZ(copyOf2, "copyOf(this, newSize)");
            this.LIZIZ = copyOf2;
            if (i != this.LIZJ) {
                throw new ConcurrentModificationException();
            }
        }
        if (i3 < i) {
            int[] iArr2 = this.LIZ;
            int i5 = i3 + 1;
            C61898ORa.LJIILLIIL(i5, i3, i, iArr2, iArr2);
            Object[] objArr2 = this.LIZIZ;
            C61898ORa.LJIIZILJ(i5 << 1, i3 << 1, this.LIZJ << 1, objArr2, objArr2);
        }
        int i6 = this.LIZJ;
        if (i == i6) {
            int[] iArr3 = this.LIZ;
            if (i3 < iArr3.length) {
                iArr3[i3] = hashCode;
                Object[] objArr3 = this.LIZIZ;
                int i7 = i3 << 1;
                objArr3[i7] = c13400fo;
                objArr3[i7 + 1] = c13390fn;
                this.LIZJ = i6 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }
}
