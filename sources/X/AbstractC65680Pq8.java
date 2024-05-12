package X;

import java.util.AbstractSet;
import java.util.Collection;

/* renamed from: X.Pq8, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC65680Pq8<E> extends AbstractSet<E> {
    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        return C65607Pox.LIZJ(this, collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        collection.getClass();
        return super.retainAll(collection);
    }
}
