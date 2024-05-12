package X;

import java.lang.ref.ReferenceQueue;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.XQj, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public class C84813XQj<K, V> extends ReentrantLock {
    public final ConcurrentMapC84812XQi<K, V> LJLIL;
    public volatile int LJLILLLLZI;
    public long LJLJI;
    public int LJLJJI;
    public int LJLJJL;
    public volatile AtomicReferenceArray<InterfaceC84816XQm<K, V>> LJLJJLL;
    public final long LJLJL;
    public final ReferenceQueue<K> LJLJLJ;
    public final ReferenceQueue<V> LJLJLLL;
    public final Queue<InterfaceC84816XQm<K, V>> LJLL;
    public final AtomicInteger LJLLI = new AtomicInteger();
    public final Queue<InterfaceC84816XQm<K, V>> LJLLILLLL;
    public final Queue<InterfaceC84816XQm<K, V>> LJLLJ;

    public final void LIZIZ() {
        while (true) {
            InterfaceC84816XQm<K, V> poll = this.LJLL.poll();
            if (poll != null) {
                if (this.LJLLJ.contains(poll)) {
                    this.LJLLJ.add(poll);
                }
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0109, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00f0, code lost:
    
        if (r6.isHeldByCurrentThread() == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00fa, code lost:
    
        if (r6.isHeldByCurrentThread() == false) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ() {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C84813XQj.LIZJ():void");
    }

    public final void LJFF() {
        AtomicReferenceArray<InterfaceC84816XQm<K, V>> atomicReferenceArray = this.LJLJJLL;
        int length = atomicReferenceArray.length();
        if (length >= 1073741824) {
            return;
        }
        int i = this.LJLILLLLZI;
        AtomicReferenceArray<InterfaceC84816XQm<K, V>> atomicReferenceArray2 = new AtomicReferenceArray<>(length << 1);
        this.LJLJJL = (atomicReferenceArray2.length() * 3) / 4;
        int length2 = atomicReferenceArray2.length() - 1;
        for (int i2 = 0; i2 < length; i2++) {
            InterfaceC84816XQm<K, V> interfaceC84816XQm = atomicReferenceArray.get(i2);
            if (interfaceC84816XQm != null) {
                InterfaceC84816XQm<K, V> LIZJ = interfaceC84816XQm.LIZJ();
                int LJII = interfaceC84816XQm.LJII() & length2;
                if (LIZJ == null) {
                    atomicReferenceArray2.set(LJII, interfaceC84816XQm);
                } else {
                    InterfaceC84816XQm<K, V> interfaceC84816XQm2 = interfaceC84816XQm;
                    do {
                        int LJII2 = LIZJ.LJII() & length2;
                        if (LJII2 != LJII) {
                            interfaceC84816XQm2 = LIZJ;
                            LJII = LJII2;
                        }
                        LIZJ = LIZJ.LIZJ();
                    } while (LIZJ != null);
                    atomicReferenceArray2.set(LJII, interfaceC84816XQm2);
                    while (interfaceC84816XQm != interfaceC84816XQm2) {
                        int LJII3 = interfaceC84816XQm.LJII() & length2;
                        InterfaceC84816XQm<K, V> LIZ = LIZ(interfaceC84816XQm, atomicReferenceArray2.get(LJII3));
                        if (LIZ != null) {
                            atomicReferenceArray2.set(LJII3, LIZ);
                        } else {
                            LJIIJJI(interfaceC84816XQm);
                            i--;
                        }
                        interfaceC84816XQm = interfaceC84816XQm.LIZJ();
                    }
                }
            }
        }
        this.LJLJJLL = atomicReferenceArray2;
        this.LJLILLLLZI = i;
    }

    public final void LJIIIZ() {
        if ((this.LJLLI.incrementAndGet() & 63) == 0) {
            LJIILJJIL(this.LJLIL.LJLLLL.LIZ());
            LJIILL();
        }
    }

    public final void LJIILL() {
        if (!isHeldByCurrentThread()) {
            this.LJLIL.LJLLL.getClass();
        }
    }

    public final void LJIIZILJ() {
        if (tryLock()) {
            try {
                LIZJ();
            } finally {
                unlock();
            }
        }
    }

    public final void LJ(InterfaceC84816XQm<K, V> interfaceC84816XQm) {
        if (!this.LJLIL.LIZ()) {
            return;
        }
        LIZIZ();
        if (interfaceC84816XQm.LIZLLL().LIZ() <= this.LJLJL || LJIIL(interfaceC84816XQm, interfaceC84816XQm.LJII(), XR6.SIZE)) {
            while (this.LJLJI > this.LJLJL) {
                for (InterfaceC84816XQm<K, V> interfaceC84816XQm2 : this.LJLLJ) {
                    if (interfaceC84816XQm2.LIZLLL().LIZ() > 0) {
                        if (!LJIIL(interfaceC84816XQm2, interfaceC84816XQm2.LJII(), XR6.SIZE)) {
                            throw new AssertionError();
                        }
                    }
                }
                throw new AssertionError();
            }
            return;
        }
        throw new AssertionError();
    }

    public final void LJI(long j) {
        InterfaceC84816XQm<K, V> peek;
        InterfaceC84816XQm<K, V> peek2;
        LIZIZ();
        do {
            peek = this.LJLLILLLL.peek();
            if (peek == null || !this.LJLIL.LJ(peek, j)) {
                do {
                    peek2 = this.LJLLJ.peek();
                    if (peek2 == null || !this.LJLIL.LJ(peek2, j)) {
                        return;
                    }
                } while (LJIIL(peek2, peek2.LJII(), XR6.EXPIRED));
                throw new AssertionError();
            }
        } while (LJIIL(peek, peek.LJII(), XR6.EXPIRED));
        throw new AssertionError();
    }

    public final void LJIIJJI(InterfaceC84816XQm<K, V> interfaceC84816XQm) {
        K key = interfaceC84816XQm.getKey();
        interfaceC84816XQm.LJII();
        LIZLLL(key, interfaceC84816XQm.LIZLLL().get(), interfaceC84816XQm.LIZLLL().LIZ(), XR6.COLLECTED);
        this.LJLLILLLL.remove(interfaceC84816XQm);
        this.LJLLJ.remove(interfaceC84816XQm);
    }

    public final void LJIILJJIL(long j) {
        if (tryLock()) {
            try {
                LIZJ();
                LJI(j);
                this.LJLLI.set(0);
            } finally {
                unlock();
            }
        }
    }

    public final InterfaceC84816XQm<K, V> LIZ(InterfaceC84816XQm<K, V> interfaceC84816XQm, InterfaceC84816XQm<K, V> interfaceC84816XQm2) {
        if (interfaceC84816XQm.getKey() == null) {
            return null;
        }
        InterfaceC84815XQl<K, V> LIZLLL = interfaceC84816XQm.LIZLLL();
        V v = LIZLLL.get();
        if (v == null && LIZLLL.isActive()) {
            return null;
        }
        InterfaceC84816XQm<K, V> LIZLLL2 = this.LJLIL.LJLLLLLL.LIZLLL(this, interfaceC84816XQm, interfaceC84816XQm2);
        LIZLLL.LIZLLL(this.LJLJLLL, v, LIZLLL2);
        LIZLLL2.LJIILJJIL(LIZLLL);
        return LIZLLL2;
    }

    public final Object LJII(int i, Object obj) {
        try {
            if (this.LJLILLLLZI != 0) {
                long LIZ = this.LJLIL.LJLLLL.LIZ();
                InterfaceC84816XQm<K, V> LJIIIIZZ = LJIIIIZZ(LIZ, i, obj);
                if (LJIIIIZZ == null) {
                    return null;
                }
                V v = LJIIIIZZ.LIZLLL().get();
                if (v != null) {
                    if (this.LJLIL.LIZIZ()) {
                        LJIIIIZZ.LJIIIZ(LIZ);
                    }
                    this.LJLL.add(LJIIIIZZ);
                    return v;
                }
                LJIIZILJ();
            }
            return null;
        } finally {
            LJIIIZ();
        }
    }

    public C84813XQj(ConcurrentMapC84812XQi<K, V> concurrentMapC84812XQi, int i, long j) {
        boolean z;
        ReferenceQueue<K> referenceQueue;
        Queue<InterfaceC84816XQm<K, V>> queue;
        Queue<InterfaceC84816XQm<K, V>> queue2;
        Queue<InterfaceC84816XQm<K, V>> queue3;
        this.LJLIL = concurrentMapC84812XQi;
        this.LJLJL = j;
        AtomicReferenceArray<InterfaceC84816XQm<K, V>> atomicReferenceArray = new AtomicReferenceArray<>(i);
        int length = (atomicReferenceArray.length() * 3) / 4;
        this.LJLJJL = length;
        if (concurrentMapC84812XQi.LJLL == IOU.LJLIL && length == j) {
            this.LJLJJL = length + 1;
        }
        this.LJLJJLL = atomicReferenceArray;
        XRL xrl = concurrentMapC84812XQi.LJLJL;
        XRL xrl2 = XRM.LJLIL;
        if (xrl != xrl2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            referenceQueue = new ReferenceQueue<>();
        } else {
            referenceQueue = null;
        }
        this.LJLJLJ = referenceQueue;
        this.LJLJLLL = concurrentMapC84812XQi.LJLJLJ != xrl2 ? new ReferenceQueue<>() : null;
        if (concurrentMapC84812XQi.LJIIIZ()) {
            queue = new ConcurrentLinkedQueue<>();
        } else {
            queue = ConcurrentMapC84812XQi.LL;
        }
        this.LJLL = queue;
        if (concurrentMapC84812XQi.LIZJ()) {
            queue2 = new C84818XQo<>();
        } else {
            queue2 = ConcurrentMapC84812XQi.LL;
        }
        this.LJLLILLLL = queue2;
        if (concurrentMapC84812XQi.LJIIIZ()) {
            queue3 = new C84819XQp<>();
        } else {
            queue3 = ConcurrentMapC84812XQi.LL;
        }
        this.LJLLJ = queue3;
    }

    public final InterfaceC84816XQm LJIIIIZZ(long j, int i, Object obj) {
        for (InterfaceC84816XQm<K, V> interfaceC84816XQm = this.LJLJJLL.get((r1.length() - 1) & i); interfaceC84816XQm != null; interfaceC84816XQm = interfaceC84816XQm.LIZJ()) {
            if (interfaceC84816XQm.LJII() == i) {
                K key = interfaceC84816XQm.getKey();
                if (key == null) {
                    LJIIZILJ();
                } else if (this.LJLIL.LJLJJL.LIZJ(obj, key)) {
                    if (this.LJLIL.LJ(interfaceC84816XQm, j)) {
                        if (tryLock()) {
                            try {
                                LJI(j);
                            } finally {
                                unlock();
                            }
                        }
                        return null;
                    }
                    return interfaceC84816XQm;
                }
            }
        }
        return null;
    }

    public final boolean LJIIL(InterfaceC84816XQm<K, V> interfaceC84816XQm, int i, XR6 xr6) {
        AtomicReferenceArray<InterfaceC84816XQm<K, V>> atomicReferenceArray = this.LJLJJLL;
        int length = (atomicReferenceArray.length() - 1) & i;
        InterfaceC84816XQm<K, V> interfaceC84816XQm2 = atomicReferenceArray.get(length);
        for (InterfaceC84816XQm<K, V> interfaceC84816XQm3 = interfaceC84816XQm2; interfaceC84816XQm3 != null; interfaceC84816XQm3 = interfaceC84816XQm3.LIZJ()) {
            if (interfaceC84816XQm3 == interfaceC84816XQm) {
                this.LJLJJI++;
                InterfaceC84816XQm<K, V> LJIILIIL = LJIILIIL(interfaceC84816XQm2, interfaceC84816XQm3, interfaceC84816XQm3.getKey(), i, interfaceC84816XQm3.LIZLLL().get(), interfaceC84816XQm3.LIZLLL(), xr6);
                int i2 = this.LJLILLLLZI - 1;
                atomicReferenceArray.set(length, LJIILIIL);
                this.LJLILLLLZI = i2;
                return true;
            }
        }
        return false;
    }

    public final void LJIILLIIL(InterfaceC84816XQm interfaceC84816XQm, Object obj, long j) {
        InterfaceC84815XQl<K, V> LIZLLL = interfaceC84816XQm.LIZLLL();
        this.LJLIL.LJLL.getClass();
        this.LJLIL.LJLJLJ.getClass();
        interfaceC84816XQm.LJIILJJIL(new C84820XQq(obj));
        LIZIZ();
        this.LJLJI++;
        if (this.LJLIL.LIZIZ()) {
            interfaceC84816XQm.LJIIIZ(j);
        }
        if (this.LJLIL.LJI()) {
            interfaceC84816XQm.LJIIJ(j);
        }
        this.LJLLJ.add(interfaceC84816XQm);
        this.LJLLILLLL.add(interfaceC84816XQm);
        LIZLLL.LIZJ();
    }

    public final void LIZLLL(Object obj, Object obj2, int i, XR6 xr6) {
        this.LJLJI -= i;
        if (this.LJLIL.LJLLL != ConcurrentMapC84812XQi.LL) {
            XQH.create(obj, obj2, xr6);
            this.LJLIL.LJLLL.getClass();
        }
    }

    public final Object LJIIJ(int i, Object obj, Object obj2, boolean z) {
        int i2;
        lock();
        try {
            long LIZ = this.LJLIL.LJLLLL.LIZ();
            LJIILJJIL(LIZ);
            if (this.LJLILLLLZI + 1 > this.LJLJJL) {
                LJFF();
            }
            AtomicReferenceArray<InterfaceC84816XQm<K, V>> atomicReferenceArray = this.LJLJJLL;
            int length = (atomicReferenceArray.length() - 1) & i;
            InterfaceC84816XQm interfaceC84816XQm = atomicReferenceArray.get(length);
            InterfaceC84816XQm interfaceC84816XQm2 = interfaceC84816XQm;
            while (true) {
                if (interfaceC84816XQm2 != null) {
                    K key = interfaceC84816XQm2.getKey();
                    if (interfaceC84816XQm2.LJII() == i && key != null && this.LJLIL.LJLJJL.LIZJ(obj, key)) {
                        InterfaceC84815XQl<K, V> LIZLLL = interfaceC84816XQm2.LIZLLL();
                        V v = LIZLLL.get();
                        if (v == null) {
                            this.LJLJJI++;
                            if (LIZLLL.isActive()) {
                                LIZLLL(obj, v, LIZLLL.LIZ(), XR6.COLLECTED);
                                LJIILLIIL(interfaceC84816XQm2, obj2, LIZ);
                                i2 = this.LJLILLLLZI;
                            } else {
                                LJIILLIIL(interfaceC84816XQm2, obj2, LIZ);
                                i2 = this.LJLILLLLZI + 1;
                            }
                            this.LJLILLLLZI = i2;
                            LJ(interfaceC84816XQm2);
                        } else {
                            if (z) {
                                if (this.LJLIL.LIZIZ()) {
                                    interfaceC84816XQm2.LJIIIZ(LIZ);
                                }
                                this.LJLLJ.add(interfaceC84816XQm2);
                            } else {
                                this.LJLJJI++;
                                LIZLLL(obj, v, LIZLLL.LIZ(), XR6.REPLACED);
                                LJIILLIIL(interfaceC84816XQm2, obj2, LIZ);
                                LJ(interfaceC84816XQm2);
                            }
                            return v;
                        }
                    } else {
                        interfaceC84816XQm2 = interfaceC84816XQm2.LIZJ();
                    }
                } else {
                    this.LJLJJI++;
                    EnumC84817XQn enumC84817XQn = this.LJLIL.LJLLLLLL;
                    obj.getClass();
                    InterfaceC84816XQm LJFF = enumC84817XQn.LJFF(i, this, interfaceC84816XQm, obj);
                    LJIILLIIL(LJFF, obj2, LIZ);
                    atomicReferenceArray.set(length, LJFF);
                    this.LJLILLLLZI++;
                    LJ(LJFF);
                    break;
                }
            }
            return null;
        } finally {
            unlock();
            LJIILL();
        }
    }

    public final InterfaceC84816XQm<K, V> LJIILIIL(InterfaceC84816XQm<K, V> interfaceC84816XQm, InterfaceC84816XQm<K, V> interfaceC84816XQm2, K k, int i, V v, InterfaceC84815XQl<K, V> interfaceC84815XQl, XR6 xr6) {
        LIZLLL(k, v, interfaceC84815XQl.LIZ(), xr6);
        this.LJLLILLLL.remove(interfaceC84816XQm2);
        this.LJLLJ.remove(interfaceC84816XQm2);
        interfaceC84815XQl.isLoading();
        int i2 = this.LJLILLLLZI;
        InterfaceC84816XQm<K, V> LIZJ = interfaceC84816XQm2.LIZJ();
        while (interfaceC84816XQm != interfaceC84816XQm2) {
            InterfaceC84816XQm<K, V> LIZ = LIZ(interfaceC84816XQm, LIZJ);
            if (LIZ != null) {
                LIZJ = LIZ;
            } else {
                LJIIJJI(interfaceC84816XQm);
                i2--;
            }
            interfaceC84816XQm = interfaceC84816XQm.LIZJ();
        }
        this.LJLILLLLZI = i2;
        return LIZJ;
    }
}
