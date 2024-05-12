package X;

import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes12.dex */
public final class PQX implements InterfaceC28215B5n {
    @Override // X.InterfaceC28215B5n
    public final java.util.Map<String, String> LIZ(PQZ pqz) {
        String valueOf;
        List<C64421PQb> list = pqz.LJLJI;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (C64421PQb c64421PQb : list) {
            int i6 = c64421PQb.LJLIL;
            int i7 = c64421PQb.LJLILLLLZI;
            if (i7 > 0) {
                if (i5 < i6) {
                    i5 = i6;
                }
                if (i6 >= 3) {
                    i += (int) (i7 * i6 * 16.6d);
                    if (i6 < 7) {
                        i2 += i7;
                    } else if (i6 < 14) {
                        i3 += i7;
                    } else {
                        i4 += i7;
                    }
                }
            }
        }
        linkedHashMap.put("block_duration", String.valueOf(i));
        linkedHashMap.put("drop_x_count", String.valueOf(i4 + i3 + i2 + 0));
        linkedHashMap.put("ui_scene", pqz.LJLIL);
        if (pqz.LJLILLLLZI > 60.0d) {
            valueOf = "60";
        } else {
            valueOf = String.valueOf(((int) (r2 * 100)) / 100.0d);
        }
        linkedHashMap.put("ui_fps", valueOf);
        linkedHashMap.put("duration", String.valueOf(pqz.LJLJJLL));
        return linkedHashMap;
    }
}
