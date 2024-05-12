package X;

import Y.ARunnableS4S0401000_15;
import java.lang.ref.ReferenceQueue;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;

/* loaded from: classes16.dex */
public class XQ2<K, V> extends ReentrantLock {
    public final XQ3<K, V> LJLIL;
    public volatile int LJLILLLLZI;
    public long LJLJI;
    public int LJLJJI;
    public int LJLJJL;
    public volatile AtomicReferenceArray<InterfaceC84796XPs<K, V>> LJLJJLL;
    public final long LJLJL;
    public final ReferenceQueue<K> LJLJLJ;
    public final ReferenceQueue<V> LJLJLLL;
    public final Queue<InterfaceC84796XPs<K, V>> LJLL;
    public final AtomicInteger LJLLI = new AtomicInteger();
    public final Queue<InterfaceC84796XPs<K, V>> LJLLILLLL;
    public final Queue<InterfaceC84796XPs<K, V>> LJLLJ;
    public final XQO LJLLL;

    public final void LIZIZ() {
        while (true) {
            InterfaceC84796XPs<K, V> poll = this.LJLL.poll();
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
        throw new UnsupportedOperationException("Method not decompiled: X.XQ2.LIZJ():void");
    }

    public final void LJFF() {
        AtomicReferenceArray<InterfaceC84796XPs<K, V>> atomicReferenceArray = this.LJLJJLL;
        int length = atomicReferenceArray.length();
        if (length >= 1073741824) {
            return;
        }
        int i = this.LJLILLLLZI;
        AtomicReferenceArray<InterfaceC84796XPs<K, V>> atomicReferenceArray2 = new AtomicReferenceArray<>(length << 1);
        this.LJLJJL = (atomicReferenceArray2.length() * 3) / 4;
        int length2 = atomicReferenceArray2.length() - 1;
        for (int i2 = 0; i2 < length; i2++) {
            InterfaceC84796XPs<K, V> interfaceC84796XPs = atomicReferenceArray.get(i2);
            if (interfaceC84796XPs != null) {
                InterfaceC84796XPs<K, V> LIZJ = interfaceC84796XPs.LIZJ();
                int LJII = interfaceC84796XPs.LJII() & length2;
                if (LIZJ == null) {
                    atomicReferenceArray2.set(LJII, interfaceC84796XPs);
                } else {
                    InterfaceC84796XPs<K, V> interfaceC84796XPs2 = interfaceC84796XPs;
                    do {
                        int LJII2 = LIZJ.LJII() & length2;
                        if (LJII2 != LJII) {
                            interfaceC84796XPs2 = LIZJ;
                            LJII = LJII2;
                        }
                        LIZJ = LIZJ.LIZJ();
                    } while (LIZJ != null);
                    atomicReferenceArray2.set(LJII, interfaceC84796XPs2);
                    while (interfaceC84796XPs != interfaceC84796XPs2) {
                        int LJII3 = interfaceC84796XPs.LJII() & length2;
                        InterfaceC84796XPs<K, V> LIZ = LIZ(interfaceC84796XPs, atomicReferenceArray2.get(LJII3));
                        if (LIZ != null) {
                            atomicReferenceArray2.set(LJII3, LIZ);
                        } else {
                            LJIILLIIL(interfaceC84796XPs);
                            i--;
                        }
                        interfaceC84796XPs = interfaceC84796XPs.LIZJ();
                    }
                }
            }
        }
        this.LJLJJLL = atomicReferenceArray2;
        this.LJLILLLLZI = i;
    }

    public final void LJIIL() {
        if ((this.LJLLI.incrementAndGet() & 63) == 0) {
            LJIJJ(this.LJLIL.LJLLLLLL.LIZ());
            LJIJJLI();
        }
    }

    public final void LJIJJLI() {
        if (!isHeldByCurrentThread()) {
            XQ3<K, V> xq3 = this.LJLIL;
            while (true) {
                XQF<K, V> poll = xq3.LJLLL.poll();
                if (poll != null) {
                    try {
                        xq3.LJLLLL.LIZJ(poll);
                    } catch (Throwable th) {
                        XQ3.LLF.log(Level.WARNING, "Exception thrown by removal listener", th);
                    }
                } else {
                    return;
                }
            }
        }
    }

    public final void LJJIFFI() {
        if (tryLock()) {
            try {
                LIZJ();
            } finally {
                unlock();
            }
        }
    }

    public final void LJ(InterfaceC84796XPs<K, V> interfaceC84796XPs) {
        if (!this.LJLIL.LIZ()) {
            return;
        }
        LIZIZ();
        if (interfaceC84796XPs.LIZLLL().LIZ() <= this.LJLJL || LJIIZILJ(interfaceC84796XPs, interfaceC84796XPs.LJII(), XQG.SIZE)) {
            while (this.LJLJI > this.LJLJL) {
                for (InterfaceC84796XPs<K, V> interfaceC84796XPs2 : this.LJLLJ) {
                    if (interfaceC84796XPs2.LIZLLL().LIZ() > 0) {
                        if (!LJIIZILJ(interfaceC84796XPs2, interfaceC84796XPs2.LJII(), XQG.SIZE)) {
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
        InterfaceC84796XPs<K, V> peek;
        InterfaceC84796XPs<K, V> peek2;
        LIZIZ();
        do {
            peek = this.LJLLILLLL.peek();
            if (peek == null || !this.LJLIL.LJ(peek, j)) {
                do {
                    peek2 = this.LJLLJ.peek();
                    if (peek2 == null || !this.LJLIL.LJ(peek2, j)) {
                        return;
                    }
                } while (LJIIZILJ(peek2, peek2.LJII(), XQG.EXPIRED));
                throw new AssertionError();
            }
        } while (LJIIZILJ(peek, peek.LJII(), XQG.EXPIRED));
        throw new AssertionError();
    }

    public final void LJIILLIIL(InterfaceC84796XPs<K, V> interfaceC84796XPs) {
        K key = interfaceC84796XPs.getKey();
        interfaceC84796XPs.LJII();
        LIZLLL(key, interfaceC84796XPs.LIZLLL().get(), interfaceC84796XPs.LIZLLL().LIZ(), XQG.COLLECTED);
        this.LJLLILLLL.remove(interfaceC84796XPs);
        this.LJLLJ.remove(interfaceC84796XPs);
    }

    public final void LJIJJ(long j) {
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

    public final InterfaceC84796XPs<K, V> LIZ(InterfaceC84796XPs<K, V> interfaceC84796XPs, InterfaceC84796XPs<K, V> interfaceC84796XPs2) {
        if (interfaceC84796XPs.getKey() == null) {
            return null;
        }
        XPL<K, V> LIZLLL = interfaceC84796XPs.LIZLLL();
        V v = LIZLLL.get();
        if (v == null && LIZLLL.isActive()) {
            return null;
        }
        InterfaceC84796XPs<K, V> LIZLLL2 = this.LJLIL.LJLZ.LIZLLL(this, interfaceC84796XPs, interfaceC84796XPs2);
        LIZLLL2.LJIILLIIL(LIZLLL.LJ(this.LJLJLLL, v, LIZLLL2));
        return LIZLLL2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0037 A[Catch: all -> 0x005b, TRY_ENTER, TryCatch #1 {all -> 0x005b, blocks: (B:2:0x0000, B:4:0x0006, B:12:0x0037, B:14:0x0041, B:17:0x0054, B:18:0x0016, B:20:0x001e, B:24:0x0027, B:27:0x002c, B:28:0x002f, B:23:0x0024), top: B:1:0x0000, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0033 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJII(int r11, java.lang.Object r12) {
        /*
            r10 = this;
            r2 = r10
            int r0 = r2.LJLILLLLZI     // Catch: java.lang.Throwable -> L5b
            r1 = 0
            if (r0 == 0) goto L57
            X.XQ3<K, V> r0 = r2.LJLIL     // Catch: java.lang.Throwable -> L5b
            X.HcA r0 = r0.LJLLLLLL     // Catch: java.lang.Throwable -> L5b
            long r7 = r0.LIZ()     // Catch: java.lang.Throwable -> L5b
            r5 = r11
            X.XPs r3 = r2.LJIIIZ(r5, r12)     // Catch: java.lang.Throwable -> L5b
            if (r3 != 0) goto L16
            goto L30
        L16:
            X.XQ3<K, V> r0 = r2.LJLIL     // Catch: java.lang.Throwable -> L5b
            boolean r0 = r0.LJ(r3, r7)     // Catch: java.lang.Throwable -> L5b
            if (r0 == 0) goto L31
            boolean r0 = r2.tryLock()     // Catch: java.lang.Throwable -> L5b
            if (r0 == 0) goto L30
            r2.LJI(r7)     // Catch: java.lang.Throwable -> L2b
            r2.unlock()     // Catch: java.lang.Throwable -> L5b
            goto L30
        L2b:
            r0 = move-exception
            r2.unlock()     // Catch: java.lang.Throwable -> L5b
            throw r0     // Catch: java.lang.Throwable -> L5b
        L30:
            r3 = r1
        L31:
            if (r3 != 0) goto L37
            r2.LJIIL()
            return r1
        L37:
            X.XPL r0 = r3.LIZLLL()     // Catch: java.lang.Throwable -> L5b
            java.lang.Object r6 = r0.get()     // Catch: java.lang.Throwable -> L5b
            if (r6 == 0) goto L54
            r2.LJIILL(r3, r7)     // Catch: java.lang.Throwable -> L5b
            java.lang.Object r4 = r3.getKey()     // Catch: java.lang.Throwable -> L5b
            X.XQ3<K, V> r0 = r2.LJLIL     // Catch: java.lang.Throwable -> L5b
            X.XPX<? super K, V> r9 = r0.LJZI     // Catch: java.lang.Throwable -> L5b
            java.lang.Object r0 = r2.LJIL(r3, r4, r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L5b
            r2.LJIIL()
            return r0
        L54:
            r2.LJJIFFI()     // Catch: java.lang.Throwable -> L5b
        L57:
            r2.LJIIL()
            return r1
        L5b:
            r0 = move-exception
            r2.LJIIL()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.XQ2.LJII(int, java.lang.Object):java.lang.Object");
    }

    public final InterfaceC84796XPs LJIIIZ(int i, Object obj) {
        for (InterfaceC84796XPs<K, V> interfaceC84796XPs = this.LJLJJLL.get((r1.length() - 1) & i); interfaceC84796XPs != null; interfaceC84796XPs = interfaceC84796XPs.LIZJ()) {
            if (interfaceC84796XPs.LJII() == i) {
                K key = interfaceC84796XPs.getKey();
                if (key == null) {
                    LJJIFFI();
                } else if (this.LJLIL.LJLJJL.LIZJ(obj, key)) {
                    return interfaceC84796XPs;
                }
            }
        }
        return null;
    }

    public final V LJIIJ(InterfaceC84796XPs<K, V> interfaceC84796XPs, long j) {
        if (interfaceC84796XPs.getKey() == null) {
            LJJIFFI();
            return null;
        }
        V v = interfaceC84796XPs.LIZLLL().get();
        if (v == null) {
            LJJIFFI();
            return null;
        }
        if (this.LJLIL.LJ(interfaceC84796XPs, j)) {
            if (tryLock()) {
                try {
                    LJI(j);
                } finally {
                    unlock();
                }
            }
            return null;
        }
        return v;
    }

    public final void LJIILJJIL(InterfaceC84796XPs<K, V> interfaceC84796XPs, long j) {
        if (this.LJLIL.LIZIZ()) {
            interfaceC84796XPs.LJIIIZ(j);
        }
        this.LJLLJ.add(interfaceC84796XPs);
    }

    public final void LJIILL(InterfaceC84796XPs<K, V> interfaceC84796XPs, long j) {
        if (this.LJLIL.LIZIZ()) {
            interfaceC84796XPs.LJIIIZ(j);
        }
        this.LJLL.add(interfaceC84796XPs);
    }

    public final InterfaceC84796XPs<K, V> LJIJ(InterfaceC84796XPs<K, V> interfaceC84796XPs, InterfaceC84796XPs<K, V> interfaceC84796XPs2) {
        int i = this.LJLILLLLZI;
        InterfaceC84796XPs<K, V> LIZJ = interfaceC84796XPs2.LIZJ();
        while (interfaceC84796XPs != interfaceC84796XPs2) {
            InterfaceC84796XPs<K, V> LIZ = LIZ(interfaceC84796XPs, LIZJ);
            if (LIZ != null) {
                LIZJ = LIZ;
            } else {
                LJIILLIIL(interfaceC84796XPs);
                i--;
            }
            interfaceC84796XPs = interfaceC84796XPs.LIZJ();
        }
        this.LJLILLLLZI = i;
        return LIZJ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x008b, code lost:
    
        if (r12 == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x008d, code lost:
    
        r4 = new X.XPG<>();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0092, code lost:
    
        if (r5 != null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0094, code lost:
    
        r0 = r13.LJLIL.LJLZ;
        r14.getClass();
        r5 = r0.LJFF(r15, r13, r6, r14);
        r5.LJIILLIIL(r4);
        r8.set(r7, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a6, code lost:
    
        r5.LJIILLIIL(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00af, code lost:
    
        if (r12 == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00d1, code lost:
    
        return LJJII(r5, r14, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b1, code lost:
    
        monitor-enter(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b2, code lost:
    
        r1 = LJIIIIZZ(r14, r15, r4, r4.LJFF(r14, r16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00bc, code lost:
    
        monitor-exit(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c2, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c6, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c7, code lost:
    
        r13.LJLLL.LIZJ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00cc, code lost:
    
        throw r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIJJI(java.lang.Object r14, int r15, X.XPZ r16) {
        /*
            r13 = this;
            r13.lock()
            X.XQ3<K, V> r0 = r13.LJLIL     // Catch: java.lang.Throwable -> Ld2
            X.HcA r0 = r0.LJLLLLLL     // Catch: java.lang.Throwable -> Ld2
            long r0 = r0.LIZ()     // Catch: java.lang.Throwable -> Ld2
            r13.LJIJJ(r0)     // Catch: java.lang.Throwable -> Ld2
            int r2 = r13.LJLILLLLZI     // Catch: java.lang.Throwable -> Ld2
            int r10 = r2 + (-1)
            java.util.concurrent.atomic.AtomicReferenceArray<X.XPs<K, V>> r8 = r13.LJLJJLL     // Catch: java.lang.Throwable -> Ld2
            int r7 = r8.length()     // Catch: java.lang.Throwable -> Ld2
            r12 = 1
            int r7 = r7 - r12
            r7 = r7 & r15
            java.lang.Object r6 = r8.get(r7)     // Catch: java.lang.Throwable -> Ld2
            X.XPs r6 = (X.InterfaceC84796XPs) r6     // Catch: java.lang.Throwable -> Ld2
            r5 = r6
        L22:
            r4 = 0
            if (r5 == 0) goto L8a
            java.lang.Object r9 = r5.getKey()     // Catch: java.lang.Throwable -> Ld2
            int r2 = r5.LJII()     // Catch: java.lang.Throwable -> Ld2
            if (r2 != r15) goto L46
            if (r9 == 0) goto L46
            X.XQ3<K, V> r2 = r13.LJLIL     // Catch: java.lang.Throwable -> Ld2
            X.XQK<java.lang.Object> r2 = r2.LJLJJL     // Catch: java.lang.Throwable -> Ld2
            boolean r2 = r2.LIZJ(r14, r9)     // Catch: java.lang.Throwable -> Ld2
            if (r2 == 0) goto L46
            X.XPL r3 = r5.LIZLLL()     // Catch: java.lang.Throwable -> Ld2
            boolean r2 = r3.isLoading()     // Catch: java.lang.Throwable -> Ld2
            if (r2 == 0) goto L4d
            goto L4b
        L46:
            X.XPs r5 = r5.LIZJ()     // Catch: java.lang.Throwable -> Ld2
            goto L22
        L4b:
            r12 = 0
            goto L8b
        L4d:
            java.lang.Object r2 = r3.get()     // Catch: java.lang.Throwable -> Ld2
            if (r2 != 0) goto L69
            int r1 = r3.LIZ()     // Catch: java.lang.Throwable -> Ld2
            X.XQG r0 = X.XQG.COLLECTED     // Catch: java.lang.Throwable -> Ld2
            r13.LIZLLL(r9, r2, r1, r0)     // Catch: java.lang.Throwable -> Ld2
        L5c:
            java.util.Queue<X.XPs<K, V>> r0 = r13.LJLLILLLL     // Catch: java.lang.Throwable -> Ld2
            r0.remove(r5)     // Catch: java.lang.Throwable -> Ld2
            java.util.Queue<X.XPs<K, V>> r0 = r13.LJLLJ     // Catch: java.lang.Throwable -> Ld2
            r0.remove(r5)     // Catch: java.lang.Throwable -> Ld2
            r13.LJLILLLLZI = r10     // Catch: java.lang.Throwable -> Ld2
            goto L8b
        L69:
            X.XQ3<K, V> r11 = r13.LJLIL     // Catch: java.lang.Throwable -> Ld2
            boolean r11 = r11.LJ(r5, r0)     // Catch: java.lang.Throwable -> Ld2
            if (r11 == 0) goto L7b
            int r1 = r3.LIZ()     // Catch: java.lang.Throwable -> Ld2
            X.XQG r0 = X.XQG.EXPIRED     // Catch: java.lang.Throwable -> Ld2
            r13.LIZLLL(r9, r2, r1, r0)     // Catch: java.lang.Throwable -> Ld2
            goto L5c
        L7b:
            r13.LJIILJJIL(r5, r0)     // Catch: java.lang.Throwable -> Ld2
            X.XQO r0 = r13.LJLLL     // Catch: java.lang.Throwable -> Ld2
            r0.LIZLLL()     // Catch: java.lang.Throwable -> Ld2
            r13.unlock()
            r13.LJIJJLI()
            return r2
        L8a:
            r3 = r4
        L8b:
            if (r12 == 0) goto La9
            X.XPG r4 = new X.XPG     // Catch: java.lang.Throwable -> Ld2
            r4.<init>()     // Catch: java.lang.Throwable -> Ld2
            if (r5 != 0) goto La6
            X.XQ3<K, V> r0 = r13.LJLIL     // Catch: java.lang.Throwable -> Ld2
            X.XPt r0 = r0.LJLZ     // Catch: java.lang.Throwable -> Ld2
            r14.getClass()     // Catch: java.lang.Throwable -> Ld2
            X.XPs r5 = r0.LJFF(r15, r13, r6, r14)     // Catch: java.lang.Throwable -> Ld2
            r5.LJIILLIIL(r4)     // Catch: java.lang.Throwable -> Ld2
            r8.set(r7, r5)     // Catch: java.lang.Throwable -> Ld2
            goto La9
        La6:
            r5.LJIILLIIL(r4)     // Catch: java.lang.Throwable -> Ld2
        La9:
            r13.unlock()
            r13.LJIJJLI()
            if (r12 == 0) goto Lcd
            monitor-enter(r5)     // Catch: java.lang.Throwable -> Lc6
            r0 = r16
            X.XPE r0 = r4.LJFF(r14, r0)     // Catch: java.lang.Throwable -> Lc3
            java.lang.Object r1 = r13.LJIIIIZZ(r14, r15, r4, r0)     // Catch: java.lang.Throwable -> Lc3
            monitor-exit(r5)     // Catch: java.lang.Throwable -> Lc3
            X.XQO r0 = r13.LJLLL
            r0.LIZJ()
            return r1
        Lc3:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> Lc3
            throw r0     // Catch: java.lang.Throwable -> Lc6
        Lc6:
            r1 = move-exception
            X.XQO r0 = r13.LJLLL
            r0.LIZJ()
            throw r1
        Lcd:
            java.lang.Object r0 = r13.LJJII(r5, r14, r3)
            return r0
        Ld2:
            r0 = move-exception
            r13.unlock()
            r13.LJIJJLI()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.XQ2.LJIIJJI(java.lang.Object, int, X.XPZ):java.lang.Object");
    }

    public final boolean LJIIZILJ(InterfaceC84796XPs<K, V> interfaceC84796XPs, int i, XQG xqg) {
        AtomicReferenceArray<InterfaceC84796XPs<K, V>> atomicReferenceArray = this.LJLJJLL;
        int length = (atomicReferenceArray.length() - 1) & i;
        InterfaceC84796XPs<K, V> interfaceC84796XPs2 = atomicReferenceArray.get(length);
        for (InterfaceC84796XPs<K, V> interfaceC84796XPs3 = interfaceC84796XPs2; interfaceC84796XPs3 != null; interfaceC84796XPs3 = interfaceC84796XPs3.LIZJ()) {
            if (interfaceC84796XPs3 == interfaceC84796XPs) {
                this.LJLJJI++;
                InterfaceC84796XPs<K, V> LJIJI = LJIJI(interfaceC84796XPs2, interfaceC84796XPs3, interfaceC84796XPs3.getKey(), i, interfaceC84796XPs3.LIZLLL().get(), interfaceC84796XPs3.LIZLLL(), xqg);
                int i2 = this.LJLILLLLZI - 1;
                atomicReferenceArray.set(length, LJIJI);
                this.LJLILLLLZI = i2;
                return true;
            }
        }
        return false;
    }

    public final V LJJII(InterfaceC84796XPs<K, V> interfaceC84796XPs, K k, XPL<K, V> xpl) {
        if (xpl.isLoading()) {
            C76917UGr.LJIILJJIL("Recursive load of: %s", !Thread.holdsLock(interfaceC84796XPs), k);
            try {
                V LIZLLL = xpl.LIZLLL();
                if (LIZLLL != null) {
                    LJIILL(interfaceC84796XPs, this.LJLIL.LJLLLLLL.LIZ());
                    return LIZLLL;
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("CacheLoader returned null for key ");
                LIZ.append(k);
                LIZ.append(".");
                throw new XPY(X1D.LIZIZ(LIZ));
            } finally {
                this.LJLLL.LIZJ();
            }
        }
        throw new AssertionError();
    }

    public XQ2(XQ3<K, V> xq3, int i, long j, XQO xqo) {
        boolean z;
        ReferenceQueue<K> referenceQueue;
        Queue<InterfaceC84796XPs<K, V>> queue;
        Queue<InterfaceC84796XPs<K, V>> queue2;
        Queue<InterfaceC84796XPs<K, V>> queue3;
        this.LJLIL = xq3;
        this.LJLJL = j;
        xqo.getClass();
        this.LJLLL = xqo;
        AtomicReferenceArray<InterfaceC84796XPs<K, V>> atomicReferenceArray = new AtomicReferenceArray<>(i);
        int length = (atomicReferenceArray.length() * 3) / 4;
        this.LJLJJL = length;
        if (xq3.LJLL == XQE.LJLIL && length == j) {
            this.LJLJJL = length + 1;
        }
        this.LJLJJLL = atomicReferenceArray;
        XQ9 xq9 = xq3.LJLJL;
        XQD xqd = XQ9.LJLIL;
        if (xq9 != xqd) {
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
        this.LJLJLLL = xq3.LJLJLJ != xqd ? new ReferenceQueue<>() : null;
        if (xq3.LJIIIZ()) {
            queue = new ConcurrentLinkedQueue<>();
        } else {
            queue = XQ3.LLFFF;
        }
        this.LJLL = queue;
        if (xq3.LIZJ()) {
            queue2 = new C84795XPr<>();
        } else {
            queue2 = XQ3.LLFFF;
        }
        this.LJLLILLLL = queue2;
        if (xq3.LJIIIZ()) {
            queue3 = new C84792XPo<>();
        } else {
            queue3 = XQ3.LLFFF;
        }
        this.LJLLJ = queue3;
    }

    public final void LIZLLL(Object obj, Object obj2, int i, XQG xqg) {
        this.LJLJI -= i;
        if (xqg.LIZJ()) {
            this.LJLLL.LIZ();
        }
        if (this.LJLIL.LJLLL != XQ3.LLFFF) {
            this.LJLIL.LJLLL.offer(XQF.create(obj, obj2, xqg));
        }
    }

    public final V LJIIIIZZ(K k, int i, XPG<K, V> xpg, C76L<V> c76l) {
        V v;
        try {
            v = (V) P8D.LIZ(c76l);
            try {
                if (v != null) {
                    this.LJLLL.LIZIZ(xpg.LJLJI.LIZIZ(TimeUnit.NANOSECONDS));
                    LJJI(k, i, xpg, v);
                    return v;
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("CacheLoader returned null for key ");
                LIZ.append(k);
                LIZ.append(".");
                throw new XPY(X1D.LIZIZ(LIZ));
            } catch (Throwable th) {
                th = th;
                if (v == null) {
                    this.LJLLL.LJ(xpg.LJLJI.LIZIZ(TimeUnit.NANOSECONDS));
                    lock();
                    try {
                        AtomicReferenceArray<InterfaceC84796XPs<K, V>> atomicReferenceArray = this.LJLJJLL;
                        int length = (atomicReferenceArray.length() - 1) & i;
                        InterfaceC84796XPs<K, V> interfaceC84796XPs = atomicReferenceArray.get(length);
                        InterfaceC84796XPs<K, V> interfaceC84796XPs2 = interfaceC84796XPs;
                        while (true) {
                            if (interfaceC84796XPs2 == null) {
                                break;
                            }
                            K key = interfaceC84796XPs2.getKey();
                            if (interfaceC84796XPs2.LJII() == i && key != null && this.LJLIL.LJLJJL.LIZJ(k, key)) {
                                if (interfaceC84796XPs2.LIZLLL() == xpg) {
                                    if (xpg.isActive()) {
                                        interfaceC84796XPs2.LJIILLIIL(xpg.LJLIL);
                                    } else {
                                        atomicReferenceArray.set(length, LJIJ(interfaceC84796XPs, interfaceC84796XPs2));
                                    }
                                }
                            } else {
                                interfaceC84796XPs2 = interfaceC84796XPs2.LIZJ();
                            }
                        }
                    } finally {
                        unlock();
                        LJIJJLI();
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            v = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object LJIILIIL(int i, Object obj, Object obj2, boolean z) {
        int i2;
        lock();
        try {
            long LIZ = this.LJLIL.LJLLLLLL.LIZ();
            LJIJJ(LIZ);
            if (this.LJLILLLLZI + 1 > this.LJLJJL) {
                LJFF();
            }
            AtomicReferenceArray<InterfaceC84796XPs<K, V>> atomicReferenceArray = this.LJLJJLL;
            int length = i & (atomicReferenceArray.length() - 1);
            InterfaceC84796XPs interfaceC84796XPs = atomicReferenceArray.get(length);
            InterfaceC84796XPs interfaceC84796XPs2 = interfaceC84796XPs;
            while (true) {
                if (interfaceC84796XPs2 != null) {
                    K key = interfaceC84796XPs2.getKey();
                    if (interfaceC84796XPs2.LJII() == i && key != null && this.LJLIL.LJLJJL.LIZJ(obj, key)) {
                        XPL<K, V> LIZLLL = interfaceC84796XPs2.LIZLLL();
                        V v = LIZLLL.get();
                        if (v == null) {
                            this.LJLJJI++;
                            if (LIZLLL.isActive()) {
                                LIZLLL(obj, v, LIZLLL.LIZ(), XQG.COLLECTED);
                                LJJ(interfaceC84796XPs2, obj, obj2, LIZ);
                                i2 = this.LJLILLLLZI;
                            } else {
                                LJJ(interfaceC84796XPs2, obj, obj2, LIZ);
                                i2 = this.LJLILLLLZI + 1;
                            }
                            this.LJLILLLLZI = i2;
                            LJ(interfaceC84796XPs2);
                        } else {
                            if (z) {
                                LJIILJJIL(interfaceC84796XPs2, LIZ);
                            } else {
                                this.LJLJJI++;
                                LIZLLL(obj, v, LIZLLL.LIZ(), XQG.REPLACED);
                                LJJ(interfaceC84796XPs2, obj, obj2, LIZ);
                                LJ(interfaceC84796XPs2);
                            }
                            return v;
                        }
                    } else {
                        interfaceC84796XPs2 = interfaceC84796XPs2.LIZJ();
                    }
                } else {
                    this.LJLJJI++;
                    EnumC84797XPt enumC84797XPt = this.LJLIL.LJLZ;
                    obj.getClass();
                    InterfaceC84796XPs LJFF = enumC84797XPt.LJFF(i, this, interfaceC84796XPs, obj);
                    LJJ(LJFF, obj, obj2, LIZ);
                    atomicReferenceArray.set(length, LJFF);
                    this.LJLILLLLZI++;
                    LJ(LJFF);
                    break;
                }
            }
            unlock();
            LJIJJLI();
            return null;
        } finally {
            unlock();
            LJIJJLI();
        }
    }

    public final void LJJ(InterfaceC84796XPs<K, V> interfaceC84796XPs, K k, V v, long j) {
        XPL<K, V> LIZLLL = interfaceC84796XPs.LIZLLL();
        this.LJLIL.LJLL.LIZJ();
        interfaceC84796XPs.LJIILLIIL(this.LJLIL.LJLJLJ.LIZLLL(1, this, interfaceC84796XPs, v));
        LIZIZ();
        this.LJLJI++;
        if (this.LJLIL.LIZIZ()) {
            interfaceC84796XPs.LJIIIZ(j);
        }
        if (this.LJLIL.LJI()) {
            interfaceC84796XPs.LJIIJ(j);
        }
        this.LJLLJ.add(interfaceC84796XPs);
        this.LJLLILLLL.add(interfaceC84796XPs);
        LIZLLL.LIZJ(v);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJJI(Object obj, int i, XPG xpg, Object obj2) {
        XQG xqg;
        lock();
        try {
            long LIZ = this.LJLIL.LJLLLLLL.LIZ();
            LJIJJ(LIZ);
            int i2 = this.LJLILLLLZI + 1;
            if (i2 > this.LJLJJL) {
                LJFF();
                i2 = this.LJLILLLLZI + 1;
            }
            AtomicReferenceArray<InterfaceC84796XPs<K, V>> atomicReferenceArray = this.LJLJJLL;
            int length = i & (atomicReferenceArray.length() - 1);
            InterfaceC84796XPs interfaceC84796XPs = atomicReferenceArray.get(length);
            InterfaceC84796XPs interfaceC84796XPs2 = interfaceC84796XPs;
            while (true) {
                if (interfaceC84796XPs2 != null) {
                    K key = interfaceC84796XPs2.getKey();
                    if (interfaceC84796XPs2.LJII() == i && key != null && this.LJLIL.LJLJJL.LIZJ(obj, key)) {
                        XPL<K, V> LIZLLL = interfaceC84796XPs2.LIZLLL();
                        V v = LIZLLL.get();
                        if (xpg == LIZLLL || (v == null && LIZLLL != XQ3.LLFF)) {
                            this.LJLJJI++;
                            if (xpg.isActive()) {
                                if (v != null) {
                                    xqg = XQG.REPLACED;
                                } else {
                                    xqg = XQG.COLLECTED;
                                }
                                LIZLLL(obj, v, xpg.LIZ(), xqg);
                                i2--;
                            }
                            LJJ(interfaceC84796XPs2, obj, obj2, LIZ);
                            this.LJLILLLLZI = i2;
                            LJ(interfaceC84796XPs2);
                        } else {
                            LIZLLL(obj, obj2, 0, XQG.REPLACED);
                        }
                    } else {
                        interfaceC84796XPs2 = interfaceC84796XPs2.LIZJ();
                    }
                } else {
                    this.LJLJJI++;
                    EnumC84797XPt enumC84797XPt = this.LJLIL.LJLZ;
                    obj.getClass();
                    InterfaceC84796XPs LJFF = enumC84797XPt.LJFF(i, this, interfaceC84796XPs, obj);
                    LJJ(LJFF, obj, obj2, LIZ);
                    atomicReferenceArray.set(length, LJFF);
                    this.LJLILLLLZI = i2;
                    LJ(LJFF);
                    break;
                }
            }
        } finally {
            unlock();
            LJIJJLI();
        }
    }

    public final V LJIL(InterfaceC84796XPs<K, V> interfaceC84796XPs, K k, int i, V v, long j, XPX<? super K, V> xpx) {
        boolean z;
        V v2;
        XPG xpg;
        if (this.LJLIL.LJLLJ > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && j - interfaceC84796XPs.LJIIIIZZ() > this.LJLIL.LJLLJ && !interfaceC84796XPs.LIZLLL().isLoading()) {
            lock();
            try {
                long LIZ = this.LJLIL.LJLLLLLL.LIZ();
                LJIJJ(LIZ);
                AtomicReferenceArray<InterfaceC84796XPs<K, V>> atomicReferenceArray = this.LJLJJLL;
                int length = (atomicReferenceArray.length() - 1) & i;
                InterfaceC84796XPs interfaceC84796XPs2 = (InterfaceC84796XPs) atomicReferenceArray.get(length);
                InterfaceC84796XPs interfaceC84796XPs3 = interfaceC84796XPs2;
                while (true) {
                    v2 = null;
                    if (interfaceC84796XPs3 != null) {
                        Object key = interfaceC84796XPs3.getKey();
                        if (interfaceC84796XPs3.LJII() == i && key != null && this.LJLIL.LJLJJL.LIZJ(k, key)) {
                            XPL<K, V> LIZLLL = interfaceC84796XPs3.LIZLLL();
                            if (!LIZLLL.isLoading() && LIZ - interfaceC84796XPs3.LJIIIIZZ() >= this.LJLIL.LJLLJ) {
                                this.LJLJJI++;
                                xpg = new XPG(LIZLLL);
                                interfaceC84796XPs3.LJIILLIIL(xpg);
                            }
                            unlock();
                            LJIJJLI();
                            xpg = null;
                        } else {
                            interfaceC84796XPs3 = interfaceC84796XPs3.LIZJ();
                        }
                    } else {
                        this.LJLJJI++;
                        xpg = new XPG();
                        EnumC84797XPt enumC84797XPt = this.LJLIL.LJLZ;
                        k.getClass();
                        InterfaceC84796XPs LJFF = enumC84797XPt.LJFF(i, this, interfaceC84796XPs2, k);
                        LJFF.LJIILLIIL(xpg);
                        atomicReferenceArray.set(length, LJFF);
                        break;
                    }
                }
                if (xpg != null) {
                    XPE LJFF2 = xpg.LJFF(k, xpx);
                    LJFF2.LJFF(new ARunnableS4S0401000_15(k, i, xpg, LJFF2, this, 1), EnumC169566l6.LJLIL);
                    if (LJFF2.isDone()) {
                        try {
                            v2 = (V) P8D.LIZ(LJFF2);
                        } catch (Throwable unused) {
                        }
                    }
                }
                if (v2 != null) {
                    return v2;
                }
            } finally {
                unlock();
                LJIJJLI();
            }
        }
        return v;
    }

    public final InterfaceC84796XPs<K, V> LJIJI(InterfaceC84796XPs<K, V> interfaceC84796XPs, InterfaceC84796XPs<K, V> interfaceC84796XPs2, K k, int i, V v, XPL<K, V> xpl, XQG xqg) {
        LIZLLL(k, v, xpl.LIZ(), xqg);
        this.LJLLILLLL.remove(interfaceC84796XPs2);
        this.LJLLJ.remove(interfaceC84796XPs2);
        if (xpl.isLoading()) {
            xpl.LIZJ(null);
            return interfaceC84796XPs;
        }
        return LJIJ(interfaceC84796XPs, interfaceC84796XPs2);
    }
}
