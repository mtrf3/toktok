package X;

import Y.ARunnableS42S0100000_6;
import android.os.Handler;
import com.bytedance.morpheus.PluginEntity;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.Eh9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37095Eh9 {
    public static final Handler LIZ = new Handler(C16880lQ.LLJJJJ());
    public static final List<InterfaceC37096EhA> LIZIZ = new CopyOnWriteArrayList();
    public static final java.util.Map<String, C37100EhE> LIZJ;

    static {
        HashMap hashMap = new HashMap();
        java.util.Set<String> LIZIZ2 = EPA.LIZIZ();
        for (PluginEntity pluginEntity : (List) C36969Ef7.LIZ.getValue()) {
            String packageName = pluginEntity.getPackageName();
            if (LIZIZ2.contains(pluginEntity.getAabName())) {
                hashMap.put(packageName, new C37100EhE(packageName, EPA.LIZJ(), 5));
            } else {
                hashMap.put(packageName, new C37100EhE(packageName, EPA.LIZJ(), 0));
            }
        }
        LIZJ = hashMap;
    }

    public static void LIZ(C37100EhE c37100EhE) {
        String str = c37100EhE.LIZ;
        if (str == null) {
            return;
        }
        if (str.startsWith("com.ss.android.ugc.aweme.dflanguage")) {
            LIZ.post(new ARunnableS42S0100000_6(c37100EhE, 125));
            return;
        }
        java.util.Map<String, C37100EhE> map = LIZJ;
        synchronized (map) {
            C37100EhE c37100EhE2 = (C37100EhE) ((HashMap) map).get(c37100EhE.LIZ);
            if (c37100EhE2 != null) {
                c37100EhE2.LIZJ = c37100EhE.LIZJ;
                c37100EhE2.LIZIZ = c37100EhE.LIZIZ;
                c37100EhE2.LJI = c37100EhE.LJI;
                c37100EhE2.LJIIIIZZ = c37100EhE.LJIIIIZZ;
                c37100EhE2.LJII = c37100EhE.LJII;
                c37100EhE2.LJ = c37100EhE.LJ;
                c37100EhE2.LIZLLL = c37100EhE.LIZLLL;
                LIZ.post(new ARunnableS42S0100000_6(c37100EhE2, 125));
            }
        }
    }
}
