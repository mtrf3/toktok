package X;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.1ox, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C44551ox<K, V> extends AbstractMap<Object, Object> implements java.util.Map<Object, Object>, EHO {
    public C44541ow<K, V> LJLIL;
    public C17P LJLILLLLZI;
    public C14U<K, V> LJLJI;
    public V LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;

    public final C44541ow<K, V> LIZ() {
        C14U<K, V> c14u = this.LJLJI;
        C44541ow<K, V> c44541ow = this.LJLIL;
        if (c14u != c44541ow.LJLIL) {
            this.LJLILLLLZI = new C17P();
            c44541ow = new C44541ow<>(this.LJLJI, this.LJLJJLL);
        }
        this.LJLIL = c44541ow;
        return c44541ow;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        C14U<K, V> c14u = C14U.LJ;
        o.LJII(c14u, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.LJLJI = c14u;
        LIZIZ(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set<Map.Entry<Object, Object>> entrySet() {
        return new AbstractC65780Prk<Map.Entry<Object, Object>>(this) { // from class: X.2HK
            public final C44551ox<K, V> LJLIL;

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final void clear() {
                this.LJLIL.clear();
            }

            @Override // X.AbstractC65780Prk
            public final int getSize() {
                return this.LJLIL.LJLJJLL;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final Iterator<Map.Entry<K, V>> iterator() {
                return new C38691fV(this.LJLIL);
            }

            {
                o.LJIIIZ(this, "builder");
                this.LJLIL = this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            /* renamed from: LIZJ, reason: merged with bridge method [inline-methods] */
            public final boolean contains(Object obj) {
                Map.Entry entry;
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry element = (Map.Entry) obj;
                o.LJIIIZ(element, "element");
                if (element instanceof Object) {
                    entry = element;
                } else {
                    entry = null;
                }
                if (!(entry instanceof Map.Entry)) {
                    return false;
                }
                V v = this.LJLIL.get(element.getKey());
                if (v != null) {
                    return o.LJ(v, element.getValue());
                }
                if (element.getValue() != null || !this.LJLIL.containsKey(element.getKey())) {
                    return false;
                }
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            /* renamed from: LJII, reason: merged with bridge method [inline-methods] */
            public final boolean remove(Object obj) {
                Map.Entry entry;
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry element = (Map.Entry) obj;
                o.LJIIIZ(element, "element");
                if (element instanceof Object) {
                    entry = element;
                } else {
                    entry = null;
                }
                if (!(entry instanceof Map.Entry)) {
                    return false;
                }
                return this.LJLIL.remove(element.getKey(), element.getValue());
            }

            @Override // X.AbstractC65780Prk, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean add(Object element) {
                o.LJIIIZ(element, "element");
                throw new UnsupportedOperationException();
            }
        };
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set<Object> keySet() {
        return new AbstractC65780Prk<K>(this) { // from class: X.2HL
            public final C44551ox<K, V> LJLIL;

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final void clear() {
                this.LJLIL.clear();
            }

            @Override // X.AbstractC65780Prk
            public final int getSize() {
                return this.LJLIL.LJLJJLL;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final Iterator<K> iterator() {
                return new C44561oy<K, V, K>(this.LJLIL) { // from class: X.28S
                    /* JADX WARN: Illegal instructions before constructor call */
                    {
                        /*
                            r4 = this;
                            java.lang.String r0 = "builder"
                            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
                            r3 = 8
                            X.1fW[] r2 = new X.AbstractC38701fW[r3]
                            r1 = 0
                        La:
                            X.1p4 r0 = new X.1p4
                            r0.<init>()
                            r2[r1] = r0
                            int r1 = r1 + 1
                            if (r1 >= r3) goto L16
                            goto La
                        L16:
                            r4.<init>(r5, r2)
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C28S.<init>(X.1ox):void");
                    }
                };
            }

            {
                o.LJIIIZ(this, "builder");
                this.LJLIL = this;
            }

            @Override // X.AbstractC65780Prk, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean add(K k) {
                throw new UnsupportedOperationException();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean contains(Object obj) {
                return this.LJLIL.containsKey(obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean remove(Object obj) {
                if (this.LJLIL.containsKey(obj)) {
                    this.LJLIL.remove(obj);
                    return true;
                }
                return false;
            }
        };
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection<Object> values() {
        return new AbstractC65774Pre<V>(this) { // from class: X.28T
            public final C44551ox<K, V> LJLIL;

            @Override // X.AbstractC65774Pre
            public final int LIZJ() {
                return this.LJLIL.LJLJJLL;
            }

            @Override // java.util.AbstractCollection, java.util.Collection
            public final void clear() {
                this.LJLIL.clear();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
            public final Iterator<V> iterator() {
                final C44551ox<K, V> c44551ox = this.LJLIL;
                return new C44561oy<K, V, V>(c44551ox) { // from class: X.28U
                    /* JADX WARN: Illegal instructions before constructor call */
                    {
                        /*
                            r4 = this;
                            java.lang.String r0 = "builder"
                            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
                            r3 = 8
                            X.1fW[] r2 = new X.AbstractC38701fW[r3]
                            r1 = 0
                        La:
                            X.1p6 r0 = new X.1p6
                            r0.<init>()
                            r2[r1] = r0
                            int r1 = r1 + 1
                            if (r1 >= r3) goto L16
                            goto La
                        L16:
                            r4.<init>(r5, r2)
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C28U.<init>(X.1ox):void");
                    }
                };
            }

            {
                o.LJIIIZ(this, "builder");
                this.LJLIL = this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection
            public final boolean add(V v) {
                throw new UnsupportedOperationException();
            }

            @Override // java.util.AbstractCollection, java.util.Collection
            public final boolean contains(Object obj) {
                return this.LJLIL.containsValue(obj);
            }
        };
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.LJLJJLL;
    }

    public C44551ox(C44541ow<K, V> map) {
        o.LJIIIZ(map, "map");
        this.LJLIL = map;
        this.LJLILLLLZI = new C17P();
        this.LJLJI = map.LJLIL;
        this.LJLJJLL = map.LJLILLLLZI;
    }

    public final void LIZIZ(int i) {
        this.LJLJJLL = i;
        this.LJLJJL++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        int i;
        C14U<K, V> c14u = this.LJLJI;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        return c14u.LIZLLL(i, 0, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        int i;
        C14U<K, V> c14u = this.LJLJI;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        return (V) c14u.LJI(i, 0, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(java.util.Map<? extends K, ? extends V> from) {
        C44551ox c44551ox;
        C44541ow<K, V> LIZ;
        o.LJIIIZ(from, "from");
        if (((from instanceof C44541ow) && (LIZ = (C44541ow) from) != null) || ((from instanceof C44551ox) && (c44551ox = (C44551ox) from) != null && (LIZ = c44551ox.LIZ()) != null)) {
            C17O c17o = new C17O();
            int i = this.LJLJJLL;
            C14U<K, V> c14u = this.LJLJI;
            C14U<K, V> c14u2 = LIZ.LJLIL;
            o.LJII(c14u2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
            this.LJLJI = c14u.LJIIL(c14u2, 0, c17o, this);
            int i2 = (LIZ.LJLILLLLZI + i) - c17o.LJLIL;
            if (i != i2) {
                LIZIZ(i2);
                return;
            }
            return;
        }
        super.putAll(from);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        int i;
        this.LJLJJI = null;
        C14U<K, V> c14u = this.LJLJI;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        C14U<K, V> LJIILIIL = c14u.LJIILIIL(i, obj, 0, this);
        if (LJIILIIL == null) {
            LJIILIIL = C14U.LJ;
            o.LJII(LJIILIIL, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        }
        this.LJLJI = LJIILIIL;
        return this.LJLJJI;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        int i;
        this.LJLJJI = null;
        C14U<K, V> c14u = this.LJLJI;
        if (k != null) {
            i = k.hashCode();
        } else {
            i = 0;
        }
        this.LJLJI = c14u.LJIIJJI(i, k, v, 0, this);
        return this.LJLJJI;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int i;
        int i2 = this.LJLJJLL;
        C14U<K, V> c14u = this.LJLJI;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        C14U<K, V> LJIILJJIL = c14u.LJIILJJIL(i, obj, obj2, 0, this);
        if (LJIILJJIL == null) {
            LJIILJJIL = C14U.LJ;
            o.LJII(LJIILJJIL, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        }
        this.LJLJI = LJIILJJIL;
        if (i2 == this.LJLJJLL) {
            return false;
        }
        return true;
    }
}
