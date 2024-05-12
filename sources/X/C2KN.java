package X;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS148S0200000_1;

/* renamed from: X.2KN, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2KN {
    public static final ConcurrentHashMap<String, C2KO> LIZ = new ConcurrentHashMap<>();
    public static final Object LIZIZ = new Object();

    public static final void LIZ() {
        C2KO LIZIZ2 = LIZIZ("task_type_feed_on_idle");
        synchronized (LIZIZ2) {
            if (!LIZIZ2.LIZ.isEmpty() || !LIZIZ2.LIZIZ.isEmpty()) {
                Iterator<C56162Ii> it = LIZIZ2.LIZ.iterator();
                while (it.hasNext()) {
                    Runnable runnable = it.next().LIZJ;
                    if (runnable != null) {
                        runnable.run();
                    }
                }
                LIZIZ2.LIZ.clear();
                Iterator<C2KQ> it2 = LIZIZ2.LIZIZ.iterator();
                while (it2.hasNext()) {
                    C2KQ next = it2.next();
                    C2NH.LIZ.removeCallbacks(next);
                    Runnable runnable2 = next.LJLIL;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                }
                LIZIZ2.LIZIZ.clear();
            }
        }
    }

    public static C2KO LIZIZ(String str) {
        ConcurrentHashMap<String, C2KO> concurrentHashMap = LIZ;
        C2KO c2ko = concurrentHashMap.get(str);
        if (c2ko == null) {
            synchronized (LIZIZ) {
                c2ko = new C2KO();
                concurrentHashMap.put(str, c2ko);
            }
        }
        return c2ko;
    }

    public static final void LIZJ(C56162Ii c56162Ii) {
        String str;
        if (TextUtils.isEmpty(c56162Ii.LIZ) || c56162Ii.LIZJ == null || (str = c56162Ii.LIZ) == null) {
            return;
        }
        C2KO LIZIZ2 = LIZIZ(str);
        synchronized (LIZIZ2) {
            C2KQ c2kq = new C2KQ(c56162Ii.LIZJ);
            c2kq.LJLILLLLZI = new AqS148S0200000_1(LIZIZ2, c2kq, 52);
            c56162Ii.LIZJ = c2kq;
            if (!LIZIZ2.LIZJ) {
                LIZIZ2.LIZ(c56162Ii);
            } else {
                LIZIZ2.LIZ.add(c56162Ii);
            }
        }
    }
}
