package X;

import Y.IDObjectS0S0101000;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.1bs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36441bs<T> implements java.util.Set<T>, InterfaceC90533gv {
    public int LJLIL;
    public Object[] LJLILLLLZI = new Object[16];

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return ORX.LIZIZ(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final <T> T[] toArray(T[] array) {
        o.LJIIIZ(array, "array");
        return (T[]) ORX.LIZJ(this, array);
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        C61898ORa.LJJIFFI(this.LJLILLLLZI, null);
        this.LJLIL = 0;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        if (this.LJLIL == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        return new IDObjectS0S0101000(this, 3);
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return this.LJLIL;
    }

    public final int LIZJ(Object obj) {
        int i = this.LJLIL - 1;
        int identityHashCode = System.identityHashCode(obj);
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            T t = get(i3);
            int identityHashCode2 = System.identityHashCode(t);
            if (identityHashCode2 < identityHashCode) {
                i2 = i3 + 1;
            } else {
                if (identityHashCode2 <= identityHashCode) {
                    if (t == obj) {
                        return i3;
                    }
                    for (int i4 = i3 - 1; -1 < i4; i4--) {
                        Object obj2 = this.LJLILLLLZI[i4];
                        if (obj2 == obj) {
                            return i4;
                        }
                        if (System.identityHashCode(obj2) != identityHashCode) {
                            break;
                        }
                    }
                    int i5 = i3 + 1;
                    int i6 = this.LJLIL;
                    while (true) {
                        if (i5 < i6) {
                            Object obj3 = this.LJLILLLLZI[i5];
                            if (obj3 == obj) {
                                return i5;
                            }
                            if (System.identityHashCode(obj3) != identityHashCode) {
                                break;
                            }
                            i5++;
                        } else {
                            i5 = this.LJLIL;
                            break;
                        }
                    }
                    return -(i5 + 1);
                }
                i = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(T value) {
        int i;
        o.LJIIIZ(value, "value");
        if (this.LJLIL > 0) {
            i = LIZJ(value);
            if (i >= 0) {
                return false;
            }
        } else {
            i = -1;
        }
        int i2 = -(i + 1);
        int i3 = this.LJLIL;
        Object[] objArr = this.LJLILLLLZI;
        if (i3 == objArr.length) {
            Object[] objArr2 = new Object[objArr.length * 2];
            C61898ORa.LJIIZILJ(i2 + 1, i2, i3, objArr, objArr2);
            C61898ORa.LJIJJ(this.LJLILLLLZI, objArr2, 0, 0, i2, 6);
            this.LJLILLLLZI = objArr2;
        } else {
            C61898ORa.LJIIZILJ(i2 + 1, i2, i3, objArr, objArr);
        }
        this.LJLILLLLZI[i2] = value;
        this.LJLIL++;
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj == null || LIZJ(obj) < 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection<? extends Object> elements) {
        o.LJIIIZ(elements, "elements");
        if (elements.isEmpty()) {
            return true;
        }
        Iterator<? extends Object> it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final T get(int i) {
        T t = (T) this.LJLILLLLZI[i];
        o.LJII(t, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
        return t;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(T t) {
        int LIZJ;
        if (t == null || (LIZJ = LIZJ(t)) < 0) {
            return false;
        }
        int i = this.LJLIL;
        if (LIZJ < i - 1) {
            Object[] objArr = this.LJLILLLLZI;
            C61898ORa.LJIIZILJ(LIZJ, LIZJ + 1, i, objArr, objArr);
        }
        int i2 = this.LJLIL - 1;
        this.LJLIL = i2;
        this.LJLILLLLZI[i2] = null;
        return true;
    }
}
