package X;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.o;

/* renamed from: X.F8r, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38489F8r<T> implements Iterator<T>, InterfaceC90533gv {
    public final T[] LJLIL;
    public int LJLILLLLZI;

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.LJLILLLLZI < this.LJLIL.length) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final T next() {
        try {
            T[] tArr = this.LJLIL;
            int i = this.LJLILLLLZI;
            this.LJLILLLLZI = i + 1;
            return tArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.LJLILLLLZI--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public C38489F8r(T[] array) {
        o.LJIIIZ(array, "array");
        this.LJLIL = array;
    }
}
