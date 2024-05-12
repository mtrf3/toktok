package X;

import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.os.MessageQueue;
import android.view.Choreographer;
import java.lang.reflect.Method;

/* renamed from: X.Eqg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class HandlerC37686Eqg extends Handler implements InterfaceC37690Eqk {
    public final Handler LJLIL;
    public final Object LJLILLLLZI;
    public final Choreographer LJLJI;
    public boolean LJLJJI;

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0022, code lost:
    
        if (X.C37684Eqe.LIZIZ(r4.LJLIL, r4) != false) goto L9;
     */
    @Override // X.InterfaceC37690Eqk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void start() {
        /*
            r4 = this;
            android.view.Choreographer r3 = r4.LJLJI
            r2 = 1
            java.lang.Class r1 = r3.getClass()     // Catch: java.lang.Throwable -> L16
            java.lang.String r0 = "mHandler"
            java.lang.reflect.Field r0 = X.C36508EUm.LIZ(r1, r0)     // Catch: java.lang.Throwable -> L16
            long r0 = X.C37685Eqf.LIZ(r0)     // Catch: java.lang.Throwable -> L16
            X.C37685Eqf.LIZIZ(r0, r3, r4)     // Catch: java.lang.Throwable -> L16
            goto L1c
        L16:
            r0 = move-exception
            android.util.Log.getStackTraceString(r0)
        L1a:
            r2 = 0
            goto L24
        L1c:
            android.os.Handler r0 = r4.LJLIL
            boolean r0 = X.C37684Eqe.LIZIZ(r0, r4)
            if (r0 == 0) goto L1a
        L24:
            r4.LJLJJI = r2
            if (r2 == 0) goto L29
        L29:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HandlerC37686Eqg.start():void");
    }

    @Override // android.os.Handler
    public final void dispatchMessage(Message message) {
        Handler handler = this.LJLIL;
        if (handler != null) {
            handler.dispatchMessage(message);
        } else {
            super.dispatchMessage(message);
        }
    }

    public HandlerC37686Eqg(Handler handler, Choreographer choreographer) {
        super(handler.getLooper());
        Object obj;
        this.LJLIL = handler;
        this.LJLJI = choreographer;
        try {
            obj = C36508EUm.LIZJ(choreographer, "mDisplayEventReceiver");
        } catch (Throwable th) {
            android.util.Log.getStackTraceString(th);
            obj = null;
        }
        this.LJLILLLLZI = obj;
    }

    @Override // X.InterfaceC37690Eqk
    public final boolean LIZ(Message message, long j) {
        return sendMessageAtTime(message, j);
    }

    @Override // android.os.Handler
    public final boolean sendMessageAtTime(Message message, long j) {
        int i;
        Method LIZIZ;
        Handler handler;
        if (!this.LJLJJI && (handler = this.LJLIL) != null) {
            return handler.sendMessageAtTime(message, j);
        }
        if (this.LJLIL != null) {
            if (message.getCallback() == this.LJLILLLLZI) {
                C37688Eqi c37688Eqi = C37691Eql.LIZ;
                if (Build.VERSION.SDK_INT >= 23) {
                    if (c37688Eqi.LJFF == null) {
                        c37688Eqi.LJFF = Boolean.TRUE;
                        MessageQueue queue = C16880lQ.LLJJJJ().getQueue();
                        try {
                            LIZIZ = C36508EUm.LIZIZ(MessageQueue.class, "postSyncBarrier", Long.TYPE);
                        } catch (Throwable th) {
                            android.util.Log.getStackTraceString(th);
                        }
                        if (LIZIZ != null) {
                            i = ((Integer) C37684Eqe.LIZLLL(queue, LIZIZ, new Object[]{0L})).intValue();
                            c37688Eqi.LJI = i;
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("post SyncBarrier: ");
                            LIZ.append(c37688Eqi.LJI);
                            X1D.LIZIZ(LIZ);
                        }
                        i = -1;
                        c37688Eqi.LJI = i;
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("post SyncBarrier: ");
                        LIZ2.append(c37688Eqi.LJI);
                        X1D.LIZIZ(LIZ2);
                    }
                } else {
                    c37688Eqi.getClass();
                }
                if (C37688Eqi.LIZ()) {
                    int i2 = C37688Eqi.LJII;
                    C37688Eqi.LJII = i2 + 1;
                    return super.sendMessageAtTime(message, i2);
                }
                Handler handler2 = this.LJLIL;
                int i3 = C37688Eqi.LJII;
                C37688Eqi.LJII = i3 + 1;
                return handler2.sendMessageAtTime(message, i3);
            }
            if (C37688Eqi.LIZ()) {
                int i4 = C37688Eqi.LJIIIIZZ;
                C37688Eqi.LJIIIIZZ = i4 + 1;
                return super.sendMessageAtTime(message, i4);
            }
            Handler handler3 = this.LJLIL;
            int i5 = C37688Eqi.LJIIIIZZ;
            C37688Eqi.LJIIIIZZ = i5 + 1;
            return handler3.sendMessageAtTime(message, i5);
        }
        return super.sendMessageAtTime(message, j);
    }
}
