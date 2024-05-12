package X;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.PmV, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65455PmV extends AbstractSet<Map.Entry<String, Object>> {
    public final /* synthetic */ C65452PmS LJLIL;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Iterator<String> it = this.LJLIL.LJLILLLLZI.LIZLLL.iterator();
        while (it.hasNext()) {
            this.LJLIL.LJLILLLLZI.LIZ(it.next()).LIZLLL(this.LJLIL.LJLIL, null);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        Iterator<String> it = this.LJLIL.LJLILLLLZI.LIZLLL.iterator();
        while (it.hasNext()) {
            if (this.LJLIL.LJLILLLLZI.LIZ(it.next()).LIZ(this.LJLIL.LJLIL) != null) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C65457PmX(this.LJLIL);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Iterator<String> it = this.LJLIL.LJLILLLLZI.LIZLLL.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (this.LJLIL.LJLILLLLZI.LIZ(it.next()).LIZ(this.LJLIL.LJLIL) != null) {
                i++;
            }
        }
        return i;
    }

    public C65455PmV(C65452PmS c65452PmS) {
        this.LJLIL = c65452PmS;
    }
}
