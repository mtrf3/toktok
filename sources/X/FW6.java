package X;

import android.os.Handler;
import android.os.Message;

/* loaded from: classes7.dex */
public class FW6 extends Handler {
    public final Handler LIZ;

    public FW6(Handler handler) {
        this.LIZ = handler;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        super.handleMessage(message);
        LXV.LJIJI = null;
        this.LIZ.handleMessage(message);
    }
}
