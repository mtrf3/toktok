package X;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.Pt7, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65865Pt7<E> extends AbstractC65780Prk<E> implements Serializable {
    public final C65864Pt6<E, ?> LJLIL;

    public C65865Pt7() {
        this(new C65864Pt6());
    }

    private final Object writeReplace() {
        if (this.LJLIL.isReadOnly$kotlin_stdlib()) {
            return new C65872PtE(this, 1);
        }
        throw new NotSerializableException("The set cannot be serialized while it is being built.");
    }

    public final java.util.Set<E> build() {
        this.LJLIL.build();
        return this;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.LJLIL.clear();
    }

    @Override // X.AbstractC65780Prk
    public int getSize() {
        return this.LJLIL.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.LJLIL.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return this.LJLIL.keysIterator$kotlin_stdlib();
    }

    public C65865Pt7(C65864Pt6<E, ?> backing) {
        o.LJIIIZ(backing, "backing");
        this.LJLIL = backing;
    }

    @Override // X.AbstractC65780Prk, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(E e) {
        if (this.LJLIL.addKey$kotlin_stdlib(e) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> elements) {
        o.LJIIIZ(elements, "elements");
        this.LJLIL.checkIsMutable$kotlin_stdlib();
        return super.addAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.LJLIL.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        if (this.LJLIL.removeKey$kotlin_stdlib(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection<? extends Object> elements) {
        o.LJIIIZ(elements, "elements");
        this.LJLIL.checkIsMutable$kotlin_stdlib();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection<? extends Object> elements) {
        o.LJIIIZ(elements, "elements");
        this.LJLIL.checkIsMutable$kotlin_stdlib();
        return super.retainAll(elements);
    }

    public C65865Pt7(int i) {
        this(new C65864Pt6(i));
    }
}
