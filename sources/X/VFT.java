package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes15.dex */
public class VFT extends Handler {
    public final /* synthetic */ C84232X4a LIZ;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what != 1) {
            return;
        }
        this.LIZ.LIZ();
        sendEmptyMessageDelayed(1, 1000L);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VFT(C84232X4a c84232X4a, Looper looper) {
        super(looper);
        this.LIZ = c84232X4a;
    }
}
