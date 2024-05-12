package com.bytedance.monitor.collector;

import X.C16880lQ;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes7.dex */
public final class DoFrameBooster {
    public static final /* synthetic */ int LIZ = 0;

    static {
        new ProxyFrameHandler(C16880lQ.LLJJJJ());
    }

    /* loaded from: classes7.dex */
    public static class ProxyFrameHandler extends Handler {
        public ProxyFrameHandler(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            throw null;
        }

        @Override // android.os.Handler
        public boolean sendMessageAtTime(Message message, long j) {
            message.getCallback();
            return super.sendMessageAtTime(message, j);
        }
    }
}
