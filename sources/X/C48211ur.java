package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.IDqS13S0101000;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.1ur, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C48211ur<T> implements List<T>, C0O9, ORO {
    public C1IS LJLIL = new C1IS(C2HI.LJLJI);

    @Override // X.C0O9
    public final /* synthetic */ C0OB LJIIIZ(C0OB c0ob, C0OB c0ob2, C0OB c0ob3) {
        return null;
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

    public final int LIZJ() {
        C1IS c1is = this.LJLIL;
        o.LJII(c1is, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return ((C1IS) C0OF.LJI(c1is)).LIZLLL;
    }

    public final C1IS<T> LJIILJJIL() {
        C1IS c1is = this.LJLIL;
        o.LJII(c1is, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return (C1IS) C0OF.LJIILLIIL(c1is, this);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        C0OA LJIIIIZZ;
        synchronized (C0OG.LIZ) {
            C1IS c1is = this.LJLIL;
            o.LJII(c1is, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (C0OF.LIZJ) {
                LJIIIIZZ = C0OF.LJIIIIZZ();
                C1IS c1is2 = (C1IS) C0OF.LJIJI(c1is, this, LJIIIIZZ);
                c1is2.LIZJ(C2HI.LJLJI);
                c1is2.LIZLLL++;
            }
            C0OF.LJIIL(LJIIIIZZ, this);
        }
    }

    @Override // java.util.List
    public final ListIterator<T> listIterator() {
        return new C1IF(this, 0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return LJIILJJIL().LIZJ.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        return listIterator();
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return LJIILJJIL().LIZJ.size();
    }

    @Override // X.C0O9
    public final C0OB LJII() {
        return this.LJLIL;
    }

    @Override // X.C0O9
    public final void LJIIIIZZ(C0OB c0ob) {
        c0ob.LIZIZ = this.LJLIL;
        this.LJLIL = (C1IS) c0ob;
    }

    public final boolean LJIILLIIL(InterfaceC88472Yns<? super List<T>, Boolean> interfaceC88472Yns) {
        int i;
        InterfaceC44221oQ<? extends T> interfaceC44221oQ;
        Boolean invoke;
        C0OA LJIIIIZZ;
        boolean z;
        do {
            Object obj = C0OG.LIZ;
            synchronized (obj) {
                C1IS c1is = this.LJLIL;
                o.LJII(c1is, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                C1IS c1is2 = (C1IS) C0OF.LJI(c1is);
                i = c1is2.LIZLLL;
                interfaceC44221oQ = c1is2.LIZJ;
            }
            o.LJI(interfaceC44221oQ);
            C2HH builder = interfaceC44221oQ.builder();
            invoke = interfaceC88472Yns.invoke(builder);
            InterfaceC44221oQ<? extends T> LIZJ = builder.LIZJ();
            if (o.LJ(LIZJ, interfaceC44221oQ)) {
                break;
            }
            synchronized (obj) {
                C1IS c1is3 = this.LJLIL;
                o.LJII(c1is3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                synchronized (C0OF.LIZJ) {
                    LJIIIIZZ = C0OF.LJIIIIZZ();
                    C1IS c1is4 = (C1IS) C0OF.LJIJI(c1is3, this, LJIIIIZZ);
                    if (c1is4.LIZLLL == i) {
                        c1is4.LIZJ(LIZJ);
                        z = true;
                        c1is4.LIZLLL++;
                    } else {
                        z = false;
                    }
                }
                C0OF.LJIIL(LJIIIIZZ, this);
            }
        } while (!z);
        return invoke.booleanValue();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(T t) {
        int i;
        InterfaceC44221oQ<? extends T> interfaceC44221oQ;
        boolean z;
        C0OA LJIIIIZZ;
        do {
            Object obj = C0OG.LIZ;
            synchronized (obj) {
                C1IS c1is = this.LJLIL;
                o.LJII(c1is, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                C1IS c1is2 = (C1IS) C0OF.LJI(c1is);
                i = c1is2.LIZLLL;
                interfaceC44221oQ = c1is2.LIZJ;
            }
            o.LJI(interfaceC44221oQ);
            InterfaceC44221oQ<? extends T> add = interfaceC44221oQ.add((InterfaceC44221oQ<? extends T>) t);
            z = false;
            if (o.LJ(add, interfaceC44221oQ)) {
                return false;
            }
            synchronized (obj) {
                C1IS c1is3 = this.LJLIL;
                o.LJII(c1is3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                synchronized (C0OF.LIZJ) {
                    LJIIIIZZ = C0OF.LJIIIIZZ();
                    C1IS c1is4 = (C1IS) C0OF.LJIJI(c1is3, this, LJIIIIZZ);
                    if (c1is4.LIZLLL == i) {
                        c1is4.LIZJ(add);
                        c1is4.LIZLLL++;
                        z = true;
                    }
                }
                C0OF.LJIIL(LJIIIIZZ, this);
            }
        } while (!z);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends T> elements) {
        int i;
        InterfaceC44221oQ<? extends T> interfaceC44221oQ;
        boolean z;
        C0OA LJIIIIZZ;
        o.LJIIIZ(elements, "elements");
        do {
            Object obj = C0OG.LIZ;
            synchronized (obj) {
                C1IS c1is = this.LJLIL;
                o.LJII(c1is, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                C1IS c1is2 = (C1IS) C0OF.LJI(c1is);
                i = c1is2.LIZLLL;
                interfaceC44221oQ = c1is2.LIZJ;
            }
            o.LJI(interfaceC44221oQ);
            InterfaceC44221oQ<? extends T> addAll = interfaceC44221oQ.addAll((Collection<? extends Object>) elements);
            z = false;
            if (o.LJ(addAll, interfaceC44221oQ)) {
                return false;
            }
            synchronized (obj) {
                C1IS c1is3 = this.LJLIL;
                o.LJII(c1is3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                synchronized (C0OF.LIZJ) {
                    LJIIIIZZ = C0OF.LJIIIIZZ();
                    C1IS c1is4 = (C1IS) C0OF.LJIJI(c1is3, this, LJIIIIZZ);
                    if (c1is4.LIZLLL == i) {
                        c1is4.LIZJ(addAll);
                        c1is4.LIZLLL++;
                        z = true;
                    }
                }
                C0OF.LJIIL(LJIIIIZZ, this);
            }
        } while (!z);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return LJIILJJIL().LIZJ.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<? extends Object> elements) {
        o.LJIIIZ(elements, "elements");
        return LJIILJJIL().LIZJ.containsAll(elements);
    }

    @Override // java.util.List
    public final T get(int i) {
        return LJIILJJIL().LIZJ.get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return LJIILJJIL().LIZJ.indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return LJIILJJIL().LIZJ.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator<T> listIterator(int i) {
        return new C1IF(this, i);
    }

    @Override // java.util.List
    public final T remove(int i) {
        int i2;
        InterfaceC44221oQ<? extends T> interfaceC44221oQ;
        C0OA LJIIIIZZ;
        boolean z;
        T t = get(i);
        do {
            Object obj = C0OG.LIZ;
            synchronized (obj) {
                C1IS c1is = this.LJLIL;
                o.LJII(c1is, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                C1IS c1is2 = (C1IS) C0OF.LJI(c1is);
                i2 = c1is2.LIZLLL;
                interfaceC44221oQ = c1is2.LIZJ;
            }
            o.LJI(interfaceC44221oQ);
            InterfaceC44221oQ<? extends T> LJJJJIZL = interfaceC44221oQ.LJJJJIZL(i);
            if (o.LJ(LJJJJIZL, interfaceC44221oQ)) {
                break;
            }
            synchronized (obj) {
                C1IS c1is3 = this.LJLIL;
                o.LJII(c1is3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                synchronized (C0OF.LIZJ) {
                    LJIIIIZZ = C0OF.LJIIIIZZ();
                    C1IS c1is4 = (C1IS) C0OF.LJIJI(c1is3, this, LJIIIIZZ);
                    if (c1is4.LIZLLL == i2) {
                        c1is4.LIZJ(LJJJJIZL);
                        z = true;
                        c1is4.LIZLLL++;
                    } else {
                        z = false;
                    }
                }
                C0OF.LJIIL(LJIIIIZZ, this);
            }
        } while (!z);
        return t;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<? extends Object> elements) {
        int i;
        InterfaceC44221oQ<? extends T> interfaceC44221oQ;
        boolean z;
        C0OA LJIIIIZZ;
        o.LJIIIZ(elements, "elements");
        do {
            Object obj = C0OG.LIZ;
            synchronized (obj) {
                C1IS c1is = this.LJLIL;
                o.LJII(c1is, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                C1IS c1is2 = (C1IS) C0OF.LJI(c1is);
                i = c1is2.LIZLLL;
                interfaceC44221oQ = c1is2.LIZJ;
            }
            o.LJI(interfaceC44221oQ);
            InterfaceC44221oQ<? extends T> removeAll = interfaceC44221oQ.removeAll((Collection<? extends Object>) elements);
            z = false;
            if (o.LJ(removeAll, interfaceC44221oQ)) {
                return false;
            }
            synchronized (obj) {
                C1IS c1is3 = this.LJLIL;
                o.LJII(c1is3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                synchronized (C0OF.LIZJ) {
                    LJIIIIZZ = C0OF.LJIIIIZZ();
                    C1IS c1is4 = (C1IS) C0OF.LJIJI(c1is3, this, LJIIIIZZ);
                    if (c1is4.LIZLLL == i) {
                        c1is4.LIZJ(removeAll);
                        c1is4.LIZLLL++;
                        z = true;
                    }
                }
                C0OF.LJIIL(LJIIIIZZ, this);
            }
        } while (!z);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<? extends Object> elements) {
        o.LJIIIZ(elements, "elements");
        return LJIILLIIL(new IDqS416S0100000(elements, 122));
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i;
        InterfaceC44221oQ<? extends T> interfaceC44221oQ;
        boolean z;
        C0OA LJIIIIZZ;
        do {
            Object obj2 = C0OG.LIZ;
            synchronized (obj2) {
                C1IS c1is = this.LJLIL;
                o.LJII(c1is, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                C1IS c1is2 = (C1IS) C0OF.LJI(c1is);
                i = c1is2.LIZLLL;
                interfaceC44221oQ = c1is2.LIZJ;
            }
            o.LJI(interfaceC44221oQ);
            InterfaceC44221oQ<? extends T> remove = interfaceC44221oQ.remove((InterfaceC44221oQ<? extends T>) obj);
            z = false;
            if (o.LJ(remove, interfaceC44221oQ)) {
                return false;
            }
            synchronized (obj2) {
                C1IS c1is3 = this.LJLIL;
                o.LJII(c1is3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                synchronized (C0OF.LIZJ) {
                    LJIIIIZZ = C0OF.LJIIIIZZ();
                    C1IS c1is4 = (C1IS) C0OF.LJIJI(c1is3, this, LJIIIIZZ);
                    if (c1is4.LIZLLL == i) {
                        c1is4.LIZJ(remove);
                        c1is4.LIZLLL++;
                        z = true;
                    }
                }
                C0OF.LJIIL(LJIIIIZZ, this);
            }
        } while (!z);
        return true;
    }

    @Override // java.util.List
    public final void add(int i, T t) {
        int i2;
        InterfaceC44221oQ<? extends T> interfaceC44221oQ;
        C0OA LJIIIIZZ;
        boolean z;
        do {
            Object obj = C0OG.LIZ;
            synchronized (obj) {
                C1IS c1is = this.LJLIL;
                o.LJII(c1is, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                C1IS c1is2 = (C1IS) C0OF.LJI(c1is);
                i2 = c1is2.LIZLLL;
                interfaceC44221oQ = c1is2.LIZJ;
            }
            o.LJI(interfaceC44221oQ);
            InterfaceC44221oQ<? extends T> add = interfaceC44221oQ.add(i, (int) t);
            if (o.LJ(add, interfaceC44221oQ)) {
                return;
            }
            synchronized (obj) {
                C1IS c1is3 = this.LJLIL;
                o.LJII(c1is3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                synchronized (C0OF.LIZJ) {
                    LJIIIIZZ = C0OF.LJIIIIZZ();
                    C1IS c1is4 = (C1IS) C0OF.LJIJI(c1is3, this, LJIIIIZZ);
                    if (c1is4.LIZLLL == i2) {
                        c1is4.LIZJ(add);
                        z = true;
                        c1is4.LIZLLL++;
                    } else {
                        z = false;
                    }
                }
                C0OF.LJIIL(LJIIIIZZ, this);
            }
        } while (!z);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends T> elements) {
        o.LJIIIZ(elements, "elements");
        return LJIILLIIL(new IDqS13S0101000(i, (int) elements, 3));
    }

    @Override // java.util.List
    public final T set(int i, T t) {
        int i2;
        InterfaceC44221oQ<? extends T> interfaceC44221oQ;
        C0OA LJIIIIZZ;
        boolean z;
        T t2 = get(i);
        do {
            Object obj = C0OG.LIZ;
            synchronized (obj) {
                C1IS c1is = this.LJLIL;
                o.LJII(c1is, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                C1IS c1is2 = (C1IS) C0OF.LJI(c1is);
                i2 = c1is2.LIZLLL;
                interfaceC44221oQ = c1is2.LIZJ;
            }
            o.LJI(interfaceC44221oQ);
            InterfaceC44221oQ<? extends T> interfaceC44221oQ2 = interfaceC44221oQ.set(i, (int) t);
            if (o.LJ(interfaceC44221oQ2, interfaceC44221oQ)) {
                break;
            }
            synchronized (obj) {
                C1IS c1is3 = this.LJLIL;
                o.LJII(c1is3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                synchronized (C0OF.LIZJ) {
                    LJIIIIZZ = C0OF.LJIIIIZZ();
                    C1IS c1is4 = (C1IS) C0OF.LJIJI(c1is3, this, LJIIIIZZ);
                    if (c1is4.LIZLLL == i2) {
                        c1is4.LIZJ(interfaceC44221oQ2);
                        z = true;
                        c1is4.LIZLLL++;
                    } else {
                        z = false;
                    }
                }
                C0OF.LJIIL(LJIIIIZZ, this);
            }
        } while (!z);
        return t2;
    }

    @Override // java.util.List
    public final List<T> subList(int i, int i2) {
        if (i >= 0 && i <= i2 && i2 <= size()) {
            return new C48171un(this, i, i2);
        }
        "Failed requirement.".toString();
        throw new IllegalArgumentException("Failed requirement.");
    }
}
