package com.ss.android.ugc.aweme.account.login.ui;

import X.InterfaceC85737Xkr;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import com.bytedance.common.utility.collection.WeakHandler;

/* loaded from: classes16.dex */
public class CountDownTimer implements WeakHandler.IHandler {
    public boolean mCancelled;
    public InterfaceC85737Xkr mCountDownTimerListener;
    public final long mCountdownInterval;
    public boolean mFinished;
    public Handler mHandler = new WeakHandler(this);
    public final long mMillisInFuture;
    public long mRemainingMillis;
    public boolean mRunning;
    public long mStopTimeInFuture;

    private synchronized void pause() {
    }

    private synchronized void resume() {
    }

    public final synchronized void cancel() {
        this.mCancelled = true;
        this.mRunning = false;
        this.mHandler.removeMessages(1);
    }

    public final synchronized long getRemainingMillis() {
        return this.mRemainingMillis;
    }

    public synchronized boolean isCancelled() {
        return this.mCancelled;
    }

    public synchronized boolean isFinished() {
        return this.mFinished;
    }

    public synchronized boolean isRunning() {
        return this.mRunning;
    }

    public final synchronized CountDownTimer start() {
        this.mCancelled = false;
        this.mFinished = false;
        this.mRunning = true;
        if (this.mMillisInFuture <= 0) {
            this.mFinished = true;
            this.mRunning = false;
            InterfaceC85737Xkr interfaceC85737Xkr = this.mCountDownTimerListener;
            if (interfaceC85737Xkr != null) {
                interfaceC85737Xkr.LIZ();
            }
            return this;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.mMillisInFuture;
        this.mStopTimeInFuture = elapsedRealtime + j;
        this.mRemainingMillis = j;
        InterfaceC85737Xkr interfaceC85737Xkr2 = this.mCountDownTimerListener;
        if (interfaceC85737Xkr2 != null) {
            interfaceC85737Xkr2.onStart();
        }
        Handler handler = this.mHandler;
        handler.sendMessage(handler.obtainMessage(1));
        return this;
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        synchronized (this) {
            if (this.mCancelled) {
                return;
            }
            long elapsedRealtime = this.mStopTimeInFuture - SystemClock.elapsedRealtime();
            this.mRemainingMillis = elapsedRealtime;
            long j = 0;
            if (elapsedRealtime > 0) {
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                InterfaceC85737Xkr interfaceC85737Xkr = this.mCountDownTimerListener;
                if (interfaceC85737Xkr != null) {
                    interfaceC85737Xkr.LJIILIIL(this.mRemainingMillis);
                }
                long elapsedRealtime3 = SystemClock.elapsedRealtime() - elapsedRealtime2;
                long j2 = this.mRemainingMillis;
                long j3 = this.mCountdownInterval;
                if (j2 < j3) {
                    long j4 = j2 - elapsedRealtime3;
                    if (j4 >= 0) {
                        j = j4;
                    }
                } else {
                    long j5 = j3 - elapsedRealtime3;
                    while (j5 < 0) {
                        j5 += this.mCountdownInterval;
                    }
                    j = j5;
                }
                Handler handler = this.mHandler;
                handler.sendMessageDelayed(handler.obtainMessage(1), j);
            } else {
                this.mFinished = true;
                this.mRunning = false;
                InterfaceC85737Xkr interfaceC85737Xkr2 = this.mCountDownTimerListener;
                if (interfaceC85737Xkr2 != null) {
                    interfaceC85737Xkr2.LIZ();
                }
            }
        }
    }

    public void setCountDownTimerListener(InterfaceC85737Xkr interfaceC85737Xkr) {
        this.mCountDownTimerListener = interfaceC85737Xkr;
        if (this.mFinished && interfaceC85737Xkr != null) {
            interfaceC85737Xkr.LIZ();
        }
    }

    public CountDownTimer(long j, long j2, InterfaceC85737Xkr interfaceC85737Xkr) {
        this.mMillisInFuture = j;
        this.mCountdownInterval = j2;
        this.mCountDownTimerListener = interfaceC85737Xkr;
    }
}
