package X;

import java.util.Arrays;
import kotlin.jvm.internal.o;

/* renamed from: X.0ze, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C25700ze<T> {
    public int[] LIZ;
    public Object[] LIZIZ;
    public C36441bs<T>[] LIZJ;
    public int LIZLLL;

    public final void LIZIZ() {
        int length = this.LIZJ.length;
        for (int i = 0; i < length; i++) {
            C36441bs<T> c36441bs = this.LIZJ[i];
            if (c36441bs != null) {
                c36441bs.clear();
            }
            this.LIZ[i] = i;
            this.LIZIZ[i] = null;
        }
        this.LIZLLL = 0;
    }

    public C25700ze() {
        int[] iArr = new int[50];
        int i = 0;
        do {
            iArr[i] = i;
            i++;
        } while (i < 50);
        this.LIZ = iArr;
        this.LIZIZ = new Object[50];
        this.LIZJ = new C36441bs[50];
    }

    public final boolean LIZJ(Object element) {
        o.LJIIIZ(element, "element");
        if (LIZLLL(element) >= 0) {
            return true;
        }
        return false;
    }

    public final int LIZLLL(Object obj) {
        int identityHashCode = System.identityHashCode(obj);
        int i = this.LIZLLL - 1;
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            Object obj2 = this.LIZIZ[this.LIZ[i3]];
            o.LJI(obj2);
            int identityHashCode2 = System.identityHashCode(obj2);
            if (identityHashCode2 < identityHashCode) {
                i2 = i3 + 1;
            } else {
                if (identityHashCode2 <= identityHashCode) {
                    if (obj == obj2) {
                        return i3;
                    }
                    for (int i4 = i3 - 1; -1 < i4; i4--) {
                        Object obj3 = this.LIZIZ[this.LIZ[i4]];
                        o.LJI(obj3);
                        if (obj3 == obj) {
                            return i4;
                        }
                        if (System.identityHashCode(obj3) != identityHashCode) {
                            break;
                        }
                    }
                    int i5 = i3 + 1;
                    int i6 = this.LIZLLL;
                    while (true) {
                        if (i5 < i6) {
                            Object obj4 = this.LIZIZ[this.LIZ[i5]];
                            o.LJI(obj4);
                            if (obj4 == obj) {
                                return i5;
                            }
                            if (System.identityHashCode(obj4) != identityHashCode) {
                                break;
                            }
                            i5++;
                        } else {
                            i5 = this.LIZLLL;
                            break;
                        }
                    }
                    return -(i5 + 1);
                }
                i = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public final void LJFF(T scope) {
        o.LJIIIZ(scope, "scope");
        int i = this.LIZLLL;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = this.LIZ[i3];
            C36441bs<T> c36441bs = this.LIZJ[i4];
            o.LJI(c36441bs);
            c36441bs.remove(scope);
            if (c36441bs.LJLIL > 0) {
                if (i2 != i3) {
                    int[] iArr = this.LIZ;
                    int i5 = iArr[i2];
                    iArr[i2] = i4;
                    iArr[i3] = i5;
                }
                i2++;
            }
        }
        int i6 = this.LIZLLL;
        for (int i7 = i2; i7 < i6; i7++) {
            this.LIZIZ[this.LIZ[i7]] = null;
        }
        this.LIZLLL = i2;
    }

    public final C36441bs<T> LJI(int i) {
        C36441bs<T> c36441bs = this.LIZJ[this.LIZ[i]];
        o.LJI(c36441bs);
        return c36441bs;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ(Object value, Object scope) {
        int i;
        C36441bs<T> c36441bs;
        o.LJIIIZ(value, "value");
        o.LJIIIZ(scope, "scope");
        if (this.LIZLLL > 0) {
            i = LIZLLL(value);
            if (i >= 0) {
                c36441bs = LJI(i);
                c36441bs.add(scope);
            }
        } else {
            i = -1;
        }
        int i2 = -(i + 1);
        int i3 = this.LIZLLL;
        int[] iArr = this.LIZ;
        if (i3 < iArr.length) {
            int i4 = iArr[i3];
            this.LIZIZ[i4] = value;
            c36441bs = this.LIZJ[i4];
            if (c36441bs == null) {
                c36441bs = new C36441bs<>();
                this.LIZJ[i4] = c36441bs;
            }
            int i5 = this.LIZLLL;
            if (i2 < i5) {
                int[] iArr2 = this.LIZ;
                C61898ORa.LJIILLIIL(i2 + 1, i2, i5, iArr2, iArr2);
            }
            this.LIZ[i2] = i4;
            this.LIZLLL++;
        } else {
            int length = iArr.length * 2;
            Object[] copyOf = Arrays.copyOf(this.LIZJ, length);
            o.LJIIIIZZ(copyOf, "copyOf(this, newSize)");
            this.LIZJ = (C36441bs[]) copyOf;
            c36441bs = new C36441bs<>();
            this.LIZJ[i3] = c36441bs;
            Object[] copyOf2 = Arrays.copyOf(this.LIZIZ, length);
            o.LJIIIIZZ(copyOf2, "copyOf(this, newSize)");
            this.LIZIZ = copyOf2;
            copyOf2[i3] = value;
            int[] iArr3 = new int[length];
            int i6 = this.LIZLLL;
            while (true) {
                i6++;
                if (i6 >= length) {
                    break;
                } else {
                    iArr3[i6] = i6;
                }
            }
            int i7 = this.LIZLLL;
            if (i2 < i7) {
                C61898ORa.LJIILLIIL(i2 + 1, i2, i7, this.LIZ, iArr3);
            }
            iArr3[i2] = i3;
            if (i2 > 0) {
                C61898ORa.LJIJI(this.LIZ, iArr3, i2, 6);
            }
            this.LIZ = iArr3;
            this.LIZLLL++;
        }
        c36441bs.add(scope);
    }

    public final boolean LJ(Object value, T t) {
        int i;
        C36441bs<T> c36441bs;
        o.LJIIIZ(value, "value");
        int LIZLLL = LIZLLL(value);
        if (LIZLLL < 0 || (c36441bs = this.LIZJ[(i = this.LIZ[LIZLLL])]) == null) {
            return false;
        }
        boolean remove = c36441bs.remove(t);
        if (c36441bs.LJLIL == 0) {
            int i2 = LIZLLL + 1;
            int i3 = this.LIZLLL;
            if (i2 < i3) {
                int[] iArr = this.LIZ;
                C61898ORa.LJIILLIIL(LIZLLL, i2, i3, iArr, iArr);
            }
            int[] iArr2 = this.LIZ;
            int i4 = this.LIZLLL - 1;
            iArr2[i4] = i;
            this.LIZIZ[i] = null;
            this.LIZLLL = i4;
        }
        return remove;
    }
}
