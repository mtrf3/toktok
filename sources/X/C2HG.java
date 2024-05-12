package X;

import java.util.Arrays;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.2HG, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2HG<E> extends C28Q<E> {
    public final Object[] LJLILLLLZI;
    public final Object[] LJLJI;
    public final int LJLJJI;
    public final int LJLJJL;

    @Override // X.InterfaceC44221oQ
    /* renamed from: LJII, reason: merged with bridge method [inline-methods] */
    public final C2HH<E> builder() {
        return new C2HH<>(this, this.LJLILLLLZI, this.LJLJI, this.LJLJJL);
    }

    public final int LJIL() {
        return (LIZJ() - 1) & (-32);
    }

    @Override // X.OQZ
    public final int LIZJ() {
        return this.LJLJJI;
    }

    @Override // X.InterfaceC44221oQ
    public final InterfaceC44221oQ LJJJJ(IDqS416S0100000 iDqS416S0100000) {
        C2HH<E> builder = builder();
        builder.LJJIZ(iDqS416S0100000);
        return builder.LIZJ();
    }

    @Override // X.InterfaceC44221oQ
    public final InterfaceC44221oQ<E> LJJJJIZL(int i) {
        C00B.LIZ(i, this.LJLJJI);
        int LJIL = LJIL();
        if (i >= LJIL) {
            return LJIJJLI(LJIL, this.LJLJJL, i - LJIL, this.LJLILLLLZI);
        }
        return LJIJJLI(LJIL, this.LJLJJL, 0, LJIJ(this.LJLILLLLZI, this.LJLJJL, i, new C13I(this.LJLJI[0])));
    }

    @Override // java.util.Collection, java.util.List, X.InterfaceC44221oQ
    public final InterfaceC44221oQ<E> add(E e) {
        int LJIL = this.LJLJJI - LJIL();
        if (LJIL < 32) {
            Object[] copyOf = Arrays.copyOf(this.LJLJI, 32);
            o.LJIIIIZZ(copyOf, "copyOf(this, newSize)");
            copyOf[LJIL] = e;
            return new C2HG(this.LJLJJI + 1, this.LJLJJL, this.LJLILLLLZI, copyOf);
        }
        Object[] objArr = new Object[32];
        objArr[0] = e;
        return LJIILLIIL(this.LJLILLLLZI, this.LJLJI, objArr);
    }

    @Override // X.AbstractC61884OQm, java.util.List
    public final E get(int i) {
        Object[] objArr;
        C00B.LIZ(i, LIZJ());
        if (LJIL() <= i) {
            objArr = this.LJLJI;
        } else {
            objArr = this.LJLILLLLZI;
            for (int i2 = this.LJLJJL; i2 > 0; i2 -= 5) {
                Object obj = objArr[(i >> i2) & 31];
                o.LJII(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr = (Object[]) obj;
            }
        }
        return (E) objArr[i & 31];
    }

    @Override // X.AbstractC61884OQm, java.util.List
    public final ListIterator<E> listIterator(final int i) {
        C00B.LIZIZ(i, LIZJ());
        final Object[] objArr = this.LJLILLLLZI;
        final Object[] objArr2 = this.LJLJI;
        o.LJII(objArr2, "null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVector>");
        final int LIZJ = LIZJ();
        final int i2 = (this.LJLJJL / 5) + 1;
        return new AbstractC37961eK(i, LIZJ, i2, objArr, objArr2) { // from class: X.1og
            public final T[] LJLJJI;
            public final C44411oj<T> LJLJJL;

            @Override // java.util.ListIterator, java.util.Iterator
            public final T next() {
                if (hasNext()) {
                    if (this.LJLJJL.hasNext()) {
                        this.LJLILLLLZI++;
                        return this.LJLJJL.next();
                    }
                    T[] tArr = this.LJLJJI;
                    int i3 = this.LJLILLLLZI;
                    this.LJLILLLLZI = i3 + 1;
                    return tArr[i3 - this.LJLJJL.LJLJI];
                }
                throw new NoSuchElementException();
            }

            @Override // java.util.ListIterator
            public final T previous() {
                if (hasPrevious()) {
                    int i3 = this.LJLILLLLZI;
                    C44411oj<T> c44411oj = this.LJLJJL;
                    int i4 = c44411oj.LJLJI;
                    if (i3 > i4) {
                        T[] tArr = this.LJLJJI;
                        int i5 = i3 - 1;
                        this.LJLILLLLZI = i5;
                        return tArr[i5 - i4];
                    }
                    this.LJLILLLLZI = i3 - 1;
                    return c44411oj.previous();
                }
                throw new NoSuchElementException();
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(i, LIZJ, 0);
                o.LJIIIZ(objArr, "root");
                this.LJLJJI = objArr2;
                int i3 = (LIZJ - 1) & (-32);
                this.LJLJJL = new C44411oj<>(i > i3 ? i3 : i, i3, i2, objArr);
            }
        };
    }

    @Override // java.util.List, X.InterfaceC44221oQ
    public final InterfaceC44221oQ<E> add(int i, E e) {
        C00B.LIZIZ(i, LIZJ());
        if (i == LIZJ()) {
            return add((C2HG<E>) e);
        }
        int LJIL = LJIL();
        if (i >= LJIL) {
            return LJIIIZ(i - LJIL, e, this.LJLILLLLZI);
        }
        C13I c13i = new C13I((Object) null);
        return LJIIIZ(0, c13i.LIZ, LJIIIIZZ(this.LJLILLLLZI, this.LJLJJL, i, e, c13i));
    }

    @Override // X.AbstractC61884OQm, java.util.List, X.InterfaceC44221oQ
    public final InterfaceC44221oQ<E> set(int i, E e) {
        C00B.LIZ(i, this.LJLJJI);
        if (LJIL() <= i) {
            Object[] copyOf = Arrays.copyOf(this.LJLJI, 32);
            o.LJIIIIZZ(copyOf, "copyOf(this, newSize)");
            copyOf[i & 31] = e;
            return new C2HG(this.LJLJJI, this.LJLJJL, this.LJLILLLLZI, copyOf);
        }
        return new C2HG(this.LJLJJI, this.LJLJJL, LJJI(this.LJLJJL, i, e, this.LJLILLLLZI), this.LJLJI);
    }

    public final C2HG LJIIIZ(int i, Object obj, Object[] objArr) {
        int LJIL = this.LJLJJI - LJIL();
        Object[] copyOf = Arrays.copyOf(this.LJLJI, 32);
        o.LJIIIIZZ(copyOf, "copyOf(this, newSize)");
        if (LJIL < 32) {
            C61898ORa.LJIIZILJ(i + 1, i, LJIL, this.LJLJI, copyOf);
            copyOf[i] = obj;
            return new C2HG(this.LJLJJI + 1, this.LJLJJL, objArr, copyOf);
        }
        Object[] objArr2 = this.LJLJI;
        Object obj2 = objArr2[31];
        C61898ORa.LJIIZILJ(i + 1, i, LJIL - 1, objArr2, copyOf);
        copyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj2;
        return LJIILLIIL(objArr, copyOf, objArr3);
    }

    public final C2HG<E> LJIILLIIL(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.LJLJJI >> 5;
        int i2 = this.LJLJJL;
        if (i > (1 << i2)) {
            Object[] objArr4 = new Object[32];
            objArr4[0] = objArr;
            int i3 = i2 + 5;
            return new C2HG<>(this.LJLJJI + 1, i3, LJIIZILJ(i3, objArr4, objArr2), objArr3);
        }
        return new C2HG<>(this.LJLJJI + 1, this.LJLJJL, LJIIZILJ(i2, objArr, objArr2), objArr3);
    }

    public final Object[] LJIIZILJ(int i, Object[] objArr, Object[] objArr2) {
        Object[] objArr3;
        int LIZJ = ((LIZJ() - 1) >> i) & 31;
        if (objArr != null) {
            objArr3 = Arrays.copyOf(objArr, 32);
            o.LJIIIIZZ(objArr3, "copyOf(this, newSize)");
        } else {
            objArr3 = new Object[32];
        }
        if (i == 5) {
            objArr3[LIZJ] = objArr2;
        } else {
            objArr3[LIZJ] = LJIIZILJ(i - 5, (Object[]) objArr3[LIZJ], objArr2);
        }
        return objArr3;
    }

    public C2HG(int i, int i2, Object[] root, Object[] tail) {
        o.LJIIIZ(root, "root");
        o.LJIIIZ(tail, "tail");
        this.LJLILLLLZI = root;
        this.LJLJI = tail;
        this.LJLJJI = i;
        this.LJLJJL = i2;
        if (LIZJ() > 32) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Trie-based persistent vector should have at least 33 elements, got ");
        LIZ.append(LIZJ());
        String LIZIZ = X1D.LIZIZ(LIZ);
        LIZIZ.toString();
        throw new IllegalArgumentException(LIZIZ);
    }

    public static Object[] LJJI(int i, int i2, Object obj, Object[] objArr) {
        int i3 = (i2 >> i) & 31;
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        o.LJIIIIZZ(copyOf, "copyOf(this, newSize)");
        if (i == 0) {
            copyOf[i3] = obj;
        } else {
            Object obj2 = copyOf[i3];
            o.LJII(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            copyOf[i3] = LJJI(i - 5, i2, obj, (Object[]) obj2);
        }
        return copyOf;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        if (r2 == null) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object[] LJIILJJIL(java.lang.Object[] r6, int r7, int r8, X.C13I r9) {
        /*
            r5 = this;
            int r0 = r8 >> r7
            r4 = r0 & 31
            r3 = 0
            r2 = 5
            if (r7 != r2) goto L10
            r0 = r6[r4]
            r9.LIZ = r0
            r2 = r3
        Ld:
            if (r4 != 0) goto L21
            return r3
        L10:
            r1 = r6[r4]
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>"
            kotlin.jvm.internal.o.LJII(r1, r0)
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            int r7 = r7 - r2
            java.lang.Object[] r2 = r5.LJIILJJIL(r1, r7, r8, r9)
            if (r2 != 0) goto L21
            goto Ld
        L21:
            r0 = 32
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r6, r0)
            java.lang.String r0 = "copyOf(this, newSize)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            r1[r4] = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2HG.LJIILJJIL(java.lang.Object[], int, int, X.13I):java.lang.Object[]");
    }

    public final Object[] LJIJ(Object[] objArr, int i, int i2, C13I c13i) {
        Object[] copyOf;
        int i3 = 31;
        int i4 = (i2 >> i) & 31;
        if (i == 0) {
            if (i4 == 0) {
                copyOf = new Object[32];
            } else {
                copyOf = Arrays.copyOf(objArr, 32);
                o.LJIIIIZZ(copyOf, "copyOf(this, newSize)");
            }
            C61898ORa.LJIIZILJ(i4, i4 + 1, 32, objArr, copyOf);
            copyOf[31] = c13i.LIZ;
            c13i.LIZ = objArr[i4];
            return copyOf;
        }
        if (objArr[31] == null) {
            i3 = 31 & ((LJIL() - 1) >> i);
        }
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        o.LJIIIIZZ(copyOf2, "copyOf(this, newSize)");
        int i5 = i - 5;
        int i6 = i4 + 1;
        if (i6 <= i3) {
            while (true) {
                Object obj = copyOf2[i3];
                o.LJII(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                copyOf2[i3] = LJIJ((Object[]) obj, i5, 0, c13i);
                if (i3 == i6) {
                    break;
                }
                i3--;
            }
        }
        Object obj2 = copyOf2[i4];
        o.LJII(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        copyOf2[i4] = LJIJ((Object[]) obj2, i5, i2, c13i);
        return copyOf2;
    }

    public final C28Q LJIJJLI(int i, int i2, int i3, Object[] objArr) {
        int i4 = this.LJLJJI - i;
        if (i4 == 1) {
            if (i2 == 0) {
                if (objArr.length == 33) {
                    objArr = Arrays.copyOf(objArr, 32);
                    o.LJIIIIZZ(objArr, "copyOf(this, newSize)");
                }
                return new C2HI(objArr);
            }
            C13I c13i = new C13I((Object) null);
            Object[] LJIILJJIL = LJIILJJIL(objArr, i2, i - 1, c13i);
            o.LJI(LJIILJJIL);
            Object obj = c13i.LIZ;
            o.LJII(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            Object[] objArr2 = (Object[]) obj;
            if (LJIILJJIL[1] == null) {
                Object obj2 = LJIILJJIL[0];
                o.LJII(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                return new C2HG(i, i2 - 5, (Object[]) obj2, objArr2);
            }
            return new C2HG(i, i2, LJIILJJIL, objArr2);
        }
        Object[] copyOf = Arrays.copyOf(this.LJLJI, 32);
        o.LJIIIIZZ(copyOf, "copyOf(this, newSize)");
        int i5 = i4 - 1;
        if (i3 < i5) {
            C61898ORa.LJIIZILJ(i3, i3 + 1, i4, this.LJLJI, copyOf);
        }
        copyOf[i5] = null;
        return new C2HG((i + i4) - 1, i2, objArr, copyOf);
    }

    public final Object[] LJIIIIZZ(Object[] objArr, int i, int i2, Object obj, C13I c13i) {
        Object[] copyOf;
        int i3 = (i2 >> i) & 31;
        if (i == 0) {
            if (i3 == 0) {
                copyOf = new Object[32];
            } else {
                copyOf = Arrays.copyOf(objArr, 32);
                o.LJIIIIZZ(copyOf, "copyOf(this, newSize)");
            }
            C61898ORa.LJIIZILJ(i3 + 1, i3, 31, objArr, copyOf);
            c13i.LIZ = objArr[31];
            copyOf[i3] = obj;
            return copyOf;
        }
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        o.LJIIIIZZ(copyOf2, "copyOf(this, newSize)");
        int i4 = i - 5;
        Object obj2 = objArr[i3];
        o.LJII(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        copyOf2[i3] = LJIIIIZZ((Object[]) obj2, i4, i2, obj, c13i);
        while (true) {
            i3++;
            if (i3 >= 32 || copyOf2[i3] == null) {
                break;
            }
            Object obj3 = objArr[i3];
            o.LJII(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            copyOf2[i3] = LJIIIIZZ((Object[]) obj3, i4, 0, c13i.LIZ, c13i);
        }
        return copyOf2;
    }
}
