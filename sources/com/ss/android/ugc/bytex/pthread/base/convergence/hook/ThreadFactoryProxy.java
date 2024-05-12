package com.ss.android.ugc.bytex.pthread.base.convergence.hook;

import com.ss.android.ugc.bytex.pthread.base.convergence.SuperThreadPool;
import java.util.concurrent.ThreadFactory;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class ThreadFactoryProxy implements ThreadFactory {
    public static final Companion Companion = new Companion();
    public final ThreadFactory mDelegate;
    public final int mEnableType;

    /* loaded from: classes7.dex */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ThreadFactory proxy(ThreadFactory threadFactory, int i) {
            return (threadFactory == null || (threadFactory instanceof ThreadFactoryProxy)) ? threadFactory : new ThreadFactoryProxy(threadFactory, i);
        }
    }

    public ThreadFactoryProxy(ThreadFactory mDelegate, int i) {
        o.LJIIJ(mDelegate, "mDelegate");
        this.mDelegate = mDelegate;
        this.mEnableType = i;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread thread = this.mDelegate.newThread(runnable);
        if (!SuperThreadPool.INSTANCE.isEnable(this.mEnableType)) {
            o.LJFF(thread, "thread");
            return thread;
        }
        o.LJFF(thread, "thread");
        return new ThreadProxy(thread, false, 2, null);
    }
}
