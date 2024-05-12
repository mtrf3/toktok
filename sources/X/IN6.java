package X;

import android.os.Handler;
import android.os.Message;

/* loaded from: classes9.dex */
public class IN6 extends Handler {
    public final Handler LIZ;

    public IN6(Handler handler) {
        super(C16880lQ.LLJJJJ());
        this.LIZ = handler;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Handler handler = this.LIZ;
        if (handler != null) {
            handler.handleMessage(message);
        }
    }
}
