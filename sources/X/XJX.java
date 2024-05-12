package X;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes16.dex */
public final class XJX<E> {
    public final int LIZ;
    public final boolean LIZIZ;
    public final int LIZJ;
    public final /* synthetic */ AtomicReferenceArray LIZLLL;
    public volatile /* synthetic */ Object _next;
    public volatile /* synthetic */ long _state;
    public static final C3BS LJI = new C3BS("REMOVE_FROZEN");
    public static final /* synthetic */ AtomicReferenceFieldUpdater LJ = AtomicReferenceFieldUpdater.newUpdater(XJX.class, Object.class, "_next");
    public static final /* synthetic */ AtomicLongFieldUpdater LJFF = AtomicLongFieldUpdater.newUpdater(XJX.class, "_state");

    public final boolean LIZIZ() {
        long j;
        do {
            j = this._state;
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!LJFF.compareAndSet(this, j, j | 2305843009213693952L));
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final XJX<E> LJ() {
        long j;
        while (true) {
            j = this._state;
            if ((j & 1152921504606846976L) != 0) {
                break;
            }
            long j2 = j | 1152921504606846976L;
            if (LJFF.compareAndSet(this, j, j2)) {
                j = j2;
                break;
            }
        }
        while (true) {
            XJX<E> xjx = (XJX) this._next;
            if (xjx != null) {
                return xjx;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LJ;
            XJX xjx2 = new XJX(this.LIZ * 2, this.LIZIZ);
            int i = (int) ((1073741823 & j) >> 0);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i3 = this.LIZJ;
                int i4 = i & i3;
                if (i4 == (i3 & i2)) {
                    break;
                }
                Object obj = this.LIZLLL.get(i4);
                if (obj == null) {
                    obj = new XJZ(i);
                }
                xjx2.LIZLLL.set(xjx2.LIZJ & i, obj);
                i++;
            }
            xjx2._state = (-1152921504606846977L) & j;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, xjx2) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    public final int LIZJ() {
        long j = this._state;
        return 1073741823 & (((int) ((j & 1152921503533105152L) >> 30)) - ((int) ((1073741823 & j) >> 0)));
    }

    public final boolean LIZLLL() {
        long j = this._state;
        if (((int) ((1073741823 & j) >> 0)) != ((int) ((j & 1152921503533105152L) >> 30))) {
            return false;
        }
        return true;
    }

    public final Object LJFF() {
        while (true) {
            long j = this._state;
            if ((j & 1152921504606846976L) != 0) {
                return LJI;
            }
            int i = (int) ((j & 1073741823) >> 0);
            int i2 = this.LIZJ;
            int i3 = ((int) ((1152921503533105152L & j) >> 30)) & i2;
            int i4 = i2 & i;
            if (i3 == i4) {
                return null;
            }
            Object obj = this.LIZLLL.get(i4);
            if (obj == null) {
                if (this.LIZIZ) {
                    return null;
                }
            } else {
                if (obj instanceof XJZ) {
                    return null;
                }
                long j2 = ((i + 1) & 1073741823) << 0;
                if (LJFF.compareAndSet(this, j, (j & (-1073741824)) | j2)) {
                    this.LIZLLL.set(this.LIZJ & i, null);
                    return obj;
                }
                if (this.LIZIZ) {
                    XJX<E> xjx = this;
                    while (true) {
                        long j3 = xjx._state;
                        int i5 = (int) ((j3 & 1073741823) >> 0);
                        if ((j3 & 1152921504606846976L) != 0) {
                            xjx = xjx.LJ();
                            if (xjx == null) {
                                break;
                            }
                        } else {
                            if (LJFF.compareAndSet(xjx, j3, (j3 & (-1073741824)) | j2)) {
                                xjx.LIZLLL.set(xjx.LIZJ & i5, null);
                                break;
                            }
                        }
                    }
                    return obj;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x004f, code lost:
    
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LIZ(E r17) {
        /*
            r16 = this;
        L0:
            r11 = r16
            long r12 = r11._state
            r1 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r1 = r1 & r12
            r3 = 0
            r7 = 1
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L17
            r1 = 2305843009213693952(0x2000000000000000, double:1.4916681462400413E-154)
            long r1 = r1 & r12
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L16
            r7 = 2
        L16:
            return r7
        L17:
            r0 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r0 = r0 & r12
            r9 = 0
            long r0 = r0 >> r9
            int r6 = (int) r0
            r0 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r0 = r0 & r12
            r5 = 30
            long r0 = r0 >> r5
            int r2 = (int) r0
            int r3 = r11.LIZJ
            int r1 = r2 + 2
            r1 = r1 & r3
            r0 = r6 & r3
            if (r1 != r0) goto L32
            return r7
        L32:
            boolean r0 = r11.LIZIZ
            r4 = 1073741823(0x3fffffff, float:1.9999999)
            if (r0 != 0) goto L50
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r11.LIZLLL
            r0 = r2 & r3
            java.lang.Object r0 = r1.get(r0)
            if (r0 == 0) goto L50
            int r1 = r11.LIZ
            r0 = 1024(0x400, float:1.435E-42)
            if (r1 < r0) goto L4f
            int r2 = r2 - r6
            r2 = r2 & r4
            int r0 = r1 >> 1
            if (r2 <= r0) goto L0
        L4f:
            return r7
        L50:
            int r0 = r2 + 1
            r0 = r0 & r4
            java.util.concurrent.atomic.AtomicLongFieldUpdater r10 = X.XJX.LJFF
            r14 = -1152921503533105153(0xf00000003fffffff, double:-3.1050369248997324E231)
            long r14 = r14 & r12
            long r0 = (long) r0
            long r0 = r0 << r5
            long r14 = r14 | r0
            boolean r0 = r10.compareAndSet(r11, r12, r14)
            if (r0 == 0) goto L0
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r11.LIZLLL
            r0 = r2 & r3
            r8 = r17
            r1.set(r0, r8)
            r7 = r11
        L6e:
            long r5 = r7._state
            r0 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r5 = r5 & r0
            r3 = 0
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 != 0) goto L7a
        L79:
            return r9
        L7a:
            X.XJX r7 = r7.LJ()
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r7.LIZLLL
            int r0 = r7.LIZJ
            r0 = r0 & r2
            java.lang.Object r1 = r1.get(r0)
            boolean r0 = r1 instanceof X.XJZ
            if (r0 == 0) goto L79
            X.XJZ r1 = (X.XJZ) r1
            int r0 = r1.LIZ
            if (r0 != r2) goto L79
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r7.LIZLLL
            int r0 = r7.LIZJ
            r0 = r0 & r2
            r1.set(r0, r8)
            goto L6e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.XJX.LIZ(java.lang.Object):int");
    }

    public XJX(int i, boolean z) {
        boolean z2;
        this.LIZ = i;
        this.LIZIZ = z;
        int i2 = i - 1;
        this.LIZJ = i2;
        this.LIZLLL = new AtomicReferenceArray(i);
        if (i2 <= 1073741823) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if ((i & i2) == 0) {
                return;
            }
            "Check failed.".toString();
            throw new IllegalStateException("Check failed.");
        }
        "Check failed.".toString();
        throw new IllegalStateException("Check failed.");
    }
}
