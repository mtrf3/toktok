package com.ss.android.ugc.aweme.util;

import X.JC4;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import com.bytedance.common.utility.collection.WeakHandler;

/* loaded from: classes9.dex */
public class CountDownTimer implements WeakHandler.IHandler {
    public boolean mCancelled;
    public JC4 mCountDownTimerListener;
    public final long mCountdownInterval;
    public boolean mFinished;
    public Handler mHandler = new WeakHandler(this);
    public final long mMillisInFuture;
    public long mMillisLeftPaused;
    public boolean mPaused;
    public boolean mRunning;
    public long mStopTimeInFuture;

    public final synchronized void cancel() {
        this.mCancelled = true;
        this.mRunning = false;
        this.mPaused = false;
        this.mHandler.removeMessages(1);
    }

    public synchronized boolean isCancelled() {
        return this.mCancelled;
    }

    public synchronized boolean isFinished() {
        return this.mFinished;
    }

    public synchronized boolean isPaused() {
        return this.mPaused;
    }

    public synchronized boolean isRunning() {
        return this.mRunning;
    }

    public synchronized void pause() {
        if (this.mRunning) {
            this.mPaused = true;
            this.mHandler.removeMessages(1);
            this.mMillisLeftPaused = this.mStopTimeInFuture - SystemClock.elapsedRealtime();
        }
    }

    public synchronized void resume() {
        if (this.mPaused) {
            this.mPaused = false;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = this.mMillisLeftPaused;
            this.mStopTimeInFuture = elapsedRealtime + j;
            long j2 = this.mMillisInFuture - j;
            long j3 = this.mCountdownInterval;
            Handler handler = this.mHandler;
            handler.sendMessageDelayed(handler.obtainMessage(1), j3 - (j2 % j3));
        }
    }

    public final synchronized CountDownTimer start() {
        this.mPaused = false;
        this.mCancelled = false;
        this.mFinished = false;
        this.mRunning = true;
        if (this.mMillisInFuture <= 0) {
            this.mFinished = true;
            this.mRunning = false;
            JC4 jc4 = this.mCountDownTimerListener;
            if (jc4 != null) {
                jc4.LIZ();
            }
            return this;
        }
        JC4 jc42 = this.mCountDownTimerListener;
        if (jc42 != null) {
            jc42.onStart();
        }
        this.mStopTimeInFuture = SystemClock.elapsedRealtime() + this.mMillisInFuture;
        Handler handler = this.mHandler;
        handler.sendMessage(handler.obtainMessage(1));
        return this;
    }

    public long getMillisLeftPaused() {
        return this.mMillisLeftPaused;
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        synchronized (this) {
            if (this.mCancelled || this.mPaused) {
                return;
            }
            long elapsedRealtime = this.mStopTimeInFuture - SystemClock.elapsedRealtime();
            long j = 0;
            if (elapsedRealtime <= 0) {
                this.mFinished = true;
                this.mRunning = false;
                JC4 jc4 = this.mCountDownTimerListener;
                if (jc4 != null) {
                    jc4.LIZ();
                }
            } else {
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                JC4 jc42 = this.mCountDownTimerListener;
                if (jc42 != null) {
                    jc42.LJIILIIL(elapsedRealtime);
                }
                long elapsedRealtime3 = SystemClock.elapsedRealtime() - elapsedRealtime2;
                long j2 = this.mCountdownInterval;
                if (elapsedRealtime < j2) {
                    long j3 = elapsedRealtime - elapsedRealtime3;
                    if (j3 >= 0) {
                        j = j3;
                    }
                } else {
                    long j4 = j2 - elapsedRealtime3;
                    while (j4 < 0) {
                        j4 += this.mCountdownInterval;
                    }
                    j = j4;
                }
                Handler handler = this.mHandler;
                handler.sendMessageDelayed(handler.obtainMessage(1), j);
            }
        }
    }

    public void setCountDownTimerListener(JC4 jc4) {
        this.mCountDownTimerListener = jc4;
        if (this.mFinished && jc4 != null) {
            jc4.LIZ();
        }
    }

    public CountDownTimer(long j, long j2, JC4 jc4) {
        this.mMillisInFuture = j;
        this.mCountdownInterval = j2;
        this.mCountDownTimerListener = jc4;
    }
}
