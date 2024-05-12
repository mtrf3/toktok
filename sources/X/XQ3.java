package X;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.logging.Logger;

/* loaded from: classes16.dex */
public final class XQ3<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V> {
    public static final Logger LLF = Logger.getLogger(XQ3.class.getName());
    public static final XPI LLFF = new XPI();
    public static final C65715Pqh LLFFF = new C65715Pqh();
    public final int LJLIL;
    public final int LJLILLLLZI;
    public final XQ2<K, V>[] LJLJI;
    public final int LJLJJI;
    public final XQK<Object> LJLJJL;
    public final XQK<Object> LJLJJLL;
    public final XQ9 LJLJL;
    public final XQ9 LJLJLJ;
    public final long LJLJLLL;
    public final XQP<K, V> LJLL;
    public final long LJLLI;
    public final long LJLLILLLL;
    public final long LJLLJ;
    public final Queue<XQF<K, V>> LJLLL;
    public final InterfaceC84783XPf<K, V> LJLLLL;
    public final AbstractC44430HcA LJLLLLLL;
    public final EnumC84797XPt LJLZ;
    public final XQO LJZ;
    public final XPX<? super K, V> LJZI;
    public XQC LJZL;
    public C65772Prc LL;
    public XQ8 LLD;

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
            return XQ3.LJIIIIZZ(this).toArray();
        }

        public c(ConcurrentMap concurrentMap) {
            this.LJLIL = concurrentMap;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final <E> E[] toArray(E[] eArr) {
            return (E[]) XQ3.LJIIIIZZ(this).toArray(eArr);
        }
    }

    /* loaded from: classes16.dex */
    public abstract class i<T> implements Iterator<T> {
        public int LJLIL;
        public int LJLILLLLZI = -1;
        public XQ2<K, V> LJLJI;
        public AtomicReferenceArray<InterfaceC84796XPs<K, V>> LJLJJI;
        public InterfaceC84796XPs<K, V> LJLJJL;
        public XQ3<K, V>.j0 LJLJJLL;
        public XQ3<K, V>.j0 LJLJL;

        public final void LIZ() {
            this.LJLJJLL = null;
            InterfaceC84796XPs<K, V> interfaceC84796XPs = this.LJLJJL;
            if (interfaceC84796XPs != null) {
                while (true) {
                    InterfaceC84796XPs<K, V> LIZJ = interfaceC84796XPs.LIZJ();
                    this.LJLJJL = LIZJ;
                    if (LIZJ == null) {
                        break;
                    } else if (LIZIZ(LIZJ)) {
                        return;
                    } else {
                        interfaceC84796XPs = this.LJLJJL;
                    }
                }
            }
            if (LJ()) {
                return;
            }
            while (true) {
                int i = this.LJLIL;
                if (i >= 0) {
                    XQ2<K, V>[] xq2Arr = XQ3.this.LJLJI;
                    this.LJLIL = i - 1;
                    XQ2<K, V> xq2 = xq2Arr[i];
                    this.LJLJI = xq2;
                    if (xq2.LJLILLLLZI != 0) {
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

        public final XQ3<K, V>.j0 LIZLLL() {
            XQ3<K, V>.j0 j0Var = this.LJLJJLL;
            if (j0Var != null) {
                this.LJLJL = j0Var;
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
                java.util.concurrent.atomic.AtomicReferenceArray<X.XPs<K, V>> r1 = r3.LJLJJI
                int r0 = r2 + (-1)
                r3.LJLILLLLZI = r0
                java.lang.Object r0 = r1.get(r2)
                X.XPs r0 = (X.InterfaceC84796XPs) r0
                r3.LJLJJL = r0
                if (r0 == 0) goto L0
                boolean r0 = r3.LIZIZ(r0)
                r1 = 1
                if (r0 != 0) goto L2e
                X.XPs<K, V> r0 = r3.LJLJJL
                if (r0 == 0) goto L0
            L20:
                X.XPs r0 = r0.LIZJ()
                r3.LJLJJL = r0
                if (r0 == 0) goto L0
                boolean r0 = r3.LIZIZ(r0)
                if (r0 == 0) goto L2f
            L2e:
                return r1
            L2f:
                X.XPs<K, V> r0 = r3.LJLJJL
                goto L20
            L32:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: X.XQ3.i.LJ():boolean");
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
            boolean z;
            if (this.LJLJL != null) {
                z = true;
            } else {
                z = false;
            }
            C76917UGr.LJIILL(z);
            XQ3.this.remove(this.LJLJL.LJLIL);
            this.LJLJL = null;
        }

        public i() {
            this.LJLIL = XQ3.this.LJLJI.length - 1;
            LIZ();
        }

        public final boolean LIZIZ(InterfaceC84796XPs<K, V> interfaceC84796XPs) {
            V v;
            try {
                long LIZ = XQ3.this.LJLLLLLL.LIZ();
                K key = interfaceC84796XPs.getKey();
                XQ3 xq3 = XQ3.this;
                xq3.getClass();
                if (interfaceC84796XPs.getKey() != null && (v = interfaceC84796XPs.LIZLLL().get()) != null && !xq3.LJ(interfaceC84796XPs, LIZ)) {
                    this.LJLJJLL = new j0(key, v);
                    this.LJLJI.LJIIL();
                    return true;
                }
                this.LJLJI.LJIIL();
                return false;
            } catch (Throwable th) {
                this.LJLJI.LJIIL();
                throw th;
            }
        }
    }

    /* loaded from: classes16.dex */
    public final class j0 implements Map.Entry<K, V> {
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
            V v2 = (V) XQ3.this.put(this.LJLIL, v);
            this.LJLILLLLZI = v;
            return v2;
        }

        public j0(K k, V v) {
            this.LJLIL = k;
            this.LJLILLLLZI = v;
        }
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
        XQG xqg;
        XQ2<K, V>[] xq2Arr = this.LJLJI;
        int length = xq2Arr.length;
        for (int i2 = 0; i2 < length; i2++) {
            XQ2<K, V> xq2 = xq2Arr[i2];
            if (xq2.LJLILLLLZI != 0) {
                xq2.lock();
                try {
                    xq2.LJIJJ(xq2.LJLIL.LJLLLLLL.LIZ());
                    AtomicReferenceArray<InterfaceC84796XPs<K, V>> atomicReferenceArray = xq2.LJLJJLL;
                    for (int i3 = 0; i3 < atomicReferenceArray.length(); i3++) {
                        for (InterfaceC84796XPs<K, V> interfaceC84796XPs = atomicReferenceArray.get(i3); interfaceC84796XPs != null; interfaceC84796XPs = interfaceC84796XPs.LIZJ()) {
                            if (interfaceC84796XPs.LIZLLL().isActive()) {
                                K key = interfaceC84796XPs.getKey();
                                V v = interfaceC84796XPs.LIZLLL().get();
                                if (key == null || v == null) {
                                    xqg = XQG.COLLECTED;
                                } else {
                                    xqg = XQG.EXPLICIT;
                                }
                                interfaceC84796XPs.LJII();
                                xq2.LIZLLL(key, v, interfaceC84796XPs.LIZLLL().LIZ(), xqg);
                            }
                        }
                    }
                    for (int i4 = 0; i4 < atomicReferenceArray.length(); i4++) {
                        atomicReferenceArray.set(i4, null);
                    }
                    if (xq2.LJLIL.LJLJL != XQ9.LJLIL) {
                        do {
                        } while (xq2.LJLJLJ.poll() != null);
                    }
                    if (xq2.LJLIL.LJLJLJ != XQ9.LJLIL) {
                        do {
                        } while (xq2.LJLJLLL.poll() != null);
                    }
                    xq2.LJLLILLLL.clear();
                    xq2.LJLLJ.clear();
                    xq2.LJLLI.set(0);
                    xq2.LJLJJI++;
                    xq2.LJLILLLLZI = 0;
                } finally {
                    xq2.unlock();
                    xq2.LJIJJLI();
                }
            }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set<Map.Entry<K, V>> entrySet() {
        XQ8 xq8 = this.LLD;
        if (xq8 != null) {
            return xq8;
        }
        XQ8 xq82 = new XQ8(this, this);
        this.LLD = xq82;
        return xq82;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        XQ2<K, V>[] xq2Arr = this.LJLJI;
        long j = 0;
        for (int i2 = 0; i2 < xq2Arr.length; i2++) {
            if (xq2Arr[i2].LJLILLLLZI != 0) {
                return false;
            }
            j += xq2Arr[i2].LJLJJI;
        }
        if (j != 0) {
            for (int i3 = 0; i3 < xq2Arr.length; i3++) {
                if (xq2Arr[i3].LJLILLLLZI != 0) {
                    return false;
                }
                j -= xq2Arr[i3].LJLJJI;
            }
            if (j != 0) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set<K> keySet() {
        XQC xqc = this.LJZL;
        if (xqc != null) {
            return xqc;
        }
        XQC xqc2 = new XQC(this, this);
        this.LJZL = xqc2;
        return xqc2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        long j = 0;
        for (int i2 = 0; i2 < this.LJLJI.length; i2++) {
            j += Math.max(0, r6[i2].LJLILLLLZI);
        }
        return C65713Pqf.LIZ(j);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection<V> values() {
        C65772Prc c65772Prc = this.LL;
        if (c65772Prc != null) {
            return c65772Prc;
        }
        C65772Prc c65772Prc2 = new C65772Prc(this, this);
        this.LL = c65772Prc2;
        return c65772Prc2;
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

    public XQ3(XQ5 xq5) {
        long j;
        Queue<XQF<K, V>> concurrentLinkedQueue;
        boolean z;
        char c2;
        boolean z2;
        int i2;
        int i3 = xq5.LIZJ;
        this.LJLJJI = Math.min(i3 == -1 ? 4 : i3, 65536);
        XQ9 xq9 = xq5.LJI;
        XQD xqd = XQ9.LJLIL;
        XQ9 xq92 = (XQ9) C65749PrF.LIZ(xq9, xqd);
        this.LJLJL = xq92;
        this.LJLJLJ = (XQ9) C65749PrF.LIZ(xq5.LJII, xqd);
        this.LJLJJL = (XQK) C65749PrF.LIZ(xq5.LJIIJJI, ((XQ9) C65749PrF.LIZ(xq5.LJI, xqd)).LIZJ());
        this.LJLJJLL = (XQK) C65749PrF.LIZ(xq5.LJIIL, ((XQ9) C65749PrF.LIZ(xq5.LJII, xqd)).LIZJ());
        if (xq5.LJIIIIZZ == 0 || xq5.LJIIIZ == 0) {
            j = 0;
        } else if (xq5.LJFF == null) {
            j = xq5.LIZLLL;
        } else {
            j = xq5.LJ;
        }
        this.LJLJLLL = j;
        XQP<? super K, ? super V> xqp = xq5.LJFF;
        XQE xqe = XQE.LJLIL;
        XQP<K, V> xqp2 = (XQP) C65749PrF.LIZ(xqp, xqe);
        this.LJLL = xqp2;
        long j2 = xq5.LJIIIZ;
        this.LJLLI = j2 == -1 ? 0L : j2;
        long j3 = xq5.LJIIIIZZ;
        this.LJLLILLLL = j3 == -1 ? 0L : j3;
        long j4 = xq5.LJIIJ;
        this.LJLLJ = j4 != -1 ? j4 : 0L;
        InterfaceC84783XPf<? super K, ? super V> interfaceC84783XPf = xq5.LJIILIIL;
        EnumC84784XPg enumC84784XPg = EnumC84784XPg.LJLIL;
        InterfaceC84783XPf<K, V> interfaceC84783XPf2 = (InterfaceC84783XPf) C65749PrF.LIZ(interfaceC84783XPf, enumC84784XPg);
        this.LJLLLL = interfaceC84783XPf2;
        if (interfaceC84783XPf2 == enumC84784XPg) {
            concurrentLinkedQueue = LLFFF;
        } else {
            concurrentLinkedQueue = new ConcurrentLinkedQueue<>();
        }
        this.LJLLL = concurrentLinkedQueue;
        int i4 = 0;
        int i5 = 1;
        if (LJI() || LIZIZ()) {
            z = true;
        } else {
            z = false;
        }
        AbstractC44430HcA abstractC44430HcA = xq5.LJIILJJIL;
        if (abstractC44430HcA == null) {
            if (z) {
                abstractC44430HcA = AbstractC44430HcA.LIZ;
            } else {
                abstractC44430HcA = XQ5.LJIIZILJ;
            }
        }
        this.LJLLLLLL = abstractC44430HcA;
        if (LJIIIZ() || LIZIZ()) {
            c2 = 1;
        } else {
            c2 = 0;
        }
        if (LIZJ() || LJI()) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i6 = (xq92 != XQ9.LJLILLLLZI ? (char) 0 : (char) 4) | c2;
        if (z2) {
            i2 = 2;
        } else {
            i2 = 0;
        }
        this.LJLZ = EnumC84797XPt.LJLIL[i6 | i2];
        this.LJZ = (XQO) xq5.LJIILL.LJLIL;
        this.LJZI = null;
        int i7 = xq5.LIZIZ;
        int min = Math.min(i7 == -1 ? 16 : i7, 1073741824);
        if (LIZ() && xqp2 == xqe) {
            min = Math.min(min, (int) j);
        }
        int i8 = 1;
        int i9 = 0;
        while (i8 < this.LJLJJI && (!LIZ() || i8 * 20 <= this.LJLJLLL)) {
            i9++;
            i8 <<= 1;
        }
        this.LJLILLLLZI = 32 - i9;
        this.LJLIL = i8 - 1;
        this.LJLJI = new XQ2[i8];
        int i10 = min / i8;
        while (i5 < (i10 * i8 < min ? i10 + 1 : i10)) {
            i5 <<= 1;
        }
        if (LIZ()) {
            long j5 = this.LJLJLLL;
            long j6 = i8;
            long j7 = (j5 / j6) + 1;
            long j8 = j5 % j6;
            while (true) {
                XQ2<K, V>[] xq2Arr = this.LJLJI;
                if (i4 < xq2Arr.length) {
                    if (i4 == j8) {
                        j7--;
                    }
                    xq2Arr[i4] = new XQ2<>(this, i5, j7, (XQO) xq5.LJIILL.LJLIL);
                    i4++;
                } else {
                    return;
                }
            }
        } else {
            while (true) {
                XQ2<K, V>[] xq2Arr2 = this.LJLJI;
                if (i4 < xq2Arr2.length) {
                    xq2Arr2[i4] = new XQ2<>(this, i5, -1L, (XQO) xq5.LJIILL.LJLIL);
                    i4++;
                } else {
                    return;
                }
            }
        }
    }

    public static <E> ArrayList<E> LJIIIIZZ(Collection<E> collection) {
        ArrayList<E> arrayList = new ArrayList<>(collection.size());
        C65631PpL.LIZ(arrayList, collection.iterator());
        return arrayList;
    }

    public final int LIZLLL(Object obj) {
        int LIZIZ;
        XQK<Object> xqk = this.LJLJJL;
        if (obj == null) {
            xqk.getClass();
            LIZIZ = 0;
        } else {
            LIZIZ = xqk.LIZIZ(obj);
        }
        int i2 = LIZIZ + ((LIZIZ << 15) ^ (-12931));
        int i3 = i2 ^ (i2 >>> 10);
        int i4 = i3 + (i3 << 3);
        int i5 = i4 ^ (i4 >>> 6);
        int i6 = (i5 << 2) + (i5 << 14) + i5;
        return (i6 >>> 16) ^ i6;
    }

    public final XQ2<K, V> LJII(int i2) {
        return this.LJLJI[(i2 >>> this.LJLILLLLZI) & this.LJLIL];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        boolean z = false;
        if (obj == null) {
            return false;
        }
        int LIZLLL = LIZLLL(obj);
        XQ2<K, V> LJII = LJII(LIZLLL);
        LJII.getClass();
        try {
            if (LJII.LJLILLLLZI != 0) {
                long LIZ = LJII.LJLIL.LJLLLLLL.LIZ();
                InterfaceC84796XPs<K, V> LJIIIZ = LJII.LJIIIZ(LIZLLL, obj);
                if (LJIIIZ != null) {
                    if (LJII.LJLIL.LJ(LJIIIZ, LIZ)) {
                        if (LJII.tryLock()) {
                            try {
                                LJII.LJI(LIZ);
                                LJII.unlock();
                            } catch (Throwable th) {
                                LJII.unlock();
                                throw th;
                            }
                        }
                    } else if (LJIIIZ.LIZLLL().get() != null) {
                        z = true;
                    }
                }
            }
            return z;
        } finally {
            LJII.LJIIL();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        if (obj == null) {
            return false;
        }
        long LIZ = this.LJLLLLLL.LIZ();
        XQ2<K, V>[] xq2Arr = this.LJLJI;
        long j = -1;
        int i2 = 0;
        do {
            long j2 = 0;
            for (XQ2<K, V> xq2 : xq2Arr) {
                AtomicReferenceArray<InterfaceC84796XPs<K, V>> atomicReferenceArray = xq2.LJLJJLL;
                for (int i3 = 0; i3 < atomicReferenceArray.length(); i3++) {
                    for (InterfaceC84796XPs<K, V> interfaceC84796XPs = atomicReferenceArray.get(i3); interfaceC84796XPs != null; interfaceC84796XPs = interfaceC84796XPs.LIZJ()) {
                        V LJIIJ = xq2.LJIIJ(interfaceC84796XPs, LIZ);
                        if (LJIIJ != null && this.LJLJJLL.LIZJ(obj, LJIIJ)) {
                            return true;
                        }
                    }
                }
                j2 += xq2.LJLJJI;
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
    
        r12 = X.XQG.EXPLICIT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004e, code lost:
    
        r5.LJLJJI++;
        r1 = r5.LJIJI(r6, r7, r8, r9, r10, r11, r12);
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
    
        r12 = X.XQG.COLLECTED;
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
            X.XQ2 r5 = r13.LJII(r9)
            r5.lock()
            X.XQ3<K, V> r0 = r5.LJLIL     // Catch: java.lang.Throwable -> L7f
            X.HcA r0 = r0.LJLLLLLL     // Catch: java.lang.Throwable -> L7f
            long r0 = r0.LIZ()     // Catch: java.lang.Throwable -> L7f
            r5.LJIJJ(r0)     // Catch: java.lang.Throwable -> L7f
            java.util.concurrent.atomic.AtomicReferenceArray<X.XPs<K, V>> r3 = r5.LJLJJLL     // Catch: java.lang.Throwable -> L7f
            int r0 = r3.length()     // Catch: java.lang.Throwable -> L7f
            int r2 = r0 + (-1)
            r2 = r2 & r9
            java.lang.Object r6 = r3.get(r2)     // Catch: java.lang.Throwable -> L7f
            X.XPs r6 = (X.InterfaceC84796XPs) r6     // Catch: java.lang.Throwable -> L7f
            r7 = r6
        L2a:
            if (r7 == 0) goto L78
            java.lang.Object r8 = r7.getKey()     // Catch: java.lang.Throwable -> L7f
            int r0 = r7.LJII()     // Catch: java.lang.Throwable -> L7f
            if (r0 != r9) goto L6b
            if (r8 == 0) goto L6b
            X.XQ3<K, V> r0 = r5.LJLIL     // Catch: java.lang.Throwable -> L7f
            X.XQK<java.lang.Object> r0 = r0.LJLJJL     // Catch: java.lang.Throwable -> L7f
            boolean r0 = r0.LIZJ(r14, r8)     // Catch: java.lang.Throwable -> L7f
            if (r0 == 0) goto L6b
            X.XPL r11 = r7.LIZLLL()     // Catch: java.lang.Throwable -> L7f
            java.lang.Object r10 = r11.get()     // Catch: java.lang.Throwable -> L7f
            if (r10 == 0) goto L62
            X.XQG r12 = X.XQG.EXPLICIT     // Catch: java.lang.Throwable -> L7f
        L4e:
            int r0 = r5.LJLJJI     // Catch: java.lang.Throwable -> L7f
            int r0 = r0 + 1
            r5.LJLJJI = r0     // Catch: java.lang.Throwable -> L7f
            X.XPs r1 = r5.LJIJI(r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L7f
            int r0 = r5.LJLILLLLZI     // Catch: java.lang.Throwable -> L7f
            int r0 = r0 + (-1)
            r3.set(r2, r1)     // Catch: java.lang.Throwable -> L7f
            r5.LJLILLLLZI = r0     // Catch: java.lang.Throwable -> L7f
            goto L70
        L62:
            boolean r0 = r11.isActive()     // Catch: java.lang.Throwable -> L7f
            if (r0 == 0) goto L78
            X.XQG r12 = X.XQG.COLLECTED     // Catch: java.lang.Throwable -> L7f
            goto L4e
        L6b:
            X.XPs r7 = r7.LIZJ()     // Catch: java.lang.Throwable -> L7f
            goto L2a
        L70:
            r5.unlock()
            r5.LJIJJLI()
            r4 = r10
            goto L7e
        L78:
            r5.unlock()
            r5.LJIJJLI()
        L7e:
            return r4
        L7f:
            r0 = move-exception
            r5.unlock()
            r5.LJIJJLI()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.XQ3.remove(java.lang.Object):java.lang.Object");
    }

    public final boolean LJ(InterfaceC84796XPs<K, V> interfaceC84796XPs, long j) {
        interfaceC84796XPs.getClass();
        if (LIZIZ() && j - interfaceC84796XPs.LJIIL() >= this.LJLLI) {
            return true;
        }
        if (LIZJ() && j - interfaceC84796XPs.LJIIIIZZ() >= this.LJLLILLLL) {
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
        return (V) LJII(LIZLLL).LJIILIIL(LIZLLL, k, v, false);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final V putIfAbsent(K k, V v) {
        k.getClass();
        v.getClass();
        int LIZLLL = LIZLLL(k);
        return (V) LJII(LIZLLL).LJIILIIL(LIZLLL, k, v, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
    
        r13 = r9.LIZLLL();
        r12 = r13.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0058, code lost:
    
        if (r7.LJLIL.LJLJJLL.LIZJ(r17, r12) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
    
        r14 = X.XQG.EXPLICIT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005c, code lost:
    
        r7.LJLJJI++;
        r1 = r7.LJIJI(r8, r9, r10, r11, r12, r13, r14);
        r0 = r7.LJLILLLLZI - 1;
        r3.set(r2, r1);
        r7.LJLILLLLZI = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0070, code lost:
    
        if (r14 != X.XQG.EXPLICIT) goto L27;
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
    
        r14 = X.XQG.COLLECTED;
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
            X.XQ2 r7 = r15.LJII(r11)
            r7.lock()
            X.XQ3<K, V> r0 = r7.LJLIL     // Catch: java.lang.Throwable -> L8b
            X.HcA r0 = r0.LJLLLLLL     // Catch: java.lang.Throwable -> L8b
            long r2 = r0.LIZ()     // Catch: java.lang.Throwable -> L8b
            r7.LJIJJ(r2)     // Catch: java.lang.Throwable -> L8b
            java.util.concurrent.atomic.AtomicReferenceArray<X.XPs<K, V>> r3 = r7.LJLJJLL     // Catch: java.lang.Throwable -> L8b
            int r2 = r3.length()     // Catch: java.lang.Throwable -> L8b
            r5 = 1
            int r2 = r2 - r5
            r2 = r2 & r11
            java.lang.Object r8 = r3.get(r2)     // Catch: java.lang.Throwable -> L8b
            X.XPs r8 = (X.InterfaceC84796XPs) r8     // Catch: java.lang.Throwable -> L8b
            r9 = r8
        L30:
            if (r9 == 0) goto L84
            java.lang.Object r10 = r9.getKey()     // Catch: java.lang.Throwable -> L8b
            int r0 = r9.LJII()     // Catch: java.lang.Throwable -> L8b
            if (r0 != r11) goto L7e
            if (r10 == 0) goto L7e
            X.XQ3<K, V> r0 = r7.LJLIL     // Catch: java.lang.Throwable -> L8b
            X.XQK<java.lang.Object> r0 = r0.LJLJJL     // Catch: java.lang.Throwable -> L8b
            boolean r0 = r0.LIZJ(r4, r10)     // Catch: java.lang.Throwable -> L8b
            if (r0 == 0) goto L7e
            X.XPL r13 = r9.LIZLLL()     // Catch: java.lang.Throwable -> L8b
            java.lang.Object r12 = r13.get()     // Catch: java.lang.Throwable -> L8b
            X.XQ3<K, V> r0 = r7.LJLIL     // Catch: java.lang.Throwable -> L8b
            X.XQK<java.lang.Object> r0 = r0.LJLJJLL     // Catch: java.lang.Throwable -> L8b
            boolean r0 = r0.LIZJ(r1, r12)     // Catch: java.lang.Throwable -> L8b
            if (r0 == 0) goto L73
            X.XQG r14 = X.XQG.EXPLICIT     // Catch: java.lang.Throwable -> L8b
        L5c:
            int r0 = r7.LJLJJI     // Catch: java.lang.Throwable -> L8b
            int r0 = r0 + 1
            r7.LJLJJI = r0     // Catch: java.lang.Throwable -> L8b
            X.XPs r1 = r7.LJIJI(r8, r9, r10, r11, r12, r13, r14)     // Catch: java.lang.Throwable -> L8b
            int r0 = r7.LJLILLLLZI     // Catch: java.lang.Throwable -> L8b
            int r0 = r0 - r5
            r3.set(r2, r1)     // Catch: java.lang.Throwable -> L8b
            r7.LJLILLLLZI = r0     // Catch: java.lang.Throwable -> L8b
            X.XQG r0 = X.XQG.EXPLICIT     // Catch: java.lang.Throwable -> L8b
            if (r14 != r0) goto L84
            goto L83
        L73:
            if (r12 != 0) goto L84
            boolean r0 = r13.isActive()     // Catch: java.lang.Throwable -> L8b
            if (r0 == 0) goto L84
            X.XQG r14 = X.XQG.COLLECTED     // Catch: java.lang.Throwable -> L8b
            goto L5c
        L7e:
            X.XPs r9 = r9.LIZJ()     // Catch: java.lang.Throwable -> L8b
            goto L30
        L83:
            r6 = 1
        L84:
            r7.unlock()
            r7.LJIJJLI()
            return r6
        L8b:
            r0 = move-exception
            r7.unlock()
            r7.LJIJJLI()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.XQ3.remove(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0094, code lost:
    
        r5.unlock();
        r5.LJIJJLI();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x009b, code lost:
    
        return null;
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final V replace(K r18, V r19) {
        /*
            r17 = this;
            r13 = r18
            r13.getClass()
            r14 = r19
            r14.getClass()
            r0 = r17
            int r9 = r0.LIZLLL(r13)
            X.XQ2 r5 = r0.LJII(r9)
            r5.lock()
            X.XQ3<K, V> r0 = r5.LJLIL     // Catch: java.lang.Throwable -> L9c
            X.HcA r0 = r0.LJLLLLLL     // Catch: java.lang.Throwable -> L9c
            long r0 = r0.LIZ()     // Catch: java.lang.Throwable -> L9c
            r5.LJIJJ(r0)     // Catch: java.lang.Throwable -> L9c
            java.util.concurrent.atomic.AtomicReferenceArray<X.XPs<K, V>> r3 = r5.LJLJJLL     // Catch: java.lang.Throwable -> L9c
            int r2 = r3.length()     // Catch: java.lang.Throwable -> L9c
            int r2 = r2 + (-1)
            r2 = r2 & r9
            java.lang.Object r6 = r3.get(r2)     // Catch: java.lang.Throwable -> L9c
            X.XPs r6 = (X.InterfaceC84796XPs) r6     // Catch: java.lang.Throwable -> L9c
            r7 = r6
        L32:
            if (r7 == 0) goto L94
            java.lang.Object r8 = r7.getKey()     // Catch: java.lang.Throwable -> L9c
            int r4 = r7.LJII()     // Catch: java.lang.Throwable -> L9c
            if (r4 != r9) goto L70
            if (r8 == 0) goto L70
            X.XQ3<K, V> r4 = r5.LJLIL     // Catch: java.lang.Throwable -> L9c
            X.XQK<java.lang.Object> r4 = r4.LJLJJL     // Catch: java.lang.Throwable -> L9c
            boolean r4 = r4.LIZJ(r13, r8)     // Catch: java.lang.Throwable -> L9c
            if (r4 == 0) goto L70
            X.XPL r11 = r7.LIZLLL()     // Catch: java.lang.Throwable -> L9c
            java.lang.Object r10 = r11.get()     // Catch: java.lang.Throwable -> L9c
            if (r10 != 0) goto L75
            boolean r0 = r11.isActive()     // Catch: java.lang.Throwable -> L9c
            if (r0 == 0) goto L94
            int r0 = r5.LJLJJI     // Catch: java.lang.Throwable -> L9c
            int r0 = r0 + 1
            r5.LJLJJI = r0     // Catch: java.lang.Throwable -> L9c
            X.XQG r12 = X.XQG.COLLECTED     // Catch: java.lang.Throwable -> L9c
            X.XPs r1 = r5.LJIJI(r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L9c
            int r0 = r5.LJLILLLLZI     // Catch: java.lang.Throwable -> L9c
            int r0 = r0 + (-1)
            r3.set(r2, r1)     // Catch: java.lang.Throwable -> L9c
            r5.LJLILLLLZI = r0     // Catch: java.lang.Throwable -> L9c
            goto L94
        L70:
            X.XPs r7 = r7.LIZJ()     // Catch: java.lang.Throwable -> L9c
            goto L32
        L75:
            int r2 = r5.LJLJJI     // Catch: java.lang.Throwable -> L9c
            int r2 = r2 + 1
            r5.LJLJJI = r2     // Catch: java.lang.Throwable -> L9c
            int r3 = r11.LIZ()     // Catch: java.lang.Throwable -> L9c
            X.XQG r2 = X.XQG.REPLACED     // Catch: java.lang.Throwable -> L9c
            r5.LIZLLL(r13, r10, r3, r2)     // Catch: java.lang.Throwable -> L9c
            r11 = r5
            r12 = r7
            r15 = r0
            r11.LJJ(r12, r13, r14, r15)     // Catch: java.lang.Throwable -> L9c
            r5.LJ(r7)     // Catch: java.lang.Throwable -> L9c
            r5.unlock()
            r5.LJIJJLI()
            goto L9b
        L94:
            r5.unlock()
            r5.LJIJJLI()
            r10 = 0
        L9b:
            return r10
        L9c:
            r0 = move-exception
            r5.unlock()
            r5.LJIJJLI()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.XQ3.replace(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final boolean replace(K k, V v, V v2) {
        k.getClass();
        v2.getClass();
        if (v == null) {
            return false;
        }
        int LIZLLL = LIZLLL(k);
        XQ2<K, V> LJII = LJII(LIZLLL);
        LJII.lock();
        try {
            long LIZ = LJII.LJLIL.LJLLLLLL.LIZ();
            LJII.LJIJJ(LIZ);
            AtomicReferenceArray<InterfaceC84796XPs<K, V>> atomicReferenceArray = LJII.LJLJJLL;
            int length = (atomicReferenceArray.length() - 1) & LIZLLL;
            InterfaceC84796XPs<K, V> interfaceC84796XPs = atomicReferenceArray.get(length);
            InterfaceC84796XPs<K, V> interfaceC84796XPs2 = interfaceC84796XPs;
            while (true) {
                if (interfaceC84796XPs2 == null) {
                    break;
                }
                K key = interfaceC84796XPs2.getKey();
                if (interfaceC84796XPs2.LJII() == LIZLLL && key != null && LJII.LJLIL.LJLJJL.LIZJ(k, key)) {
                    XPL<K, V> LIZLLL2 = interfaceC84796XPs2.LIZLLL();
                    V v3 = LIZLLL2.get();
                    if (v3 == null) {
                        if (LIZLLL2.isActive()) {
                            LJII.LJLJJI++;
                            InterfaceC84796XPs<K, V> LJIJI = LJII.LJIJI(interfaceC84796XPs, interfaceC84796XPs2, key, LIZLLL, v3, LIZLLL2, XQG.COLLECTED);
                            int i2 = LJII.LJLILLLLZI - 1;
                            atomicReferenceArray.set(length, LJIJI);
                            LJII.LJLILLLLZI = i2;
                        }
                    } else {
                        if (LJII.LJLIL.LJLJJLL.LIZJ(v, v3)) {
                            LJII.LJLJJI++;
                            LJII.LIZLLL(k, v3, LIZLLL2.LIZ(), XQG.REPLACED);
                            LJII.LJJ(interfaceC84796XPs2, k, v2, LIZ);
                            LJII.LJ(interfaceC84796XPs2);
                            LJII.unlock();
                            LJII.LJIJJLI();
                            return true;
                        }
                        LJII.LJIILJJIL(interfaceC84796XPs2, LIZ);
                    }
                } else {
                    interfaceC84796XPs2 = interfaceC84796XPs2.LIZJ();
                }
            }
            return false;
        } finally {
            LJII.unlock();
            LJII.LJIJJLI();
        }
    }
}
