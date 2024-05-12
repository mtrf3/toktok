package com.ss.android.ugc.bytex.pthread.base.convergence.helper;

import X.C16880lQ;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import com.ss.android.ugc.bytex.pthread.base.convergence.SuperThreadPool;
import com.ss.android.ugc.bytex.pthread.base.convergence.external.ThreadLifecycleObserver;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class ThreadWorker implements Runnable {
    public final InterfaceC88472Yns<Thread, C76800UCe> callback;
    public final Thread delegate;
    public final boolean skipSetPriority;

    /* JADX WARN: Multi-variable type inference failed */
    public ThreadWorker(Thread delegate, boolean z, InterfaceC88472Yns<? super Thread, C76800UCe> callback) {
        o.LJIIJ(delegate, "delegate");
        o.LJIIJ(callback, "callback");
        this.delegate = delegate;
        this.skipSetPriority = z;
        this.callback = callback;
    }

    public /* synthetic */ ThreadWorker(Thread thread, boolean z, InterfaceC88472Yns interfaceC88472Yns, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(thread, (i & 2) != 0 ? false : z, interfaceC88472Yns);
    }

    public void com_ss_android_ugc_bytex_pthread_base_convergence_helper_ThreadWorker__run$___twin___() {
        SuperThreadPool superThreadPool = SuperThreadPool.INSTANCE;
        ThreadLifecycleObserver threadLifecycleObserver = superThreadPool.getThreadLifecycleObserver();
        Thread thread = C16880lQ.LLLLIIIILLL();
        int priority = this.delegate.getPriority();
        try {
            o.LJFF(thread, "thread");
            thread.setName(this.delegate.getName());
            if (!this.skipSetPriority && superThreadPool.getEnablePriority() && thread.getPriority() != priority) {
                thread.setPriority(priority);
            }
            if (threadLifecycleObserver != null) {
                threadLifecycleObserver.onAttach(thread, this.delegate);
            }
            this.callback.invoke(thread);
            LooperHelper.INSTANCE.clearLooper();
            if (threadLifecycleObserver != null) {
                threadLifecycleObserver.onDetach(thread, this.delegate);
            }
        } catch (Throwable th) {
            LooperHelper.INSTANCE.clearLooper();
            if (threadLifecycleObserver != null) {
                o.LJFF(thread, "thread");
                threadLifecycleObserver.onDetach(thread, this.delegate);
            }
            throw th;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        com_ss_android_ugc_bytex_pthread_base_convergence_helper_ThreadWorker_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
    }

    public static void com_ss_android_ugc_bytex_pthread_base_convergence_helper_ThreadWorker_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(ThreadWorker threadWorker) {
        boolean LIZ;
        try {
            threadWorker.com_ss_android_ugc_bytex_pthread_base_convergence_helper_ThreadWorker__run$___twin___();
        } finally {
            if (LIZ) {
            }
        }
    }
}
