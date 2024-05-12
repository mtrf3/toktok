package X;

import java.util.AbstractCollection;
import java.util.Iterator;

/* JADX INFO: Add missing generic type declarations: [V] */
/* renamed from: X.PpP, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C65635PpP<V> extends AbstractCollection<V> {
    public final /* synthetic */ AbstractC65632PpM LJLIL;

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.LJLIL.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<V> iterator() {
        return this.LJLIL.LJI();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.LJLIL.size();
    }

    public C65635PpP(AbstractC65632PpM abstractC65632PpM) {
        this.LJLIL = abstractC65632PpM;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.LJLIL.containsValue(obj);
    }
}
