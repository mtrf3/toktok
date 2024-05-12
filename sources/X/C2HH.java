package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.2HH, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2HH<E> extends ORP<E> implements Collection, ORN {
    public InterfaceC44221oQ<? extends E> LJLIL;
    public Object[] LJLILLLLZI;
    public Object[] LJLJI;
    public int LJLJJI;
    public C17P LJLJJL;
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

    public final InterfaceC44221oQ<E> LIZJ() {
        C2HG c2hg;
        Object[] objArr = this.LJLJJLL;
        if (objArr == this.LJLILLLLZI && this.LJLJL == this.LJLJI) {
            c2hg = this.LJLIL;
        } else {
            this.LJLJJL = new C17P();
            this.LJLILLLLZI = objArr;
            Object[] objArr2 = this.LJLJL;
            this.LJLJI = objArr2;
            if (objArr == null) {
                if (objArr2.length == 0) {
                    c2hg = C2HI.LJLJI;
                } else {
                    Object[] copyOf = Arrays.copyOf(this.LJLJL, size());
                    o.LJIIIIZZ(copyOf, "copyOf(this, newSize)");
                    c2hg = new C2HI(copyOf);
                }
            } else {
                Object[] objArr3 = this.LJLJJLL;
                o.LJI(objArr3);
                c2hg = new C2HG(size(), this.LJLJJI, objArr3, this.LJLJL);
            }
        }
        this.LJLIL = c2hg;
        return (InterfaceC44221oQ<E>) c2hg;
    }

    public final Object[] LJJI() {
        Object[] objArr = new Object[33];
        objArr[32] = this.LJLJJL;
        return objArr;
    }

    public final int LJJJJI() {
        if (size() <= 32) {
            return 0;
        }
        return (size() - 1) & (-32);
    }

    public final int LJJJJLI() {
        int size = size();
        if (size <= 32) {
            return size;
        }
        return size - ((size - 1) & (-32));
    }

    public final int LJIIIIZZ() {
        return ((AbstractList) this).modCount;
    }

    @Override // X.ORP
    public final int getSize() {
        return this.LJLJLJ;
    }

    public final boolean LJIIZILJ(Object[] objArr) {
        if (objArr.length == 33 && objArr[32] == this.LJLJJL) {
            return true;
        }
        return false;
    }

    public final AbstractC37961eK LJIJ(final int i) {
        if (this.LJLJJLL != null) {
            int LJJJJI = LJJJJI() >> 5;
            C00B.LIZIZ(i, LJJJJI);
            int i2 = this.LJLJJI;
            if (i2 == 0) {
                final Object[] objArr = this.LJLJJLL;
                o.LJI(objArr);
                return new AbstractC37961eK(i, objArr) { // from class: X.1oi
                    public final E LJLJJI;

                    @Override // java.util.ListIterator, java.util.Iterator
                    public final E next() {
                        if (hasNext()) {
                            this.LJLILLLLZI++;
                            return this.LJLJJI;
                        }
                        throw new NoSuchElementException();
                    }

                    @Override // java.util.ListIterator
                    public final E previous() {
                        if (hasPrevious()) {
                            this.LJLILLLLZI--;
                            return this.LJLJJI;
                        }
                        throw new NoSuchElementException();
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        this.LJLJJI = objArr;
                    }
                };
            }
            int i3 = i2 / 5;
            Object[] objArr2 = this.LJLJJLL;
            o.LJI(objArr2);
            return new C44411oj(i, LJJJJI, i3, objArr2);
        }
        "Required value was null.".toString();
        throw new IllegalStateException("Required value was null.");
    }

    public final Object[] LJIJJLI(Object[] objArr) {
        if (objArr == null) {
            return LJJI();
        }
        if (LJIIZILJ(objArr)) {
            return objArr;
        }
        Object[] LJJI = LJJI();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        C61898ORa.LJIJJ(objArr, LJJI, 0, 0, length, 6);
        return LJJI;
    }

    public final Object[] LJJIFFI(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.LJLJJL;
        return objArr;
    }

    public final boolean LJJIZ(InterfaceC88472Yns<? super E, Boolean> interfaceC88472Yns) {
        Object[] LJJIIZ;
        int i;
        C2HH c2hh = this;
        int LJJJJLI = c2hh.LJJJJLI();
        Object[] objArr = null;
        C13I c13i = new C13I(objArr);
        if (c2hh.LJLJJLL == null) {
            if (c2hh.LJJIJLIJ(interfaceC88472Yns, LJJJJLI, c13i) == LJJJJLI) {
                return false;
            }
        } else {
            AbstractC37961eK LJIJ = c2hh.LJIJ(0);
            while (true) {
                if (!LJIJ.hasNext()) {
                    break;
                }
                int LJJIJL = c2hh.LJJIJL(interfaceC88472Yns, (Object[]) LJIJ.next(), 32, c13i);
                if (LJJIJL != 32) {
                    if (LJJIJL != 32) {
                        int previousIndex = LJIJ.previousIndex() << 5;
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        while (LJIJ.hasNext()) {
                            LJJIJL = c2hh.LJJIJIL(interfaceC88472Yns, (Object[]) LJIJ.next(), 32, LJJIJL, c13i, arrayList2, arrayList);
                        }
                        Object[] objArr2 = c2hh.LJLJL;
                        c2hh = c2hh;
                        int LJJIJIL = c2hh.LJJIJIL(interfaceC88472Yns, objArr2, LJJJJLI, LJJIJL, c13i, arrayList2, arrayList);
                        Object obj = c13i.LIZ;
                        o.LJII(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                        Object[] objArr3 = (Object[]) obj;
                        Arrays.fill(objArr3, LJJIJIL, 32, (Object) null);
                        if (arrayList.isEmpty()) {
                            LJJIIZ = c2hh.LJLJJLL;
                            o.LJI(LJJIIZ);
                        } else {
                            LJJIIZ = c2hh.LJJIIZ(c2hh.LJLJJLL, previousIndex, c2hh.LJLJJI, arrayList.iterator());
                        }
                        int size = previousIndex + (arrayList.size() << 5);
                        if ((size & 31) == 0) {
                            if (size == 0) {
                                c2hh.LJLJJI = 0;
                            } else {
                                int i2 = size - 1;
                                while (true) {
                                    i = c2hh.LJLJJI;
                                    if ((i2 >> i) != 0) {
                                        break;
                                    }
                                    c2hh.LJLJJI = i - 5;
                                    Object[] objArr4 = LJJIIZ[0];
                                    o.LJII(objArr4, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                                    LJJIIZ = objArr4;
                                }
                                objArr = c2hh.LJJII(i2, i, LJJIIZ);
                            }
                            c2hh.LJLJJLL = objArr;
                            c2hh.LJLJL = objArr3;
                            c2hh.LJLJLJ = size + LJJIJIL;
                        } else {
                            "Check failed.".toString();
                            throw new IllegalStateException("Check failed.");
                        }
                    }
                }
            }
            int LJJIJLIJ = c2hh.LJJIJLIJ(interfaceC88472Yns, LJJJJLI, c13i);
            if (LJJIJLIJ == 0) {
                c2hh.LJJIIJ(c2hh.size(), c2hh.LJLJJI, c2hh.LJLJJLL);
            }
            if (LJJIJLIJ == LJJJJLI) {
                return false;
            }
        }
        ((AbstractList) c2hh).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e) {
        ((AbstractList) this).modCount++;
        int LJJJJLI = LJJJJLI();
        if (LJJJJLI < 32) {
            Object[] LJIJJLI = LJIJJLI(this.LJLJL);
            LJIJJLI[LJJJJLI] = e;
            this.LJLJL = LJIJJLI;
            this.LJLJLJ = size() + 1;
        } else {
            LJJIJ(this.LJLJJLL, this.LJLJL, LJJIFFI(e));
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
        int LJJJJLI = LJJJJLI();
        Iterator<? extends E> it = elements.iterator();
        if (32 - LJJJJLI >= elements.size()) {
            Object[] LJIJJLI = LJIJJLI(this.LJLJL);
            LJII(LJIJJLI, LJJJJLI, it);
            this.LJLJL = LJIJJLI;
            this.LJLJLJ = elements.size() + size();
        } else {
            int size = ((elements.size() + LJJJJLI) - 1) / 32;
            Object[][] objArr = new Object[size];
            Object[] LJIJJLI2 = LJIJJLI(this.LJLJL);
            LJII(LJIJJLI2, LJJJJLI, it);
            objArr[0] = LJIJJLI2;
            for (int i = 1; i < size; i++) {
                Object[] LJJI = LJJI();
                LJII(LJJI, 0, it);
                objArr[i] = LJJI;
            }
            this.LJLJJLL = LJJIIZI(this.LJLJJLL, LJJJJI(), objArr);
            Object[] LJJI2 = LJJI();
            LJII(LJJI2, 0, it);
            this.LJLJL = LJJI2;
            this.LJLJLJ = elements.size() + size();
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        Object[] objArr;
        C00B.LIZ(i, size());
        if (LJJJJI() <= i) {
            objArr = this.LJLJL;
        } else {
            objArr = this.LJLJJLL;
            o.LJI(objArr);
            for (int i2 = this.LJLJJI; i2 > 0; i2 -= 5) {
                Object obj = objArr[(i >> i2) & 31];
                o.LJII(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr = (Object[]) obj;
            }
        }
        return (E) objArr[i & 31];
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<E> listIterator(final int i) {
        C00B.LIZIZ(i, size());
        return new AbstractC37961eK(this, i) { // from class: X.1oh
            public final C2HH<T> LJLJJI;
            public int LJLJJL;
            public C44411oj<? extends T> LJLJJLL;
            public int LJLJL;

            public final void LIZ() {
                if (this.LJLJJL == this.LJLJJI.LJIIIIZZ()) {
                } else {
                    throw new ConcurrentModificationException();
                }
            }

            /* JADX WARN: Type inference failed for: r0v10 */
            /* JADX WARN: Type inference failed for: r0v8 */
            /* JADX WARN: Type inference failed for: r0v9, types: [int, boolean] */
            public final void LIZIZ() {
                Object[] objArr = this.LJLJJI.LJLJJLL;
                if (objArr == null) {
                    this.LJLJJLL = null;
                    return;
                }
                int size = (r0.size() - 1) & (-32);
                int i2 = this.LJLILLLLZI;
                if (i2 > size) {
                    i2 = size;
                }
                int i3 = (this.LJLJJI.LJLJJI / 5) + 1;
                C44411oj<? extends T> c44411oj = this.LJLJJLL;
                if (c44411oj == null) {
                    this.LJLJJLL = new C44411oj<>(i2, size, i3, objArr);
                    return;
                }
                o.LJI(c44411oj);
                c44411oj.LJLILLLLZI = i2;
                c44411oj.LJLJI = size;
                c44411oj.LJLJJI = i3;
                if (c44411oj.LJLJJL.length < i3) {
                    c44411oj.LJLJJL = new Object[i3];
                }
                ?? r0 = 0;
                c44411oj.LJLJJL[0] = objArr;
                if (i2 == size) {
                    r0 = 1;
                }
                c44411oj.LJLJJLL = r0;
                c44411oj.LIZIZ(i2 - r0, 1);
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public final T next() {
                LIZ();
                if (hasNext()) {
                    int i2 = this.LJLILLLLZI;
                    this.LJLJL = i2;
                    C44411oj<? extends T> c44411oj = this.LJLJJLL;
                    if (c44411oj == null) {
                        Object[] objArr = this.LJLJJI.LJLJL;
                        this.LJLILLLLZI = i2 + 1;
                        return (T) objArr[i2];
                    }
                    if (c44411oj.hasNext()) {
                        this.LJLILLLLZI++;
                        return c44411oj.next();
                    }
                    Object[] objArr2 = this.LJLJJI.LJLJL;
                    int i3 = this.LJLILLLLZI;
                    this.LJLILLLLZI = i3 + 1;
                    return (T) objArr2[i3 - c44411oj.LJLJI];
                }
                throw new NoSuchElementException();
            }

            @Override // java.util.ListIterator
            public final T previous() {
                LIZ();
                if (hasPrevious()) {
                    int i2 = this.LJLILLLLZI;
                    int i3 = i2 - 1;
                    this.LJLJL = i3;
                    C44411oj<? extends T> c44411oj = this.LJLJJLL;
                    if (c44411oj == null) {
                        Object[] objArr = this.LJLJJI.LJLJL;
                        this.LJLILLLLZI = i3;
                        return (T) objArr[i3];
                    }
                    int i4 = c44411oj.LJLJI;
                    if (i2 > i4) {
                        Object[] objArr2 = this.LJLJJI.LJLJL;
                        this.LJLILLLLZI = i3;
                        return (T) objArr2[i3 - i4];
                    }
                    this.LJLILLLLZI = i3;
                    return c44411oj.previous();
                }
                throw new NoSuchElementException();
            }

            @Override // X.AbstractC37961eK, java.util.ListIterator, java.util.Iterator
            public final void remove() {
                LIZ();
                int i2 = this.LJLJL;
                if (i2 != -1) {
                    this.LJLJJI.remove(i2);
                    int i3 = this.LJLJL;
                    if (i3 < this.LJLILLLLZI) {
                        this.LJLILLLLZI = i3;
                    }
                    this.LJLJI = this.LJLJJI.size();
                    this.LJLJJL = this.LJLJJI.LJIIIIZZ();
                    this.LJLJL = -1;
                    LIZIZ();
                    return;
                }
                throw new IllegalStateException();
            }

            @Override // X.AbstractC37961eK, java.util.ListIterator
            public final void add(T t) {
                LIZ();
                this.LJLJJI.add(this.LJLILLLLZI, t);
                this.LJLILLLLZI++;
                this.LJLJI = this.LJLJJI.size();
                this.LJLJJL = this.LJLJJI.LJIIIIZZ();
                this.LJLJL = -1;
                LIZIZ();
            }

            @Override // X.AbstractC37961eK, java.util.ListIterator
            public final void set(T t) {
                LIZ();
                int i2 = this.LJLJL;
                if (i2 != -1) {
                    this.LJLJJI.set(i2, t);
                    this.LJLJJL = this.LJLJJI.LJIIIIZZ();
                    LIZIZ();
                    return;
                }
                throw new IllegalStateException();
            }

            {
                o.LJIIIZ(this, "builder");
                int size = this.size();
                this.LJLJJI = this;
                this.LJLJJL = this.LJIIIIZZ();
                this.LJLJL = -1;
                LIZIZ();
            }
        };
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection<? extends Object> elements) {
        o.LJIIIZ(elements, "elements");
        return LJJIZ(new IDqS416S0100000(elements, 362));
    }

    @Override // X.ORP
    public final E removeAt(int i) {
        C00B.LIZ(i, size());
        ((AbstractList) this).modCount++;
        int LJJJJI = LJJJJI();
        if (i >= LJJJJI) {
            return (E) LJJJIL(LJJJJI, this.LJLJJI, i - LJJJJI, this.LJLJJLL);
        }
        C13I c13i = new C13I(this.LJLJL[0]);
        Object[] objArr = this.LJLJJLL;
        o.LJI(objArr);
        LJJJIL(LJJJJI, this.LJLJJI, 0, LJJJ(objArr, this.LJLJJI, i, c13i));
        return (E) c13i.LIZ;
    }

    public final Object[] LJIL(int i, Object[] objArr) {
        if (LJIIZILJ(objArr)) {
            C61898ORa.LJIIZILJ(i, 0, 32 - i, objArr, objArr);
            return objArr;
        }
        Object[] LJJI = LJJI();
        C61898ORa.LJIIZILJ(i, 0, 32 - i, objArr, LJJI);
        return LJJI;
    }

    @Override // X.ORP, java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        C00B.LIZIZ(i, size());
        if (i == size()) {
            add(e);
            return;
        }
        ((AbstractList) this).modCount++;
        int LJJJJI = LJJJJI();
        if (i >= LJJJJI) {
            LJIILLIIL(i - LJJJJI, e, this.LJLJJLL);
            return;
        }
        C13I c13i = new C13I((Object) null);
        Object[] objArr = this.LJLJJLL;
        o.LJI(objArr);
        LJIILLIIL(0, c13i.LIZ, LJIILJJIL(objArr, this.LJLJJI, i, e, c13i));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends E> elements) {
        Object[] LJJI;
        o.LJIIIZ(elements, "elements");
        C00B.LIZIZ(i, size());
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
            LJJJJI();
            int i3 = i & 31;
            int size2 = ((elements.size() + i) - 1) & 31;
            Object[] objArr = this.LJLJL;
            Object[] LJIJJLI = LJIJJLI(objArr);
            C61898ORa.LJIIZILJ(size2 + 1, i3, LJJJJLI(), objArr, LJIJJLI);
            LJII(LJIJJLI, i3, elements.iterator());
            this.LJLJL = LJIJJLI;
            this.LJLJLJ = elements.size() + size();
            return true;
        }
        Object[][] objArr2 = new Object[size];
        int LJJJJLI = LJJJJLI();
        int size3 = elements.size() + size();
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i >= LJJJJI()) {
            LJJI = LJJI();
            LJJJJL(elements, i, this.LJLJL, LJJJJLI, objArr2, size, LJJI);
        } else if (size3 > LJJJJLI) {
            int i4 = size3 - LJJJJLI;
            LJJI = LJIL(i4, this.LJLJL);
            LJIIIZ(elements, i, i4, objArr2, size, LJJI);
        } else {
            Object[] objArr3 = this.LJLJL;
            LJJI = LJJI();
            int i5 = LJJJJLI - size3;
            C61898ORa.LJIIZILJ(0, i5, LJJJJLI, objArr3, LJJI);
            int i6 = 32 - i5;
            Object[] LJIL = LJIL(i6, this.LJLJL);
            int i7 = size - 1;
            objArr2[i7] = LJIL;
            LJIIIZ(elements, i, i6, objArr2, i7, LJIL);
        }
        this.LJLJJLL = LJJIIZI(this.LJLJJLL, i2, objArr2);
        this.LJLJL = LJJI;
        this.LJLJLJ = elements.size() + size();
        return true;
    }

    @Override // X.ORP, java.util.AbstractList, java.util.List
    public final E set(int i, E e) {
        C00B.LIZ(i, size());
        if (LJJJJI() <= i) {
            Object[] LJIJJLI = LJIJJLI(this.LJLJL);
            if (LJIJJLI != this.LJLJL) {
                ((AbstractList) this).modCount++;
            }
            int i2 = i & 31;
            E e2 = (E) LJIJJLI[i2];
            LJIJJLI[i2] = e;
            this.LJLJL = LJIJJLI;
            return e2;
        }
        C13I c13i = new C13I((Object) null);
        Object[] objArr = this.LJLJJLL;
        o.LJI(objArr);
        this.LJLJJLL = LJJJJJ(objArr, this.LJLJJI, i, e, c13i);
        return (E) c13i.LIZ;
    }

    public final void LJII(Object[] objArr, int i, Iterator it) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    public final void LJIILLIIL(int i, Object obj, Object[] objArr) {
        int LJJJJLI = LJJJJLI();
        Object[] LJIJJLI = LJIJJLI(this.LJLJL);
        if (LJJJJLI < 32) {
            C61898ORa.LJIIZILJ(i + 1, i, LJJJJLI, this.LJLJL, LJIJJLI);
            LJIJJLI[i] = obj;
            this.LJLJJLL = objArr;
            this.LJLJL = LJIJJLI;
            this.LJLJLJ = size() + 1;
            return;
        }
        Object[] objArr2 = this.LJLJL;
        Object obj2 = objArr2[31];
        C61898ORa.LJIIZILJ(i + 1, i, 31, objArr2, LJIJJLI);
        LJIJJLI[i] = obj;
        LJJIJ(objArr, LJIJJLI, LJJIFFI(obj2));
    }

    public final Object[] LJJII(int i, int i2, Object[] objArr) {
        if (i2 >= 0) {
            if (i2 == 0) {
                return objArr;
            }
            int i3 = (i >> i2) & 31;
            Object obj = objArr[i3];
            o.LJII(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            Object LJJII = LJJII(i, i2 - 5, (Object[]) obj);
            if (i3 < 31) {
                int i4 = i3 + 1;
                if (objArr[i4] != null) {
                    if (LJIIZILJ(objArr)) {
                        Arrays.fill(objArr, i4, 32, (Object) null);
                    }
                    Object[] LJJI = LJJI();
                    C61898ORa.LJIIZILJ(0, 0, i4, objArr, LJJI);
                    objArr = LJJI;
                }
            }
            if (LJJII != objArr[i3]) {
                Object[] LJIJJLI = LJIJJLI(objArr);
                LJIJJLI[i3] = LJJII;
                return LJIJJLI;
            }
            return objArr;
        }
        "Check failed.".toString();
        throw new IllegalStateException("Check failed.");
    }

    public final void LJJIIJ(int i, int i2, Object[] objArr) {
        Object obj = null;
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
        C13I c13i = new C13I(obj);
        o.LJI(objArr);
        Object[] LJJIII = LJJIII(objArr, i2, i, c13i);
        o.LJI(LJJIII);
        Object obj2 = c13i.LIZ;
        o.LJII(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        this.LJLJL = (Object[]) obj2;
        this.LJLJLJ = i;
        if (LJJIII[1] == null) {
            this.LJLJJLL = (Object[]) LJJIII[0];
            this.LJLJJI = i2 - 5;
        } else {
            this.LJLJJLL = LJJIII;
            this.LJLJJI = i2;
        }
    }

    public final Object[] LJJIIZI(Object[] objArr, int i, Object[][] objArr2) {
        Object[] LJIJJLI;
        C38489F8r LJJIIJZLJL = C30581Hy.LJJIIJZLJL(objArr2);
        int i2 = i >> 5;
        int i3 = this.LJLJJI;
        if (i2 < (1 << i3)) {
            LJIJJLI = LJJIIZ(objArr, i, i3, LJJIIJZLJL);
        } else {
            LJIJJLI = LJIJJLI(objArr);
        }
        while (LJJIIJZLJL.hasNext()) {
            this.LJLJJI += 5;
            LJIJJLI = LJJIFFI(LJIJJLI);
            int i4 = this.LJLJJI;
            LJJIIZ(LJIJJLI, 1 << i4, i4, LJJIIJZLJL);
        }
        return LJIJJLI;
    }

    public final void LJJIJ(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = size() >> 5;
        int i = this.LJLJJI;
        if (size > (1 << i)) {
            this.LJLJJLL = LJJIJIIJI(this.LJLJJI + 5, LJJIFFI(objArr), objArr2);
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
            this.LJLJJLL = LJJIJIIJI(i, objArr, objArr2);
            this.LJLJL = objArr3;
            this.LJLJLJ = size() + 1;
        }
    }

    public final Object[] LJJIJIIJI(int i, Object[] objArr, Object[] objArr2) {
        int size = ((size() - 1) >> i) & 31;
        Object[] LJIJJLI = LJIJJLI(objArr);
        if (i == 5) {
            LJIJJLI[size] = objArr2;
        } else {
            LJIJJLI[size] = LJJIJIIJI(i - 5, (Object[]) LJIJJLI[size], objArr2);
        }
        return LJIJJLI;
    }

    public final int LJJIJLIJ(InterfaceC88472Yns<? super E, Boolean> interfaceC88472Yns, int i, C13I c13i) {
        int LJJIJL = LJJIJL(interfaceC88472Yns, this.LJLJL, i, c13i);
        if (LJJIJL == i) {
            return i;
        }
        Object obj = c13i.LIZ;
        o.LJII(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, LJJIJL, i, (Object) null);
        this.LJLJL = objArr;
        this.LJLJLJ = size() - (i - LJJIJL);
        return LJJIJL;
    }

    public C2HH(InterfaceC44221oQ<? extends E> vector, Object[] objArr, Object[] vectorTail, int i) {
        o.LJIIIZ(vector, "vector");
        o.LJIIIZ(vectorTail, "vectorTail");
        this.LJLIL = vector;
        this.LJLILLLLZI = objArr;
        this.LJLJI = vectorTail;
        this.LJLJJI = i;
        this.LJLJJL = new C17P();
        this.LJLJJLL = objArr;
        this.LJLJL = vectorTail;
        this.LJLJLJ = vector.size();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        if (r1 == null) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object[] LJJIII(java.lang.Object[] r6, int r7, int r8, X.C13I r9) {
        /*
            r5 = this;
            int r0 = r8 + (-1)
            int r0 = r0 >> r7
            r4 = r0 & 31
            r3 = 0
            r2 = 5
            if (r7 != r2) goto L11
            r0 = r6[r4]
            r9.LIZ = r0
            r1 = r3
        Le:
            if (r4 != 0) goto L22
            return r3
        L11:
            r1 = r6[r4]
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>"
            kotlin.jvm.internal.o.LJII(r1, r0)
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            int r7 = r7 - r2
            java.lang.Object[] r1 = r5.LJJIII(r1, r7, r8, r9)
            if (r1 != 0) goto L22
            goto Le
        L22:
            java.lang.Object[] r0 = r5.LJIJJLI(r6)
            r0[r4] = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2HH.LJJIII(java.lang.Object[], int, int, X.13I):java.lang.Object[]");
    }

    public final Object[] LJJIIZ(Object[] objArr, int i, int i2, Iterator<Object[]> it) {
        if (it.hasNext()) {
            if (i2 >= 0) {
                if (i2 == 0) {
                    return it.next();
                }
                Object[] LJIJJLI = LJIJJLI(objArr);
                int i3 = (i >> i2) & 31;
                int i4 = i2 - 5;
                LJIJJLI[i3] = LJJIIZ((Object[]) LJIJJLI[i3], i, i4, it);
                while (true) {
                    i3++;
                    if (i3 >= 32 || !it.hasNext()) {
                        break;
                    }
                    LJIJJLI[i3] = LJJIIZ((Object[]) LJIJJLI[i3], 0, i4, it);
                }
                return LJIJJLI;
            }
            "Check failed.".toString();
            throw new IllegalStateException("Check failed.");
        }
        "Check failed.".toString();
        throw new IllegalStateException("Check failed.");
    }

    public final int LJJIJL(InterfaceC88472Yns<? super E, Boolean> interfaceC88472Yns, Object[] objArr, int i, C13I c13i) {
        Object[] objArr2 = objArr;
        int i2 = i;
        boolean z = false;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (interfaceC88472Yns.invoke(obj).booleanValue()) {
                if (!z) {
                    objArr2 = LJIJJLI(objArr);
                    z = true;
                    i2 = i3;
                }
            } else if (z) {
                objArr2[i2] = obj;
                i2++;
            }
        }
        c13i.LIZ = objArr2;
        return i2;
    }

    public final Object[] LJJJ(Object[] objArr, int i, int i2, C13I c13i) {
        int i3 = 31;
        int i4 = (i2 >> i) & 31;
        if (i == 0) {
            Object obj = objArr[i4];
            Object[] LJIJJLI = LJIJJLI(objArr);
            C61898ORa.LJIIZILJ(i4, i4 + 1, 32, objArr, LJIJJLI);
            LJIJJLI[31] = c13i.LIZ;
            c13i.LIZ = obj;
            return LJIJJLI;
        }
        if (objArr[31] == null) {
            i3 = 31 & ((LJJJJI() - 1) >> i);
        }
        Object[] LJIJJLI2 = LJIJJLI(objArr);
        int i5 = i - 5;
        int i6 = i4 + 1;
        if (i6 <= i3) {
            while (true) {
                Object obj2 = LJIJJLI2[i3];
                o.LJII(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                LJIJJLI2[i3] = LJJJ((Object[]) obj2, i5, 0, c13i);
                if (i3 == i6) {
                    break;
                }
                i3--;
            }
        }
        Object obj3 = LJIJJLI2[i4];
        o.LJII(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        LJIJJLI2[i4] = LJJJ((Object[]) obj3, i5, i2, c13i);
        return LJIJJLI2;
    }

    public final Object LJJJIL(int i, int i2, int i3, Object[] objArr) {
        int size = size() - i;
        if (size == 1) {
            Object obj = this.LJLJL[0];
            LJJIIJ(i, i2, objArr);
            return obj;
        }
        Object[] objArr2 = this.LJLJL;
        Object obj2 = objArr2[i3];
        Object[] LJIJJLI = LJIJJLI(objArr2);
        C61898ORa.LJIIZILJ(i3, i3 + 1, size, objArr2, LJIJJLI);
        LJIJJLI[size - 1] = null;
        this.LJLJJLL = objArr;
        this.LJLJL = LJIJJLI;
        this.LJLJLJ = (i + size) - 1;
        this.LJLJJI = i2;
        return obj2;
    }

    public final Object[] LJIILJJIL(Object[] objArr, int i, int i2, Object obj, C13I c13i) {
        Object obj2;
        int i3 = (i2 >> i) & 31;
        if (i == 0) {
            c13i.LIZ = objArr[31];
            Object[] LJIJJLI = LJIJJLI(objArr);
            C61898ORa.LJIIZILJ(i3 + 1, i3, 31, objArr, LJIJJLI);
            LJIJJLI[i3] = obj;
            return LJIJJLI;
        }
        Object[] LJIJJLI2 = LJIJJLI(objArr);
        int i4 = i - 5;
        Object obj3 = LJIJJLI2[i3];
        o.LJII(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        LJIJJLI2[i3] = LJIILJJIL((Object[]) obj3, i4, i2, obj, c13i);
        while (true) {
            i3++;
            if (i3 >= 32 || (obj2 = LJIJJLI2[i3]) == null) {
                break;
            }
            LJIJJLI2[i3] = LJIILJJIL((Object[]) obj2, i4, 0, c13i.LIZ, c13i);
        }
        return LJIJJLI2;
    }

    public final Object[] LJJJJJ(Object[] objArr, int i, int i2, E e, C13I c13i) {
        int i3 = (i2 >> i) & 31;
        Object[] LJIJJLI = LJIJJLI(objArr);
        if (i == 0) {
            if (LJIJJLI != objArr) {
                ((AbstractList) this).modCount++;
            }
            c13i.LIZ = LJIJJLI[i3];
            LJIJJLI[i3] = e;
            return LJIJJLI;
        }
        Object obj = LJIJJLI[i3];
        o.LJII(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        LJIJJLI[i3] = LJJJJJ((Object[]) obj, i - 5, i2, e, c13i);
        return LJIJJLI;
    }

    public final void LJIIIZ(Collection<? extends E> collection, int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        Object[] objArr3 = objArr2;
        if (this.LJLJJLL != null) {
            int i4 = i >> 5;
            AbstractC37961eK LJIJ = LJIJ(LJJJJI() >> 5);
            int i5 = i3;
            Object[] objArr4 = objArr3;
            while (LJIJ.previousIndex() != i4) {
                Object[] objArr5 = (Object[]) LJIJ.previous();
                C61898ORa.LJIIZILJ(0, 32 - i2, 32, objArr5, objArr4);
                objArr4 = LJIL(i2, objArr5);
                i5--;
                objArr[i5] = objArr4;
            }
            Object[] objArr6 = (Object[]) LJIJ.previous();
            int LJJJJI = i3 - (((LJJJJI() >> 5) - 1) - i4);
            if (LJJJJI < i3) {
                objArr3 = objArr[LJJJJI];
                o.LJI(objArr3);
            }
            LJJJJL(collection, i, objArr6, 32, objArr, LJJJJI, objArr3);
            return;
        }
        "Required value was null.".toString();
        throw new IllegalStateException("Required value was null.");
    }

    public final int LJJIJIL(InterfaceC88472Yns<? super E, Boolean> interfaceC88472Yns, Object[] objArr, int i, int i2, C13I c13i, List<Object[]> list, List<Object[]> list2) {
        if (LJIIZILJ(objArr)) {
            ((ArrayList) list).add(objArr);
        }
        Object obj = c13i.LIZ;
        o.LJII(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) obj;
        Object[] objArr3 = objArr2;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj2 = objArr[i3];
            if (!interfaceC88472Yns.invoke(obj2).booleanValue()) {
                if (i2 == 32) {
                    ArrayList arrayList = (ArrayList) list;
                    if (!arrayList.isEmpty()) {
                        objArr3 = (Object[]) ListProtector.remove(list, arrayList.size() - 1);
                    } else {
                        objArr3 = LJJI();
                    }
                    i2 = 0;
                }
                objArr3[i2] = obj2;
                i2++;
            }
        }
        c13i.LIZ = objArr3;
        if (objArr2 != objArr3) {
            ((ArrayList) list2).add(objArr2);
        }
        return i2;
    }

    public final void LJJJJL(Collection<? extends E> collection, int i, Object[] objArr, int i2, Object[][] objArr2, int i3, Object[] objArr3) {
        Object[] LJJI;
        if (i3 >= 1) {
            Object[] LJIJJLI = LJIJJLI(objArr);
            objArr2[0] = LJIJJLI;
            int i4 = i & 31;
            int size = ((collection.size() + i) - 1) & 31;
            int i5 = (i2 - i4) + size;
            if (i5 < 32) {
                C61898ORa.LJIIZILJ(size + 1, i4, i2, LJIJJLI, objArr3);
            } else {
                int i6 = (i5 - 32) + 1;
                if (i3 == 1) {
                    LJJI = LJIJJLI;
                } else {
                    LJJI = LJJI();
                    i3--;
                    objArr2[i3] = LJJI;
                }
                int i7 = i2 - i6;
                C61898ORa.LJIIZILJ(0, i7, i2, LJIJJLI, objArr3);
                C61898ORa.LJIIZILJ(size + 1, i4, i7, LJIJJLI, LJJI);
                objArr3 = LJJI;
            }
            Iterator<? extends E> it = collection.iterator();
            LJII(LJIJJLI, i4, it);
            for (int i8 = 1; i8 < i3; i8++) {
                Object[] LJJI2 = LJJI();
                LJII(LJJI2, 0, it);
                objArr2[i8] = LJJI2;
            }
            LJII(objArr3, 0, it);
            return;
        }
        "Check failed.".toString();
        throw new IllegalStateException("Check failed.");
    }
}
