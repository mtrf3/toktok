package X;

import Y.IDRunnableS6S0101000;
import android.os.Handler;
import android.os.Message;

/* renamed from: X.J2a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class HandlerC48508J2a extends Handler {
    public final Runnable LIZ;

    public HandlerC48508J2a(IDRunnableS6S0101000 iDRunnableS6S0101000) {
        this.LIZ = iDRunnableS6S0101000;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what == 1) {
            this.LIZ.run();
        }
        super.handleMessage(message);
    }
}
