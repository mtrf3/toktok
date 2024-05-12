package X;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.o;

/* renamed from: X.1g3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C39031g3<E> implements Iterator<E>, InterfaceC90533gv {
    public Object LJLIL;
    public final java.util.Map<E, C15Z> LJLILLLLZI;
    public int LJLJI;

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.LJLJI < this.LJLILLLLZI.size()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final E next() {
        if (hasNext()) {
            E e = (E) this.LJLIL;
            this.LJLJI++;
            C15Z c15z = this.LJLILLLLZI.get(e);
            if (c15z != null) {
                this.LJLIL = c15z.LIZIZ;
                return e;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Hash code of an element (");
            LIZ.append(e);
            LIZ.append(") has changed after it was added to the persistent set.");
            throw new ConcurrentModificationException(X1D.LIZIZ(LIZ));
        }
        throw new NoSuchElementException();
    }

    public C39031g3(Object obj, C44541ow map) {
        o.LJIIIZ(map, "map");
        this.LJLIL = obj;
        this.LJLILLLLZI = map;
    }
}
