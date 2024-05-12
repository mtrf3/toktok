package X;

import defpackage.g0;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.Pph, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC65653Pph<E> extends AbstractCollection<E> implements InterfaceC65672Pq0<E> {
    public transient java.util.Set<E> LJLIL;
    public transient java.util.Set<InterfaceC65712Pqe<E>> LJLILLLLZI;

    /* renamed from: X.Pph$b */
    /* loaded from: classes12.dex */
    public class b extends AbstractC65673Pq1<E> {
        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<InterfaceC65712Pqe<E>> iterator() {
            return AbstractC65653Pph.this.LJIIIIZZ();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return AbstractC65653Pph.this.LJFF();
        }

        @Override // X.AbstractC65673Pq1
        public InterfaceC65672Pq0<E> LIZJ() {
            return AbstractC65653Pph.this;
        }

        public b() {
        }
    }

    public abstract int LJFF();

    public abstract Iterator<E> LJII();

    public abstract Iterator<InterfaceC65712Pqe<E>> LJIIIIZZ();

    @Override // java.util.AbstractCollection, java.util.Collection
    public abstract void clear();

    public java.util.Set<E> LIZJ() {
        return new C65691PqJ(this);
    }

    public java.util.Set<InterfaceC65712Pqe<E>> createEntrySet() {
        return new b();
    }

    public java.util.Set<E> elementSet() {
        java.util.Set<E> set = this.LJLIL;
        if (set == null) {
            java.util.Set<E> LIZJ = LIZJ();
            this.LJLIL = LIZJ;
            return LIZJ;
        }
        return set;
    }

    public java.util.Set<InterfaceC65712Pqe<E>> entrySet() {
        java.util.Set<InterfaceC65712Pqe<E>> set = this.LJLILLLLZI;
        if (set == null) {
            java.util.Set<InterfaceC65712Pqe<E>> createEntrySet = createEntrySet();
            this.LJLILLLLZI = createEntrySet;
            return createEntrySet;
        }
        return set;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return entrySet().hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return entrySet().isEmpty();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return entrySet().toString();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(E e) {
        add(e, 1);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection<? extends E> collection) {
        collection.getClass();
        if (collection instanceof InterfaceC65672Pq0) {
            InterfaceC65672Pq0 interfaceC65672Pq0 = (InterfaceC65672Pq0) collection;
            if (interfaceC65672Pq0 instanceof AbstractC65651Ppf) {
                if (((AbstractC65653Pph) interfaceC65672Pq0).isEmpty()) {
                    return false;
                }
                throw null;
            }
            if (interfaceC65672Pq0.isEmpty()) {
                return false;
            }
            for (InterfaceC65712Pqe<E> interfaceC65712Pqe : interfaceC65672Pq0.entrySet()) {
                add(interfaceC65712Pqe.LIZLLL(), interfaceC65712Pqe.getCount());
            }
            return true;
        }
        if (collection.isEmpty()) {
            return false;
        }
        return C65631PpL.LIZ(this, collection.iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, X.InterfaceC65672Pq0
    public boolean contains(Object obj) {
        if (count(obj) > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        return C65669Ppx.LIZ(this, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, X.InterfaceC65672Pq0
    public final boolean remove(Object obj) {
        if (remove(obj, 1) > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        if (collection instanceof InterfaceC65672Pq0) {
            collection = ((InterfaceC65672Pq0) collection).elementSet();
        }
        return elementSet().removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        collection.getClass();
        if (collection instanceof InterfaceC65672Pq0) {
            collection = ((InterfaceC65672Pq0) collection).elementSet();
        }
        return elementSet().retainAll(collection);
    }

    public int add(E e, int i) {
        throw new UnsupportedOperationException();
    }

    public int remove(Object obj, int i) {
        throw new UnsupportedOperationException();
    }

    public int setCount(E e, int i) {
        g0.LJIIIIZZ(i, "count");
        int count = count(e);
        int i2 = i - count;
        if (i2 > 0) {
            add(e, i2);
        } else if (i2 < 0) {
            remove(e, -i2);
        }
        return count;
    }

    public boolean setCount(E e, int i, int i2) {
        g0.LJIIIIZZ(i, "oldCount");
        g0.LJIIIIZZ(i2, "newCount");
        if (count(e) == i) {
            setCount(e, i2);
            return true;
        }
        return false;
    }
}
