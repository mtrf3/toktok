package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.o;

/* renamed from: X.1rW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C46141rW<V> implements List<V>, ORO {
    public final /* synthetic */ List LJLIL;

    public C46141rW() {
        this(false);
    }

    @Override // java.util.List
    public final void add(int i, V v) {
        ListProtector.add(this.LJLIL, i, v);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(V v) {
        return this.LJLIL.add(v);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends V> elements) {
        o.LJIIJ(elements, "elements");
        return this.LJLIL.addAll(i, elements);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends V> elements) {
        o.LJIIJ(elements, "elements");
        return this.LJLIL.addAll(elements);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.LJLIL.clear();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return this.LJLIL.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<? extends Object> elements) {
        o.LJIIJ(elements, "elements");
        return this.LJLIL.containsAll(elements);
    }

    @Override // java.util.List
    public final V get(int i) {
        return (V) ListProtector.get(this.LJLIL, i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.LJLIL.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.LJLIL.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<V> iterator() {
        return this.LJLIL.iterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return this.LJLIL.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator<V> listIterator() {
        return this.LJLIL.listIterator();
    }

    @Override // java.util.List
    public final ListIterator<V> listIterator(int i) {
        return this.LJLIL.listIterator(i);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        return this.LJLIL.remove(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<? extends Object> elements) {
        o.LJIIJ(elements, "elements");
        return this.LJLIL.removeAll(elements);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<? extends Object> elements) {
        o.LJIIJ(elements, "elements");
        return this.LJLIL.retainAll(elements);
    }

    @Override // java.util.List
    public final V set(int i, V v) {
        return (V) ListProtector.set(this.LJLIL, i, v);
    }

    @Override // java.util.List
    public final List<V> subList(int i, int i2) {
        return this.LJLIL.subList(i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return ORX.LIZIZ(this);
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) ORX.LIZJ(this, tArr);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.LJLIL.size();
    }

    public C46141rW(boolean z) {
        List arrayList;
        if (z) {
            arrayList = Collections.synchronizedList(new ArrayList());
            o.LJFF(arrayList, "Collections.synchronizedList(mutableListOf())");
        } else {
            arrayList = new ArrayList();
        }
        this.LJLIL = arrayList;
    }

    @Override // java.util.List
    public final V remove(int i) {
        return (V) ListProtector.remove(this.LJLIL, i);
    }
}
