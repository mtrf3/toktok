package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import defpackage.g0;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: X.Pog, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC65590Pog<E> extends AbstractC65578PoU<E> implements List<E>, RandomAccess {
    public static final C65597Pon LJLILLLLZI = new C65597Pon(C65596Pom.LJLJJL, 0);

    @Override // X.AbstractC65578PoU
    public final AbstractC65590Pog<E> asList() {
        return this;
    }

    @Override // java.util.List
    public AbstractC65601Por<E> listIterator() {
        return listIterator(0);
    }

    public static <E> C65587Pod<E> builder() {
        return new C65587Pod<>();
    }

    @Override // X.AbstractC65578PoU
    public Object writeReplace() {
        return new C65579PoV(toArray());
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = ~(~(get(i2).hashCode() + (i * 31)));
        }
        return i;
    }

    @Override // X.AbstractC65578PoU, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public AbstractC65557Po9<E> iterator() {
        return listIterator();
    }

    public AbstractC65590Pog<E> reverse() {
        if (size() <= 1) {
            return this;
        }
        return new C65593Poj(this);
    }

    public static <E> AbstractC65590Pog<E> of() {
        return C65596Pom.LJLJJL;
    }

    @Override // X.AbstractC65578PoU, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    public static <E> C65587Pod<E> builderWithExpectedSize(int i) {
        g0.LJIIIIZZ(i, "expectedSize");
        return new C65587Pod<>(i);
    }

    public static <E> AbstractC65590Pog<E> copyOf(Iterator<? extends E> it) {
        if (!it.hasNext()) {
            return of();
        }
        E next = it.next();
        if (!it.hasNext()) {
            return of((Object) next);
        }
        C65587Pod c65587Pod = new C65587Pod();
        c65587Pod.LIZIZ(next);
        while (it.hasNext()) {
            c65587Pod.LIZLLL(it.next());
        }
        return c65587Pod.LJ();
    }

    public static <E> AbstractC65590Pog<E> of(E e) {
        Object[] objArr = {e};
        C77119UOl.LIZLLL(1, objArr);
        return LJII(1, objArr);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static <E extends Comparable<? super E>> AbstractC65590Pog<E> sortedCopyOf(Iterable<? extends E> iterable) {
        Collection arrayList;
        Comparable[] comparableArr = new Comparable[0];
        if (iterable instanceof Collection) {
            arrayList = (Collection) iterable;
        } else {
            Iterator<? extends E> it = iterable.iterator();
            arrayList = new ArrayList();
            C65631PpL.LIZ(arrayList, it);
        }
        Comparable[] comparableArr2 = (Comparable[]) arrayList.toArray(comparableArr);
        C77119UOl.LIZLLL(comparableArr2.length, comparableArr2);
        Arrays.sort(comparableArr2);
        return LJII(comparableArr2.length, comparableArr2);
    }

    @Override // X.AbstractC65578PoU, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i = 0; i < size; i++) {
                        if (C78886Uxe.LJIIIIZZ(ListProtector.get(this, i), ListProtector.get(list, i))) {
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator<E> it2 = list.iterator();
                while (it.hasNext()) {
                    if (it2.hasNext() && C78886Uxe.LJIIIIZZ(it.next(), it2.next())) {
                    }
                }
                return !it2.hasNext();
            }
        }
        return false;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(ListProtector.get(this, i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(ListProtector.get(this, size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public AbstractC65601Por<E> listIterator(int i) {
        C76917UGr.LJIIIIZZ(i, size());
        if (isEmpty()) {
            return LJLILLLLZI;
        }
        return new C65597Pon(this, i);
    }

    @Override // java.util.List
    public final E remove(int i) {
        throw new UnsupportedOperationException();
    }

    public static <E> AbstractC65590Pog<E> copyOf(Collection<? extends E> collection) {
        if (collection instanceof AbstractC65578PoU) {
            AbstractC65590Pog<E> asList = ((AbstractC65578PoU) collection).asList();
            if (asList.LJFF()) {
                Object[] array = asList.toArray();
                return LJII(array.length, array);
            }
            return asList;
        }
        Object[] array2 = collection.toArray();
        C77119UOl.LIZLLL(array2.length, array2);
        return LJII(array2.length, array2);
    }

    public static <E> AbstractC65590Pog<E> copyOf(E[] eArr) {
        if (eArr.length == 0) {
            return of();
        }
        Object[] objArr = (Object[]) eArr.clone();
        C77119UOl.LIZLLL(objArr.length, objArr);
        return LJII(objArr.length, objArr);
    }

    public static <E> AbstractC65590Pog<E> copyOf(Iterable<? extends E> iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return copyOf((Collection) iterable);
        }
        return copyOf(iterable.iterator());
    }

    public static AbstractC65590Pog LJII(int i, Object[] objArr) {
        if (i == 0) {
            return of();
        }
        return new C65596Pom(i, objArr);
    }

    public static <E> AbstractC65590Pog<E> of(E e, E e2) {
        Object[] objArr = {e, e2};
        C77119UOl.LIZLLL(2, objArr);
        return LJII(2, objArr);
    }

    public static <E> AbstractC65590Pog<E> sortedCopyOf(Comparator<? super E> comparator, Iterable<? extends E> iterable) {
        Collection arrayList;
        comparator.getClass();
        if (iterable instanceof Collection) {
            arrayList = (Collection) iterable;
        } else {
            Iterator<? extends E> it = iterable.iterator();
            arrayList = new ArrayList();
            C65631PpL.LIZ(arrayList, it);
        }
        Object[] array = arrayList.toArray();
        C77119UOl.LIZLLL(array.length, array);
        Arrays.sort(array, comparator);
        return LJII(array.length, array);
    }

    @Override // X.AbstractC65578PoU
    public int LIZJ(int i, Object[] objArr) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // java.util.List
    public final void add(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final E set(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public AbstractC65590Pog<E> subList(int i, int i2) {
        C76917UGr.LJIIIZ(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return of();
        }
        return new C65595Pol(this, i, i3);
    }

    public static <E> AbstractC65590Pog<E> of(E e, E e2, E e3) {
        Object[] objArr = {e, e2, e3};
        C77119UOl.LIZLLL(3, objArr);
        return LJII(3, objArr);
    }

    public static <E> AbstractC65590Pog<E> of(E e, E e2, E e3, E e4) {
        Object[] objArr = {e, e2, e3, e4};
        C77119UOl.LIZLLL(4, objArr);
        return LJII(4, objArr);
    }

    public static <E> AbstractC65590Pog<E> of(E e, E e2, E e3, E e4, E e5) {
        Object[] objArr = {e, e2, e3, e4, e5};
        C77119UOl.LIZLLL(5, objArr);
        return LJII(5, objArr);
    }

    public static <E> AbstractC65590Pog<E> of(E e, E e2, E e3, E e4, E e5, E e6) {
        Object[] objArr = {e, e2, e3, e4, e5, e6};
        C77119UOl.LIZLLL(6, objArr);
        return LJII(6, objArr);
    }

    public static <E> AbstractC65590Pog<E> of(E e, E e2, E e3, E e4, E e5, E e6, E e7) {
        Object[] objArr = {e, e2, e3, e4, e5, e6, e7};
        C77119UOl.LIZLLL(7, objArr);
        return LJII(7, objArr);
    }

    public static <E> AbstractC65590Pog<E> of(E e, E e2, E e3, E e4, E e5, E e6, E e7, E e8) {
        Object[] objArr = {e, e2, e3, e4, e5, e6, e7, e8};
        C77119UOl.LIZLLL(8, objArr);
        return LJII(8, objArr);
    }

    public static <E> AbstractC65590Pog<E> of(E e, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9) {
        Object[] objArr = {e, e2, e3, e4, e5, e6, e7, e8, e9};
        C77119UOl.LIZLLL(9, objArr);
        return LJII(9, objArr);
    }

    public static <E> AbstractC65590Pog<E> of(E e, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9, E e10) {
        Object[] objArr = {e, e2, e3, e4, e5, e6, e7, e8, e9, e10};
        C77119UOl.LIZLLL(10, objArr);
        return LJII(10, objArr);
    }

    public static <E> AbstractC65590Pog<E> of(E e, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9, E e10, E e11) {
        Object[] objArr = {e, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11};
        C77119UOl.LIZLLL(11, objArr);
        return LJII(11, objArr);
    }

    public static <E> AbstractC65590Pog<E> of(E e, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9, E e10, E e11, E e12, E... eArr) {
        boolean z;
        if (eArr.length <= 2147483635) {
            z = true;
        } else {
            z = false;
        }
        C76917UGr.LIZJ("the total number of elements must fit in an int", z);
        int length = eArr.length + 12;
        Object[] objArr = new Object[length];
        objArr[0] = e;
        objArr[1] = e2;
        objArr[2] = e3;
        objArr[3] = e4;
        objArr[4] = e5;
        objArr[5] = e6;
        objArr[6] = e7;
        objArr[7] = e8;
        objArr[8] = e9;
        objArr[9] = e10;
        objArr[10] = e11;
        objArr[11] = e12;
        System.arraycopy(eArr, 0, objArr, 12, eArr.length);
        C77119UOl.LIZLLL(length, objArr);
        return LJII(length, objArr);
    }
}
