package X;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes16.dex */
public final class XG5<K> implements Iterator<Map.Entry<K, Object>> {
    public final Iterator<Map.Entry<K, Object>> LJLIL;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.LJLIL.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        Map.Entry<K, Object> next = this.LJLIL.next();
        if (next.getValue() instanceof XRQ) {
            return new XRP(next);
        }
        return next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.LJLIL.remove();
    }

    public XG5(Iterator<Map.Entry<K, Object>> it) {
        this.LJLIL = it;
    }
}
