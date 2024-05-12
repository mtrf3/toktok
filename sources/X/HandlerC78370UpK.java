package X;

import android.os.Handler;
import android.os.Message;

/* renamed from: X.UpK, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class HandlerC78370UpK extends Handler {
    public final InterfaceC78390Upe LIZ;

    public HandlerC78370UpK(InterfaceC78390Upe interfaceC78390Upe) {
        super(C16880lQ.LLJJJJ());
        this.LIZ = interfaceC78390Upe;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        super.handleMessage(message);
        if (message.what == 1733) {
            InterfaceC78390Upe interfaceC78390Upe = this.LIZ;
            C78368UpI c78368UpI = new C78368UpI();
            c78368UpI.withErrorCode(1);
            c78368UpI.withDetailCode(4012);
            c78368UpI.withMessage("amazon not support!");
            interfaceC78390Upe.LIZ(c78368UpI);
            C78345Uov.LJIIJ = false;
        }
    }
}
