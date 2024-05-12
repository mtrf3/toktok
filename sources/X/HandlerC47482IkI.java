package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: X.IkI, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class HandlerC47482IkI extends Handler {
    public final /* synthetic */ C48078Itu LIZ;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what == 1) {
            this.LIZ.LIZ();
            sendEmptyMessageDelayed(1, C48078Itu.LJII);
        } else {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Unknown what=");
            LIZ.append(message.what);
            throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC47482IkI(C48078Itu c48078Itu, Looper looper) {
        super(looper);
        this.LIZ = c48078Itu;
    }
}
