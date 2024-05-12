package androidx.arch.core.internal;

import X.C014303v;
import X.C19X;
import X.InterfaceC014403w;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class SafeIterableMap<K, V> implements Iterable<Map.Entry<K, V>> {
    public C014303v<K, V> mEnd;
    public WeakHashMap<InterfaceC014403w<K, V>, Boolean> mIterators = new WeakHashMap<>();
    public int mSize = 0;
    public C014303v<K, V> mStart;

    /* loaded from: classes.dex */
    public class d implements Iterator<Map.Entry<K, V>>, InterfaceC014403w<K, V> {
        public C014303v<K, V> LJLIL;
        public boolean LJLILLLLZI = true;

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.LJLILLLLZI) {
                if (SafeIterableMap.this.mStart != null) {
                    return true;
                }
                return false;
            }
            C014303v<K, V> c014303v = this.LJLIL;
            if (c014303v != null && c014303v.LJLJI != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public final Object next() {
            C014303v<K, V> c014303v;
            if (this.LJLILLLLZI) {
                this.LJLILLLLZI = false;
                this.LJLIL = SafeIterableMap.this.mStart;
            } else {
                C014303v<K, V> c014303v2 = this.LJLIL;
                if (c014303v2 != null) {
                    c014303v = c014303v2.LJLJI;
                } else {
                    c014303v = null;
                }
                this.LJLIL = c014303v;
            }
            return this.LJLIL;
        }

        public d() {
        }

        @Override // X.InterfaceC014403w
        public final void LIZ(C014303v<K, V> c014303v) {
            boolean z;
            C014303v<K, V> c014303v2 = this.LJLIL;
            if (c014303v == c014303v2) {
                C014303v<K, V> c014303v3 = c014303v2.LJLJJI;
                this.LJLIL = c014303v3;
                if (c014303v3 == null) {
                    z = true;
                } else {
                    z = false;
                }
                this.LJLILLLLZI = z;
            }
        }
    }

    public Iterator<Map.Entry<K, V>> descendingIterator() {
        final C014303v<K, V> c014303v = this.mEnd;
        final C014303v<K, V> c014303v2 = this.mStart;
        C19X<K, V> c19x = new C19X<K, V>(c014303v, c014303v2) { // from class: X.1hU
            @Override // X.C19X
            public final C014303v<K, V> LIZIZ(C014303v<K, V> c014303v3) {
                return c014303v3.LJLJI;
            }

            @Override // X.C19X
            public final C014303v<K, V> LIZLLL(C014303v<K, V> c014303v3) {
                return c014303v3.LJLJJI;
            }
        };
        this.mIterators.put(c19x, Boolean.FALSE);
        return c19x;
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        final C014303v<K, V> c014303v = this.mStart;
        final C014303v<K, V> c014303v2 = this.mEnd;
        C19X<K, V> c19x = new C19X<K, V>(c014303v, c014303v2) { // from class: X.1hT
            @Override // X.C19X
            public final C014303v<K, V> LIZIZ(C014303v<K, V> c014303v3) {
                return c014303v3.LJLJJI;
            }

            @Override // X.C19X
            public final C014303v<K, V> LIZLLL(C014303v<K, V> c014303v3) {
                return c014303v3.LJLJI;
            }
        };
        this.mIterators.put(c19x, Boolean.FALSE);
        return c19x;
    }

    public SafeIterableMap<K, V>.d iteratorWithAdditions() {
        SafeIterableMap<K, V>.d dVar = new d();
        this.mIterators.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int i = 0;
        while (it.hasNext()) {
            i += it.next().hashCode();
        }
        return i;
    }

    public Map.Entry<K, V> eldest() {
        return this.mStart;
    }

    public Map.Entry<K, V> newest() {
        return this.mEnd;
    }

    public int size() {
        return this.mSize;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SafeIterableMap)) {
            return false;
        }
        SafeIterableMap safeIterableMap = (SafeIterableMap) obj;
        if (size() != safeIterableMap.size()) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = safeIterableMap.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry<K, V> next = it.next();
            Map.Entry<K, V> next2 = it2.next();
            if (next == null) {
                if (next2 != null) {
                    return false;
                }
            } else if (!next.equals(next2)) {
                return false;
            }
        }
        if (!it.hasNext() && !it2.hasNext()) {
            return true;
        }
        return false;
    }

    public C014303v<K, V> get(K k) {
        C014303v<K, V> c014303v = this.mStart;
        while (c014303v != null && !c014303v.LJLIL.equals(k)) {
            c014303v = c014303v.LJLJI;
        }
        return c014303v;
    }

    public V remove(K k) {
        C014303v<K, V> c014303v = get(k);
        if (c014303v == null) {
            return null;
        }
        this.mSize--;
        if (!this.mIterators.isEmpty()) {
            Iterator<InterfaceC014403w<K, V>> it = this.mIterators.keySet().iterator();
            while (it.hasNext()) {
                it.next().LIZ(c014303v);
            }
        }
        C014303v<K, V> c014303v2 = c014303v.LJLJJI;
        if (c014303v2 != null) {
            c014303v2.LJLJI = c014303v.LJLJI;
        } else {
            this.mStart = c014303v.LJLJI;
        }
        C014303v<K, V> c014303v3 = c014303v.LJLJI;
        if (c014303v3 != null) {
            c014303v3.LJLJJI = c014303v2;
        } else {
            this.mEnd = c014303v2;
        }
        c014303v.LJLJI = null;
        c014303v.LJLJJI = null;
        return c014303v.LJLILLLLZI;
    }

    public C014303v<K, V> put(K k, V v) {
        C014303v<K, V> c014303v = new C014303v<>(k, v);
        this.mSize++;
        C014303v<K, V> c014303v2 = this.mEnd;
        if (c014303v2 == null) {
            this.mStart = c014303v;
            this.mEnd = c014303v;
            return c014303v;
        }
        c014303v2.LJLJI = c014303v;
        c014303v.LJLJJI = c014303v2;
        this.mEnd = c014303v;
        return c014303v;
    }

    public V putIfAbsent(K k, V v) {
        C014303v<K, V> c014303v = get(k);
        if (c014303v != null) {
            return c014303v.LJLILLLLZI;
        }
        put(k, v);
        return null;
    }
}
