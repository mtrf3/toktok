package X;

import java.util.Arrays;
import java.util.Iterator;

/* renamed from: X.Ppi, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC65654Ppi<E> extends AbstractC65630PpK<E> implements InterfaceC65672Pq0<E> {
    public transient AbstractC65590Pog<E> LJLILLLLZI;
    public transient AbstractC65583PoZ<InterfaceC65712Pqe<E>> LJLJI;

    public abstract InterfaceC65712Pqe<E> LJIIIIZZ(int i);

    public abstract /* synthetic */ int count(Object obj);

    public abstract AbstractC65583PoZ<E> elementSet();

    @Override // X.AbstractC65578PoU
    public abstract Object writeReplace();

    public static <E> C65655Ppj<E> builder() {
        return new C65655Ppj<>(4);
    }

    @Override // X.AbstractC65578PoU
    public AbstractC65590Pog<E> asList() {
        AbstractC65590Pog<E> abstractC65590Pog = this.LJLILLLLZI;
        if (abstractC65590Pog == null) {
            AbstractC65590Pog<E> asList = super.asList();
            this.LJLILLLLZI = asList;
            return asList;
        }
        return abstractC65590Pog;
    }

    @Override // X.InterfaceC65672Pq0
    public AbstractC65583PoZ<InterfaceC65712Pqe<E>> entrySet() {
        AbstractC65583PoZ<InterfaceC65712Pqe<E>> abstractC65583PoZ = this.LJLJI;
        if (abstractC65583PoZ == null) {
            if (isEmpty()) {
                abstractC65583PoZ = AbstractC65583PoZ.of();
            } else {
                abstractC65583PoZ = new C65670Ppy<>(this);
            }
            this.LJLJI = abstractC65583PoZ;
        }
        return abstractC65583PoZ;
    }

    @Override // java.util.Collection
    public int hashCode() {
        return C65607Pox.LIZIZ(entrySet());
    }

    @Override // X.AbstractC65578PoU, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public AbstractC65557Po9<E> iterator() {
        return new C65683PqB(entrySet().iterator());
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return entrySet().toString();
    }

    public static <E> AbstractC65654Ppi<E> of() {
        return C65660Ppo.LJLJL;
    }

    @Override // X.AbstractC65578PoU, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    public static <E> AbstractC65654Ppi<E> LJII(E... eArr) {
        C65655Ppj c65655Ppj = new C65655Ppj(4);
        c65655Ppj.LIZLLL(eArr);
        return c65655Ppj.LJFF();
    }

    public static <E> AbstractC65654Ppi<E> copyOf(Iterable<? extends E> iterable) {
        int i;
        if (iterable instanceof AbstractC65654Ppi) {
            AbstractC65654Ppi<E> abstractC65654Ppi = (AbstractC65654Ppi) iterable;
            if (!abstractC65654Ppi.LJFF()) {
                return abstractC65654Ppi;
            }
        }
        boolean z = iterable instanceof InterfaceC65672Pq0;
        if (z) {
            i = ((InterfaceC65672Pq0) iterable).elementSet().size();
        } else {
            i = 11;
        }
        C65655Ppj c65655Ppj = new C65655Ppj(i);
        if (z) {
            InterfaceC65672Pq0 interfaceC65672Pq0 = (InterfaceC65672Pq0) iterable;
            if (interfaceC65672Pq0 instanceof C65660Ppo) {
                C65656Ppk<E> c65656Ppk = ((C65660Ppo) interfaceC65672Pq0).LJLJJI;
                if (c65656Ppk != null) {
                    C65656Ppk<E> c65656Ppk2 = c65655Ppj.LIZ;
                    c65656Ppk2.LIZ(Math.max(c65656Ppk2.LIZJ, c65656Ppk.LIZJ));
                    if (c65656Ppk.LIZJ != 0) {
                        int i2 = 0;
                        do {
                            C76917UGr.LJFF(i2, c65656Ppk.LIZJ);
                            Object obj = c65656Ppk.LIZ[i2];
                            C76917UGr.LJFF(i2, c65656Ppk.LIZJ);
                            c65655Ppj.LJ(c65656Ppk.LIZIZ[i2], obj);
                            i2++;
                            if (i2 >= c65656Ppk.LIZJ) {
                                break;
                            }
                        } while (i2 >= 0);
                    }
                }
            } else if (interfaceC65672Pq0 instanceof AbstractC65651Ppf) {
                interfaceC65672Pq0.getClass();
            }
            java.util.Set<InterfaceC65712Pqe<E>> entrySet = interfaceC65672Pq0.entrySet();
            C65656Ppk<E> c65656Ppk3 = c65655Ppj.LIZ;
            c65656Ppk3.LIZ(Math.max(c65656Ppk3.LIZJ, entrySet.size()));
            for (InterfaceC65712Pqe<E> interfaceC65712Pqe : interfaceC65672Pq0.entrySet()) {
                c65655Ppj.LJ(interfaceC65712Pqe.getCount(), interfaceC65712Pqe.LIZLLL());
            }
        } else {
            Iterator<? extends E> it = iterable.iterator();
            while (it.hasNext()) {
                c65655Ppj.LIZJ(it.next());
            }
        }
        return c65655Ppj.LJFF();
    }

    public static <E> AbstractC65654Ppi<E> of(E e) {
        return LJII(e);
    }

    @Override // X.AbstractC65578PoU, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (count(obj) > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return C65669Ppx.LIZ(this, obj);
    }

    public static <E> AbstractC65654Ppi<E> copyOf(Iterator<? extends E> it) {
        C65655Ppj c65655Ppj = new C65655Ppj(4);
        while (it.hasNext()) {
            c65655Ppj.LIZIZ(it.next());
        }
        return c65655Ppj.LJFF();
    }

    public static <E> AbstractC65654Ppi<E> copyOf(E[] eArr) {
        return LJII(eArr);
    }

    public static <E> AbstractC65654Ppi<E> of(E e, E e2) {
        return LJII(e, e2);
    }

    @Override // X.AbstractC65578PoU
    public final int LIZJ(int i, Object[] objArr) {
        AbstractC65557Po9<InterfaceC65712Pqe<E>> it = entrySet().iterator();
        while (it.hasNext()) {
            InterfaceC65712Pqe<E> next = it.next();
            Arrays.fill(objArr, i, next.getCount() + i, next.LIZLLL());
            i += next.getCount();
        }
        return i;
    }

    @Override // X.InterfaceC65672Pq0
    public final int add(E e, int i) {
        throw new UnsupportedOperationException();
    }

    @Override // X.InterfaceC65672Pq0
    public final int remove(Object obj, int i) {
        throw new UnsupportedOperationException();
    }

    @Override // X.InterfaceC65672Pq0
    public final int setCount(E e, int i) {
        throw new UnsupportedOperationException();
    }

    public static <E> AbstractC65654Ppi<E> of(E e, E e2, E e3) {
        return LJII(e, e2, e3);
    }

    @Override // X.InterfaceC65672Pq0
    public final boolean setCount(E e, int i, int i2) {
        throw new UnsupportedOperationException();
    }

    public static <E> AbstractC65654Ppi<E> of(E e, E e2, E e3, E e4) {
        return LJII(e, e2, e3, e4);
    }

    public static <E> AbstractC65654Ppi<E> of(E e, E e2, E e3, E e4, E e5) {
        return LJII(e, e2, e3, e4, e5);
    }

    public static <E> AbstractC65654Ppi<E> of(E e, E e2, E e3, E e4, E e5, E e6, E... eArr) {
        C65655Ppj c65655Ppj = new C65655Ppj(4);
        c65655Ppj.LJ(1, e);
        c65655Ppj.LIZJ(e2);
        c65655Ppj.LIZJ(e3);
        c65655Ppj.LIZJ(e4);
        c65655Ppj.LIZJ(e5);
        c65655Ppj.LIZJ(e6);
        c65655Ppj.LIZLLL(eArr);
        return c65655Ppj.LJFF();
    }
}
