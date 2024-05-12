package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: X.J1n, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class HandlerC48495J1n extends Handler {
    public final /* synthetic */ C48494J1m LIZ;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        try {
            if (message.what == 1) {
                this.LIZ.LIZ();
                sendEmptyMessageDelayed(1, 1000L);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC48495J1n(C48494J1m c48494J1m, Looper looper) {
        super(looper);
        this.LIZ = c48494J1m;
    }
}
