package X;

import java.util.Arrays;
import kotlin.jvm.internal.o;

/* renamed from: X.14U, reason: invalid class name */
/* loaded from: classes.dex */
public final class C14U<K, V> {
    public static final C14U LJ = new C14U(0, 0, new Object[0], null);
    public int LIZ;
    public int LIZIZ;
    public final C17P LIZJ;
    public Object[] LIZLLL;

    public final int LIZIZ() {
        if (this.LIZIZ == 0) {
            return this.LIZLLL.length / 2;
        }
        int bitCount = Integer.bitCount(this.LIZ);
        int length = this.LIZLLL.length;
        for (int i = bitCount * 2; i < length; i++) {
            bitCount += LJIJ(i).LIZIZ();
        }
        return bitCount;
    }

    public final boolean LIZJ(K k) {
        C40511Fv9 LJIL = C78842Uww.LJIL(C78842Uww.LJJ(0, this.LIZLLL.length), 2);
        int i = LJIL.LJLIL;
        int i2 = LJIL.LJLILLLLZI;
        int i3 = LJIL.LJLJI;
        if (i3 <= 0 ? !(i3 >= 0 || i2 > i) : i <= i2) {
            while (!o.LJ(k, this.LIZLLL[i])) {
                if (i != i2) {
                    i += i3;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean LJ(C14U<K, V> c14u) {
        if (this == c14u) {
            return true;
        }
        if (this.LIZIZ != c14u.LIZIZ || this.LIZ != c14u.LIZ) {
            return false;
        }
        int length = this.LIZLLL.length;
        for (int i = 0; i < length; i++) {
            if (this.LIZLLL[i] != c14u.LIZLLL[i]) {
                return false;
            }
        }
        return true;
    }

    public final int LJFF(int i) {
        return Integer.bitCount((i - 1) & this.LIZ) * 2;
    }

    public final boolean LJII(int i) {
        if ((i & this.LIZ) != 0) {
            return true;
        }
        return false;
    }

    public final boolean LJIIIIZZ(int i) {
        if ((i & this.LIZIZ) != 0) {
            return true;
        }
        return false;
    }

    public final C14U<K, V> LJIJ(int i) {
        Object obj = this.LIZLLL[i];
        o.LJII(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        return (C14U) obj;
    }

    public final int LJIJI(int i) {
        return (this.LIZLLL.length - 1) - Integer.bitCount((i - 1) & this.LIZIZ);
    }

    public final V LJJ(int i) {
        return (V) this.LIZLLL[i + 1];
    }

    public final C14U<K, V> LJIIJ(int i, C44551ox<K, V> c44551ox) {
        c44551ox.LIZIZ(c44551ox.LJLJJLL - 1);
        c44551ox.LJLJJI = LJJ(i);
        Object[] objArr = this.LIZLLL;
        if (objArr.length == 2) {
            return null;
        }
        if (this.LIZJ == c44551ox.LJLILLLLZI) {
            this.LIZLLL = C73340SqO.LJ(i, objArr);
            return this;
        }
        return new C14U<>(0, 0, C73340SqO.LJ(i, objArr), c44551ox.LJLILLLLZI);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean LIZLLL(int i, int i2, Object obj) {
        int i3 = 1 << ((i >> i2) & 31);
        if (LJII(i3)) {
            return o.LJ(obj, this.LIZLLL[LJFF(i3)]);
        }
        if (LJIIIIZZ(i3)) {
            C14U<K, V> LJIJ = LJIJ(LJIJI(i3));
            if (i2 == 30) {
                return LJIJ.LIZJ(obj);
            }
            return LJIJ.LIZLLL(i, i2 + 5, obj);
        }
        return false;
    }

    public final Object LJI(int i, int i2, Object obj) {
        int i3 = 1 << ((i >> i2) & 31);
        if (LJII(i3)) {
            int LJFF = LJFF(i3);
            if (!o.LJ(obj, this.LIZLLL[LJFF])) {
                return null;
            }
            return LJJ(LJFF);
        }
        if (!LJIIIIZZ(i3)) {
            return null;
        }
        C14U<K, V> LJIJ = LJIJ(LJIJI(i3));
        if (i2 == 30) {
            C40511Fv9 LJIL = C78842Uww.LJIL(C78842Uww.LJJ(0, LJIJ.LIZLLL.length), 2);
            int i4 = LJIL.LJLIL;
            int i5 = LJIL.LJLILLLLZI;
            int i6 = LJIL.LJLJI;
            if (i6 > 0) {
                if (i4 > i5) {
                    return null;
                }
            } else if (i6 >= 0 || i5 > i4) {
                return null;
            }
            while (!o.LJ(obj, LJIJ.LIZLLL[i4])) {
                if (i4 == i5) {
                    return null;
                }
                i4 += i6;
            }
            return LJIJ.LJJ(i4);
        }
        return LJIJ.LJI(i, i2 + 5, obj);
    }

    public final C14U<K, V> LJIILL(int i, int i2, C44551ox<K, V> c44551ox) {
        c44551ox.LIZIZ(c44551ox.LJLJJLL - 1);
        c44551ox.LJLJJI = LJJ(i);
        Object[] objArr = this.LIZLLL;
        if (objArr.length == 2) {
            return null;
        }
        if (this.LIZJ == c44551ox.LJLILLLLZI) {
            this.LIZLLL = C73340SqO.LJ(i, objArr);
            this.LIZ ^= i2;
            return this;
        }
        return new C14U<>(i2 ^ this.LIZ, this.LIZIZ, C73340SqO.LJ(i, objArr), c44551ox.LJLILLLLZI);
    }

    public final C14U<K, V> LJIIZILJ(int i, C14U<K, V> c14u, C17P c17p) {
        Object[] objArr = this.LIZLLL;
        if (objArr.length == 1 && c14u.LIZLLL.length == 2 && c14u.LIZIZ == 0) {
            c14u.LIZ = this.LIZIZ;
            return c14u;
        }
        if (this.LIZJ == c17p) {
            objArr[i] = c14u;
            return this;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        o.LJIIIIZZ(copyOf, "copyOf(this, size)");
        copyOf[i] = c14u;
        return new C14U<>(this.LIZ, this.LIZIZ, copyOf, c17p);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x006c, code lost:
    
        if (r1 == null) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C14U LJIJJLI(int r12, int r13, java.lang.Object r14) {
        /*
            r11 = this;
            int r0 = r12 >> r13
            r0 = r0 & 31
            r3 = 1
            int r5 = r3 << r0
            boolean r0 = r11.LJII(r5)
            r8 = 2
            r4 = 0
            if (r0 == 0) goto L34
            int r2 = r11.LJFF(r5)
            java.lang.Object[] r0 = r11.LIZLLL
            r0 = r0[r2]
            boolean r0 = kotlin.jvm.internal.o.LJ(r14, r0)
            if (r0 == 0) goto L33
            java.lang.Object[] r1 = r11.LIZLLL
            int r0 = r1.length
            if (r0 != r8) goto L23
        L22:
            return r4
        L23:
            java.lang.Object[] r3 = X.C73340SqO.LJ(r2, r1)
            X.14U r2 = new X.14U
            int r1 = r11.LIZ
            r1 = r1 ^ r5
            int r0 = r11.LIZIZ
            r2.<init>(r1, r0, r3, r4)
            r4 = r2
            goto L22
        L33:
            return r11
        L34:
            boolean r0 = r11.LJIIIIZZ(r5)
            if (r0 == 0) goto La6
            int r2 = r11.LJIJI(r5)
            X.14U r6 = r11.LJIJ(r2)
            r0 = 30
            if (r13 != r0) goto L66
            java.lang.Object[] r0 = r6.LIZLLL
            int r0 = r0.length
            r7 = 0
            X.FvF r0 = X.C78842Uww.LJJ(r7, r0)
            X.Fv9 r0 = X.C78842Uww.LJIL(r0, r8)
            int r9 = r0.LJLIL
            int r10 = r0.LJLILLLLZI
            int r1 = r0.LJLJI
            if (r1 <= 0) goto L6f
            if (r9 <= r10) goto L73
        L5c:
            r1 = r6
        L5d:
            if (r6 == r1) goto L64
            X.14U r4 = r11.LJIL(r2, r5, r1)
        L63:
            return r4
        L64:
            r4 = r11
            goto L63
        L66:
            int r0 = r13 + 5
            X.14U r1 = r6.LJIJJLI(r12, r0, r14)
            if (r1 != 0) goto L5d
            goto L82
        L6f:
            if (r1 >= 0) goto L5c
            if (r10 > r9) goto L5c
        L73:
            java.lang.Object[] r0 = r6.LIZLLL
            r0 = r0[r9]
            boolean r0 = kotlin.jvm.internal.o.LJ(r14, r0)
            if (r0 == 0) goto L88
            java.lang.Object[] r1 = r6.LIZLLL
            int r0 = r1.length
            if (r0 != r8) goto L9c
        L82:
            java.lang.Object[] r1 = r11.LIZLLL
            int r0 = r1.length
            if (r0 != r3) goto L8c
            goto L63
        L88:
            if (r9 == r10) goto L5c
            int r9 = r9 + r1
            goto L73
        L8c:
            java.lang.Object[] r3 = X.C73340SqO.LJFF(r2, r1)
            X.14U r2 = new X.14U
            int r1 = r11.LIZ
            int r0 = r11.LIZIZ
            r5 = r5 ^ r0
            r2.<init>(r1, r5, r3, r4)
            r4 = r2
            goto L63
        L9c:
            java.lang.Object[] r0 = X.C73340SqO.LJ(r9, r1)
            X.14U r1 = new X.14U
            r1.<init>(r7, r7, r0, r4)
            goto L5d
        La6:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14U.LJIJJLI(int, int, java.lang.Object):X.14U");
    }

    public final C14U<K, V> LJIL(int i, int i2, C14U<K, V> c14u) {
        Object[] objArr = c14u.LIZLLL;
        if (objArr.length == 2 && c14u.LIZIZ == 0) {
            if (this.LIZLLL.length == 1) {
                c14u.LIZ = this.LIZIZ;
                return c14u;
            }
            int LJFF = LJFF(i2);
            Object[] objArr2 = this.LIZLLL;
            Object obj = objArr[0];
            Object obj2 = objArr[1];
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length + 1);
            o.LJIIIIZZ(copyOf, "copyOf(this, newSize)");
            C61898ORa.LJIIZILJ(i + 2, i + 1, objArr2.length, copyOf, copyOf);
            C61898ORa.LJIIZILJ(LJFF + 2, LJFF, i, copyOf, copyOf);
            copyOf[LJFF] = obj;
            copyOf[LJFF + 1] = obj2;
            return new C14U<>(this.LIZ ^ i2, i2 ^ this.LIZIZ, copyOf, null);
        }
        Object[] objArr3 = this.LIZLLL;
        Object[] copyOf2 = Arrays.copyOf(objArr3, objArr3.length);
        o.LJIIIIZZ(copyOf2, "copyOf(this, newSize)");
        copyOf2[i] = c14u;
        return new C14U<>(this.LIZ, this.LIZIZ, copyOf2, null);
    }

    public C14U(int i, int i2, Object[] objArr, C17P c17p) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = c17p;
        this.LIZLLL = objArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r26v0, types: [X.14U, X.14U<K, V>] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v12, types: [X.14U] */
    /* JADX WARN: Type inference failed for: r9v13, types: [X.14U] */
    /* JADX WARN: Type inference failed for: r9v14, types: [X.14U] */
    /* JADX WARN: Type inference failed for: r9v6, types: [X.14U] */
    /* JADX WARN: Type inference failed for: r9v8, types: [X.14U] */
    /* JADX WARN: Type inference failed for: r9v9, types: [X.14U] */
    public final C14U<K, V> LJIIL(C14U<K, V> c14u, int i, C17O c17o, C44551ox<K, V> mutator) {
        C14U<K, V> c14u2;
        int i2;
        int i3;
        C14U<K, V> c14u3;
        int i4;
        int i5;
        int i6;
        o.LJIIIZ(mutator, "mutator");
        if (this == c14u) {
            c17o.LJLIL += LIZIZ();
            return this;
        }
        if (i > 30) {
            C17P c17p = mutator.LJLILLLLZI;
            Object[] objArr = this.LIZLLL;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length + c14u.LIZLLL.length);
            o.LJIIIIZZ(copyOf, "copyOf(this, newSize)");
            int length = this.LIZLLL.length;
            C40511Fv9 LJIL = C78842Uww.LJIL(C78842Uww.LJJ(0, c14u.LIZLLL.length), 2);
            int i7 = LJIL.LJLIL;
            int i8 = LJIL.LJLILLLLZI;
            int i9 = LJIL.LJLJI;
            if (i9 <= 0 ? !(i9 >= 0 || i8 > i7) : i7 <= i8) {
                while (true) {
                    if (!LIZJ(c14u.LIZLLL[i7])) {
                        Object[] objArr2 = c14u.LIZLLL;
                        copyOf[length] = objArr2[i7];
                        copyOf[length + 1] = objArr2[i7 + 1];
                        length += 2;
                    } else {
                        c17o.LJLIL++;
                    }
                    if (i7 == i8) {
                        break;
                    }
                    i7 += i9;
                }
            }
            if (length == this.LIZLLL.length) {
                return this;
            }
            if (length == c14u.LIZLLL.length) {
                return c14u;
            }
            if (length == copyOf.length) {
                return new C14U<>(0, 0, copyOf, c17p);
            }
            Object[] copyOf2 = Arrays.copyOf(copyOf, length);
            o.LJIIIIZZ(copyOf2, "copyOf(this, newSize)");
            return new C14U<>(0, 0, copyOf2, c17p);
        }
        int i10 = this.LIZIZ | c14u.LIZIZ;
        int i11 = this.LIZ;
        int i12 = c14u.LIZ;
        int i13 = (i11 ^ i12) & (~i10);
        int i14 = i11 & i12;
        while (i14 != 0) {
            int lowestOneBit = Integer.lowestOneBit(i14);
            if (o.LJ(this.LIZLLL[LJFF(lowestOneBit)], c14u.LIZLLL[c14u.LJFF(lowestOneBit)])) {
                i13 |= lowestOneBit;
            } else {
                i10 |= lowestOneBit;
            }
            i14 ^= lowestOneBit;
        }
        if ((i10 & i13) == 0) {
            if (o.LJ(this.LIZJ, mutator.LJLILLLLZI) && this.LIZ == i13 && this.LIZIZ == i10) {
                c14u2 = this;
            } else {
                c14u2 = new C14U<>(i13, i10, new Object[Integer.bitCount(i10) + (Integer.bitCount(i13) * 2)], null);
            }
            int i15 = 0;
            while (i10 != 0) {
                int lowestOneBit2 = Integer.lowestOneBit(i10);
                ?? r12 = c14u2.LIZLLL;
                int length2 = (r12.length - 1) - i15;
                if (LJIIIIZZ(lowestOneBit2)) {
                    c14u3 = (C14U<K, V>) LJIJ(LJIJI(lowestOneBit2));
                    if (c14u.LJIIIIZZ(lowestOneBit2)) {
                        c14u3 = (C14U<K, V>) c14u3.LJIIL(c14u.LJIJ(c14u.LJIJI(lowestOneBit2)), i + 5, c17o, mutator);
                    } else if (c14u.LJII(lowestOneBit2)) {
                        int LJFF = c14u.LJFF(lowestOneBit2);
                        Object obj = c14u.LIZLLL[LJFF];
                        V LJJ = c14u.LJJ(LJFF);
                        int i16 = mutator.LJLJJLL;
                        if (obj != null) {
                            i6 = obj.hashCode();
                        } else {
                            i6 = 0;
                        }
                        c14u3 = (C14U<K, V>) c14u3.LJIIJJI(i6, obj, LJJ, i + 5, mutator);
                        if (mutator.LJLJJLL == i16) {
                            c17o.LJLIL++;
                        }
                    }
                } else if (c14u.LJIIIIZZ(lowestOneBit2)) {
                    c14u3 = c14u.LJIJ(c14u.LJIJI(lowestOneBit2));
                    if (LJII(lowestOneBit2)) {
                        int LJFF2 = LJFF(lowestOneBit2);
                        Object obj2 = this.LIZLLL[LJFF2];
                        if (obj2 != null) {
                            i4 = obj2.hashCode();
                        } else {
                            i4 = 0;
                        }
                        int i17 = i + 5;
                        if (c14u3.LIZLLL(i4, i17, obj2)) {
                            c17o.LJLIL++;
                        } else {
                            Object LJJ2 = LJJ(LJFF2);
                            if (obj2 != null) {
                                i5 = obj2.hashCode();
                            } else {
                                i5 = 0;
                            }
                            c14u3 = (C14U<K, V>) c14u3.LJIIJJI(i5, obj2, LJJ2, i17, mutator);
                        }
                    }
                } else {
                    int LJFF3 = LJFF(lowestOneBit2);
                    Object obj3 = this.LIZLLL[LJFF3];
                    Object LJJ3 = LJJ(LJFF3);
                    int LJFF4 = c14u.LJFF(lowestOneBit2);
                    Object obj4 = c14u.LIZLLL[LJFF4];
                    V LJJ4 = c14u.LJJ(LJFF4);
                    if (obj3 != null) {
                        i2 = obj3.hashCode();
                    } else {
                        i2 = 0;
                    }
                    if (obj4 != null) {
                        i3 = obj4.hashCode();
                    } else {
                        i3 = 0;
                    }
                    c14u3 = (C14U<K, V>) LJIIIZ(i2, obj3, LJJ3, i3, obj4, LJJ4, i + 5, mutator.LJLILLLLZI);
                }
                r12[length2] = c14u3;
                i15++;
                i10 ^= lowestOneBit2;
            }
            int i18 = 0;
            while (i13 != 0) {
                int lowestOneBit3 = Integer.lowestOneBit(i13);
                int i19 = i18 * 2;
                if (!c14u.LJII(lowestOneBit3)) {
                    int LJFF5 = LJFF(lowestOneBit3);
                    Object[] objArr3 = c14u2.LIZLLL;
                    objArr3[i19] = this.LIZLLL[LJFF5];
                    objArr3[i19 + 1] = LJJ(LJFF5);
                } else {
                    int LJFF6 = c14u.LJFF(lowestOneBit3);
                    Object[] objArr4 = c14u2.LIZLLL;
                    objArr4[i19] = c14u.LIZLLL[LJFF6];
                    objArr4[i19 + 1] = c14u.LJJ(LJFF6);
                    if (LJII(lowestOneBit3)) {
                        c17o.LJLIL++;
                    }
                }
                i18++;
                i13 ^= lowestOneBit3;
            }
            if (LJ(c14u2)) {
                return this;
            }
            if (!c14u.LJ(c14u2)) {
                return c14u2;
            }
            return c14u;
        }
        "Check failed.".toString();
        throw new IllegalStateException("Check failed.");
    }

    public final C14U<K, V> LJIILIIL(int i, K k, int i2, C44551ox<K, V> mutator) {
        C14U<K, V> LJIILIIL;
        o.LJIIIZ(mutator, "mutator");
        int i3 = 1 << ((i >> i2) & 31);
        if (LJII(i3)) {
            int LJFF = LJFF(i3);
            if (!o.LJ(k, this.LIZLLL[LJFF])) {
                return this;
            }
            return LJIILL(LJFF, i3, mutator);
        }
        if (!LJIIIIZZ(i3)) {
            return this;
        }
        int LJIJI = LJIJI(i3);
        C14U<K, V> LJIJ = LJIJ(LJIJI);
        if (i2 == 30) {
            C40511Fv9 LJIL = C78842Uww.LJIL(C78842Uww.LJJ(0, LJIJ.LIZLLL.length), 2);
            int i4 = LJIL.LJLIL;
            int i5 = LJIL.LJLILLLLZI;
            int i6 = LJIL.LJLJI;
            if (i6 <= 0 ? !(i6 >= 0 || i5 > i4) : i4 <= i5) {
                while (!o.LJ(k, LJIJ.LIZLLL[i4])) {
                    if (i4 != i5) {
                        i4 += i6;
                    }
                }
                LJIILIIL = LJIJ.LJIIJ(i4, mutator);
            }
            LJIILIIL = LJIJ;
            break;
        }
        LJIILIIL = LJIJ.LJIILIIL(i, k, i2 + 5, mutator);
        return LJIILLIIL(LJIJ, LJIILIIL, LJIJI, i3, mutator.LJLILLLLZI);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C14T LJIJJ(int i, int i2, Object obj, C15Z c15z) {
        C14T LJIJJ;
        int i3 = 1 << ((i >> i2) & 31);
        if (LJII(i3)) {
            int LJFF = LJFF(i3);
            if (o.LJ(obj, this.LIZLLL[LJFF])) {
                if (LJJ(LJFF) == c15z) {
                    return null;
                }
                Object[] objArr = this.LIZLLL;
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                o.LJIIIIZZ(copyOf, "copyOf(this, size)");
                copyOf[LJFF + 1] = c15z;
                return new C14T(new C14U(this.LIZ, this.LIZIZ, copyOf, null), 0);
            }
            return new C14T(new C14U(this.LIZ ^ i3, this.LIZIZ | i3, LIZ(LJFF, i3, i, obj, c15z, i2, null), null), 1);
        }
        if (LJIIIIZZ(i3)) {
            int LJIJI = LJIJI(i3);
            C14U<K, V> LJIJ = LJIJ(LJIJI);
            if (i2 == 30) {
                C40511Fv9 LJIL = C78842Uww.LJIL(C78842Uww.LJJ(0, LJIJ.LIZLLL.length), 2);
                int i4 = LJIL.LJLIL;
                int i5 = LJIL.LJLILLLLZI;
                int i6 = LJIL.LJLJI;
                if (i6 <= 0 ? !(i6 >= 0 || i5 > i4) : i4 <= i5) {
                    while (!o.LJ(obj, LJIJ.LIZLLL[i4])) {
                        if (i4 != i5) {
                            i4 += i6;
                        }
                    }
                    if (c15z == LJIJ.LJJ(i4)) {
                        return null;
                    }
                    Object[] objArr2 = LJIJ.LIZLLL;
                    Object[] copyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                    o.LJIIIIZZ(copyOf2, "copyOf(this, size)");
                    copyOf2[i4 + 1] = c15z;
                    LJIJJ = new C14T(new C14U(0, 0, copyOf2, null), 0);
                }
                LJIJJ = new C14T(new C14U(0, 0, C73340SqO.LIZJ(LJIJ.LIZLLL, 0, obj, c15z), null), 1);
                break;
            }
            LJIJJ = LJIJ.LJIJJ(i, i2 + 5, obj, c15z);
            if (LJIJJ == null) {
                return null;
            }
            LJIJJ.LIZ = LJIL(LJIJI, i3, LJIJJ.LIZ);
            return LJIJJ;
        }
        return new C14T(new C14U(this.LIZ | i3, this.LIZIZ, C73340SqO.LIZJ(this.LIZLLL, LJFF(i3), obj, c15z), null), 1);
    }

    public final C14U<K, V> LJIIJJI(int i, K k, V v, int i2, C44551ox<K, V> mutator) {
        C14U<K, V> LJIIJJI;
        o.LJIIIZ(mutator, "mutator");
        int i3 = 1 << ((i >> i2) & 31);
        if (LJII(i3)) {
            int LJFF = LJFF(i3);
            if (o.LJ(k, this.LIZLLL[LJFF])) {
                mutator.LJLJJI = LJJ(LJFF);
                if (LJJ(LJFF) == v) {
                    return this;
                }
                if (this.LIZJ == mutator.LJLILLLLZI) {
                    this.LIZLLL[LJFF + 1] = v;
                    return this;
                }
                mutator.LJLJJL++;
                Object[] objArr = this.LIZLLL;
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                o.LJIIIIZZ(copyOf, "copyOf(this, size)");
                copyOf[LJFF + 1] = v;
                return new C14U<>(this.LIZ, this.LIZIZ, copyOf, mutator.LJLILLLLZI);
            }
            mutator.LIZIZ(mutator.LJLJJLL + 1);
            C17P c17p = mutator.LJLILLLLZI;
            if (this.LIZJ == c17p) {
                this.LIZLLL = LIZ(LJFF, i3, i, k, v, i2, c17p);
                this.LIZ ^= i3;
                this.LIZIZ |= i3;
                return this;
            }
            return new C14U<>(this.LIZ ^ i3, this.LIZIZ | i3, LIZ(LJFF, i3, i, k, v, i2, c17p), c17p);
        }
        if (LJIIIIZZ(i3)) {
            int LJIJI = LJIJI(i3);
            C14U<K, V> LJIJ = LJIJ(LJIJI);
            if (i2 == 30) {
                C40511Fv9 LJIL = C78842Uww.LJIL(C78842Uww.LJJ(0, LJIJ.LIZLLL.length), 2);
                int i4 = LJIL.LJLIL;
                int i5 = LJIL.LJLILLLLZI;
                int i6 = LJIL.LJLJI;
                if (i6 <= 0 ? !(i6 >= 0 || i5 > i4) : i4 <= i5) {
                    while (!o.LJ(k, LJIJ.LIZLLL[i4])) {
                        if (i4 != i5) {
                            i4 += i6;
                        }
                    }
                    mutator.LJLJJI = LJIJ.LJJ(i4);
                    if (LJIJ.LIZJ == mutator.LJLILLLLZI) {
                        LJIJ.LIZLLL[i4 + 1] = v;
                        LJIIJJI = LJIJ;
                    } else {
                        mutator.LJLJJL++;
                        Object[] objArr2 = LJIJ.LIZLLL;
                        Object[] copyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                        o.LJIIIIZZ(copyOf2, "copyOf(this, size)");
                        copyOf2[i4 + 1] = v;
                        LJIIJJI = new C14U<>(0, 0, copyOf2, mutator.LJLILLLLZI);
                    }
                }
                mutator.LIZIZ(mutator.LJLJJLL + 1);
                LJIIJJI = new C14U<>(0, 0, C73340SqO.LIZJ(LJIJ.LIZLLL, 0, k, v), mutator.LJLILLLLZI);
                break;
            }
            LJIIJJI = LJIJ.LJIIJJI(i, k, v, i2 + 5, mutator);
            if (LJIJ == LJIIJJI) {
                return this;
            }
            return LJIIZILJ(LJIJI, LJIIJJI, mutator.LJLILLLLZI);
        }
        mutator.LIZIZ(mutator.LJLJJLL + 1);
        C17P c17p2 = mutator.LJLILLLLZI;
        int LJFF2 = LJFF(i3);
        if (this.LIZJ == c17p2) {
            this.LIZLLL = C73340SqO.LIZJ(this.LIZLLL, LJFF2, k, v);
            this.LIZ |= i3;
            return this;
        }
        return new C14U<>(this.LIZ | i3, this.LIZIZ, C73340SqO.LIZJ(this.LIZLLL, LJFF2, k, v), c17p2);
    }

    public final C14U<K, V> LJIILJJIL(int i, K k, V v, int i2, C44551ox<K, V> mutator) {
        C14U<K, V> LJIILJJIL;
        o.LJIIIZ(mutator, "mutator");
        int i3 = 1 << ((i >> i2) & 31);
        if (LJII(i3)) {
            int LJFF = LJFF(i3);
            if (!o.LJ(k, this.LIZLLL[LJFF]) || !o.LJ(v, LJJ(LJFF))) {
                return this;
            }
            return LJIILL(LJFF, i3, mutator);
        }
        if (!LJIIIIZZ(i3)) {
            return this;
        }
        int LJIJI = LJIJI(i3);
        C14U<K, V> LJIJ = LJIJ(LJIJI);
        if (i2 == 30) {
            C40511Fv9 LJIL = C78842Uww.LJIL(C78842Uww.LJJ(0, LJIJ.LIZLLL.length), 2);
            int i4 = LJIL.LJLIL;
            int i5 = LJIL.LJLILLLLZI;
            int i6 = LJIL.LJLJI;
            if (i6 <= 0 ? !(i6 >= 0 || i5 > i4) : i4 <= i5) {
                while (true) {
                    if (o.LJ(k, LJIJ.LIZLLL[i4]) && o.LJ(v, LJIJ.LJJ(i4))) {
                        LJIILJJIL = LJIJ.LJIIJ(i4, mutator);
                        break;
                    }
                    if (i4 == i5) {
                        break;
                    }
                    i4 += i6;
                }
            }
            LJIILJJIL = LJIJ;
        } else {
            LJIILJJIL = LJIJ.LJIILJJIL(i, k, v, i2 + 5, mutator);
        }
        return LJIILLIIL(LJIJ, LJIILJJIL, LJIJI, i3, mutator.LJLILLLLZI);
    }

    public final C14U<K, V> LJIILLIIL(C14U<K, V> c14u, C14U<K, V> c14u2, int i, int i2, C17P c17p) {
        if (c14u2 == null) {
            Object[] objArr = this.LIZLLL;
            if (objArr.length == 1) {
                return null;
            }
            if (this.LIZJ == c17p) {
                this.LIZLLL = C73340SqO.LJFF(i, objArr);
                this.LIZIZ ^= i2;
            } else {
                return new C14U<>(this.LIZ, i2 ^ this.LIZIZ, C73340SqO.LJFF(i, objArr), c17p);
            }
        } else if (this.LIZJ == c17p || c14u != c14u2) {
            return LJIIZILJ(i, c14u2, c17p);
        }
        return this;
    }

    public final Object[] LIZ(int i, int i2, int i3, K k, V v, int i4, C17P c17p) {
        int i5;
        Object obj = this.LIZLLL[i];
        if (obj != null) {
            i5 = obj.hashCode();
        } else {
            i5 = 0;
        }
        C14U LJIIIZ = LJIIIZ(i5, obj, LJJ(i), i3, k, v, i4 + 5, c17p);
        int LJIJI = LJIJI(i2) + 1;
        Object[] objArr = this.LIZLLL;
        int i6 = LJIJI - 2;
        Object[] objArr2 = new Object[(objArr.length - 2) + 1];
        C61898ORa.LJIJJ(objArr, objArr2, 0, 0, i, 6);
        C61898ORa.LJIIZILJ(i, i + 2, LJIJI, objArr, objArr2);
        objArr2[i6] = LJIIIZ;
        C61898ORa.LJIIZILJ(i6 + 1, LJIJI, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public static C14U LJIIIZ(int i, Object obj, Object obj2, int i2, Object obj3, Object obj4, int i3, C17P c17p) {
        if (i3 > 30) {
            return new C14U(0, 0, new Object[]{obj, obj2, obj3, obj4}, c17p);
        }
        int i4 = (i >> i3) & 31;
        int i5 = (i2 >> i3) & 31;
        if (i4 != i5) {
            Object[] objArr = new Object[4];
            if (i4 < i5) {
                objArr[0] = obj;
                objArr[1] = obj2;
                objArr[2] = obj3;
                objArr[3] = obj4;
            } else {
                objArr[0] = obj3;
                objArr[1] = obj4;
                objArr[2] = obj;
                objArr[3] = obj2;
            }
            return new C14U((1 << i5) | (1 << i4), 0, objArr, c17p);
        }
        return new C14U(0, 1 << i4, new Object[]{LJIIIZ(i, obj, obj2, i2, obj3, obj4, i3 + 5, c17p)}, c17p);
    }
}
