package X;

import X.AbstractC65694PqM;
import defpackage.g0;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* renamed from: X.PqS, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C65700PqS<K, V> implements Iterator<Map.Entry<K, Collection<V>>> {
    public final Iterator<Map.Entry<K, Collection<V>>> LJLIL;
    public Collection<V> LJLILLLLZI;
    public final /* synthetic */ AbstractC65694PqM.c LJLJI;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.LJLIL.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry<K, Collection<V>> next = this.LJLIL.next();
        this.LJLILLLLZI = next.getValue();
        return this.LJLJI.LIZ(next);
    }

    @Override // java.util.Iterator
    public final void remove() {
        boolean z;
        if (this.LJLILLLLZI != null) {
            z = true;
        } else {
            z = false;
        }
        g0.LJIIJ(z);
        this.LJLIL.remove();
        AbstractC65694PqM.this.LJLJL -= this.LJLILLLLZI.size();
        this.LJLILLLLZI.clear();
        this.LJLILLLLZI = null;
    }

    public C65700PqS(AbstractC65694PqM.c cVar) {
        this.LJLJI = cVar;
        this.LJLIL = cVar.LJLJI.entrySet().iterator();
    }
}
