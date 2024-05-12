package X;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OQV implements Iterator<OQW>, InterfaceC90533gv {
    public final byte[] LJLIL;
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
    public final OQW next() {
        int i = this.LJLILLLLZI;
        byte[] bArr = this.LJLIL;
        if (i < bArr.length) {
            this.LJLILLLLZI = i + 1;
            return new OQW(bArr[i]);
        }
        throw new NoSuchElementException(String.valueOf(this.LJLILLLLZI));
    }

    public OQV(byte[] array) {
        o.LJIIIZ(array, "array");
        this.LJLIL = array;
    }
}
