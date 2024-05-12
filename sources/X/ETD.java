package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;

/* loaded from: classes7.dex */
public final class ETD extends Handler {
    public final Handler LIZ;
    public boolean LIZIZ;
    public final HandlerThread LIZJ;
    public Handler LIZLLL;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ETD(android.os.Handler r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L18
            android.os.Looper r0 = r3.getLooper()
        L6:
            r2.<init>(r0)
            r0 = 0
            r2.LIZIZ = r0
            android.os.HandlerThread r1 = new android.os.HandlerThread
            java.lang.String r0 = "FixCollectCallbacksAnr"
            r1.<init>(r0)
            r2.LIZJ = r1
            r2.LIZ = r3
            return
        L18:
            android.os.Looper r0 = X.C16880lQ.LLJJJJ()
            goto L6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ETD.<init>(android.os.Handler):void");
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Handler handler = this.LIZ;
        if (handler != null) {
            handler.handleMessage(message);
        } else {
            super.handleMessage(message);
        }
    }

    @Override // android.os.Handler
    public final boolean sendMessageAtTime(Message message, long j) {
        if (!EEZ.LIZIZ() && message.getCallback() != null && message.getCallback().getClass().getName().equals("PooledLambdaImpl")) {
            String obj = message.getCallback().toString();
            if (obj.contains("ActivityThread") && obj.split(",").length == 2) {
                if ((((Number) C35335Dtr.LIZ.getValue()).intValue() & 2) != 2) {
                    if (!this.LIZIZ) {
                        this.LIZIZ = true;
                        this.LIZJ.start();
                        this.LIZLLL = new Handler(this.LIZJ.getLooper());
                    }
                    this.LIZLLL.post(message.getCallback());
                }
                message.recycle();
                return false;
            }
        }
        Handler handler = this.LIZ;
        if (handler != null) {
            return handler.sendMessageAtTime(message, j);
        }
        return super.sendMessageAtTime(message, j);
    }
}
