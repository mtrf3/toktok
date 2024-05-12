package com.ss.android.ugc.bytex.pthread.base.proxy;

import X.C221108m2;
import X.C5H3;
import X.C65352Pkq;
import X.InterfaceC74236TBo;
import X.TBT;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.IThreadProxy;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.IThreadProxyProvider;
import kotlin.jvm.internal.AqS156S0100000_6;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public class PthreadThread extends Thread implements IThreadProxyProvider {
    public static final /* synthetic */ InterfaceC74236TBo[] $$delegatedProperties;
    public final C5H3 mThreadProxy$delegate;

    static {
        TBT tbt = new TBT(C65352Pkq.LIZ(PthreadThread.class), "mThreadProxy", "getMThreadProxy()Ljava/lang/Thread;");
        C65352Pkq.LIZ.getClass();
        $$delegatedProperties = new InterfaceC74236TBo[]{tbt};
    }

    public PthreadThread() {
        this.mThreadProxy$delegate = C221108m2.LIZIZ(new AqS156S0100000_6(this, 76));
    }

    public PthreadThread(Runnable runnable) {
        super(runnable);
        this.mThreadProxy$delegate = C221108m2.LIZIZ(new AqS156S0100000_6(this, 76));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PthreadThread(Runnable runnable, String name) {
        super(runnable, name);
        o.LJIIJ(name, "name");
        this.mThreadProxy$delegate = C221108m2.LIZIZ(new AqS156S0100000_6(this, 76));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PthreadThread(String name) {
        super(name);
        o.LJIIJ(name, "name");
        this.mThreadProxy$delegate = C221108m2.LIZIZ(new AqS156S0100000_6(this, 76));
    }

    public PthreadThread(ThreadGroup threadGroup, Runnable runnable) {
        super(threadGroup, runnable);
        this.mThreadProxy$delegate = C221108m2.LIZIZ(new AqS156S0100000_6(this, 76));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PthreadThread(ThreadGroup threadGroup, Runnable runnable, String name) {
        super(threadGroup, runnable, name);
        o.LJIIJ(name, "name");
        this.mThreadProxy$delegate = C221108m2.LIZIZ(new AqS156S0100000_6(this, 76));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PthreadThread(ThreadGroup threadGroup, Runnable runnable, String name, long j) {
        super(threadGroup, runnable, name, j);
        o.LJIIJ(name, "name");
        this.mThreadProxy$delegate = C221108m2.LIZIZ(new AqS156S0100000_6(this, 76));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PthreadThread(ThreadGroup threadGroup, String name) {
        super(threadGroup, name);
        o.LJIIJ(name, "name");
        this.mThreadProxy$delegate = C221108m2.LIZIZ(new AqS156S0100000_6(this, 76));
    }

    private final Thread getMThreadProxy() {
        return (Thread) this.mThreadProxy$delegate.getValue();
    }

    @Override // com.ss.android.ugc.bytex.pthread.base.convergence.hook.IThreadProxyProvider
    public IThreadProxy getProxy() {
        Object mThreadProxy = getMThreadProxy();
        if (!(mThreadProxy instanceof IThreadProxy)) {
            mThreadProxy = null;
        }
        return (IThreadProxy) mThreadProxy;
    }

    @Override // java.lang.Thread
    public void interrupt() {
        Thread mThreadProxy = getMThreadProxy();
        if (mThreadProxy != null) {
            mThreadProxy.interrupt();
        } else {
            super.interrupt();
        }
    }

    @Override // java.lang.Thread
    public boolean isInterrupted() {
        Thread mThreadProxy = getMThreadProxy();
        return mThreadProxy != null ? mThreadProxy.isInterrupted() : super.isInterrupted();
    }

    @Override // java.lang.Thread
    public synchronized void start() {
        Thread mThreadProxy = getMThreadProxy();
        if (mThreadProxy != null) {
            mThreadProxy.start();
        } else {
            super.start();
        }
    }
}
