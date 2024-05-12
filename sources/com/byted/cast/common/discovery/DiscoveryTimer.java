package com.byted.cast.common.discovery;

import X.C16880lQ;
import android.os.Handler;
import android.os.Message;

/* loaded from: classes29.dex */
public class DiscoveryTimer {
    public Handler handler = new Handler(C16880lQ.LLJJJJ()) { // from class: com.byted.cast.common.discovery.DiscoveryTimer.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what != 0) {
                return;
            }
            DiscoveryTimer.this.mOnTimeoutListener.onNsdDiscoveryTimeout();
        }
    };
    public final OnTimeoutListener mOnTimeoutListener;
    public long seconds;

    /* loaded from: classes29.dex */
    public interface OnTimeoutListener {
        void onNsdDiscoveryTimeout();
    }

    public void cancel() {
        this.handler.removeMessages(0);
    }

    public void destroy() {
        this.handler.removeCallbacksAndMessages(null);
    }

    public void reset() {
        this.handler.removeMessages(0);
        this.handler.sendEmptyMessageDelayed(0, this.seconds);
    }

    public void start() {
        this.handler.sendEmptyMessageDelayed(0, this.seconds);
    }

    public void timeout(long j) {
        this.seconds = j;
        this.handler.removeMessages(0);
    }

    public DiscoveryTimer(OnTimeoutListener onTimeoutListener, long j) {
        this.mOnTimeoutListener = onTimeoutListener;
        this.seconds = j;
    }
}
