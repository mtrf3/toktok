package X;

import Y.IDHandlerS18S0100000_5;
import android.os.Message;
import android.os.SystemClock;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes6.dex */
public final class B4N {
    public static volatile B4N LJI;
    public long LIZLLL;
    public final List<B4P> LIZ = new CopyOnWriteArrayList();
    public boolean LIZIZ = false;
    public long LIZJ = -1;
    public final java.util.Map<String, Object> LJ = new HashMap();
    public final IDHandlerS18S0100000_5 LJFF = new IDHandlerS18S0100000_5(this, C16880lQ.LLJJJJ(), 3);

    public static B4N LIZIZ() {
        if (LJI == null) {
            synchronized (B4N.class) {
                if (LJI == null) {
                    LJI = new B4N();
                }
            }
        }
        return LJI;
    }

    public final long LIZ() {
        long j = this.LIZLLL;
        long j2 = 0;
        if (this.LIZJ > 0) {
            j2 = SystemClock.elapsedRealtime() - this.LIZJ;
        }
        return j + j2;
    }

    public final void LIZJ() {
        this.LJFF.removeMessages(100);
        Iterator it = ((CopyOnWriteArrayList) this.LIZ).iterator();
        while (it.hasNext()) {
            LIZLLL((B4P) it.next());
        }
    }

    public final void LIZLLL(B4P b4p) {
        if (b4p == null) {
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = 100;
        obtain.obj = new B4O(b4p, this.LJ);
        this.LJFF.sendMessageDelayed(obtain, b4p.LIZ - LIZ());
    }
}
