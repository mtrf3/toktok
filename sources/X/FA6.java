package X;

import android.os.Handler;
import android.os.Message;
import android.view.ViewParent;
import com.ss.android.ugc.aweme.legoImp.service.MainLooperOptService;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* loaded from: classes7.dex */
public class FA6 extends Handler {
    public final Handler LIZ;
    public final WeakReference<ViewParent> LIZIZ;
    public boolean LIZJ;
    public final /* synthetic */ MainLooperOptService LIZLLL;

    public final void LIZ() {
        try {
            this.LIZJ = false;
            ViewParent viewParent = this.LIZIZ.get();
            if (viewParent == null) {
                return;
            }
            this.LIZLLL.getClass();
            try {
                if (((Handler) C36508EUm.LIZJ(viewParent, "mHandler")) == this) {
                    FA5.LIZJ(viewParent, C36508EUm.LIZ(viewParent.getClass(), "mHandler"), this.LIZ);
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

    @Override // android.os.Handler
    public final boolean sendMessageAtTime(Message message, long j) {
        if (this.LIZJ) {
            java.util.Map<FAB, Boolean> map = this.LIZLLL.LJLIL;
            FAB fab = FAB.WATCH_WINDOW_FOCUS_CHANGE;
            if (!((Boolean) ((HashMap) map).get(fab)).booleanValue()) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("DelegateWindowFocusFramedHandler: Whether the current message is equal to ");
                LIZ.append(this.LIZLLL.LJLILLLLZI.name());
                X1D.LIZIZ(LIZ);
                MainLooperOptService mainLooperOptService = this.LIZLLL;
                if (mainLooperOptService.LJLILLLLZI == fab && message.what == 6) {
                    ((HashMap) mainLooperOptService.LJLIL).put(fab, Boolean.TRUE);
                    this.LIZLLL.LJIILIIL();
                    return super.sendMessageAtTime(message, 0L);
                }
                return super.sendMessageAtTime(message, j);
            }
        }
        return super.sendMessageAtTime(message, j);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public FA6(com.ss.android.ugc.aweme.legoImp.service.MainLooperOptService r5, android.os.Handler r6, android.view.ViewParent r7) {
        /*
            r4 = this;
            r4.LIZLLL = r5
            if (r6 == 0) goto L16
            android.os.Looper r0 = r6.getLooper()
        L8:
            r4.<init>(r0)
            r4.LIZ = r6
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r7)
            r4.LIZIZ = r0
            r3 = 0
            goto L1b
        L16:
            android.os.Looper r0 = X.C16880lQ.LLJJJJ()
            goto L8
        L1b:
            java.lang.Object r2 = r0.get()     // Catch: java.lang.Throwable -> L36
            android.view.ViewParent r2 = (android.view.ViewParent) r2     // Catch: java.lang.Throwable -> L36
            if (r2 != 0) goto L24
            goto L3b
        L24:
            java.lang.Class r1 = r2.getClass()     // Catch: java.lang.Throwable -> L36
            java.lang.String r0 = "mHandler"
            java.lang.reflect.Field r0 = X.C36508EUm.LIZ(r1, r0)     // Catch: java.lang.Throwable -> L36
            com.bytedance.sysoptimizer.java.ReflectionUtils.removeFinal(r0)     // Catch: java.lang.Throwable -> L36
            X.FA5.LIZ(r2, r0, r6, r4)     // Catch: java.lang.Throwable -> L36
            r3 = 1
            goto L3b
        L36:
            r0 = move-exception
            android.util.Log.getStackTraceString(r0)
        L3b:
            r4.LIZJ = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FA6.<init>(com.ss.android.ugc.aweme.legoImp.service.MainLooperOptService, android.os.Handler, android.view.ViewParent):void");
    }
}
