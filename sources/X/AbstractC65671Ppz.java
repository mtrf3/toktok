package X;

import java.util.Collection;

/* renamed from: X.Ppz, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC65671Ppz<E> extends AbstractC65680Pq8<E> {
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        ((C65691PqJ) this).LJLIL.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return ((C65691PqJ) this).LJLIL.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return ((C65691PqJ) this).LJLIL.entrySet().size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return ((C65691PqJ) this).LJLIL.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection<?> collection) {
        return ((C65691PqJ) this).LJLIL.containsAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (((C65691PqJ) this).LJLIL.remove(obj, Integer.MAX_VALUE) > 0) {
            return true;
        }
        return false;
    }
}
