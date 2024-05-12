package X;

import Y.IDRunnableS85S0100000;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* renamed from: X.2CX, reason: invalid class name */
/* loaded from: classes.dex */
public final /* synthetic */ class C2CX extends C74232TBk implements InterfaceC65784Pro<C0T7> {
    public static final C2CX LJLIL = new C2CX();

    public C2CX() {
        super(0);
    }

    @Override // X.AbstractC74233TBl, X.InterfaceC74234TBm
    public final String getName() {
        return "createIoScheduler";
    }

    @Override // X.AbstractC74233TBl
    public final InterfaceC36731EbH getOwner() {
        return C65352Pkq.LIZIZ(C1M9.class, "kn_common_release");
    }

    @Override // X.AbstractC74233TBl
    public final String getSignature() {
        return "createIoScheduler()Lbytekn/foundation/concurrent/scheduler/Scheduler;";
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0TA] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.1M8] */
    @Override // X.InterfaceC65784Pro
    public final C0T7 invoke() {
        TimeUnit.MINUTES.toMillis(1L);
        final ?? r0 = new ThreadFactory() { // from class: X.0TA
            public static final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(C49451wr.LJLIL);
            public final String LJLIL = "IO";

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                o.LJIIJ(runnable, "runnable");
                Thread newThread = ((ThreadFactory) LJLILLLLZI.getValue()).newThread(runnable);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(this.LJLIL);
                LIZ.append(", ");
                LIZ.append(newThread.getName());
                newThread.setName(X1D.LIZIZ(LIZ));
                newThread.setDaemon(true);
                return newThread;
            }
        };
        final ?? r3 = new C0T5(r0) { // from class: X.1M8
            public final ThreadFactory LIZ;

            @Override // X.C0T5
            public final ScheduledExecutorService get() {
                return C16880lQ.LLLLZLL(5, this.LIZ);
            }

            {
                this.LIZ = r0;
            }
        };
        return new C0T7(r3) { // from class: X.1MC
            public final C0T5 LIZ;

            @Override // X.C0T7
            public final C0T6 LIZ() {
                return new C0T6(this.LIZ) { // from class: X.1MB
                    public volatile ScheduledExecutorService LIZ;
                    public final Object LIZIZ;

                    {
                        o.LJIIJ(executorServiceStrategy, "executorServiceStrategy");
                        this.LIZ = executorServiceStrategy.get();
                        this.LIZIZ = new Object();
                    }

                    @Override // X.C0T6
                    public final void LIZ(InterfaceC65784Pro interfaceC65784Pro, long j) {
                        if (this.LIZ != null) {
                            synchronized (this.LIZIZ) {
                                ScheduledExecutorService scheduledExecutorService = this.LIZ;
                                if (scheduledExecutorService != null) {
                                    scheduledExecutorService.schedule(new IDRunnableS85S0100000(interfaceC65784Pro, 78), j, TimeUnit.MILLISECONDS);
                                }
                            }
                        }
                    }
                };
            }

            {
                this.LIZ = r3;
            }
        };
    }
}
