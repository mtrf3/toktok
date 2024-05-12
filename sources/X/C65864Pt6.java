package X;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.o;

/* renamed from: X.Pt6, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65864Pt6<K, V> implements java.util.Map<K, V>, Serializable, EHO {
    public int[] LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;
    public int LJLJJI;
    public C65863Pt5<K> LJLJJL;
    public C65860Pt2<V> LJLJJLL;
    public C65862Pt4<K, V> LJLJL;
    public boolean LJLJLJ;
    public K[] keysArray;
    public int length;
    public int[] presenceArray;
    public V[] valuesArray;

    public C65864Pt6() {
        this(8);
    }

    private final Object writeReplace() {
        if (this.LJLJLJ) {
            return new C65871PtD(this);
        }
        throw new NotSerializableException("The map cannot be serialized while it is being built.");
    }

    public final V[] allocateValuesArray() {
        V[] vArr = this.valuesArray;
        if (vArr != null) {
            return vArr;
        }
        V[] vArr2 = (V[]) C56509MFt.LIZIZ(this.keysArray.length);
        this.valuesArray = vArr2;
        return vArr2;
    }

    public final void checkIsMutable$kotlin_stdlib() {
        if (!this.LJLJLJ) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    public final C65867Pt9<K, V> entriesIterator$kotlin_stdlib() {
        return new C65867Pt9<>(this);
    }

    public java.util.Set<Map.Entry<K, V>> getEntries() {
        C65862Pt4<K, V> c65862Pt4 = this.LJLJL;
        if (c65862Pt4 == null) {
            C65862Pt4<K, V> c65862Pt42 = new C65862Pt4<>(this);
            this.LJLJL = c65862Pt42;
            return c65862Pt42;
        }
        return c65862Pt4;
    }

    public java.util.Set<K> getKeys() {
        C65863Pt5<K> c65863Pt5 = this.LJLJJL;
        if (c65863Pt5 == null) {
            C65863Pt5<K> c65863Pt52 = new C65863Pt5<>(this);
            this.LJLJJL = c65863Pt52;
            return c65863Pt52;
        }
        return c65863Pt5;
    }

    public Collection<V> getValues() {
        C65860Pt2<V> c65860Pt2 = this.LJLJJLL;
        if (c65860Pt2 == null) {
            C65860Pt2<V> c65860Pt22 = new C65860Pt2<>(this);
            this.LJLJJLL = c65860Pt22;
            return c65860Pt22;
        }
        return c65860Pt2;
    }

    public final C65868PtA<K, V> keysIterator$kotlin_stdlib() {
        return new C65868PtA<>(this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((size() * 3) + 2);
        sb.append("{");
        C65867Pt9<K, V> entriesIterator$kotlin_stdlib = entriesIterator$kotlin_stdlib();
        int i = 0;
        while (entriesIterator$kotlin_stdlib.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i2 = entriesIterator$kotlin_stdlib.LJLILLLLZI;
            C65864Pt6<K, V> c65864Pt6 = entriesIterator$kotlin_stdlib.LJLIL;
            if (i2 < c65864Pt6.length) {
                entriesIterator$kotlin_stdlib.LJLILLLLZI = i2 + 1;
                entriesIterator$kotlin_stdlib.LJLJI = i2;
                K k = c65864Pt6.keysArray[i2];
                if (o.LJ(k, c65864Pt6)) {
                    sb.append("(this Map)");
                } else {
                    sb.append(k);
                }
                sb.append('=');
                V[] vArr = entriesIterator$kotlin_stdlib.LJLIL.valuesArray;
                o.LJI(vArr);
                V v = vArr[entriesIterator$kotlin_stdlib.LJLJI];
                if (o.LJ(v, entriesIterator$kotlin_stdlib.LJLIL)) {
                    sb.append("(this Map)");
                } else {
                    sb.append(v);
                }
                entriesIterator$kotlin_stdlib.LIZ();
                i++;
            } else {
                throw new NoSuchElementException();
            }
        }
        return C0EH.LIZJ(sb, "}", "sb.toString()");
    }

    public final C65866Pt8<K, V> valuesIterator$kotlin_stdlib() {
        return new C65866Pt8<>(this);
    }

    public final java.util.Map<K, V> build() {
        checkIsMutable$kotlin_stdlib();
        this.LJLJLJ = true;
        return this;
    }

    @Override // java.util.Map
    public void clear() {
        checkIsMutable$kotlin_stdlib();
        C118234kV it = new C40517FvF(0, this.length - 1).iterator();
        while (it.LJLJI) {
            int nextInt = it.nextInt();
            int[] iArr = this.presenceArray;
            int i = iArr[nextInt];
            if (i >= 0) {
                this.LJLIL[i] = 0;
                iArr[nextInt] = -1;
            }
        }
        C56509MFt.LJIILJJIL(0, this.length, this.keysArray);
        V[] vArr = this.valuesArray;
        if (vArr != null) {
            C56509MFt.LJIILJJIL(0, this.length, vArr);
        }
        this.LJLJJI = 0;
        this.length = 0;
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Set<Map.Entry<K, V>> entrySet() {
        return getEntries();
    }

    @Override // java.util.Map
    public int hashCode() {
        int i;
        int i2;
        C65867Pt9<K, V> entriesIterator$kotlin_stdlib = entriesIterator$kotlin_stdlib();
        int i3 = 0;
        while (entriesIterator$kotlin_stdlib.hasNext()) {
            int i4 = entriesIterator$kotlin_stdlib.LJLILLLLZI;
            C65864Pt6<K, V> c65864Pt6 = entriesIterator$kotlin_stdlib.LJLIL;
            if (i4 < c65864Pt6.length) {
                entriesIterator$kotlin_stdlib.LJLILLLLZI = i4 + 1;
                entriesIterator$kotlin_stdlib.LJLJI = i4;
                K k = c65864Pt6.keysArray[i4];
                if (k != null) {
                    i = k.hashCode();
                } else {
                    i = 0;
                }
                V[] vArr = entriesIterator$kotlin_stdlib.LJLIL.valuesArray;
                o.LJI(vArr);
                V v = vArr[entriesIterator$kotlin_stdlib.LJLJI];
                if (v != null) {
                    i2 = v.hashCode();
                } else {
                    i2 = 0;
                }
                entriesIterator$kotlin_stdlib.LIZ();
                i3 += i ^ i2;
            } else {
                throw new NoSuchElementException();
            }
        }
        return i3;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Set<K> keySet() {
        return getKeys();
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return getValues();
    }

    public int getSize() {
        return this.LJLJJI;
    }

    public final boolean isReadOnly$kotlin_stdlib() {
        return this.LJLJLJ;
    }

    public C65864Pt6(int i) {
        K[] kArr = (K[]) C56509MFt.LIZIZ(i);
        int[] iArr = new int[i];
        int highestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
        this.keysArray = kArr;
        this.valuesArray = null;
        this.presenceArray = iArr;
        this.LJLIL = new int[highestOneBit];
        this.LJLILLLLZI = 2;
        this.length = 0;
        this.LJLJI = Integer.numberOfLeadingZeros(highestOneBit) + 1;
    }

    public final void LIZ(int i) {
        V[] vArr;
        int i2 = this.length;
        int i3 = i + i2;
        if (i3 >= 0) {
            K[] kArr = this.keysArray;
            if (i3 > kArr.length) {
                int length = (kArr.length * 3) / 2;
                if (i3 <= length) {
                    i3 = length;
                }
                K[] kArr2 = (K[]) Arrays.copyOf(kArr, i3);
                o.LJIIIIZZ(kArr2, "copyOf(this, newSize)");
                this.keysArray = kArr2;
                V[] vArr2 = this.valuesArray;
                if (vArr2 != null) {
                    vArr = (V[]) Arrays.copyOf(vArr2, i3);
                    o.LJIIIIZZ(vArr, "copyOf(this, newSize)");
                } else {
                    vArr = null;
                }
                this.valuesArray = vArr;
                int[] copyOf = Arrays.copyOf(this.presenceArray, i3);
                o.LJIIIIZZ(copyOf, "copyOf(this, newSize)");
                this.presenceArray = copyOf;
                int highestOneBit = Integer.highestOneBit(i3 * 3);
                if (highestOneBit > this.LJLIL.length) {
                    LIZLLL(highestOneBit);
                    return;
                }
                return;
            }
            if ((i2 + i3) - size() <= this.keysArray.length) {
                return;
            }
            LIZLLL(this.LJLIL.length);
            return;
        }
        throw new OutOfMemoryError();
    }

    public final int LIZIZ(K k) {
        int LIZJ = LIZJ(k);
        int i = this.LJLILLLLZI;
        while (true) {
            int i2 = this.LJLIL[LIZJ];
            if (i2 == 0) {
                return -1;
            }
            if (i2 > 0) {
                int i3 = i2 - 1;
                if (o.LJ(this.keysArray[i3], k)) {
                    return i3;
                }
            }
            i--;
            if (i < 0) {
                return -1;
            }
            int i4 = LIZJ - 1;
            if (LIZJ == 0) {
                LIZJ = this.LJLIL.length - 1;
            } else {
                LIZJ = i4;
            }
        }
    }

    public final int LIZJ(K k) {
        int i;
        if (k != null) {
            i = k.hashCode();
        } else {
            i = 0;
        }
        return (i * (-1640531527)) >>> this.LJLJI;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x005f, code lost:
    
        r2[r0] = r4;
        r7.presenceArray[r5] = r0;
        r5 = r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(int r8) {
        /*
            r7 = this;
            int r1 = r7.length
            int r0 = r7.size()
            r3 = 0
            if (r1 <= r0) goto L36
            V[] r5 = r7.valuesArray
            r4 = 0
            r2 = 0
        Ld:
            int r1 = r7.length
            if (r4 >= r1) goto L28
            int[] r0 = r7.presenceArray
            r0 = r0[r4]
            if (r0 < 0) goto L25
            K[] r1 = r7.keysArray
            r0 = r1[r4]
            r1[r2] = r0
            if (r5 == 0) goto L23
            r0 = r5[r4]
            r5[r2] = r0
        L23:
            int r2 = r2 + 1
        L25:
            int r4 = r4 + 1
            goto Ld
        L28:
            K[] r0 = r7.keysArray
            X.C56509MFt.LJIILJJIL(r2, r1, r0)
            if (r5 == 0) goto L34
            int r0 = r7.length
            X.C56509MFt.LJIILJJIL(r2, r0, r5)
        L34:
            r7.length = r2
        L36:
            int[] r1 = r7.LJLIL
            int r0 = r1.length
            r6 = 1
            if (r8 == r0) goto L7c
            int[] r0 = new int[r8]
            r7.LJLIL = r0
            int r0 = java.lang.Integer.numberOfLeadingZeros(r8)
            int r0 = r0 + 1
            r7.LJLJI = r0
        L48:
            r5 = 0
        L49:
            int r0 = r7.length
            if (r5 >= r0) goto L81
            int r4 = r5 + 1
            K[] r0 = r7.keysArray
            r0 = r0[r5]
            int r0 = r7.LIZJ(r0)
            int r3 = r7.LJLILLLLZI
        L59:
            int[] r2 = r7.LJLIL
            r1 = r2[r0]
            if (r1 != 0) goto L67
            r2[r0] = r4
            int[] r1 = r7.presenceArray
            r1[r5] = r0
            r5 = r4
            goto L49
        L67:
            int r3 = r3 + (-1)
            if (r3 >= 0) goto L73
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?"
            r1.<init>(r0)
            throw r1
        L73:
            int r1 = r0 + (-1)
            if (r0 != 0) goto L7a
            int r0 = r2.length
            int r0 = r0 - r6
            goto L59
        L7a:
            r0 = r1
            goto L59
        L7c:
            int r0 = r1.length
            java.util.Arrays.fill(r1, r3, r0, r3)
            goto L48
        L81:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65864Pt6.LIZLLL(int):void");
    }

    public final int addKey$kotlin_stdlib(K k) {
        checkIsMutable$kotlin_stdlib();
        while (true) {
            int LIZJ = LIZJ(k);
            int i = this.LJLILLLLZI * 2;
            int length = this.LJLIL.length / 2;
            if (i > length) {
                i = length;
            }
            int i2 = 0;
            while (true) {
                int[] iArr = this.LJLIL;
                int i3 = iArr[LIZJ];
                if (i3 <= 0) {
                    int i4 = this.length;
                    K[] kArr = this.keysArray;
                    if (i4 >= kArr.length) {
                        LIZ(1);
                    } else {
                        int i5 = i4 + 1;
                        this.length = i5;
                        kArr[i4] = k;
                        this.presenceArray[i4] = LIZJ;
                        iArr[LIZJ] = i5;
                        this.LJLJJI = size() + 1;
                        if (i2 > this.LJLILLLLZI) {
                            this.LJLILLLLZI = i2;
                        }
                        return i4;
                    }
                } else {
                    if (o.LJ(this.keysArray[i3 - 1], k)) {
                        return -i3;
                    }
                    i2++;
                    if (i2 > i) {
                        LIZLLL(this.LJLIL.length * 2);
                        break;
                    }
                    int i6 = LIZJ - 1;
                    if (LIZJ == 0) {
                        LIZJ = this.LJLIL.length - 1;
                    } else {
                        LIZJ = i6;
                    }
                }
            }
        }
    }

    public final boolean containsAllEntries$kotlin_stdlib(Collection<?> m) {
        o.LJIIIZ(m, "m");
        for (Object obj : m) {
            if (obj != null) {
                try {
                    if (!containsEntry$kotlin_stdlib((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean containsEntry$kotlin_stdlib(Map.Entry<? extends K, ? extends V> entry) {
        o.LJIIIZ(entry, "entry");
        int LIZIZ = LIZIZ(entry.getKey());
        if (LIZIZ < 0) {
            return false;
        }
        V[] vArr = this.valuesArray;
        o.LJI(vArr);
        return o.LJ(vArr[LIZIZ], entry.getValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        if (LIZIZ(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        int i = this.length;
        while (true) {
            i--;
            if (i >= 0) {
                if (this.presenceArray[i] >= 0) {
                    V[] vArr = this.valuesArray;
                    o.LJI(vArr);
                    if (o.LJ(vArr[i], obj)) {
                        return true;
                    }
                }
            } else {
                return false;
            }
        }
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof java.util.Map) {
            java.util.Map map = (java.util.Map) obj;
            if (size() == map.size() && containsAllEntries$kotlin_stdlib(map.entrySet())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public V get(Object obj) {
        int LIZIZ = LIZIZ(obj);
        if (LIZIZ < 0) {
            return null;
        }
        V[] vArr = this.valuesArray;
        o.LJI(vArr);
        return vArr[LIZIZ];
    }

    @Override // java.util.Map
    public void putAll(java.util.Map<? extends K, ? extends V> from) {
        o.LJIIIZ(from, "from");
        checkIsMutable$kotlin_stdlib();
        java.util.Set<Map.Entry<? extends K, ? extends V>> entrySet = from.entrySet();
        if (entrySet.isEmpty()) {
            return;
        }
        LIZ(entrySet.size());
        for (Map.Entry<? extends K, ? extends V> entry : entrySet) {
            int addKey$kotlin_stdlib = addKey$kotlin_stdlib(entry.getKey());
            V[] allocateValuesArray = allocateValuesArray();
            if (addKey$kotlin_stdlib >= 0) {
                allocateValuesArray[addKey$kotlin_stdlib] = entry.getValue();
            } else {
                int i = (-addKey$kotlin_stdlib) - 1;
                if (!o.LJ(entry.getValue(), allocateValuesArray[i])) {
                    allocateValuesArray[i] = entry.getValue();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public V remove(Object obj) {
        int removeKey$kotlin_stdlib = removeKey$kotlin_stdlib(obj);
        if (removeKey$kotlin_stdlib < 0) {
            return null;
        }
        V[] vArr = this.valuesArray;
        o.LJI(vArr);
        V v = vArr[removeKey$kotlin_stdlib];
        vArr[removeKey$kotlin_stdlib] = null;
        return v;
    }

    public final boolean removeEntry$kotlin_stdlib(Map.Entry<? extends K, ? extends V> entry) {
        o.LJIIIZ(entry, "entry");
        checkIsMutable$kotlin_stdlib();
        int LIZIZ = LIZIZ(entry.getKey());
        if (LIZIZ < 0) {
            return false;
        }
        V[] vArr = this.valuesArray;
        o.LJI(vArr);
        if (!o.LJ(vArr[LIZIZ], entry.getValue())) {
            return false;
        }
        removeKeyAt(LIZIZ);
        return true;
    }

    public final int removeKey$kotlin_stdlib(K k) {
        checkIsMutable$kotlin_stdlib();
        int LIZIZ = LIZIZ(k);
        if (LIZIZ < 0) {
            return -1;
        }
        removeKeyAt(LIZIZ);
        return LIZIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0051 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[LOOP:0: B:5:0x001d->B:22:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void removeKeyAt(int r12) {
        /*
            r11 = this;
            K[] r1 = r11.keysArray
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)
            r0 = 0
            r1[r12] = r0
            int[] r0 = r11.presenceArray
            r10 = r0[r12]
            int r0 = r11.LJLILLLLZI
            int r5 = r0 * 2
            int[] r0 = r11.LJLIL
            int r0 = r0.length
            int r0 = r0 / 2
            if (r5 <= r0) goto L1a
            r5 = r0
        L1a:
            r9 = 0
            r6 = 0
            r8 = r10
        L1d:
            int r0 = r10 + (-1)
            r7 = -1
            if (r10 != 0) goto L70
            int[] r0 = r11.LJLIL
            int r0 = r0.length
            int r10 = r0 + (-1)
        L27:
            int r6 = r6 + 1
            int r0 = r11.LJLILLLLZI
            if (r6 <= r0) goto L3e
            int[] r0 = r11.LJLIL
            r0[r8] = r9
        L31:
            int[] r0 = r11.presenceArray
            r0[r12] = r7
            int r0 = r11.size()
            int r0 = r0 + (-1)
            r11.LJLJJI = r0
            return
        L3e:
            int[] r0 = r11.LJLIL
            r4 = r0[r10]
            if (r4 != 0) goto L47
            r0[r8] = r9
            goto L31
        L47:
            if (r4 >= 0) goto L56
            r0[r8] = r7
        L4b:
            r8 = r10
            r6 = 0
        L4d:
            int r5 = r5 + (-1)
            if (r5 >= 0) goto L1d
            int[] r0 = r11.LJLIL
            r0[r8] = r7
            goto L31
        L56:
            K[] r0 = r11.keysArray
            int r3 = r4 + (-1)
            r0 = r0[r3]
            int r2 = r11.LIZJ(r0)
            int r2 = r2 - r10
            int[] r1 = r11.LJLIL
            int r0 = r1.length
            int r0 = r0 + (-1)
            r2 = r2 & r0
            if (r2 < r6) goto L4d
            r1[r8] = r4
            int[] r0 = r11.presenceArray
            r0[r3] = r8
            goto L4b
        L70:
            r10 = r0
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65864Pt6.removeKeyAt(int):void");
    }

    public final boolean removeValue$kotlin_stdlib(V v) {
        checkIsMutable$kotlin_stdlib();
        int i = this.length;
        while (true) {
            i--;
            if (i >= 0) {
                if (this.presenceArray[i] >= 0) {
                    V[] vArr = this.valuesArray;
                    o.LJI(vArr);
                    if (o.LJ(vArr[i], v)) {
                        removeKeyAt(i);
                        return true;
                    }
                }
            } else {
                return false;
            }
        }
    }

    @Override // java.util.Map
    public V put(K k, V v) {
        checkIsMutable$kotlin_stdlib();
        int addKey$kotlin_stdlib = addKey$kotlin_stdlib(k);
        V[] allocateValuesArray = allocateValuesArray();
        if (addKey$kotlin_stdlib < 0) {
            int i = (-addKey$kotlin_stdlib) - 1;
            V v2 = allocateValuesArray[i];
            allocateValuesArray[i] = v;
            return v2;
        }
        allocateValuesArray[addKey$kotlin_stdlib] = v;
        return null;
    }
}
