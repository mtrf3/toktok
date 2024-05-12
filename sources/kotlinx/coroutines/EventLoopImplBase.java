package kotlinx.coroutines;

import X.C3BS;
import X.C76800UCe;
import X.C78555UsJ;
import X.EnumC58928NAu;
import X.InterfaceC67352kd;
import X.InterfaceC74210TAo;
import X.MBA;
import X.T2N;
import X.X9J;
import X.XIE;
import X.XIH;
import X.XJB;
import X.XJC;
import X.XJD;
import X.XJE;
import X.XJF;
import X.XJG;
import X.XJH;
import X.XJJ;
import X.XJL;
import X.XJX;
import X.XKS;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public abstract class EventLoopImplBase extends XJF implements InterfaceC74210TAo {
    public volatile /* synthetic */ Object _delayed;
    public volatile /* synthetic */ int _isCompleted;
    public volatile /* synthetic */ Object _queue;
    public static final /* synthetic */ AtomicReferenceFieldUpdater _queue$FU = AtomicReferenceFieldUpdater.newUpdater(EventLoopImplBase.class, Object.class, "_queue");
    public static final /* synthetic */ AtomicReferenceFieldUpdater _delayed$FU = AtomicReferenceFieldUpdater.newUpdater(EventLoopImplBase.class, Object.class, "_delayed");

    public final void resetAll() {
        this._queue = null;
        this._delayed = null;
    }

    private final void closeQueue() {
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _queue$FU;
                C3BS c3bs = XJJ.LIZIZ;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, c3bs)) {
                    if (atomicReferenceFieldUpdater.get(this) != null) {
                        break;
                    }
                }
                return;
            }
            if (obj instanceof XJX) {
                ((XJX) obj).LIZIZ();
                return;
            }
            if (obj == XJJ.LIZIZ) {
                return;
            }
            XJX xjx = new XJX(8, true);
            xjx.LIZ(obj);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = _queue$FU;
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, xjx)) {
                if (atomicReferenceFieldUpdater2.get(this) != obj) {
                    break;
                }
            }
            return;
        }
    }

    private final Runnable dequeue() {
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                return null;
            }
            if (obj instanceof XJX) {
                XJX xjx = (XJX) obj;
                Object LJFF = xjx.LJFF();
                if (LJFF != XJX.LJI) {
                    return (Runnable) LJFF;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _queue$FU;
                XJX LJ = xjx.LJ();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, LJ) && atomicReferenceFieldUpdater.get(this) == obj) {
                }
            } else {
                if (obj == XJJ.LIZIZ) {
                    return null;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = _queue$FU;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, null)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj) {
                        break;
                    }
                }
                return (Runnable) obj;
            }
        }
    }

    @Override // X.AbstractC78624UtQ
    public void shutdown() {
        XJG.LIZ.set(null);
        setCompleted(true);
        closeQueue();
        do {
        } while (processNextEvent() <= 0);
        rescheduleAllDelayed();
    }

    private final void rescheduleAllDelayed() {
        long nanoTime = System.nanoTime();
        while (true) {
            XJD xjd = (XJD) this._delayed;
            XJH xjh = null;
            if (xjd == null) {
                return;
            }
            synchronized (xjd) {
                if (xjd._size > 0) {
                    xjh = xjd.LIZJ(0);
                }
            }
            XJB xjb = (XJB) xjh;
            if (xjb == null) {
                return;
            } else {
                reschedule(nanoTime, xjb);
            }
        }
    }

    @Override // X.AbstractC78624UtQ
    public long getNextTime() {
        if (super.getNextTime() == 0) {
            return 0L;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (obj instanceof XJX) {
                if (!((XJX) obj).LIZLLL()) {
                    return 0L;
                }
            } else {
                if (obj != XJJ.LIZIZ) {
                    return 0L;
                }
                return Long.MAX_VALUE;
            }
        }
        XJD xjd = (XJD) this._delayed;
        Object obj2 = null;
        if (xjd != null) {
            synchronized (xjd) {
                Object[] objArr = xjd.LIZ;
                if (objArr != null) {
                    obj2 = objArr[0];
                }
            }
            XJB xjb = (XJB) obj2;
            if (xjb != null) {
                long nanoTime = xjb.LJLIL - System.nanoTime();
                if (nanoTime < 0) {
                    return 0L;
                }
                return nanoTime;
            }
        }
        return Long.MAX_VALUE;
    }

    @Override // X.AbstractC78624UtQ
    public boolean isEmpty() {
        if (!isUnconfinedQueueEmpty()) {
            return false;
        }
        XJD xjd = (XJD) this._delayed;
        if (xjd != null && xjd._size != 0) {
            return false;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (obj instanceof XJX) {
                return ((XJX) obj).LIZLLL();
            }
            if (obj != XJJ.LIZIZ) {
                return false;
            }
        }
        return true;
    }

    @Override // X.AbstractC78624UtQ
    public long processNextEvent() {
        XJH xjh;
        Object obj;
        if (processUnconfinedEvent()) {
            return 0L;
        }
        XJD xjd = (XJD) this._delayed;
        if (xjd != null && xjd._size != 0) {
            long nanoTime = System.nanoTime();
            do {
                synchronized (xjd) {
                    Object[] objArr = xjd.LIZ;
                    xjh = null;
                    if (objArr != null && (obj = objArr[0]) != null) {
                        XJB xjb = (XJB) obj;
                        if (nanoTime - xjb.LJLIL >= 0 && enqueueImpl(xjb)) {
                            xjh = xjd.LIZJ(0);
                        }
                    }
                    break;
                }
            } while (xjh != null);
        }
        Runnable dequeue = dequeue();
        if (dequeue != null) {
            dequeue.run();
            return 0L;
        }
        return getNextTime();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [int, boolean] */
    public final boolean isCompleted() {
        return this._isCompleted;
    }

    private final boolean enqueueImpl(Runnable runnable) {
        while (true) {
            Object obj = this._queue;
            if (isCompleted()) {
                return false;
            }
            if (obj == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _queue$FU;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                    if (atomicReferenceFieldUpdater.get(this) != null) {
                        break;
                    }
                }
                return true;
            }
            if (obj instanceof XJX) {
                XJX xjx = (XJX) obj;
                int LIZ = xjx.LIZ(runnable);
                if (LIZ == 0) {
                    return true;
                }
                if (LIZ != 1) {
                    if (LIZ == 2) {
                        return false;
                    }
                } else {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = _queue$FU;
                    XJX LJ = xjx.LJ();
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, LJ) && atomicReferenceFieldUpdater2.get(this) == obj) {
                    }
                }
            } else {
                if (obj == XJJ.LIZIZ) {
                    return false;
                }
                XJX xjx2 = new XJX(8, true);
                xjx2.LIZ(obj);
                xjx2.LIZ(runnable);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = _queue$FU;
                while (!atomicReferenceFieldUpdater3.compareAndSet(this, obj, xjx2)) {
                    if (atomicReferenceFieldUpdater3.get(this) != obj) {
                        break;
                    }
                }
                return true;
            }
        }
    }

    private final void setCompleted(boolean z) {
        this._isCompleted = z ? 1 : 0;
    }

    private final boolean shouldUnpark(XJB xjb) {
        XJD xjd = (XJD) this._delayed;
        Object obj = null;
        if (xjd != null) {
            synchronized (xjd) {
                Object[] objArr = xjd.LIZ;
                if (objArr != null) {
                    obj = objArr[0];
                }
            }
        }
        if (obj != xjb) {
            return false;
        }
        return true;
    }

    public final void enqueue(Runnable runnable) {
        if (enqueueImpl(runnable)) {
            unpark();
        } else {
            XJE.LJLIL.enqueue(runnable);
        }
    }

    private final int scheduleImpl(long j, XJB xjb) {
        if (isCompleted()) {
            return 1;
        }
        XJC xjc = (XJC) this._delayed;
        Object obj = null;
        if (xjc == null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _delayed$FU;
            XJC xjc2 = new XJC(j);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, xjc2) && atomicReferenceFieldUpdater.get(this) == null) {
            }
            Object obj2 = this._delayed;
            o.LJI(obj2);
            xjc = (XJC) obj2;
        }
        synchronized (xjb) {
            if (xjb.LJLILLLLZI != XJJ.LIZ) {
                synchronized (xjc) {
                    Object[] objArr = xjc.LIZ;
                    if (objArr != null) {
                        obj = objArr[0];
                    }
                    XJB xjb2 = (XJB) obj;
                    if (isCompleted()) {
                        return 1;
                    }
                    if (xjb2 == null) {
                        xjc.LIZIZ = j;
                    } else {
                        long j2 = xjb2.LJLIL;
                        if (j2 - j < 0) {
                            j = j2;
                        }
                        if (j - xjc.LIZIZ > 0) {
                            xjc.LIZIZ = j;
                        }
                    }
                    long j3 = xjb.LJLIL;
                    long j4 = xjc.LIZIZ;
                    if (j3 - j4 < 0) {
                        xjb.LJLIL = j4;
                    }
                    xjc.LIZ(xjb);
                    return 0;
                }
            }
            return 2;
        }
    }

    public Object delay(long j, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        if (j <= 0) {
            return C76800UCe.LIZ;
        }
        XKS xks = new XKS(1, C78555UsJ.LJJII(interfaceC67352kd));
        xks.LJIIL();
        scheduleResumeAfterDelay(j, xks);
        Object LJIIJJI = xks.LJIIJJI();
        if (LJIIJJI == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return LJIIJJI;
        }
        return C76800UCe.LIZ;
    }

    @Override // X.XKW
    public final void dispatch(MBA mba, Runnable runnable) {
        enqueue(runnable);
    }

    public final void schedule(long j, XJB xjb) {
        int scheduleImpl = scheduleImpl(j, xjb);
        if (scheduleImpl != 0) {
            if (scheduleImpl != 1) {
                if (scheduleImpl == 2) {
                    return;
                }
                "unexpected result".toString();
                throw new IllegalStateException("unexpected result");
            }
            reschedule(j, xjb);
            return;
        }
        if (!shouldUnpark(xjb)) {
            return;
        }
        unpark();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
    
        if (r1 < 4611686018427387903L) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.T2N scheduleInvokeOnTimeout(long r6, java.lang.Runnable r8) {
        /*
            r5 = this;
            r1 = 0
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 > 0) goto L14
        L6:
            long r3 = java.lang.System.nanoTime()
            X.XII r0 = new X.XII
            long r1 = r1 + r3
            r0.<init>(r1, r8)
            r5.schedule(r3, r0)
        L13:
            return r0
        L14:
            r1 = 9223372036854(0x8637bd05af6, double:4.5569512622224E-311)
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 < 0) goto L20
        L1d:
            X.UaD r0 = X.C77433UaD.LJLIL
            goto L13
        L20:
            r1 = 1000000(0xf4240, double:4.940656E-318)
            long r1 = r1 * r6
            r3 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L1d
            goto L6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.EventLoopImplBase.scheduleInvokeOnTimeout(long, java.lang.Runnable):X.T2N");
    }

    @Override // X.InterfaceC74210TAo
    public void scheduleResumeAfterDelay(long j, XJL<? super C76800UCe> xjl) {
        long j2 = 0;
        if (j > 0) {
            if (j >= 9223372036854L) {
                return;
            }
            j2 = 1000000 * j;
            if (j2 >= 4611686018427387903L) {
                return;
            }
        }
        long nanoTime = System.nanoTime();
        XIH xih = new XIH(this, j2 + nanoTime, xjl);
        xjl.LJIILIIL(new X9J(xih));
        schedule(nanoTime, xih);
    }

    public T2N invokeOnTimeout(long j, Runnable runnable, MBA mba) {
        return XIE.LIZ.scheduleInvokeOnTimeout(j, runnable);
    }
}
