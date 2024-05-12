package X;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.PmR, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65451PmR extends AbstractSet<Map.Entry<String, Object>> {
    public final C65455PmV LJLIL;
    public final /* synthetic */ C65445PmL LJLILLLLZI;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.LJLILLLLZI.LJLIL.clear();
        this.LJLIL.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<String, Object>> iterator() {
        return new C65456PmW(this.LJLILLLLZI, this.LJLIL);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.LJLIL.size() + this.LJLILLLLZI.LJLIL.size();
    }

    public C65451PmR(C65445PmL c65445PmL) {
        this.LJLILLLLZI = c65445PmL;
        this.LJLIL = new C65455PmV(new C65452PmS(c65445PmL, c65445PmL.LJLILLLLZI.LIZIZ));
    }
}
