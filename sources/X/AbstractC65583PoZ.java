package X;

import defpackage.g0;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.SortedSet;

/* renamed from: X.PoZ, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC65583PoZ<E> extends AbstractC65578PoU<E> implements java.util.Set<E> {
    public transient AbstractC65590Pog<E> LJLILLLLZI;

    public static boolean shouldTrim(int i, int i2) {
        return i < (i2 >> 1) + (i2 >> 2);
    }

    public boolean LJIIIZ() {
        return this instanceof C65585Pob;
    }

    @Override // X.AbstractC65578PoU, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public abstract AbstractC65557Po9<E> iterator();

    public static <E> C65584Poa<E> builder() {
        return new C65584Poa<>();
    }

    @Override // X.AbstractC65578PoU
    public AbstractC65590Pog<E> asList() {
        AbstractC65590Pog<E> abstractC65590Pog = this.LJLILLLLZI;
        if (abstractC65590Pog == null) {
            AbstractC65590Pog<E> LJIIIIZZ = LJIIIIZZ();
            this.LJLILLLLZI = LJIIIIZZ;
            return LJIIIIZZ;
        }
        return abstractC65590Pog;
    }

    @Override // X.AbstractC65578PoU
    public Object writeReplace() {
        return new C65602Pos(toArray());
    }

    public AbstractC65590Pog<E> LJIIIIZZ() {
        Object[] array = toArray();
        return AbstractC65590Pog.LJII(array.length, array);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return C65607Pox.LIZIZ(this);
    }

    @Override // X.AbstractC65578PoU, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    public static <E> AbstractC65583PoZ<E> of() {
        return C65585Pob.LJLJLJ;
    }

    public static int LJII(int i) {
        int max = Math.max(i, 2);
        boolean z = true;
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (highestOneBit * 0.7d < max) {
                highestOneBit <<= 1;
            }
            return highestOneBit;
        }
        if (max >= 1073741824) {
            z = false;
        }
        C76917UGr.LIZJ("collection too large", z);
        return 1073741824;
    }

    public static <E> C65584Poa<E> builderWithExpectedSize(int i) {
        g0.LJIIIIZZ(i, "expectedSize");
        return new C65584Poa<>(i);
    }

    public static <E> AbstractC65583PoZ<E> copyOf(Iterator<? extends E> it) {
        if (!it.hasNext()) {
            return of();
        }
        E next = it.next();
        if (!it.hasNext()) {
            return of((Object) next);
        }
        C65584Poa c65584Poa = new C65584Poa();
        c65584Poa.LIZLLL(next);
        c65584Poa.LJ(it);
        return c65584Poa.LJFF();
    }

    public static <E> AbstractC65583PoZ<E> of(E e) {
        return new C65581PoX(e);
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AbstractC65583PoZ) && LJIIIZ() && ((AbstractC65583PoZ) obj).LJIIIZ() && hashCode() != obj.hashCode()) {
            return false;
        }
        return C65607Pox.LIZ(this, obj);
    }

    public static <E> AbstractC65583PoZ<E> copyOf(E[] eArr) {
        int length = eArr.length;
        if (length != 0) {
            if (length != 1) {
                return construct(eArr.length, (Object[]) eArr.clone());
            }
            return of((Object) eArr[0]);
        }
        return of();
    }

    public static <E> AbstractC65583PoZ<E> copyOf(Collection<? extends E> collection) {
        if ((collection instanceof AbstractC65583PoZ) && !(collection instanceof SortedSet)) {
            AbstractC65583PoZ<E> abstractC65583PoZ = (AbstractC65583PoZ) collection;
            if (!abstractC65583PoZ.LJFF()) {
                return abstractC65583PoZ;
            }
        }
        Object[] array = collection.toArray();
        return construct(array.length, array);
    }

    public static <E> AbstractC65583PoZ<E> copyOf(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return copyOf((Collection) iterable);
        }
        return copyOf(iterable.iterator());
    }

    public static <E> AbstractC65583PoZ<E> construct(int i, Object... objArr) {
        Object[] objArr2 = objArr;
        if (i != 0) {
            if (i != 1) {
                int LJII = LJII(i);
                Object[] objArr3 = new Object[LJII];
                int i2 = LJII - 1;
                int i3 = 0;
                int i4 = 0;
                for (int i5 = 0; i5 < i; i5++) {
                    Object obj = objArr2[i5];
                    if (obj != null) {
                        int hashCode = obj.hashCode();
                        int LJIJJ = C1FP.LJIJJ(hashCode);
                        while (true) {
                            int i6 = LJIJJ & i2;
                            Object obj2 = objArr3[i6];
                            if (obj2 == null) {
                                objArr2[i4] = obj;
                                objArr3[i6] = obj;
                                i3 += hashCode;
                                i4++;
                                break;
                            }
                            if (obj2.equals(obj)) {
                                break;
                            }
                            LJIJJ++;
                        }
                    } else {
                        throw new NullPointerException(KMP.LJ("at index ", i5));
                    }
                }
                Arrays.fill(objArr2, i4, i, (Object) null);
                if (i4 == 1) {
                    return new C65581PoX(i3, objArr2[0]);
                }
                if (LJII(i4) < LJII / 2) {
                    return construct(i4, objArr2);
                }
                if (shouldTrim(i4, objArr2.length)) {
                    objArr2 = Arrays.copyOf(objArr2, i4);
                }
                return new C65585Pob(i3, i2, i4, objArr2, objArr3);
            }
            return of(objArr2[0]);
        }
        return of();
    }

    public static <E> AbstractC65583PoZ<E> of(E e, E e2) {
        return construct(2, e, e2);
    }

    public static <E> AbstractC65583PoZ<E> of(E e, E e2, E e3) {
        return construct(3, e, e2, e3);
    }

    public static <E> AbstractC65583PoZ<E> of(E e, E e2, E e3, E e4) {
        return construct(4, e, e2, e3, e4);
    }

    public static <E> AbstractC65583PoZ<E> of(E e, E e2, E e3, E e4, E e5) {
        return construct(5, e, e2, e3, e4, e5);
    }

    public static <E> AbstractC65583PoZ<E> of(E e, E e2, E e3, E e4, E e5, E e6, E... eArr) {
        boolean z;
        if (eArr.length <= 2147483641) {
            z = true;
        } else {
            z = false;
        }
        C76917UGr.LIZJ("the total number of elements must fit in an int", z);
        int length = eArr.length + 6;
        Object[] objArr = new Object[length];
        objArr[0] = e;
        objArr[1] = e2;
        objArr[2] = e3;
        objArr[3] = e4;
        objArr[4] = e5;
        objArr[5] = e6;
        System.arraycopy(eArr, 0, objArr, 6, eArr.length);
        return construct(length, objArr);
    }
}
