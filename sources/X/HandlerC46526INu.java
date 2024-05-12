package X;

import android.os.Handler;
import android.os.Message;

/* renamed from: X.INu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class HandlerC46526INu extends Handler {
    public final C78330Uog LIZ;

    public HandlerC46526INu(C78330Uog c78330Uog) {
        super(C16880lQ.LLJJJJ());
        this.LIZ = c78330Uog;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        super.handleMessage(message);
        if (message.what == 1) {
            this.LIZ.LIZLLL();
        }
    }
}
