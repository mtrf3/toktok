package X;

import kotlin.jvm.internal.o;

/* renamed from: X.0zc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C25680zc {
    public int LIZ;
    public Object[] LIZIZ = new Object[4];
    public int[] LIZJ = new int[4];

    public final int LIZ(Object key, int i) {
        int i2;
        o.LJIIIZ(key, "key");
        int i3 = this.LIZ;
        if (i3 > 0) {
            int i4 = i3 - 1;
            int identityHashCode = System.identityHashCode(key);
            int i5 = 0;
            while (true) {
                if (i5 <= i4) {
                    i2 = (i5 + i4) >>> 1;
                    Object obj = this.LIZIZ[i2];
                    int identityHashCode2 = System.identityHashCode(obj);
                    if (identityHashCode2 < identityHashCode) {
                        i5 = i2 + 1;
                    } else if (identityHashCode2 > identityHashCode) {
                        i4 = i2 - 1;
                    } else if (obj != key) {
                        int i6 = i2 - 1;
                        while (-1 < i6) {
                            Object obj2 = this.LIZIZ[i6];
                            if (obj2 == key) {
                                break;
                            }
                            if (System.identityHashCode(obj2) != identityHashCode) {
                                break;
                            }
                            i6--;
                        }
                        i2++;
                        int i7 = this.LIZ;
                        while (true) {
                            if (i2 < i7) {
                                Object obj3 = this.LIZIZ[i2];
                                if (obj3 == key) {
                                    break;
                                }
                                if (System.identityHashCode(obj3) != identityHashCode) {
                                    break;
                                }
                                i2++;
                            } else {
                                i2 = this.LIZ;
                                break;
                            }
                        }
                        i6 = -(i2 + 1);
                        i2 = i6;
                    }
                } else {
                    i2 = -(i5 + 1);
                    break;
                }
            }
            if (i2 >= 0) {
                int[] iArr = this.LIZJ;
                int i8 = iArr[i2];
                iArr[i2] = i;
                return i8;
            }
        } else {
            i2 = -1;
        }
        int i9 = -(i2 + 1);
        int i10 = this.LIZ;
        Object[] objArr = this.LIZIZ;
        if (i10 == objArr.length) {
            Object[] objArr2 = new Object[objArr.length * 2];
            int[] iArr2 = new int[objArr.length * 2];
            int i11 = i9 + 1;
            C61898ORa.LJIIZILJ(i11, i9, i10, objArr, objArr2);
            C61898ORa.LJIILLIIL(i11, i9, this.LIZ, this.LIZJ, iArr2);
            C61898ORa.LJIJJ(this.LIZIZ, objArr2, 0, 0, i9, 6);
            C61898ORa.LJIJI(this.LIZJ, iArr2, i9, 6);
            this.LIZIZ = objArr2;
            this.LIZJ = iArr2;
        } else {
            int i12 = i9 + 1;
            C61898ORa.LJIIZILJ(i12, i9, i10, objArr, objArr);
            int[] iArr3 = this.LIZJ;
            C61898ORa.LJIILLIIL(i12, i9, this.LIZ, iArr3, iArr3);
        }
        this.LIZIZ[i9] = key;
        this.LIZJ[i9] = i;
        this.LIZ++;
        return -1;
    }
}
