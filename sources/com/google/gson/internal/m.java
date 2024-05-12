package com.google.gson.internal;

import X.X1D;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes12.dex */
public final class m<K, V> extends AbstractMap<K, V> implements Serializable {
    public static final a LJLJLJ = new a();
    public final Comparator<? super K> LJLIL;
    public e<K, V> LJLILLLLZI;
    public int LJLJI;
    public int LJLJJI;
    public final e<K, V> LJLJJL;
    public m<K, V>.b LJLJJLL;
    public m<K, V>.c LJLJL;

    /* loaded from: classes12.dex */
    public class b extends AbstractSet<Map.Entry<K, V>> {

        /* loaded from: classes12.dex */
        public final class a extends m<K, V>.d<Map.Entry<K, V>> {
            @Override // java.util.Iterator
            public final Object next() {
                return LIZ();
            }

            public a(b bVar) {
                super();
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            m.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new a(this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return m.this.LJLJI;
        }

        public b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            if ((obj instanceof Map.Entry) && m.this.LIZIZ((Map.Entry) obj) != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            e<K, V> LIZIZ;
            if (!(obj instanceof Map.Entry) || (LIZIZ = m.this.LIZIZ((Map.Entry) obj)) == null) {
                return false;
            }
            m.this.LIZLLL(LIZIZ, true);
            return true;
        }
    }

    /* loaded from: classes12.dex */
    public final class c extends AbstractSet<K> {

        /* loaded from: classes12.dex */
        public final class a extends m<K, V>.d<K> {
            @Override // java.util.Iterator
            public final K next() {
                return LIZ().LJLJJLL;
            }

            public a(c cVar) {
                super();
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            m.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<K> iterator() {
            return new a(this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return m.this.LJLJI;
        }

        public c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return m.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            m mVar = m.this;
            mVar.getClass();
            if (obj == null) {
                return false;
            }
            try {
                e<K, V> LIZ = mVar.LIZ(obj, false);
                if (LIZ == null) {
                    return false;
                }
                mVar.LIZLLL(LIZ, true);
                return true;
            } catch (ClassCastException unused) {
                return false;
            }
        }
    }

    /* loaded from: classes12.dex */
    public abstract class d<T> implements Iterator<T> {
        public e<K, V> LJLIL;
        public e<K, V> LJLILLLLZI;
        public int LJLJI;

        public final e<K, V> LIZ() {
            e<K, V> eVar = this.LJLIL;
            m mVar = m.this;
            if (eVar != mVar.LJLJJL) {
                if (mVar.LJLJJI == this.LJLJI) {
                    this.LJLIL = eVar.LJLJJI;
                    this.LJLILLLLZI = eVar;
                    return eVar;
                }
                throw new ConcurrentModificationException();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.LJLIL != m.this.LJLJJL) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public final void remove() {
            e<K, V> eVar = this.LJLILLLLZI;
            if (eVar != null) {
                m.this.LIZLLL(eVar, true);
                this.LJLILLLLZI = null;
                this.LJLJI = m.this.LJLJJI;
                return;
            }
            throw new IllegalStateException();
        }

        public d() {
            this.LJLIL = m.this.LJLJJL.LJLJJI;
            this.LJLJI = m.this.LJLJJI;
        }
    }

    /* loaded from: classes12.dex */
    public static final class e<K, V> implements Map.Entry<K, V> {
        public e<K, V> LJLIL;
        public e<K, V> LJLILLLLZI;
        public e<K, V> LJLJI;
        public e<K, V> LJLJJI;
        public e<K, V> LJLJJL;
        public final K LJLJJLL;
        public V LJLJL;
        public int LJLJLJ;

        @Override // java.util.Map.Entry
        public final int hashCode() {
            int hashCode;
            K k = this.LJLJJLL;
            int i = 0;
            if (k == null) {
                hashCode = 0;
            } else {
                hashCode = k.hashCode();
            }
            V v = this.LJLJL;
            if (v != null) {
                i = v.hashCode();
            }
            return hashCode ^ i;
        }

        public e() {
            this.LJLJJL = this;
            this.LJLJJI = this;
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(this.LJLJJLL);
            LIZ.append("=");
            LIZ.append(this.LJLJL);
            return X1D.LIZIZ(LIZ);
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.LJLJJLL;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.LJLJL;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            K k = this.LJLJJLL;
            if (k == null) {
                if (entry.getKey() != null) {
                    return false;
                }
            } else if (!k.equals(entry.getKey())) {
                return false;
            }
            V v = this.LJLJL;
            if (v == null) {
                if (entry.getValue() != null) {
                    return false;
                }
            } else if (!v.equals(entry.getValue())) {
                return false;
            }
            return true;
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            V v2 = this.LJLJL;
            this.LJLJL = v;
            return v2;
        }

