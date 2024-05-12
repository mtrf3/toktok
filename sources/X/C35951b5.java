package X;

import java.util.Iterator;

/* renamed from: X.1b5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C35951b5 implements Iterator<Object>, InterfaceC90533gv {
    public int LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ C24570xp LJLJI;

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.LJLIL < this.LJLILLLLZI) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            C24570xp c24570xp = this.LJLJI;
            Object[] objArr = c24570xp.LIZJ;
            int i = this.LJLIL;
            this.LJLIL = i + 1;
            return objArr[c24570xp.LJII(i)];
        }
        return null;
    }

    public C35951b5(int i, int i2, C24570xp c24570xp) {
        this.LJLILLLLZI = i2;
        this.LJLJI = c24570xp;
        this.LJLIL = i;
    }
}
