package X;

import java.util.Iterator;

/* renamed from: X.PqD, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC65685PqD<T> extends AbstractC65561PoD implements Iterator<T> {
    @Override // java.util.Iterator
    public final boolean hasNext() {
        return ((C65684PqC) this).LJLILLLLZI.hasNext();
    }

    public T next() {
        return (T) ((C65684PqC) this).LJLILLLLZI.next();
    }
}
