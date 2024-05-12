package com.ss.android.ugc.bytex.pthread.base.proxy;

import X.C221108m2;
import X.C5H3;
import X.C65352Pkq;
import X.InterfaceC74236TBo;
import X.TBT;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Process;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.IThreadProxy;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.IThreadProxyProvider;
import kotlin.jvm.internal.AqS156S0100000_6;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public class PthreadHandlerThread extends HandlerThread implements IThreadProxyProvider {
    public static final /* synthetic */ InterfaceC74236TBo[] $$delegatedProperties;
    public final Object mLock;
    public Looper mLooper;
    public int mPriority;
    public final C5H3 mThreadProxy$delegate;
    public int mTid;

    static {
        TBT tbt = new TBT(C65352Pkq.LIZ(PthreadHandlerThread.class), "mThreadProxy", "getMThreadProxy()Ljava/lang/Thread;");
        C65352Pkq.LIZ.getClass();
        $$delegatedProperties = new InterfaceC74236TBo[]{tbt};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PthreadHandlerThread(String name) {
        super(name);
        o.LJIIJ(name, "name");
        this.mTid = -1;
        this.mLock = new Object();
        this.mThreadProxy$delegate = C221108m2.LIZIZ(new AqS156S0100000_6(this, 75));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PthreadHandlerThread(String name, int i) {
        super(name, i);
        o.LJIIJ(name, "name");
        this.mTid = -1;
        this.mLock = new Object();
        this.mThreadProxy$delegate = C221108m2.LIZIZ(new AqS156S0100000_6(this, 75));
    }

    private final Thread getMThreadProxy() {
        return (Thread) this.mThreadProxy$delegate.getValue();
    }

    public void com_ss_android_ugc_bytex_pthread_base_proxy_PthreadHandlerThread__run$___twin___() {
        this.mTid = Process.myTid();
        Looper.prepare();
        synchronized (this.mLock) {
            this.mLooper = Looper.myLooper();
            this.mLock.notifyAll();
        }
        Process.setThreadPriority(this.mPriority);
        onLooperPrepared();
        Looper.loop();
        this.mTid = -1;
    }

    @Override // android.os.HandlerThread
    public Looper getLooper() {
        Looper looper = this.mLooper;
        if (looper != null) {
            return looper;
        }
        synchronized (this.mLock) {
            if (this.mLooper == null) {
                this.mLock.wait();
            }
        }
        Looper looper2 = this.mLooper;
        if (looper2 != null) {
            return looper2;
        }
        o.LJIIZILJ();
        throw null;
    }

    public final Looper getMLooper() {
        return this.mLooper;
    }

    public final int getMTid() {
        return this.mTid;
    }

    @Override // com.ss.android.ugc.bytex.pthread.base.convergence.hook.IThreadProxyProvider
    public IThreadProxy getProxy() {
        Object mThreadProxy = getMThreadProxy();
        if (!(mThreadProxy instanceof IThreadProxy)) {
            mThreadProxy = null;
        }
        return (IThreadProxy) mThreadProxy;
    }

    @Override // android.os.HandlerThread
    public int getThreadId() {
        return this.mTid;
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

    @Override // android.os.HandlerThread, java.lang.Thread, java.lang.Runnable
    public void run() {
        com_ss_android_ugc_bytex_pthread_base_proxy_PthreadHandlerThread_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
    }

    public final void setMLooper(Looper looper) {
        this.mLooper = looper;
    }

    public final void setMTid(int i) {
        this.mTid = i;
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

    public static void com_ss_android_ugc_bytex_pthread_base_proxy_PthreadHandlerThread_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(PthreadHandlerThread pthreadHandlerThread) {
        boolean LIZ;
        try {
            pthreadHandlerThread.com_ss_android_ugc_bytex_pthread_base_proxy_PthreadHandlerThread__run$___twin___();
        } finally {
            if (LIZ) {
            }
        }
    }
}
