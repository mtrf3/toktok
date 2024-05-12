package ms.bd.o;

import java.util.LinkedList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes7.dex */
public class o2 {
    public static volatile o2 LIZJ = null;
    public static int LIZLLL = 50;
    public final LinkedList<String> LIZ = new LinkedList<>();
    public final Lock LIZIZ = new ReentrantLock();

    public static o2 LIZ() {
        if (LIZJ == null) {
            synchronized (o2.class) {
                if (LIZJ == null) {
                    LIZJ = new o2();
                }
            }
        }
        return LIZJ;
    }

    public final void LIZIZ() {
        try {
            ((ReentrantLock) this.LIZIZ).unlock();
        } catch (Throwable unused) {
        }
    }
}
