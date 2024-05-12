package X;

import android.os.Handler;
import android.os.Message;
import android.view.Choreographer;
import com.ss.android.ugc.aweme.legoImp.service.MainLooperOptService;

/* loaded from: classes7.dex */
public class FA7 extends Handler {
    public final Handler LIZ;
    public boolean LIZIZ;
    public final /* synthetic */ MainLooperOptService LIZJ;

    public final void LIZ() {
        try {
            this.LIZIZ = false;
            try {
                if (((Handler) C36508EUm.LIZJ(this.LIZJ.LJLJLLL, "mHandler")) == this) {
                    Choreographer choreographer = this.LIZJ.LJLJLLL;
                    FA5.LIZJ(choreographer, C36508EUm.LIZ(choreographer.getClass(), "mHandler"), this.LIZ);
                    FA5.LIZIZ(this, this.LIZ);
                }
            } catch (Throwable th) {
                android.util.Log.getStackTraceString(th);
            }
        } catch (Throwable th2) {
            android.util.Log.getStackTraceString(th2);
        }
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

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public FA7(com.ss.android.ugc.aweme.legoImp.service.MainLooperOptService r3, android.os.Handler r4) {
        /*
            r2 = this;
            r2.LIZJ = r3
            if (r4 == 0) goto Le
            android.os.Looper r0 = r4.getLooper()
        L8:
            r2.<init>(r0)
            r2.LIZ = r4
            goto L13
        Le:
            android.os.Looper r0 = X.C16880lQ.LLJJJJ()
            goto L8
        L13:
            android.view.Choreographer r0 = r3.LJLJLLL     // Catch: java.lang.Throwable -> L29
            java.lang.Class r1 = r0.getClass()     // Catch: java.lang.Throwable -> L29
            java.lang.String r0 = "mHandler"
            java.lang.reflect.Field r1 = X.C36508EUm.LIZ(r1, r0)     // Catch: java.lang.Throwable -> L29
            com.bytedance.sysoptimizer.java.ReflectionUtils.removeFinal(r1)     // Catch: java.lang.Throwable -> L29
            android.view.Choreographer r0 = r3.LJLJLLL     // Catch: java.lang.Throwable -> L29
            X.FA5.LIZ(r0, r1, r4, r2)     // Catch: java.lang.Throwable -> L29
            r0 = 1
            goto L2f
        L29:
            r0 = move-exception
            android.util.Log.getStackTraceString(r0)
            r0 = 0
        L2f:
            r2.LIZIZ = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FA7.<init>(com.ss.android.ugc.aweme.legoImp.service.MainLooperOptService, android.os.Handler):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x002a, code lost:
    
        if (((java.lang.Boolean) ((java.util.HashMap) r3.LIZJ.LJLIL).get(X.FAB.WATCH_UI_FRAME)).booleanValue() != false) goto L8;
     */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean sendMessageAtTime(android.os.Message r4, long r5) {
        /*
            r3 = this;
            boolean r0 = r3.LIZIZ
            if (r0 == 0) goto L2c
            com.ss.android.ugc.aweme.legoImp.service.MainLooperOptService r0 = r3.LIZJ
            java.util.Map<X.FAB, java.lang.Boolean> r0 = r0.LJLIL
            X.FAB r2 = X.FAB.WATCH_MAIN_FRAME
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Object r0 = r0.get(r2)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L31
            com.ss.android.ugc.aweme.legoImp.service.MainLooperOptService r0 = r3.LIZJ
            java.util.Map<X.FAB, java.lang.Boolean> r1 = r0.LJLIL
            X.FAB r0 = X.FAB.WATCH_UI_FRAME
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.lang.Object r0 = r1.get(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L31
        L2c:
            boolean r0 = super.sendMessageAtTime(r4, r5)
            return r0
        L31:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "DelegateDoFramedHandler: Whether the current message is equal to "
            r1.append(r0)
            com.ss.android.ugc.aweme.legoImp.service.MainLooperOptService r0 = r3.LIZJ
            X.FAB r0 = r0.LJLILLLLZI
            java.lang.String r0 = r0.name()
            r1.append(r0)
            X.X1D.LIZIZ(r1)
            com.ss.android.ugc.aweme.legoImp.service.MainLooperOptService r0 = r3.LIZJ
            X.FAB r1 = r0.LJLILLLLZI
            if (r1 == r2) goto L52
            X.FAB r0 = X.FAB.WATCH_UI_FRAME
            if (r1 != r0) goto L77
        L52:
            int r0 = r4.what
            if (r0 != 0) goto L77
            java.lang.Runnable r2 = r4.getCallback()
            com.ss.android.ugc.aweme.legoImp.service.MainLooperOptService r1 = r3.LIZJ
            java.lang.Object r0 = r1.LJLL
            if (r2 != r0) goto L77
            java.util.Map<X.FAB, java.lang.Boolean> r2 = r1.LJLIL
            X.FAB r1 = r1.LJLILLLLZI
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            java.util.HashMap r2 = (java.util.HashMap) r2
            r2.put(r1, r0)
            com.ss.android.ugc.aweme.legoImp.service.MainLooperOptService r0 = r3.LIZJ
            r0.LJIILIIL()
            r0 = 0
            boolean r0 = super.sendMessageAtTime(r4, r0)
            return r0
        L77:
            boolean r0 = super.sendMessageAtTime(r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FA7.sendMessageAtTime(android.os.Message, long):boolean");
    }
}
