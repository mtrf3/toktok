package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.VKk, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC79562VKk<T> implements Iterator<T> {
    public T LJLIL;

    public abstract InterfaceC84816XQm LIZ(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.LJLIL != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (hasNext()) {
            try {
                T t = this.LJLIL;
                this.LJLIL = (T) LIZ(t);
                return t;
            } catch (Throwable th) {
                this.LJLIL = (T) LIZ(this.LJLIL);
                throw th;
            }
        }
        throw new NoSuchElementException();
    }

    public AbstractC79562VKk(T t) {
        this.LJLIL = t;
    }
}
