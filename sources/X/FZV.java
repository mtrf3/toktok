package X;

import android.content.AsyncQueryHandler;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes7.dex */
public class FZV extends AsyncQueryHandler.WorkerHandler {
    @Override // android.content.AsyncQueryHandler.WorkerHandler, android.os.Handler
    public final void handleMessage(Message message) {
        try {
            super.handleMessage(message);
        } catch (SecurityException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public FZV(FZW fzw, Looper looper) {
        super(fzw, looper);
    }
}
