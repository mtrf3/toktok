package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.Pr1, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C65735Pr1<V> extends AbstractC87649Yab<List<? extends V>> implements List<V>, ORO {
    public final List<V> LJLJI;

    public int LJII() {
        return this.LJLJI.size();
    }

    public boolean contains(Object obj) {
        return this.LJLJI.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<? extends Object> elements) {
        o.LJIIIZ(elements, "elements");
        return this.LJLJI.containsAll(elements);
    }

    @Override // java.util.List
    public final V get(int i) {
        return (V) ListProtector.get(this.LJLJI, i);
    }

    public int indexOf(Object obj) {
        return this.LJLJI.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.LJLJI.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<V> iterator() {
        return this.LJLJI.iterator();
    }

    public int lastIndexOf(Object obj) {
        return this.LJLJI.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator<V> listIterator() {
        return this.LJLJI.listIterator();
    }

    @Override // java.util.List
    public final ListIterator<V> listIterator(int i) {
        return this.LJLJI.listIterator(i);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<? extends Object> elements) {
        o.LJIIIZ(elements, "elements");
        return this.LJLJI.retainAll(elements);
    }

    @Override // java.util.List
    public final List<V> subList(int i, int i2) {
        return this.LJLJI.subList(i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return ORX.LIZIZ(this);
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] array) {
        o.LJIIIZ(array, "array");
        return (T[]) ORX.LIZJ(this, array);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.LJLJI.clear();
        LIZJ(this);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return LJII();
    }

    public C65735Pr1(List<V> delegate) {
        o.LJIIIZ(delegate, "delegate");
        this.LJLJI = delegate;
    }

    public V LJIIIIZZ(int i) {
        V v = (V) ListProtector.remove(this.LJLJI, i);
        LIZJ(this);
        return v;
    }

    public boolean add(V v) {
        boolean add = this.LJLJI.add(v);
        LIZJ(this);
        return add;
    }

    public boolean addAll(Collection<? extends V> elements) {
        o.LJIIIZ(elements, "elements");
        boolean addAll = this.LJLJI.addAll(elements);
        LIZJ(this);
        return addAll;
    }

    public boolean remove(Object obj) {
        boolean remove = this.LJLJI.remove(obj);
        LIZJ(this);
        return remove;
    }

    public boolean removeAll(Collection<? extends Object> elements) {
        o.LJIIIZ(elements, "elements");
        boolean removeAll = this.LJLJI.removeAll(elements);
        LIZJ(this);
        return removeAll;
    }

    public /* synthetic */ C65735Pr1(int i) {
        this(new CopyOnWriteArrayList());
    }

    @Override // java.util.List
    public final /* bridge */ V remove(int i) {
        return LJIIIIZZ(i);
    }

    public void add(int i, V v) {
        ListProtector.add(this.LJLJI, i, v);
        LIZJ(this);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends V> elements) {
        o.LJIIIZ(elements, "elements");
        boolean addAll = this.LJLJI.addAll(i, elements);
        LIZJ(this);
        return addAll;
    }

    @Override // java.util.List
    public final V set(int i, V v) {
        V v2 = (V) ListProtector.set(this.LJLJI, i, v);
        LIZJ(this);
        return v2;
    }
}
