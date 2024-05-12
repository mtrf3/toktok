package X;

import android.os.Handler;
import android.os.Message;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public class EFV extends Handler {
    public EFV() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EFV(Handler.Callback callback) {
        super(callback);
        o.LJIIIZ(callback, "callback");
    }

    public final void LIZ(int i) {
        LIZIZ(i, 0L);
    }

    public final void LIZIZ(int i, long j) {
        Message obtainMessage = obtainMessage();
        o.LJIIIIZZ(obtainMessage, "obtainMessage()");
        obtainMessage.what = i;
        obtainMessage.obj = null;
        removeMessages(i);
        sendMessageDelayed(obtainMessage, j);
    }
}
