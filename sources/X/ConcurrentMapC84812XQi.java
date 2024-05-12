package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.logging.Logger;

/* renamed from: X.XQi, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class ConcurrentMapC84812XQi<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V> {
    public static final XR9 LJZL;
    public static final C65775Prf LL;
    public final int LJLIL;
    public final int LJLILLLLZI;
    public final C84813XQj<K, V>[] LJLJI;
    public final int LJLJJI;
    public final XRE<Object> LJLJJL;
    public final XRE<Object> LJLJJLL;
    public final XRL LJLJL;
    public final XRL LJLJLJ;
    public final long LJLJLLL;
    public final IOU LJLL;
    public final long LJLLI;
    public final long LJLLILLLL;
    public final long LJLLJ;
    public final C65775Prf LJLLL;
    public final AbstractC84809XQf LJLLLL;
    public final EnumC84817XQn LJLLLLLL;
    public XQZ LJLZ;
    public C65773Prd LJZ;
    public C84806XQc LJZI;

    /* renamed from: X.XQi$c */
    /* loaded from: classes12.dex */
    public abstract class c<T> extends AbstractSet<T> {
        public final ConcurrentMap<?, ?> LJLIL;

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            this.LJLIL.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean isEmpty() {
            return this.LJLIL.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return this.LJLIL.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final Object[] toArray() {
            return ConcurrentMapC84812XQi.LJIIIIZZ(this).toArray();
        }

        public c(ConcurrentMap concurrentMap) {
            this.LJLIL = concurrentMap;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final <E> E[] toArray(E[] eArr) {
            return (E[]) ConcurrentMapC84812XQi.LJIIIIZZ(this).toArray(eArr);
        }
    }

    /* renamed from: X.XQi$c0 */
    /* loaded from: classes16.dex */
    public final class c0 implements Map.Entry<K, V> {
        public final K LJLIL;
        public V LJLILLLLZI;

        @Override // java.util.Map.Entry
        public final int hashCode() {
            return this.LJLIL.hashCode() ^ this.LJLILLLLZI.hashCode();
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(this.LJLIL);
            LIZ.append("=");
            LIZ.append(this.LJLILLLLZI);
            return X1D.LIZIZ(LIZ);
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.LJLIL;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.LJLILLLLZI;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (!this.LJLIL.equals(entry.getKey()) || !this.LJLILLLLZI.equals(entry.getValue())) {
                return false;
            }
            return true;
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            V v2 = (V) ConcurrentMapC84812XQi.this.put(this.LJLIL, v);
            this.LJLILLLLZI = v;
            return v2;
        }

        public c0(K k, V v) {
            this.LJLIL = k;
            this.LJLILLLLZI = v;
        }
    }

    /* renamed from: X.XQi$i */
    /* loaded from: classes16.dex */
    public abstract class i<T> implements Iterator<T> {
        public int LJLIL;
        public int LJLILLLLZI = -1;
        public C84813XQj<K, V> LJLJI;
        public AtomicReferenceArray<InterfaceC84816XQm<K, V>> LJLJJI;
        public InterfaceC84816XQm<K, V> LJLJJL;
        public ConcurrentMapC84812XQi<K, V>.c0 LJLJJLL;
        public ConcurrentMapC84812XQi<K, V>.c0 LJLJL;

        public final void LIZ() {
            this.LJLJJLL = null;
            InterfaceC84816XQm<K, V> interfaceC84816XQm = this.LJLJJL;
            if (interfaceC84816XQm != null) {
                while (true) {
                    InterfaceC84816XQm<K, V> LIZJ = interfaceC84816XQm.LIZJ();
                    this.LJLJJL = LIZJ;
                    if (LIZJ == null) {
                        break;
                    } else if (LIZIZ(LIZJ)) {
                        return;
                    } else {
                        interfaceC84816XQm = this.LJLJJL;
                    }
                }
            }
            if (LJ()) {
                return;
            }
            while (true) {
                int i = this.LJLIL;
                if (i >= 0) {
                    C84813XQj<K, V>[] c84813XQjArr = ConcurrentMapC84812XQi.this.LJLJI;
                    this.LJLIL = i - 1;
                    C84813XQj<K, V> c84813XQj = c84813XQjArr[i];
                    this.LJLJI = c84813XQj;
                    if (c84813XQj.LJLILLLLZI != 0) {
                        this.LJLJJI = this.LJLJI.LJLJJLL;
                        this.LJLILLLLZI = r0.length() - 1;
                        if (LJ()) {
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
        }

        public final ConcurrentMapC84812XQi<K, V>.c0 LIZLLL() {
            ConcurrentMapC84812XQi<K, V>.c0 c0Var = this.LJLJJLL;
            if (c0Var != null) {
                this.LJLJL = c0Var;
                LIZ();
                return this.LJLJL;
            }
            throw new NoSuchElementException();
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0000, code lost:
        
            continue;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean LJ() {
            /*
                r3 = this;
            L0:
                int r2 = r3.LJLILLLLZI
                r0 = 0
                if (r2 < 0) goto L32
                java.util.concurrent.atomic.AtomicReferenceArray<X.XQm<K, V>> r1 = r3.LJLJJI
                int r0 = r2 + (-1)
                r3.LJLILLLLZI = r0
                java.lang.Object r0 = r1.get(r2)
                X.XQm r0 = (X.InterfaceC84816XQm) r0
                r3.LJLJJL = r0
                if (r0 == 0) goto L0
                boolean r0 = r3.LIZIZ(r0)
                r1 = 1
                if (r0 != 0) goto L2e
                X.XQm<K, V> r0 = r3.LJLJJL
                if (r0 == 0) goto L0
            L20:
                X.XQm r0 = r0.LIZJ()
                r3.LJLJJL = r0
                if (r0 == 0) goto L0
                boolean r0 = r3.LIZIZ(r0)
                if (r0 == 0) goto L2f
            L2e:
                return r1
            L2f:
                X.XQm<K, V> r0 = r3.LJLJJL
                goto L20
            L32:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: X.ConcurrentMapC84812XQi.i.LJ():boolean");
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.LJLJJLL != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public final void remove() {
            ConcurrentMapC84812XQi<K, V>.c0 c0Var = this.LJLJL;
            if (c0Var != null) {
                ConcurrentMapC84812XQi.this.remove(c0Var.LJLIL);
                this.LJLJL = null;
                return;
            }
            throw new IllegalStateException();
        }

        public i() {
            this.LJLIL = ConcurrentMapC84812XQi.this.LJLJI.length - 1;
            LIZ();
        }

        public final boolean LIZIZ(InterfaceC84816XQm<K, V> interfaceC84816XQm) {
            V v;
            try {
                long LIZ = ConcurrentMapC84812XQi.this.LJLLLL.LIZ();
                K key = interfaceC84816XQm.getKey();
                ConcurrentMapC84812XQi concurrentMapC84812XQi = ConcurrentMapC84812XQi.this;
                concurrentMapC84812XQi.getClass();
                if (interfaceC84816XQm.getKey() != null && (v = interfaceC84816XQm.LIZLLL().get()) != null && !concurrentMapC84812XQi.LJ(interfaceC84816XQm, LIZ)) {
                    this.LJLJJLL = new c0(key, v);
                    this.LJLJI.LJIIIZ();
                    return true;
                }
                this.LJLJI.LJIIIZ();
                return false;
            } catch (Throwable th) {
                this.LJLJI.LJIIIZ();
                throw th;
            }
        }
    }

    static {
        Logger.getLogger(ConcurrentMapC84812XQi.class.getName());
        LJZL = new XR9();
        LL = new C65775Prf();
    }

    public final boolean LIZ() {
        if (this.LJLJLLL >= 0) {
            return true;
        }
        return false;
    }

    public final boolean LIZIZ() {
        if (this.LJLLI > 0) {
            return true;
        }
        return false;
    }

    public final boolean LIZJ() {
        if (this.LJLLILLLL > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        XR6 xr6;
        C84813XQj<K, V>[] c84813XQjArr = this.LJLJI;
        int length = c84813XQjArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            C84813XQj<K, V> c84813XQj = c84813XQjArr[i2];
            if (c84813XQj.LJLILLLLZI != 0) {
                c84813XQj.lock();
                try {
                    c84813XQj.LJIILJJIL(c84813XQj.LJLIL.LJLLLL.LIZ());
                    AtomicReferenceArray<InterfaceC84816XQm<K, V>> atomicReferenceArray = c84813XQj.LJLJJLL;
                    for (int i3 = 0; i3 < atomicReferenceArray.length(); i3++) {
                        for (InterfaceC84816XQm<K, V> interfaceC84816XQm = atomicReferenceArray.get(i3); interfaceC84816XQm != null; interfaceC84816XQm = interfaceC84816XQm.LIZJ()) {
                            if (interfaceC84816XQm.LIZLLL().isActive()) {
                                K key = interfaceC84816XQm.getKey();
                                V v = interfaceC84816XQm.LIZLLL().get();
                                if (key == null || v == null) {
                                    xr6 = XR6.COLLECTED;
                                } else {
                                    xr6 = XR6.EXPLICIT;
                                }
                                interfaceC84816XQm.LJII();
                                c84813XQj.LIZLLL(key, v, interfaceC84816XQm.LIZLLL().LIZ(), xr6);
                            }
                        }
                    }
                    for (int i4 = 0; i4 < atomicReferenceArray.length(); i4++) {
                        atomicReferenceArray.set(i4, null);
                    }
                    if (c84813XQj.LJLIL.LJLJL != XRM.LJLIL) {
                        do {
                        } while (c84813XQj.LJLJLJ.poll() != null);
                    }
                    if (c84813XQj.LJLIL.LJLJLJ != XRM.LJLIL) {
                        do {
                        } while (c84813XQj.LJLJLLL.poll() != null);
                    }
                    c84813XQj.LJLLILLLL.clear();
                    c84813XQj.LJLLJ.clear();
                    c84813XQj.LJLLI.set(0);
                    c84813XQj.LJLJJI++;
                    c84813XQj.LJLILLLLZI = 0;
                } finally {
                    c84813XQj.unlock();
                    c84813XQj.LJIILL();
                }
            }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set<Map.Entry<K, V>> entrySet() {
        C84806XQc c84806XQc = this.LJZI;
        if (c84806XQc != null) {
            return c84806XQc;
        }
        C84806XQc c84806XQc2 = new C84806XQc(this, this);
        this.LJZI = c84806XQc2;
        return c84806XQc2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        C84813XQj<K, V>[] c84813XQjArr = this.LJLJI;
        long j = 0;
        for (int i2 = 0; i2 < c84813XQjArr.length; i2++) {
            if (c84813XQjArr[i2].LJLILLLLZI != 0) {
                return false;
            }
            j += c84813XQjArr[i2].LJLJJI;
        }
        if (j == 0) {
            return true;
        }
        for (int i3 = 0; i3 < c84813XQjArr.length; i3++) {
            if (c84813XQjArr[i3].LJLILLLLZI != 0) {
                return false;
            }
            j -= c84813XQjArr[i3].LJLJJI;
        }
        if (j != 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set<K> keySet() {
        XQZ xqz = this.LJLZ;
        if (xqz != null) {
            return xqz;
        }
        XQZ xqz2 = new XQZ(this, this);
        this.LJLZ = xqz2;
        return xqz2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        long j = 0;
        for (int i2 = 0; i2 < this.LJLJI.length; i2++) {
            j += Math.max(0, r6[i2].LJLILLLLZI);
        }
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return LiveLayoutPreloadThreadPriority.DEFAULT;
        }
        return (int) j;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection<V> values() {
        C65773Prd c65773Prd = this.LJZ;
        if (c65773Prd != null) {
            return c65773Prd;
        }
        C65773Prd c65773Prd2 = new C65773Prd(this, this);
        this.LJZ = c65773Prd2;
        return c65773Prd2;
    }

    public final boolean LJI() {
        if (LIZJ() || this.LJLLJ > 0) {
            return true;
        }
        return false;
    }

    public final boolean LJIIIZ() {
        if (LIZIZ() || LIZ()) {
            return true;
        }
        return false;
    }

    public ConcurrentMapC84812XQi(XQ7<? super K, ? super V> xq7) {
        long j;
        AbstractC84809XQf abstractC84809XQf;
        char c2;
        boolean z;
        char c3;
        int i2 = xq7.LIZIZ;
        this.LJLJJI = Math.min(i2 == -1 ? 4 : i2, 65536);
        XRL xrl = XRM.LJLIL;
        this.LJLJL = xrl;
        this.LJLJLJ = xrl;
        XRF xrf = XRF.LJLIL;
        if (xrf != null) {
            this.LJLJJL = xrf;
            this.LJLJJLL = xrf;
            long j2 = xq7.LJ;
            if (j2 == 0 || xq7.LJFF == 0) {
                j = 0;
            } else {
                j = xq7.LIZJ;
            }
            this.LJLJLLL = j;
            this.LJLL = IOU.LJLIL;
            long j3 = xq7.LJFF;
            this.LJLLI = j3 == -1 ? 0L : j3;
            this.LJLLILLLL = j2 == -1 ? 0L : j2;
            long j4 = xq7.LJI;
            this.LJLLJ = j4 != -1 ? j4 : 0L;
            this.LJLLL = LL;
            int i3 = 0;
            int i4 = 1;
            if (LJI() || LIZIZ()) {
                abstractC84809XQf = AbstractC84809XQf.LIZ;
            } else {
                abstractC84809XQf = XQ7.LJII;
            }
            this.LJLLLL = abstractC84809XQf;
            if (LJIIIZ() || LIZIZ()) {
                c2 = 1;
            } else {
                c2 = 0;
            }
            if (LIZJ() || LJI()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                c3 = 2;
            } else {
                c3 = 0;
            }
            this.LJLLLLLL = EnumC84817XQn.LJLIL[c2 | c3];
            int i5 = xq7.LIZ;
            int min = Math.min(i5 == -1 ? 16 : i5, 1073741824);
            min = LIZ() ? (int) Math.min(min, j) : min;
            int i6 = 1;
            int i7 = 0;
            while (i6 < this.LJLJJI && (!LIZ() || i6 * 20 <= this.LJLJLLL)) {
                i7++;
                i6 <<= 1;
            }
            this.LJLILLLLZI = 32 - i7;
            this.LJLIL = i6 - 1;
            this.LJLJI = new C84813XQj[i6];
            int i8 = min / i6;
            while (i4 < (i8 * i6 < min ? i8 + 1 : i8)) {
                i4 <<= 1;
            }
            if (LIZ()) {
                long j5 = this.LJLJLLL;
                long j6 = i6;
                long j7 = (j5 / j6) + 1;
                long j8 = j5 % j6;
                while (true) {
                    C84813XQj<K, V>[] c84813XQjArr = this.LJLJI;
                    if (i3 < c84813XQjArr.length) {
                        if (i3 == j8) {
                            j7--;
                        }
                        c84813XQjArr[i3] = new C84813XQj<>(this, i4, j7);
                        i3++;
                    } else {
                        return;
                    }
                }
            } else {
                while (true) {
                    C84813XQj<K, V>[] c84813XQjArr2 = this.LJLJI;
                    if (i3 < c84813XQjArr2.length) {
                        c84813XQjArr2[i3] = new C84813XQj<>(this, i4, -1L);
                        i3++;
                    } else {
                        return;
                    }
                }
            }
        } else {
            throw new NullPointerException("Both parameters are null");
        }
    }

    public static <E> ArrayList<E> LJIIIIZZ(Collection<E> collection) {
        ArrayList<E> arrayList = new ArrayList<>(collection.size());
        Iterator<E> it = collection.iterator();
        it.getClass();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public final int LIZLLL(Object obj) {
        int LIZIZ;
        XRE<Object> xre = this.LJLJJL;
        if (obj == null) {
            xre.getClass();
            LIZIZ = 0;
        } else {
            LIZIZ = xre.LIZIZ(obj);
        }
        int i2 = LIZIZ + ((LIZIZ << 15) ^ (-12931));
        int i3 = i2 ^ (i2 >>> 10);
        int i4 = i3 + (i3 << 3);
        int i5 = i4 ^ (i4 >>> 6);
        int i6 = (i5 << 2) + (i5 << 14) + i5;
        return (i6 >>> 16) ^ i6;
    }

    public final C84813XQj<K, V> LJII(int i2) {
        return this.LJLJI[(i2 >>> this.LJLILLLLZI) & this.LJLIL];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        InterfaceC84816XQm LJIIIIZZ;
        boolean z = false;
        if (obj == null) {
            return false;
        }
        int LIZLLL = LIZLLL(obj);
        C84813XQj<K, V> LJII = LJII(LIZLLL);
        LJII.getClass();
        try {
            if (LJII.LJLILLLLZI != 0 && (LJIIIIZZ = LJII.LJIIIIZZ(LJII.LJLIL.LJLLLL.LIZ(), LIZLLL, obj)) != null) {
                if (LJIIIIZZ.LIZLLL().get() != null) {
                    z = true;
                }
            }
            return z;
        } finally {
            LJII.LJIIIZ();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        V v;
        if (obj == null) {
            return false;
        }
        long LIZ = this.LJLLLL.LIZ();
        C84813XQj<K, V>[] c84813XQjArr = this.LJLJI;
        long j = -1;
        int i2 = 0;
        do {
            int length = c84813XQjArr.length;
            long j2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                C84813XQj<K, V> c84813XQj = c84813XQjArr[i3];
                AtomicReferenceArray<InterfaceC84816XQm<K, V>> atomicReferenceArray = c84813XQj.LJLJJLL;
                for (int i4 = 0; i4 < atomicReferenceArray.length(); i4++) {
                    for (InterfaceC84816XQm<K, V> interfaceC84816XQm = atomicReferenceArray.get(i4); interfaceC84816XQm != null; interfaceC84816XQm = interfaceC84816XQm.LIZJ()) {
                        if (interfaceC84816XQm.getKey() == null) {
                            c84813XQj.LJIIZILJ();
                        } else {
                            v = interfaceC84816XQm.LIZLLL().get();
                            if (v == null) {
                                c84813XQj.LJIIZILJ();
                            } else {
                                if (c84813XQj.LJLIL.LJ(interfaceC84816XQm, LIZ)) {
                                    if (c84813XQj.tryLock()) {
                                        try {
                                            c84813XQj.LJI(LIZ);
                                        } finally {
                                            c84813XQj.unlock();
                                        }
                                    }
                                }
                                if (v == null && this.LJLJJLL.LIZJ(obj, v)) {
                                    return true;
                                }
                            }
                        }
                        v = null;
                        if (v == null) {
                        }
                    }
                }
                j2 += c84813XQj.LJLJJI;
            }
            if (j2 == j) {
                return false;
            }
            i2++;
            j = j2;
        } while (i2 < 3);
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        if (obj == null) {
            return null;
        }
        int LIZLLL = LIZLLL(obj);
        return (V) LJII(LIZLLL).LJII(LIZLLL, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(java.util.Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:
    
        r11 = r7.LIZLLL();
        r10 = r11.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004a, code lost:
    
        if (r10 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004c, code lost:
    
        r12 = X.XR6.EXPLICIT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004e, code lost:
    
        r5.LJLJJI++;
        r1 = r5.LJIILIIL(r6, r7, r8, r9, r10, r11, r12);
        r0 = r5.LJLILLLLZI - 1;
        r3.set(r2, r1);
        r5.LJLILLLLZI = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:?, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0066, code lost:
    
        if (r11.isActive() == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0068, code lost:
    
        r12 = X.XR6.COLLECTED;
     */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final V remove(java.lang.Object r14) {
        /*
            r13 = this;
            r4 = 0
            if (r14 != 0) goto L4
            return r4
        L4:
            int r9 = r13.LIZLLL(r14)
            X.XQj r5 = r13.LJII(r9)
            r5.lock()
            X.XQi<K, V> r0 = r5.LJLIL     // Catch: java.lang.Throwable -> L7f
            X.XQf r0 = r0.LJLLLL     // Catch: java.lang.Throwable -> L7f
            long r0 = r0.LIZ()     // Catch: java.lang.Throwable -> L7f
            r5.LJIILJJIL(r0)     // Catch: java.lang.Throwable -> L7f
            java.util.concurrent.atomic.AtomicReferenceArray<X.XQm<K, V>> r3 = r5.LJLJJLL     // Catch: java.lang.Throwable -> L7f
            int r0 = r3.length()     // Catch: java.lang.Throwable -> L7f
            int r2 = r0 + (-1)
            r2 = r2 & r9
            java.lang.Object r6 = r3.get(r2)     // Catch: java.lang.Throwable -> L7f
            X.XQm r6 = (X.InterfaceC84816XQm) r6     // Catch: java.lang.Throwable -> L7f
            r7 = r6
        L2a:
            if (r7 == 0) goto L78
            java.lang.Object r8 = r7.getKey()     // Catch: java.lang.Throwable -> L7f
            int r0 = r7.LJII()     // Catch: java.lang.Throwable -> L7f
            if (r0 != r9) goto L6b
            if (r8 == 0) goto L6b
            X.XQi<K, V> r0 = r5.LJLIL     // Catch: java.lang.Throwable -> L7f
            X.XRE<java.lang.Object> r0 = r0.LJLJJL     // Catch: java.lang.Throwable -> L7f
            boolean r0 = r0.LIZJ(r14, r8)     // Catch: java.lang.Throwable -> L7f
            if (r0 == 0) goto L6b
            X.XQl r11 = r7.LIZLLL()     // Catch: java.lang.Throwable -> L7f
            java.lang.Object r10 = r11.get()     // Catch: java.lang.Throwable -> L7f
            if (r10 == 0) goto L62
            X.XR6 r12 = X.XR6.EXPLICIT     // Catch: java.lang.Throwable -> L7f
        L4e:
            int r0 = r5.LJLJJI     // Catch: java.lang.Throwable -> L7f
            int r0 = r0 + 1
            r5.LJLJJI = r0     // Catch: java.lang.Throwable -> L7f
            X.XQm r1 = r5.LJIILIIL(r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L7f
            int r0 = r5.LJLILLLLZI     // Catch: java.lang.Throwable -> L7f
            int r0 = r0 + (-1)
            r3.set(r2, r1)     // Catch: java.lang.Throwable -> L7f
            r5.LJLILLLLZI = r0     // Catch: java.lang.Throwable -> L7f
            goto L70
        L62:
            boolean r0 = r11.isActive()     // Catch: java.lang.Throwable -> L7f
            if (r0 == 0) goto L78
            X.XR6 r12 = X.XR6.COLLECTED     // Catch: java.lang.Throwable -> L7f
            goto L4e
        L6b:
            X.XQm r7 = r7.LIZJ()     // Catch: java.lang.Throwable -> L7f
            goto L2a
        L70:
            r5.unlock()
            r5.LJIILL()
            r4 = r10
            goto L7e
        L78:
            r5.unlock()
            r5.LJIILL()
        L7e:
            return r4
        L7f:
            r0 = move-exception
            r5.unlock()
            r5.LJIILL()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ConcurrentMapC84812XQi.remove(java.lang.Object):java.lang.Object");
    }

    public final boolean LJ(InterfaceC84816XQm<K, V> interfaceC84816XQm, long j) {
        interfaceC84816XQm.getClass();
        if (LIZIZ() && j - interfaceC84816XQm.LJIIL() >= this.LJLLI) {
            return true;
        }
        if (LIZJ() && j - interfaceC84816XQm.LJIIIIZZ() >= this.LJLLILLLL) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final V getOrDefault(Object obj, V v) {
        V v2 = get(obj);
        if (v2 != null) {
            return v2;
        }
        return v;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        k.getClass();
        v.getClass();
        int LIZLLL = LIZLLL(k);
        return (V) LJII(LIZLLL).LJIIJ(LIZLLL, k, v, false);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final V putIfAbsent(K k, V v) {
        k.getClass();
        v.getClass();
        int LIZLLL = LIZLLL(k);
        return (V) LJII(LIZLLL).LJIIJ(LIZLLL, k, v, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
    
        r13 = r9.LIZLLL();
        r12 = r13.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0058, code lost:
    
        if (r7.LJLIL.LJLJJLL.LIZJ(r17, r12) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
    
        r14 = X.XR6.EXPLICIT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005c, code lost:
    
        r7.LJLJJI++;
        r1 = r7.LJIILIIL(r8, r9, r10, r11, r12, r13, r14);
        r0 = r7.LJLILLLLZI - 1;
        r3.set(r2, r1);
        r7.LJLILLLLZI = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0070, code lost:
    
        if (r14 != X.XR6.EXPLICIT) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0083, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0073, code lost:
    
        if (r12 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0079, code lost:
    
        if (r13.isActive() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007b, code lost:
    
        r14 = X.XR6.COLLECTED;
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean remove(java.lang.Object r16, java.lang.Object r17) {
        /*
            r15 = this;
            r6 = 0
            r4 = r16
            if (r4 == 0) goto L9
            r1 = r17
            if (r1 != 0) goto La
        L9:
            return r6
        La:
            int r11 = r15.LIZLLL(r4)
            X.XQj r7 = r15.LJII(r11)
            r7.lock()
            X.XQi<K, V> r0 = r7.LJLIL     // Catch: java.lang.Throwable -> L8b
            X.XQf r0 = r0.LJLLLL     // Catch: java.lang.Throwable -> L8b
            long r2 = r0.LIZ()     // Catch: java.lang.Throwable -> L8b
            r7.LJIILJJIL(r2)     // Catch: java.lang.Throwable -> L8b
            java.util.concurrent.atomic.AtomicReferenceArray<X.XQm<K, V>> r3 = r7.LJLJJLL     // Catch: java.lang.Throwable -> L8b
            int r2 = r3.length()     // Catch: java.lang.Throwable -> L8b
            r5 = 1
            int r2 = r2 - r5
            r2 = r2 & r11
            java.lang.Object r8 = r3.get(r2)     // Catch: java.lang.Throwable -> L8b
            X.XQm r8 = (X.InterfaceC84816XQm) r8     // Catch: java.lang.Throwable -> L8b
            r9 = r8
        L30:
            if (r9 == 0) goto L84
            java.lang.Object r10 = r9.getKey()     // Catch: java.lang.Throwable -> L8b
            int r0 = r9.LJII()     // Catch: java.lang.Throwable -> L8b
            if (r0 != r11) goto L7e
            if (r10 == 0) goto L7e
            X.XQi<K, V> r0 = r7.LJLIL     // Catch: java.lang.Throwable -> L8b
            X.XRE<java.lang.Object> r0 = r0.LJLJJL     // Catch: java.lang.Throwable -> L8b
            boolean r0 = r0.LIZJ(r4, r10)     // Catch: java.lang.Throwable -> L8b
            if (r0 == 0) goto L7e
            X.XQl r13 = r9.LIZLLL()     // Catch: java.lang.Throwable -> L8b
            java.lang.Object r12 = r13.get()     // Catch: java.lang.Throwable -> L8b
            X.XQi<K, V> r0 = r7.LJLIL     // Catch: java.lang.Throwable -> L8b
            X.XRE<java.lang.Object> r0 = r0.LJLJJLL     // Catch: java.lang.Throwable -> L8b
            boolean r0 = r0.LIZJ(r1, r12)     // Catch: java.lang.Throwable -> L8b
            if (r0 == 0) goto L73
            X.XR6 r14 = X.XR6.EXPLICIT     // Catch: java.lang.Throwable -> L8b
        L5c:
            int r0 = r7.LJLJJI     // Catch: java.lang.Throwable -> L8b
            int r0 = r0 + 1
            r7.LJLJJI = r0     // Catch: java.lang.Throwable -> L8b
            X.XQm r1 = r7.LJIILIIL(r8, r9, r10, r11, r12, r13, r14)     // Catch: java.lang.Throwable -> L8b
            int r0 = r7.LJLILLLLZI     // Catch: java.lang.Throwable -> L8b
            int r0 = r0 - r5
            r3.set(r2, r1)     // Catch: java.lang.Throwable -> L8b
            r7.LJLILLLLZI = r0     // Catch: java.lang.Throwable -> L8b
            X.XR6 r0 = X.XR6.EXPLICIT     // Catch: java.lang.Throwable -> L8b
            if (r14 != r0) goto L84
            goto L83
        L73:
            if (r12 != 0) goto L84
            boolean r0 = r13.isActive()     // Catch: java.lang.Throwable -> L8b
            if (r0 == 0) goto L84
            X.XR6 r14 = X.XR6.COLLECTED     // Catch: java.lang.Throwable -> L8b
            goto L5c
        L7e:
            X.XQm r9 = r9.LIZJ()     // Catch: java.lang.Throwable -> L8b
            goto L30
        L83:
            r6 = 1
        L84:
            r7.unlock()
            r7.LJIILL()
            return r6
        L8b:
            r0 = move-exception
            r7.unlock()
            r7.LJIILL()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ConcurrentMapC84812XQi.remove(java.lang.Object, java.lang.Object):boolean");
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final V replace(K k, V v) {
        k.getClass();
        v.getClass();
        int LIZLLL = LIZLLL(k);
        C84813XQj<K, V> LJII = LJII(LIZLLL);
        LJII.lock();
        try {
            long LIZ = LJII.LJLIL.LJLLLL.LIZ();
            LJII.LJIILJJIL(LIZ);
            AtomicReferenceArray<InterfaceC84816XQm<K, V>> atomicReferenceArray = LJII.LJLJJLL;
            int length = (atomicReferenceArray.length() - 1) & LIZLLL;
            InterfaceC84816XQm<K, V> interfaceC84816XQm = atomicReferenceArray.get(length);
            InterfaceC84816XQm<K, V> interfaceC84816XQm2 = interfaceC84816XQm;
            while (true) {
                if (interfaceC84816XQm2 == null) {
                    break;
                }
                K key = interfaceC84816XQm2.getKey();
                if (interfaceC84816XQm2.LJII() == LIZLLL && key != null && LJII.LJLIL.LJLJJL.LIZJ(k, key)) {
                    InterfaceC84815XQl<K, V> LIZLLL2 = interfaceC84816XQm2.LIZLLL();
                    V v2 = LIZLLL2.get();
                    if (v2 == null) {
                        if (LIZLLL2.isActive()) {
                            LJII.LJLJJI++;
                            InterfaceC84816XQm<K, V> LJIILIIL = LJII.LJIILIIL(interfaceC84816XQm, interfaceC84816XQm2, key, LIZLLL, v2, LIZLLL2, XR6.COLLECTED);
                            int i2 = LJII.LJLILLLLZI - 1;
                            atomicReferenceArray.set(length, LJIILIIL);
                            LJII.LJLILLLLZI = i2;
                        }
                    } else {
                        LJII.LJLJJI++;
                        LJII.LIZLLL(k, v2, LIZLLL2.LIZ(), XR6.REPLACED);
                        LJII.LJIILLIIL(interfaceC84816XQm2, v, LIZ);
                        LJII.LJ(interfaceC84816XQm2);
                        return v2;
                    }
                } else {
                    interfaceC84816XQm2 = interfaceC84816XQm2.LIZJ();
                }
            }
            LJII.unlock();
            LJII.LJIILL();
            return null;
        } finally {
            LJII.unlock();
            LJII.LJIILL();
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final boolean replace(K k, V v, V v2) {
        k.getClass();
        v2.getClass();
        if (v == null) {
            return false;
        }
        int LIZLLL = LIZLLL(k);
        C84813XQj<K, V> LJII = LJII(LIZLLL);
        LJII.lock();
        try {
            long LIZ = LJII.LJLIL.LJLLLL.LIZ();
            LJII.LJIILJJIL(LIZ);
            AtomicReferenceArray<InterfaceC84816XQm<K, V>> atomicReferenceArray = LJII.LJLJJLL;
            int length = (atomicReferenceArray.length() - 1) & LIZLLL;
            InterfaceC84816XQm<K, V> interfaceC84816XQm = atomicReferenceArray.get(length);
            InterfaceC84816XQm<K, V> interfaceC84816XQm2 = interfaceC84816XQm;
            while (true) {
                if (interfaceC84816XQm2 == null) {
                    break;
                }
                K key = interfaceC84816XQm2.getKey();
                if (interfaceC84816XQm2.LJII() == LIZLLL && key != null && LJII.LJLIL.LJLJJL.LIZJ(k, key)) {
                    InterfaceC84815XQl<K, V> LIZLLL2 = interfaceC84816XQm2.LIZLLL();
                    V v3 = LIZLLL2.get();
                    if (v3 == null) {
                        if (LIZLLL2.isActive()) {
                            LJII.LJLJJI++;
                            InterfaceC84816XQm<K, V> LJIILIIL = LJII.LJIILIIL(interfaceC84816XQm, interfaceC84816XQm2, key, LIZLLL, v3, LIZLLL2, XR6.COLLECTED);
                            int i2 = LJII.LJLILLLLZI - 1;
                            atomicReferenceArray.set(length, LJIILIIL);
                            LJII.LJLILLLLZI = i2;
                        }
                    } else {
                        if (LJII.LJLIL.LJLJJLL.LIZJ(v, v3)) {
                            LJII.LJLJJI++;
                            LJII.LIZLLL(k, v3, LIZLLL2.LIZ(), XR6.REPLACED);
                            LJII.LJIILLIIL(interfaceC84816XQm2, v2, LIZ);
                            LJII.LJ(interfaceC84816XQm2);
                            LJII.unlock();
                            LJII.LJIILL();
                            return true;
                        }
                        if (LJII.LJLIL.LIZIZ()) {
                            interfaceC84816XQm2.LJIIIZ(LIZ);
                        }
                        LJII.LJLLJ.add(interfaceC84816XQm2);
                    }
                } else {
                    interfaceC84816XQm2 = interfaceC84816XQm2.LIZJ();
                }
            }
            return false;
        } finally {
            LJII.unlock();
            LJII.LJIILL();
        }
    }
}
