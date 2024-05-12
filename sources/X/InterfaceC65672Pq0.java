package X;

import java.util.Collection;

/* renamed from: X.Pq0, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC65672Pq0<E> extends Collection<E> {
    int add(E e, int i);

    boolean contains(Object obj);

    @Override // java.util.Collection
    boolean containsAll(Collection<?> collection);

    int count(Object obj);

    java.util.Set<E> elementSet();

    java.util.Set<InterfaceC65712Pqe<E>> entrySet();

    int remove(Object obj, int i);

    boolean remove(Object obj);

    int setCount(E e, int i);

    boolean setCount(E e, int i, int i2);

    int size();
}
