package X;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* renamed from: X.PmO, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65448PmO<K, V> implements Iterator<Map.Entry<K, V>> {
    public boolean LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ C65446PmM LJLJI;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.LJLILLLLZI < this.LJLJI.LJLIL) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.LJLILLLLZI;
        C65446PmM c65446PmM = this.LJLJI;
        if (i != c65446PmM.LJLIL) {
            this.LJLILLLLZI = i + 1;
            return new C65449PmP(c65446PmM, i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.LJLILLLLZI - 1;
        if (!this.LJLIL && i >= 0) {
            this.LJLJI.LIZJ(i << 1);
            this.LJLIL = true;
            return;
        }
        throw new IllegalArgumentException();
    }

    public C65448PmO(C65446PmM c65446PmM) {
        this.LJLJI = c65446PmM;
    }
}
