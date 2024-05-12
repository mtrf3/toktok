package X;

import java.util.NoSuchElementException;

/* renamed from: X.PqX, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC65705PqX<T> extends AbstractC65557Po9<T> {
    public T LJLIL;

    public abstract InterfaceC84796XPs LIZ(Object obj);

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

    public AbstractC65705PqX(T t) {
        this.LJLIL = t;
    }
}
