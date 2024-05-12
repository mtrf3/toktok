package X;

import java.util.ListIterator;

/* renamed from: X.Ppa, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC65646Ppa<F, T> extends AbstractC65645PpZ<F, T> implements ListIterator<T> {
    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return ((ListIterator) this.LJLIL).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return ((ListIterator) this.LJLIL).nextIndex();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.ListIterator
    public final T previous() {
        return (T) LIZ(((ListIterator) this.LJLIL).previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return ((ListIterator) this.LJLIL).previousIndex();
    }

    public AbstractC65646Ppa(ListIterator<? extends F> listIterator) {
        super(listIterator);
    }

    @Override // java.util.ListIterator
    public final void add(T t) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void set(T t) {
        throw new UnsupportedOperationException();
    }
}
