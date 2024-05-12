package X;

import X.AbstractC65694PqM;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* renamed from: X.PqR, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C65699PqR<K, V> extends AbstractC65681Pq9<K, Collection<V>> {
    public final /* synthetic */ AbstractC65694PqM.c LJLIL;

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<K, Collection<V>>> iterator() {
        return new C65700PqS(this.LJLIL);
    }

    public C65699PqR(AbstractC65694PqM.c cVar) {
        this.LJLIL = cVar;
    }

    @Override // X.AbstractC65681Pq9, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        java.util.Set<Map.Entry<K, Collection<V>>> entrySet = this.LJLIL.LJLJI.entrySet();
        entrySet.getClass();
        try {
            return entrySet.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Collection<V> collection;
        if (!contains(obj)) {
            return false;
        }
        AbstractC65694PqM abstractC65694PqM = AbstractC65694PqM.this;
        Object key = ((Map.Entry) obj).getKey();
        java.util.Map<K, Collection<V>> map = abstractC65694PqM.LJLJJLL;
        map.getClass();
        try {
            collection = map.remove(key);
        } catch (ClassCastException | NullPointerException unused) {
            collection = null;
        }
        Collection<V> collection2 = collection;
        if (collection2 != null) {
            int size = collection2.size();
            collection2.clear();
            abstractC65694PqM.LJLJL -= size;
            return true;
        }
        return true;
    }
}
