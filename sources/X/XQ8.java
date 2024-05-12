package X;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* loaded from: classes16.dex */
public final class XQ8<K, V> extends XQ3<K, V>.c<Map.Entry<K, V>> {
    public final /* synthetic */ XQ3 LJLILLLLZI;

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<K, V>> iterator() {
        return new XQI(this.LJLILLLLZI);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Map.Entry entry;
        Object key;
        Object obj2;
        if (!(obj instanceof Map.Entry) || (key = (entry = (Map.Entry) obj).getKey()) == null || (obj2 = this.LJLILLLLZI.get(key)) == null || !this.LJLILLLLZI.LJLJJLL.LIZJ(entry.getValue(), obj2)) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Map.Entry entry;
        Object key;
        if (!(obj instanceof Map.Entry) || (key = (entry = (Map.Entry) obj).getKey()) == null || !this.LJLILLLLZI.remove(key, entry.getValue())) {
            return false;
        }
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XQ8(XQ3 xq3, ConcurrentMap<?, ?> concurrentMap) {
        super(concurrentMap);
        this.LJLILLLLZI = xq3;
    }
}
