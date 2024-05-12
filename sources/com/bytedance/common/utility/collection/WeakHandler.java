package com.bytedance.common.utility.collection;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public class WeakHandler extends Handler {
    public WeakReference<IHandler> mRef;

    /* loaded from: classes2.dex */
    public interface IHandler {
        void handleMsg(Message message);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public WeakHandler(com.bytedance.common.utility.collection.WeakHandler.IHandler r2) {
        /*
            r1 = this;
            android.os.Looper r0 = android.os.Looper.myLooper()
            if (r0 != 0) goto Le
            android.os.Looper r0 = X.C16880lQ.LLJJJJ()
        La:
            r1.<init>(r0, r2)
            return
        Le:
            android.os.Looper r0 = android.os.Looper.myLooper()
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.utility.collection.WeakHandler.<init>(com.bytedance.common.utility.collection.WeakHandler$IHandler):void");
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        IHandler iHandler = this.mRef.get();
        if (iHandler != null && message != null) {
            iHandler.handleMsg(message);
        }
    }

    public WeakHandler(Looper looper, IHandler iHandler) {
        super(looper);
        this.mRef = new WeakReference<>(iHandler);
    }
}
