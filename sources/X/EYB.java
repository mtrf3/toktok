package X;

import android.os.Handler;
import android.os.Message;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class EYB implements Handler.Callback {
    public final Handler.Callback LJLIL;
    public final List<Handler.Callback> LJLILLLLZI = new ArrayList();

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message == null) {
            Handler.Callback callback = this.LJLIL;
            if (callback == null) {
                return false;
            }
            return callback.handleMessage(message);
        }
        Iterator it = ((ArrayList) this.LJLILLLLZI).iterator();
        while (it.hasNext()) {
            if (((Handler.Callback) it.next()).handleMessage(message)) {
                return true;
            }
        }
        Handler.Callback callback2 = this.LJLIL;
        if (callback2 == null) {
            return false;
        }
        return callback2.handleMessage(message);
    }

    public EYB(Handler handler, Handler.Callback callback) {
        this.LJLIL = callback;
    }
}
