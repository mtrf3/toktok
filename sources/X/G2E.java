package X;

import android.os.SystemClock;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class G2E {
    public static final java.util.Map<EnumC40761FzB, G2I> LIZ = new LinkedHashMap();
    public static long LIZIZ;
    public static long LIZJ;

    public static G2I LIZ(EnumC40761FzB componentType) {
        o.LJIIIZ(componentType, "componentType");
        java.util.Map<EnumC40761FzB, G2I> map = LIZ;
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        if (linkedHashMap.get(componentType) == null) {
            map.put(componentType, new G2I(0));
        }
        return (G2I) linkedHashMap.get(componentType);
    }

    public static void LIZIZ(G2J g2j) {
        if (g2j == null || g2j.LJLJI > 0) {
            return;
        }
        g2j.LJLJI = SystemClock.elapsedRealtime();
    }

    public static void LIZJ(G2J g2j) {
        if (g2j == null || g2j.LJLILLLLZI > 0) {
            return;
        }
        g2j.LJLILLLLZI = SystemClock.elapsedRealtime();
    }

    public static void LIZLLL(EnumC40761FzB componentType) {
        LinkedHashMap linkedHashMap;
        o.LJIIIZ(componentType, "componentType");
        G2I LIZ2 = LIZ(componentType);
        if (LIZ2 != null) {
            if (LIZ2.LJLJLLL) {
                return;
            }
            linkedHashMap = new LinkedHashMap();
            G2J g2j = LIZ2.LJLIL;
            linkedHashMap.put(g2j.LJLIL, String.valueOf(g2j.LJLJI - g2j.LJLILLLLZI));
            G2J g2j2 = LIZ2.LJLILLLLZI;
            linkedHashMap.put(g2j2.LJLIL, String.valueOf(g2j2.LJLJI - g2j2.LJLILLLLZI));
            G2J g2j3 = LIZ2.LJLJI;
            linkedHashMap.put(g2j3.LJLIL, String.valueOf(g2j3.LJLJI - g2j3.LJLILLLLZI));
            G2J g2j4 = LIZ2.LJLJJI;
            linkedHashMap.put(g2j4.LJLIL, String.valueOf(g2j4.LJLJI - g2j4.LJLILLLLZI));
            G2J g2j5 = LIZ2.LJLJJL;
            linkedHashMap.put(g2j5.LJLIL, String.valueOf(g2j5.LJLJI - g2j5.LJLILLLLZI));
            G2J g2j6 = LIZ2.LJLJJLL;
            linkedHashMap.put(g2j6.LJLIL, String.valueOf(g2j6.LJLJI - g2j6.LJLILLLLZI));
            G2J g2j7 = LIZ2.LJLJL;
            linkedHashMap.put(g2j7.LJLIL, String.valueOf(g2j7.LJLJI - g2j7.LJLILLLLZI));
            G2J g2j8 = LIZ2.LJLJLJ;
            linkedHashMap.put(g2j8.LJLIL, String.valueOf(g2j8.LJLJI - g2j8.LJLILLLLZI));
            linkedHashMap.put("component_type", componentType.getDesc());
            C36222EJm.LIZIZ(G2H.NUJ_STEP_FLUENCY, linkedHashMap);
        } else {
            linkedHashMap = null;
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("FLUENCYTRACKER_");
        LIZ3.append(componentType);
        X1D.LIZIZ(LIZ3);
        String.valueOf(linkedHashMap);
        if (LIZ2 == null) {
            return;
        }
        LIZ2.LJLJLLL = true;
    }
}
