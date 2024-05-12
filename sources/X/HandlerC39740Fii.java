package X;

import android.os.Handler;
import android.os.Message;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* renamed from: X.Fii, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class HandlerC39740Fii extends Handler {
    public final Handler LIZ;
    public final WeakReference<ViewParent> LIZIZ;
    public final /* synthetic */ C39739Fih LIZJ;

    @Override // android.os.Handler
    public final void dispatchMessage(Message message) {
        if (message.what == 6) {
            C39739Fih c39739Fih = this.LIZJ;
            c39739Fih.LIZJ = true;
            FN7.LIZIZ = null;
            Iterator<Runnable> it = c39739Fih.LIZLLL.iterator();
            while (it.hasNext()) {
                FN7.LIZIZ(it.next());
            }
        }
        Handler handler = this.LIZ;
        if (handler != null) {
            handler.dispatchMessage(message);
        } else {
            super.dispatchMessage(message);
        }
    }

    @Override // android.os.Handler
    public final boolean sendMessageAtTime(Message message, long j) {
        return super.sendMessageAtTime(message, j);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public HandlerC39740Fii(X.C39739Fih r2, android.os.Handler r3, android.view.ViewParent r4) {
        /*
            r1 = this;
            r1.LIZJ = r2
            if (r3 == 0) goto L15
            android.os.Looper r0 = r3.getLooper()
        L8:
            r1.<init>(r0)
            r1.LIZ = r3
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r4)
            r1.LIZIZ = r0
            return
        L15:
            android.os.Looper r0 = X.C16880lQ.LLJJJJ()
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HandlerC39740Fii.<init>(X.Fih, android.os.Handler, android.view.ViewParent):void");
    }
}
