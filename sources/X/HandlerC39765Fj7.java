package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: X.Fj7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class HandlerC39765Fj7 extends Handler {
    public final /* synthetic */ C39759Fj1 LIZ;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        super.handleMessage(message);
        if (message.what != 101) {
            return;
        }
        Object obj = this.LIZ.LJLILLLLZI;
        if (obj != null) {
            obj.getClass();
            C77119UOl.LJIJI();
        }
        this.LIZ.LJII();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC39765Fj7(C39759Fj1 c39759Fj1, Looper looper) {
        super(looper);
        this.LIZ = c39759Fj1;
    }
}
