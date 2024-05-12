package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.OQt, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC61891OQt<T> implements Iterator<T>, InterfaceC90533gv {
    public EnumC61894OQw LJLIL = EnumC61894OQw.NotReady;
    public T LJLILLLLZI;

    public abstract void LIZ();

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        EnumC61894OQw enumC61894OQw = this.LJLIL;
        EnumC61894OQw enumC61894OQw2 = EnumC61894OQw.Failed;
        if (enumC61894OQw != enumC61894OQw2) {
            int ordinal = enumC61894OQw.ordinal();
            if (ordinal == 0) {
                return true;
            }
            if (ordinal != 2) {
                this.LJLIL = enumC61894OQw2;
                LIZ();
                if (this.LJLIL == EnumC61894OQw.Ready) {
                    return true;
                }
                return false;
            }
            return false;
        }
        "Failed requirement.".toString();
        throw new IllegalArgumentException("Failed requirement.");
    }

    @Override // java.util.Iterator
    public final T next() {
        if (hasNext()) {
            this.LJLIL = EnumC61894OQw.NotReady;
            return this.LJLILLLLZI;
        }
        throw new NoSuchElementException();
    }
}
