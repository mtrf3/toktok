package Y;

import X.C35820E4a;
import X.C39598FgQ;
import X.FJ5;
import X.FKM;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bytedance.librarian.Librarian;
import com.bytedance.liko.leakdetector.strategy.fd.FdLeakDetector;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes7.dex */
public class IDHandlerS7S0000000_6 extends Handler {
    public final int $t;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        switch (this.$t) {
            case 0:
                handleMessage$0(this, message);
                return;
            case 1:
                handleMessage$1(this, message);
                return;
            default:
                super.handleMessage(message);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDHandlerS7S0000000_6(Looper looper, int i) {
        super(looper);
        this.$t = i;
    }

    public static final void handleMessage$0(IDHandlerS7S0000000_6 iDHandlerS7S0000000_6, Message message) {
        FdLeakDetector.INSTANCE.dumpFdAndReport();
        iDHandlerS7S0000000_6.sendEmptyMessageDelayed(0, C39598FgQ.LIZLLL);
    }

    public static final void handleMessage$1(IDHandlerS7S0000000_6 iDHandlerS7S0000000_6, Message message) {
        super.handleMessage(message);
        if (C35820E4a.LIZ(FKM.LIZ(), 0, "key_idle_loadso") <= 0 || FJ5.LJII.get() || !FJ5.LIZJ.isEmpty()) {
            return;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) FJ5.LIZLLL;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (FJ5.LJII.get() || !FJ5.LJI.get()) {
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            Librarian.LJ(str);
            CopyOnWriteArrayList copyOnWriteArrayList2 = (CopyOnWriteArrayList) FJ5.LIZLLL;
            if (copyOnWriteArrayList2.contains(str)) {
                copyOnWriteArrayList2.remove(str);
            }
            FJ5.LIZ(uptimeMillis, str);
        }
    }
}
