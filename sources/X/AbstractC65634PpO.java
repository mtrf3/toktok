package X;

import java.util.AbstractCollection;
import java.util.Map;

/* renamed from: X.PpO, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC65634PpO<K, V> extends AbstractCollection<Map.Entry<K, V>> {
    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        AbstractC65632PpM.this.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return AbstractC65632PpM.this.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            return AbstractC65632PpM.this.containsEntry(entry.getKey(), entry.getValue());
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            return AbstractC65632PpM.this.remove(entry.getKey(), entry.getValue());
        }
        return false;
    }
}
