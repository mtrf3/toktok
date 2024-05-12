package X;

import android.os.Handler;
import android.os.Message;

/* renamed from: X.FVb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class HandlerC39071FVb extends Handler {
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        super.handleMessage(message);
        Object obj = message.obj;
        if (obj == null) {
            FW5.LJIIIIZZ("load_empty_feed");
            FW5.LIZ("no_response", "fake_failed");
            return;
        }
        if (obj instanceof Exception) {
            FW5.LJIIIIZZ("exec_failed");
            FW5.LIZ("no_response", "fake_failed");
            return;
        }
        if (FW5.LJI()) {
            FW5.LJIIIIZZ.LIZIZ = true;
            FW5.LJIIIIZZ.LIZ.sendMessage(Message.obtain(message));
            FW5.LIZ = Boolean.FALSE;
            FW5.LJIIIIZZ = null;
            FW5.LJIIIIZZ("fake_response");
            FW5.LIZ("no_response", "fake_response");
            return;
        }
        FW5.LJIIIIZZ("valid_response_received_after_do_fake");
        FW5.LIZ("no_response", "valid_response");
    }
}
