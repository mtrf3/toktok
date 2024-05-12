package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.PrD, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC65747PrD<T> implements Iterator<T> {
    public EnumC65748PrE LJLIL = EnumC65748PrE.NOT_READY;
    public T LJLILLLLZI;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        boolean z;
        T t;
        EnumC65748PrE enumC65748PrE = this.LJLIL;
        EnumC65748PrE enumC65748PrE2 = EnumC65748PrE.FAILED;
        if (enumC65748PrE != enumC65748PrE2) {
            z = true;
        } else {
            z = false;
        }
        C76917UGr.LJIILL(z);
        int ordinal = this.LJLIL.ordinal();
        if (ordinal == 0) {
            return true;
        }
        if (ordinal == 2) {
            return false;
        }
        this.LJLIL = enumC65748PrE2;
        C65746PrC c65746PrC = (C65746PrC) this;
        while (true) {
            if (c65746PrC.LJLJI.hasNext()) {
                AbstractC65743Pr9<? extends T> next = c65746PrC.LJLJI.next();
                if (next.isPresent()) {
                    t = next.get();
                    break;
                }
            } else {
                c65746PrC.LJLIL = EnumC65748PrE.DONE;
                t = null;
                break;
            }
        }
        this.LJLILLLLZI = t;
        if (this.LJLIL != EnumC65748PrE.DONE) {
            this.LJLIL = EnumC65748PrE.READY;
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    public final T next() {
        if (hasNext()) {
            this.LJLIL = EnumC65748PrE.NOT_READY;
            T t = this.LJLILLLLZI;
            this.LJLILLLLZI = null;
            return t;
        }
        throw new NoSuchElementException();
    }
}
