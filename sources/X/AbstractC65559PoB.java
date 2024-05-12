package X;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.PoB, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC65559PoB<E> extends AbstractC65561PoD implements Collection<E> {
    @Override // X.AbstractC65561PoD
    /* renamed from: LJIIIIZZ, reason: merged with bridge method [inline-methods] */
    public abstract Collection<E> LJII();

    @Override // java.util.Collection
    public void clear() {
        LJII().clear();
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return LJII().isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return LJII().iterator();
    }

    @Override // java.util.Collection
    public int size() {
        return LJII().size();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return LJII().toArray();
    }

    @Override // java.util.Collection
    public boolean add(E e) {
        return LJII().add(e);
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        return LJII().addAll(collection);
    }

    public boolean contains(Object obj) {
        return LJII().contains(obj);
    }

    public boolean containsAll(Collection<?> collection) {
        return LJII().containsAll(collection);
    }

    public boolean remove(Object obj) {
        return LJII().remove(obj);
    }

    public boolean removeAll(Collection<?> collection) {
        return LJII().removeAll(collection);
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        return LJII().retainAll(collection);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) LJII().toArray(tArr);
    }
}
