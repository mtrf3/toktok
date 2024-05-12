package X;

import defpackage.g0;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.Ppd, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65649Ppd<E> extends AbstractC65653Pph<E> implements Serializable {
    public static final long serialVersionUID = 1;
    public final transient ConcurrentMap<E, AtomicInteger> countMap;

    public static <E> C65649Ppd<E> create() {
        return new C65649Ppd<>(new ConcurrentHashMap());
    }

    @Override // X.AbstractC65653Pph
    public final java.util.Set<E> LIZJ() {
        return new C65551Po3(this.countMap.keySet());
    }

    @Override // X.AbstractC65653Pph
    public final int LJFF() {
        return this.countMap.size();
    }

    @Override // X.AbstractC65653Pph
    public final Iterator<E> LJII() {
        throw new AssertionError("should never be called");
    }

    @Override // X.AbstractC65653Pph
    public final Iterator<InterfaceC65712Pqe<E>> LJIIIIZZ() {
        return new C65684PqC(this, new C65556Po8(this));
    }

    @Override // X.AbstractC65653Pph, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.countMap.clear();
    }

    @Override // X.AbstractC65653Pph
    public java.util.Set<InterfaceC65712Pqe<E>> createEntrySet() {
        return new C65652Ppg(this);
    }

    @Override // X.AbstractC65653Pph, java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.countMap.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return new C65650Ppe(this, entrySet().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, X.InterfaceC65672Pq0
    public int size() {
        long j = 0;
        while (this.countMap.values().iterator().hasNext()) {
            j += r4.next().get();
        }
        return C65713Pqf.LIZ(j);
    }

    public final List<E> LJIIIZ() {
        int size = size();
        g0.LJIIIIZZ(size, "arraySize");
        ArrayList arrayList = new ArrayList(C65713Pqf.LIZ(size + 5 + (size / 10)));
        for (InterfaceC65712Pqe<E> interfaceC65712Pqe : entrySet()) {
            E LIZLLL = interfaceC65712Pqe.LIZLLL();
            for (int count = interfaceC65712Pqe.getCount(); count > 0; count--) {
                arrayList.add(LIZLLL);
            }
        }
        return arrayList;
    }

    @Override // X.AbstractC65653Pph, X.InterfaceC65672Pq0
    public /* bridge */ /* synthetic */ java.util.Set elementSet() {
        return super.elementSet();
    }

    @Override // X.AbstractC65653Pph, X.InterfaceC65672Pq0
    public /* bridge */ /* synthetic */ java.util.Set entrySet() {
        return super.entrySet();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public Object[] toArray() {
        return ((ArrayList) LJIIIZ()).toArray();
    }

    public C65649Ppd(ConcurrentMap<E, AtomicInteger> concurrentMap) {
        C76917UGr.LIZLLL("the backing map (%s) must be empty", concurrentMap.isEmpty(), concurrentMap);
        this.countMap = concurrentMap;
    }

    public static <E> C65649Ppd<E> create(Iterable<? extends E> iterable) {
        C65649Ppd<E> create = create();
        if (iterable instanceof Collection) {
            create.addAll((Collection) iterable);
        } else {
            iterable.getClass();
            C65631PpL.LIZ(create, iterable.iterator());
        }
        return create;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        C65629PpJ.LIZ.LIZ(this, objectInputStream.readObject());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.countMap);
    }

    @Override // X.AbstractC65653Pph, java.util.AbstractCollection, java.util.Collection, X.InterfaceC65672Pq0
    public /* bridge */ /* synthetic */ boolean contains(Object obj) {
        return super.contains(obj);
    }

    @Override // X.InterfaceC65672Pq0
    public int count(Object obj) {
        AtomicInteger atomicInteger = (AtomicInteger) C65692PqK.LIZ(obj, this.countMap);
        if (atomicInteger == null) {
            return 0;
        }
        return atomicInteger.get();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) ((ArrayList) LJIIIZ()).toArray(tArr);
    }

    public static <E> C65649Ppd<E> create(ConcurrentMap<E, AtomicInteger> concurrentMap) {
        return new C65649Ppd<>(concurrentMap);
    }

    @Override // X.AbstractC65653Pph, X.InterfaceC65672Pq0
    public int add(E e, int i) {
        AtomicInteger atomicInteger;
        int i2;
        AtomicInteger atomicInteger2;
        e.getClass();
        if (i == 0) {
            return count(e);
        }
        g0.LJIIIZ(i, "occurences");
        do {
            atomicInteger = (AtomicInteger) C65692PqK.LIZ(e, this.countMap);
            if (atomicInteger == null && (atomicInteger = this.countMap.putIfAbsent(e, new AtomicInteger(i))) == null) {
                return 0;
            }
            do {
                i2 = atomicInteger.get();
                if (i2 == 0) {
                    atomicInteger2 = new AtomicInteger(i);
                    if (this.countMap.putIfAbsent(e, atomicInteger2) == null) {
                        break;
                    }
                } else {
                    try {
                    } catch (ArithmeticException unused) {
                        throw new IllegalArgumentException(C48263Iwt.LIZLLL("Overflow adding ", i, " occurrences to a count of ", i2));
                    }
                }
            } while (!atomicInteger.compareAndSet(i2, C61337O5l.LJII(i2, i)));
            return i2;
        } while (!this.countMap.replace(e, atomicInteger, atomicInteger2));
        return 0;
    }

    @Override // X.AbstractC65653Pph, X.InterfaceC65672Pq0
    public int remove(Object obj, int i) {
        int i2;
        int max;
        if (i == 0) {
            return count(obj);
        }
        g0.LJIIIZ(i, "occurences");
        AtomicInteger atomicInteger = (AtomicInteger) C65692PqK.LIZ(obj, this.countMap);
        if (atomicInteger == null) {
            return 0;
        }
        do {
            i2 = atomicInteger.get();
            if (i2 == 0) {
                return 0;
            }
            max = Math.max(0, i2 - i);
        } while (!atomicInteger.compareAndSet(i2, max));
        if (max == 0) {
            this.countMap.remove(obj, atomicInteger);
        }
        return i2;
    }

    public boolean removeExactly(Object obj, int i) {
        int i2;
        int i3;
        if (i == 0) {
            return true;
        }
        g0.LJIIIZ(i, "occurences");
        AtomicInteger atomicInteger = (AtomicInteger) C65692PqK.LIZ(obj, this.countMap);
        if (atomicInteger == null) {
            return false;
        }
        do {
            i2 = atomicInteger.get();
            if (i2 < i) {
                return false;
            }
            i3 = i2 - i;
        } while (!atomicInteger.compareAndSet(i2, i3));
        if (i3 == 0) {
            this.countMap.remove(obj, atomicInteger);
        }
        return true;
    }

    @Override // X.AbstractC65653Pph, X.InterfaceC65672Pq0
    public int setCount(E e, int i) {
        AtomicInteger atomicInteger;
        int i2;
        AtomicInteger atomicInteger2;
        e.getClass();
        g0.LJIIIIZZ(i, "count");
        do {
            atomicInteger = (AtomicInteger) C65692PqK.LIZ(e, this.countMap);
            if (atomicInteger == null && (i == 0 || (atomicInteger = this.countMap.putIfAbsent(e, new AtomicInteger(i))) == null)) {
                return 0;
            }
            do {
                i2 = atomicInteger.get();
                if (i2 == 0) {
                    if (i == 0) {
                        return 0;
                    }
                    atomicInteger2 = new AtomicInteger(i);
                    if (this.countMap.putIfAbsent(e, atomicInteger2) == null) {
                        break;
                    }
                }
            } while (!atomicInteger.compareAndSet(i2, i));
            if (i == 0) {
                this.countMap.remove(e, atomicInteger);
            }
            return i2;
        } while (!this.countMap.replace(e, atomicInteger, atomicInteger2));
        return 0;
    }

    @Override // X.AbstractC65653Pph, X.InterfaceC65672Pq0
    public boolean setCount(E e, int i, int i2) {
        e.getClass();
        g0.LJIIIIZZ(i, "oldCount");
        g0.LJIIIIZZ(i2, "newCount");
        AtomicInteger atomicInteger = (AtomicInteger) C65692PqK.LIZ(e, this.countMap);
        if (atomicInteger == null) {
            if (i != 0) {
                return false;
            }
            if (i2 != 0 && this.countMap.putIfAbsent(e, new AtomicInteger(i2)) != null) {
                return false;
            }
            return true;
        }
        int i3 = atomicInteger.get();
        if (i3 == i) {
            if (i3 == 0) {
                if (i2 == 0) {
                    this.countMap.remove(e, atomicInteger);
                    return true;
                }
                AtomicInteger atomicInteger2 = new AtomicInteger(i2);
                if (this.countMap.putIfAbsent(e, atomicInteger2) != null && !this.countMap.replace(e, atomicInteger, atomicInteger2)) {
                    return false;
                }
                return true;
            }
            if (atomicInteger.compareAndSet(i3, i2)) {
                if (i2 == 0) {
                    this.countMap.remove(e, atomicInteger);
                }
                return true;
            }
        }
        return false;
    }
}
