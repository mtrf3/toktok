package X;

import android.os.Handler;
import android.os.Message;

/* renamed from: X.Uop, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class HandlerC78339Uop extends Handler {
    public final AbstractC78335Uol LIZ;

    public HandlerC78339Uop(AbstractC78335Uol abstractC78335Uol) {
        super(C16880lQ.LLJJJJ());
        this.LIZ = abstractC78335Uol;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        super.handleMessage(message);
        if (message.what == 1659) {
            C78273Unl.LJIIIZ().LJ().getClass();
            this.LIZ.LIZLLL();
        }
    }
}
