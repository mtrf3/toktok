package com.byted.cast.mediacommon.utils;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes29.dex */
public class HandlerWrapper {
    public final Handler mHandler;

    public Looper getLooper() {
        return this.mHandler.getLooper();
    }

    public Handler getHandler() {
        return this.mHandler;
    }

    public HandlerWrapper(Handler handler) {
        this.mHandler = handler;
    }

    public boolean post(Runnable runnable) {
        return this.mHandler.post(runnable);
    }

    public void removeCallbacks(Runnable runnable) {
        this.mHandler.removeCallbacks(runnable);
    }

    public void removeMessages(int i) {
        this.mHandler.removeMessages(i);
    }

    public boolean postDelayed(Runnable runnable, long j) {
        return this.mHandler.postDelayed(runnable, j);
    }

    public void sendMessageDelayed(Message message, long j) {
        this.mHandler.sendMessageDelayed(message, j);
    }
}
