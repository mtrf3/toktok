package X;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.o;

/* renamed from: X.OQb, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61873OQb implements Iterator<C61874OQc>, InterfaceC90533gv {
    public final int[] LJLIL;
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
    public final C61874OQc next() {
        int i = this.LJLILLLLZI;
        int[] iArr = this.LJLIL;
        if (i < iArr.length) {
            this.LJLILLLLZI = i + 1;
            return new C61874OQc(iArr[i]);
        }
        throw new NoSuchElementException(String.valueOf(this.LJLILLLLZI));
    }

    public C61873OQb(int[] array) {
        o.LJIIIZ(array, "array");
        this.LJLIL = array;
    }
}