        public e(e<K, V> eVar, K k, e<K, V> eVar2, e<K, V> eVar3) {
            this.LJLIL = eVar;
            this.LJLJJLL = k;
            this.LJLJLJ = 1;
            this.LJLJJI = eVar2;
            this.LJLJJL = eVar3;
            eVar3.LJLJJI = this;
            eVar2.LJLJJL = this;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.LJLILLLLZI = null;
        this.LJLJI = 0;
        this.LJLJJI++;
        e<K, V> eVar = this.LJLJJL;
        eVar.LJLJJL = eVar;
        eVar.LJLJJI = eVar;
    }

    public m() {
        this(LJLJLJ);
    }

    private Object writeReplace() {
        return new LinkedHashMap(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        m<K, V>.b bVar = this.LJLJJLL;
        if (bVar != null) {
            return bVar;
        }
        m<K, V>.b bVar2 = new b();
        this.LJLJJLL = bVar2;
        return bVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        m<K, V>.c cVar = this.LJLJL;
        if (cVar != null) {
            return cVar;
        }
        m<K, V>.c cVar2 = new c();
        this.LJLJL = cVar2;
        return cVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.LJLJI;
    }

    public m(Comparator<? super K> comparator) {
        this.LJLJJL = new e<>();
        this.LJLIL = comparator == null ? LJLJLJ : comparator;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final e<K, V> LIZIZ(Map.Entry<?, ?> entry) {
        Object key = entry.getKey();
        if (key == null) {
            return null;
        }
        try {
            e<K, V> LIZ = LIZ(key, false);
            if (LIZ == null) {
                return null;
            }
            V v = LIZ.LJLJL;
            Object value = entry.getValue();
            if (v != value && (v == null || !v.equals(value))) {
                return null;
            }
            return LIZ;
        } catch (ClassCastException unused) {
            return null;
        }
    }

    public final void LJI(e<K, V> eVar) {
        int i;
        int i2;
        e<K, V> eVar2 = eVar.LJLILLLLZI;
        e<K, V> eVar3 = eVar.LJLJI;
        e<K, V> eVar4 = eVar3.LJLILLLLZI;
        e<K, V> eVar5 = eVar3.LJLJI;
        eVar.LJLJI = eVar4;
        if (eVar4 != null) {
            eVar4.LJLIL = eVar;
        }
        LJ(eVar, eVar3);
        eVar3.LJLILLLLZI = eVar;
        eVar.LJLIL = eVar3;
        int i3 = 0;
        if (eVar2 != null) {
            i = eVar2.LJLJLJ;
        } else {
            i = 0;
        }
        if (eVar4 != null) {
            i2 = eVar4.LJLJLJ;
        } else {
            i2 = 0;
        }
        int max = Math.max(i, i2) + 1;
        eVar.LJLJLJ = max;
        if (eVar5 != null) {
            i3 = eVar5.LJLJLJ;
        }
        eVar3.LJLJLJ = Math.max(max, i3) + 1;
    }

    public final void LJII(e<K, V> eVar) {
        int i;
        int i2;
        e<K, V> eVar2 = eVar.LJLILLLLZI;
        e<K, V> eVar3 = eVar.LJLJI;
        e<K, V> eVar4 = eVar2.LJLILLLLZI;
        e<K, V> eVar5 = eVar2.LJLJI;
        eVar.LJLILLLLZI = eVar5;
        if (eVar5 != null) {
            eVar5.LJLIL = eVar;
        }
        LJ(eVar, eVar2);
        eVar2.LJLJI = eVar;
        eVar.LJLIL = eVar2;
        int i3 = 0;
        if (eVar3 != null) {
            i = eVar3.LJLJLJ;
        } else {
            i = 0;
        }
        if (eVar5 != null) {
            i2 = eVar5.LJLJLJ;
        } else {
            i2 = 0;
        }
        int max = Math.max(i, i2) + 1;
        eVar.LJLJLJ = max;
        if (eVar4 != null) {
            i3 = eVar4.LJLJLJ;
        }
        eVar2.LJLJLJ = Math.max(max, i3) + 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        if (obj == 0) {
            return false;
        }
        try {
            if (LIZ(obj, false) == null) {
                return false;
            }
            return true;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public V get(java.lang.Object r3) {
        /*
            r2 = this;
            r1 = 0
            if (r3 == 0) goto L9
            r0 = 0
            com.google.gson.internal.m$e r0 = r2.LIZ(r3, r0)     // Catch: java.lang.ClassCastException -> L9
            goto La
        L9:
            r0 = r1
        La:
            if (r0 == 0) goto Le
            V r1 = r0.LJLJL
        Le:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.m.get(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0012  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public V remove(java.lang.Object r4) {
        /*
            r3 = this;
            r2 = 0
            if (r4 == 0) goto L9
            r0 = 0
            com.google.gson.internal.m$e r1 = r3.LIZ(r4, r0)     // Catch: java.lang.ClassCastException -> L9
            goto La
        L9:
            r1 = r2
        La:
            if (r1 == 0) goto L10
            r0 = 1
            r3.LIZLLL(r1, r0)
        L10:
            if (r1 == 0) goto L14
            V r2 = r1.LJLJL
        L14:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.m.remove(java.lang.Object):java.lang.Object");
    }

    /* loaded from: classes12.dex */
    public static class a implements Comparator<Comparable> {
        @Override // java.util.Comparator
        public final int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0010  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0023 -> B:5:0x000e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.gson.internal.m.e<K, V> LIZ(K r9, boolean r10) {
        /*
            r8 = this;
            java.util.Comparator<? super K> r7 = r8.LJLIL
            com.google.gson.internal.m$e<K, V> r5 = r8.LJLILLLLZI
            com.google.gson.internal.m$a r6 = com.google.gson.internal.m.LJLJLJ
            r2 = 0
            if (r5 == 0) goto L2d
            if (r7 != r6) goto L25
            r1 = r9
            java.lang.Comparable r1 = (java.lang.Comparable) r1
        Le:
            if (r1 == 0) goto L26
            K r0 = r5.LJLJJLL
            int r4 = r1.compareTo(r0)
        L16:
            if (r4 != 0) goto L19
            return r5
        L19:
            if (r4 >= 0) goto L20
            com.google.gson.internal.m$e<K, V> r0 = r5.LJLILLLLZI
        L1d:
            if (r0 != 0) goto L23
            goto L2e
        L20:
            com.google.gson.internal.m$e<K, V> r0 = r5.LJLJI
            goto L1d
        L23:
            r5 = r0
            goto Le
        L25:
            r1 = r2
        L26:
            K r0 = r5.LJLJJLL
            int r4 = r7.compare(r9, r0)
            goto L16
        L2d:
            r4 = 0
        L2e:
            if (r10 != 0) goto L31
            return r2
        L31:
            com.google.gson.internal.m$e<K, V> r3 = r8.LJLJJL
            r2 = 1
            if (r5 != 0) goto L52
            if (r7 != r6) goto L3c
            boolean r0 = r9 instanceof java.lang.Comparable
            if (r0 == 0) goto L64
        L3c:
            com.google.gson.internal.m$e r1 = new com.google.gson.internal.m$e
            com.google.gson.internal.m$e<K, V> r0 = r3.LJLJJL
            r1.<init>(r5, r9, r3, r0)
            r8.LJLILLLLZI = r1
        L45:
            int r0 = r8.LJLJI
            int r0 = r0 + 1
            r8.LJLJI = r0
            int r0 = r8.LJLJJI
            int r0 = r0 + 1
            r8.LJLJJI = r0
            return r1
        L52:
            com.google.gson.internal.m$e r1 = new com.google.gson.internal.m$e
            com.google.gson.internal.m$e<K, V> r0 = r3.LJLJJL
            r1.<init>(r5, r9, r3, r0)
            if (r4 >= 0) goto L61
            r5.LJLILLLLZI = r1
        L5d:
            r8.LIZJ(r5, r2)
            goto L45
        L61:
            r5.LJLJI = r1
            goto L5d
        L64:
            java.lang.ClassCastException r2 = new java.lang.ClassCastException
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.Class r0 = r9.getClass()
            java.lang.String r0 = r0.getName()
            r1.append(r0)
            java.lang.String r0 = " is not Comparable"
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.m.LIZ(java.lang.Object, boolean):com.google.gson.internal.m$e");
    }

    public final void LIZJ(e<K, V> eVar, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        while (eVar != null) {
            e<K, V> eVar2 = eVar.LJLILLLLZI;
            e<K, V> eVar3 = eVar.LJLJI;
            int i5 = 0;
            if (eVar2 != null) {
                i = eVar2.LJLJLJ;
            } else {
                i = 0;
            }
            if (eVar3 != null) {
                i2 = eVar3.LJLJLJ;
            } else {
                i2 = 0;
            }
            int i6 = i - i2;
            if (i6 == -2) {
                e<K, V> eVar4 = eVar3.LJLILLLLZI;
                e<K, V> eVar5 = eVar3.LJLJI;
                if (eVar5 != null) {
                    i4 = eVar5.LJLJLJ;
                } else {
                    i4 = 0;
                }
                if (eVar4 != null) {
                    i5 = eVar4.LJLJLJ;
                }
                int i7 = i5 - i4;
                if (i7 == -1 || (i7 == 0 && !z)) {
                    LJI(eVar);
                } else {
                    LJII(eVar3);
                    LJI(eVar);
                }
                if (z) {
                    return;
                }
            } else if (i6 == 2) {
                e<K, V> eVar6 = eVar2.LJLILLLLZI;
                e<K, V> eVar7 = eVar2.LJLJI;
                if (eVar7 != null) {
                    i3 = eVar7.LJLJLJ;
                } else {
                    i3 = 0;
                }
                if (eVar6 != null) {
                    i5 = eVar6.LJLJLJ;
                }
                int i8 = i5 - i3;
                if (i8 == 1 || (i8 == 0 && !z)) {
                    LJII(eVar);
                } else {
                    LJI(eVar2);
                    LJII(eVar);
                }
                if (z) {
                    return;
                }
            } else if (i6 == 0) {
                eVar.LJLJLJ = i + 1;
                if (z) {
                    return;
                }
            } else {
                eVar.LJLJLJ = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            eVar = eVar.LJLIL;
        }
    }

    public final void LIZLLL(e<K, V> eVar, boolean z) {
        e<K, V> eVar2;
        int i;
        if (z) {
            e<K, V> eVar3 = eVar.LJLJJL;
            eVar3.LJLJJI = eVar.LJLJJI;
            eVar.LJLJJI.LJLJJL = eVar3;
        }
        e<K, V> eVar4 = eVar.LJLILLLLZI;
        e<K, V> eVar5 = eVar.LJLJI;
        e<K, V> eVar6 = eVar.LJLIL;
        int i2 = 0;
        if (eVar4 != null) {
            if (eVar5 != null) {
                if (eVar4.LJLJLJ > eVar5.LJLJLJ) {
                    e<K, V> eVar7 = eVar4.LJLJI;
                    while (true) {
                        eVar2 = eVar4;
                        eVar4 = eVar7;
                        if (eVar7 == null) {
                            break;
                        } else {
                            eVar7 = eVar7.LJLJI;
                        }
                    }
                } else {
                    e<K, V> eVar8 = eVar5.LJLILLLLZI;
                    while (true) {
                        eVar2 = eVar5;
                        eVar5 = eVar8;
                        if (eVar5 == null) {
                            break;
                        } else {
                            eVar8 = eVar5.LJLILLLLZI;
                        }
                    }
                }
                LIZLLL(eVar2, false);
                e<K, V> eVar9 = eVar.LJLILLLLZI;
                if (eVar9 != null) {
                    i = eVar9.LJLJLJ;
                    eVar2.LJLILLLLZI = eVar9;
                    eVar9.LJLIL = eVar2;
                    eVar.LJLILLLLZI = null;
                } else {
                    i = 0;
                }
                e<K, V> eVar10 = eVar.LJLJI;
                if (eVar10 != null) {
                    i2 = eVar10.LJLJLJ;
                    eVar2.LJLJI = eVar10;
                    eVar10.LJLIL = eVar2;
                    eVar.LJLJI = null;
                }
                eVar2.LJLJLJ = Math.max(i, i2) + 1;
                LJ(eVar, eVar2);
                return;
            }
            LJ(eVar, eVar4);
            eVar.LJLILLLLZI = null;
        } else if (eVar5 != null) {
            LJ(eVar, eVar5);
            eVar.LJLJI = null;
        } else {
            LJ(eVar, null);
        }
        LIZJ(eVar6, false);
        this.LJLJI--;
        this.LJLJJI++;
    }

    public final void LJ(e<K, V> eVar, e<K, V> eVar2) {
        e<K, V> eVar3 = eVar.LJLIL;
        eVar.LJLIL = null;
        if (eVar2 != null) {
            eVar2.LJLIL = eVar3;
        }
        if (eVar3 != null) {
            if (eVar3.LJLILLLLZI == eVar) {
                eVar3.LJLILLLLZI = eVar2;
                return;
            } else {
                eVar3.LJLJI = eVar2;
                return;
            }
        }
        this.LJLILLLLZI = eVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        if (k != null) {
            e<K, V> LIZ = LIZ(k, true);
            V v2 = LIZ.LJLJL;
            LIZ.LJLJL = v;
            return v2;
        }
        throw new NullPointerException("key == null");
    }
}
