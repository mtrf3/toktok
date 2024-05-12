package kotlinx.coroutines.scheduling;

import X.C0NY;
import X.C15890jp;
import X.C16880lQ;
import X.C3BS;
import X.C48263Iwt;
import X.C65314PkE;
import X.C84622XJa;
import X.C84623XJb;
import X.C84625XJd;
import X.C84626XJe;
import X.C84627XJf;
import X.EnumC84624XJc;
import X.V8B;
import X.X1D;
import X.X9O;
import X.X9P;
import X.X9Q;
import X.X9R;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class CoroutineScheduler implements Executor, Closeable {
    public volatile /* synthetic */ int _isTerminated;
    public volatile /* synthetic */ long controlState;
    public final int corePoolSize;
    public final C84626XJe globalBlockingQueue;
    public final C84626XJe globalCpuQueue;
    public final long idleWorkerKeepAliveNs;
    public final int maxPoolSize;
    public volatile /* synthetic */ long parkedWorkersStack;
    public final String schedulerName;
    public final AtomicReferenceArray<C84622XJa> workers;
    public static final C84627XJf Companion = new C84627XJf();
    public static final C3BS NOT_IN_STACK = new C3BS("NOT_IN_STACK");
    public static final /* synthetic */ AtomicLongFieldUpdater parkedWorkersStack$FU = AtomicLongFieldUpdater.newUpdater(CoroutineScheduler.class, "parkedWorkersStack");
    public static final /* synthetic */ AtomicLongFieldUpdater controlState$FU = AtomicLongFieldUpdater.newUpdater(CoroutineScheduler.class, "controlState");
    public static final /* synthetic */ AtomicIntegerFieldUpdater _isTerminated$FU = AtomicIntegerFieldUpdater.newUpdater(CoroutineScheduler.class, "_isTerminated");

    private final int blockingTasks(long j) {
        return (int) ((j & 4398044413952L) >> 21);
    }

    private final int createdWorkers(long j) {
        return (int) (j & 2097151);
    }

    private final C84622XJa parkedWorkersStackPop() {
        while (true) {
            long j = this.parkedWorkersStack;
            C84622XJa c84622XJa = this.workers.get((int) (2097151 & j));
            if (c84622XJa == null) {
                return null;
            }
            long j2 = (2097152 + j) & (-2097152);
            int parkedWorkersStackNextIndex = parkedWorkersStackNextIndex(c84622XJa);
            if (parkedWorkersStackNextIndex >= 0 && parkedWorkersStack$FU.compareAndSet(this, j, parkedWorkersStackNextIndex | j2)) {
                c84622XJa.nextParkedWorker = NOT_IN_STACK;
                return c84622XJa;
            }
        }
    }

    private final boolean tryAcquireCpuPermit() {
        long j;
        do {
            j = this.controlState;
            if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                return false;
            }
        } while (!controlState$FU.compareAndSet(this, j, j - 4398046511104L));
        return true;
    }

    public final int availableCpuPermits(long j) {
        return (int) ((j & 9223367638808264704L) >> 42);
    }

    private final int createNewWorker() {
        synchronized (this.workers) {
            if (isTerminated()) {
                return -1;
            }
            long j = this.controlState;
            int i = (int) (j & 2097151);
            int i2 = i - ((int) ((j & 4398044413952L) >> 21));
            if (i2 < 0) {
                i2 = 0;
            }
            if (i2 >= this.corePoolSize) {
                return 0;
            }
            if (i >= this.maxPoolSize) {
                return 0;
            }
            int i3 = ((int) (this.controlState & 2097151)) + 1;
            if (i3 > 0 && this.workers.get(i3) == null) {
                C84622XJa c84622XJa = new C84622XJa(this, i3);
                this.workers.set(i3, c84622XJa);
                if (i3 == ((int) (2097151 & controlState$FU.incrementAndGet(this)))) {
                    c84622XJa.start();
                    return i2 + 1;
                }
                "Failed requirement.".toString();
                throw new IllegalArgumentException("Failed requirement.");
            }
            "Failed requirement.".toString();
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    private final void decrementBlockingTasks() {
        controlState$FU.addAndGet(this, -2097152L);
    }

    private final int decrementCreatedWorkers() {
        return (int) (controlState$FU.getAndDecrement(this) & 2097151);
    }

    private final int getAvailableCpuPermits() {
        return (int) ((this.controlState & 9223367638808264704L) >> 42);
    }

    private final int getCreatedWorkers() {
        return (int) (this.controlState & 2097151);
    }

    private final long incrementBlockingTasks() {
        return controlState$FU.addAndGet(this, 2097152L);
    }

    private final int incrementCreatedWorkers() {
        return (int) (controlState$FU.incrementAndGet(this) & 2097151);
    }

    private final long releaseCpuPermit() {
        return controlState$FU.addAndGet(this, 4398046511104L);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        shutdown(10000L);
    }

    public String toString() {
        int i;
        int i2;
        int i3;
        int i4;
        ArrayList arrayList = new ArrayList();
        int length = this.workers.length();
        int i5 = 0;
        if (1 < length) {
            i2 = 0;
            int i6 = 0;
            i3 = 0;
            i4 = 0;
            int i7 = 1;
            while (true) {
                int i8 = i7 + 1;
                C84622XJa c84622XJa = this.workers.get(i7);
                if (c84622XJa != null) {
                    int LIZJ = c84622XJa.LJLIL.LIZJ();
                    int i9 = C84625XJd.LIZ[c84622XJa.LJLILLLLZI.ordinal()];
                    if (i9 != 1) {
                        if (i9 != 2) {
                            if (i9 != 3) {
                                if (i9 != 4) {
                                    if (i9 == 5) {
                                        i4++;
                                    }
                                } else {
                                    i3++;
                                    if (LIZJ > 0) {
                                        StringBuilder LIZ = X1D.LIZ();
                                        LIZ.append(LIZJ);
                                        LIZ.append('d');
                                        arrayList.add(X1D.LIZIZ(LIZ));
                                    }
                                }
                            } else {
                                i6++;
                                StringBuilder LIZ2 = X1D.LIZ();
                                LIZ2.append(LIZJ);
                                LIZ2.append('c');
                                arrayList.add(X1D.LIZIZ(LIZ2));
                            }
                        } else {
                            i2++;
                            StringBuilder LIZ3 = X1D.LIZ();
                            LIZ3.append(LIZJ);
                            LIZ3.append('b');
                            arrayList.add(X1D.LIZIZ(LIZ3));
                        }
                    } else {
                        i5++;
                    }
                }
                if (i8 >= length) {
                    break;
                }
                i7 = i8;
            }
            i = i5;
            i5 = i6;
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
            i4 = 0;
        }
        long j = this.controlState;
        StringBuilder sb = new StringBuilder();
        sb.append(this.schedulerName);
        sb.append('@');
        sb.append(C65314PkE.LJI(this));
        sb.append("[Pool Size {core = ");
        sb.append(this.corePoolSize);
        sb.append(", max = ");
        C15890jp.LIZIZ(sb, this.maxPoolSize, "}, Worker States {CPU = ", i5, ", blocking = ");
        C15890jp.LIZIZ(sb, i2, ", parked = ", i, ", dormant = ");
        C15890jp.LIZIZ(sb, i3, ", terminated = ", i4, "}, running workers queues = ");
        sb.append(arrayList);
        sb.append(", global CPU queue size = ");
        sb.append(this.globalCpuQueue.LIZJ());
        sb.append(", global blocking queue size = ");
        sb.append(this.globalBlockingQueue.LIZJ());
        sb.append(", Control State {created workers= ");
        sb.append((int) (2097151 & j));
        sb.append(", blocking tasks = ");
        sb.append((int) ((4398044413952L & j) >> 21));
        sb.append(", CPUs acquired = ");
        sb.append(this.corePoolSize - ((int) ((9223367638808264704L & j) >> 42)));
        sb.append("}]");
        return sb.toString();
    }

    private final C84622XJa currentWorker() {
        C84622XJa c84622XJa;
        Thread LLLLIIIILLL = C16880lQ.LLLLIIIILLL();
        if (!(LLLLIIIILLL instanceof C84622XJa) || (c84622XJa = (C84622XJa) LLLLIIIILLL) == null || !o.LJ(c84622XJa.LJLJL, this)) {
            return null;
        }
        return c84622XJa;
    }

    private final boolean tryUnpark() {
        C84622XJa parkedWorkersStackPop;
        do {
            parkedWorkersStackPop = parkedWorkersStackPop();
            if (parkedWorkersStackPop == null) {
                return false;
            }
        } while (!C84622XJa.LJLJLJ.compareAndSet(parkedWorkersStackPop, -1, 0));
        LockSupport.unpark(parkedWorkersStackPop);
        return true;
    }

    public final void signalCpuWork() {
        if (tryUnpark() || tryCreateWorker$default(this, 0L, 1, null)) {
            return;
        }
        tryUnpark();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [int, boolean] */
    public final boolean isTerminated() {
        return this._isTerminated;
    }

    private final boolean addToGlobalQueue(X9P x9p) {
        if (x9p.LJLILLLLZI.LJJIJIIJIL() == 1) {
            return this.globalBlockingQueue.LIZ(x9p);
        }
        return this.globalCpuQueue.LIZ(x9p);
    }

    private final int parkedWorkersStackNextIndex(C84622XJa c84622XJa) {
        Object obj = c84622XJa.nextParkedWorker;
        while (obj != NOT_IN_STACK) {
            if (obj == null) {
                return 0;
            }
            C84622XJa c84622XJa2 = (C84622XJa) obj;
            int i = c84622XJa2.indexInArray;
            if (i != 0) {
                return i;
            }
            obj = c84622XJa2.nextParkedWorker;
        }
        return -1;
    }

    private final void signalBlockingWork(boolean z) {
        long addAndGet = controlState$FU.addAndGet(this, 2097152L);
        if (z || tryUnpark() || tryCreateWorker(addAndGet)) {
            return;
        }
        tryUnpark();
    }

    private final boolean tryCreateWorker(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        if (i < this.corePoolSize) {
            int createNewWorker = createNewWorker();
            if (createNewWorker == 1) {
                if (this.corePoolSize > 1) {
                    createNewWorker();
                }
            } else if (createNewWorker > 0) {
            }
            return true;
        }
        return false;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        dispatch$default(this, runnable, null, false, 6, null);
    }

    public final boolean parkedWorkersStackPush(C84622XJa c84622XJa) {
        long j;
        int i;
        if (c84622XJa.nextParkedWorker != NOT_IN_STACK) {
            return false;
        }
        do {
            j = this.parkedWorkersStack;
            i = c84622XJa.indexInArray;
            c84622XJa.nextParkedWorker = this.workers.get((int) (2097151 & j));
        } while (!parkedWorkersStack$FU.compareAndSet(this, j, ((2097152 + j) & (-2097152)) | i));
        return true;
    }

    public final void runSafely(X9P x9p) {
        try {
            x9p.run();
        } finally {
        }
    }

    public final void shutdown(long j) {
        int i;
        X9P LIZ;
        if (!_isTerminated$FU.compareAndSet(this, 0, 1)) {
            return;
        }
        C84622XJa currentWorker = currentWorker();
        synchronized (this.workers) {
            i = (int) (this.controlState & 2097151);
        }
        if (1 <= i) {
            int i2 = 1;
            while (true) {
                int i3 = i2 + 1;
                C84622XJa c84622XJa = this.workers.get(i2);
                o.LJI(c84622XJa);
                C84622XJa c84622XJa2 = c84622XJa;
                if (c84622XJa2 != currentWorker) {
                    while (c84622XJa2.isAlive()) {
                        LockSupport.unpark(c84622XJa2);
                        c84622XJa2.join(j);
                    }
                    C84623XJb c84623XJb = c84622XJa2.LJLIL;
                    C84626XJe c84626XJe = this.globalBlockingQueue;
                    c84623XJb.getClass();
                    Object andSet = C84623XJb.LIZIZ.getAndSet(c84623XJb, null);
                    if (andSet != null) {
                        c84626XJe.LIZ(andSet);
                    }
                    while (true) {
                        X9P LIZLLL = c84623XJb.LIZLLL();
                        if (LIZLLL == null) {
                            break;
                        } else {
                            c84626XJe.LIZ(LIZLLL);
                        }
                    }
                }
                if (i2 == i) {
                    break;
                } else {
                    i2 = i3;
                }
            }
        }
        this.globalBlockingQueue.LIZIZ();
        this.globalCpuQueue.LIZIZ();
        while (true) {
            if (currentWorker != null) {
                LIZ = currentWorker.LIZ(true);
                if (LIZ != null) {
                    continue;
                    runSafely(LIZ);
                }
            }
            LIZ = this.globalCpuQueue.LIZLLL();
            if (LIZ == null && (LIZ = this.globalBlockingQueue.LIZLLL()) == null) {
                break;
            }
            runSafely(LIZ);
        }
        if (currentWorker != null) {
            currentWorker.LJFF(EnumC84624XJc.TERMINATED);
        }
        this.parkedWorkersStack = 0L;
        this.controlState = 0L;
    }

    public final X9P createTask(Runnable runnable, X9R x9r) {
        V8B.LJ.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof X9P) {
            X9P x9p = (X9P) runnable;
            x9p.LJLIL = nanoTime;
            x9p.LJLILLLLZI = x9r;
            return x9p;
        }
        return new X9O(runnable, nanoTime, x9r);
    }

    private final X9P submitToLocalQueue(C84622XJa c84622XJa, X9P x9p, boolean z) {
        if (c84622XJa == null) {
            return x9p;
        }
        if (c84622XJa.LJLILLLLZI == EnumC84624XJc.TERMINATED) {
            return x9p;
        }
        if (x9p.LJLILLLLZI.LJJIJIIJIL() == 0 && c84622XJa.LJLILLLLZI == EnumC84624XJc.BLOCKING) {
            return x9p;
        }
        c84622XJa.LJLJJLL = true;
        return c84622XJa.LJLIL.LIZ(x9p, z);
    }

    public final void dispatch(Runnable runnable, X9R x9r, boolean z) {
        boolean z2;
        X9P createTask = createTask(runnable, x9r);
        C84622XJa currentWorker = currentWorker();
        X9P submitToLocalQueue = submitToLocalQueue(currentWorker, createTask, z);
        if (submitToLocalQueue == null || addToGlobalQueue(submitToLocalQueue)) {
            if (z && currentWorker != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (createTask.LJLILLLLZI.LJJIJIIJIL() == 0) {
                if (z2) {
                    return;
                }
                signalCpuWork();
                return;
            }
            signalBlockingWork(z2);
            return;
        }
        throw new RejectedExecutionException(o.LJIILLIIL(" was terminated", this.schedulerName));
    }

    public final void parkedWorkersStackTopUpdate(C84622XJa c84622XJa, int i, int i2) {
        while (true) {
            long j = this.parkedWorkersStack;
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & (-2097152);
            if (i3 == i) {
                if (i2 == 0) {
                    i3 = parkedWorkersStackNextIndex(c84622XJa);
                } else {
                    i3 = i2;
                }
            }
            if (i3 >= 0 && parkedWorkersStack$FU.compareAndSet(this, j, j2 | i3)) {
                return;
            }
        }
    }

    public CoroutineScheduler(int i, int i2, long j, String str) {
        boolean z;
        this.corePoolSize = i;
        this.maxPoolSize = i2;
        this.idleWorkerKeepAliveNs = j;
        this.schedulerName = str;
        if (i >= 1) {
            if (i2 >= i) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (i2 <= 2097150) {
                    if (j > 0) {
                        this.globalCpuQueue = new C84626XJe();
                        this.globalBlockingQueue = new C84626XJe();
                        this.parkedWorkersStack = 0L;
                        this.workers = new AtomicReferenceArray<>(i2 + 1);
                        this.controlState = i << 42;
                        this._isTerminated = 0;
                        return;
                    }
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("Idle worker keep alive time ");
                    LIZ.append(j);
                    LIZ.append(" must be positive");
                    String LIZIZ = X1D.LIZIZ(LIZ);
                    LIZIZ.toString();
                    throw new IllegalArgumentException(LIZIZ);
                }
                String LIZIZ2 = C0NY.LIZIZ("Max pool size ", i2, " should not exceed maximal supported number of threads 2097150");
                LIZIZ2.toString();
                throw new IllegalArgumentException(LIZIZ2);
            }
            String LIZLLL = C48263Iwt.LIZLLL("Max pool size ", i2, " should be greater than or equals to core pool size ", i);
            LIZLLL.toString();
            throw new IllegalArgumentException(LIZLLL);
        }
        String LIZIZ3 = C0NY.LIZIZ("Core pool size ", i, " should be at least 1");
        LIZIZ3.toString();
        throw new IllegalArgumentException(LIZIZ3);
    }

    public static /* synthetic */ boolean tryCreateWorker$default(CoroutineScheduler coroutineScheduler, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = coroutineScheduler.controlState;
        }
        return coroutineScheduler.tryCreateWorker(j);
    }

    public /* synthetic */ CoroutineScheduler(int i, int i2, long j, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, (i3 & 4) != 0 ? V8B.LIZLLL : j, (i3 & 8) != 0 ? "DefaultDispatcher" : str);
    }

    public static /* synthetic */ void dispatch$default(CoroutineScheduler coroutineScheduler, Runnable runnable, X9R x9r, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            x9r = X9Q.LJLIL;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        coroutineScheduler.dispatch(runnable, x9r, z);
    }
}
