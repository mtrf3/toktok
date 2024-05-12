package com.ss.android.ugc.bytex.pthread.base.convergence.dredge;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DredgeHandler {
    public static final Companion Companion = new Companion();
    public Handler defaultHandler;
    public HandlerThread defaultHandlerThread;
    public volatile boolean enable;
    public IDredgeAbility mDredgeAbility;
    public volatile Handler mHandler;
    public long interval = 100;
    public final DredgeWorker mDredgeWorker = new DredgeWorker();
    public final AtomicInteger mDredgeState = new AtomicInteger();

    /* loaded from: classes7.dex */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final /* synthetic */ IDredgeAbility access$getMDredgeAbility$p(DredgeHandler dredgeHandler) {
        IDredgeAbility iDredgeAbility = dredgeHandler.mDredgeAbility;
        if (iDredgeAbility != null) {
            return iDredgeAbility;
        }
        o.LJIJI("mDredgeAbility");
        throw null;
    }

    private final synchronized Handler getDefaultHandler() {
        Handler handler = this.defaultHandler;
        if (handler != null) {
            return handler;
        }
        HandlerThread handlerThread = new HandlerThread("DredgeHandler");
        this.defaultHandlerThread = handlerThread;
        handlerThread.start();
        HandlerThread handlerThread2 = this.defaultHandlerThread;
        if (handlerThread2 == null) {
            o.LJIIZILJ();
            throw null;
        }
        Handler handler2 = new Handler(handlerThread2.getLooper());
        this.defaultHandler = handler2;
        return handler2;
    }

    private final void postDredgeWork(boolean z) {
        Handler handler = this.mHandler;
        if (handler == null) {
            handler = getDefaultHandler();
        }
        handler.postDelayed(this.mDredgeWorker, z ? 5 * this.interval : this.interval);
    }

    public static /* synthetic */ void postDredgeWork$default(DredgeHandler dredgeHandler, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        dredgeHandler.postDredgeWork(z);
    }

    private final synchronized void releaseDefaultHandler() {
        HandlerThread handlerThread = this.defaultHandlerThread;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
        this.defaultHandlerThread = null;
        this.defaultHandler = null;
    }

    public final void bindDredgeAbility(IDredgeAbility dredgeAbility) {
        o.LJIIJ(dredgeAbility, "dredgeAbility");
        this.mDredgeAbility = dredgeAbility;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final long getInterval() {
        return this.interval;
    }

    public final void requestDredgePrepare() {
        if (this.enable && this.mDredgeState.compareAndSet(0, 2)) {
            postDredgeWork(true);
        }
    }

    public final void setEnable(boolean z) {
        this.enable = z;
        if (z) {
            return;
        }
        releaseDefaultHandler();
    }

    public final void setHandler(Handler handler) {
        o.LJIIJ(handler, "handler");
        this.mHandler = handler;
        if (!o.LJ(this.mHandler, this.defaultHandler)) {
            releaseDefaultHandler();
        }
    }

    public final void setInterval(long j) {
        this.interval = j;
    }

    /* loaded from: classes7.dex */
    public final class DredgeWorker implements Runnable {
        public DredgeWorker() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
        
            if (com.ss.android.ugc.bytex.pthread.base.convergence.dredge.DredgeHandler.access$getMDredgeAbility$p(r4.this$0).dredge() != false) goto L6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:4:0x0018, code lost:
        
            if (com.ss.android.ugc.bytex.pthread.base.convergence.dredge.DredgeHandler.access$getMDredgeAbility$p(r4.this$0).prepare() != false) goto L6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
        
            com.ss.android.ugc.bytex.pthread.base.convergence.dredge.DredgeHandler.postDredgeWork$default(r4.this$0, false, 1, null);
         */
        /* JADX WARN: Code restructure failed: missing block: B:6:0x001f, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0037, code lost:
        
            r4.this$0.mDredgeState.set(0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:?, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void com_ss_android_ugc_bytex_pthread_base_convergence_dredge_DredgeHandler$DredgeWorker__run$___twin___() {
            /*
                r4 = this;
                com.ss.android.ugc.bytex.pthread.base.convergence.dredge.DredgeHandler r0 = com.ss.android.ugc.bytex.pthread.base.convergence.dredge.DredgeHandler.this
                java.util.concurrent.atomic.AtomicInteger r1 = r0.mDredgeState
                r0 = 2
                r3 = 1
                boolean r0 = r1.compareAndSet(r0, r3)
                r2 = 0
                r1 = 0
                if (r0 == 0) goto L20
                com.ss.android.ugc.bytex.pthread.base.convergence.dredge.DredgeHandler r0 = com.ss.android.ugc.bytex.pthread.base.convergence.dredge.DredgeHandler.this
                com.ss.android.ugc.bytex.pthread.base.convergence.dredge.IDredgeAbility r0 = com.ss.android.ugc.bytex.pthread.base.convergence.dredge.DredgeHandler.access$getMDredgeAbility$p(r0)
                boolean r0 = r0.prepare()
                if (r0 == 0) goto L37
            L1a:
                com.ss.android.ugc.bytex.pthread.base.convergence.dredge.DredgeHandler r0 = com.ss.android.ugc.bytex.pthread.base.convergence.dredge.DredgeHandler.this
                com.ss.android.ugc.bytex.pthread.base.convergence.dredge.DredgeHandler.postDredgeWork$default(r0, r1, r3, r2)
            L1f:
                return
            L20:
                com.ss.android.ugc.bytex.pthread.base.convergence.dredge.DredgeHandler r0 = com.ss.android.ugc.bytex.pthread.base.convergence.dredge.DredgeHandler.this
                java.util.concurrent.atomic.AtomicInteger r0 = r0.mDredgeState
                int r0 = r0.get()
                if (r0 != r3) goto L3f
                com.ss.android.ugc.bytex.pthread.base.convergence.dredge.DredgeHandler r0 = com.ss.android.ugc.bytex.pthread.base.convergence.dredge.DredgeHandler.this
                com.ss.android.ugc.bytex.pthread.base.convergence.dredge.IDredgeAbility r0 = com.ss.android.ugc.bytex.pthread.base.convergence.dredge.DredgeHandler.access$getMDredgeAbility$p(r0)
                boolean r0 = r0.dredge()
                if (r0 == 0) goto L37
                goto L1a
            L37:
                com.ss.android.ugc.bytex.pthread.base.convergence.dredge.DredgeHandler r0 = com.ss.android.ugc.bytex.pthread.base.convergence.dredge.DredgeHandler.this
                java.util.concurrent.atomic.AtomicInteger r0 = r0.mDredgeState
                r0.set(r1)
                goto L1f
            L3f:
                java.lang.RuntimeException r2 = new java.lang.RuntimeException
                java.lang.StringBuilder r1 = X.X1D.LIZ()
                java.lang.String r0 = "undesired state: "
                r1.append(r0)
                com.ss.android.ugc.bytex.pthread.base.convergence.dredge.DredgeHandler r0 = com.ss.android.ugc.bytex.pthread.base.convergence.dredge.DredgeHandler.this
                java.util.concurrent.atomic.AtomicInteger r0 = r0.mDredgeState
                r1.append(r0)
                java.lang.String r0 = X.X1D.LIZIZ(r1)
                r2.<init>(r0)
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.bytex.pthread.base.convergence.dredge.DredgeHandler.DredgeWorker.com_ss_android_ugc_bytex_pthread_base_convergence_dredge_DredgeHandler$DredgeWorker__run$___twin___():void");
        }

        @Override // java.lang.Runnable
        public void run() {
            com_ss_android_ugc_bytex_pthread_base_convergence_dredge_DredgeHandler$DredgeWorker_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public static void com_ss_android_ugc_bytex_pthread_base_convergence_dredge_DredgeHandler$DredgeWorker_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(DredgeWorker dredgeWorker) {
            boolean LIZ;
            try {
                dredgeWorker.com_ss_android_ugc_bytex_pthread_base_convergence_dredge_DredgeHandler$DredgeWorker__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }
    }
}
