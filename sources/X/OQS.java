package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OQS implements Collection<C61876OQe>, InterfaceC90533gv {
    public final long[] LJLIL;

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(C61876OQe c61876OQe) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends C61876OQe> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return ORX.LIZIZ(this);
    }

    @Override // java.util.Collection
    public final <T> T[] toArray(T[] array) {
        o.LJIIIZ(array, "array");
        return (T[]) ORX.LIZJ(this, array);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return Arrays.hashCode(this.LJLIL);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        if (this.LJLIL.length == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<C61876OQe> iterator() {
        return new OQT(this.LJLIL);
    }

    @Override // java.util.Collection
    public final int size() {
        return this.LJLIL.length;
    }

    public final String toString() {
        long[] jArr = this.LJLIL;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ULongArray(storage=");
        LIZ.append(Arrays.toString(jArr));
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public /* synthetic */ OQS(long[] jArr) {
        this.LJLIL = jArr;
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof C61876OQe)) {
            return false;
        }
        return ORY.LJJIJIIJI(((C61876OQe) obj).LJLIL, this.LJLIL);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection<? extends Object> elements) {
        o.LJIIIZ(elements, "elements");
        long[] jArr = this.LJLIL;
        if (elements.isEmpty()) {
            return true;
        }
        for (Object obj : elements) {
            if (!(obj instanceof C61876OQe) || !ORY.LJJIJIIJI(((C61876OQe) obj).LJLIL, jArr)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        long[] jArr = this.LJLIL;
        if (!(obj instanceof OQS) || !o.LJ(jArr, ((OQS) obj).LJLIL)) {
            return false;
        }
        return true;
    }
}
