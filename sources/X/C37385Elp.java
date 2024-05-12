package X;

import com.google.gson.j;
import com.google.gson.m;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.Elp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37385Elp extends C37471EnD {
    public final java.util.Map<String, Long> LIZLLL = new LinkedHashMap();

    @Override // X.C37471EnD
    public final void LIZ() {
        java.util.Set<Map.Entry<String, j>> entrySet = this.LIZ.entrySet();
        o.LJFF(entrySet, "result.entrySet()");
        for (Map.Entry<String, j> entry : entrySet) {
            String key = entry.getKey();
            o.LJFF(key, "it.key");
            j value = entry.getValue();
            if (value != null && (value instanceof m)) {
                try {
                    m LJIIZILJ = value.LJIIZILJ();
                    j LJJIJ = LJIIZILJ.LJJIJ("s");
                    o.LJFF(LJJIJ, "json.get(\"s\")");
                    long LJIJJLI = LJJIJ.LJIJ().LJIJJLI();
                    j LJJIJ2 = LJIIZILJ.LJJIJ("e");
                    o.LJFF(LJJIJ2, "json.get(\"e\")");
                    C3C5.m7constructorimpl(this.LIZLLL.put(key, Long.valueOf(LJJIJ2.LJIJ().LJIJJLI() - LJIJJLI)));
                } catch (Throwable th) {
                    C3C5.m7constructorimpl(C141335gf.LIZ(th));
                }
            }
        }
    }
}
