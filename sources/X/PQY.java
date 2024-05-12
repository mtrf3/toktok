package X;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class PQY implements InterfaceC28215B5n {
    @Override // X.InterfaceC28215B5n
    public final java.util.Map<String, String> LIZ(PQZ pqz) {
        AbstractC64456PRk LIZ = C64453PRh.LIZ(pqz.LJLIL);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        for (C64421PQb c64421PQb : pqz.LJLJI) {
            int i5 = c64421PQb.LJLIL;
            int i6 = c64421PQb.LJLILLLLZI;
            if (i6 > 0 && i5 > 0) {
                if (i5 < 3) {
                    i += i6;
                } else if (i5 < 7) {
                    i2 += i6;
                } else if (i5 < 14) {
                    i3 += i6;
                } else {
                    i4 += i6;
                }
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (C53240Kuy.LIZIZ(pqz.LJLIL)) {
            String jSONArray = LIZ.LIZLLL(0 + i2 + i3 + i4).toString();
            o.LJIIIIZZ(jSONArray, "probeMonitor.getReportJs…ay(dropXCount).toString()");
            linkedHashMap.put("dropXDetail", jSONArray);
        }
        linkedHashMap.put("level_1", String.valueOf(i));
        linkedHashMap.put("level_2", String.valueOf(i2));
        linkedHashMap.put("level_3", String.valueOf(i3));
        linkedHashMap.put("level_4", String.valueOf(i4));
        return linkedHashMap;
    }
}
