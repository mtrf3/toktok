package X;

import java.util.NoSuchElementException;

/* renamed from: X.Poo, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC65598Poo<E> extends AbstractC65601Por<E> {
    public final int LJLIL;
    public int LJLILLLLZI;

    public abstract E LIZ(int i);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        if (this.LJLILLLLZI < this.LJLIL) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.LJLILLLLZI > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.LJLILLLLZI - 1;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final E next() {
        if (hasNext()) {
            int i = this.LJLILLLLZI;
            this.LJLILLLLZI = i + 1;
            return LIZ(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (hasPrevious()) {
            int i = this.LJLILLLLZI - 1;
            this.LJLILLLLZI = i;
            return LIZ(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.LJLILLLLZI;
    }

    public AbstractC65598Poo(int i, int i2) {
        C76917UGr.LJIIIIZZ(i2, i);
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
    }
}
