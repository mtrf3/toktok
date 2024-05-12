package X;

import X.C0M9;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.0M4, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0M4<E> implements Collection<E>, java.util.Set<E> {
    public static final int[] LJLJJL = new int[0];
    public static final Object[] LJLJJLL = new Object[0];
    public static Object[] LJLJL;
    public static int LJLJLJ;
    public static Object[] LJLJLLL;
    public static int LJLL;
    public int[] LJLIL;
    public Object[] LJLILLLLZI;
    public int LJLJI;
    public C1HR LJLJJI;

    public C0M4() {
        this(0);
    }

    public final int LJIIIIZZ() {
        int i = this.LJLJI;
        if (i == 0) {
            return -1;
        }
        int LIZLLL = C60903NvH.LIZLLL(i, 0, this.LJLIL);
        if (LIZLLL < 0) {
            return LIZLLL;
        }
        if (this.LJLILLLLZI[LIZLLL] == null) {
            return LIZLLL;
        }
        int i2 = LIZLLL + 1;
        while (i2 < i && this.LJLIL[i2] == 0) {
            if (this.LJLILLLLZI[i2] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = LIZLLL - 1; i3 >= 0 && this.LJLIL[i3] == 0; i3--) {
            if (this.LJLILLLLZI[i3] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        int i = this.LJLJI;
        if (i != 0) {
            LJFF(this.LJLIL, this.LJLILLLLZI, i);
            this.LJLIL = LJLJJL;
            this.LJLILLLLZI = LJLJJLL;
            this.LJLJI = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.LJLIL;
        int i = this.LJLJI;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        if (this.LJLJI <= 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.1HR] */
    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<E> iterator() {
        if (this.LJLJJI == null) {
            this.LJLJJI = new C0M9<Object, Object>() { // from class: X.1HR
                @Override // X.C0M9
                public final void LIZ() {
                    C0M4.this.clear();
                }

                @Override // X.C0M9
                public final java.util.Map<Object, Object> LIZJ() {
                    throw new UnsupportedOperationException("not a map");
                }

                @Override // X.C0M9
                public final int LIZLLL() {
                    return C0M4.this.LJLJI;
                }

                @Override // X.C0M9
                public final int LJ(Object obj) {
                    return C0M4.this.indexOf(obj);
                }

                @Override // X.C0M9
                public final int LJFF(Object obj) {
                    return C0M4.this.indexOf(obj);
                }

                @Override // X.C0M9
                public final void LJII(int i) {
                    C0M4.this.LJIIIZ(i);
                }

                @Override // X.C0M9
                public final Object LIZIZ(int i, int i2) {
                    return C0M4.this.LJLILLLLZI[i];
                }

                @Override // X.C0M9
                public final void LJI(Object obj, Object obj2) {
                    C0M4.this.add(obj);
                }

                @Override // X.C0M9
                public final Object LJIIIIZZ(int i, Object obj) {
                    throw new UnsupportedOperationException("not a map");
                }
            };
        }
        C1HR c1hr = this.LJLJJI;
        if (c1hr.LIZIZ == null) {
            c1hr.LIZIZ = new C0M9.c();
        }
        return (Iterator<E>) c1hr.LIZIZ.iterator();
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        int i = this.LJLJI;
        Object[] objArr = new Object[i];
        System.arraycopy(this.LJLILLLLZI, 0, objArr, 0, i);
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.LJLJI * 14);
        sb.append('{');
        for (int i = 0; i < this.LJLJI; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object obj = this.LJLILLLLZI[i];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.LJLJI;
    }

    public C0M4(int i) {
        if (i == 0) {
            this.LJLIL = LJLJJL;
            this.LJLILLLLZI = LJLJJLL;
        } else {
            LIZJ(i);
        }
        this.LJLJI = 0;
    }

    public final void LIZJ(int i) {
        if (i == 8) {
            synchronized (C0M4.class) {
                Object[] objArr = LJLJLLL;
                if (objArr != null) {
                    this.LJLILLLLZI = objArr;
                    LJLJLLL = (Object[]) objArr[0];
                    this.LJLIL = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    LJLL--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C0M4.class) {
                Object[] objArr2 = LJLJL;
                if (objArr2 != null) {
                    this.LJLILLLLZI = objArr2;
                    LJLJL = (Object[]) objArr2[0];
                    this.LJLIL = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    LJLJLJ--;
                    return;
                }
            }
        }
        this.LJLIL = new int[i];
        this.LJLILLLLZI = new Object[i];
    }

    public final void LJIIIZ(int i) {
        Object[] objArr = this.LJLILLLLZI;
        int i2 = this.LJLJI;
        if (i2 <= 1) {
            LJFF(this.LJLIL, objArr, i2);
            this.LJLIL = LJLJJL;
            this.LJLILLLLZI = LJLJJLL;
            this.LJLJI = 0;
            return;
        }
        int[] iArr = this.LJLIL;
        int i3 = 8;
        if (iArr.length > 8 && i2 < iArr.length / 3) {
            if (i2 > 8) {
                i3 = i2 + (i2 >> 1);
            }
            LIZJ(i3);
            this.LJLJI--;
            if (i > 0) {
                System.arraycopy(iArr, 0, this.LJLIL, 0, i);
                System.arraycopy(objArr, 0, this.LJLILLLLZI, 0, i);
            }
            int i4 = this.LJLJI;
            if (i >= i4) {
                return;
            }
            int i5 = i + 1;
            System.arraycopy(iArr, i5, this.LJLIL, i, i4 - i);
            System.arraycopy(objArr, i5, this.LJLILLLLZI, i, this.LJLJI - i);
            return;
        }
        int i6 = i2 - 1;
        this.LJLJI = i6;
        if (i < i6) {
            int i7 = i + 1;
            System.arraycopy(iArr, i7, iArr, i, i6 - i);
            Object[] objArr2 = this.LJLILLLLZI;
            System.arraycopy(objArr2, i7, objArr2, i, this.LJLJI - i);
        }
        this.LJLILLLLZI[this.LJLJI] = null;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(E e) {
        int hashCode;
        int LJII;
        if (e == null) {
            LJII = LJIIIIZZ();
            hashCode = 0;
        } else {
            hashCode = e.hashCode();
            LJII = LJII(hashCode, e);
        }
        if (LJII >= 0) {
            return false;
        }
        int i = ~LJII;
        int i2 = this.LJLJI;
        int[] iArr = this.LJLIL;
        if (i2 >= iArr.length) {
            int i3 = 8;
            if (i2 >= 8) {
                i3 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i3 = 4;
            }
            Object[] objArr = this.LJLILLLLZI;
            LIZJ(i3);
            int[] iArr2 = this.LJLIL;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.LJLILLLLZI, 0, objArr.length);
            }
            LJFF(iArr, objArr, this.LJLJI);
        }
        int i4 = this.LJLJI;
        if (i < i4) {
            int[] iArr3 = this.LJLIL;
            int i5 = i + 1;
            System.arraycopy(iArr3, i, iArr3, i5, i4 - i);
            Object[] objArr2 = this.LJLILLLLZI;
            System.arraycopy(objArr2, i, objArr2, i5, this.LJLJI - i);
        }
        this.LJLIL[i] = hashCode;
        this.LJLILLLLZI[i] = e;
        this.LJLJI++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection<? extends E> collection) {
        int size = collection.size() + this.LJLJI;
        int[] iArr = this.LJLIL;
        boolean z = false;
        if (iArr.length < size) {
            Object[] objArr = this.LJLILLLLZI;
            LIZJ(size);
            int i = this.LJLJI;
            if (i > 0) {
                System.arraycopy(iArr, 0, this.LJLIL, 0, i);
                System.arraycopy(objArr, 0, this.LJLILLLLZI, 0, this.LJLJI);
            }
            LJFF(iArr, objArr, this.LJLJI);
        }
        Iterator<? extends E> it = collection.iterator();
        while (it.hasNext()) {
            z |= add(it.next());
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof java.util.Set) {
            java.util.Set set = (java.util.Set) obj;
            if (this.LJLJI != set.size()) {
                return false;
            }
            for (int i = 0; i < this.LJLJI; i++) {
                try {
                    if (!set.contains(this.LJLILLLLZI[i])) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public final int indexOf(Object obj) {
        if (obj == null) {
            return LJIIIIZZ();
        }
        return LJII(obj.hashCode(), obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            LJIIIZ(indexOf);
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= remove(it.next());
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int i = this.LJLJI - 1; i >= 0; i--) {
            if (!collection.contains(this.LJLILLLLZI[i])) {
                LJIIIZ(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.LJLJI) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.LJLJI));
        }
        System.arraycopy(this.LJLILLLLZI, 0, tArr, 0, this.LJLJI);
        int length = tArr.length;
        int i = this.LJLJI;
        if (length > i) {
            tArr[i] = null;
        }
        return tArr;
    }

    public final int LJII(int i, Object obj) {
        int i2 = this.LJLJI;
        if (i2 == 0) {
            return -1;
        }
        int LIZLLL = C60903NvH.LIZLLL(i2, i, this.LJLIL);
        if (LIZLLL < 0) {
            return LIZLLL;
        }
        if (obj.equals(this.LJLILLLLZI[LIZLLL])) {
            return LIZLLL;
        }
        int i3 = LIZLLL + 1;
        while (i3 < i2 && this.LJLIL[i3] == i) {
            if (obj.equals(this.LJLILLLLZI[i3])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = LIZLLL - 1; i4 >= 0 && this.LJLIL[i4] == i; i4--) {
            if (obj.equals(this.LJLILLLLZI[i4])) {
                return i4;
            }
        }
        return ~i3;
    }

    public static void LJFF(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C0M4.class) {
                if (LJLL < 10) {
                    objArr[0] = LJLJLLL;
                    objArr[1] = iArr;
                    for (int i2 = i - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    LJLJLLL = objArr;
                    LJLL++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (C0M4.class) {
                if (LJLJLJ < 10) {
                    objArr[0] = LJLJL;
                    objArr[1] = iArr;
                    for (int i3 = i - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    LJLJL = objArr;
                    LJLJLJ++;
                }
            }
        }
    }
}
