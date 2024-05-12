package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.OQa, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61872OQa implements Collection<C61874OQc>, InterfaceC90533gv {
    public final int[] LJLIL;

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(C61874OQc c61874OQc) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends C61874OQc> collection) {
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
    public final Iterator<C61874OQc> iterator() {
        return new C61873OQb(this.LJLIL);
    }

    @Override // java.util.Collection
    public final int size() {
        return this.LJLIL.length;
    }

    public final String toString() {
        int[] iArr = this.LJLIL;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UIntArray(storage=");
        LIZ.append(Arrays.toString(iArr));
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public /* synthetic */ C61872OQa(int[] iArr) {
        this.LJLIL = iArr;
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof C61874OQc)) {
            return false;
        }
        return ORY.LJJIJ(((C61874OQc) obj).LJLIL, this.LJLIL);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection<? extends Object> elements) {
        o.LJIIIZ(elements, "elements");
        int[] iArr = this.LJLIL;
        if (elements.isEmpty()) {
            return true;
        }
        for (Object obj : elements) {
            if (!(obj instanceof C61874OQc) || !ORY.LJJIJ(((C61874OQc) obj).LJLIL, iArr)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        int[] iArr = this.LJLIL;
        if (!(obj instanceof C61872OQa) || !o.LJ(iArr, ((C61872OQa) obj).LJLIL)) {
            return false;
        }
        return true;
    }
}
