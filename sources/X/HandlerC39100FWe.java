package X;

import android.os.Handler;
import android.os.Message;
import java.util.LinkedList;
import java.util.Queue;

/* renamed from: X.FWe, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class HandlerC39100FWe extends Handler {
    public final Handler LIZ;
    public final Queue<Message> LIZIZ;
    public boolean LIZJ;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public HandlerC39100FWe(android.os.Handler r2) {
        /*
            r1 = this;
            if (r2 == 0) goto L13
            android.os.Looper r0 = r2.getLooper()
        L6:
            r1.<init>(r0)
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r1.LIZIZ = r0
            r1.LIZ = r2
            return
        L13:
            android.os.Looper r0 = X.C16880lQ.LLJJJJ()
            goto L6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HandlerC39100FWe.<init>(android.os.Handler):void");
    }

    @Override // android.os.Handler
    public final void dispatchMessage(Message message) {
        Runnable callback;
        if (C34710Djm.LIZJ() && (callback = message.getCallback()) != null) {
            String name = callback.getClass().getName();
            boolean contains = name.contains("LoadedApk$ReceiverDispatcher");
            boolean contains2 = name.contains("LoadedApk$ServiceDispatcher");
            if (contains || contains2) {
                ((LinkedList) this.LIZIZ).offer(message);
                return;
            }
        }
        Handler handler = this.LIZ;
        if (handler != null) {
            handler.dispatchMessage(message);
        } else {
            super.dispatchMessage(message);
        }
    }
}
