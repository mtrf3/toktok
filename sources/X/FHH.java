package X;

import com.google.gson.g;
import com.google.gson.j;
import com.google.gson.m;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FHH implements Runnable {
    public static final FHH LJLIL = new FHH();

    public static void LIZ() {
        g gVar;
        m LIZIZ;
        java.util.Set<Map.Entry<String, j>> entrySet;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            m allConfig = FH3.LIZLLL.LIZ();
            FHB fhb = FHB.LJ;
            if (fhb.LJIIIZ().contains("enable_big_reversal_android")) {
                allConfig.LJJIII(Boolean.valueOf(fhb.LJII("enable_big_reversal_android", false)), "enable_big_reversal_android");
            }
            o.LJIIIIZZ(allConfig, "allConfig");
            if (FHI.LIZJ(allConfig, "enable_big_reversal_android")) {
                j LJJIJ = allConfig.LJJIJ("studio_container_groups");
                if (LJJIJ instanceof m) {
                    gVar = ((m) LJJIJ).LJJIJIIJI("val");
                    o.LJIIIIZZ(gVar, "res.getAsJsonArray(\"val\")");
                } else {
                    o.LJII(LJJIJ, "null cannot be cast to non-null type com.google.gson.JsonArray");
                    gVar = (g) LJJIJ;
                }
                Iterator<j> it = gVar.iterator();
                while (it.hasNext()) {
                    j next = it.next();
                    try {
                        o.LJII(next, "null cannot be cast to non-null type com.google.gson.JsonObject");
                        String LIZLLL = U4A.LIZLLL((m) next, "switch");
                        String LIZLLL2 = U4A.LIZLLL((m) next, "config");
                        if (FHI.LIZJ(allConfig, LIZLLL) && (LIZIZ = FHI.LIZIZ(allConfig, LIZLLL2)) != null && (entrySet = LIZIZ.entrySet()) != null) {
                            for (Map.Entry<String, j> entry : entrySet) {
                                o.LJIIIIZZ(entry, "(key, jsonObject)");
                                String key = entry.getKey();
                                j value = entry.getValue();
                                if (value != null) {
                                    o.LJIIIIZZ(key, "key");
                                    linkedHashMap.put(key, value);
                                }
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
        } catch (Throwable unused2) {
        }
        FHI.LJLJI = linkedHashMap;
        if (C38681FGb.LIZIZ.size() == 0) {
            return;
        }
        C38681FGb.LIZJ = true;
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
