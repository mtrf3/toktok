package X;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.Poi, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65592Poi<E> extends AbstractC65591Poh<E> {
    public static final C65592Poi<Comparable> LJLJJL = new C65592Poi<>(AbstractC65590Pog.of(), C65547Pnz.LJLIL);
    public final transient AbstractC65590Pog<E> LJLJJI;

    @Override // X.AbstractC65578PoU
    public final boolean LJFF() {
        return this.LJLJJI.LJFF();
    }

    @Override // X.AbstractC65591Poh
    public final C65592Poi LJIILJJIL() {
        Comparator reverseOrder = Collections.reverseOrder(this.comparator);
        if (isEmpty()) {
            return AbstractC65591Poh.LJIILLIIL(reverseOrder);
        }
        return new C65592Poi(this.LJLJJI.reverse(), reverseOrder);
    }

    @Override // X.AbstractC65591Poh, java.util.NavigableSet
    public final AbstractC65557Po9<E> descendingIterator() {
        return this.LJLJJI.reverse().iterator();
    }

    @Override // X.AbstractC65591Poh, X.AbstractC65583PoZ, X.AbstractC65578PoU, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final AbstractC65557Po9<E> iterator() {
        return this.LJLJJI.iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.LJLJJI.size();
    }

    @Override // X.AbstractC65591Poh, java.util.SortedSet
    public final E first() {
        if (!isEmpty()) {
            return this.LJLJJI.get(0);
        }
        throw new NoSuchElementException();
    }

    @Override // X.AbstractC65591Poh, java.util.SortedSet
    public final E last() {
        if (!isEmpty()) {
            return this.LJLJJI.get(size() - 1);
        }
        throw new NoSuchElementException();
    }

    @Override // X.AbstractC65583PoZ, X.AbstractC65578PoU
    public final AbstractC65590Pog<E> asList() {
        return this.LJLJJI;
    }

    @Override // X.AbstractC65591Poh, java.util.NavigableSet
    public final /* bridge */ /* synthetic */ Iterator descendingIterator() {
        return descendingIterator();
    }

    @Override // X.AbstractC65591Poh, X.AbstractC65583PoZ, X.AbstractC65578PoU, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    @Override // X.AbstractC65591Poh, java.util.NavigableSet
    public final E ceiling(E e) {
        int LJJIFFI = LJJIFFI(e, true);
        if (LJJIFFI == size()) {
            return null;
        }
        return this.LJLJJI.get(LJJIFFI);
    }

    @Override // X.AbstractC65578PoU, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            if (Collections.binarySearch(this.LJLJJI, obj, this.comparator) < 0) {
                return false;
            }
            return true;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection<?> collection) {
        if (collection instanceof InterfaceC65672Pq0) {
            collection = ((InterfaceC65672Pq0) collection).elementSet();
        }
        if (!C77123UOp.LJJIJIIJI(comparator(), collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        AbstractC65557Po9<E> it = iterator();
        Iterator<?> it2 = collection.iterator();
        if (!it.hasNext()) {
            return false;
        }
        Object next = it2.next();
        E next2 = it.next();
        while (true) {
            try {
                int compare = this.comparator.compare(next2, next);
                if (compare < 0) {
                    if (!it.hasNext()) {
                        return false;
                    }
                    next2 = it.next();
                } else {
                    if (compare != 0) {
                        break;
                    }
                    if (!it2.hasNext()) {
                        return true;
                    }
                    next = it2.next();
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // X.AbstractC65583PoZ, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof java.util.Set)) {
            return false;
        }
        java.util.Set set = (java.util.Set) obj;
        if (size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        if (C77123UOp.LJJIJIIJI(this.comparator, set)) {
            Iterator<E> it = set.iterator();
            try {
                AbstractC65557Po9<E> it2 = iterator();
                while (it2.hasNext()) {
                    E next = it2.next();
                    E next2 = it.next();
                    if (next2 == null || this.comparator.compare(next, next2) != 0) {
                        return false;
                    }
                }
                return true;
            } catch (ClassCastException | NoSuchElementException unused) {
                return false;
            }
        }
        return containsAll(set);
    }

    @Override // X.AbstractC65591Poh, java.util.NavigableSet
    public final E floor(E e) {
        int LJJI = LJJI(e, true) - 1;
        if (LJJI == -1) {
            return null;
        }
        return this.LJLJJI.get(LJJI);
    }

    @Override // X.AbstractC65591Poh, java.util.NavigableSet
    public final E higher(E e) {
        int LJJIFFI = LJJIFFI(e, false);
        if (LJJIFFI == size()) {
            return null;
        }
        return this.LJLJJI.get(LJJIFFI);
    }

    @Override // X.AbstractC65591Poh, java.util.NavigableSet
    public final E lower(E e) {
        int LJJI = LJJI(e, false) - 1;
        if (LJJI == -1) {
            return null;
        }
        return this.LJLJJI.get(LJJI);
    }

    public C65592Poi(AbstractC65590Pog<E> abstractC65590Pog, Comparator<? super E> comparator) {
        super(comparator);
        this.LJLJJI = abstractC65590Pog;
    }

    @Override // X.AbstractC65578PoU
    public final int LIZJ(int i, Object[] objArr) {
        return this.LJLJJI.LIZJ(i, objArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC65591Poh
    public final C65592Poi LJIIZILJ(Object obj, boolean z) {
        return LJIL(0, LJJI(obj, z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC65591Poh
    public final C65592Poi LJIJJLI(Object obj, boolean z) {
        return LJIL(LJJIFFI(obj, z), size());
    }

    public final C65592Poi<E> LJIL(int i, int i2) {
        if (i == 0 && i2 == size()) {
            return this;
        }
        if (i < i2) {
            return new C65592Poi<>(this.LJLJJI.subList(i, i2), this.comparator);
        }
        return AbstractC65591Poh.LJIILLIIL(this.comparator);
    }

    public final int LJJI(E e, boolean z) {
        AbstractC65590Pog<E> abstractC65590Pog = this.LJLJJI;
        e.getClass();
        int binarySearch = Collections.binarySearch(abstractC65590Pog, e, comparator());
        if (binarySearch >= 0) {
            if (z) {
                return binarySearch + 1;
            }
            return binarySearch;
        }
        return ~binarySearch;
    }

    public final int LJJIFFI(E e, boolean z) {
        AbstractC65590Pog<E> abstractC65590Pog = this.LJLJJI;
        e.getClass();
        int binarySearch = Collections.binarySearch(abstractC65590Pog, e, comparator());
        if (binarySearch >= 0) {
            if (z) {
                return binarySearch;
            }
            return binarySearch + 1;
        }
        return ~binarySearch;
    }

    @Override // X.AbstractC65591Poh
    public final C65592Poi LJIJ(Object obj, boolean z, Object obj2, boolean z2) {
        C65592Poi LJIJJLI = LJIJJLI(obj, z);
        return LJIJJLI.LJIL(0, LJIJJLI.LJJI(obj2, z2));
    }
}
