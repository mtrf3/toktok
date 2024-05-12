package com.bytedance.vmsdk.jsbridge.utils;

import X.C16880lQ;
import Y.ARunnableS10S0000100_11;
import Y.ARunnableS47S0100000_11;
import android.os.Handler;
import android.os.Looper;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;

/* loaded from: classes12.dex */
public class SystemThread {
    public Thread mAndroidThread;
    public long mNativeThread;

    public static native void nativeRun(long j);

    public void join() {
        try {
            this.mAndroidThread.join();
        } catch (InterruptedException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public void stop() {
        Looper myLooper = Looper.myLooper();
        if (C16880lQ.LLLLIIIILLL() == this.mAndroidThread && myLooper != null) {
            myLooper.quit();
        }
    }

    public static void attachMainThread(long j) {
        if (C16880lQ.LLJJJJ() == Looper.myLooper()) {
            nativeRun(j);
        } else {
            new Handler(C16880lQ.LLJJJJ()).post(new ARunnableS10S0000100_11(j, 0));
        }
    }

    private void createAndroidThread(String str, int i) {
        PthreadThread pthreadThread = new PthreadThread(new ARunnableS47S0100000_11(this, 33), str);
        this.mAndroidThread = pthreadThread;
        pthreadThread.setPriority(i);
        this.mAndroidThread.start();
    }

    public SystemThread(long j, String str, int i) {
        this.mNativeThread = j;
        createAndroidThread(str, i);
    }

    public static SystemThread create(long j, String str, int i) {
        return new SystemThread(j, str, i);
    }
}
