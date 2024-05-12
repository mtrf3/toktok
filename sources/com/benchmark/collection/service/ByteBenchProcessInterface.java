package com.benchmark.collection.service;

import X.C269013u;
import X.C47261Igj;
import X.ZU3;
import X.ZUE;
import android.content.Context;
import android.content.res.AssetManager;
import android.os.RemoteException;
import com.benchmark.bytemonitor.BatteryMonitor;
import com.benchmark.bytemonitor.nativePort.ByteMonitorPort;

/* loaded from: classes19.dex */
public class ByteBenchProcessInterface {
    public ZU3 mCallback;
    public long mHandler;

    private native long nativeInit(String str, String str2, String str3, String str4, AssetManager assetManager);

    private native void native_destory(long j);

    private native String[] native_getResult(long j);

    private native int native_loadByteBench(long j, String str);

    private native void native_release(long j);

    private native int native_startTest(long j, int i, String str);

    private native int native_stopByteBench(long j);

    public void destroy() {
        long j = this.mHandler;
        if (j == 0) {
            return;
        }
        native_destory(j);
        this.mHandler = 0L;
    }

    public String[] getResult() {
        long j = this.mHandler;
        if (j == 0) {
            return null;
        }
        return native_getResult(j);
    }

    public void release() {
        long j = this.mHandler;
        if (j == 0) {
            return;
        }
        native_release(j);
    }

    public int stopByteBench() {
        long j = this.mHandler;
        if (j == 0) {
            return -108;
        }
        return native_stopByteBench(j);
    }

    static {
        ZUE.LIZ();
        if (!ZUE.LIZIZ) {
            ZUE.LIZ();
        }
    }

    private void initByteMonitor(Context context) {
        if (C269013u.LIZ == null) {
            synchronized (C269013u.class) {
                if (C269013u.LIZ == null) {
                    C269013u.LIZ = new BatteryMonitor(context);
                }
            }
        }
        BatteryMonitor batteryMonitor = C269013u.LIZ;
        if (batteryMonitor == null) {
            return;
        }
        ByteMonitorPort.nativeInit(batteryMonitor);
    }

    public int loadByteBench(String str) {
        long j = this.mHandler;
        if (j == 0) {
            return -108;
        }
        return native_loadByteBench(j, str);
    }

    public void reportAndQuit(boolean z) {
        ZU3 zu3 = this.mCallback;
        if (zu3 == null) {
            return;
        }
        try {
            zu3.LLZLLLL(105, "report result");
            if (z) {
                this.mCallback.LLZLLLL(104, "quit service");
            }
        } catch (RemoteException e) {
            e.getMessage();
            C47261Igj.LJIILL("ByteBenchProcessInterface");
        }
    }

    public void setByteBenchCallback(ZU3 zu3) {
        this.mCallback = zu3;
    }

    public int startTest(int i, String str) {
        long j = this.mHandler;
        if (j == 0) {
            return -108;
        }
        return native_startTest(j, i, str);
    }

    public int init(String str, String str2, String str3, String str4, Context context) {
        if (!ZUE.LIZIZ) {
            return -3;
        }
        if (ZUE.LIZIZ) {
            this.mHandler = nativeInit(str, str2, str3, str4, context.getAssets());
        }
        if (this.mHandler == 0) {
            return -1;
        }
        initByteMonitor(context);
        return 0;
    }
}
