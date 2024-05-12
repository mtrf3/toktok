package X;

import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public abstract class OJN<E> extends OQZ<E> implements java.util.Set<E> {
    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int i;
        int i2 = 0;
        for (E e : this) {
            if (e != null) {
                i = e.hashCode();
            } else {
                i = 0;
            }
            i2 += i;
        }
        return i2;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof java.util.Set)) {
            return false;
        }
        java.util.Set other = (java.util.Set) obj;
        o.LJIIIZ(other, "other");
        if (size() != other.size()) {
            return false;
        }
        return containsAll(other);
    }
}
