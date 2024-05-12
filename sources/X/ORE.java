package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class ORE<E> extends ORP<E> implements ORM<E> {
    public OJQ<? extends E> LJLIL;
    public Object[] LJLILLLLZI;
    public Object[] LJLJI;
    public int LJLJJI;
    public C26150AOc LJLJJL;
    public Object[] LJLJJLL;
    public Object[] LJLJL;
    public int LJLJLJ;

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<E> iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<E> listIterator() {
        return listIterator(0);
    }

    public final Object[] LJIL() {
        Object[] objArr = new Object[33];
        objArr[32] = this.LJLJJL;
        return objArr;
    }

    @Override // X.ORM
    public final OJQ<E> build() {
        C61886OQo c61886OQo;
        Object[] objArr = this.LJLJJLL;
        if (objArr == this.LJLILLLLZI && this.LJLJL == this.LJLJI) {
            c61886OQo = this.LJLIL;
        } else {
            this.LJLJJL = new C26150AOc(0);
            this.LJLILLLLZI = objArr;
            Object[] objArr2 = this.LJLJL;
            this.LJLJI = objArr2;
            if (objArr == null) {
                if (objArr2.length == 0) {
                    c61886OQo = C61887OQp.LJLJI;
                } else {
                    Object[] copyOf = Arrays.copyOf(this.LJLJL, size());
                    o.LJIIIIZZ(copyOf, "copyOf(this, newSize)");
                    c61886OQo = new C61887OQp(copyOf);
                }
            } else {
                Object[] objArr3 = this.LJLJJLL;
                o.LJI(objArr3);
                c61886OQo = new C61886OQo(size(), this.LJLJJI, objArr3, this.LJLJL);
            }
        }
        this.LJLIL = c61886OQo;
        return (OJQ<E>) c61886OQo;
    }

    public final int LJJJ() {
        if (size() <= 32) {
            return 0;
        }
        return (size() - 1) & (-32);
    }

    public final int LJJJJJ() {
        int size = size();
        if (size <= 32) {
            return size;
        }
        return size - ((size - 1) & (-32));
    }

    public final int LJII() {
        return ((AbstractList) this).modCount;
    }

    @Override // X.ORP
    public final int getSize() {
        return this.LJLJLJ;
    }

    public final boolean LJIILLIIL(Object[] objArr) {
        if (objArr.length == 33 && objArr[32] == this.LJLJJL) {
            return true;
        }
        return false;
    }

    public final AbstractC37961eK LJIIZILJ(int i) {
        if (this.LJLJJLL != null) {
            int LJJJ = LJJJ() >> 5;
            C61879OQh.LIZIZ(i, LJJJ);
            int i2 = this.LJLJJI;
            if (i2 == 0) {
                Object[] objArr = this.LJLJJLL;
                o.LJI(objArr);
                return new ORK(i, objArr);
            }
            int i3 = i2 / 5;
            Object[] objArr2 = this.LJLJJLL;
            o.LJI(objArr2);
            return new ORH(i, LJJJ, i3, objArr2);
        }
        "Required value was null.".toString();
        throw new IllegalStateException("Required value was null.");
    }

    public final Object[] LJIJ(Object[] objArr) {
        if (objArr == null) {
            return LJIL();
        }
        if (LJIILLIIL(objArr)) {
            return objArr;
        }
        Object[] LJIL = LJIL();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        C61898ORa.LJIJJ(objArr, LJIL, 0, 0, length, 6);
        return LJIL;
    }

    public final Object[] LJJI(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.LJLJJL;
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e) {
        ((AbstractList) this).modCount++;
        int LJJJJJ = LJJJJJ();
        if (LJJJJJ < 32) {
            Object[] LJIJ = LJIJ(this.LJLJL);
            LJIJ[LJJJJJ] = e;
            this.LJLJL = LJIJ;
            this.LJLJLJ = size() + 1;
        } else {
            LJJIIZI(this.LJLJJLL, this.LJLJL, LJJI(e));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends E> elements) {
        o.LJIIIZ(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int LJJJJJ = LJJJJJ();
        Iterator<? extends E> it = elements.iterator();
        if (32 - LJJJJJ >= elements.size()) {
            Object[] LJIJ = LJIJ(this.LJLJL);
            LIZJ(LJIJ, LJJJJJ, it);
            this.LJLJL = LJIJ;
            this.LJLJLJ = elements.size() + size();
        } else {
            int size = ((elements.size() + LJJJJJ) - 1) / 32;
            Object[][] objArr = new Object[size];
            Object[] LJIJ2 = LJIJ(this.LJLJL);
            LIZJ(LJIJ2, LJJJJJ, it);
            objArr[0] = LJIJ2;
            for (int i = 1; i < size; i++) {
                Object[] LJIL = LJIL();
                LIZJ(LJIL, 0, it);
                objArr[i] = LJIL;
            }
            this.LJLJJLL = LJJIIZ(this.LJLJJLL, LJJJ(), objArr);
            Object[] LJIL2 = LJIL();
            LIZJ(LJIL2, 0, it);
            this.LJLJL = LJIL2;
            this.LJLJLJ = elements.size() + size();
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        Object[] objArr;
        C61879OQh.LIZ(i, size());
        if (LJJJ() <= i) {
            objArr = this.LJLJL;
        } else {
            objArr = this.LJLJJLL;
            o.LJI(objArr);
            for (int i2 = this.LJLJJI; i2 > 0; i2 -= 5) {
                Object obj = objArr[(i >> i2) & 31];
                if (obj != null) {
                    objArr = (Object[]) obj;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                }
            }
        }
        return (E) objArr[i & 31];
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<E> listIterator(int i) {
        C61879OQh.LIZIZ(i, size());
        return new ORG(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection<? extends Object> elements) {
        Object[] LJJIIJ;
        o.LJIIIZ(elements, "elements");
        AqS176S0100000_10 aqS176S0100000_10 = new AqS176S0100000_10((Collection) elements, 260);
        ORE<E> ore = this;
        int LJJJJJ = ore.LJJJJJ();
        Object[] objArr = null;
        ORF orf = new ORF(null);
        if (ore.LJLJJLL == null) {
            if (ore.LJJIJL(aqS176S0100000_10, LJJJJJ, orf) == LJJJJJ) {
                return false;
            }
        } else {
            AbstractC37961eK LJIIZILJ = ore.LJIIZILJ(0);
            while (true) {
                if (!LJIIZILJ.hasNext()) {
                    break;
                }
                int LJJIJIL = ore.LJJIJIL(aqS176S0100000_10, (Object[]) LJIIZILJ.next(), 32, orf);
                if (LJJIJIL != 32) {
                    if (LJJIJIL != 32) {
                        int previousIndex = LJIIZILJ.previousIndex() << 5;
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        while (LJIIZILJ.hasNext()) {
                            LJJIJIL = ore.LJJIJIIJI(aqS176S0100000_10, (Object[]) LJIIZILJ.next(), 32, LJJIJIL, orf, arrayList2, arrayList);
                        }
                        Object[] objArr2 = ore.LJLJL;
                        ore = ore;
                        int LJJIJIIJI = ore.LJJIJIIJI(aqS176S0100000_10, objArr2, LJJJJJ, LJJIJIL, orf, arrayList2, arrayList);
                        Object obj = orf.LIZ;
                        if (obj != null) {
                            Object[] objArr3 = (Object[]) obj;
                            Arrays.fill(objArr3, LJJIJIIJI, 32, (Object) null);
                            if (arrayList.isEmpty()) {
                                LJJIIJ = ore.LJLJJLL;
                                o.LJI(LJJIIJ);
                            } else {
                                LJJIIJ = ore.LJJIIJ(ore.LJLJJLL, previousIndex, ore.LJLJJI, arrayList.iterator());
                            }
                            int size = previousIndex + (arrayList.size() << 5);
                            if ((size & 31) == 0) {
                                if (size == 0) {
                                    ore.LJLJJI = 0;
                                } else {
                                    int i = size - 1;
                                    while (true) {
                                        int i2 = ore.LJLJJI;
                                        if ((i >> i2) == 0) {
                                            ore.LJLJJI = i2 - 5;
                                            Object[] objArr4 = LJJIIJ[0];
                                            if (objArr4 != null) {
                                                LJJIIJ = objArr4;
                                            } else {
                                                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                                            }
                                        } else {
                                            objArr = ore.LJJIFFI(i, i2, LJJIIJ);
                                            break;
                                        }
                                    }
                                }
                                ore.LJLJJLL = objArr;
                                ore.LJLJL = objArr3;
                                ore.LJLJLJ = size + LJJIJIIJI;
                            } else {
                                "Check failed.".toString();
                                throw new IllegalStateException("Check failed.");
                            }
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                        }
                    }
                }
            }
            int LJJIJL = ore.LJJIJL(aqS176S0100000_10, LJJJJJ, orf);
            if (LJJIJL == 0) {
                ore.LJJIII(ore.size(), ore.LJLJJI, ore.LJLJJLL);
            }
            if (LJJIJL == LJJJJJ) {
                return false;
            }
        }
        ((AbstractList) ore).modCount++;
        return true;
    }

    @Override // X.ORP
    public final E removeAt(int i) {
        C61879OQh.LIZ(i, size());
        ((AbstractList) this).modCount++;
        int LJJJ = LJJJ();
        if (i >= LJJJ) {
            return (E) LJJIZ(LJJJ, this.LJLJJI, i - LJJJ, this.LJLJJLL);
        }
        ORF orf = new ORF(this.LJLJL[0]);
        Object[] objArr = this.LJLJJLL;
        o.LJI(objArr);
        LJJIZ(LJJJ, this.LJLJJI, 0, LJJIJLIJ(objArr, this.LJLJJI, i, orf));
        return (E) orf.LIZ;
    }

    public final Object[] LJIJJLI(int i, Object[] objArr) {
        if (LJIILLIIL(objArr)) {
            C61898ORa.LJIIZILJ(i, 0, 32 - i, objArr, objArr);
            return objArr;
        }
        Object[] LJIL = LJIL();
        C61898ORa.LJIIZILJ(i, 0, 32 - i, objArr, LJIL);
        return LJIL;
    }

    @Override // X.ORP, java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        C61879OQh.LIZIZ(i, size());
        if (i == size()) {
            add(e);
            return;
        }
        ((AbstractList) this).modCount++;
        int LJJJ = LJJJ();
        if (i >= LJJJ) {
            LJIILJJIL(i - LJJJ, e, this.LJLJJLL);
            return;
        }
        ORF orf = new ORF(null);
        Object[] objArr = this.LJLJJLL;
        o.LJI(objArr);
        LJIILJJIL(0, orf.LIZ, LJIIIZ(objArr, this.LJLJJI, i, e, orf));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends E> elements) {
        Object[] LJIL;
        o.LJIIIZ(elements, "elements");
        C61879OQh.LIZIZ(i, size());
        if (i == size()) {
            return addAll(elements);
        }
        if (elements.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i2 = (i >> 5) << 5;
        int size = ((elements.size() + (size() - i2)) - 1) / 32;
        if (size == 0) {
            LJJJ();
            int i3 = i & 31;
            int size2 = ((elements.size() + i) - 1) & 31;
            Object[] objArr = this.LJLJL;
            Object[] LJIJ = LJIJ(objArr);
            C61898ORa.LJIIZILJ(size2 + 1, i3, LJJJJJ(), objArr, LJIJ);
            LIZJ(LJIJ, i3, elements.iterator());
            this.LJLJL = LJIJ;
            this.LJLJLJ = elements.size() + size();
            return true;
        }
        Object[][] objArr2 = new Object[size];
        int LJJJJJ = LJJJJJ();
        int size3 = elements.size() + size();
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i >= LJJJ()) {
            LJIL = LJIL();
            LJJJJI(elements, i, this.LJLJL, LJJJJJ, objArr2, size, LJIL);
        } else if (size3 > LJJJJJ) {
            int i4 = size3 - LJJJJJ;
            LJIL = LJIJJLI(i4, this.LJLJL);
            LJIIIIZZ(elements, i, i4, objArr2, size, LJIL);
        } else {
            Object[] objArr3 = this.LJLJL;
            LJIL = LJIL();
            int i5 = LJJJJJ - size3;
            C61898ORa.LJIIZILJ(0, i5, LJJJJJ, objArr3, LJIL);
            int i6 = 32 - i5;
            Object[] LJIJJLI = LJIJJLI(i6, this.LJLJL);
            int i7 = size - 1;
            objArr2[i7] = LJIJJLI;
            LJIIIIZZ(elements, i, i6, objArr2, i7, LJIJJLI);
        }
        this.LJLJJLL = LJJIIZ(this.LJLJJLL, i2, objArr2);
        this.LJLJL = LJIL;
        this.LJLJLJ = elements.size() + size();
        return true;
    }

    @Override // X.ORP, java.util.AbstractList, java.util.List
    public final E set(int i, E e) {
        C61879OQh.LIZ(i, size());
        if (LJJJ() <= i) {
            Object[] LJIJ = LJIJ(this.LJLJL);
            if (LJIJ != this.LJLJL) {
                ((AbstractList) this).modCount++;
            }
            int i2 = i & 31;
            E e2 = (E) LJIJ[i2];
            LJIJ[i2] = e;
            this.LJLJL = LJIJ;
            return e2;
        }
        ORF orf = new ORF(null);
        Object[] objArr = this.LJLJJLL;
        o.LJI(objArr);
        this.LJLJJLL = LJJJIL(objArr, this.LJLJJI, i, e, orf);
        return (E) orf.LIZ;
    }

    public final void LIZJ(Object[] objArr, int i, Iterator it) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    public final void LJIILJJIL(int i, Object obj, Object[] objArr) {
        int LJJJJJ = LJJJJJ();
        Object[] LJIJ = LJIJ(this.LJLJL);
        if (LJJJJJ < 32) {
            C61898ORa.LJIIZILJ(i + 1, i, LJJJJJ, this.LJLJL, LJIJ);
            LJIJ[i] = obj;
            this.LJLJJLL = objArr;
            this.LJLJL = LJIJ;
            this.LJLJLJ = size() + 1;
            return;
        }
        Object[] objArr2 = this.LJLJL;
        Object obj2 = objArr2[31];
        C61898ORa.LJIIZILJ(i + 1, i, 31, objArr2, LJIJ);
        LJIJ[i] = obj;
        LJJIIZI(objArr, LJIJ, LJJI(obj2));
    }

    public final Object[] LJJIFFI(int i, int i2, Object[] objArr) {
        if (i2 >= 0) {
            if (i2 == 0) {
                return objArr;
            }
            int i3 = (i >> i2) & 31;
            Object obj = objArr[i3];
            if (obj != null) {
                Object LJJIFFI = LJJIFFI(i, i2 - 5, (Object[]) obj);
                if (i3 < 31) {
                    int i4 = i3 + 1;
                    if (objArr[i4] != null) {
                        if (LJIILLIIL(objArr)) {
                            Arrays.fill(objArr, i4, 32, (Object) null);
                        }
                        Object[] LJIL = LJIL();
                        C61898ORa.LJIIZILJ(0, 0, i4, objArr, LJIL);
                        objArr = LJIL;
                    }
                }
                if (LJJIFFI != objArr[i3]) {
                    Object[] LJIJ = LJIJ(objArr);
                    LJIJ[i3] = LJJIFFI;
                    return LJIJ;
                }
                return objArr;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        }
        "Check failed.".toString();
        throw new IllegalStateException("Check failed.");
    }

    public final void LJJIII(int i, int i2, Object[] objArr) {
        if (i2 == 0) {
            this.LJLJJLL = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.LJLJL = objArr;
            this.LJLJLJ = i;
            this.LJLJJI = i2;
            return;
        }
        ORF orf = new ORF(null);
        o.LJI(objArr);
        Object[] LJJII = LJJII(objArr, i2, i, orf);
        o.LJI(LJJII);
        Object obj = orf.LIZ;
        if (obj != null) {
            this.LJLJL = (Object[]) obj;
            this.LJLJLJ = i;
            if (LJJII[1] == null) {
                this.LJLJJLL = (Object[]) LJJII[0];
                this.LJLJJI = i2 - 5;
                return;
            } else {
                this.LJLJJLL = LJJII;
                this.LJLJJI = i2;
                return;
            }
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
    }

    public final Object[] LJJIIZ(Object[] objArr, int i, Object[][] objArr2) {
        Object[] LJIJ;
        C38489F8r LJJIIJZLJL = C30581Hy.LJJIIJZLJL(objArr2);
        int i2 = i >> 5;
        int i3 = this.LJLJJI;
        if (i2 < (1 << i3)) {
            LJIJ = LJJIIJ(objArr, i, i3, LJJIIJZLJL);
        } else {
            LJIJ = LJIJ(objArr);
        }
        while (LJJIIJZLJL.hasNext()) {
            this.LJLJJI += 5;
            LJIJ = LJJI(LJIJ);
            int i4 = this.LJLJJI;
            LJJIIJ(LJIJ, 1 << i4, i4, LJJIIJZLJL);
        }
        return LJIJ;
    }

    public final void LJJIIZI(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = size() >> 5;
        int i = this.LJLJJI;
        if (size > (1 << i)) {
            this.LJLJJLL = LJJIJ(this.LJLJJI + 5, LJJI(objArr), objArr2);
            this.LJLJL = objArr3;
            this.LJLJJI += 5;
            this.LJLJLJ = size() + 1;
            return;
        }
        if (objArr == null) {
            this.LJLJJLL = objArr2;
            this.LJLJL = objArr3;
            this.LJLJLJ = size() + 1;
        } else {
            this.LJLJJLL = LJJIJ(i, objArr, objArr2);
            this.LJLJL = objArr3;
            this.LJLJLJ = size() + 1;
        }
    }

    public final Object[] LJJIJ(int i, Object[] objArr, Object[] objArr2) {
        int size = ((size() - 1) >> i) & 31;
        Object[] LJIJ = LJIJ(objArr);
        if (i == 5) {
            LJIJ[size] = objArr2;
        } else {
            LJIJ[size] = LJJIJ(i - 5, (Object[]) LJIJ[size], objArr2);
        }
        return LJIJ;
    }

    public final int LJJIJL(AqS176S0100000_10 aqS176S0100000_10, int i, ORF orf) {
        int LJJIJIL = LJJIJIL(aqS176S0100000_10, this.LJLJL, i, orf);
        if (LJJIJIL == i) {
            return i;
        }
        Object obj = orf.LIZ;
        if (obj != null) {
            Object[] objArr = (Object[]) obj;
            Arrays.fill(objArr, LJJIJIL, i, (Object) null);
            this.LJLJL = objArr;
            this.LJLJLJ = size() - (i - LJJIJIL);
            return LJJIJIL;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
    }

    public ORE(OJQ<? extends E> vector, Object[] objArr, Object[] vectorTail, int i) {
        o.LJIIIZ(vector, "vector");
        o.LJIIIZ(vectorTail, "vectorTail");
        this.LJLIL = vector;
        this.LJLILLLLZI = objArr;
        this.LJLJI = vectorTail;
        this.LJLJJI = i;
        this.LJLJJL = new C26150AOc(0);
        this.LJLJJLL = objArr;
        this.LJLJL = vectorTail;
        this.LJLJLJ = vector.size();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001c, code lost:
    
        if (r1 == null) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object[] LJJII(java.lang.Object[] r5, int r6, int r7, X.ORF r8) {
        /*
            r4 = this;
            int r0 = r7 + (-1)
            int r0 = r0 >> r6
            r3 = r0 & 31
            r2 = 0
            r1 = 5
            if (r6 != r1) goto L11
            r0 = r5[r3]
            r8.LIZ = r0
            r1 = r2
        Le:
            if (r3 != 0) goto L1f
            return r2
        L11:
            r0 = r5[r3]
            if (r0 == 0) goto L26
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            int r6 = r6 - r1
            java.lang.Object[] r1 = r4.LJJII(r0, r6, r7, r8)
            if (r1 != 0) goto L1f
            goto Le
        L1f:
            java.lang.Object[] r0 = r4.LJIJ(r5)
            r0[r3] = r1
            return r0
        L26:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ORE.LJJII(java.lang.Object[], int, int, X.ORF):java.lang.Object[]");
    }

    public final Object[] LJJIIJ(Object[] objArr, int i, int i2, Iterator<Object[]> it) {
        if (it.hasNext()) {
            if (i2 >= 0) {
                if (i2 == 0) {
                    return it.next();
                }
                Object[] LJIJ = LJIJ(objArr);
                int i3 = (i >> i2) & 31;
                int i4 = i2 - 5;
                LJIJ[i3] = LJJIIJ((Object[]) LJIJ[i3], i, i4, it);
                while (true) {
                    i3++;
                    if (i3 >= 32 || !it.hasNext()) {
                        break;
                    }
                    LJIJ[i3] = LJJIIJ((Object[]) LJIJ[i3], 0, i4, it);
                }
                return LJIJ;
            }
            "Check failed.".toString();
            throw new IllegalStateException("Check failed.");
        }
        "Check failed.".toString();
        throw new IllegalStateException("Check failed.");
    }

    public final int LJJIJIL(AqS176S0100000_10 aqS176S0100000_10, Object[] objArr, int i, ORF orf) {
        int i2 = 0;
        Object[] objArr2 = objArr;
        int i3 = i;
        boolean z = false;
        while (i2 < i) {
            int i4 = i2 + 1;
            Object obj = objArr[i2];
            if (((Boolean) aqS176S0100000_10.invoke(obj)).booleanValue()) {
                if (!z) {
                    objArr2 = LJIJ(objArr);
                    z = true;
                    i3 = i2;
                    i2 = i4;
                } else {
                    i2 = i4;
                }
            } else if (!z) {
                i2 = i4;
            } else {
                i2 = i3 + 1;
                objArr2[i3] = obj;
                i3 = i2;
                i2 = i4;
            }
        }
        orf.LIZ = objArr2;
        return i3;
    }

    public final Object[] LJJIJLIJ(Object[] objArr, int i, int i2, ORF orf) {
        int i3 = 31;
        int i4 = (i2 >> i) & 31;
        if (i == 0) {
            Object obj = objArr[i4];
            Object[] LJIJ = LJIJ(objArr);
            C61898ORa.LJIIZILJ(i4, i4 + 1, 32, objArr, LJIJ);
            LJIJ[31] = orf.LIZ;
            orf.LIZ = obj;
            return LJIJ;
        }
        if (objArr[31] == null) {
            i3 = 31 & ((LJJJ() - 1) >> i);
        }
        Object[] LJIJ2 = LJIJ(objArr);
        int i5 = i - 5;
        int i6 = i4 + 1;
        if (i6 <= i3) {
            while (true) {
                int i7 = i3 - 1;
                Object obj2 = LJIJ2[i3];
                if (obj2 != null) {
                    LJIJ2[i3] = LJJIJLIJ((Object[]) obj2, i5, 0, orf);
                    if (i3 == i6) {
                        break;
                    }
                    i3 = i7;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                }
            }
        }
        Object obj3 = LJIJ2[i4];
        if (obj3 != null) {
            LJIJ2[i4] = LJJIJLIJ((Object[]) obj3, i5, i2, orf);
            return LJIJ2;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
    }

    public final Object LJJIZ(int i, int i2, int i3, Object[] objArr) {
        int size = size() - i;
        if (size == 1) {
            Object obj = this.LJLJL[0];
            LJJIII(i, i2, objArr);
            return obj;
        }
        Object[] objArr2 = this.LJLJL;
        Object obj2 = objArr2[i3];
        Object[] LJIJ = LJIJ(objArr2);
        C61898ORa.LJIIZILJ(i3, i3 + 1, size, objArr2, LJIJ);
        LJIJ[size - 1] = null;
        this.LJLJJLL = objArr;
        this.LJLJL = LJIJ;
        this.LJLJLJ = (i + size) - 1;
        this.LJLJJI = i2;
        return obj2;
    }

    public final Object[] LJIIIZ(Object[] objArr, int i, int i2, Object obj, ORF orf) {
        int i3 = (i2 >> i) & 31;
        if (i == 0) {
            orf.LIZ = objArr[31];
            Object[] LJIJ = LJIJ(objArr);
            C61898ORa.LJIIZILJ(i3 + 1, i3, 31, objArr, LJIJ);
            LJIJ[i3] = obj;
            return LJIJ;
        }
        Object[] LJIJ2 = LJIJ(objArr);
        int i4 = i - 5;
        Object obj2 = LJIJ2[i3];
        if (obj2 != null) {
            LJIJ2[i3] = LJIIIZ((Object[]) obj2, i4, i2, obj, orf);
            int i5 = i3 + 1;
            while (i5 < 32) {
                int i6 = i5 + 1;
                Object obj3 = LJIJ2[i5];
                if (obj3 == null) {
                    break;
                }
                LJIJ2[i5] = LJIIIZ((Object[]) obj3, i4, 0, orf.LIZ, orf);
                i5 = i6;
            }
            return LJIJ2;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
    }

    public final Object[] LJJJIL(Object[] objArr, int i, int i2, E e, ORF orf) {
        int i3 = (i2 >> i) & 31;
        Object[] LJIJ = LJIJ(objArr);
        if (i == 0) {
            if (LJIJ != objArr) {
                ((AbstractList) this).modCount++;
            }
            orf.LIZ = LJIJ[i3];
            LJIJ[i3] = e;
            return LJIJ;
        }
        Object obj = LJIJ[i3];
        if (obj != null) {
            LJIJ[i3] = LJJJIL((Object[]) obj, i - 5, i2, e, orf);
            return LJIJ;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
    }

    public final void LJIIIIZZ(Collection<? extends E> collection, int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        Object[] objArr3 = objArr2;
        if (this.LJLJJLL != null) {
            int i4 = i >> 5;
            AbstractC37961eK LJIIZILJ = LJIIZILJ(LJJJ() >> 5);
            int i5 = i3;
            Object[] objArr4 = objArr3;
            while (LJIIZILJ.previousIndex() != i4) {
                Object[] objArr5 = (Object[]) LJIIZILJ.previous();
                C61898ORa.LJIIZILJ(0, 32 - i2, 32, objArr5, objArr4);
                objArr4 = LJIJJLI(i2, objArr5);
                i5--;
                objArr[i5] = objArr4;
            }
            Object[] objArr6 = (Object[]) LJIIZILJ.previous();
            int LJJJ = i3 - (((LJJJ() >> 5) - 1) - i4);
            if (LJJJ < i3) {
                objArr3 = objArr[LJJJ];
                o.LJI(objArr3);
            }
            LJJJJI(collection, i, objArr6, 32, objArr, LJJJ, objArr3);
            return;
        }
        "Required value was null.".toString();
        throw new IllegalStateException("Required value was null.");
    }

    public final int LJJIJIIJI(AqS176S0100000_10 aqS176S0100000_10, Object[] objArr, int i, int i2, ORF orf, List list, List list2) {
        if (LJIILLIIL(objArr)) {
            ((ArrayList) list).add(objArr);
        }
        Object obj = orf.LIZ;
        if (obj != null) {
            Object[] objArr2 = (Object[]) obj;
            Object[] objArr3 = objArr2;
            int i3 = 0;
            while (i3 < i) {
                int i4 = i3 + 1;
                Object obj2 = objArr[i3];
                if (!((Boolean) aqS176S0100000_10.invoke(obj2)).booleanValue()) {
                    if (i2 == 32) {
                        ArrayList arrayList = (ArrayList) list;
                        if (!arrayList.isEmpty()) {
                            objArr3 = (Object[]) ListProtector.remove(list, arrayList.size() - 1);
                        } else {
                            objArr3 = LJIL();
                        }
                        i2 = 0;
                    }
                    objArr3[i2] = obj2;
                    i3 = i4;
                    i2++;
                } else {
                    i3 = i4;
                }
            }
            orf.LIZ = objArr3;
            if (objArr2 != objArr3) {
                ((ArrayList) list2).add(objArr2);
            }
            return i2;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
    }

    public final void LJJJJI(Collection<? extends E> collection, int i, Object[] objArr, int i2, Object[][] objArr2, int i3, Object[] objArr3) {
        Object[] LJIL;
        if (i3 >= 1) {
            Object[] LJIJ = LJIJ(objArr);
            objArr2[0] = LJIJ;
            int i4 = i & 31;
            int size = ((collection.size() + i) - 1) & 31;
            int i5 = (i2 - i4) + size;
            if (i5 < 32) {
                C61898ORa.LJIIZILJ(size + 1, i4, i2, LJIJ, objArr3);
            } else {
                int i6 = (i5 - 32) + 1;
                if (i3 == 1) {
                    LJIL = LJIJ;
                } else {
                    LJIL = LJIL();
                    i3--;
                    objArr2[i3] = LJIL;
                }
                int i7 = i2 - i6;
                C61898ORa.LJIIZILJ(0, i7, i2, LJIJ, objArr3);
                C61898ORa.LJIIZILJ(size + 1, i4, i7, LJIJ, LJIL);
                objArr3 = LJIL;
            }
            Iterator<? extends E> it = collection.iterator();
            LIZJ(LJIJ, i4, it);
            for (int i8 = 1; i8 < i3; i8++) {
                Object[] LJIL2 = LJIL();
                LIZJ(LJIL2, 0, it);
                objArr2[i8] = LJIL2;
            }
            LIZJ(objArr3, 0, it);
            return;
        }
        "Check failed.".toString();
        throw new IllegalStateException("Check failed.");
    }
}
