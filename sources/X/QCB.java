package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes12.dex */
public class QCB extends Handler {
    public final /* synthetic */ PZM LIZ;

    /* JADX WARN: Removed duplicated region for block: B:47:0x00b6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            Method dump skipped, instructions count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QCB.LIZ():void");
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            if (i == 2) {
                LIZ();
                removeMessages(1);
                return;
            } else {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Unknown what=");
                LIZ.append(message.what);
                throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
            }
        }
        LIZ();
        sendEmptyMessageDelayed(1, 1000L);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QCB(PZM pzm, Looper looper) {
        super(looper);
        this.LIZ = pzm;
    }
}
