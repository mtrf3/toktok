package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes11.dex */
public class OE7 extends Handler {
    public final /* synthetic */ OE6 LIZ;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        OEL oel = (OEL) message.obj;
        oel.LIZ();
        if (oel.LIZ > 0) {
            Message obtainMessage = this.LIZ.LIZ.obtainMessage(message.what);
            obtainMessage.obj = oel;
            this.LIZ.LIZ.sendMessageDelayed(obtainMessage, oel.LIZ);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OE7(OE6 oe6, Looper looper) {
        super(looper);
        this.LIZ = oe6;
    }
}
