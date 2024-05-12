package X;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OQP implements Iterator<OQQ>, InterfaceC90533gv {
    public final short[] LJLIL;
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
    public final OQQ next() {
        int i = this.LJLILLLLZI;
        short[] sArr = this.LJLIL;
        if (i < sArr.length) {
            this.LJLILLLLZI = i + 1;
            return new OQQ(sArr[i]);
        }
        throw new NoSuchElementException(String.valueOf(this.LJLILLLLZI));
    }

    public OQP(short[] array) {
        o.LJIIIZ(array, "array");
        this.LJLIL = array;
    }
}
