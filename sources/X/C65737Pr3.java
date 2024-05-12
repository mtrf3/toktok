package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.effectmanager.effect.model.ComposerNode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.o;

/* renamed from: X.Pr3, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65737Pr3 implements List<ComposerNode>, ORO {
    public final /* synthetic */ List<ComposerNode> LJLIL;
    public final /* synthetic */ C83328Wn6 LJLILLLLZI;

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends ComposerNode> elements) {
        o.LJIIIZ(elements, "elements");
        return this.LJLIL.addAll(i, elements);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends ComposerNode> elements) {
        o.LJIIIZ(elements, "elements");
        return this.LJLIL.addAll(elements);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<? extends Object> elements) {
        o.LJIIIZ(elements, "elements");
        return this.LJLIL.containsAll(elements);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.LJLIL.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<ComposerNode> iterator() {
        return this.LJLIL.iterator();
    }

    @Override // java.util.List
    public final ListIterator<ComposerNode> listIterator() {
        return this.LJLIL.listIterator();
    }

    @Override // java.util.List
    public final ListIterator<ComposerNode> listIterator(int i) {
        return this.LJLIL.listIterator(i);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<? extends Object> elements) {
        o.LJIIIZ(elements, "elements");
        return this.LJLIL.removeAll(elements);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<? extends Object> elements) {
        o.LJIIIZ(elements, "elements");
        return this.LJLIL.retainAll(elements);
    }

    @Override // java.util.List
    public final List<ComposerNode> subList(int i, int i2) {
        return this.LJLIL.subList(i, i2);
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
        ((ArrayList) this.LJLILLLLZI.LJLJL).clear();
        this.LJLILLLLZI.LJLJLLL.setValue(this);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.LJLIL.size();
    }

    public C65737Pr3(C83328Wn6 c83328Wn6) {
        this.LJLILLLLZI = c83328Wn6;
        this.LJLIL = c83328Wn6.LJLJL;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object element) {
        o.LJIIIZ(element, "element");
        boolean add = ((ArrayList) this.LJLILLLLZI.LJLJL).add(element);
        this.LJLILLLLZI.LJLJLLL.setValue(this);
        return add;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object element) {
        if (!(element instanceof ComposerNode)) {
            return false;
        }
        o.LJIIIZ(element, "element");
        return this.LJLIL.contains(element);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.effectmanager.effect.model.ComposerNode, java.lang.Object] */
    @Override // java.util.List
    public final ComposerNode get(int i) {
        return ListProtector.get(this.LJLIL, i);
    }

    @Override // java.util.List
    public final int indexOf(Object element) {
        if (!(element instanceof ComposerNode)) {
            return -1;
        }
        o.LJIIIZ(element, "element");
        return this.LJLIL.indexOf(element);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object element) {
        if (!(element instanceof ComposerNode)) {
            return -1;
        }
        o.LJIIIZ(element, "element");
        return this.LJLIL.lastIndexOf(element);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object element) {
        if (!(element instanceof ComposerNode)) {
            return false;
        }
        o.LJIIIZ(element, "element");
        boolean remove = ((ArrayList) this.LJLILLLLZI.LJLJL).remove(element);
        this.LJLILLLLZI.LJLJLLL.setValue(this);
        return remove;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.effectmanager.effect.model.ComposerNode, java.lang.Object] */
    @Override // java.util.List
    public final ComposerNode remove(int i) {
        return ListProtector.remove(this.LJLIL, i);
    }

    @Override // java.util.List
    public final void add(int i, ComposerNode element) {
        o.LJIIIZ(element, "element");
        ListProtector.add(this.LJLIL, i, element);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.ss.android.ugc.effectmanager.effect.model.ComposerNode, java.lang.Object] */
    @Override // java.util.List
    public final ComposerNode set(int i, ComposerNode element) {
        o.LJIIIZ(element, "element");
        return ListProtector.set(this.LJLIL, i, element);
    }
}
