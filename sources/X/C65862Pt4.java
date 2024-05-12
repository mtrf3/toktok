package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.Pt4, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65862Pt4<K, V> extends AbstractC65780Prk<Map.Entry<Object, Object>> {
    public final C65864Pt6<K, V> LJLIL;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.LJLIL.clear();
    }

    @Override // X.AbstractC65780Prk
    public final int getSize() {
        return this.LJLIL.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.LJLIL.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<K, V>> iterator() {
        return this.LJLIL.entriesIterator$kotlin_stdlib();
    }

    public C65862Pt4(C65864Pt6<K, V> backing) {
        o.LJIIIZ(backing, "backing");
        this.LJLIL = backing;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: LIZJ, reason: merged with bridge method [inline-methods] */
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry<? extends K, ? extends V> element = (Map.Entry) obj;
        o.LJIIIZ(element, "element");
        return this.LJLIL.containsEntry$kotlin_stdlib(element);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: LJII, reason: merged with bridge method [inline-methods] */
    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry<? extends K, ? extends V> element = (Map.Entry) obj;
        o.LJIIIZ(element, "element");
        return this.LJLIL.removeEntry$kotlin_stdlib(element);
    }

    @Override // X.AbstractC65780Prk, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object element) {
        o.LJIIIZ(element, "element");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection<? extends Map.Entry<K, V>> elements) {
        o.LJIIIZ(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection<? extends Object> elements) {
        o.LJIIIZ(elements, "elements");
        return this.LJLIL.containsAllEntries$kotlin_stdlib(elements);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection<? extends Object> elements) {
        o.LJIIIZ(elements, "elements");
        this.LJLIL.checkIsMutable$kotlin_stdlib();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection<? extends Object> elements) {
        o.LJIIIZ(elements, "elements");
        this.LJLIL.checkIsMutable$kotlin_stdlib();
        return super.retainAll(elements);
    }
}
