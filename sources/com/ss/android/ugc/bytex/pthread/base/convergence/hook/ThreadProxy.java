package com.ss.android.ugc.bytex.pthread.base.convergence.hook;

import com.ss.android.ugc.bytex.pthread.base.convergence.SuperThreadPool;
import com.ss.android.ugc.bytex.pthread.base.convergence.helper.ThreadWorker;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AqS172S0100000_6;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class ThreadProxy extends Thread implements IThreadProxy {
    public static final Companion Companion = new Companion();
    public volatile Thread mAttachThread;
    public final Thread mDelegate;
    public final AtomicInteger mRunState;
    public final boolean mSkipSetPriority;

    /* loaded from: classes7.dex */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ThreadProxy(Thread mDelegate, boolean z) {
        o.LJIIJ(mDelegate, "mDelegate");
        this.mDelegate = mDelegate;
        this.mSkipSetPriority = z;
        this.mRunState = new AtomicInteger(0);
    }

    public /* synthetic */ ThreadProxy(Thread thread, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(thread, (i & 2) != 0 ? false : z);
    }

    @Override // com.ss.android.ugc.bytex.pthread.base.convergence.hook.IThreadProxy
    public Thread getAttachThread() {
        return this.mAttachThread;
    }

    @Override // java.lang.Thread
    public void interrupt() {
        Thread thread = this.mAttachThread;
        if (thread != null) {
            thread.interrupt();
        }
    }

    @Override // java.lang.Thread
    public boolean isInterrupted() {
        Thread thread = this.mAttachThread;
        if (thread != null) {
            return thread.isInterrupted();
        }
        return false;
    }

    @Override // com.ss.android.ugc.bytex.pthread.base.convergence.hook.IThreadProxy
    public boolean isRealAlive() {
        return this.mRunState.get() > 0;
    }

    @Override // java.lang.Thread
    public synchronized void start() {
        if (this.mRunState.compareAndSet(0, 1)) {
            SuperThreadPool.INSTANCE.execute(new ThreadWorker(this.mDelegate, this.mSkipSetPriority, new AqS172S0100000_6(this, 48)));
        }
    }
}
