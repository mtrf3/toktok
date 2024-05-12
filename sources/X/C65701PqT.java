package X;

import X.AbstractC65694PqM;
import defpackage.g0;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [K] */
/* renamed from: X.PqT, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65701PqT<K> implements Iterator<K> {
    public Map.Entry<K, Collection<V>> LJLIL;
    public final /* synthetic */ Iterator LJLILLLLZI;
    public final /* synthetic */ AbstractC65694PqM.e LJLJI;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.LJLILLLLZI.hasNext();
    }

    @Override // java.util.Iterator
    public final K next() {
        Map.Entry<K, Collection<V>> entry = (Map.Entry) this.LJLILLLLZI.next();
        this.LJLIL = entry;
        return entry.getKey();
    }

    @Override // java.util.Iterator
    public final void remove() {
        boolean z;
        if (this.LJLIL != null) {
            z = true;
        } else {
            z = false;
        }
        g0.LJIIJ(z);
        Collection collection = (Collection) this.LJLIL.getValue();
        this.LJLILLLLZI.remove();
        AbstractC65694PqM.this.LJLJL -= collection.size();
        collection.clear();
        this.LJLIL = null;
    }

    public C65701PqT(AbstractC65694PqM.e eVar, Iterator it) {
        this.LJLJI = eVar;
        this.LJLILLLLZI = it;
    }
}
