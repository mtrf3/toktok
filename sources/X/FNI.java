package X;

import android.os.Process;
import android.os.SystemClock;
import com.bytedance.common.jato.JatoXL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class FNI {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(List list) {
        SystemClock.uptimeMillis();
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            switch (str.hashCode()) {
                case -1641276893:
                    if (!str.equals("start_boot_finish")) {
                        break;
                    } else {
                        C35810E3q.LIZLLL(1000L);
                        break;
                    }
                case -1534296074:
                    if (!str.equals("start_do_frame")) {
                        break;
                    } else {
                        C232469Ak.LIZ.LJ("Inbox", new C94I(30L));
                        break;
                    }
                case 696939573:
                    if (!str.equals("start_log_block")) {
                        break;
                    } else {
                        C35810E3q.LJFF(3000L);
                        break;
                    }
                case 1097567046:
                    if (!str.equals("start_jit_block")) {
                        break;
                    } else {
                        C35810E3q.LJIIJJI(1000L);
                        break;
                    }
                case 1346029625:
                    if (!str.equals("thread_priority")) {
                        break;
                    } else {
                        EVM.LIZ(Process.myTid(), -20);
                        JatoXL.boostRenderThread(FKM.LIZ(), -20);
                        break;
                    }
                case 1630165671:
                    if (!str.equals("start_gc_block")) {
                        break;
                    } else {
                        C35810E3q.LJ(3000L);
                        break;
                    }
            }
        }
    }

    public static void LIZIZ(List list) {
        SystemClock.uptimeMillis();
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            switch (str.hashCode()) {
                case -2107392695:
                    if (!str.equals("reset_thread_priority")) {
                        break;
                    } else {
                        JatoXL.resetPriority(Process.myTid());
                        JatoXL.resetRenderThread();
                        break;
                    }
                case -873534013:
                    if (!str.equals("stop_boot_finish")) {
                        break;
                    } else {
                        C36093EEn.LIZ.getClass();
                        C36093EEn.LIZJ();
                        break;
                    }
                case -27186425:
                    if (!str.equals("stop_gc_block")) {
                        break;
                    } else {
                        C35810E3q.LJIIL();
                        break;
                    }
                case 858632149:
                    if (!str.equals("stop_log_block")) {
                        break;
                    } else {
                        C35810E3q.LJIILJJIL();
                        break;
                    }
                case 1259259622:
                    if (!str.equals("stop_jit_block")) {
                        break;
                    } else {
                        C35810E3q.LJIILIIL();
                        break;
                    }
            }
        }
    }
}
