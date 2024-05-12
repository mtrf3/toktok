package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Ej8, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC37218Ej8 implements Runnable {
    public static final RunnableC37218Ej8 LJLIL = new RunnableC37218Ej8();

    public static void LIZ() {
        int i;
        long currentTimeMillis = System.currentTimeMillis() - C37219Ej9.LIZIZ();
        if (C37219Ej9.LJ > currentTimeMillis && (i = C37219Ej9.LJFF) < 3) {
            C37219Ej9.LJFF = i + 1;
            C37219Ej9.LIZLLL();
            return;
        }
        C37219Ej9.LJFF = 0;
        Iterator it = ((LinkedHashMap) C37219Ej9.LIZLLL).entrySet().iterator();
        while (it.hasNext()) {
            if (((Number) ((Map.Entry) it.next()).getValue()).longValue() < currentTimeMillis) {
                it.remove();
            }
        }
        if (!(!C37219Ej9.LIZLLL.isEmpty())) {
            return;
        }
        C37219Ej9.LIZLLL();
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
