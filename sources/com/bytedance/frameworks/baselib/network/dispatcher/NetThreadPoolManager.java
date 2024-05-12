package com.bytedance.frameworks.baselib.network.dispatcher;

import X.AbstractRunnableC64836PcW;
import X.AbstractRunnableC64837PcX;
import X.C16880lQ;
import X.C47135Ieh;
import X.C64831PcR;
import X.C64833PcT;
import X.C64834PcU;
import X.C64835PcV;
import X.EnumC64807Pc3;
import X.J2F;
import X.X1D;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes12.dex */
public class NetThreadPoolManager implements WeakHandler.IHandler {
    public ThreadPoolExecutor mExecutorDownload;
    public ThreadPoolExecutor mExecutorImmediate;
    public ThreadPoolExecutor mExecutorLocal;
    public ThreadPoolExecutor mExecutorNormal;
    public WeakHandler mHandler = new WeakHandler(C16880lQ.LLJJJJ(), this);
    public static AtomicInteger mSequenceGenerator = new AtomicInteger();
    public static NetThreadPoolManager INSTANCE = new NetThreadPoolManager();

    private synchronized ExecutorService executorDownloadService() {
        if (this.mExecutorDownload == null) {
            C64831PcR.LIZJ().getClass();
            this.mExecutorDownload = null;
            PThreadPoolExecutor pThreadPoolExecutor = new PThreadPoolExecutor(C64831PcR.LIZJ().LIZLLL, C64831PcR.LIZJ().LIZIZ, C64831PcR.LIZJ().LJFF, TimeUnit.SECONDS, new PriorityBlockingQueue(), new ApiThreadFactory("NetDownload"));
            this.mExecutorDownload = pThreadPoolExecutor;
            pThreadPoolExecutor.allowCoreThreadTimeOut(C64831PcR.LIZJ().LJII);
        }
        return this.mExecutorDownload;
    }

    private synchronized ExecutorService executorLocalService() {
        if (this.mExecutorLocal == null) {
            C64831PcR.LIZJ().getClass();
            this.mExecutorLocal = null;
            this.mExecutorLocal = new PThreadPoolExecutor(1, 1, C64831PcR.LIZJ().LJI, TimeUnit.SECONDS, new PriorityBlockingQueue(), new ApiThreadFactory("NetLocal"));
        }
        return this.mExecutorLocal;
    }

    public synchronized ExecutorService executorApiService() {
        if (this.mExecutorNormal == null) {
            C64831PcR.LIZJ().getClass();
            this.mExecutorNormal = null;
            PThreadPoolExecutor pThreadPoolExecutor = new PThreadPoolExecutor(C64831PcR.LIZJ().LIZJ, C64831PcR.LIZJ().LIZ, C64831PcR.LIZJ().LJ, TimeUnit.SECONDS, new PriorityBlockingQueue(), new ApiThreadFactory("NetNormal"));
            this.mExecutorNormal = pThreadPoolExecutor;
            pThreadPoolExecutor.allowCoreThreadTimeOut(C64831PcR.LIZJ().LJII);
        }
        return this.mExecutorNormal;
    }

    public synchronized ExecutorService executorImmediateService() {
        if (this.mExecutorImmediate == null) {
            C64831PcR.LIZJ().getClass();
            this.mExecutorImmediate = null;
            this.mExecutorImmediate = new PThreadPoolExecutor(0, Integer.MAX_VALUE, C64831PcR.LIZJ().LJI, TimeUnit.SECONDS, new SynchronousQueue(), new ApiThreadFactory("NetImmediate"));
        }
        return this.mExecutorImmediate;
    }

    public static int getSequenceNumber() {
        return mSequenceGenerator.incrementAndGet();
    }

    private C64833PcT getThreadPoolConfig() {
        return C64831PcR.LIZJ();
    }

    /* loaded from: classes9.dex */
    public static class ApiThreadFactory implements ThreadFactory {
        public final AtomicInteger mCount = new AtomicInteger(1);
        public String mThreadName;

        public ApiThreadFactory(String str) {
            this.mThreadName = "ApiExecutor";
            if (!TextUtils.isEmpty(str)) {
                this.mThreadName = str;
            }
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(this.mThreadName);
            LIZ.append("#");
            J2F j2f = new J2F(runnable, C47135Ieh.LIZJ(this.mCount, LIZ, LIZ));
            j2f.setDaemon(false);
            return j2f;
        }
    }

    private AbstractRunnableC64837PcX getLocalRunnable(AbstractRunnableC64836PcW abstractRunnableC64836PcW) {
        return new C64835PcV(this, abstractRunnableC64836PcW, abstractRunnableC64836PcW);
    }

    public void executeApi(AbstractRunnableC64836PcW abstractRunnableC64836PcW) {
        if (abstractRunnableC64836PcW == null || abstractRunnableC64836PcW.LJLIL.get()) {
            return;
        }
        C64834PcU c64834PcU = (C64834PcU) abstractRunnableC64836PcW;
        c64834PcU.LJLJI = getSequenceNumber();
        if (c64834PcU.LJLJJL == EnumC64807Pc3.IMMEDIATE) {
            executorImmediateService().execute(abstractRunnableC64836PcW);
            return;
        }
        long j = abstractRunnableC64836PcW.LJLILLLLZI;
        if (j > 0) {
            Message obtain = Message.obtain();
            obtain.what = 0;
            obtain.obj = abstractRunnableC64836PcW;
            this.mHandler.sendMessageDelayed(obtain, j);
            return;
        }
        executorApiService().execute(abstractRunnableC64836PcW);
    }

    public void executeDownload(AbstractRunnableC64836PcW abstractRunnableC64836PcW) {
        if (abstractRunnableC64836PcW == null || abstractRunnableC64836PcW.LJLIL.get()) {
            return;
        }
        C64834PcU c64834PcU = (C64834PcU) abstractRunnableC64836PcW;
        c64834PcU.LJLJI = getSequenceNumber();
        if (c64834PcU.LJLJJL == EnumC64807Pc3.IMMEDIATE) {
            executorImmediateService().execute(abstractRunnableC64836PcW);
            return;
        }
        long j = abstractRunnableC64836PcW.LJLILLLLZI;
        if (j > 0) {
            Message obtain = Message.obtain();
            obtain.what = 1;
            obtain.obj = abstractRunnableC64836PcW;
            this.mHandler.sendMessageDelayed(obtain, j);
            return;
        }
        executorDownloadService().execute(abstractRunnableC64836PcW);
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        if (message == null || !(message.obj instanceof Runnable)) {
            return;
        }
        try {
            int i = message.what;
            if (i != 0) {
                if (i == 1) {
                    executorImmediateService().execute((Runnable) message.obj);
                }
            } else {
                executorApiService().execute((Runnable) message.obj);
            }
        } catch (Throwable unused) {
        }
    }
}
