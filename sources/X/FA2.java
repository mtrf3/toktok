package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes7.dex */
public class FA2 extends Handler {
    public static boolean LIZIZ;
    public static boolean LIZJ;
    public LinkedList<Runnable> LIZ;

    public FA2(Looper looper) {
        super(looper);
        this.LIZ = new LinkedList<>();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        LinkedList<Runnable> linkedList;
        if (this.LIZ.size() == 0) {
            return;
        }
        synchronized (FA3.LJ) {
            linkedList = this.LIZ;
            this.LIZ = new LinkedList<>();
        }
        LIZIZ = true;
        int i = FA3.LJI;
        if (i != -1) {
            try {
                Thread.sleep(i);
            } catch (InterruptedException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        Iterator<Runnable> it = linkedList.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
        if (this.LIZ.size() > 0) {
            sendMessageAtFrontOfQueue(Message.obtain(this, 2));
        } else {
            LIZIZ = false;
        }
    }

    @Override // android.os.Handler
    public final boolean sendMessageAtTime(Message message, long j) {
        try {
            if (!LIZJ) {
                FA3.LIZIZ = (LinkedList) FA3.LIZLLL.get(null);
                FA3.LIZ.removeMessages(1);
                FA3.LIZJ.clear();
                LIZJ = true;
            }
        } catch (Throwable unused) {
        }
        if (FA3.LIZIZ.size() == 1) {
            this.LIZ.addLast(FA3.LIZIZ.poll());
        } else if (FA3.LIZIZ.size() > 1) {
            this.LIZ = FA3.LIZIZ;
            try {
                LinkedList<Runnable> linkedList = new LinkedList<>();
                FA3.LIZIZ = linkedList;
                FA3.LIZLLL.set(null, linkedList);
            } catch (Exception unused2) {
            }
        }
        if (LIZIZ) {
            return true;
        }
        message.what = 2;
        return sendMessageAtFrontOfQueue(message);
    }
}
