package com.bytedance.sysoptimizer.suspension;

import X.C16880lQ;
import android.os.Handler;
import android.os.Message;

/* loaded from: classes12.dex */
public class ThreadSuspensionManager {
    public static ThreadSuspensionHandler mHanderThread;
    public static final Handler mMainHandler = new Handler(C16880lQ.LLJJJJ()) { // from class: com.bytedance.sysoptimizer.suspension.ThreadSuspensionManager.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 0) {
                ThreadSuspensionManager.stopTask();
            }
            super.handleMessage(message);
        }
    };

    public static void start(SuspensionParam suspensionParam, ThreadSuspendedCallback threadSuspendedCallback, Runnable runnable) {
    }

    public static void stop() {
        Handler handler = mMainHandler;
        handler.removeMessages(0);
        Message obtain = Message.obtain();
        obtain.what = 0;
        handler.sendMessage(obtain);
    }

    public static void stopTask() {
        ThreadSuspensionHandler threadSuspensionHandler = mHanderThread;
        if (threadSuspensionHandler != null) {
            threadSuspensionHandler.stopTask();
            mHanderThread = null;
        }
    }
}
