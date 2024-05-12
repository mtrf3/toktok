package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: X.5DR, reason: invalid class name */
/* loaded from: classes3.dex */
public class C5DR extends Handler {
    public final C5DS LIZ;

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        C5DS c5ds = this.LIZ;
        if (c5ds != null && message != null) {
            c5ds.handleMsg(message);
        }
    }

    public C5DR(Looper looper, C5DS c5ds) {
        super(looper);
        this.LIZ = c5ds;
    }
}
