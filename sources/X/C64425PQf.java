package X;

import android.text.TextUtils;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.PQf, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64425PQf implements InterfaceC28215B5n {
    @Override // X.InterfaceC28215B5n
    public final java.util.Map<String, String> LIZ(PQZ pqz) {
        java.util.Map<String, Long> map;
        if (!FN1.LIZ) {
            return new LinkedHashMap();
        }
        InterfaceC64427PQh LIZ = C38861FMz.LIZ(pqz.LJLIL);
        if (LIZ != null) {
            map = LIZ.LIZIZ();
        } else {
            map = null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (map != null && (!map.isEmpty())) {
            for (Map.Entry<String, Long> entry : map.entrySet()) {
                if (!TextUtils.isEmpty(entry.getKey())) {
                    String key = entry.getKey();
                    o.LJIIIIZZ(key, "it.key");
                    linkedHashMap.put(key, String.valueOf(entry.getValue()));
                }
            }
        }
        return linkedHashMap;
    }
}
