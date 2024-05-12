package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.Qsr, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68397Qsr implements Iterator {
    public final /* synthetic */ Iterator LJLIL;
    public final /* synthetic */ Iterator LJLILLLLZI;

    public C68397Qsr(Iterator it, Iterator it2) {
        this.LJLIL = it;
        this.LJLILLLLZI = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.LJLIL.hasNext()) {
            return true;
        }
        return this.LJLILLLLZI.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (this.LJLIL.hasNext()) {
            return new C68376QsW(((Integer) this.LJLIL.next()).toString());
        }
        if (this.LJLILLLLZI.hasNext()) {
            return new C68376QsW((String) this.LJLILLLLZI.next());
        }
        throw new NoSuchElementException();
    }
}
