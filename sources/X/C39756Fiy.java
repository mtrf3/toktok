package X;

import android.os.Handler;
import android.os.Message;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.Fiy, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39756Fiy implements Handler.Callback {
    public static final C39756Fiy LJLJJI = new C39756Fiy();
    public final List<C39761Fj3> LJLIL = new ArrayList();
    public Handler.Callback LJLILLLLZI;
    public boolean LJLJI;

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.arg2 == 1000089) {
            Handler.Callback callback = this.LJLILLLLZI;
            if (callback == null) {
                return false;
            }
            return callback.handleMessage(message);
        }
        if (C39758Fj0.LIZIZ(message)) {
            RunnableC39754Fiw LIZIZ = RunnableC39754Fiw.LIZIZ();
            LIZIZ.getClass();
            Message obtain = Message.obtain(message);
            Message obtain2 = Message.obtain(LIZIZ.LJLILLLLZI);
            obtain2.obj = obtain;
            LIZIZ.LJLILLLLZI.sendMessageAtTime(obtain2, message.getWhen());
            return true;
        }
        if (message.getTarget() == EWB.LIZJ()) {
            if (((HashSet) C39758Fj0.LIZIZ).contains(Integer.valueOf(message.what))) {
                C39758Fj0.LIZ(Message.obtain(message));
                return true;
            }
        }
        Handler.Callback callback2 = this.LJLILLLLZI;
        if (callback2 == null) {
            return false;
        }
        return callback2.handleMessage(message);
    }
}
