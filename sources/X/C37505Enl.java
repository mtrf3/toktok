package X;

import com.bytedance.pia.core.setting.Config;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.FutureTask;

/* renamed from: X.Enl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37505Enl {
    public static final ConcurrentHashMap<String, FutureTask<C37499Enf>> LIZ = new ConcurrentHashMap<>();

    public static C37499Enf LIZ(String str, String str2, Object obj, Config config, boolean z) {
        C37504Enk c37504Enk = new C37504Enk();
        c37504Enk.LIZIZ = str;
        c37504Enk.LIZ = str2;
        c37504Enk.LIZJ = obj;
        c37504Enk.LJ = config;
        String LIZIZ = c37504Enk.LIZIZ();
        if (LIZIZ == null || LIZIZ.isEmpty()) {
            return null;
        }
        if (!z) {
            return c37504Enk.LIZ();
        }
        FutureTask<C37499Enf> remove = LIZ.remove(LIZIZ);
        if (remove != null) {
            try {
                C37499Enf c37499Enf = remove.get();
                if (c37499Enf != null) {
                    C37238EjS.LJI(6, "[Runtime] consume warmup success.", null);
                    return c37499Enf;
                }
            } catch (Throwable unused) {
            }
        }
        return c37504Enk.LIZ();
    }
}
