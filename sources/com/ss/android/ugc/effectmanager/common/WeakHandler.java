package com.ss.android.ugc.effectmanager.common;

import X.C16880lQ;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes16.dex */
public class WeakHandler extends Handler {
    public IHandler mHandler;

    /* loaded from: classes16.dex */
    public interface IHandler {
        void handleMsg(Message message);
    }

    public WeakHandler(IHandler iHandler) {
        super(C16880lQ.LLJJJJ());
        this.mHandler = iHandler;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        IHandler iHandler = this.mHandler;
        if (iHandler != null && message != null) {
            iHandler.handleMsg(message);
        }
    }

    public WeakHandler(Looper looper, IHandler iHandler) {
        super(looper);
        this.mHandler = iHandler;
    }
}
