package X;

import android.os.Handler;
import android.os.Message;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes12.dex */
public final class QUA implements Handler.Callback {
    public final QUI LJLIL;
    public final java.util.Map<Long, QU8> LJLILLLLZI = new ConcurrentHashMap();
    public final QUH LJLJI;

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        return false;
    }

    public QUA(QUH quh, QUE que) {
        this.LJLJI = quh;
        this.LJLIL = que;
    }
}
