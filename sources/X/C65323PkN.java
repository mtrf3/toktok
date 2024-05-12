package X;

import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: Add missing generic type declarations: [T] */
/* renamed from: X.PkN, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65323PkN<T> implements Iterator<T> {
    public final int LJLIL;
    public int LJLILLLLZI = 0;
    public final /* synthetic */ C65322PkM LJLJI;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.LJLILLLLZI < this.LJLIL) {
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
            Object obj = this.LJLJI.LJLIL;
            int i = this.LJLILLLLZI;
            this.LJLILLLLZI = i + 1;
            return (T) Array.get(obj, i);
        }
        throw new NoSuchElementException();
    }

    public C65323PkN(C65322PkM c65322PkM) {
        this.LJLJI = c65322PkM;
        this.LJLIL = Array.getLength(c65322PkM.LJLIL);
    }
}
