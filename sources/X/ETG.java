package X;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* loaded from: classes7.dex */
public class ETG implements Runnable {
    public final WeakReference<Handler> LJLIL;
    public final Message LJLILLLLZI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        Handler handler;
        try {
            WeakReference<Handler> weakReference = this.LJLIL;
            if (weakReference != null && (handler = weakReference.get()) != null) {
                handler.handleMessage(this.LJLILLLLZI);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public ETG(Handler handler, Message message) {
        this.LJLIL = new WeakReference<>(handler);
        this.LJLILLLLZI = message;
    }
}
