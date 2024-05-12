package X;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OQT implements Iterator<C61876OQe>, InterfaceC90533gv {
    public final long[] LJLIL;
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
    public final C61876OQe next() {
        int i = this.LJLILLLLZI;
        long[] jArr = this.LJLIL;
        if (i < jArr.length) {
            this.LJLILLLLZI = i + 1;
            return new C61876OQe(jArr[i]);
        }
        throw new NoSuchElementException(String.valueOf(this.LJLILLLLZI));
    }

    public OQT(long[] array) {
        o.LJIIIZ(array, "array");
        this.LJLIL = array;
    }
}
