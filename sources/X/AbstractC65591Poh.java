package X;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;

/* renamed from: X.Poh, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC65591Poh<E> extends AbstractC65594Pok<E> implements NavigableSet<E>, C32Q<E> {
    public transient AbstractC65591Poh<E> LJLJI;
    public final transient Comparator<? super E> comparator;

    public abstract C65592Poi LJIILJJIL();

    public abstract C65592Poi LJIIZILJ(Object obj, boolean z);

    public abstract C65592Poi LJIJ(Object obj, boolean z, Object obj2, boolean z2);

    public abstract C65592Poi LJIJJLI(Object obj, boolean z);

    @Override // java.util.NavigableSet
    public abstract AbstractC65557Po9<E> descendingIterator();

    @Override // X.AbstractC65583PoZ, X.AbstractC65578PoU, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public abstract AbstractC65557Po9<E> iterator();

    public static <E extends Comparable<?>> C65588Poe<E> naturalOrder() {
        return new C65588Poe<>(C65547Pnz.LJLIL);
    }

    public static <E extends Comparable<?>> C65588Poe<E> reverseOrder() {
        return new C65588Poe<>(Collections.reverseOrder());
    }

    @Override // java.util.NavigableSet
    public AbstractC65591Poh<E> descendingSet() {
        AbstractC65591Poh<E> abstractC65591Poh = this.LJLJI;
        if (abstractC65591Poh == null) {
            C65592Poi LJIILJJIL = LJIILJJIL();
            this.LJLJI = LJIILJJIL;
            LJIILJJIL.LJLJI = this;
            return LJIILJJIL;
        }
        return abstractC65591Poh;
    }

    @Override // java.util.NavigableSet
    public final E pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public final E pollLast() {
        throw new UnsupportedOperationException();
    }

    @Override // X.AbstractC65583PoZ, X.AbstractC65578PoU
    public Object writeReplace() {
        return new C65589Pof(this.comparator, toArray());
    }

    @Override // java.util.SortedSet
    public E first() {
        return iterator().next();
    }

    @Override // X.AbstractC65583PoZ, X.AbstractC65578PoU, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    @Override // java.util.SortedSet
    public E last() {
        return descendingIterator().next();
    }

    public static <E> AbstractC65591Poh<E> of() {
        return C65592Poi.LJLJJL;
    }

    @Override // java.util.SortedSet, X.C32Q
    public Comparator<? super E> comparator() {
        return this.comparator;
    }

    public AbstractC65591Poh(Comparator<? super E> comparator) {
        this.comparator = comparator;
    }

    public static <E> C65592Poi<E> LJIILLIIL(Comparator<? super E> comparator) {
        if (C65547Pnz.LJLIL.equals(comparator)) {
            return (C65592Poi<E>) C65592Poi.LJLJJL;
        }
        return new C65592Poi<>(AbstractC65590Pog.of(), comparator);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>([TE;)LX/Poh<TE;>; */
    public static AbstractC65591Poh copyOf(Comparable[] comparableArr) {
        return LJIIJ(C65547Pnz.LJLIL, comparableArr.length, (Object[]) comparableArr.clone());
    }

    public static <E> AbstractC65591Poh<E> copyOfSorted(SortedSet<E> sortedSet) {
        Comparator<? super E> comparator = sortedSet.comparator();
        if (comparator == null) {
            comparator = C65547Pnz.LJLIL;
        }
        AbstractC65590Pog copyOf = AbstractC65590Pog.copyOf((Collection) sortedSet);
        if (copyOf.isEmpty()) {
            return LJIILLIIL(comparator);
        }
        return new C65592Poi(copyOf, comparator);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;)LX/Poh<TE;>; */
    public static AbstractC65591Poh of(Comparable comparable) {
        return new C65592Poi(AbstractC65590Pog.of(comparable), C65547Pnz.LJLIL);
    }

    public static <E> C65588Poe<E> orderedBy(Comparator<E> comparator) {
        return new C65588Poe<>(comparator);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // java.util.NavigableSet
    public E ceiling(E e) {
        Iterator it = tailSet((AbstractC65591Poh<E>) e, true).iterator();
        if (it.hasNext()) {
            return (E) it.next();
        }
        return null;
    }

    @Override // java.util.NavigableSet
    public E floor(E e) {
        AbstractC65557Po9<E> descendingIterator = headSet((AbstractC65591Poh<E>) e, true).descendingIterator();
        if (descendingIterator.hasNext()) {
            return descendingIterator.next();
        }
        return null;
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public AbstractC65591Poh<E> headSet(E e) {
        return headSet((AbstractC65591Poh<E>) e, false);
    }

    @Override // java.util.NavigableSet
    public E higher(E e) {
        Iterator it = tailSet((AbstractC65591Poh<E>) e, false).iterator();
        if (it.hasNext()) {
            return (E) it.next();
        }
        return null;
    }

    @Override // java.util.NavigableSet
    public E lower(E e) {
        AbstractC65557Po9<E> descendingIterator = headSet((AbstractC65591Poh<E>) e, false).descendingIterator();
        if (descendingIterator.hasNext()) {
            return descendingIterator.next();
        }
        return null;
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public AbstractC65591Poh<E> tailSet(E e) {
        return tailSet((AbstractC65591Poh<E>) e, true);
    }

    public static <E> AbstractC65591Poh<E> copyOf(Iterable<? extends E> iterable) {
        return copyOf(C65547Pnz.LJLIL, iterable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableSet, java.util.SortedSet
    public /* bridge */ /* synthetic */ SortedSet headSet(Object obj) {
        return headSet((AbstractC65591Poh<E>) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableSet, java.util.SortedSet
    public /* bridge */ /* synthetic */ SortedSet tailSet(Object obj) {
        return tailSet((AbstractC65591Poh<E>) obj);
    }

    public static <E> AbstractC65591Poh<E> copyOf(Collection<? extends E> collection) {
        return copyOf((Comparator) C65547Pnz.LJLIL, (Collection) collection);
    }

    public static <E> AbstractC65591Poh<E> copyOf(Iterator<? extends E> it) {
        return copyOf(C65547Pnz.LJLIL, it);
    }

    public static <E> AbstractC65591Poh<E> copyOf(Comparator<? super E> comparator, Iterable<? extends E> iterable) {
        Collection arrayList;
        comparator.getClass();
        if (C77123UOp.LJJIJIIJI(comparator, iterable) && (iterable instanceof AbstractC65591Poh)) {
            AbstractC65591Poh<E> abstractC65591Poh = (AbstractC65591Poh) iterable;
            if (!abstractC65591Poh.LJFF()) {
                return abstractC65591Poh;
            }
        }
        if (iterable instanceof Collection) {
            arrayList = (Collection) iterable;
        } else {
            Iterator<? extends E> it = iterable.iterator();
            arrayList = new ArrayList();
            C65631PpL.LIZ(arrayList, it);
        }
        Object[] array = arrayList.toArray();
        return LJIIJ(comparator, array.length, array);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;)LX/Poh<TE;>; */
    public static AbstractC65591Poh of(Comparable comparable, Comparable comparable2) {
        return LJIIJ(C65547Pnz.LJLIL, 2, comparable, comparable2);
    }

    @Override // java.util.NavigableSet
    public AbstractC65591Poh<E> headSet(E e, boolean z) {
        e.getClass();
        return LJIIZILJ(e, z);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public AbstractC65591Poh<E> subSet(E e, E e2) {
        return subSet((boolean) e, true, (boolean) e2, false);
    }

    @Override // java.util.NavigableSet
    public AbstractC65591Poh<E> tailSet(E e, boolean z) {
        e.getClass();
        return LJIJJLI(e, z);
    }

    public static <E> AbstractC65591Poh<E> copyOf(Comparator<? super E> comparator, Iterator<? extends E> it) {
        C65588Poe c65588Poe = new C65588Poe(comparator);
        c65588Poe.LJI(it);
        return c65588Poe.LJFF();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableSet
    public /* bridge */ /* synthetic */ NavigableSet headSet(Object obj, boolean z) {
        return headSet((AbstractC65591Poh<E>) obj, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableSet
    public /* bridge */ /* synthetic */ NavigableSet tailSet(Object obj, boolean z) {
        return tailSet((AbstractC65591Poh<E>) obj, z);
    }

    public static <E> AbstractC65591Poh<E> copyOf(Comparator<? super E> comparator, Collection<? extends E> collection) {
        return copyOf((Comparator) comparator, (Iterable) collection);
    }

    public static C65592Poi LJIIJ(Comparator comparator, int i, Object... objArr) {
        if (i == 0) {
            return LJIILLIIL(comparator);
        }
        C77119UOl.LIZLLL(i, objArr);
        Arrays.sort(objArr, 0, i, comparator);
        int i2 = 1;
        for (int i3 = 1; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (comparator.compare(obj, objArr[i2 - 1]) != 0) {
                objArr[i2] = obj;
                i2++;
            }
        }
        Arrays.fill(objArr, i2, i, (Object) null);
        if (i2 < objArr.length / 2) {
            objArr = Arrays.copyOf(objArr, i2);
        }
        return new C65592Poi(AbstractC65590Pog.LJII(i2, objArr), comparator);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;)LX/Poh<TE;>; */
    public static AbstractC65591Poh of(Comparable comparable, Comparable comparable2, Comparable comparable3) {
        return LJIIJ(C65547Pnz.LJLIL, 3, comparable, comparable2, comparable3);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;TE;)LX/Poh<TE;>; */
    public static AbstractC65591Poh of(Comparable comparable, Comparable comparable2, Comparable comparable3, Comparable comparable4) {
        return LJIIJ(C65547Pnz.LJLIL, 4, comparable, comparable2, comparable3, comparable4);
    }

    @Override // java.util.NavigableSet
    public AbstractC65591Poh<E> subSet(E e, boolean z, E e2, boolean z2) {
        boolean z3;
        e.getClass();
        e2.getClass();
        if (this.comparator.compare(e, e2) <= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        C76917UGr.LJ(z3);
        return LJIJ(e, z, e2, z2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableSet
    public /* bridge */ /* synthetic */ NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        return subSet((boolean) obj, z, (boolean) obj2, z2);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;TE;TE;)LX/Poh<TE;>; */
    public static AbstractC65591Poh of(Comparable comparable, Comparable comparable2, Comparable comparable3, Comparable comparable4, Comparable comparable5) {
        return LJIIJ(C65547Pnz.LJLIL, 5, comparable, comparable2, comparable3, comparable4, comparable5);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;TE;TE;TE;[TE;)LX/Poh<TE;>; */
    public static AbstractC65591Poh of(Comparable comparable, Comparable comparable2, Comparable comparable3, Comparable comparable4, Comparable comparable5, Comparable comparable6, Comparable... comparableArr) {
        int length = comparableArr.length + 6;
        Comparable[] comparableArr2 = new Comparable[length];
        comparableArr2[0] = comparable;
        comparableArr2[1] = comparable2;
        comparableArr2[2] = comparable3;
        comparableArr2[3] = comparable4;
        comparableArr2[4] = comparable5;
        comparableArr2[5] = comparable6;
        System.arraycopy(comparableArr, 0, comparableArr2, 6, comparableArr.length);
        return LJIIJ(C65547Pnz.LJLIL, length, comparableArr2);
    }
}
