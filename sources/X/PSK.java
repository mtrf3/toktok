package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes12.dex */
public class PSK extends Handler {
    public PSK(Looper looper) {
        super(looper);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        LinkedList linkedList;
        if (message.what == 1) {
            synchronized (PSJ.LIZIZ) {
                synchronized (PSJ.LIZ) {
                    LinkedList<Runnable> linkedList2 = PSJ.LJ;
                    linkedList = (LinkedList) linkedList2.clone();
                    linkedList2.clear();
                    PSJ.LIZ().removeMessages(1);
                }
                if (linkedList.size() > 0) {
                    Iterator it = linkedList.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                }
            }
        }
    }
}
