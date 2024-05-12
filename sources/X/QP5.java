package X;

import android.os.HandlerThread;
import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;

/* loaded from: classes12.dex */
public final class QP5 implements WeakHandler.IHandler {
    public static QP5 LJLILLLLZI;
    public static HandlerThread LJLJI;
    public final WeakHandler LJLIL;

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
    }

    public static QP5 LIZ() {
        if (LJLILLLLZI == null) {
            synchronized (QP5.class) {
                if (LJLILLLLZI == null) {
                    LJLILLLLZI = new QP5();
                }
            }
        }
        return LJLILLLLZI;
    }

    public QP5() {
        if (LJLJI == null) {
            HandlerThread handlerThread = new HandlerThread("PushThreadHandler");
            LJLJI = handlerThread;
            handlerThread.start();
        }
        this.LJLIL = new WeakHandler(LJLJI.getLooper(), this);
    }

    public final void LIZJ(Runnable runnable) {
        LIZIZ(0L, runnable);
    }

    public final void LIZIZ(long j, Runnable runnable) {
        if (j <= 0) {
            this.LJLIL.post(runnable);
        } else {
            this.LJLIL.postDelayed(runnable, j);
        }
    }
}
