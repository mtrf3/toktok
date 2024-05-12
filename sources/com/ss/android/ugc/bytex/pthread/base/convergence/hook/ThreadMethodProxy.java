package com.ss.android.ugc.bytex.pthread.base.convergence.hook;

import java.lang.Thread;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class ThreadMethodProxy {
    public static final ThreadMethodProxy INSTANCE = new ThreadMethodProxy();

    public static final int countStackFrames(Thread thread) {
        Thread attachThread;
        o.LJIIJ(thread, "thread");
        IThreadProxy proxy = INSTANCE.getProxy(thread);
        if (proxy != null && (attachThread = proxy.getAttachThread()) != null) {
            thread = attachThread;
        }
        return thread.countStackFrames();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final IThreadProxy getProxy(Thread thread) {
        if (thread instanceof IThreadProxyProvider) {
            return ((IThreadProxyProvider) thread).getProxy();
        }
        if (thread instanceof IThreadProxy) {
            return (IThreadProxy) thread;
        }
        return null;
    }

    public static final StackTraceElement[] getStackTrace(Thread thread) {
        Thread attachThread;
        o.LJIIJ(thread, "thread");
        IThreadProxy proxy = INSTANCE.getProxy(thread);
        if (proxy != null && (attachThread = proxy.getAttachThread()) != null) {
            thread = attachThread;
        }
        StackTraceElement[] stackTrace = thread.getStackTrace();
        o.LJFF(stackTrace, "(thread.getProxy()?.getA…d() ?: thread).stackTrace");
        return stackTrace;
    }

    public static final Thread.State getState(Thread thread) {
        Thread attachThread;
        o.LJIIJ(thread, "thread");
        IThreadProxy proxy = INSTANCE.getProxy(thread);
        if (proxy != null && (attachThread = proxy.getAttachThread()) != null) {
            thread = attachThread;
        }
        Thread.State state = thread.getState();
        o.LJFF(state, "(thread.getProxy()?.getA…Thread() ?: thread).state");
        return state;
    }

    public static final boolean isAlive(Thread thread) {
        o.LJIIJ(thread, "thread");
        IThreadProxy proxy = INSTANCE.getProxy(thread);
        return proxy != null ? proxy.isRealAlive() : thread.isAlive();
    }

    public static final void join(Thread thread) {
        Thread attachThread;
        o.LJIIJ(thread, "thread");
        IThreadProxy proxy = INSTANCE.getProxy(thread);
        if (proxy != null && (attachThread = proxy.getAttachThread()) != null) {
            thread = attachThread;
        }
        thread.join();
    }

    public static final void join(Thread thread, long j) {
        Thread attachThread;
        o.LJIIJ(thread, "thread");
        IThreadProxy proxy = INSTANCE.getProxy(thread);
        if (proxy != null && (attachThread = proxy.getAttachThread()) != null) {
            thread = attachThread;
        }
        thread.join(j);
    }

    public static final void join(Thread thread, long j, int i) {
        Thread attachThread;
        o.LJIIJ(thread, "thread");
        IThreadProxy proxy = INSTANCE.getProxy(thread);
        if (proxy != null && (attachThread = proxy.getAttachThread()) != null) {
            thread = attachThread;
        }
        thread.join(j, i);
    }

    public static final void setName(Thread thread, String name) {
        Thread attachThread;
        o.LJIIJ(thread, "thread");
        o.LJIIJ(name, "name");
        IThreadProxy proxy = INSTANCE.getProxy(thread);
        if (proxy != null && (attachThread = proxy.getAttachThread()) != null) {
            attachThread.setName(name);
        }
        thread.setName(name);
    }

    public static final void setPriority(Thread thread, int i) {
        Thread attachThread;
        o.LJIIJ(thread, "thread");
        IThreadProxy proxy = INSTANCE.getProxy(thread);
        if (proxy != null && (attachThread = proxy.getAttachThread()) != null) {
            attachThread.setPriority(i);
        }
        thread.setPriority(i);
    }
}
