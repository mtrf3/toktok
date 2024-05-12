package X;

import java.util.NoSuchElementException;

/* loaded from: classes16.dex */
public final class YV6 extends YV5 {
    public boolean LJLIL;
    public final /* synthetic */ Object LJLILLLLZI;

    public YV6(Object obj) {
        this.LJLILLLLZI = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.LJLIL;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.LJLIL) {
            this.LJLIL = true;
            return this.LJLILLLLZI;
        }
        throw new NoSuchElementException();
    }
}
