package X;

import android.os.Handler;
import android.os.Message;

/* renamed from: X.IJh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class HandlerC46409IJh extends Handler {
    public final C78362UpC LIZ;

    public HandlerC46409IJh(C78362UpC c78362UpC) {
        super(C16880lQ.LLJJJJ());
        this.LIZ = c78362UpC;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        super.handleMessage(message);
        if (message.what == 1) {
            this.LIZ.LIZIZ();
        }
    }
}
