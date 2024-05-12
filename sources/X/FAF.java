package X;

import android.os.Message;
import java.util.concurrent.Callable;

/* loaded from: classes7.dex */
public class FAF implements Runnable {
    public final Callable<?> LJLIL;
    public final Message LJLILLLLZI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            try {
                e = this.LJLIL.call();
            } finally {
                if (LIZ) {
                }
            }
        } catch (Exception e) {
            e = e;
        }
        Message message = this.LJLILLLLZI;
        if (message != null) {
            message.obj = e;
            message.sendToTarget();
        }
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TaskManager[");
        LIZ.append(this.LJLIL.toString());
        LIZ.append("]");
        return X1D.LIZIZ(LIZ);
    }

    public FAF(Callable callable, Message message) {
        this.LJLIL = callable;
        this.LJLILLLLZI = message;
    }
}
