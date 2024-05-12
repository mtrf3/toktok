package X;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* loaded from: classes9.dex */
public final class IW3 extends Handler {
    public final WeakReference<IW4> LIZ;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public IW3(X.IW4 r2) {
        /*
            r1 = this;
            android.os.Looper r0 = android.os.Looper.myLooper()
            if (r0 != 0) goto L15
            android.os.Looper r0 = X.C16880lQ.LLJJJJ()
        La:
            r1.<init>(r0)
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r1.LIZ = r0
            return
        L15:
            android.os.Looper r0 = android.os.Looper.myLooper()
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: X.IW3.<init>(X.IW4):void");
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        IW4 iw4 = this.LIZ.get();
        if (iw4 != null && message != null) {
            iw4.handleMsg(message);
        }
    }
}
