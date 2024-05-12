package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.jvm.internal.o;

/* renamed from: X.1Ri, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C33021Ri extends AbstractC13490fx implements List<InterfaceC13460fu>, InterfaceC90533gv {
    public final /* synthetic */ List<InterfaceC13460fu> LJLILLLLZI;
    public final List<InterfaceC13460fu> LJLJI;

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, InterfaceC13460fu interfaceC13460fu) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends InterfaceC13460fu> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends InterfaceC13460fu> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<? extends Object> elements) {
        o.LJIIIZ(elements, "elements");
        return this.LJLILLLLZI.containsAll(elements);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.LJLILLLLZI.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<InterfaceC13460fu> iterator() {
        return this.LJLILLLLZI.iterator();
    }

    @Override // java.util.List
    public final ListIterator<InterfaceC13460fu> listIterator() {
        return this.LJLILLLLZI.listIterator();
    }

    @Override // java.util.List
    public final ListIterator<InterfaceC13460fu> listIterator(int i) {
        return this.LJLILLLLZI.listIterator(i);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ InterfaceC13460fu remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator<InterfaceC13460fu> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ InterfaceC13460fu set(int i, InterfaceC13460fu interfaceC13460fu) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void sort(Comparator<? super InterfaceC13460fu> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List<InterfaceC13460fu> subList(int i, int i2) {
        return this.LJLILLLLZI.subList(i, i2);
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
    public final int hashCode() {
        return this.LJLJI.hashCode();
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.LJLILLLLZI.size();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FontListFontFamily(fonts=");
        return C1NE.LIZIZ(LIZ, this.LJLJI, ')', LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C33021Ri(List<? extends InterfaceC13460fu> list) {
        this.LJLILLLLZI = list;
        if (!list.isEmpty()) {
            this.LJLJI = new ArrayList(list);
        } else {
            "At least one font should be passed to FontFamily".toString();
            throw new IllegalStateException("At least one font should be passed to FontFamily");
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object element) {
        if (!(element instanceof InterfaceC13460fu)) {
            return false;
        }
        o.LJIIIZ(element, "element");
        return this.LJLILLLLZI.contains(element);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C33021Ri) && o.LJ(this.LJLJI, ((C33021Ri) obj).LJLJI)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0fu, java.lang.Object] */
    @Override // java.util.List
    public final InterfaceC13460fu get(int i) {
        return ListProtector.get(this.LJLILLLLZI, i);
    }

    @Override // java.util.List
    public final int indexOf(Object element) {
        if (!(element instanceof InterfaceC13460fu)) {
            return -1;
        }
        o.LJIIIZ(element, "element");
        return this.LJLILLLLZI.indexOf(element);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object element) {
        if (!(element instanceof InterfaceC13460fu)) {
            return -1;
        }
        o.LJIIIZ(element, "element");
        return this.LJLILLLLZI.lastIndexOf(element);
    }
}
