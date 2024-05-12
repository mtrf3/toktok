package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: X.Fiu, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class HandlerC39752Fiu extends Handler {
    public HandlerC39752Fiu(Looper looper) {
        super(looper);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        super.handleMessage(message);
        if (message.what == 100) {
            Object obj = message.obj;
            if (obj instanceof WeakReference) {
                Message message2 = (Message) ((Reference) obj).get();
                if (message2 != null && message2.arg2 == 9527) {
                    RunnableC39751Fit LIZJ = RunnableC39751Fit.LIZJ();
                    if (LIZJ.LJLIL != null) {
                        synchronized (RunnableC39751Fit.LJLLI) {
                            if (!((ArrayList) LIZJ.LJLJI).contains(message2)) {
                                ((ArrayList) LIZJ.LJLJI).add(message2);
                            }
                        }
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append(message2.what);
                        LIZ.append(" is delayed 5 seconds and put it into emergency list!");
                        X1D.LIZIZ(LIZ);
                        C39749Fir.LIZ();
                        return;
                    }
                    throw new RuntimeException("Must call start(Application context) first!!!");
                }
                C39749Fir.LIZ();
                return;
            }
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("UnSupport message is ");
        LIZ2.append(message.what);
        throw new IllegalArgumentException(X1D.LIZIZ(LIZ2));
    }
}
