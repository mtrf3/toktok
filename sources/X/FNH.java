package X;

import android.os.Process;
import android.os.SystemClock;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.jato.JatoXL;
import com.bytedance.common.jato.boost.CpusetManager;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FNH {
    public static final FNH LIZ = new FNH();

    public final void LIZ(long j, String[] masks) {
        o.LJIIIZ(masks, "masks");
        LIZLLL(this, masks, j, 4);
    }

    public final void LIZIZ(String... masks) {
        o.LJIIIZ(masks, "masks");
        LIZLLL(this, masks, 0L, 6);
    }

    public static void LIZJ(String[] masks, long j, RecyclerView recyclerView) {
        o.LJIIIZ(masks, "masks");
        long uptimeMillis = SystemClock.uptimeMillis();
        for (String str : masks) {
            switch (str.hashCode()) {
                case -2107392695:
                    if (str.equals("reset_thread_priority")) {
                        JatoXL.resetPriority(Process.myTid());
                        JatoXL.resetRenderThread();
                        break;
                    } else {
                        break;
                    }
                case -1641276893:
                    if (str.equals("start_boot_finish")) {
                        C35810E3q.LIZLLL(j);
                        break;
                    } else {
                        break;
                    }
                case -1534296074:
                    if (str.equals("start_do_frame")) {
                        C232469Ak.LIZ.LJ("Comment", new C94I(30L));
                        break;
                    } else {
                        break;
                    }
                case -873534013:
                    if (str.equals("stop_boot_finish")) {
                        C36093EEn.LIZ.getClass();
                        C36093EEn.LIZJ();
                        break;
                    } else {
                        break;
                    }
                case -181369264:
                    if (str.equals("reset_bind_big_core")) {
                        CpusetManager.resetCoreBind();
                        Iterator it = ((LinkedHashMap) C72952tf.LIZ).entrySet().iterator();
                        while (it.hasNext()) {
                            CpusetManager.resetCoreBind(((Number) ((Map.Entry) it.next()).getValue()).intValue());
                        }
                        break;
                    } else {
                        break;
                    }
                case 237866304:
                    if (str.equals("bind_big_core")) {
                        CpusetManager.bindBigCore();
                        Iterator it2 = ((LinkedHashMap) C72952tf.LIZ).entrySet().iterator();
                        while (it2.hasNext()) {
                            CpusetManager.bindLittleCore(((Number) ((Map.Entry) it2.next()).getValue()).intValue());
                        }
                        break;
                    } else {
                        break;
                    }
                case 696939573:
                    if (str.equals("start_log_block")) {
                        C35810E3q.LJFF(j);
                        break;
                    } else {
                        break;
                    }
                case 858632149:
                    if (str.equals("stop_log_block")) {
                        C35810E3q.LJIILJJIL();
                        break;
                    } else {
                        break;
                    }
                case 1097567046:
                    if (str.equals("start_jit_block")) {
                        C35810E3q.LJIIJJI(j);
                        break;
                    } else {
                        break;
                    }
                case 1259259622:
                    if (str.equals("stop_jit_block")) {
                        C35810E3q.LJIILIIL();
                        break;
                    } else {
                        break;
                    }
                case 1277320647:
                    if (str.equals("rv_cache") && recyclerView != null) {
                        recyclerView.setItemViewCacheSize(5);
                        RecyclerView.RecycledViewPool recycledViewPool = recyclerView.getRecycledViewPool();
                        if (recycledViewPool != null) {
                            recycledViewPool.setMaxRecycledViews(1, 10);
                        }
                        RecyclerView.RecycledViewPool recycledViewPool2 = recyclerView.getRecycledViewPool();
                        if (recycledViewPool2 != null) {
                            recycledViewPool2.setMaxRecycledViews(2, 4);
                        }
                        RecyclerView.RecycledViewPool recycledViewPool3 = recyclerView.getRecycledViewPool();
                        if (recycledViewPool3 != null) {
                            recycledViewPool3.setMaxRecycledViews(11, 8);
                            break;
                        } else {
                            break;
                        }
                    }
                    break;
                case 1346029625:
                    if (str.equals("thread_priority")) {
                        EVM.LIZ(Process.myTid(), -20);
                        JatoXL.boostRenderThread(FKM.LIZ(), -20);
                        break;
                    } else {
                        break;
                    }
            }
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("boost: ");
        LIZ2.append(ORY.LJLIIIL(masks));
        LIZ2.append(", use time ");
        LIZ2.append(SystemClock.uptimeMillis() - uptimeMillis);
        C71Y.LIZLLL("CommentBoostHelper", X1D.LIZIZ(LIZ2));
    }

    public static /* synthetic */ void LIZLLL(FNH fnh, String[] strArr, long j, int i) {
        if ((i & 2) != 0) {
            j = 2000;
        }
        fnh.getClass();
        LIZJ(strArr, j, null);
    }
}
