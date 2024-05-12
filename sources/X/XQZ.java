package X;

import java.util.Iterator;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: Add missing generic type declarations: [K] */
/* loaded from: classes16.dex */
public final class XQZ<K> extends ConcurrentMapC84812XQi<K, V>.c<K> {
    public final /* synthetic */ ConcurrentMapC84812XQi LJLILLLLZI;

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<K> iterator() {
        return new C84804XQa(this.LJLILLLLZI);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.LJLIL.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (this.LJLIL.remove(obj) != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XQZ(ConcurrentMapC84812XQi concurrentMapC84812XQi, ConcurrentMap<?, ?> concurrentMap) {
        super(concurrentMap);
        this.LJLILLLLZI = concurrentMapC84812XQi;
    }
}
