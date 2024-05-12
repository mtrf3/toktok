package X;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.0M9, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0M9<K, V> {
    public C0M9<K, V>.b LIZ;
    public C0M9<K, V>.c LIZIZ;
    public C0M9<K, V>.e LIZJ;

    /* renamed from: X.0M9$b */
    /* loaded from: classes.dex */
    public final class b implements java.util.Set<Map.Entry<K, V>> {
        @Override // java.util.Set, java.util.Collection
        public final void clear() {
            C0M9.this.LIZ();
        }

        @Override // java.util.Set, java.util.Collection
        public final int hashCode() {
            int hashCode;
            int hashCode2;
            int i = 0;
            for (int LIZLLL = C0M9.this.LIZLLL() - 1; LIZLLL >= 0; LIZLLL--) {
                Object LIZIZ = C0M9.this.LIZIZ(LIZLLL, 0);
                Object LIZIZ2 = C0M9.this.LIZIZ(LIZLLL, 1);
                if (LIZIZ == null) {
                    hashCode = 0;
                } else {
                    hashCode = LIZIZ.hashCode();
                }
                if (LIZIZ2 == null) {
                    hashCode2 = 0;
                } else {
                    hashCode2 = LIZIZ2.hashCode();
                }
                i += hashCode ^ hashCode2;
            }
            return i;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean isEmpty() {
            if (C0M9.this.LIZLLL() == 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new C0M8(C0M9.this);
        }

        @Override // java.util.Set, java.util.Collection
        public final int size() {
            return C0M9.this.LIZLLL();
        }

        @Override // java.util.Set, java.util.Collection
        public final Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        public b() {
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int LIZLLL = C0M9.this.LIZLLL();
            for (Map.Entry<K, V> entry : collection) {
                C0M9.this.LJI(entry.getKey(), entry.getValue());
            }
            if (LIZLLL != C0M9.this.LIZLLL()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int LJ = C0M9.this.LJ(entry.getKey());
            if (LJ < 0) {
                return false;
            }
            Object LIZIZ = C0M9.this.LIZIZ(LJ, 1);
            Object value = entry.getValue();
            if (LIZIZ != value && (LIZIZ == null || !LIZIZ.equals(value))) {
                return false;
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean equals(Object obj) {
            return C0M9.LJIIIZ(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: X.0M9$c */
    /* loaded from: classes.dex */
    public final class c implements java.util.Set<K> {
        @Override // java.util.Set, java.util.Collection
        public final void clear() {
            C0M9.this.LIZ();
        }

        @Override // java.util.Set, java.util.Collection
        public final int hashCode() {
            int hashCode;
            int i = 0;
            for (int LIZLLL = C0M9.this.LIZLLL() - 1; LIZLLL >= 0; LIZLLL--) {
                Object LIZIZ = C0M9.this.LIZIZ(LIZLLL, 0);
                if (LIZIZ == null) {
                    hashCode = 0;
                } else {
                    hashCode = LIZIZ.hashCode();
                }
                i += hashCode;
            }
            return i;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean isEmpty() {
            if (C0M9.this.LIZLLL() == 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public final Iterator<K> iterator() {
            return new C0M7(C0M9.this, 0);
        }

        @Override // java.util.Set, java.util.Collection
        public final int size() {
            return C0M9.this.LIZLLL();
        }

        @Override // java.util.Set, java.util.Collection
        public final Object[] toArray() {
            C0M9 c0m9 = C0M9.this;
            int LIZLLL = c0m9.LIZLLL();
            Object[] objArr = new Object[LIZLLL];
            for (int i = 0; i < LIZLLL; i++) {
                objArr[i] = c0m9.LIZIZ(i, 0);
            }
            return objArr;
        }

        public c() {
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean contains(Object obj) {
            if (C0M9.this.LJ(obj) >= 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            java.util.Map<K, V> LIZJ = C0M9.this.LIZJ();
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!LIZJ.containsKey(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean equals(Object obj) {
            return C0M9.LJIIIZ(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean remove(Object obj) {
            int LJ = C0M9.this.LJ(obj);
            if (LJ >= 0) {
                C0M9.this.LJII(LJ);
                return true;
            }
            return false;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            java.util.Map<K, V> LIZJ = C0M9.this.LIZJ();
            int size = LIZJ.size();
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                LIZJ.remove(it.next());
            }
            if (size != LIZJ.size()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            return C0M9.LJIIJ(collection, C0M9.this.LIZJ());
        }

        @Override // java.util.Set, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) C0M9.this.LJIIJJI(0, tArr);
        }
    }

    /* renamed from: X.0M9$e */
    /* loaded from: classes.dex */
    public final class e implements Collection<V> {
        @Override // java.util.Collection
        public final void clear() {
            C0M9.this.LIZ();
        }

        @Override // java.util.Collection
        public final boolean isEmpty() {
            if (C0M9.this.LIZLLL() == 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            return new C0M7(C0M9.this, 1);
        }

        @Override // java.util.Collection
        public final int size() {
            return C0M9.this.LIZLLL();
        }

        @Override // java.util.Collection
        public final Object[] toArray() {
            C0M9 c0m9 = C0M9.this;
            int LIZLLL = c0m9.LIZLLL();
            Object[] objArr = new Object[LIZLLL];
            for (int i = 0; i < LIZLLL; i++) {
                objArr[i] = c0m9.LIZIZ(i, 1);
            }
            return objArr;
        }

        public e() {
        }

        @Override // java.util.Collection
        public final boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public final boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public final boolean contains(Object obj) {
            if (C0M9.this.LJFF(obj) >= 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public final boolean remove(Object obj) {
            int LJFF = C0M9.this.LJFF(obj);
            if (LJFF >= 0) {
                C0M9.this.LJII(LJFF);
                return true;
            }
            return false;
        }

        @Override // java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            int LIZLLL = C0M9.this.LIZLLL();
            int i = 0;
            boolean z = false;
            while (i < LIZLLL) {
                if (collection.contains(C0M9.this.LIZIZ(i, 1))) {
                    C0M9.this.LJII(i);
                    i--;
                    LIZLLL--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        @Override // java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            int LIZLLL = C0M9.this.LIZLLL();
            int i = 0;
            boolean z = false;
            while (i < LIZLLL) {
                if (!collection.contains(C0M9.this.LIZIZ(i, 1))) {
                    C0M9.this.LJII(i);
                    i--;
                    LIZLLL--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        @Override // java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) C0M9.this.LJIIJJI(1, tArr);
        }
    }

    public abstract void LIZ();

    public abstract Object LIZIZ(int i, int i2);

    public abstract java.util.Map<K, V> LIZJ();

    public abstract int LIZLLL();

    public abstract int LJ(Object obj);

    public abstract int LJFF(Object obj);

    public abstract void LJI(K k, V v);

    public abstract void LJII(int i);

    public abstract V LJIIIIZZ(int i, V v);

    public static <T> boolean LJIIIZ(java.util.Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof java.util.Set) {
            java.util.Set set2 = (java.util.Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static boolean LJIIJ(Collection collection, java.util.Map map) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        if (size != map.size()) {
            return true;
        }
        return false;
    }

    public final Object[] LJIIJJI(int i, Object[] objArr) {
        int LIZLLL = LIZLLL();
        if (objArr.length < LIZLLL) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), LIZLLL);
        }
        for (int i2 = 0; i2 < LIZLLL; i2++) {
            objArr[i2] = LIZIZ(i2, i);
        }
        if (objArr.length > LIZLLL) {
            objArr[LIZLLL] = null;
        }
        return objArr;
    }
}
