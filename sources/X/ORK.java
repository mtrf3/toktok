package X;

import java.util.NoSuchElementException;

/* loaded from: classes11.dex */
public final class ORK<E> extends AbstractC37961eK {
    public final E LJLJJI;

    @Override // java.util.ListIterator, java.util.Iterator
    public final E next() {
        if (hasNext()) {
            this.LJLILLLLZI++;
            return this.LJLJJI;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (hasPrevious()) {
            this.LJLILLLLZI--;
            return this.LJLJJI;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ORK(int i, Object obj) {
        super(i, 1, 1);
        this.LJLJJI = obj;
    }
}
