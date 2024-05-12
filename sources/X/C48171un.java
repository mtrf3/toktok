package X;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.o;

/* renamed from: X.1un, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C48171un<T> implements List<T>, ORO {
    public final C48211ur<T> LJLIL;
    public final int LJLILLLLZI;
    public int LJLJI;
    public int LJLJJI;

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final ListIterator<T> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return ORX.LIZIZ(this);
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] array) {
        o.LJIIIZ(array, "array");
        return (T[]) ORX.LIZJ(this, array);
    }

    public final void LIZJ() {
        if (this.LJLIL.LIZJ() == this.LJLJI) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i;
        InterfaceC44221oQ<? extends T> interfaceC44221oQ;
        C0OA LJIIIIZZ;
        boolean z;
        if (this.LJLJJI > 0) {
            LIZJ();
            C48211ur<T> c48211ur = this.LJLIL;
            int i2 = this.LJLILLLLZI;
            int i3 = this.LJLJJI + i2;
            c48211ur.getClass();
            do {
                Object obj = C0OG.LIZ;
                synchronized (obj) {
                    C1IS c1is = c48211ur.LJLIL;
                    o.LJII(c1is, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                    C1IS c1is2 = (C1IS) C0OF.LJI(c1is);
                    i = c1is2.LIZLLL;
                    interfaceC44221oQ = c1is2.LIZJ;
                }
                o.LJI(interfaceC44221oQ);
                C2HH builder = interfaceC44221oQ.builder();
                builder.subList(i2, i3).clear();
                InterfaceC44221oQ<? extends T> LIZJ = builder.LIZJ();
                if (o.LJ(LIZJ, interfaceC44221oQ)) {
                    break;
                }
                synchronized (obj) {
                    C1IS c1is3 = c48211ur.LJLIL;
                    o.LJII(c1is3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                    synchronized (C0OF.LIZJ) {
                        LJIIIIZZ = C0OF.LJIIIIZZ();
                        C1IS c1is4 = (C1IS) C0OF.LJIJI(c1is3, c48211ur, LJIIIIZZ);
                        if (c1is4.LIZLLL == i) {
                            c1is4.LIZJ(LIZJ);
                            z = true;
                            c1is4.LIZLLL++;
                        } else {
                            z = false;
                        }
                    }
                    C0OF.LJIIL(LJIIIIZZ, c48211ur);
                }
            } while (!z);
            this.LJLJJI = 0;
            this.LJLJI = this.LJLIL.LIZJ();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        if (this.LJLJJI == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return this.LJLJJI;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(T t) {
        LIZJ();
        this.LJLIL.add(this.LJLILLLLZI + this.LJLJJI, t);
        this.LJLJJI++;
        this.LJLJI = this.LJLIL.LIZJ();
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends T> elements) {
        o.LJIIIZ(elements, "elements");
        return addAll(this.LJLJJI, elements);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<? extends Object> elements) {
        o.LJIIIZ(elements, "elements");
        if (elements.isEmpty()) {
            return true;
        }
        Iterator<? extends Object> it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final T get(int i) {
        LIZJ();
        C0OG.LIZ(i, this.LJLJJI);
        return this.LJLIL.get(this.LJLILLLLZI + i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        LIZJ();
        int i = this.LJLILLLLZI;
        Iterator<Integer> it = C78842Uww.LJJ(i, this.LJLJJI + i).iterator();
        while (it.hasNext()) {
            int nextInt = ((AbstractC118224kU) it).nextInt();
            if (o.LJ(obj, this.LJLIL.get(nextInt))) {
                return nextInt - this.LJLILLLLZI;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        LIZJ();
        int i = this.LJLILLLLZI + this.LJLJJI;
        do {
            i--;
            if (i < this.LJLILLLLZI) {
                return -1;
            }
        } while (!o.LJ(obj, this.LJLIL.get(i)));
        return i - this.LJLILLLLZI;
    }

    @Override // java.util.List
    public final ListIterator<T> listIterator(int i) {
        LIZJ();
        C76732zl c76732zl = new C76732zl();
        c76732zl.element = i - 1;
        return new C1IP(c76732zl, this);
    }

    @Override // java.util.List
    public final T remove(int i) {
        LIZJ();
        T remove = this.LJLIL.remove(this.LJLILLLLZI + i);
        this.LJLJJI--;
        this.LJLJI = this.LJLIL.LIZJ();
        return remove;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<? extends Object> elements) {
        o.LJIIIZ(elements, "elements");
        Iterator<? extends Object> it = elements.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<? extends Object> elements) {
        int i;
        InterfaceC44221oQ<? extends T> interfaceC44221oQ;
        C0OA LJIIIIZZ;
        boolean z;
        o.LJIIIZ(elements, "elements");
        LIZJ();
        C48211ur<T> c48211ur = this.LJLIL;
        int i2 = this.LJLILLLLZI;
        int i3 = this.LJLJJI + i2;
        c48211ur.getClass();
        int size = c48211ur.size();
        do {
            Object obj = C0OG.LIZ;
            synchronized (obj) {
                C1IS c1is = c48211ur.LJLIL;
                o.LJII(c1is, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                C1IS c1is2 = (C1IS) C0OF.LJI(c1is);
                i = c1is2.LIZLLL;
                interfaceC44221oQ = c1is2.LIZJ;
            }
            o.LJI(interfaceC44221oQ);
            C2HH builder = interfaceC44221oQ.builder();
            builder.subList(i2, i3).retainAll(elements);
            InterfaceC44221oQ<? extends T> LIZJ = builder.LIZJ();
            if (o.LJ(LIZJ, interfaceC44221oQ)) {
                break;
            }
            synchronized (obj) {
                C1IS c1is3 = c48211ur.LJLIL;
                o.LJII(c1is3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                synchronized (C0OF.LIZJ) {
                    LJIIIIZZ = C0OF.LJIIIIZZ();
                    C1IS c1is4 = (C1IS) C0OF.LJIJI(c1is3, c48211ur, LJIIIIZZ);
                    if (c1is4.LIZLLL == i) {
                        c1is4.LIZJ(LIZJ);
                        c1is4.LIZLLL++;
                        z = true;
                    } else {
                        z = false;
                    }
                }
                C0OF.LJIIL(LJIIIIZZ, c48211ur);
            }
        } while (!z);
        int size2 = size - c48211ur.size();
        if (size2 <= 0) {
            return false;
        }
        this.LJLJI = this.LJLIL.LIZJ();
        this.LJLJJI -= size2;
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            remove(indexOf);
            return true;
        }
        return false;
    }

    @Override // java.util.List
    public final void add(int i, T t) {
        LIZJ();
        this.LJLIL.add(this.LJLILLLLZI + i, t);
        this.LJLJJI++;
        this.LJLJI = this.LJLIL.LIZJ();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends T> elements) {
        o.LJIIIZ(elements, "elements");
        LIZJ();
        boolean addAll = this.LJLIL.addAll(i + this.LJLILLLLZI, elements);
        if (addAll) {
            this.LJLJJI = elements.size() + this.LJLJJI;
            this.LJLJI = this.LJLIL.LIZJ();
        }
        return addAll;
    }

    @Override // java.util.List
    public final T set(int i, T t) {
        C0OG.LIZ(i, this.LJLJJI);
        LIZJ();
        T t2 = this.LJLIL.set(i + this.LJLILLLLZI, t);
        this.LJLJI = this.LJLIL.LIZJ();
        return t2;
    }

    @Override // java.util.List
    public final List<T> subList(int i, int i2) {
        if (i >= 0 && i <= i2 && i2 <= this.LJLJJI) {
            LIZJ();
            C48211ur<T> c48211ur = this.LJLIL;
            int i3 = this.LJLILLLLZI;
            return new C48171un(c48211ur, i + i3, i2 + i3);
        }
        "Failed requirement.".toString();
        throw new IllegalArgumentException("Failed requirement.");
    }

    public C48171un(C48211ur<T> parentList, int i, int i2) {
        o.LJIIIZ(parentList, "parentList");
        this.LJLIL = parentList;
        this.LJLILLLLZI = i;
        this.LJLJI = parentList.LIZJ();
        this.LJLJJI = i2 - i;
    }
}
